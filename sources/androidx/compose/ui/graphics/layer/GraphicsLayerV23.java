package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.l;

@RequiresApi
/* loaded from: classes3.dex */
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    public static final AtomicBoolean A = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final CanvasHolder f15180b;

    /* renamed from: c, reason: collision with root package name */
    public final CanvasDrawScope f15181c;
    public final RenderNode d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f15182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15183g;

    /* renamed from: h, reason: collision with root package name */
    public int f15184h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15185i;

    /* renamed from: j, reason: collision with root package name */
    public float f15186j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15187k;

    /* renamed from: l, reason: collision with root package name */
    public float f15188l;

    /* renamed from: m, reason: collision with root package name */
    public float f15189m;

    /* renamed from: n, reason: collision with root package name */
    public float f15190n;

    /* renamed from: o, reason: collision with root package name */
    public float f15191o;

    /* renamed from: p, reason: collision with root package name */
    public float f15192p;

    /* renamed from: q, reason: collision with root package name */
    public long f15193q;

    /* renamed from: r, reason: collision with root package name */
    public long f15194r;

    /* renamed from: s, reason: collision with root package name */
    public float f15195s;

    /* renamed from: t, reason: collision with root package name */
    public float f15196t;

    /* renamed from: u, reason: collision with root package name */
    public float f15197u;

    /* renamed from: v, reason: collision with root package name */
    public float f15198v;
    public boolean w;
    public boolean x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15199y;

    /* renamed from: z, reason: collision with root package name */
    public RenderEffect f15200z;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public GraphicsLayerV23(ViewGroup viewGroup, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.f15180b = canvasHolder;
        this.f15181c = canvasDrawScope;
        RenderNode create = RenderNode.create("Compose", viewGroup);
        this.d = create;
        this.e = 0L;
        if (A.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.f15253a;
                renderNodeVerificationHelper28.c(create, renderNodeVerificationHelper28.a(create));
                renderNodeVerificationHelper28.d(create, renderNodeVerificationHelper28.b(create));
            }
            RenderNodeVerificationHelper24.f15252a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        Q(0);
        this.f15184h = 0;
        this.f15185i = 3;
        this.f15186j = 1.0f;
        this.f15188l = 1.0f;
        this.f15189m = 1.0f;
        int i2 = Color.f14963j;
        this.f15193q = Color.Companion.a();
        this.f15194r = Color.Companion.a();
        this.f15198v = 8.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long A() {
        return this.f15194r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float B() {
        return this.f15198v;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void C(float f2) {
        this.f15192p = f2;
        this.d.setElevation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix D() {
        Matrix matrix = this.f15182f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f15182f = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float E() {
        return this.f15188l;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void F(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l lVar) {
        int d = IntSize.d(this.e);
        int c2 = IntSize.c(this.e);
        RenderNode renderNode = this.d;
        Canvas start = renderNode.start(d, c2);
        try {
            CanvasHolder canvasHolder = this.f15180b;
            Canvas w = canvasHolder.a().w();
            canvasHolder.a().x(start);
            AndroidCanvas a2 = canvasHolder.a();
            CanvasDrawScope canvasDrawScope = this.f15181c;
            long c3 = IntSizeKt.c(this.e);
            Density d2 = canvasDrawScope.A1().d();
            LayoutDirection f2 = canvasDrawScope.A1().f();
            androidx.compose.ui.graphics.Canvas a3 = canvasDrawScope.A1().a();
            long b2 = canvasDrawScope.A1().b();
            GraphicsLayer e = canvasDrawScope.A1().e();
            CanvasDrawScope$drawContext$1 A1 = canvasDrawScope.A1();
            A1.h(density);
            A1.j(layoutDirection);
            A1.g(a2);
            A1.c(c3);
            A1.i(graphicsLayer);
            a2.p();
            try {
                lVar.invoke(canvasDrawScope);
                a2.i();
                CanvasDrawScope$drawContext$1 A12 = canvasDrawScope.A1();
                A12.h(d2);
                A12.j(f2);
                A12.g(a3);
                A12.c(b2);
                A12.i(e);
                canvasHolder.a().x(w);
            } catch (Throwable th) {
                a2.i();
                CanvasDrawScope$drawContext$1 A13 = canvasDrawScope.A1();
                A13.h(d2);
                A13.j(f2);
                A13.g(a3);
                A13.c(b2);
                A13.i(e);
                throw th;
            }
        } finally {
            renderNode.end(start);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void G(long j2) {
        boolean d = OffsetKt.d(j2);
        RenderNode renderNode = this.d;
        if (d) {
            this.f15187k = true;
            renderNode.setPivotX(IntSize.d(this.e) / 2.0f);
            renderNode.setPivotY(IntSize.c(this.e) / 2.0f);
        } else {
            this.f15187k = false;
            renderNode.setPivotX(Offset.g(j2));
            renderNode.setPivotY(Offset.h(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float H() {
        return this.f15191o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void I() {
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float J() {
        return this.f15190n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float K() {
        return this.f15195s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void L(int i2) {
        this.f15184h = i2;
        if (CompositingStrategy.a(i2, 1) || !BlendMode.a(this.f15185i, 3)) {
            Q(1);
        } else {
            Q(this.f15184h);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float M() {
        return this.f15192p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float N() {
        return this.f15189m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void O(androidx.compose.ui.graphics.Canvas canvas) {
        DisplayListCanvas b2 = AndroidCanvas_androidKt.b(canvas);
        p0.a.q(b2, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        b2.drawRenderNode(this.d);
    }

    public final void P() {
        boolean z2 = this.w;
        boolean z3 = false;
        boolean z4 = z2 && !this.f15183g;
        if (z2 && this.f15183g) {
            z3 = true;
        }
        boolean z5 = this.x;
        RenderNode renderNode = this.d;
        if (z4 != z5) {
            this.x = z4;
            renderNode.setClipToBounds(z4);
        }
        if (z3 != this.f15199y) {
            this.f15199y = z3;
            renderNode.setClipToOutline(z3);
        }
    }

    public final void Q(int i2) {
        boolean a2 = CompositingStrategy.a(i2, 1);
        RenderNode renderNode = this.d;
        if (a2) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.a(i2, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float a() {
        return this.f15186j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean b() {
        return this.w;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c(float f2) {
        this.f15186j = f2;
        this.d.setAlpha(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f2) {
        this.f15191o = f2;
        this.d.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e(float f2) {
        this.f15188l = f2;
        this.d.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(RenderEffect renderEffect) {
        this.f15200z = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f2) {
        this.f15198v = f2;
        this.d.setCameraDistance(-f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void h(float f2) {
        this.f15195s = f2;
        this.d.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void i(float f2) {
        this.f15196t = f2;
        this.d.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void j(float f2) {
        this.f15197u = f2;
        this.d.setRotation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(float f2) {
        this.f15189m = f2;
        this.d.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f2) {
        this.f15190n = f2;
        this.d.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m() {
        RenderNodeVerificationHelper24.f15252a.a(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void n() {
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean o() {
        return this.d.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int p() {
        return this.f15185i;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void q(Outline outline) {
        this.d.setOutline(outline);
        this.f15183g = outline != null;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final RenderEffect r() {
        return this.f15200z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int s() {
        return this.f15184h;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(int i2, int i3, long j2) {
        int d = IntSize.d(j2) + i2;
        int c2 = IntSize.c(j2) + i3;
        RenderNode renderNode = this.d;
        renderNode.setLeftTopRightBottom(i2, i3, d, c2);
        if (IntSize.b(this.e, j2)) {
            return;
        }
        if (this.f15187k) {
            renderNode.setPivotX(IntSize.d(j2) / 2.0f);
            renderNode.setPivotY(IntSize.c(j2) / 2.0f);
        }
        this.e = j2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float u() {
        return this.f15196t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float v() {
        return this.f15197u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void w(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f15193q = j2;
            RenderNodeVerificationHelper28.f15253a.c(this.d, ColorKt.j(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void x(boolean z2) {
        this.w = z2;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f15194r = j2;
            RenderNodeVerificationHelper28.f15253a.d(this.d, ColorKt.j(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long z() {
        return this.f15193q;
    }
}
