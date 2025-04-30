package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f23002d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f23003f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z7.b f23004g;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23005c;

    static {
        a aVar = new a("CENTIMETERS", 0, "cm", "centimeters");
        f23002d = aVar;
        a[] aVarArr = {aVar, new a("METERS", 1, "m", "meters"), new a("MILLIMETERS", 2, "mm", "millimeters"), new a("INCHES", 3, "in", "inches"), new a("FEET", 4, "ft", "feet"), new a("YARDS", 5, "yd", "yards")};
        f23003f = aVarArr;
        f23004g = new z7.b(aVarArr);
    }

    public a(String str, int i9, String str2, String str3) {
        this.b = str2;
        this.f23005c = str3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f23003f.clone();
    }
}
