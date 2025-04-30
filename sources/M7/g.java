package M7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f2013c;

    /* JADX WARN: Type inference failed for: r0v0, types: [M7.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [M7.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [M7.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INVARIANT", 0);
        b = r02;
        f2013c = new g[]{r02, new Enum("IN", 1), new Enum("OUT", 2)};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2013c.clone();
    }
}
