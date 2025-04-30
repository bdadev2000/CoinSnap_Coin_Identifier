package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;

/* loaded from: classes.dex */
public enum E {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f13574c;
    public final long b;

    static {
        EnumSet allOf = EnumSet.allOf(E.class);
        G7.j.d(allOf, "allOf(SmartLoginOption::class.java)");
        f13574c = allOf;
    }

    E(long j7) {
        this.b = j7;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static E[] valuesCustom() {
        return (E[]) Arrays.copyOf(values(), 3);
    }
}
