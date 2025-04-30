package J1;

import android.text.TextUtils;
import javax.net.ssl.SSLSocket;

/* renamed from: J1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208a implements j0.n, s8.k {
    public String b;

    @Override // s8.k
    public boolean a(SSLSocket sSLSocket) {
        return O7.o.C(sSLSocket.getClass().getName(), G7.j.j(".", this.b), false);
    }

    @Override // s8.k
    public s8.m c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(G7.j.j(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new s8.e(cls2);
    }

    @Override // j0.n
    public boolean d(CharSequence charSequence, int i9, int i10, j0.u uVar) {
        if (TextUtils.equals(charSequence.subSequence(i9, i10), this.b)) {
            uVar.f21005c = (uVar.f21005c & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // j0.n
    public Object b() {
        return this;
    }
}
