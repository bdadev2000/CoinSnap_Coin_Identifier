package com.bykv.vk.openvk.preload.geckox.model;

import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public class WebResourceResponseModel {
    public static final int ERROR_DEFAULT = -1;
    public static final int ERROR_INTERCEPT = 1;
    public static final int ERROR_NOT_FIND_BY_RESOURCE = 2;
    int errorType;
    WebResourceResponse webResourceResponse;

    public WebResourceResponseModel(int i9, WebResourceResponse webResourceResponse) {
        this.errorType = i9;
        this.webResourceResponse = webResourceResponse;
    }

    public int getMsg() {
        return this.errorType;
    }

    public WebResourceResponse getWebResourceResponse() {
        return this.webResourceResponse;
    }

    public void setMsg(int i9) {
        this.errorType = i9;
    }

    public void setWebResourceResponse(WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }
}
