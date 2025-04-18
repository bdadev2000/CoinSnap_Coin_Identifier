package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b {
    private CopyOnWriteArrayList<CampaignEx> a;

    /* renamed from: b, reason: collision with root package name */
    private double f12983b;

    /* renamed from: c, reason: collision with root package name */
    private String f12984c;

    /* renamed from: d, reason: collision with root package name */
    private String f12985d;

    /* renamed from: e, reason: collision with root package name */
    private int f12986e;

    /* renamed from: f, reason: collision with root package name */
    private long f12987f;

    /* renamed from: g, reason: collision with root package name */
    private int f12988g;

    /* renamed from: h, reason: collision with root package name */
    private long f12989h;

    /* renamed from: i, reason: collision with root package name */
    private String f12990i;

    /* renamed from: j, reason: collision with root package name */
    private long f12991j;

    public final long a() {
        return this.f12991j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.a;
    }

    public final double c() {
        return this.f12983b;
    }

    public final String d() {
        return this.f12984c;
    }

    public final String e() {
        return this.f12985d;
    }

    public final int f() {
        return this.f12986e;
    }

    public final int g() {
        return this.f12988g;
    }

    public final long h() {
        return this.f12989h;
    }

    public final void a(long j3) {
        this.f12991j = j3;
    }

    public final void b(String str) {
        this.f12984c = str;
    }

    public final void c(String str) {
        this.f12985d = str;
    }

    public final void d(String str) {
        this.f12990i = str;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.a = copyOnWriteArrayList;
    }

    public final void b(int i10) {
        this.f12988g = i10;
    }

    public final void c(long j3) {
        this.f12987f = j3;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a = x.a(str);
        if (TextUtils.isEmpty(a)) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(a);
            if (parseDouble <= 0.0d) {
                return;
            }
            this.f12983b = parseDouble;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(long j3) {
        this.f12989h = j3;
    }

    public final void a(int i10) {
        this.f12986e = i10;
    }
}
