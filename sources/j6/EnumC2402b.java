package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2402b {
    public static final C2401a b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2402b f21108c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2402b f21109d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2402b f21110f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2402b f21111g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC2402b[] f21112h;

    /* JADX WARN: Type inference failed for: r0v0, types: [j6.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j6.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j6.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j6.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("BOTTOM", 0);
        f21108c = r02;
        ?? r12 = new Enum("TOP", 1);
        f21109d = r12;
        ?? r22 = new Enum("START", 2);
        f21110f = r22;
        ?? r32 = new Enum("END", 3);
        f21111g = r32;
        f21112h = new EnumC2402b[]{r02, r12, r22, r32};
        b = new Object();
    }

    public static EnumC2402b valueOf(String str) {
        return (EnumC2402b) Enum.valueOf(EnumC2402b.class, str);
    }

    public static EnumC2402b[] values() {
        return (EnumC2402b[]) f21112h.clone();
    }
}
