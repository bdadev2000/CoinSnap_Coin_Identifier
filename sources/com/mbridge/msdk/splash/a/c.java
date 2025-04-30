package com.mbridge.msdk.splash.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f17766a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f17767c;

    /* renamed from: d, reason: collision with root package name */
    private String f17768d;

    /* renamed from: e, reason: collision with root package name */
    private String f17769e;

    /* renamed from: f, reason: collision with root package name */
    private String f17770f;

    /* renamed from: g, reason: collision with root package name */
    private String f17771g;

    /* renamed from: h, reason: collision with root package name */
    private int f17772h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17773i;

    /* renamed from: j, reason: collision with root package name */
    private int f17774j;

    private c() {
    }

    public final c a(boolean z8) {
        this.f17773i = z8;
        return this;
    }

    public final c b(String str) {
        this.b = str;
        return this;
    }

    public final c c(String str) {
        this.f17767c = str;
        return this;
    }

    public final c d(String str) {
        this.f17768d = str;
        return this;
    }

    public final c e(String str) {
        this.f17770f = str;
        return this;
    }

    public final c f(String str) {
        this.f17771g = str;
        return this;
    }

    public final c g(String str) {
        this.f17769e = str;
        return this;
    }

    public static c a() {
        return new c();
    }

    public final c b(int i9) {
        this.f17772h = i9;
        return this;
    }

    public final c a(String str) {
        this.f17766a = str;
        return this;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            sb.append("unit_id=");
            sb.append(this.b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17767c)) {
            sb.append("cid=");
            sb.append(this.f17767c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17768d)) {
            sb.append("rid=");
            sb.append(this.f17768d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17769e)) {
            sb.append("rid_n=");
            sb.append(this.f17769e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17770f)) {
            sb.append("creative_id=");
            sb.append(this.f17770f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17771g)) {
            sb.append("reason=");
            sb.append(this.f17771g);
            sb.append("&");
        }
        if (this.f17772h != 0) {
            sb.append("result=");
            sb.append(this.f17772h);
            sb.append("&");
        }
        if (this.f17773i) {
            sb.append("hb=1&");
        }
        if (this.f17774j != 0) {
            sb.append("close_type=");
            sb.append(this.f17774j);
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f17766a)) {
            sb.append("key=");
            sb.append(this.f17766a);
        }
        return sb.toString();
    }

    public final void a(int i9) {
        this.f17774j = i9;
    }
}
