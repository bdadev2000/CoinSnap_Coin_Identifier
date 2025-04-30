package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0355e0 {
    public static final EnumC0355e0 b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0355e0 f4001c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0355e0 f4002d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0355e0[] f4003f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a4.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a4.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a4.e0] */
    static {
        ?? r02 = new Enum("HEADER", 0);
        b = r02;
        ?? r12 = new Enum("QUERY", 1);
        f4001c = r12;
        ?? r22 = new Enum("IN_NOT_SET", 2);
        f4002d = r22;
        f4003f = new EnumC0355e0[]{r02, r12, r22};
    }

    public static EnumC0355e0 valueOf(String str) {
        return (EnumC0355e0) Enum.valueOf(EnumC0355e0.class, str);
    }

    public static EnumC0355e0[] values() {
        return (EnumC0355e0[]) f4003f.clone();
    }
}
