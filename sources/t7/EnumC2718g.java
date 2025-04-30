package t7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2718g {
    public static final EnumC2718g b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2718g f23018c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2718g f23019d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC2718g[] f23020f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t7.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t7.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, t7.g] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        b = r02;
        ?? r12 = new Enum("PUBLICATION", 1);
        f23018c = r12;
        ?? r22 = new Enum("NONE", 2);
        f23019d = r22;
        f23020f = new EnumC2718g[]{r02, r12, r22};
    }

    public static EnumC2718g valueOf(String str) {
        return (EnumC2718g) Enum.valueOf(EnumC2718g.class, str);
    }

    public static EnumC2718g[] values() {
        return (EnumC2718g[]) f23020f.clone();
    }
}
