package com.eomcs.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.pms.table.BoardTable;
import com.eomcs.pms.table.MemberTable;
import com.google.gson.Gson;

public class RequestProcessor implements AutoCloseable {
  Socket socket;
  PrintWriter out;
  BufferedReader in;

  BoardTable boardTable = new BoardTable();
  MemberTable memberTable = new MemberTable();

  public RequestProcessor(Socket socket) throws Exception {
    this.socket = socket;
    out = new PrintWriter(socket.getOutputStream());
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  }
  @Override
  public void close() {
    try {out.close();} catch (Exception e) {}
    try {in.close();} catch (Exception e) {}
    try {socket.close();} catch (Exception e) {}
  }

  public void service() throws Exception {
    while (true) {
      String command = in.readLine();
      Request request = new Request(command, in.readLine());
      Response response = new Response();

      if (command.equalsIgnoreCase("quit")) {
        response.setStatus(Response.SUCCESS);
        response.setValue(response);
        sendResult(response);
        break;

      } else if (command.startsWith("board.")) {
        boardTable.execute(request, response);

      } else if (command.startsWith("member.")) {
        memberTable.execute(request, response);

      } else {
        response.setStatus(Response.SUCCESS);
        response.setValue(command);
      }
      sendResult(response);
    }
  }

  private void sendResult(Response response) throws Exception {
    out.println(response.status);
    if (response.getValue() != null) {
      out.println(new Gson().toJson(response.getValue()));
    } else {
      out.println();
    }
    out.flush();
  }
}
