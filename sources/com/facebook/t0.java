package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11399b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f11400c;

    /* renamed from: d, reason: collision with root package name */
    public long f11401d;

    public t0(boolean z10, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = z10;
        this.f11399b = key;
    }

    public final boolean a() {
        Boolean bool = this.f11400c;
        return bool == null ? this.a : bool.booleanValue();
    }
}
