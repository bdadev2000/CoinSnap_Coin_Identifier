package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Direction {

    /* renamed from: a, reason: collision with root package name */
    public static final Direction f3879a;

    /* renamed from: b, reason: collision with root package name */
    public static final Direction f3880b;

    /* renamed from: c, reason: collision with root package name */
    public static final Direction f3881c;
    public static final /* synthetic */ Direction[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.layout.Direction] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.layout.Direction] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.layout.Direction] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f3879a = r02;
        ?? r1 = new Enum("Horizontal", 1);
        f3880b = r1;
        ?? r2 = new Enum("Both", 2);
        f3881c = r2;
        d = new Direction[]{r02, r1, r2};
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) d.clone();
    }
}
