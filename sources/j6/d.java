package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final d b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f21115c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f21116d;

    /* JADX WARN: Type inference failed for: r0v0, types: [j6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ALIGN_BALLOON", 0);
        b = r02;
        ?? r12 = new Enum("ALIGN_ANCHOR", 1);
        f21115c = r12;
        f21116d = new d[]{r02, r12};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f21116d.clone();
    }
}
