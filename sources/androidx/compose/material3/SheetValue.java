package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class SheetValue {

    /* renamed from: a, reason: collision with root package name */
    public static final SheetValue f11206a;

    /* renamed from: b, reason: collision with root package name */
    public static final SheetValue f11207b;

    /* renamed from: c, reason: collision with root package name */
    public static final SheetValue f11208c;
    public static final /* synthetic */ SheetValue[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.SheetValue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.material3.SheetValue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.material3.SheetValue, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Hidden", 0);
        f11206a = r02;
        ?? r1 = new Enum("Expanded", 1);
        f11207b = r1;
        ?? r2 = new Enum("PartiallyExpanded", 2);
        f11208c = r2;
        d = new SheetValue[]{r02, r1, r2};
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) d.clone();
    }
}
