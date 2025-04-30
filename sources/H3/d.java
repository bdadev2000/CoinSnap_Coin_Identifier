package h3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    public static final d b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f20586c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f20587d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f20588f;

    /* JADX WARN: Type inference failed for: r0v0, types: [h3.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h3.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h3.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        b = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f20586c = r12;
        ?? r22 = new Enum("HIGHEST", 2);
        f20587d = r22;
        f20588f = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20588f.clone();
    }
}
