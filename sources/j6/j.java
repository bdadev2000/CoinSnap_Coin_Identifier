package j6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.InterfaceC0511v;
import n6.EnumC2480a;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: A, reason: collision with root package name */
    public final t f21120A;

    /* renamed from: B, reason: collision with root package name */
    public final int f21121B;

    /* renamed from: C, reason: collision with root package name */
    public final int f21122C;

    /* renamed from: D, reason: collision with root package name */
    public final int f21123D;

    /* renamed from: E, reason: collision with root package name */
    public final int f21124E;

    /* renamed from: F, reason: collision with root package name */
    public final float f21125F;

    /* renamed from: G, reason: collision with root package name */
    public final float f21126G;

    /* renamed from: H, reason: collision with root package name */
    public Integer f21127H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f21128I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f21129J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f21130K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21131L;

    /* renamed from: M, reason: collision with root package name */
    public final long f21132M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC0511v f21133N;
    public final int O;

    /* renamed from: P, reason: collision with root package name */
    public final int f21134P;

    /* renamed from: Q, reason: collision with root package name */
    public final o f21135Q;

    /* renamed from: R, reason: collision with root package name */
    public final EnumC2480a f21136R;

    /* renamed from: S, reason: collision with root package name */
    public final long f21137S;

    /* renamed from: T, reason: collision with root package name */
    public q f21138T;

    /* renamed from: U, reason: collision with root package name */
    public final int f21139U;

    /* renamed from: V, reason: collision with root package name */
    public long f21140V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f21141W;

    /* renamed from: X, reason: collision with root package name */
    public final int f21142X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f21143Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f21144Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21145a;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f21146a0;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21147c;

    /* renamed from: d, reason: collision with root package name */
    public float f21148d;

    /* renamed from: e, reason: collision with root package name */
    public int f21149e;

    /* renamed from: f, reason: collision with root package name */
    public int f21150f;

    /* renamed from: g, reason: collision with root package name */
    public int f21151g;

    /* renamed from: h, reason: collision with root package name */
    public int f21152h;

    /* renamed from: i, reason: collision with root package name */
    public int f21153i;

    /* renamed from: j, reason: collision with root package name */
    public int f21154j;

    /* renamed from: k, reason: collision with root package name */
    public int f21155k;
    public final boolean l;
    public final int m;

    /* renamed from: n, reason: collision with root package name */
    public int f21156n;

    /* renamed from: o, reason: collision with root package name */
    public float f21157o;

    /* renamed from: p, reason: collision with root package name */
    public d f21158p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC2403c f21159q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC2402b f21160r;

    /* renamed from: s, reason: collision with root package name */
    public final float f21161s;

    /* renamed from: t, reason: collision with root package name */
    public int f21162t;

    /* renamed from: u, reason: collision with root package name */
    public float f21163u;

    /* renamed from: v, reason: collision with root package name */
    public final String f21164v;

    /* renamed from: w, reason: collision with root package name */
    public final int f21165w;

    /* renamed from: x, reason: collision with root package name */
    public final float f21166x;

    /* renamed from: y, reason: collision with root package name */
    public final int f21167y;

    /* renamed from: z, reason: collision with root package name */
    public x f21168z;

    public j(Context context) {
        boolean z8;
        G7.j.e(context, "context");
        this.f21145a = context;
        this.b = Integer.MIN_VALUE;
        this.f21147c = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        this.f21149e = Integer.MIN_VALUE;
        this.l = true;
        this.m = Integer.MIN_VALUE;
        this.f21156n = com.mbridge.msdk.foundation.entity.o.f(1, 12);
        this.f21157o = 0.5f;
        this.f21158p = d.b;
        this.f21159q = EnumC2403c.b;
        this.f21160r = EnumC2402b.f21108c;
        this.f21161s = 2.5f;
        this.f21162t = ViewCompat.MEASURED_STATE_MASK;
        this.f21163u = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
        this.f21164v = "";
        this.f21165w = -1;
        this.f21166x = 12.0f;
        this.f21167y = 17;
        this.f21120A = t.b;
        float f9 = 28;
        this.f21121B = com.mbridge.msdk.foundation.entity.o.f(1, f9);
        this.f21122C = com.mbridge.msdk.foundation.entity.o.f(1, f9);
        this.f21123D = com.mbridge.msdk.foundation.entity.o.f(1, 8);
        this.f21124E = Integer.MIN_VALUE;
        this.f21125F = 1.0f;
        this.f21126G = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        this.f21128I = true;
        this.f21129J = true;
        this.f21131L = true;
        this.f21132M = -1L;
        this.O = Integer.MIN_VALUE;
        this.f21134P = Integer.MIN_VALUE;
        this.f21135Q = o.b;
        this.f21136R = EnumC2480a.b;
        this.f21137S = 500L;
        this.f21138T = q.b;
        this.f21139U = Integer.MIN_VALUE;
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f21141W = z8;
        this.f21142X = z8 ? -1 : 1;
        this.f21143Y = true;
        this.f21144Z = true;
        this.f21146a0 = true;
    }

    public final void a(int i9) {
        int i10 = Integer.MIN_VALUE;
        if (i9 != Integer.MIN_VALUE) {
            i10 = com.mbridge.msdk.foundation.entity.o.f(1, i9);
        }
        this.f21156n = i10;
    }

    public final void b(int i9) {
        if (i9 <= 0 && i9 != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("The height of the balloon must bigger than zero.".toString());
        }
        this.f21149e = com.mbridge.msdk.foundation.entity.o.f(1, i9);
    }
}
