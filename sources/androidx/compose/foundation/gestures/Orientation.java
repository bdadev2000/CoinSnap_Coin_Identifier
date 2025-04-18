package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Orientation {

    /* renamed from: a, reason: collision with root package name */
    public static final Orientation f3394a;

    /* renamed from: b, reason: collision with root package name */
    public static final Orientation f3395b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Orientation[] f3396c;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.Orientation, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.gestures.Orientation, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f3394a = r02;
        ?? r1 = new Enum("Horizontal", 1);
        f3395b = r1;
        f3396c = new Orientation[]{r02, r1};
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f3396c.clone();
    }
}
