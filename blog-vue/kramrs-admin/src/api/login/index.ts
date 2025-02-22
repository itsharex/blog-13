import {Result} from "@/model";
import request from "@/utils/request";
import {AxiosPromise} from "axios";
import {CaptchaInfo, LoginForm} from "./types";

/**
 * 获取验证码
 */
export function getCaptcha(): AxiosPromise<Result<CaptchaInfo>> {
    return request({
        url: "/captcha",
        method: "get",
        params: {
            type: "KramrsAdmin"
        }
    });
}

/**
 * 用户登录
 * @param data 登录信息
 * @returns Token
 */
export function login(data: LoginForm): AxiosPromise<Result<string>> {
    return request({
        url: "/login",
        method: "post",
        data,
    });
}

/**
 * 用户退出
 */
export function logout(): AxiosPromise<Result<null>> {
    return request({
        url: "/logout",
        method: "get",
    });
}
