package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Direction {

    /* renamed from: a, reason: collision with root package name */
    public static final Direction f7056a;

    /* renamed from: b, reason: collision with root package name */
    public static final Direction f7057b;

    /* renamed from: c, reason: collision with root package name */
    public static final Direction f7058c;
    public static final /* synthetic */ Direction[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.selection.Direction] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.selection.Direction] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.selection.Direction] */
    static {
        ?? r02 = new Enum("BEFORE", 0);
        f7056a = r02;
        ?? r1 = new Enum("ON", 1);
        f7057b = r1;
        ?? r2 = new Enum("AFTER", 2);
        f7058c = r2;
        d = new Direction[]{r02, r1, r2};
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) d.clone();
    }
}
