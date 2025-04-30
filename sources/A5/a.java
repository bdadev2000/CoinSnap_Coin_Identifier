package A5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    public static final a b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f64c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f65d;

    /* renamed from: f, reason: collision with root package name */
    public static final a f66f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f67g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f68h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f69i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f70j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f71k;
    public static final a l;
    public static final a m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f72n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a[] f73o;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, A5.a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, A5.a] */
    static {
        ?? r02 = new Enum("ERROR_CORRECTION", 0);
        b = r02;
        ?? r12 = new Enum("CHARACTER_SET", 1);
        f64c = r12;
        ?? r22 = new Enum("DATA_MATRIX_SHAPE", 2);
        f65d = r22;
        ?? r32 = new Enum("MIN_SIZE", 3);
        f66f = r32;
        ?? r42 = new Enum("MAX_SIZE", 4);
        f67g = r42;
        ?? r52 = new Enum("MARGIN", 5);
        f68h = r52;
        ?? r62 = new Enum("PDF417_COMPACT", 6);
        f69i = r62;
        ?? r72 = new Enum("PDF417_COMPACTION", 7);
        f70j = r72;
        ?? r82 = new Enum("PDF417_DIMENSIONS", 8);
        f71k = r82;
        ?? r9 = new Enum("AZTEC_LAYERS", 9);
        l = r9;
        ?? r10 = new Enum("QR_VERSION", 10);
        m = r10;
        ?? r11 = new Enum("GS1_FORMAT", 11);
        f72n = r11;
        f73o = new a[]{r02, r12, r22, r32, r42, r52, r62, r72, r82, r9, r10, r11};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f73o.clone();
    }
}
