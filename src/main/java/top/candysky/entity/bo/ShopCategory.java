package top.candysky.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class ShopCategory {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
