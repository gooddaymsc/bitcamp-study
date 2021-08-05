package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

public class ProjectList2 extends ArrayList {
  public Project findByNo(int no) {

    Object[] arr = toArray();
    for (Object list : arr) {
      Project project = (Project) list;
      if (project.no == no) {
        return project;
      }
    }
    return null;
  }


}
