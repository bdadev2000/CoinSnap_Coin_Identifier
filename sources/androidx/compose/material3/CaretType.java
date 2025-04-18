package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ExperimentalMaterial3Api
/* loaded from: classes4.dex */
final class CaretType {

    /* renamed from: a, reason: collision with root package name */
    public static final CaretType f8181a;

    /* renamed from: b, reason: collision with root package name */
    public static final CaretType f8182b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CaretType[] f8183c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.CaretType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.CaretType] */
    static {
        ?? r02 = new Enum("Plain", 0);
        f8181a = r02;
        ?? r1 = new Enum("Rich", 1);
        f8182b = r1;
        f8183c = new CaretType[]{r02, r1};
    }

    public static CaretType valueOf(String str) {
        return (CaretType) Enum.valueOf(CaretType.class, str);
    }

    public static CaretType[] values() {
        return (CaretType[]) f8183c.clone();
    }
}
