package cn.cslg.Online_examination_system.Action.Teacher.GradeManage;

import cn.cslg.Online_examination_system.ToolBean.Grade;
import cn.cslg.Online_examination_system.ToolBean.Teacher;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/5/26.
 * LastEdit: 2017-5-26
 * Contact me:
 *     Phone: 18852923073
 *     E-mail: 18852923073@163.com
 */
public class ShowGradeAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Teacher teacher = (Teacher) request.getSession().getAttribute("user");
        ArrayList<Grade> grades = teacher.queryAllGrade();
        request.setAttribute("grades", grades);
        return mapping.findForward("gradeIndex");
    }
}
