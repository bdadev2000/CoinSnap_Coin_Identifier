package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {
    public static final q b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f21183c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f21184d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j6.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j6.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j6.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j6.q] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j6.q] */
    static {
        ?? r02 = new Enum("NONE", 0);
        b = r02;
        ?? r12 = new Enum("HEARTBEAT", 1);
        ?? r22 = new Enum("SHAKE", 2);
        f21183c = r22;
        f21184d = new q[]{r02, r12, r22, new Enum("BREATH", 3), new Enum("ROTATE", 4)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f21184d.clone();
    }
}
