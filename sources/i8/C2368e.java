package i8;

import a.AbstractC0325a;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u7.C2824o;
import y2.AbstractC2947c;

/* renamed from: i8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2368e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f20814k;
    public static final String l;

    /* renamed from: a, reason: collision with root package name */
    public final u f20815a;
    public final s b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20816c;

    /* renamed from: d, reason: collision with root package name */
    public final A f20817d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20818e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20819f;

    /* renamed from: g, reason: collision with root package name */
    public final s f20820g;

    /* renamed from: h, reason: collision with root package name */
    public final r f20821h;

    /* renamed from: i, reason: collision with root package name */
    public final long f20822i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20823j;

    static {
        r8.m mVar = r8.m.f22950a;
        r8.m.f22950a.getClass();
        f20814k = G7.j.j("-Sent-Millis", "OkHttp");
        r8.m.f22950a.getClass();
        l = G7.j.j("-Received-Millis", "OkHttp");
    }

    public C2368e(w8.y yVar) {
        u uVar;
        O o3;
        G7.j.e(yVar, "rawSource");
        try {
            w8.t f9 = r8.k.f(yVar);
            String readUtf8LineStrict = f9.readUtf8LineStrict(Long.MAX_VALUE);
            try {
                t tVar = new t();
                tVar.d(null, readUtf8LineStrict);
                uVar = tVar.a();
            } catch (IllegalArgumentException unused) {
                uVar = null;
            }
            if (uVar != null) {
                this.f20815a = uVar;
                this.f20816c = f9.readUtf8LineStrict(Long.MAX_VALUE);
                J1.k kVar = new J1.k(3);
                int p2 = com.facebook.appevents.i.p(f9);
                int i9 = 0;
                while (i9 < p2) {
                    i9++;
                    kVar.b(f9.readUtf8LineStrict(Long.MAX_VALUE));
                }
                this.b = kVar.e();
                D0.l l2 = AbstractC0325a.l(f9.readUtf8LineStrict(Long.MAX_VALUE));
                this.f20817d = (A) l2.f626c;
                this.f20818e = l2.b;
                this.f20819f = (String) l2.f627d;
                J1.k kVar2 = new J1.k(3);
                int p7 = com.facebook.appevents.i.p(f9);
                int i10 = 0;
                while (i10 < p7) {
                    i10++;
                    kVar2.b(f9.readUtf8LineStrict(Long.MAX_VALUE));
                }
                String str = f20814k;
                String f10 = kVar2.f(str);
                String str2 = l;
                String f11 = kVar2.f(str2);
                kVar2.h(str);
                kVar2.h(str2);
                long j7 = 0;
                this.f20822i = f10 == null ? 0L : Long.parseLong(f10);
                if (f11 != null) {
                    j7 = Long.parseLong(f11);
                }
                this.f20823j = j7;
                this.f20820g = kVar2.e();
                if (G7.j.a(this.f20815a.f20884a, Constants.SCHEME)) {
                    String readUtf8LineStrict2 = f9.readUtf8LineStrict(Long.MAX_VALUE);
                    if (readUtf8LineStrict2.length() <= 0) {
                        C2377n c9 = C2377n.b.c(f9.readUtf8LineStrict(Long.MAX_VALUE));
                        List a6 = a(f9);
                        List a9 = a(f9);
                        if (!f9.exhausted()) {
                            o3 = AbstractC2947c.j(f9.readUtf8LineStrict(Long.MAX_VALUE));
                        } else {
                            o3 = O.SSL_3_0;
                        }
                        this.f20821h = new r(o3, c9, j8.b.w(a9), new q(j8.b.w(a6), 0));
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict2 + '\"');
                    }
                } else {
                    this.f20821h = null;
                }
                android.support.v4.media.session.a.f(yVar, null);
                return;
            }
            IOException iOException = new IOException(G7.j.j(readUtf8LineStrict, "Cache corruption for "));
            r8.m mVar = r8.m.f22950a;
            r8.m.f22950a.getClass();
            r8.m.i(5, "cache corruption", iOException);
            throw iOException;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                android.support.v4.media.session.a.f(yVar, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, w8.h, w8.f] */
    public static List a(w8.t tVar) {
        int p2 = com.facebook.appevents.i.p(tVar);
        if (p2 == -1) {
            return C2824o.b;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(p2);
            int i9 = 0;
            while (i9 < p2) {
                i9++;
                String readUtf8LineStrict = tVar.readUtf8LineStrict(Long.MAX_VALUE);
                ?? obj = new Object();
                w8.i iVar = w8.i.f24015f;
                w8.i a6 = r6.b.a(readUtf8LineStrict);
                G7.j.b(a6);
                obj.l(a6);
                arrayList.add(certificateFactory.generateCertificate(new w8.e(obj, 0)));
            }
            return arrayList;
        } catch (CertificateException e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public static void b(w8.s sVar, List list) {
        try {
            sVar.writeDecimalLong(list.size());
            sVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                w8.i iVar = w8.i.f24015f;
                G7.j.d(encoded, "bytes");
                sVar.writeUtf8(r6.b.e(encoded).a());
                sVar.writeByte(10);
            }
        } catch (CertificateEncodingException e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public final void c(H0.b bVar) {
        u uVar = this.f20815a;
        r rVar = this.f20821h;
        s sVar = this.f20820g;
        s sVar2 = this.b;
        w8.s e4 = r8.k.e(bVar.g(0));
        try {
            e4.writeUtf8(uVar.f20891i);
            e4.writeByte(10);
            e4.writeUtf8(this.f20816c);
            e4.writeByte(10);
            e4.writeDecimalLong(sVar2.size());
            e4.writeByte(10);
            int size = sVar2.size();
            int i9 = 0;
            while (i9 < size) {
                int i10 = i9 + 1;
                e4.writeUtf8(sVar2.c(i9));
                e4.writeUtf8(": ");
                e4.writeUtf8(sVar2.e(i9));
                e4.writeByte(10);
                i9 = i10;
            }
            A a6 = this.f20817d;
            int i11 = this.f20818e;
            String str = this.f20819f;
            G7.j.e(a6, "protocol");
            G7.j.e(str, "message");
            StringBuilder sb = new StringBuilder();
            if (a6 == A.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i11);
            sb.append(' ');
            sb.append(str);
            String sb2 = sb.toString();
            G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
            e4.writeUtf8(sb2);
            e4.writeByte(10);
            e4.writeDecimalLong(sVar.size() + 2);
            e4.writeByte(10);
            int size2 = sVar.size();
            for (int i12 = 0; i12 < size2; i12++) {
                e4.writeUtf8(sVar.c(i12));
                e4.writeUtf8(": ");
                e4.writeUtf8(sVar.e(i12));
                e4.writeByte(10);
            }
            e4.writeUtf8(f20814k);
            e4.writeUtf8(": ");
            e4.writeDecimalLong(this.f20822i);
            e4.writeByte(10);
            e4.writeUtf8(l);
            e4.writeUtf8(": ");
            e4.writeDecimalLong(this.f20823j);
            e4.writeByte(10);
            if (G7.j.a(uVar.f20884a, Constants.SCHEME)) {
                e4.writeByte(10);
                G7.j.b(rVar);
                e4.writeUtf8(rVar.b.f20855a);
                e4.writeByte(10);
                b(e4, rVar.a());
                b(e4, rVar.f20873c);
                e4.writeUtf8(rVar.f20872a.b);
                e4.writeByte(10);
            }
            android.support.v4.media.session.a.f(e4, null);
        } finally {
        }
    }

    public C2368e(I i9) {
        s e4;
        C c9 = i9.b;
        this.f20815a = c9.f20754a;
        I i10 = i9.f20780j;
        G7.j.b(i10);
        s sVar = i10.b.f20755c;
        s sVar2 = i9.f20778h;
        Set r9 = com.facebook.appevents.i.r(sVar2);
        if (r9.isEmpty()) {
            e4 = j8.b.b;
        } else {
            J1.k kVar = new J1.k(3);
            int size = sVar.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String c10 = sVar.c(i11);
                if (r9.contains(c10)) {
                    kVar.a(c10, sVar.e(i11));
                }
                i11 = i12;
            }
            e4 = kVar.e();
        }
        this.b = e4;
        this.f20816c = c9.b;
        this.f20817d = i9.f20774c;
        this.f20818e = i9.f20776f;
        this.f20819f = i9.f20775d;
        this.f20820g = sVar2;
        this.f20821h = i9.f20777g;
        this.f20822i = i9.m;
        this.f20823j = i9.f20782n;
    }
}
