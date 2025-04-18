package wh;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;
import s7.h1;

/* loaded from: classes5.dex */
public final class k0 {
    public final h1 a = new h1();

    /* renamed from: b, reason: collision with root package name */
    public final y7.q f27088b = new y7.q(13);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27089c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27090d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final gb.d f27091e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27092f;

    /* renamed from: g, reason: collision with root package name */
    public final ni.a f27093g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27094h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27095i;

    /* renamed from: j, reason: collision with root package name */
    public final v5.b f27096j;

    /* renamed from: k, reason: collision with root package name */
    public h f27097k;

    /* renamed from: l, reason: collision with root package name */
    public final x5.c f27098l;

    /* renamed from: m, reason: collision with root package name */
    public ProxySelector f27099m;

    /* renamed from: n, reason: collision with root package name */
    public final ni.a f27100n;

    /* renamed from: o, reason: collision with root package name */
    public final SocketFactory f27101o;

    /* renamed from: p, reason: collision with root package name */
    public final List f27102p;

    /* renamed from: q, reason: collision with root package name */
    public final List f27103q;

    /* renamed from: r, reason: collision with root package name */
    public final ji.c f27104r;

    /* renamed from: s, reason: collision with root package name */
    public final n f27105s;

    /* renamed from: t, reason: collision with root package name */
    public int f27106t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f27107v;

    /* renamed from: w, reason: collision with root package name */
    public y7.u f27108w;

    public k0() {
        y5.f fVar = y5.f.f27928d;
        byte[] bArr = xh.b.a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        this.f27091e = new gb.d(fVar, 16);
        this.f27092f = true;
        ni.a aVar = b.f27019j8;
        this.f27093g = aVar;
        this.f27094h = true;
        this.f27095i = true;
        this.f27096j = t.a;
        this.f27098l = u.f27212k8;
        this.f27100n = aVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
        this.f27101o = socketFactory;
        this.f27102p = l0.D;
        this.f27103q = l0.C;
        this.f27104r = ji.c.a;
        this.f27105s = n.f27144c;
        this.f27106t = 10000;
        this.u = 10000;
        this.f27107v = 10000;
    }
}
