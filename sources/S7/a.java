package S7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f2809c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f2810d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f2811f;

    /* JADX WARN: Type inference failed for: r0v0, types: [S7.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [S7.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [S7.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        b = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f2809c = r12;
        ?? r22 = new Enum("DROP_LATEST", 2);
        f2810d = r22;
        f2811f = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2811f.clone();
    }
}
