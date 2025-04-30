package Q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Q7.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0254w {
    public static final EnumC0254w b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0254w f2585c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0254w f2586d;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0254w f2587f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0254w[] f2588g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q7.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q7.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Q7.w] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Q7.w] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        b = r02;
        ?? r12 = new Enum("LAZY", 1);
        f2585c = r12;
        ?? r22 = new Enum("ATOMIC", 2);
        f2586d = r22;
        ?? r32 = new Enum("UNDISPATCHED", 3);
        f2587f = r32;
        f2588g = new EnumC0254w[]{r02, r12, r22, r32};
    }

    public static EnumC0254w valueOf(String str) {
        return (EnumC0254w) Enum.valueOf(EnumC0254w.class, str);
    }

    public static EnumC0254w[] values() {
        return (EnumC0254w[]) f2588g.clone();
    }
}
