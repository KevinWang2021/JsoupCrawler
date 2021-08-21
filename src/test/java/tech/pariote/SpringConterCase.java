    package tech.pariote;

    import org.junit.Test;
    import org.springframework.context.support.ClassPathXmlApplicationContext;
    import tech.pariote.bean.HerfInfoRequest;

    public class SpringConterCase {
        static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        @Test
        public void testspring() {
            HerfInfoRequest herfRequest = (HerfInfoRequest) context.getBean("getHerfRequest");
            System.out.println(herfRequest.getSourcePageID());
        }

    }
