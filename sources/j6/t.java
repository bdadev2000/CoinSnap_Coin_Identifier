package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t {
    public static final t b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t[] f21193c;

    /* JADX WARN: Type inference failed for: r0v0, types: [j6.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j6.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j6.t, java.lang.Enum] */
    static {
        ?? r02 = new Enum("START", 0);
        b = r02;
        f21193c = new t[]{r02, new Enum("END", 1), new Enum("TOP", 2), new Enum("BOTTOM", 3)};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f21193c.clone();
    }
}
