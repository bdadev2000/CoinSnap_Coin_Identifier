package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LayoutOrientation {

    /* renamed from: a, reason: collision with root package name */
    public static final LayoutOrientation f4037a;

    /* renamed from: b, reason: collision with root package name */
    public static final LayoutOrientation f4038b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LayoutOrientation[] f4039c;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.LayoutOrientation, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.layout.LayoutOrientation, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Horizontal", 0);
        f4037a = r02;
        ?? r1 = new Enum("Vertical", 1);
        f4038b = r1;
        f4039c = new LayoutOrientation[]{r02, r1};
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) f4039c.clone();
    }
}
