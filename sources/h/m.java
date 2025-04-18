package h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f30683a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f30684b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h.m] */
    static {
        ?? r02 = new Enum("IGNORE", 0);
        ?? r1 = new Enum("RESPECT_PERFORMANCE", 1);
        f30683a = r1;
        m[] mVarArr = {r02, r1, new Enum("RESPECT_ALL", 2)};
        f30684b = mVarArr;
        b1.f0.l(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f30684b.clone();
    }
}
