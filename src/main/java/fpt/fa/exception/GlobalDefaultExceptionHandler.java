/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 26, 2022
 * version 1.0
 */
package fpt.fa.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException(){
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "The page is not constructed");
		mv.addObject("errorDescription", "The page you are looking for is not availble now!");
		mv.addObject("title", "404 Error Page");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex){
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "Contact your Administrator!");
		mv.addObject("errorDescription", ex.toString());
		mv.addObject("title", "Error");
		return mv;
	}
}
