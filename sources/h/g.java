package h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f30668a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f30669b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f30670c;
    public static final g d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f30671f;

    /* JADX WARN: Type inference failed for: r0v0, types: [h.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MEMORY_CACHE", 0);
        f30668a = r02;
        ?? r1 = new Enum("MEMORY", 1);
        f30669b = r1;
        ?? r2 = new Enum("DISK", 2);
        f30670c = r2;
        ?? r3 = new Enum("NETWORK", 3);
        d = r3;
        g[] gVarArr = {r02, r1, r2, r3};
        f30671f = gVarArr;
        b1.f0.l(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f30671f.clone();
    }
}
