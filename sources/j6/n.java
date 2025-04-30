package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    public static final n b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f21179c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f21180d;

    /* JADX INFO: Fake field, exist only in values array */
    n EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j6.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j6.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j6.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j6.n] */
    static {
        ?? r02 = new Enum("START", 0);
        ?? r12 = new Enum("END", 1);
        ?? r22 = new Enum("TOP", 2);
        b = r22;
        ?? r32 = new Enum("BOTTOM", 3);
        f21179c = r32;
        f21180d = new n[]{r02, r12, r22, r32};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f21180d.clone();
    }
}
