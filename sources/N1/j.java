package N1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    public static final j b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f2092c;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N1.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N1.j] */
    static {
        ?? r02 = new Enum("SRGB", 0);
        ?? r12 = new Enum("DISPLAY_P3", 1);
        b = r12;
        f2092c = new j[]{r02, r12};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2092c.clone();
    }
}
