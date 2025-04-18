package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class j2 {

    /* renamed from: d, reason: collision with root package name */
    public static final f2 f1383d;

    /* renamed from: f, reason: collision with root package name */
    public static final g2 f1384f;

    /* renamed from: g, reason: collision with root package name */
    public static final h2 f1385g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j2[] f1386h;

    /* renamed from: b, reason: collision with root package name */
    public final k2 f1387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1388c;

    /* JADX INFO: Fake field, exist only in values array */
    j2 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    j2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    j2 EF2;

    static {
        j2 j2Var = new j2("DOUBLE", 0, k2.DOUBLE, 1);
        j2 j2Var2 = new j2("FLOAT", 1, k2.FLOAT, 5);
        k2 k2Var = k2.LONG;
        j2 j2Var3 = new j2("INT64", 2, k2Var, 0);
        j2 j2Var4 = new j2("UINT64", 3, k2Var, 0);
        k2 k2Var2 = k2.INT;
        j2 j2Var5 = new j2("INT32", 4, k2Var2, 0);
        j2 j2Var6 = new j2("FIXED64", 5, k2Var, 1);
        j2 j2Var7 = new j2("FIXED32", 6, k2Var2, 5);
        j2 j2Var8 = new j2("BOOL", 7, k2.BOOLEAN, 0);
        f2 f2Var = new f2();
        f1383d = f2Var;
        k2 k2Var3 = k2.MESSAGE;
        g2 g2Var = new g2(k2Var3);
        f1384f = g2Var;
        h2 h2Var = new h2(k2Var3);
        f1385g = h2Var;
        final k2 k2Var4 = k2.BYTE_STRING;
        f1386h = new j2[]{j2Var, j2Var2, j2Var3, j2Var4, j2Var5, j2Var6, j2Var7, j2Var8, f2Var, g2Var, h2Var, new j2(k2Var4) { // from class: androidx.datastore.preferences.protobuf.i2
        }, new j2("UINT32", 12, k2Var2, 0), new j2("ENUM", 13, k2.ENUM, 0), new j2("SFIXED32", 14, k2Var2, 5), new j2("SFIXED64", 15, k2Var, 1), new j2("SINT32", 16, k2Var2, 0), new j2("SINT64", 17, k2Var, 0)};
    }

    public j2(String str, int i10, k2 k2Var, int i11) {
        this.f1387b = k2Var;
        this.f1388c = i11;
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) f1386h.clone();
    }
}
