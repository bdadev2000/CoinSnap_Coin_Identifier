package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f15342a;
    private double b;

    /* renamed from: c, reason: collision with root package name */
    private String f15343c;

    /* renamed from: d, reason: collision with root package name */
    private String f15344d;

    /* renamed from: e, reason: collision with root package name */
    private int f15345e;

    /* renamed from: f, reason: collision with root package name */
    private long f15346f;

    /* renamed from: g, reason: collision with root package name */
    private int f15347g;

    /* renamed from: h, reason: collision with root package name */
    private long f15348h;

    /* renamed from: i, reason: collision with root package name */
    private String f15349i;

    /* renamed from: j, reason: collision with root package name */
    private long f15350j;

    public final long a() {
        return this.f15350j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.f15342a;
    }

    public final double c() {
        return this.b;
    }

    public final String d() {
        return this.f15343c;
    }

    public final String e() {
        return this.f15344d;
    }

    public final int f() {
        return this.f15345e;
    }

    public final int g() {
        return this.f15347g;
    }

    public final long h() {
        return this.f15348h;
    }

    public final void a(long j7) {
        this.f15350j = j7;
    }

    public final void b(String str) {
        this.f15343c = str;
    }

    public final void c(String str) {
        this.f15344d = str;
    }

    public final void d(String str) {
        this.f15349i = str;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f15342a = copyOnWriteArrayList;
    }

    public final void b(int i9) {
        this.f15347g = i9;
    }

    public final void c(long j7) {
        this.f15346f = j7;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a6 = x.a(str);
        if (TextUtils.isEmpty(a6)) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(a6);
            if (parseDouble <= 0.0d) {
                return;
            }
            this.b = parseDouble;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void b(long j7) {
        this.f15348h = j7;
    }

    public final void a(int i9) {
        this.f15345e = i9;
    }
}
