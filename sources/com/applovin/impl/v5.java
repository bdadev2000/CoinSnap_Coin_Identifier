package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v5 implements i5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27460a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27461b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final i5 f27462c;
    private i5 d;
    private i5 e;

    /* renamed from: f, reason: collision with root package name */
    private i5 f27463f;

    /* renamed from: g, reason: collision with root package name */
    private i5 f27464g;

    /* renamed from: h, reason: collision with root package name */
    private i5 f27465h;

    /* renamed from: i, reason: collision with root package name */
    private i5 f27466i;

    /* renamed from: j, reason: collision with root package name */
    private i5 f27467j;

    /* renamed from: k, reason: collision with root package name */
    private i5 f27468k;

    /* loaded from: classes2.dex */
    public static final class a implements i5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f27469a;

        /* renamed from: b, reason: collision with root package name */
        private final i5.a f27470b;

        /* renamed from: c, reason: collision with root package name */
        private xo f27471c;

        public a(Context context) {
            this(context, new d6.b());
        }

        @Override // com.applovin.impl.i5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v5 a() {
            v5 v5Var = new v5(this.f27469a, this.f27470b.a());
            xo xoVar = this.f27471c;
            if (xoVar != null) {
                v5Var.a(xoVar);
            }
            return v5Var;
        }

        public a(Context context, i5.a aVar) {
            this.f27469a = context.getApplicationContext();
            this.f27470b = aVar;
        }
    }

    public v5(Context context, i5 i5Var) {
        this.f27460a = context.getApplicationContext();
        this.f27462c = (i5) b1.a(i5Var);
    }

    private void a(i5 i5Var) {
        for (int i2 = 0; i2 < this.f27461b.size(); i2++) {
            i5Var.a((xo) this.f27461b.get(i2));
        }
    }

    private i5 g() {
        if (this.e == null) {
            c1 c1Var = new c1(this.f27460a);
            this.e = c1Var;
            a(c1Var);
        }
        return this.e;
    }

    private i5 h() {
        if (this.f27463f == null) {
            s4 s4Var = new s4(this.f27460a);
            this.f27463f = s4Var;
            a(s4Var);
        }
        return this.f27463f;
    }

    private i5 i() {
        if (this.f27466i == null) {
            h5 h5Var = new h5();
            this.f27466i = h5Var;
            a(h5Var);
        }
        return this.f27466i;
    }

    private i5 j() {
        if (this.d == null) {
            p8 p8Var = new p8();
            this.d = p8Var;
            a(p8Var);
        }
        return this.d;
    }

    private i5 k() {
        if (this.f27467j == null) {
            li liVar = new li(this.f27460a);
            this.f27467j = liVar;
            a(liVar);
        }
        return this.f27467j;
    }

    private i5 l() {
        if (this.f27464g == null) {
            try {
                i5 i5Var = (i5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f27464g = i5Var;
                a(i5Var);
            } catch (ClassNotFoundException unused) {
                pc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f27464g == null) {
                this.f27464g = this.f27462c;
            }
        }
        return this.f27464g;
    }

    private i5 m() {
        if (this.f27465h == null) {
            np npVar = new np();
            this.f27465h = npVar;
            a(npVar);
        }
        return this.f27465h;
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        i5 i5Var = this.f27468k;
        if (i5Var == null) {
            return null;
        }
        return i5Var.c();
    }

    @Override // com.applovin.impl.i5
    public void close() {
        i5 i5Var = this.f27468k;
        if (i5Var != null) {
            try {
                i5Var.close();
            } finally {
                this.f27468k = null;
            }
        }
    }

    @Override // com.applovin.impl.i5
    public Map e() {
        i5 i5Var = this.f27468k;
        return i5Var == null ? Collections.emptyMap() : i5Var.e();
    }

    @Override // com.applovin.impl.i5
    public void a(xo xoVar) {
        b1.a(xoVar);
        this.f27462c.a(xoVar);
        this.f27461b.add(xoVar);
        a(this.d, xoVar);
        a(this.e, xoVar);
        a(this.f27463f, xoVar);
        a(this.f27464g, xoVar);
        a(this.f27465h, xoVar);
        a(this.f27466i, xoVar);
        a(this.f27467j, xoVar);
    }

    private void a(i5 i5Var, xo xoVar) {
        if (i5Var != null) {
            i5Var.a(xoVar);
        }
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        b1.b(this.f27468k == null);
        String scheme = l5Var.f24983a.getScheme();
        if (xp.a(l5Var.f24983a)) {
            String path = l5Var.f24983a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f27468k = g();
            } else {
                this.f27468k = j();
            }
        } else if ("asset".equals(scheme)) {
            this.f27468k = g();
        } else if ("content".equals(scheme)) {
            this.f27468k = h();
        } else if ("rtmp".equals(scheme)) {
            this.f27468k = l();
        } else if ("udp".equals(scheme)) {
            this.f27468k = m();
        } else if ("data".equals(scheme)) {
            this.f27468k = i();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f27468k = k();
        } else {
            this.f27468k = this.f27462c;
        }
        return this.f27468k.a(l5Var);
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        return ((i5) b1.a(this.f27468k)).a(bArr, i2, i3);
    }
}
