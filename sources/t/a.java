package t;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31364a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f31365b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f31366c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t.a] */
    static {
        ?? r02 = new Enum("UNCHANGED", 0);
        f31364a = r02;
        ?? r1 = new Enum("TRANSLUCENT", 1);
        ?? r2 = new Enum("OPAQUE", 2);
        f31365b = r2;
        a[] aVarArr = {r02, r1, r2};
        f31366c = aVarArr;
        f0.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f31366c.clone();
    }
}
