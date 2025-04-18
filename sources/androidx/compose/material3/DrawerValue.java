package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DrawerValue {

    /* renamed from: a, reason: collision with root package name */
    public static final DrawerValue f9261a;

    /* renamed from: b, reason: collision with root package name */
    public static final DrawerValue f9262b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DrawerValue[] f9263c;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.DrawerValue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.material3.DrawerValue, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Closed", 0);
        f9261a = r02;
        ?? r1 = new Enum("Open", 1);
        f9262b = r1;
        f9263c = new DrawerValue[]{r02, r1};
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) f9263c.clone();
    }
}
