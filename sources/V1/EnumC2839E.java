package v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2839E {
    public static final EnumC2839E b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2839E f23465c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2839E f23466d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC2839E[] f23467f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.E] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.E] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.E] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        b = r02;
        ?? r12 = new Enum("HARDWARE", 1);
        f23465c = r12;
        ?? r22 = new Enum("SOFTWARE", 2);
        f23466d = r22;
        f23467f = new EnumC2839E[]{r02, r12, r22};
    }

    public static EnumC2839E valueOf(String str) {
        return (EnumC2839E) Enum.valueOf(EnumC2839E.class, str);
    }

    public static EnumC2839E[] values() {
        return (EnumC2839E[]) f23467f.clone();
    }
}
