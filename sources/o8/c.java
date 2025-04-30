package o8;

import G7.j;
import O7.g;
import O7.o;
import androidx.recyclerview.widget.C0520c;
import i8.s;
import i8.u;
import i8.z;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m8.k;
import w8.h;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: f, reason: collision with root package name */
    public final u f22013f;

    /* renamed from: g, reason: collision with root package name */
    public long f22014g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22015h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P4.a f22016i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(P4.a aVar, u uVar) {
        super(aVar);
        j.e(aVar, "this$0");
        j.e(uVar, "url");
        this.f22016i = aVar;
        this.f22013f = uVar;
        this.f22014g = -1L;
        this.f22015h = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22009c) {
            return;
        }
        if (this.f22015h && !j8.b.g(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f22016i.f2416c).k();
            a();
        }
        this.f22009c = true;
    }

    @Override // o8.a, w8.y
    public final long read(w8.f fVar, long j7) {
        j.e(fVar, "sink");
        if (j7 >= 0) {
            if (!this.f22009c) {
                if (!this.f22015h) {
                    return -1L;
                }
                long j9 = this.f22014g;
                P4.a aVar = this.f22016i;
                if (j9 == 0 || j9 == -1) {
                    if (j9 != -1) {
                        ((h) aVar.f2417d).readUtf8LineStrict();
                    }
                    try {
                        this.f22014g = ((h) aVar.f2417d).readHexadecimalUnsignedLong();
                        String obj = g.a0(((h) aVar.f2417d).readUtf8LineStrict()).toString();
                        if (this.f22014g >= 0 && (obj.length() <= 0 || o.C(obj, ";", false))) {
                            if (this.f22014g == 0) {
                                this.f22015h = false;
                                C0520c c0520c = (C0520c) aVar.f2419f;
                                c0520c.getClass();
                                J1.k kVar = new J1.k(3);
                                while (true) {
                                    String readUtf8LineStrict = ((h) c0520c.f4959c).readUtf8LineStrict(c0520c.b);
                                    c0520c.b -= readUtf8LineStrict.length();
                                    if (readUtf8LineStrict.length() == 0) {
                                        break;
                                    }
                                    kVar.b(readUtf8LineStrict);
                                }
                                aVar.f2420g = kVar.e();
                                z zVar = (z) aVar.b;
                                j.b(zVar);
                                s sVar = (s) aVar.f2420g;
                                j.b(sVar);
                                n8.e.b(zVar.l, this.f22013f, sVar);
                                a();
                            }
                            if (!this.f22015h) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f22014g + obj + '\"');
                        }
                    } catch (NumberFormatException e4) {
                        throw new ProtocolException(e4.getMessage());
                    }
                }
                long read = super.read(fVar, Math.min(j7, this.f22014g));
                if (read != -1) {
                    this.f22014g -= read;
                    return read;
                }
                ((k) aVar.f2416c).k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }
}
