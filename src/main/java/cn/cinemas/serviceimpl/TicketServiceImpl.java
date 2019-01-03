package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Ticket;
import cn.cinemas.bean.User;
import cn.cinemas.dao.ITicketDao;
import cn.cinemas.dao.IUserDao;
import cn.cinemas.service.ITicketService;
import cn.cinemas.service.IUserService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;
import java.util.List;


/**
 * 军辉
 * 2019-01-02 17:21
 */
@Service
public class TicketServiceImpl implements ITicketService {
    @Autowired
    private ITicketDao ticketDao;

    @Autowired
    private IUserDao userDao;

    @Autowired
    private HttpSession session;

    @Override
    public Message InsertTicket(Ticket ticket) {
        // System.out.println("新增的票：" + ticket);
        User user = (User) session.getAttribute("user");
        if (user != null) {
            ticket.setUserId(user.getUserId());
            if (ticketDao.InsertTicket(ticket) > 0) {
                return MessageUtil.Succees("购票成功");
            } else {
                return MessageUtil.Fail("购票失败");
            }
        } else {
            return MessageUtil.Fail("请先登录，再购票");
        }

    }

    @Override
    public Message deleteTicket(Integer ticketId) {
        if (ticketDao.deleteTicketByTicketId(ticketId) > 0) {
            return MessageUtil.Succees("删除成功");
        } else {
            return MessageUtil.Fail("删除失败");
        }
    }

    @Override
    public Message selectAllTicket() {
        List<Ticket> ticketList = ticketDao.getAllTicket();

        for (int i = 0; i < ticketList.size(); i++) {
            ticketList.get(i).setLanguage(userDao.selectUserByUserId(ticketList.get(i).getUserId()).getUserName());
        }
        return MessageUtil.objectMessageSuccess(ticketList, "查询成功");
    }
}
