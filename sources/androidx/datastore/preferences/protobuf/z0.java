package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f4611d;

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f4612f;

    /* renamed from: g, reason: collision with root package name */
    public static final x0 f4613g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z0[] f4614h;
    public final A0 b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4615c;

    /* JADX INFO: Fake field, exist only in values array */
    z0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    z0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    z0 EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.z0, androidx.datastore.preferences.protobuf.v0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.preferences.protobuf.z0, androidx.datastore.preferences.protobuf.x0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.preferences.protobuf.z0, androidx.datastore.preferences.protobuf.w0] */
    static {
        z0 z0Var = new z0("DOUBLE", 0, A0.DOUBLE, 1);
        z0 z0Var2 = new z0("FLOAT", 1, A0.FLOAT, 5);
        A0 a02 = A0.LONG;
        z0 z0Var3 = new z0("INT64", 2, a02, 0);
        z0 z0Var4 = new z0("UINT64", 3, a02, 0);
        A0 a03 = A0.INT;
        z0 z0Var5 = new z0("INT32", 4, a03, 0);
        z0 z0Var6 = new z0("FIXED64", 5, a02, 1);
        z0 z0Var7 = new z0("FIXED32", 6, a03, 5);
        z0 z0Var8 = new z0("BOOL", 7, A0.BOOLEAN, 0);
        ?? z0Var9 = new z0("STRING", 8, A0.STRING, 2);
        f4611d = z0Var9;
        A0 a04 = A0.MESSAGE;
        ?? z0Var10 = new z0("GROUP", 9, a04, 3);
        f4612f = z0Var10;
        ?? z0Var11 = new z0("MESSAGE", 10, a04, 2);
        f4613g = z0Var11;
        f4614h = new z0[]{z0Var, z0Var2, z0Var3, z0Var4, z0Var5, z0Var6, z0Var7, z0Var8, z0Var9, z0Var10, z0Var11, new z0("BYTES", 11, A0.BYTE_STRING, 2), new z0("UINT32", 12, a03, 0), new z0("ENUM", 13, A0.ENUM, 0), new z0("SFIXED32", 14, a03, 5), new z0("SFIXED64", 15, a02, 1), new z0("SINT32", 16, a03, 0), new z0("SINT64", 17, a02, 0)};
    }

    public z0(String str, int i9, A0 a02, int i10) {
        this.b = a02;
        this.f4615c = i10;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f4614h.clone();
    }
}
