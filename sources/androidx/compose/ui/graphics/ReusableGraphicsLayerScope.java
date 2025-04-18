package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import org.objectweb.asm.Opcodes;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {

    /* renamed from: a, reason: collision with root package name */
    public int f15017a;

    /* renamed from: b, reason: collision with root package name */
    public float f15018b;

    /* renamed from: c, reason: collision with root package name */
    public float f15019c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public float f15020f;

    /* renamed from: g, reason: collision with root package name */
    public float f15021g;

    /* renamed from: h, reason: collision with root package name */
    public float f15022h;

    /* renamed from: i, reason: collision with root package name */
    public long f15023i;

    /* renamed from: j, reason: collision with root package name */
    public long f15024j;

    /* renamed from: k, reason: collision with root package name */
    public float f15025k;

    /* renamed from: l, reason: collision with root package name */
    public float f15026l;

    /* renamed from: m, reason: collision with root package name */
    public float f15027m;

    /* renamed from: n, reason: collision with root package name */
    public float f15028n;

    /* renamed from: o, reason: collision with root package name */
    public long f15029o;

    /* renamed from: p, reason: collision with root package name */
    public Shape f15030p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15031q;

    /* renamed from: r, reason: collision with root package name */
    public int f15032r;

    /* renamed from: s, reason: collision with root package name */
    public long f15033s;

    /* renamed from: t, reason: collision with root package name */
    public Density f15034t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutDirection f15035u;

    /* renamed from: v, reason: collision with root package name */
    public RenderEffect f15036v;
    public Outline w;

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void C(float f2) {
        if (this.f15022h == f2) {
            return;
        }
        this.f15017a |= 32;
        this.f15022h = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void G0(long j2) {
        if (TransformOrigin.a(this.f15029o, j2)) {
            return;
        }
        this.f15017a |= 4096;
        this.f15029o = j2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final long b() {
        return this.f15033s;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void c(float f2) {
        if (this.d == f2) {
            return;
        }
        this.f15017a |= 4;
        this.d = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void d(float f2) {
        if (this.f15021g == f2) {
            return;
        }
        this.f15017a |= 16;
        this.f15021g = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void e(float f2) {
        if (this.f15018b == f2) {
            return;
        }
        this.f15017a |= 1;
        this.f15018b = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void f(RenderEffect renderEffect) {
        if (p0.a.g(this.f15036v, renderEffect)) {
            return;
        }
        this.f15017a |= Opcodes.ACC_DEPRECATED;
        this.f15036v = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void g(float f2) {
        if (this.f15028n == f2) {
            return;
        }
        this.f15017a |= Opcodes.ACC_STRICT;
        this.f15028n = f2;
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f15034t.getDensity();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void h(float f2) {
        if (this.f15025k == f2) {
            return;
        }
        this.f15017a |= 256;
        this.f15025k = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void i(float f2) {
        if (this.f15026l == f2) {
            return;
        }
        this.f15017a |= 512;
        this.f15026l = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void j(float f2) {
        if (this.f15027m == f2) {
            return;
        }
        this.f15017a |= 1024;
        this.f15027m = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void k(float f2) {
        if (this.f15019c == f2) {
            return;
        }
        this.f15017a |= 2;
        this.f15019c = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void l(float f2) {
        if (this.f15020f == f2) {
            return;
        }
        this.f15017a |= 8;
        this.f15020f = f2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void t(int i2) {
        if (CompositingStrategy.a(this.f15032r, i2)) {
            return;
        }
        this.f15017a |= 32768;
        this.f15032r = i2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void w(long j2) {
        if (Color.c(this.f15023i, j2)) {
            return;
        }
        this.f15017a |= 64;
        this.f15023i = j2;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void w1(Shape shape) {
        if (p0.a.g(this.f15030p, shape)) {
            return;
        }
        this.f15017a |= 8192;
        this.f15030p = shape;
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void x(boolean z2) {
        if (this.f15031q != z2) {
            this.f15017a |= 16384;
            this.f15031q = z2;
        }
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f15034t.x1();
    }

    @Override // androidx.compose.ui.graphics.GraphicsLayerScope
    public final void y(long j2) {
        if (Color.c(this.f15024j, j2)) {
            return;
        }
        this.f15017a |= 128;
        this.f15024j = j2;
    }
}
