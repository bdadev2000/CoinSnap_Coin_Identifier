package N1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    public static final a b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f2083c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f2084d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f2085f;

    /* JADX WARN: Type inference failed for: r0v0, types: [N1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [N1.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PREFER_ARGB_8888", 0);
        b = r02;
        ?? r12 = new Enum("PREFER_RGB_565", 1);
        f2083c = r12;
        f2085f = new a[]{r02, r12};
        f2084d = r02;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2085f.clone();
    }
}
