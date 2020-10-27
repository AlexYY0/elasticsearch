package club.emeprorws.es.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @Author: EmperorWS
 * @Date: 2020/10/28 1:30
 * @Description:
 **/
@Builder
@Getter
@Setter
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
@Document(indexName = "tmall_springboot",type = "product")
public class Product implements Serializable {
}
