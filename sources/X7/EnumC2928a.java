package x7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2928a {
    public static final EnumC2928a b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2928a[] f24242c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x7.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x7.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        b = r02;
        f24242c = new EnumC2928a[]{r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static EnumC2928a valueOf(String str) {
        return (EnumC2928a) Enum.valueOf(EnumC2928a.class, str);
    }

    public static EnumC2928a[] values() {
        return (EnumC2928a[]) f24242c.clone();
    }
}
