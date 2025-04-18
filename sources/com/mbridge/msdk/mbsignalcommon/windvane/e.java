package com.mbridge.msdk.mbsignalcommon.windvane;

/* loaded from: classes4.dex */
public enum e {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* renamed from: j, reason: collision with root package name */
    private String f14161j;

    /* renamed from: k, reason: collision with root package name */
    private String f14162k;

    e(String str, String str2) {
        this.f14161j = str;
        this.f14162k = str2;
    }

    public final String a() {
        return this.f14161j;
    }

    public final String b() {
        return this.f14162k;
    }
}
