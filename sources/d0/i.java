package d0;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f30131a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f30132b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f30133c;
    public static final /* synthetic */ i[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d0.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d0.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d0.i] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        f30131a = r02;
        ?? r1 = new Enum("PUBLICATION", 1);
        f30132b = r1;
        ?? r2 = new Enum("NONE", 2);
        f30133c = r2;
        i[] iVarArr = {r02, r1, r2};
        d = iVarArr;
        f0.l(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }
}
