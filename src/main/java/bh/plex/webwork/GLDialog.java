package bh.plex.webwork;

import com.atlassian.jira.security.request.RequestMethod;
import com.atlassian.jira.security.request.SupportedMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

@SupportedMethods({RequestMethod.POST, RequestMethod.GET})
public class GLDialog extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(GLDialog.class);

    @Override
    public String execute() throws Exception {

        return "glview";
    }
}
