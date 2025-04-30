package o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2490b {
    public static final EnumC2490b b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2490b f21927c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2490b f21928d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2490b f21929f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2490b f21930g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC2490b f21931h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC2490b f21932i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC2490b[] f21933j;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2490b EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, o0.b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, o0.b] */
    static {
        ?? r02 = new Enum("PENALTY_LOG", 0);
        ?? r12 = new Enum("PENALTY_DEATH", 1);
        ?? r22 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        b = r22;
        ?? r32 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f21927c = r32;
        ?? r42 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f21928d = r42;
        ?? r52 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f21929f = r52;
        ?? r62 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        f21930g = r62;
        ?? r72 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f21931h = r72;
        ?? r82 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f21932i = r82;
        f21933j = new EnumC2490b[]{r02, r12, r22, r32, r42, r52, r62, r72, r82};
    }

    public static EnumC2490b valueOf(String str) {
        return (EnumC2490b) Enum.valueOf(EnumC2490b.class, str);
    }

    public static EnumC2490b[] values() {
        return (EnumC2490b[]) f21933j.clone();
    }
}
