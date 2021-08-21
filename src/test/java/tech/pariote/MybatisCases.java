package tech.pariote;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.pariote.bean.HerfInfo;
import tech.pariote.dao.HerfInfoMapper;

import java.io.IOException;
import java.util.List;

public class MybatisCases {

    /*
    * 1. 创建spring容器
           根据xml文件应用程序Context容器(上下文)
           classpath指配置文件的位置, 起点有java, resources. 写路径时相对这个起点去写
    * */
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    @Test
    public void test1(){

        /* 得到 SqlSession 对象*/
        SqlSession sqlSession = (SqlSession) context.getBean("sqlSession");

        // 调用 Mapper映射文件里的方法
        List<HerfInfo> list = sqlSession.selectList("tech.pariote.dao.HerfInfoMapper.getHerfInfo", 1);

        for (HerfInfo herfInfo : list) {
            System.out.println(herfInfo);
        }
    }

    @Test
    public  void test2() throws IOException {
        /**
         * 方式2： 测试mapperd代理方式开发
         */
        HerfInfoMapper mapper =  context.getBean(HerfInfoMapper.class);
        List<HerfInfo> list  = mapper.getHerfInfo(1);
        for (HerfInfo herfInfo : list) {
            System.out.println(herfInfo);
        }
    }



}
