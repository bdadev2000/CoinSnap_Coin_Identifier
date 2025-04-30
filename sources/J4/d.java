package J4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    public static final d b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f1576c;

    /* JADX WARN: Type inference failed for: r0v0, types: [J4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [J4.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [J4.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        b = r02;
        f1576c = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1576c.clone();
    }
}
