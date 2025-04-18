package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum q {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(false, false, false, true, false, false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f11258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11259c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11260d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11261f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11262g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11263h;

    q(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f11258b = z10;
        this.f11259c = z11;
        this.f11260d = z12;
        this.f11261f = z13;
        this.f11262g = z14;
        this.f11263h = z15;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        return (q[]) Arrays.copyOf(values(), 6);
    }
}
