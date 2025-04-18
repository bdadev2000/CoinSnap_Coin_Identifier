package s7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class w0 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f24810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24811c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f24812d;

    /* renamed from: e, reason: collision with root package name */
    public a1 f24813e;

    /* renamed from: f, reason: collision with root package name */
    public final List f24814f;

    /* renamed from: g, reason: collision with root package name */
    public String f24815g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.common.collect.r0 f24816h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f24817i;

    /* renamed from: j, reason: collision with root package name */
    public Object f24818j;

    /* renamed from: k, reason: collision with root package name */
    public final l1 f24819k;

    /* renamed from: l, reason: collision with root package name */
    public c1 f24820l;

    /* renamed from: m, reason: collision with root package name */
    public final f1 f24821m;

    public w0() {
        this.f24812d = new x0();
        this.f24813e = new a1();
        this.f24814f = Collections.emptyList();
        this.f24816h = com.google.common.collect.z1.f12062g;
        this.f24820l = new c1();
        this.f24821m = f1.f24351d;
    }

    public final j1 a() {
        boolean z10;
        e1 e1Var;
        a1 a1Var = this.f24813e;
        if (a1Var.f24257b != null && a1Var.a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        v8.u0.m(z10);
        Uri uri = this.f24810b;
        b1 b1Var = null;
        if (uri != null) {
            String str = this.f24811c;
            a1 a1Var2 = this.f24813e;
            if (a1Var2.a != null) {
                b1Var = new b1(a1Var2);
            }
            e1Var = new e1(uri, str, b1Var, this.f24817i, this.f24814f, this.f24815g, this.f24816h, this.f24818j);
        } else {
            e1Var = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        x0 x0Var = this.f24812d;
        x0Var.getClass();
        z0 z0Var = new z0(x0Var);
        d1 a = this.f24820l.a();
        l1 l1Var = this.f24819k;
        if (l1Var == null) {
            l1Var = l1.K;
        }
        return new j1(str3, z0Var, e1Var, a, l1Var, this.f24821m);
    }

    public w0(j1 j1Var) {
        this();
        a1 a1Var;
        z0 z0Var = j1Var.f24456g;
        z0Var.getClass();
        this.f24812d = new x0(z0Var);
        this.a = j1Var.f24452b;
        this.f24819k = j1Var.f24455f;
        d1 d1Var = j1Var.f24454d;
        d1Var.getClass();
        this.f24820l = new c1(d1Var);
        this.f24821m = j1Var.f24457h;
        e1 e1Var = j1Var.f24453c;
        if (e1Var != null) {
            this.f24815g = e1Var.f24347h;
            this.f24811c = e1Var.f24343c;
            this.f24810b = e1Var.f24342b;
            this.f24814f = e1Var.f24346g;
            this.f24816h = e1Var.f24348i;
            this.f24818j = e1Var.f24349j;
            b1 b1Var = e1Var.f24344d;
            if (b1Var != null) {
                a1Var = new a1(b1Var);
            } else {
                a1Var = new a1();
            }
            this.f24813e = a1Var;
            this.f24817i = e1Var.f24345f;
        }
    }
}
