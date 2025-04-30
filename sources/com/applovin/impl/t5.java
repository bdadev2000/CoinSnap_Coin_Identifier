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

    /* renamed from: a, reason: collision with root package name */
    private final Context f11292a;
    private final List b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final g5 f11293c;

    /* renamed from: d, reason: collision with root package name */
    private g5 f11294d;

    /* renamed from: e, reason: collision with root package name */
    private g5 f11295e;

    /* renamed from: f, reason: collision with root package name */
    private g5 f11296f;

    /* renamed from: g, reason: collision with root package name */
    private g5 f11297g;

    /* renamed from: h, reason: collision with root package name */
    private g5 f11298h;

    /* renamed from: i, reason: collision with root package name */
    private g5 f11299i;

    /* renamed from: j, reason: collision with root package name */
    private g5 f11300j;

    /* renamed from: k, reason: collision with root package name */
    private g5 f11301k;

    /* loaded from: classes.dex */
    public static final class a implements g5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f11302a;
        private final g5.a b;

        /* renamed from: c, reason: collision with root package name */
        private yo f11303c;

        public a(Context context) {
            this(context, new b6.b());
        }

        @Override // com.applovin.impl.g5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t5 a() {
            t5 t5Var = new t5(this.f11302a, this.b.a());
            yo yoVar = this.f11303c;
            if (yoVar != null) {
                t5Var.a(yoVar);
            }
            return t5Var;
        }

        public a(Context context, g5.a aVar) {
            this.f11302a = context.getApplicationContext();
            this.b = aVar;
        }
    }

    public t5(Context context, g5 g5Var) {
        this.f11292a = context.getApplicationContext();
        this.f11293c = (g5) AbstractC0669a1.a(g5Var);
    }

    private void a(g5 g5Var) {
        for (int i9 = 0; i9 < this.b.size(); i9++) {
            g5Var.a((yo) this.b.get(i9));
        }
    }

    private g5 g() {
        if (this.f11295e == null) {
            C0674b1 c0674b1 = new C0674b1(this.f11292a);
            this.f11295e = c0674b1;
            a(c0674b1);
        }
        return this.f11295e;
    }

    private g5 h() {
        if (this.f11296f == null) {
            q4 q4Var = new q4(this.f11292a);
            this.f11296f = q4Var;
            a(q4Var);
        }
        return this.f11296f;
    }

    private g5 i() {
        if (this.f11299i == null) {
            f5 f5Var = new f5();
            this.f11299i = f5Var;
            a(f5Var);
        }
        return this.f11299i;
    }

    private g5 j() {
        if (this.f11294d == null) {
            n8 n8Var = new n8();
            this.f11294d = n8Var;
            a(n8Var);
        }
        return this.f11294d;
    }

    private g5 k() {
        if (this.f11300j == null) {
            hi hiVar = new hi(this.f11292a);
            this.f11300j = hiVar;
            a(hiVar);
        }
        return this.f11300j;
    }

    private g5 l() {
        if (this.f11297g == null) {
            try {
                g5 g5Var = (g5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f11297g = g5Var;
                a(g5Var);
            } catch (ClassNotFoundException unused) {
                kc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating RTMP extension", e4);
            }
            if (this.f11297g == null) {
                this.f11297g = this.f11293c;
            }
        }
        return this.f11297g;
    }

    private g5 m() {
        if (this.f11298h == null) {
            op opVar = new op();
            this.f11298h = opVar;
            a(opVar);
        }
        return this.f11298h;
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        g5 g5Var = this.f11301k;
        if (g5Var == null) {
            return null;
        }
        return g5Var.c();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        g5 g5Var = this.f11301k;
        if (g5Var != null) {
            try {
                g5Var.close();
            } finally {
                this.f11301k = null;
            }
        }
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        g5 g5Var = this.f11301k;
        if (g5Var == null) {
            return Collections.emptyMap();
        }
        return g5Var.e();
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        AbstractC0669a1.a(yoVar);
        this.f11293c.a(yoVar);
        this.b.add(yoVar);
        a(this.f11294d, yoVar);
        a(this.f11295e, yoVar);
        a(this.f11296f, yoVar);
        a(this.f11297g, yoVar);
        a(this.f11298h, yoVar);
        a(this.f11299i, yoVar);
        a(this.f11300j, yoVar);
    }

    private void a(g5 g5Var, yo yoVar) {
        if (g5Var != null) {
            g5Var.a(yoVar);
        }
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        AbstractC0669a1.b(this.f11301k == null);
        String scheme = j5Var.f8395a.getScheme();
        if (yp.a(j5Var.f8395a)) {
            String path = j5Var.f8395a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f11301k = g();
            } else {
                this.f11301k = j();
            }
        } else if ("asset".equals(scheme)) {
            this.f11301k = g();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.f11301k = h();
        } else if ("rtmp".equals(scheme)) {
            this.f11301k = l();
        } else if ("udp".equals(scheme)) {
            this.f11301k = m();
        } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
            this.f11301k = i();
        } else if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
            this.f11301k = this.f11293c;
        } else {
            this.f11301k = k();
        }
        return this.f11301k.a(j5Var);
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        return ((g5) AbstractC0669a1.a(this.f11301k)).a(bArr, i9, i10);
    }
}
