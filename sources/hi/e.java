package hi;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import v1.b0;

/* loaded from: classes5.dex */
public final class e implements k, z1.i {

    /* renamed from: b, reason: collision with root package name */
    public final String f19120b;

    public e(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f19120b = query;
    }

    @Override // hi.k
    public boolean a(SSLSocket sslSocket) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, Intrinsics.stringPlus(this.f19120b, "."), false, 2, null);
        return startsWith$default;
    }

    @Override // hi.k
    public m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        e eVar = f.f19121f;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new f(cls2);
    }

    @Override // z1.i
    public String d() {
        return this.f19120b;
    }

    @Override // z1.i
    public void g(b0 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }

    public e() {
        this.f19120b = "com.google.android.gms.org.conscrypt";
    }
}
