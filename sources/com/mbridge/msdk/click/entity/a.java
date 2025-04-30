package com.mbridge.msdk.click.entity;

import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f14810a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f14811c;

    /* renamed from: d, reason: collision with root package name */
    public String f14812d;

    /* renamed from: e, reason: collision with root package name */
    public int f14813e;

    /* renamed from: f, reason: collision with root package name */
    public int f14814f;

    /* renamed from: g, reason: collision with root package name */
    public String f14815g;

    /* renamed from: h, reason: collision with root package name */
    public String f14816h;

    public final String a() {
        return "statusCode=" + this.f14814f + ", location=" + this.f14810a + ", contentType=" + this.b + ", contentLength=" + this.f14813e + ", contentEncoding=" + this.f14811c + ", referer=" + this.f14812d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.f14810a);
        sb.append("', contentType='");
        sb.append(this.b);
        sb.append("', contentEncoding='");
        sb.append(this.f14811c);
        sb.append("', referer='");
        sb.append(this.f14812d);
        sb.append("', contentLength=");
        sb.append(this.f14813e);
        sb.append(", statusCode=");
        sb.append(this.f14814f);
        sb.append(", url='");
        sb.append(this.f14815g);
        sb.append("', exception='");
        return AbstractC2914a.h(sb, this.f14816h, "'}");
    }
}
