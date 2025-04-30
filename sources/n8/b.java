package n8;

import G7.j;
import J1.B;
import Q7.n0;
import androidx.core.app.NotificationCompat;
import i8.C;
import i8.C2365b;
import i8.G;
import i8.H;
import i8.I;
import i8.K;
import i8.M;
import i8.v;
import i8.w;
import java.io.IOException;
import java.net.ProtocolException;
import m8.i;
import m8.k;
import w8.s;

/* loaded from: classes3.dex */
public final class b implements w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21860a;

    public b(boolean z8) {
        this.f21860a = z8;
    }

    @Override // i8.w
    public final I intercept(v vVar) {
        H h6;
        I a6;
        long contentLength;
        boolean z8;
        f fVar = (f) vVar;
        B b = fVar.f21865d;
        j.b(b);
        d dVar = (d) b.f1490e;
        C2365b c2365b = (C2365b) b.f1488c;
        i iVar = (i) b.b;
        C c9 = fVar.f21866e;
        G g9 = c9.f20756d;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            c2365b.getClass();
            j.e(iVar, NotificationCompat.CATEGORY_CALL);
            dVar.d(c9);
            boolean u8 = R2.b.u(c9.b);
            Long l = null;
            boolean z9 = true;
            k kVar = (k) b.f1491f;
            if (u8 && g9 != null) {
                if ("100-continue".equalsIgnoreCase(c9.f20755c.b("Expect"))) {
                    try {
                        dVar.flushRequest();
                        h6 = b.e(true);
                        c2365b.getClass();
                        j.e(iVar, NotificationCompat.CATEGORY_CALL);
                        z8 = false;
                    } catch (IOException e4) {
                        c2365b.getClass();
                        j.e(iVar, NotificationCompat.CATEGORY_CALL);
                        b.f(e4);
                        throw e4;
                    }
                } else {
                    h6 = null;
                    z8 = true;
                }
                if (h6 == null) {
                    if (g9.isDuplex()) {
                        try {
                            dVar.flushRequest();
                            g9.writeTo(r8.k.e(b.b(c9, true)));
                        } catch (IOException e9) {
                            c2365b.getClass();
                            j.e(iVar, NotificationCompat.CATEGORY_CALL);
                            b.f(e9);
                            throw e9;
                        }
                    } else {
                        s e10 = r8.k.e(b.b(c9, false));
                        g9.writeTo(e10);
                        e10.close();
                    }
                } else {
                    iVar.g(b, true, false, null);
                    if (kVar.f21803g == null) {
                        dVar.c().k();
                    }
                }
                z9 = z8;
            } else {
                iVar.g(b, true, false, null);
                h6 = null;
            }
            if (g9 == null || !g9.isDuplex()) {
                try {
                    dVar.finishRequest();
                } catch (IOException e11) {
                    b.f(e11);
                    throw e11;
                }
            }
            if (h6 == null) {
                h6 = b.e(false);
                j.b(h6);
                if (z9) {
                    c2365b.getClass();
                    j.e(iVar, NotificationCompat.CATEGORY_CALL);
                    z9 = false;
                }
            }
            h6.f20764a = c9;
            h6.f20767e = kVar.f21801e;
            h6.f20773k = currentTimeMillis;
            h6.l = System.currentTimeMillis();
            I a9 = h6.a();
            int i9 = a9.f20776f;
            if (i9 == 100) {
                H e12 = b.e(false);
                j.b(e12);
                if (z9) {
                    c2365b.getClass();
                    j.e(iVar, NotificationCompat.CATEGORY_CALL);
                }
                e12.f20764a = c9;
                e12.f20767e = kVar.f21801e;
                e12.f20773k = currentTimeMillis;
                e12.l = System.currentTimeMillis();
                a9 = e12.a();
                i9 = a9.f20776f;
            }
            if (this.f21860a && i9 == 101) {
                H h9 = a9.h();
                h9.f20769g = j8.b.f21215c;
                a6 = h9.a();
            } else {
                H h10 = a9.h();
                try {
                    String b8 = I.b(a9, "Content-Type");
                    long a10 = dVar.a(a9);
                    h10.f20769g = new K(b8, a10, r8.k.f(new m8.d(b, dVar.b(a9), a10)), 1);
                    a6 = h10.a();
                } catch (IOException e13) {
                    b.f(e13);
                    throw e13;
                }
            }
            if ("close".equalsIgnoreCase(a6.b.f20755c.b("Connection")) || "close".equalsIgnoreCase(I.b(a6, "Connection"))) {
                dVar.c().k();
            }
            if (i9 == 204 || i9 == 205) {
                M m = a6.f20779i;
                if (m == null) {
                    contentLength = -1;
                } else {
                    contentLength = m.contentLength();
                }
                if (contentLength > 0) {
                    StringBuilder p2 = n0.p(i9, "HTTP ", " had non-zero Content-Length: ");
                    if (m != null) {
                        l = Long.valueOf(m.contentLength());
                    }
                    p2.append(l);
                    throw new ProtocolException(p2.toString());
                }
            }
            return a6;
        } catch (IOException e14) {
            c2365b.getClass();
            j.e(iVar, NotificationCompat.CATEGORY_CALL);
            b.f(e14);
            throw e14;
        }
    }
}
