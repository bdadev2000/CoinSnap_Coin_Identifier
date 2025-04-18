package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class FieldOrder {

        /* renamed from: a, reason: collision with root package name */
        public static final FieldOrder f19432a;

        /* renamed from: b, reason: collision with root package name */
        public static final FieldOrder f19433b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ FieldOrder[] f19434c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.Writer$FieldOrder, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Writer$FieldOrder, java.lang.Enum] */
        static {
            ?? r02 = new java.lang.Enum("ASCENDING", 0);
            f19432a = r02;
            ?? r1 = new java.lang.Enum("DESCENDING", 1);
            f19433b = r1;
            f19434c = new FieldOrder[]{r02, r1};
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) f19434c.clone();
        }
    }

    void A(int i2, Object obj);

    void B(float f2, int i2);

    void C(int i2, long j2);

    void D(int i2, boolean z2);

    void E(int i2, int i3);

    void F(int i2);

    void G(int i2, List list, boolean z2);

    void H(int i2, List list, boolean z2);

    void I(int i2, List list, boolean z2);

    void J(int i2);

    void K(int i2, List list, boolean z2);

    void L(int i2, int i3);

    void M(int i2, List list, boolean z2);

    void N(int i2, List list, boolean z2);

    void O(int i2, int i3);

    void P(int i2, List list);

    void a(int i2, List list, boolean z2);

    void b(int i2, Object obj);

    void c(int i2, int i3);

    void d(int i2, List list);

    void e(int i2, List list, Schema schema);

    void f(int i2, String str);

    void g(int i2, long j2);

    void h(int i2, List list, boolean z2);

    void i(int i2, int i3);

    void j(double d, int i2);

    void k(int i2, ByteString byteString);

    void l(int i2, long j2);

    void m(int i2, List list, boolean z2);

    void n(int i2, List list, boolean z2);

    void o(int i2, List list, boolean z2);

    void p(int i2, Schema schema, Object obj);

    void q(int i2, long j2);

    void r(int i2, List list, boolean z2);

    void s(int i2, MapEntryLite.Metadata metadata, Map map);

    void t(int i2, Schema schema, Object obj);

    void u(int i2, int i3);

    void v(int i2, List list, boolean z2);

    void w(int i2, List list, boolean z2);

    void x(int i2, long j2);

    FieldOrder y();

    void z(int i2, List list, Schema schema);
}
