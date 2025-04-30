package com.mbridge.msdk.mbsignalcommon.windvane;

/* loaded from: classes3.dex */
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
    private String f16691j;

    /* renamed from: k, reason: collision with root package name */
    private String f16692k;

    e(String str, String str2) {
        this.f16691j = str;
        this.f16692k = str2;
    }

    public final String a() {
        return this.f16691j;
    }

    public final String b() {
        return this.f16692k;
    }
}
