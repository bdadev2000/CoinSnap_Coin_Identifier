package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class I {
    public static final I b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ I[] f4936c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.recyclerview.widget.I] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.recyclerview.widget.I] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.recyclerview.widget.I] */
    static {
        ?? r02 = new Enum("ALLOW", 0);
        b = r02;
        f4936c = new I[]{r02, new Enum("PREVENT_WHEN_EMPTY", 1), new Enum("PREVENT", 2)};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f4936c.clone();
    }
}
