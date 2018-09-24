package site.jackwang.exception;

/**
 * @Description
 * @Author wangjie<https://my.oschina.net/xiaowangqiongyou>
 * @Date 2017/10/12
 */
public class RequestLimitException extends Exception {
    private static final long serialVersionUID = 1364225358754654702L;

    public RequestLimitException() {
        super("HTTP请求超出设定的限制");
    }

    public RequestLimitException(String message) {
        super(message);
    }
}
