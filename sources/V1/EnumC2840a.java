package v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2840a {
    public static final EnumC2840a b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2840a f23468c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2840a[] f23469d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.a] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        b = r02;
        ?? r12 = new Enum("ENABLED", 1);
        f23468c = r12;
        f23469d = new EnumC2840a[]{r02, r12, new Enum("DISABLED", 2)};
    }

    public static EnumC2840a valueOf(String str) {
        return (EnumC2840a) Enum.valueOf(EnumC2840a.class, str);
    }

    public static EnumC2840a[] values() {
        return (EnumC2840a[]) f23469d.clone();
    }
}
