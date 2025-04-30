package G5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f1295c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f1296d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f1297f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, G5.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, G5.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, G5.g] */
    static {
        ?? r02 = new Enum("FORCE_NONE", 0);
        b = r02;
        ?? r12 = new Enum("FORCE_SQUARE", 1);
        f1295c = r12;
        ?? r22 = new Enum("FORCE_RECTANGLE", 2);
        f1296d = r22;
        f1297f = new g[]{r02, r12, r22};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1297f.clone();
    }
}
