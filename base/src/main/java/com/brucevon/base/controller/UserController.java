package com.brucevon.base.controller;

import com.brucevon.base.annotation.UserLoginToken;
import com.brucevon.base.model.vo.ResultVo;
import com.brucevon.base.model.vo.UserVo;
import com.brucevon.base.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.brucevon.base.constant.ControllerConstantEnum.SUCCESS;

/**
 * UserController.
 *
 * @author BruceVon
 */
@Api(tags = "用户模块")
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    /**
     * Inject UserService.
     */
    @Autowired
    private UserService userService;

    /**
     * Get user by id.
     *
     * @param id user id
     * @return ResultVo
     */
    @UserLoginToken
    @GetMapping("/{id}")
    public ResultVo<?> getUser(final @PathVariable String id) {
        log.info("Request start: /user/{}", id);
        UserVo userVo = userService.getUser(id);
        ResultVo<?> resultVo = new ResultVo<>()
                .setCode(SUCCESS.getCode())
                .setData(userVo)
                .setMsg(SUCCESS.getMsg());
        log.info("Request end: [{}]", resultVo);
        return resultVo;
    }
}
