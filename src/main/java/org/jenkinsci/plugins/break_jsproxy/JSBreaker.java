package org.jenkinsci.plugins.break_jsproxy;

import org.kohsuke.stapler.bind.JavaScriptMethod;

import hudson.model.RootAction;

public class JSBreaker implements RootAction {

    public String getIconFileName() {
        return "noicon.jpg";
    }

    public String getDisplayName() {
        return "JS Breaker";
    }

    public String getUrlName() {
        return "jsbreaker";
    }

    @JavaScriptMethod
    public String doStuff() {
        return "<font color=\"red\">Hello World</font>";
    }
    @JavaScriptMethod
    public String doStuffNotHtml() {
        return "Hello World";
    }

    
}
