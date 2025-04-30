package P4;

import D0.l;
import G7.j;
import a.AbstractC0325a;
import androidx.recyclerview.widget.C0520c;
import com.mbridge.msdk.foundation.entity.o;
import com.vungle.ads.internal.ui.i;
import i8.A;
import i8.C;
import i8.C2365b;
import i8.G;
import i8.H;
import i8.I;
import i8.s;
import i8.t;
import i8.u;
import i8.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import m8.k;
import n8.d;
import n8.e;
import w8.g;
import w8.h;
import w8.x;
import w8.y;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f2415a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2416c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2417d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2418e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2419f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2420g;

    public a(z zVar, k kVar, h hVar, g gVar) {
        j.e(kVar, "connection");
        j.e(hVar, "source");
        j.e(gVar, "sink");
        this.b = zVar;
        this.f2416c = kVar;
        this.f2417d = hVar;
        this.f2418e = gVar;
        this.f2419f = new C0520c(hVar);
    }

    @Override // n8.d
    public long a(I i9) {
        if (!e.a(i9)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(I.b(i9, "Transfer-Encoding"))) {
            return -1L;
        }
        return j8.b.j(i9);
    }

    @Override // n8.d
    public y b(I i9) {
        if (!e.a(i9)) {
            return g(0L);
        }
        if ("chunked".equalsIgnoreCase(I.b(i9, "Transfer-Encoding"))) {
            u uVar = i9.b.f20754a;
            int i10 = this.f2415a;
            if (i10 == 4) {
                this.f2415a = 5;
                return new o8.c(this, uVar);
            }
            throw new IllegalStateException(j.j(Integer.valueOf(i10), "state: ").toString());
        }
        long j7 = j8.b.j(i9);
        if (j7 != -1) {
            return g(j7);
        }
        int i11 = this.f2415a;
        if (i11 == 4) {
            this.f2415a = 5;
            ((k) this.f2416c).k();
            return new o8.a(this);
        }
        throw new IllegalStateException(j.j(Integer.valueOf(i11), "state: ").toString());
    }

    @Override // n8.d
    public k c() {
        return (k) this.f2416c;
    }

    @Override // n8.d
    public void cancel() {
        Socket socket = ((k) this.f2416c).f21799c;
        if (socket != null) {
            j8.b.d(socket);
        }
    }

    @Override // n8.d
    public void d(C c9) {
        j.e(c9, i.REQUEST_KEY_EXTRA);
        Proxy.Type type = ((k) this.f2416c).b.b.type();
        j.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(c9.b);
        sb.append(' ');
        u uVar = c9.f20754a;
        if (!uVar.f20892j && type == Proxy.Type.HTTP) {
            sb.append(uVar);
        } else {
            String b = uVar.b();
            String d2 = uVar.d();
            if (d2 != null) {
                b = b + '?' + ((Object) d2);
            }
            sb.append(b);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        j.d(sb2, "StringBuilder().apply(builderAction).toString()");
        h(c9.f20755c, sb2);
    }

    @Override // n8.d
    public x e(C c9, long j7) {
        j.e(c9, i.REQUEST_KEY_EXTRA);
        G g9 = c9.f20756d;
        if (g9 != null && g9.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c9.f20755c.b("Transfer-Encoding"))) {
            int i9 = this.f2415a;
            if (i9 == 1) {
                this.f2415a = 2;
                return new o8.b(this);
            }
            throw new IllegalStateException(j.j(Integer.valueOf(i9), "state: ").toString());
        }
        if (j7 != -1) {
            int i10 = this.f2415a;
            if (i10 == 1) {
                this.f2415a = 2;
                return new o8.e(this);
            }
            throw new IllegalStateException(j.j(Integer.valueOf(i10), "state: ").toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public b f() {
        String str;
        if (this.f2415a == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f2419f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f2420g) == null) {
            str = o.j(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.b, this.f2415a, (String) this.f2416c, (String) this.f2417d, ((Long) this.f2419f).longValue(), ((Long) this.f2420g).longValue(), (String) this.f2418e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // n8.d
    public void finishRequest() {
        ((g) this.f2418e).flush();
    }

    @Override // n8.d
    public void flushRequest() {
        ((g) this.f2418e).flush();
    }

    public o8.d g(long j7) {
        int i9 = this.f2415a;
        if (i9 == 4) {
            this.f2415a = 5;
            return new o8.d(this, j7);
        }
        throw new IllegalStateException(j.j(Integer.valueOf(i9), "state: ").toString());
    }

    public void h(s sVar, String str) {
        j.e(sVar, "headers");
        j.e(str, "requestLine");
        int i9 = this.f2415a;
        if (i9 == 0) {
            g gVar = (g) this.f2418e;
            gVar.writeUtf8(str).writeUtf8("\r\n");
            int size = sVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                gVar.writeUtf8(sVar.c(i10)).writeUtf8(": ").writeUtf8(sVar.e(i10)).writeUtf8("\r\n");
            }
            gVar.writeUtf8("\r\n");
            this.f2415a = 1;
            return;
        }
        throw new IllegalStateException(j.j(Integer.valueOf(i9), "state: ").toString());
    }

    @Override // n8.d
    public H readResponseHeaders(boolean z8) {
        C0520c c0520c = (C0520c) this.f2419f;
        int i9 = this.f2415a;
        if (i9 != 1 && i9 != 3) {
            throw new IllegalStateException(j.j(Integer.valueOf(i9), "state: ").toString());
        }
        t tVar = null;
        try {
            String readUtf8LineStrict = ((h) c0520c.f4959c).readUtf8LineStrict(c0520c.b);
            c0520c.b -= readUtf8LineStrict.length();
            l l = AbstractC0325a.l(readUtf8LineStrict);
            int i10 = l.b;
            H h6 = new H();
            A a6 = (A) l.f626c;
            j.e(a6, "protocol");
            h6.b = a6;
            h6.f20765c = i10;
            String str = (String) l.f627d;
            j.e(str, "message");
            h6.f20766d = str;
            J1.k kVar = new J1.k(3);
            while (true) {
                String readUtf8LineStrict2 = ((h) c0520c.f4959c).readUtf8LineStrict(c0520c.b);
                c0520c.b -= readUtf8LineStrict2.length();
                if (readUtf8LineStrict2.length() == 0) {
                    break;
                }
                kVar.b(readUtf8LineStrict2);
            }
            h6.c(kVar.e());
            if (z8 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f2415a = 3;
            } else {
                this.f2415a = 4;
            }
            return h6;
        } catch (EOFException e4) {
            u uVar = ((k) this.f2416c).b.f20791a.f20805h;
            uVar.getClass();
            try {
                t tVar2 = new t();
                tVar2.d(uVar, "/...");
                tVar = tVar2;
            } catch (IllegalArgumentException unused) {
            }
            j.b(tVar);
            tVar.f20879f = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            tVar.f20880g = C2365b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException(j.j(tVar.a().f20891i, "unexpected end of stream on "), e4);
        }
    }
}
