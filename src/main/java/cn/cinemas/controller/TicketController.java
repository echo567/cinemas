package cn.cinemas.controller;

import cn.cinemas.bean.Ticket;
import cn.cinemas.service.ITicketService;
import cn.cinemas.util.Message;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 军辉
 * 2019-01-03 8:41
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private ITicketService ticketService;


    @PostMapping("/buyticket")
    public Message buyTicket(Ticket ticket) {

        return ticketService.InsertTicket(ticket);
    }

    @GetMapping("/deleteticket")
    public Message deleteTicket(Integer ticketId) {
        return ticketService.deleteTicket(ticketId);
    }

    @GetMapping("/getall")
    public Message getAllTicket() {
        return ticketService.selectAllTicket();
    }
}
