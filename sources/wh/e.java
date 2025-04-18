package wh;

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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f27042k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f27043l;
    public final d0 a;

    /* renamed from: b, reason: collision with root package name */
    public final z f27044b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27045c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f27046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27047e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27048f;

    /* renamed from: g, reason: collision with root package name */
    public final z f27049g;

    /* renamed from: h, reason: collision with root package name */
    public final y f27050h;

    /* renamed from: i, reason: collision with root package name */
    public final long f27051i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27052j;

    static {
        gi.l lVar = gi.l.a;
        gi.l.a.getClass();
        f27042k = Intrinsics.stringPlus("OkHttp", "-Sent-Millis");
        gi.l.a.getClass();
        f27043l = Intrinsics.stringPlus("OkHttp", "-Received-Millis");
    }

    public e(ki.k0 rawSource) {
        d0 d0Var;
        a1 tlsVersion;
        Intrinsics.checkNotNullParameter(rawSource, "rawSource");
        try {
            ki.e0 f10 = a6.k.f(rawSource);
            String readUtf8LineStrict = f10.readUtf8LineStrict();
            char[] cArr = d0.f27032k;
            Intrinsics.checkNotNullParameter(readUtf8LineStrict, "<this>");
            try {
                d0Var = c0.i(readUtf8LineStrict);
            } catch (IllegalArgumentException unused) {
                d0Var = null;
            }
            if (d0Var != null) {
                this.a = d0Var;
                this.f27045c = f10.readUtf8LineStrict();
                a4.s sVar = new a4.s();
                int q10 = qc.s0.q(f10);
                int i10 = 0;
                int i11 = 0;
                while (i11 < q10) {
                    i11++;
                    sVar.b(f10.readUtf8LineStrict());
                }
                this.f27044b = sVar.d();
                ci.h D = a0.D(f10.readUtf8LineStrict());
                this.f27046d = D.a;
                this.f27047e = D.f2810b;
                this.f27048f = D.f2811c;
                a4.s sVar2 = new a4.s();
                int q11 = qc.s0.q(f10);
                int i12 = 0;
                while (i12 < q11) {
                    i12++;
                    sVar2.b(f10.readUtf8LineStrict());
                }
                String str = f27042k;
                String e2 = sVar2.e(str);
                String str2 = f27043l;
                String e10 = sVar2.e(str2);
                sVar2.f(str);
                sVar2.f(str2);
                long j3 = 0;
                this.f27051i = e2 == null ? 0L : Long.parseLong(e2);
                if (e10 != null) {
                    j3 = Long.parseLong(e10);
                }
                this.f27052j = j3;
                this.f27049g = sVar2.d();
                if (Intrinsics.areEqual(this.a.a, Constants.SCHEME)) {
                    String readUtf8LineStrict2 = f10.readUtf8LineStrict();
                    if (!(readUtf8LineStrict2.length() > 0)) {
                        p cipherSuite = p.f27156b.j(f10.readUtf8LineStrict());
                        List peerCertificates = a(f10);
                        List localCertificates = a(f10);
                        if (!f10.exhausted()) {
                            tlsVersion = c0.g(f10.readUtf8LineStrict());
                        } else {
                            tlsVersion = a1.SSL_3_0;
                        }
                        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
                        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
                        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
                        this.f27050h = new y(tlsVersion, cipherSuite, xh.b.x(localCertificates), new x(xh.b.x(peerCertificates), i10));
                    } else {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict2 + '\"');
                    }
                } else {
                    this.f27050h = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rawSource, null);
                return;
            }
            IOException iOException = new IOException(Intrinsics.stringPlus("Cache corruption for ", readUtf8LineStrict));
            gi.l lVar = gi.l.a;
            gi.l.a.getClass();
            gi.l.i(5, "cache corruption", iOException);
            throw iOException;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(rawSource, th2);
                throw th3;
            }
        }
    }

    public static List a(ki.e0 e0Var) {
        int q10 = qc.s0.q(e0Var);
        if (q10 == -1) {
            return CollectionsKt.emptyList();
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(q10);
            int i10 = 0;
            while (i10 < q10) {
                i10++;
                String readUtf8LineStrict = e0Var.readUtf8LineStrict();
                ki.i iVar = new ki.i();
                ki.l lVar = ki.l.f20996f;
                ki.l m10 = a0.m(readUtf8LineStrict);
                Intrinsics.checkNotNull(m10);
                iVar.v(m10);
                arrayList.add(certificateFactory.generateCertificate(iVar.inputStream()));
            }
            return arrayList;
        } catch (CertificateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static void b(ki.d0 d0Var, List list) {
        try {
            d0Var.writeDecimalLong(list.size());
            d0Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((Certificate) it.next()).getEncoded();
                ki.l lVar = ki.l.f20996f;
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                d0Var.writeUtf8(a0.C(bytes).a());
                d0Var.writeByte(10);
            }
        } catch (CertificateEncodingException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final void c(h3.a editor) {
        d0 d0Var = this.a;
        y yVar = this.f27050h;
        z zVar = this.f27049g;
        z zVar2 = this.f27044b;
        Intrinsics.checkNotNullParameter(editor, "editor");
        ki.d0 e2 = a6.k.e(editor.k(0));
        try {
            e2.writeUtf8(d0Var.f27040i);
            e2.writeByte(10);
            e2.writeUtf8(this.f27045c);
            e2.writeByte(10);
            e2.writeDecimalLong(zVar2.f27243b.length / 2);
            e2.writeByte(10);
            int length = zVar2.f27243b.length / 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                e2.writeUtf8(zVar2.b(i10));
                e2.writeUtf8(": ");
                e2.writeUtf8(zVar2.d(i10));
                e2.writeByte(10);
                i10 = i11;
            }
            e2.writeUtf8(new ci.h(this.f27046d, this.f27047e, this.f27048f).toString());
            e2.writeByte(10);
            e2.writeDecimalLong((zVar.f27243b.length / 2) + 2);
            e2.writeByte(10);
            int length2 = zVar.f27243b.length / 2;
            for (int i12 = 0; i12 < length2; i12++) {
                e2.writeUtf8(zVar.b(i12));
                e2.writeUtf8(": ");
                e2.writeUtf8(zVar.d(i12));
                e2.writeByte(10);
            }
            e2.writeUtf8(f27042k);
            e2.writeUtf8(": ");
            e2.writeDecimalLong(this.f27051i);
            e2.writeByte(10);
            e2.writeUtf8(f27043l);
            e2.writeUtf8(": ");
            e2.writeDecimalLong(this.f27052j);
            e2.writeByte(10);
            if (Intrinsics.areEqual(d0Var.a, Constants.SCHEME)) {
                e2.writeByte(10);
                Intrinsics.checkNotNull(yVar);
                e2.writeUtf8(yVar.f27240b.a);
                e2.writeByte(10);
                b(e2, yVar.a());
                b(e2, yVar.f27241c);
                e2.writeUtf8(yVar.a.f27018b);
                e2.writeByte(10);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(e2, null);
        } finally {
        }
    }

    public e(u0 response) {
        z d10;
        Intrinsics.checkNotNullParameter(response, "response");
        o0 o0Var = response.f27213b;
        this.a = o0Var.a;
        Intrinsics.checkNotNullParameter(response, "<this>");
        u0 u0Var = response.f27220j;
        Intrinsics.checkNotNull(u0Var);
        z zVar = u0Var.f27213b.f27152c;
        z zVar2 = response.f27218h;
        Set r6 = qc.s0.r(zVar2);
        if (r6.isEmpty()) {
            d10 = xh.b.f27677b;
        } else {
            a4.s sVar = new a4.s();
            int length = zVar.f27243b.length / 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                String b3 = zVar.b(i10);
                if (r6.contains(b3)) {
                    sVar.a(b3, zVar.d(i10));
                }
                i10 = i11;
            }
            d10 = sVar.d();
        }
        this.f27044b = d10;
        this.f27045c = o0Var.f27151b;
        this.f27046d = response.f27214c;
        this.f27047e = response.f27216f;
        this.f27048f = response.f27215d;
        this.f27049g = zVar2;
        this.f27050h = response.f27217g;
        this.f27051i = response.f27223m;
        this.f27052j = response.f27224n;
    }
}
