package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t5 implements g5 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final List f8138b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final g5 f8139c;

    /* renamed from: d, reason: collision with root package name */
    private g5 f8140d;

    /* renamed from: e, reason: collision with root package name */
    private g5 f8141e;

    /* renamed from: f, reason: collision with root package name */
    private g5 f8142f;

    /* renamed from: g, reason: collision with root package name */
    private g5 f8143g;

    /* renamed from: h, reason: collision with root package name */
    private g5 f8144h;

    /* renamed from: i, reason: collision with root package name */
    private g5 f8145i;

    /* renamed from: j, reason: collision with root package name */
    private g5 f8146j;

    /* renamed from: k, reason: collision with root package name */
    private g5 f8147k;

    /* loaded from: classes.dex */
    public static final class a implements g5.a {
        private final Context a;

        /* renamed from: b, reason: collision with root package name */
        private final g5.a f8148b;

        /* renamed from: c, reason: collision with root package name */
        private yo f8149c;

        public a(Context context) {
            this(context, new b6.b());
        }

        @Override // com.applovin.impl.g5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t5 a() {
            t5 t5Var = new t5(this.a, this.f8148b.a());
            yo yoVar = this.f8149c;
            if (yoVar != null) {
                t5Var.a(yoVar);
            }
            return t5Var;
        }

        public a(Context context, g5.a aVar) {
            this.a = context.getApplicationContext();
            this.f8148b = aVar;
        }
    }

    public t5(Context context, g5 g5Var) {
        this.a = context.getApplicationContext();
        this.f8139c = (g5) a1.a(g5Var);
    }

    private void a(g5 g5Var) {
        for (int i10 = 0; i10 < this.f8138b.size(); i10++) {
            g5Var.a((yo) this.f8138b.get(i10));
        }
    }

    private g5 g() {
        if (this.f8141e == null) {
            b1 b1Var = new b1(this.a);
            this.f8141e = b1Var;
            a(b1Var);
        }
        return this.f8141e;
    }

    private g5 h() {
        if (this.f8142f == null) {
            q4 q4Var = new q4(this.a);
            this.f8142f = q4Var;
            a(q4Var);
        }
        return this.f8142f;
    }

    private g5 i() {
        if (this.f8145i == null) {
            f5 f5Var = new f5();
            this.f8145i = f5Var;
            a(f5Var);
        }
        return this.f8145i;
    }

    private g5 j() {
        if (this.f8140d == null) {
            n8 n8Var = new n8();
            this.f8140d = n8Var;
            a(n8Var);
        }
        return this.f8140d;
    }

    private g5 k() {
        if (this.f8146j == null) {
            hi hiVar = new hi(this.a);
            this.f8146j = hiVar;
            a(hiVar);
        }
        return this.f8146j;
    }

    private g5 l() {
        if (this.f8143g == null) {
            try {
                g5 g5Var = (g5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f8143g = g5Var;
                a(g5Var);
            } catch (ClassNotFoundException unused) {
                kc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.f8143g == null) {
                this.f8143g = this.f8139c;
            }
        }
        return this.f8143g;
    }

    private g5 m() {
        if (this.f8144h == null) {
            op opVar = new op();
            this.f8144h = opVar;
            a(opVar);
        }
        return this.f8144h;
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        g5 g5Var = this.f8147k;
        if (g5Var == null) {
            return null;
        }
        return g5Var.c();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        g5 g5Var = this.f8147k;
        if (g5Var != null) {
            try {
                g5Var.close();
            } finally {
                this.f8147k = null;
            }
        }
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        g5 g5Var = this.f8147k;
        return g5Var == null ? Collections.emptyMap() : g5Var.e();
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        a1.a(yoVar);
        this.f8139c.a(yoVar);
        this.f8138b.add(yoVar);
        a(this.f8140d, yoVar);
        a(this.f8141e, yoVar);
        a(this.f8142f, yoVar);
        a(this.f8143g, yoVar);
        a(this.f8144h, yoVar);
        a(this.f8145i, yoVar);
        a(this.f8146j, yoVar);
    }

    private void a(g5 g5Var, yo yoVar) {
        if (g5Var != null) {
            g5Var.a(yoVar);
        }
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        a1.b(this.f8147k == null);
        String scheme = j5Var.a.getScheme();
        if (yp.a(j5Var.a)) {
            String path = j5Var.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f8147k = g();
            } else {
                this.f8147k = j();
            }
        } else if ("asset".equals(scheme)) {
            this.f8147k = g();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.f8147k = h();
        } else if ("rtmp".equals(scheme)) {
            this.f8147k = l();
        } else if ("udp".equals(scheme)) {
            this.f8147k = m();
        } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
            this.f8147k = i();
        } else if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
            this.f8147k = this.f8139c;
        } else {
            this.f8147k = k();
        }
        return this.f8147k.a(j5Var);
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        return ((g5) a1.a(this.f8147k)).a(bArr, i10, i11);
    }
}
