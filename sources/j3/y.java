package j3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {
    public static final y b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y[] f21101c;

    /* JADX INFO: Fake field, exist only in values array */
    y EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j3.y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j3.y] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        b = r12;
        f21101c = new y[]{r02, r12};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f21101c.clone();
    }
}
