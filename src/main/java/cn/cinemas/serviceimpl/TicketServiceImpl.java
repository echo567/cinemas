package cn.cinemas.serviceimpl;

import cn.cinemas.bean.Ticket;
import cn.cinemas.dao.ITicketDao;
import cn.cinemas.service.ITicketService;
import cn.cinemas.util.Message;
import cn.cinemas.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 军辉
 * 2019-01-02 17:21
 */
public class TicketServiceImpl implements ITicketService {
    @Autowired
    private ITicketDao ticketDao;


    @Override
    public Message InsertTicket(Ticket tickte) {
        if (ticketDao.InsertTicket(tickte) > 0) {
            return MessageUtil.Succees("购票成功");
        } else {
            return MessageUtil.Fail("购票失败");
        }
    }

    @Override
    public Message delectTicket(Integer ticketId) {
        if (ticketDao.deleteTicketByTicketId(ticketId) > 0) {
            return MessageUtil.Succees("删除成功");
        } else {
            return MessageUtil.Fail("删除失败");
        }
    }
}
