package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface Reader {
    void A(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    void B(List list);

    long C();

    String D();

    int E();

    void F(List list);

    void G(List list);

    void H(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    boolean I();

    int J();

    void K(List list);

    void L(List list);

    long M();

    String N();

    Object a(Schema schema, ExtensionRegistryLite extensionRegistryLite);

    long b();

    void c(List list);

    void d(List list);

    boolean e();

    long f();

    void g(List list);

    int h();

    void i(List list);

    void j(List list);

    int k();

    int l();

    int m();

    void n(List list);

    void o(List list);

    ByteString p();

    int q();

    void r(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    double readDouble();

    float readFloat();

    void s(List list);

    Object t(Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void u(List list);

    long v();

    void w(List list);

    int x();

    void y(List list);

    void z(List list);
}
