package tech.msop.core.tool.constant;

/**
 * HTTP 响应代码
 *
 * @author ruozhuliufeng
 */
public interface HttpResponseCode {
    /**
     * 成功响应
     */
    Integer SC_CONTINUE = 100;
    Integer SC_SWITCHING_PROTOCOLS = 101;
    Integer SC_OK = 200;
    Integer SC_CREATED = 201;
    Integer SC_ACCEPTED = 202;
    Integer SC_NON_AUTHORITATIVE_INFORMATION = 203;
    Integer SC_NO_CONTENT = 204;
    Integer SC_RESET_CONTENT = 205;
    Integer SC_PARTIAL_CONTENT = 206;
    Integer SC_MULTIPLE_CHOICES = 300;
    Integer SC_MOVED_PERMANENTLY = 301;
    Integer SC_MOVED_TEMPORARILY = 302;
    Integer SC_FOUND = 302;
    Integer SC_SEE_OTHER = 303;
    Integer SC_NOT_MODIFIED = 304;
    Integer SC_USE_PROXY = 305;
    Integer SC_TEMPORARY_REDIRECT = 307;
    Integer SC_BAD_REQUEST = 400;
    Integer SC_UNAUTHORIZED = 401;
    Integer SC_PAYMENT_REQUIRED = 402;
    Integer SC_FORBIDDEN = 403;
    Integer SC_NOT_FOUND = 404;
    Integer SC_METHOD_NOT_ALLOWED = 405;
    Integer SC_NOT_ACCEPTABLE = 406;
    Integer SC_PROXY_AUTHENTICATION_REQUIRED = 407;
    Integer SC_REQUEST_TIMEOUT = 408;
    Integer SC_CONFLICT = 409;
    Integer SC_GONE = 410;
    Integer SC_LENGTH_REQUIRED = 411;
    Integer SC_PRECONDITION_FAILED = 412;
    Integer SC_REQUEST_ENTITY_TOO_LARGE = 413;
    Integer SC_REQUEST_URI_TOO_LONG = 414;
    Integer SC_UNSUPPORTED_MEDIA_TYPE = 415;
    Integer SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    Integer SC_EXPECTATION_FAILED = 417;
    Integer SC_INTERNAL_SERVER_ERROR = 500;
    Integer SC_NOT_IMPLEMENTED = 501;
    Integer SC_BAD_GATEWAY = 502;
    Integer SC_SERVICE_UNAVAILABLE = 503;
    Integer SC_GATEWAY_TIMEOUT = 504;
    Integer SC_HTTP_VERSION_NOT_SUPPORTED = 505;
}
