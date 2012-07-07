package com.thoughtworks;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import org.springframework.webflow.core.FlowException;
import org.springframework.webflow.execution.FlowExecutionOutcome;
import org.springframework.webflow.mvc.servlet.AbstractFlowHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/7/12
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class GeneratingHandler extends AbstractFlowHandler {

    private  static  final String REDIRECT_URL = "contextRelative:/poem/index";


    @Override
    public String handleExecutionOutcome(FlowExecutionOutcome outcome, HttpServletRequest request, HttpServletResponse response) {
        return  REDIRECT_URL;
    }

    @Override
    public String handleException(FlowException e, HttpServletRequest request, HttpServletResponse response) {
        return REDIRECT_URL;
    }
}
