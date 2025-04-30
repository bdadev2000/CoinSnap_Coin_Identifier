package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0347a0 {
    public static final EnumC0347a0 b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0347a0 f3990c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0347a0 f3991d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0347a0 f3992f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0347a0 f3993g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0347a0 f3994h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0347a0 f3995i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0347a0[] f3996j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a4.a0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a4.a0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a4.a0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, a4.a0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, a4.a0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, a4.a0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, a4.a0] */
    static {
        ?? r02 = new Enum("GET", 0);
        b = r02;
        ?? r12 = new Enum("PUT", 1);
        f3990c = r12;
        ?? r22 = new Enum("POST", 2);
        f3991d = r22;
        ?? r32 = new Enum("DELETE", 3);
        f3992f = r32;
        ?? r42 = new Enum("PATCH", 4);
        f3993g = r42;
        ?? r52 = new Enum("CUSTOM", 5);
        f3994h = r52;
        ?? r62 = new Enum("PATTERN_NOT_SET", 6);
        f3995i = r62;
        f3996j = new EnumC0347a0[]{r02, r12, r22, r32, r42, r52, r62};
    }

    public static EnumC0347a0 valueOf(String str) {
        return (EnumC0347a0) Enum.valueOf(EnumC0347a0.class, str);
    }

    public static EnumC0347a0[] values() {
        return (EnumC0347a0[]) f3996j.clone();
    }
}
