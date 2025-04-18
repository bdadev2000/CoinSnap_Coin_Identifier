package r;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f31346a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f31347b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f31348c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r.f] */
    static {
        ?? r02 = new Enum("FILL", 0);
        f31346a = r02;
        ?? r1 = new Enum("FIT", 1);
        f31347b = r1;
        f[] fVarArr = {r02, r1};
        f31348c = fVarArr;
        f0.l(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f31348c.clone();
    }
}
