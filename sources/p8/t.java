package p8;

import a.AbstractC0325a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;
import i8.H;
import i8.I;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class t implements n8.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f22469g = j8.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final List f22470h = j8.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final m8.k f22471a;
    public final n8.f b;

    /* renamed from: c, reason: collision with root package name */
    public final s f22472c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f22473d;

    /* renamed from: e, reason: collision with root package name */
    public final i8.A f22474e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f22475f;

    public t(i8.z zVar, m8.k kVar, n8.f fVar, s sVar) {
        G7.j.e(zVar, "client");
        G7.j.e(kVar, "connection");
        G7.j.e(sVar, "http2Connection");
        this.f22471a = kVar;
        this.b = fVar;
        this.f22472c = sVar;
        i8.A a6 = i8.A.H2_PRIOR_KNOWLEDGE;
        this.f22474e = zVar.f20935u.contains(a6) ? a6 : i8.A.HTTP_2;
    }

    @Override // n8.d
    public final long a(I i9) {
        if (!n8.e.a(i9)) {
            return 0L;
        }
        return j8.b.j(i9);
    }

    @Override // n8.d
    public final w8.y b(I i9) {
        z zVar = this.f22473d;
        G7.j.b(zVar);
        return zVar.f22500i;
    }

    @Override // n8.d
    public final m8.k c() {
        return this.f22471a;
    }

    @Override // n8.d
    public final void cancel() {
        this.f22475f = true;
        z zVar = this.f22473d;
        if (zVar != null) {
            zVar.e(EnumC2574b.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0114 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #1 {all -> 0x00de, blocks: (B:33:0x00d1, B:35:0x00d8, B:36:0x00e1, B:38:0x00e5, B:40:0x00fa, B:42:0x0102, B:46:0x010e, B:48:0x0114, B:79:0x01a0, B:80:0x01a5), top: B:32:0x00d1, outer: #2 }] */
    @Override // n8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(i8.C r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.t.d(i8.C):void");
    }

    @Override // n8.d
    public final w8.x e(i8.C c9, long j7) {
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        z zVar = this.f22473d;
        G7.j.b(zVar);
        return zVar.f();
    }

    @Override // n8.d
    public final void finishRequest() {
        z zVar = this.f22473d;
        G7.j.b(zVar);
        zVar.f().close();
    }

    @Override // n8.d
    public final void flushRequest() {
        this.f22472c.flush();
    }

    @Override // n8.d
    public final H readResponseHeaders(boolean z8) {
        i8.s sVar;
        z zVar = this.f22473d;
        G7.j.b(zVar);
        synchronized (zVar) {
            zVar.f22502k.h();
            while (zVar.f22498g.isEmpty() && zVar.m == null) {
                try {
                    zVar.k();
                } catch (Throwable th) {
                    zVar.f22502k.l();
                    throw th;
                }
            }
            zVar.f22502k.l();
            if (!zVar.f22498g.isEmpty()) {
                Object removeFirst = zVar.f22498g.removeFirst();
                G7.j.d(removeFirst, "headersQueue.removeFirst()");
                sVar = (i8.s) removeFirst;
            } else {
                IOException iOException = zVar.f22503n;
                if (iOException == null) {
                    EnumC2574b enumC2574b = zVar.m;
                    G7.j.b(enumC2574b);
                    throw new E(enumC2574b);
                }
                throw iOException;
            }
        }
        i8.A a6 = this.f22474e;
        G7.j.e(a6, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = sVar.size();
        D0.l lVar = null;
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            String c9 = sVar.c(i9);
            String e4 = sVar.e(i9);
            if (G7.j.a(c9, Header.RESPONSE_STATUS_UTF8)) {
                lVar = AbstractC0325a.l(G7.j.j(e4, "HTTP/1.1 "));
            } else if (!f22470h.contains(c9)) {
                G7.j.e(c9, "name");
                G7.j.e(e4, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                arrayList.add(c9);
                arrayList.add(O7.g.a0(e4).toString());
            }
            i9 = i10;
        }
        if (lVar != null) {
            H h6 = new H();
            h6.b = a6;
            h6.f20765c = lVar.b;
            String str = (String) lVar.f627d;
            G7.j.e(str, "message");
            h6.f20766d = str;
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                h6.c(new i8.s((String[]) array));
                if (z8 && h6.f20765c == 100) {
                    return null;
                }
                return h6;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new ProtocolException("Expected ':status' header not present");
    }
}
