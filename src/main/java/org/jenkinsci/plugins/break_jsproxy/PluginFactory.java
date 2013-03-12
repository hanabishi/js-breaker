package org.jenkinsci.plugins.break_jsproxy;

import hudson.model.Action;
import hudson.model.TransientViewActionFactory;
import hudson.model.View;

import java.util.LinkedList;
import java.util.List;

public class PluginFactory extends TransientViewActionFactory {

    @Override
    public List<Action> createFor(View v) {
        List<Action> result = new LinkedList<Action>();
        result.add(new JSBreaker());
        return result;
    }

}
