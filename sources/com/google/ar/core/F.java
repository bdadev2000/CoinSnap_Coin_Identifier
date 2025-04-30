package com.google.ar.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class F {
    public static final F b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f14261c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f14262d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F[] f14263f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.ar.core.F] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.google.ar.core.F] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.google.ar.core.F] */
    static {
        ?? r02 = new Enum("ACCEPTED", 0);
        b = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f14261c = r12;
        ?? r22 = new Enum("COMPLETED", 2);
        f14262d = r22;
        f14263f = new F[]{r02, r12, r22};
    }

    public static F[] values() {
        return (F[]) f14263f.clone();
    }
}
