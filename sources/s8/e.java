package s8;

import J1.C0208a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import q4.C2643b;

/* loaded from: classes3.dex */
public class e implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final C0208a f22990f;

    /* renamed from: a, reason: collision with root package name */
    public final Class f22991a;
    public final Method b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f22992c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22993d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22994e;

    /* JADX WARN: Type inference failed for: r0v0, types: [J1.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.b = "com.google.android.gms.org.conscrypt";
        f22990f = obj;
    }

    public e(Class cls) {
        this.f22991a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        G7.j.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = declaredMethod;
        this.f22992c = cls.getMethod("setHostname", String.class);
        this.f22993d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f22994e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // s8.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f22991a.isInstance(sSLSocket);
    }

    @Override // s8.m
    public final boolean b() {
        boolean z8 = r8.c.f22931e;
        return r8.c.f22931e;
    }

    @Override // s8.m
    public final String c(SSLSocket sSLSocket) {
        if (!this.f22991a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f22993d.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, O7.a.f2244a);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if ((cause instanceof NullPointerException) && G7.j.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e9);
        }
    }

    @Override // s8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        if (this.f22991a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f22992c.invoke(sSLSocket, str);
                }
                Method method = this.f22994e;
                r8.m mVar = r8.m.f22950a;
                method.invoke(sSLSocket, C2643b.e(list));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }
}
