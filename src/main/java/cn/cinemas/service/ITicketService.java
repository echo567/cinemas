package cn.cinemas.service;

import cn.cinemas.bean.Ticket;
import cn.cinemas.util.Message;

/**
 * 军辉
 * 2019-01-02 17:21
 */
public interface ITicketService {
    public Message InsertTicket(Ticket ticket);

    public Message deleteTicket(Integer ticketId);
}
