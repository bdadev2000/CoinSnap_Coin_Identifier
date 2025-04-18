package x0;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p[] f31418a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x0.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x0.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x0.p] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, x0.p] */
    static {
        p[] pVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f31418a = pVarArr;
        f0.l(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f31418a.clone();
    }
}
