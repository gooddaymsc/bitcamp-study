package com.eomcs.server;

import com.google.gson.Gson;

public class Request {

  String command;
  String jsonData;

  public Request(String command, String jsonData) {
    this.command = command;
    this.jsonData = jsonData;
  }

  public String getCommand() {
    return command;
  }

  public <T> T getValue(Class<T> type) {
    if (jsonData == null || jsonData.length() == 0) {
      return null;
    }
    return new Gson().fromJson(jsonData, type);
  }
}
