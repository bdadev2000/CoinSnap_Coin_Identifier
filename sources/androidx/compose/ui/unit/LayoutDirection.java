package androidx.compose.ui.unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LayoutDirection {

    /* renamed from: a, reason: collision with root package name */
    public static final LayoutDirection f17494a;

    /* renamed from: b, reason: collision with root package name */
    public static final LayoutDirection f17495b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LayoutDirection[] f17496c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.unit.LayoutDirection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.unit.LayoutDirection] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f17494a = r02;
        ?? r1 = new Enum("Rtl", 1);
        f17495b = r1;
        f17496c = new LayoutDirection[]{r02, r1};
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) f17496c.clone();
    }
}
