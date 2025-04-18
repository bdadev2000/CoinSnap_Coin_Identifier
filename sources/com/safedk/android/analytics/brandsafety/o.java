package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    CreativeInfo f29758a;

    /* renamed from: b, reason: collision with root package name */
    String f29759b;

    /* renamed from: c, reason: collision with root package name */
    String f29760c;

    public o(CreativeInfo creativeInfo, String str, String str2) {
        this.f29758a = creativeInfo;
        this.f29759b = str;
        this.f29760c = System.currentTimeMillis() + ";" + str2;
    }

    public String toString() {
        return "what?: " + this.f29758a.toString() + " how? " + this.f29759b + " when?: " + this.f29760c;
    }
}
