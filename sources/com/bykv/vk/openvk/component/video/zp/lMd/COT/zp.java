package com.bykv.vk.openvk.component.video.zp.lMd.COT;

import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zp {
    COT lMd;
    List<YW.lMd> zp;

    public abstract String COT();

    public abstract String HWF();

    public abstract List<YW.lMd> KS();

    public COT QR() {
        return this.lMd;
    }

    public abstract InputStream jU();

    public abstract boolean lMd();

    public abstract int zp();

    public YW.lMd zp(String str) {
        List<YW.lMd> list;
        if (str != null && (list = this.zp) != null && list.size() > 0) {
            for (YW.lMd lmd : this.zp) {
                if (str.equals(lmd.zp)) {
                    return lmd;
                }
            }
        }
        return null;
    }

    public abstract String zp(String str, String str2);

    public String zp(int i9) {
        switch (i9) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i9) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i9) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /* 407 */:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /* 408 */:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /* 411 */:
                                return "Length Required";
                            case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (i9) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }
}
