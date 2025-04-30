package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f12820c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f12821d;

    /* renamed from: f, reason: collision with root package name */
    public static final g f12822f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f12823g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.bumptech.glide.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.bumptech.glide.g] */
    static {
        ?? r02 = new Enum("IMMEDIATE", 0);
        b = r02;
        ?? r12 = new Enum("HIGH", 1);
        f12820c = r12;
        ?? r22 = new Enum("NORMAL", 2);
        f12821d = r22;
        ?? r32 = new Enum("LOW", 3);
        f12822f = r32;
        f12823g = new g[]{r02, r12, r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f12823g.clone();
    }
}
