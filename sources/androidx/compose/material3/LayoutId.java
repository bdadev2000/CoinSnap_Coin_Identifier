package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class LayoutId {

    /* renamed from: a, reason: collision with root package name */
    public static final LayoutId f9653a;

    /* renamed from: b, reason: collision with root package name */
    public static final LayoutId f9654b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LayoutId[] f9655c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.LayoutId] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.LayoutId] */
    static {
        ?? r02 = new Enum("Selector", 0);
        f9653a = r02;
        ?? r1 = new Enum("InnerCircle", 1);
        f9654b = r1;
        f9655c = new LayoutId[]{r02, r1};
    }

    public static LayoutId valueOf(String str) {
        return (LayoutId) Enum.valueOf(LayoutId.class, str);
    }

    public static LayoutId[] values() {
        return (LayoutId[]) f9655c.clone();
    }
}
