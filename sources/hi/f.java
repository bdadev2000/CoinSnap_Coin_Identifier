package hi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import wh.a0;

/* loaded from: classes5.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f19121f;
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f19122b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f19123c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f19124d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f19125e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f19121f = new e();
    }

    public f(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f19122b = declaredMethod;
        this.f19123c = sslSocketClass.getMethod("setHostname", String.class);
        this.f19124d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f19125e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // hi.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.a.isInstance(sslSocket);
    }

    @Override // hi.m
    public final boolean b() {
        return gi.c.f18489e.m();
    }

    @Override // hi.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f19124d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Charsets.UTF_8);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e10);
        }
    }

    @Override // hi.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f19122b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f19123c.invoke(sslSocket, str);
                }
                Method method = this.f19125e;
                gi.l lVar = gi.l.a;
                method.invoke(sslSocket, a0.k(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
