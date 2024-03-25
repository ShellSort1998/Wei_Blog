package com.blog.weiblog.controller.common;

import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

@Controller
public class CaptchaRequest {
    @GetMapping("/common/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException, FontFormatException {
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/gif");

        SpecCaptcha specCaptcha = new SpecCaptcha(150, 30, 4);
        specCaptcha.setCharType(SpecCaptcha.TYPE_DEFAULT);
        specCaptcha.setFont(Captcha.FONT_9);

        request.getSession().setAttribute("verifyCode", specCaptcha.text().toLowerCase());
        specCaptcha.out(response.getOutputStream());
    }
}
