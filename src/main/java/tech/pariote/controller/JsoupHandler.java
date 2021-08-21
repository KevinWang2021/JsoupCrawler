package tech.pariote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.pariote.bean.HerfInfoRequest;
import tech.pariote.bean.HerfInfo;
import tech.pariote.dao.HerfInfoMapper;
import tech.pariote.kernel.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/jsoup")
public class JsoupHandler {

    /**
     * restful api /jsoup/getherf的handler
     *
     * @param req  servlet请求参数
     * @param resp servlet返回参数
     */
    @ResponseBody
    @RequestMapping(value = "/getherf", method = {RequestMethod.GET,RequestMethod.POST})
    public List<HerfInfo>  getAHerf(@RequestBody(required = false) HerfInfoRequest reqbody, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("get into getherf");
        List<HerfInfo> list = new ArrayList<>();
        if (reqbody != null)
        {
            HerfInfoMapper mapper= ContextHolder.getBean(HerfInfoMapper.class);
            list=mapper.getHerfInfo(1);
        }
        return list;

    }
}
