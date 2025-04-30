package r6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2680a {
    public static final EnumC2680a b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2680a f22891c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2680a f22892d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2680a f22893f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC2680a[] f22894g;

    /* JADX WARN: Type inference failed for: r0v0, types: [r6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r6.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [r6.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNDEFINED", 0);
        b = r02;
        ?? r12 = new Enum("LOADING", 1);
        f22891c = r12;
        ?? r22 = new Enum("SUCCESS", 2);
        f22892d = r22;
        ?? r32 = new Enum("FAILED", 3);
        f22893f = r32;
        f22894g = new EnumC2680a[]{r02, r12, r22, r32};
    }

    public static EnumC2680a valueOf(String str) {
        return (EnumC2680a) Enum.valueOf(EnumC2680a.class, str);
    }

    public static EnumC2680a[] values() {
        return (EnumC2680a[]) f22894g.clone();
    }
}
