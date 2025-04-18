package com.google.common.collect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class q1 implements ra.g {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f12021b;

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f12022c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q1[] f12023d;

    static {
        o1 o1Var = new o1();
        f12021b = o1Var;
        p1 p1Var = new p1();
        f12022c = p1Var;
        f12023d = new q1[]{o1Var, p1Var};
    }

    public q1(String str, int i10) {
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) f12023d.clone();
    }
}
