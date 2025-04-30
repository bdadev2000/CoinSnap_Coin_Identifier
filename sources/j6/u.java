package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u {
    public static final u b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f21194c;

    /* JADX WARN: Type inference failed for: r0v0, types: [j6.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.u, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j6.u, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ALIGNMENT", 0);
        b = r02;
        f21194c = new u[]{r02, new Enum("DROPDOWN", 1), new Enum("CENTER", 2)};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f21194c.clone();
    }
}
