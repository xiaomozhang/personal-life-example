package com.xiaozhangge.mapper.vertica;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaozhangge.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaozhangge on 2019-03-15.
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from public.user")
    List<User> list();

    @Insert("COPY vertica_to_kafka_1 SOURCE KafkaSource(stream='vertica_to_kafka|0|-2', brokers='192.168.21.132:9092',  duration=interval '100 milliseconds') PARSER KafkaJSONParser() REJECTED DATA AS TABLE public.vertica_to_kafka_rejections_1 DIRECT")
    void exec();
}
