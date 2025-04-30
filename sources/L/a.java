package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    public static final a b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1662c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f1663d;

    /* renamed from: f, reason: collision with root package name */
    public static final a f1664f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f1665g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a[] f1666h;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, L.a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, L.a] */
    static {
        ?? r02 = new Enum("CLEAR", 0);
        ?? r12 = new Enum("SRC", 1);
        ?? r22 = new Enum("DST", 2);
        ?? r32 = new Enum("SRC_OVER", 3);
        ?? r42 = new Enum("DST_OVER", 4);
        ?? r52 = new Enum("SRC_IN", 5);
        ?? r62 = new Enum("DST_IN", 6);
        ?? r72 = new Enum("SRC_OUT", 7);
        ?? r82 = new Enum("DST_OUT", 8);
        ?? r9 = new Enum("SRC_ATOP", 9);
        ?? r10 = new Enum("DST_ATOP", 10);
        ?? r11 = new Enum("XOR", 11);
        ?? r122 = new Enum("PLUS", 12);
        b = r122;
        ?? r13 = new Enum("MODULATE", 13);
        ?? r14 = new Enum("SCREEN", 14);
        f1662c = r14;
        ?? r15 = new Enum("OVERLAY", 15);
        f1663d = r15;
        ?? r142 = new Enum("DARKEN", 16);
        f1664f = r142;
        ?? r152 = new Enum("LIGHTEN", 17);
        f1665g = r152;
        f1666h = new a[]{r02, r12, r22, r32, r42, r52, r62, r72, r82, r9, r10, r11, r122, r13, r14, r15, r142, r152, new Enum("COLOR_DODGE", 18), new Enum("COLOR_BURN", 19), new Enum("HARD_LIGHT", 20), new Enum("SOFT_LIGHT", 21), new Enum("DIFFERENCE", 22), new Enum("EXCLUSION", 23), new Enum("MULTIPLY", 24), new Enum("HUE", 25), new Enum("SATURATION", 26), new Enum("COLOR", 27), new Enum("LUMINOSITY", 28)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1666h.clone();
    }
}
