package i0;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30806a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f30807b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30808c;
    public static final /* synthetic */ a[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i0.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f30806a = r02;
        ?? r1 = new Enum("UNDECIDED", 1);
        f30807b = r1;
        ?? r2 = new Enum("RESUMED", 2);
        f30808c = r2;
        a[] aVarArr = {r02, r1, r2};
        d = aVarArr;
        f0.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
