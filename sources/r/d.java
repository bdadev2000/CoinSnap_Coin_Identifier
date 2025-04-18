package r;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f31342a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f31343b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f31344c;
    public static final /* synthetic */ d[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r.d] */
    static {
        ?? r02 = new Enum("EXACT", 0);
        f31342a = r02;
        ?? r1 = new Enum("INEXACT", 1);
        f31343b = r1;
        ?? r2 = new Enum("AUTOMATIC", 2);
        f31344c = r2;
        d[] dVarArr = {r02, r1, r2};
        d = dVarArr;
        f0.l(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
