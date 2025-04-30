package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {
    public static final r b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f4036c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f4037d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r[] f4038f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a4.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a4.r] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a4.r] */
    static {
        ?? r02 = new Enum("JWT_AUDIENCE", 0);
        b = r02;
        ?? r12 = new Enum("DISABLE_AUTH", 1);
        f4036c = r12;
        ?? r22 = new Enum("AUTHENTICATION_NOT_SET", 2);
        f4037d = r22;
        f4038f = new r[]{r02, r12, r22};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f4038f.clone();
    }
}
