package O5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f2218c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f2219d;

    /* renamed from: f, reason: collision with root package name */
    public static final g f2220f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f2221g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O5.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O5.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, O5.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, O5.g] */
    static {
        ?? r02 = new Enum("VIDEO_CONTROLS", 0);
        b = r02;
        ?? r12 = new Enum("CLOSE_AD", 1);
        f2218c = r12;
        ?? r22 = new Enum("NOT_VISIBLE", 2);
        f2219d = r22;
        ?? r32 = new Enum("OTHER", 3);
        f2220f = r32;
        f2221g = new g[]{r02, r12, r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2221g.clone();
    }
}
