package cn.rejoicy.dubbodemo.demoprovider.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qxl
 * @date 2019/5/7 11:16
 */
@Data
public class Card  implements Serializable {

    private Integer id;

    private String cardNumber;

    private BigDecimal balance;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Integer version;
}
