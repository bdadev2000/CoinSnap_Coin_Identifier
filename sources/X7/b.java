package X7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    public static final b b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f3715c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f3716d;

    /* renamed from: f, reason: collision with root package name */
    public static final b f3717f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f3718g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f3719h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X7.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X7.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X7.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, X7.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, X7.b] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        b = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f3715c = r12;
        ?? r22 = new Enum("PARKING", 2);
        f3716d = r22;
        ?? r32 = new Enum("DORMANT", 3);
        f3717f = r32;
        ?? r42 = new Enum("TERMINATED", 4);
        f3718g = r42;
        f3719h = new b[]{r02, r12, r22, r32, r42};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3719h.clone();
    }
}
