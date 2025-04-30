package com.google.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f14246c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f14247d;

    /* renamed from: f, reason: collision with root package name */
    public static final g f14248f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f14249g;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.api.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.api.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.api.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.api.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("LINEAR_BUCKETS", 0);
        b = r02;
        ?? r12 = new Enum("EXPONENTIAL_BUCKETS", 1);
        f14246c = r12;
        ?? r22 = new Enum("EXPLICIT_BUCKETS", 2);
        f14247d = r22;
        ?? r32 = new Enum("OPTIONS_NOT_SET", 3);
        f14248f = r32;
        f14249g = new g[]{r02, r12, r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14249g.clone();
    }
}
