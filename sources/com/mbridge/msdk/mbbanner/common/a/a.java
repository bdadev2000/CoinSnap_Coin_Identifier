package com.mbridge.msdk.mbbanner.common.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f16235a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f16236c;

    /* renamed from: d, reason: collision with root package name */
    private String f16237d;

    /* renamed from: e, reason: collision with root package name */
    private String f16238e;

    /* renamed from: f, reason: collision with root package name */
    private String f16239f;

    /* renamed from: g, reason: collision with root package name */
    private String f16240g;

    /* renamed from: h, reason: collision with root package name */
    private int f16241h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16242i;

    private a() {
    }

    public final a a(boolean z8) {
        this.f16242i = z8;
        return this;
    }

    public final a b(String str) {
        this.b = str;
        return this;
    }

    public final a c(String str) {
        this.f16236c = str;
        return this;
    }

    public final a d(String str) {
        this.f16237d = str;
        return this;
    }

    public final a e(String str) {
        this.f16238e = str;
        return this;
    }

    public final a f(String str) {
        this.f16239f = str;
        return this;
    }

    public final a g(String str) {
        this.f16240g = str;
        return this;
    }

    public static a a() {
        return new a();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            sb.append("unit_id=");
            sb.append(this.b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16236c)) {
            sb.append("cid=");
            sb.append(this.f16236c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16237d)) {
            sb.append("rid=");
            sb.append(this.f16237d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16238e)) {
            sb.append("rid_n=");
            sb.append(this.f16238e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16239f)) {
            sb.append("creative_id=");
            sb.append(this.f16239f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f16240g)) {
            sb.append("reason=");
            sb.append(this.f16240g);
            sb.append("&");
        }
        if (this.f16241h != 0) {
            sb.append("result=");
            sb.append(this.f16241h);
            sb.append("&");
        }
        if (this.f16242i) {
            sb.append("hb=1&");
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f16235a)) {
            sb.append("key=");
            sb.append(this.f16235a);
        }
        return sb.toString();
    }

    public final a a(String str) {
        this.f16235a = str;
        return this;
    }

    public final a a(int i9) {
        this.f16241h = i9;
        return this;
    }
}
