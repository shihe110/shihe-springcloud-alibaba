package com.shihe.common.core;

public enum StatusCode {

    SUCCESS("200", "success"),

    SERVER_ERROR("9999", "system error"),

    REQUEST_ERROR("400", "请求错误"),

    UNAUTHORIZED("401", "未授权"),

    NOT_ACCESSIBLE("403", "不可访问"),

    METHOD_NOT_ALLOWED("405", "方法不被允许"),

    UNSUPPORTED_MEDIA_TYPE("415", "不支持当前媒体类型"),

    TOKEN_LOSE_EFFICACY("1001", "您的登录令牌已失效"),

    USER_NOT_EXIST("1002", "用户不存在,请先注册!"),

    USER_PASSWORD_ERROR("1003", "密码错误!"),

    USER_IS_EXIST("1004", "用户已经存在!"),

    PARAM_IS_ERROR("1005", "参数缺失,请检查"),

    LIMIT_IS_OUT("1006", "条数超出限制!"),

    INTERVAL_TIME("1007", "间隔时间不足60秒!"),

    AUTH_CODE_ERROR("1008", "验证码错误!"),

    TELPHONE_IS_EXIST("1009", "手机号已经存在!"),

    DEPT_IS_NOT_EXIST("1010", "部门不存在,请检查!"),

    OBJECT_IS_USED("1011", "已经被使用,无法删除!"),

    OBJECT_IS_EXIST("1012", "数据已经存在,请检查!"),

    OBJECT_NOT_EXIST("1013", "对象不存在,请检查!"),

    DELETE_FAILED("1014", "删除失败,请检查(有可能无此记录)!"),

    FILE_DELETE_FAILED("1015", "文件删除失败!"),

    PROCESS_NOT_EXIST("1016", "流程不存在!"),

    AUDIT_IS_PASS("1017", "审核已经通过,无法删除!"),

    AUDIT_NOT_PASS("1018", "不是审核通过状态,无法发布!"),

    CAPTER_IS_NULL("1019", "该科目没有章节数据!"),

    QUESTION_BANK_NOTENOUGH("1020", "题库数值不够!"),

    QUESTION_CHOOSE_NONE("1021", "没有选择内容,请检查!");

    /**
     * 消息code
     */
    private final String code;
    /**
     * 消息
     */
    private final String message;

    StatusCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static StatusCode getByCode(String code) {

        for (StatusCode statusCode : StatusCode.values()) {
            if (statusCode.getCode().equals(code)) {
                return statusCode;
            }
        }

        return null;
    }


}
