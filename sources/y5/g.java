package y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f24435c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f24436d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f24437f;

    /* JADX WARN: Type inference failed for: r0v0, types: [y5.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [y5.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [y5.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UTC_OFFSET", 0);
        b = r02;
        ?? r12 = new Enum("TIME_ZONE", 1);
        f24435c = r12;
        ?? r22 = new Enum("TIMEOFFSET_NOT_SET", 2);
        f24436d = r22;
        f24437f = new g[]{r02, r12, r22};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f24437f.clone();
    }
}
