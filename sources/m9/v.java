package m9;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v implements l {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21767b;

    /* renamed from: c, reason: collision with root package name */
    public final l f21768c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f21769d;

    /* renamed from: e, reason: collision with root package name */
    public c f21770e;

    /* renamed from: f, reason: collision with root package name */
    public h f21771f;

    /* renamed from: g, reason: collision with root package name */
    public l f21772g;

    /* renamed from: h, reason: collision with root package name */
    public y0 f21773h;

    /* renamed from: i, reason: collision with root package name */
    public j f21774i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f21775j;

    /* renamed from: k, reason: collision with root package name */
    public l f21776k;

    public v(Context context, l lVar) {
        this.a = context.getApplicationContext();
        lVar.getClass();
        this.f21768c = lVar;
        this.f21767b = new ArrayList();
    }

    public static void e(l lVar, w0 w0Var) {
        if (lVar != null) {
            lVar.c(w0Var);
        }
    }

    @Override // m9.l
    public final long a(p pVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f21776k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.m(z10);
        String scheme = pVar.a.getScheme();
        int i10 = n9.h0.a;
        Uri uri = pVar.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z11 = false;
        }
        Context context = this.a;
        if (z11) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f21770e == null) {
                    c cVar = new c(context);
                    this.f21770e = cVar;
                    d(cVar);
                }
                this.f21776k = this.f21770e;
            } else {
                if (this.f21769d == null) {
                    b0 b0Var = new b0();
                    this.f21769d = b0Var;
                    d(b0Var);
                }
                this.f21776k = this.f21769d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f21770e == null) {
                c cVar2 = new c(context);
                this.f21770e = cVar2;
                d(cVar2);
            }
            this.f21776k = this.f21770e;
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            if (this.f21771f == null) {
                h hVar = new h(context);
                this.f21771f = hVar;
                d(hVar);
            }
            this.f21776k = this.f21771f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            l lVar = this.f21768c;
            if (equals) {
                if (this.f21772g == null) {
                    try {
                        l lVar2 = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f21772g = lVar2;
                        d(lVar2);
                    } catch (ClassNotFoundException unused) {
                        n9.o.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating RTMP extension", e2);
                    }
                    if (this.f21772g == null) {
                        this.f21772g = lVar;
                    }
                }
                this.f21776k = this.f21772g;
            } else if ("udp".equals(scheme)) {
                if (this.f21773h == null) {
                    y0 y0Var = new y0();
                    this.f21773h = y0Var;
                    d(y0Var);
                }
                this.f21776k = this.f21773h;
            } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
                if (this.f21774i == null) {
                    j jVar = new j();
                    this.f21774i = jVar;
                    d(jVar);
                }
                this.f21776k = this.f21774i;
            } else if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
                this.f21776k = lVar;
            } else {
                if (this.f21775j == null) {
                    s0 s0Var = new s0(context);
                    this.f21775j = s0Var;
                    d(s0Var);
                }
                this.f21776k = this.f21775j;
            }
        }
        return this.f21776k.a(pVar);
    }

    @Override // m9.l
    public final void c(w0 w0Var) {
        w0Var.getClass();
        this.f21768c.c(w0Var);
        this.f21767b.add(w0Var);
        e(this.f21769d, w0Var);
        e(this.f21770e, w0Var);
        e(this.f21771f, w0Var);
        e(this.f21772g, w0Var);
        e(this.f21773h, w0Var);
        e(this.f21774i, w0Var);
        e(this.f21775j, w0Var);
    }

    @Override // m9.l
    public final void close() {
        l lVar = this.f21776k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f21776k = null;
            }
        }
    }

    public final void d(l lVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21767b;
            if (i10 < arrayList.size()) {
                lVar.c((w0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // m9.l
    public final Map getResponseHeaders() {
        l lVar = this.f21776k;
        return lVar == null ? Collections.emptyMap() : lVar.getResponseHeaders();
    }

    @Override // m9.l
    public final Uri getUri() {
        l lVar = this.f21776k;
        if (lVar == null) {
            return null;
        }
        return lVar.getUri();
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        l lVar = this.f21776k;
        lVar.getClass();
        return lVar.read(bArr, i10, i11);
    }
}
