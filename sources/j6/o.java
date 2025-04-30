package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o {
    public static final o b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f21181c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f21182d;

    /* JADX INFO: Fake field, exist only in values array */
    o EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j6.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j6.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j6.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j6.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j6.o] */
    static {
        ?? r02 = new Enum("NONE", 0);
        ?? r12 = new Enum("ELASTIC", 1);
        ?? r22 = new Enum("FADE", 2);
        b = r22;
        ?? r32 = new Enum("CIRCULAR", 3);
        f21181c = r32;
        f21182d = new o[]{r02, r12, r22, r32, new Enum("OVERSHOOT", 4)};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f21182d.clone();
    }
}
