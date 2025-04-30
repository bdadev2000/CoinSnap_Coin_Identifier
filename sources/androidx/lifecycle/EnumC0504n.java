package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0504n {
    public static final EnumC0504n b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0504n f4892c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0504n f4893d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0504n f4894f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0504n f4895g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0504n[] f4896h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        b = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f4892c = r12;
        ?? r22 = new Enum("CREATED", 2);
        f4893d = r22;
        ?? r32 = new Enum("STARTED", 3);
        f4894f = r32;
        ?? r42 = new Enum("RESUMED", 4);
        f4895g = r42;
        f4896h = new EnumC0504n[]{r02, r12, r22, r32, r42};
    }

    public static EnumC0504n valueOf(String str) {
        return (EnumC0504n) Enum.valueOf(EnumC0504n.class, str);
    }

    public static EnumC0504n[] values() {
        return (EnumC0504n[]) f4896h.clone();
    }

    public final boolean a(EnumC0504n enumC0504n) {
        if (compareTo(enumC0504n) >= 0) {
            return true;
        }
        return false;
    }
}
