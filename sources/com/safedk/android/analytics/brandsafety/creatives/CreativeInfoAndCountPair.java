package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class CreativeInfoAndCountPair implements Serializable {
    private static final long serialVersionUID = -7509291458978814775L;

    /* renamed from: a, reason: collision with root package name */
    private CreativeInfo f29417a;

    /* renamed from: b, reason: collision with root package name */
    private int f29418b;

    public CreativeInfoAndCountPair() {
    }

    public CreativeInfoAndCountPair(CreativeInfo ci) {
        this.f29417a = ci;
        this.f29418b = 1;
    }

    public CreativeInfo a() {
        return this.f29417a;
    }

    public int b() {
        return this.f29418b;
    }

    public void c() {
        this.f29418b++;
    }

    public void d() {
        this.f29418b--;
    }

    public String toString() {
        return super.toString();
    }
}
