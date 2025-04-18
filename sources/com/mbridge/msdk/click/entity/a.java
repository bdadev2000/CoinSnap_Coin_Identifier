package com.mbridge.msdk.click.entity;

import vd.e;

/* loaded from: classes4.dex */
public final class a {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f12518b;

    /* renamed from: c, reason: collision with root package name */
    public String f12519c;

    /* renamed from: d, reason: collision with root package name */
    public String f12520d;

    /* renamed from: e, reason: collision with root package name */
    public int f12521e;

    /* renamed from: f, reason: collision with root package name */
    public int f12522f;

    /* renamed from: g, reason: collision with root package name */
    public String f12523g;

    /* renamed from: h, reason: collision with root package name */
    public String f12524h;

    public final String a() {
        return "statusCode=" + this.f12522f + ", location=" + this.a + ", contentType=" + this.f12518b + ", contentLength=" + this.f12521e + ", contentEncoding=" + this.f12519c + ", referer=" + this.f12520d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickResponseHeader{location='");
        sb2.append(this.a);
        sb2.append("', contentType='");
        sb2.append(this.f12518b);
        sb2.append("', contentEncoding='");
        sb2.append(this.f12519c);
        sb2.append("', referer='");
        sb2.append(this.f12520d);
        sb2.append("', contentLength=");
        sb2.append(this.f12521e);
        sb2.append(", statusCode=");
        sb2.append(this.f12522f);
        sb2.append(", url='");
        sb2.append(this.f12523g);
        sb2.append("', exception='");
        return e.h(sb2, this.f12524h, "'}");
    }
}
