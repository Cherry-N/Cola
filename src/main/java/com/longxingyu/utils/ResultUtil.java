package com.longxingyu.utils;

import com.longxingyu.controller.common.Code;
import com.longxingyu.controller.common.Result;

import java.util.List;

/**
 * {@code @Create:} 2023-02-28-21:51:08
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
public class ResultUtil {
    public static Result returntResultGet(Object object) {
        if (object instanceof Integer) {
            if ((Integer) object > 0) {
                return new Result(Code.GET_OK, null, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        } else {
            List data = (List) object;
            if (data.size() > 0) {
                return new Result(Code.GET_OK, data, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        }
    }

    public static Result returntResultPut(Object object) {
        if (object instanceof Integer) {
            if ((Integer) object > 0) {
                return new Result(Code.GET_OK, null, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        } else {
            List data = (List) object;
            if (data.size() > 0) {
                return new Result(Code.GET_OK, data, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        }
    }

    public static Result returntResultPost(Object object) {
        if (object instanceof Integer) {
            if ((Integer) object > 0) {
                return new Result(Code.GET_OK, null, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        } else {
            List data = (List) object;
            if (data.size() > 0) {
                return new Result(Code.GET_OK, data, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        }
    }

    public static Result returntResultDelete(Object object) {
        if (object instanceof Integer) {
            if ((Integer) object > 0) {
                return new Result(Code.GET_OK, null, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        } else {
            List data = (List) object;
            if (data.size() > 0) {
                return new Result(Code.GET_OK, data, "操作成功");
            } else {
                return new Result(Code.GET_ERR, null, "操作失败");
            }
        }
    }
}
