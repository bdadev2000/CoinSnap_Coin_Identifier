package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum p {
    /* JADX INFO: Fake field, exist only in values array */
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

    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13739c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13740d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13741f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13742g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13743h;

    p(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.b = z8;
        this.f13739c = z9;
        this.f13740d = z10;
        this.f13741f = z11;
        this.f13742g = z12;
        this.f13743h = z13;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        return (p[]) Arrays.copyOf(values(), 6);
    }
}
