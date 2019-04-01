package controllers

import controllers.Application.Ok
import play.api.mvc.Action

object StudentsController {

  def create = Action {
    Ok(views.html.main())
  }

  def update = Action {
    Ok(views.html.main())
  }

}
