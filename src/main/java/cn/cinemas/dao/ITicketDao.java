package cn.cinemas.dao;

import cn.cinemas.batch.TicketBatch;
import cn.cinemas.bean.Ticket;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * 军辉
 * 2019-01-02 17:04
 */
@Mapper
public interface ITicketDao {
    @InsertProvider(type = TicketBatch.class, method = "dynamicInsertTicket")
    public Integer InsertTicket(Ticket tickte);

    @Delete("delete from tb_ticket where ticketId = #{ticketId}")
    public Integer deleteTicketByTicketId(Integer ticketId);
}
