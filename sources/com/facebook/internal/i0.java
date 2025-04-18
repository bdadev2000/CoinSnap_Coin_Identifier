package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public enum i0 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f11041c;

    /* renamed from: b, reason: collision with root package name */
    public final long f11045b;

    static {
        EnumSet allOf = EnumSet.allOf(i0.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        f11041c = allOf;
    }

    i0(long j3) {
        this.f11045b = j3;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i0[] valuesCustom() {
        return (i0[]) Arrays.copyOf(values(), 3);
    }
}
