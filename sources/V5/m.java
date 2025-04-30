package v5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    public static final m b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f23637c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f23638d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f23639f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v5.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v5.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v5.m] */
    static {
        ?? r02 = new Enum("ERROR", 0);
        b = r02;
        ?? r12 = new Enum("RESPONSE", 1);
        f23637c = r12;
        ?? r22 = new Enum("RESULT_NOT_SET", 2);
        f23638d = r22;
        f23639f = new m[]{r02, r12, r22};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f23639f.clone();
    }
}
