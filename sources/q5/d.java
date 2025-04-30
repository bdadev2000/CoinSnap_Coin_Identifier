package q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    public static final d b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f22797c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f22798d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q5.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q5.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, q5.d] */
    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        b = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f22797c = r12;
        f22798d = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f22798d.clone();
    }
}
