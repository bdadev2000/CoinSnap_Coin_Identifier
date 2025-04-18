package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
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
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

/* loaded from: classes.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    public static final GraphicsViewLayer$Companion$PlaceholderCanvas$1 B = new Canvas();
    public RenderEffect A;

    /* renamed from: b, reason: collision with root package name */
    public final DrawChildContainer f15221b;

    /* renamed from: c, reason: collision with root package name */
    public final CanvasHolder f15222c;
    public final ViewLayer d;
    public final Resources e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f15223f;

    /* renamed from: g, reason: collision with root package name */
    public int f15224g;

    /* renamed from: h, reason: collision with root package name */
    public int f15225h;

    /* renamed from: i, reason: collision with root package name */
    public long f15226i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15227j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15228k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15229l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15230m;

    /* renamed from: n, reason: collision with root package name */
    public int f15231n;

    /* renamed from: o, reason: collision with root package name */
    public float f15232o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15233p;

    /* renamed from: q, reason: collision with root package name */
    public float f15234q;

    /* renamed from: r, reason: collision with root package name */
    public float f15235r;

    /* renamed from: s, reason: collision with root package name */
    public float f15236s;

    /* renamed from: t, reason: collision with root package name */
    public float f15237t;

    /* renamed from: u, reason: collision with root package name */
    public float f15238u;

    /* renamed from: v, reason: collision with root package name */
    public long f15239v;
    public long w;
    public float x;

    /* renamed from: y, reason: collision with root package name */
    public float f15240y;

    /* renamed from: z, reason: collision with root package name */
    public float f15241z;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer) {
        CanvasHolder canvasHolder = new CanvasHolder();
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        this.f15221b = drawChildContainer;
        this.f15222c = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.d = viewLayer;
        this.e = drawChildContainer.getResources();
        this.f15223f = new Rect();
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.f15226i = 0L;
        View.generateViewId();
        this.f15230m = 3;
        this.f15231n = 0;
        this.f15232o = 1.0f;
        this.f15234q = 1.0f;
        this.f15235r = 1.0f;
        long j2 = Color.f14957b;
        this.f15239v = j2;
        this.w = j2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long A() {
        return this.w;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float B() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void C(float f2) {
        this.f15238u = f2;
        this.d.setElevation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix D() {
        return this.d.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float E() {
        return this.f15234q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void F(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l lVar) {
        ViewLayer viewLayer = this.d;
        ViewParent parent = viewLayer.getParent();
        DrawChildContainer drawChildContainer = this.f15221b;
        if (parent == null) {
            drawChildContainer.addView(viewLayer);
        }
        viewLayer.f15261h = density;
        viewLayer.f15262i = layoutDirection;
        viewLayer.f15263j = lVar;
        viewLayer.f15264k = graphicsLayer;
        if (viewLayer.isAttachedToWindow()) {
            viewLayer.setVisibility(4);
            viewLayer.setVisibility(0);
            try {
                CanvasHolder canvasHolder = this.f15222c;
                GraphicsViewLayer$Companion$PlaceholderCanvas$1 graphicsViewLayer$Companion$PlaceholderCanvas$1 = B;
                AndroidCanvas androidCanvas = canvasHolder.f14952a;
                Canvas canvas = androidCanvas.f14925a;
                androidCanvas.f14925a = graphicsViewLayer$Companion$PlaceholderCanvas$1;
                drawChildContainer.a(androidCanvas, viewLayer, viewLayer.getDrawingTime());
                canvasHolder.f14952a.f14925a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void G(long j2) {
        boolean d = OffsetKt.d(j2);
        ViewLayer viewLayer = this.d;
        if (!d) {
            this.f15233p = false;
            viewLayer.setPivotX(Offset.g(j2));
            viewLayer.setPivotY(Offset.h(j2));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.f15265a.a(viewLayer);
                return;
            }
            this.f15233p = true;
            viewLayer.setPivotX(((int) (this.f15226i >> 32)) / 2.0f);
            viewLayer.setPivotY(((int) (this.f15226i & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float H() {
        return this.f15237t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void I() {
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float J() {
        return this.f15236s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float K() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void L(int i2) {
        this.f15231n = i2;
        if (CompositingStrategy.a(i2, 1) || (!BlendMode.a(this.f15230m, 3))) {
            P(1);
        } else {
            P(this.f15231n);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float M() {
        return this.f15238u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float N() {
        return this.f15235r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void O(androidx.compose.ui.graphics.Canvas canvas) {
        Rect rect;
        boolean z2 = this.f15227j;
        ViewLayer viewLayer = this.d;
        if (z2) {
            if (!b() || this.f15228k) {
                rect = null;
            } else {
                rect = this.f15223f;
                rect.left = 0;
                rect.top = 0;
                rect.right = viewLayer.getWidth();
                rect.bottom = viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
        if (AndroidCanvas_androidKt.b(canvas).isHardwareAccelerated()) {
            this.f15221b.a(canvas, viewLayer, viewLayer.getDrawingTime());
        }
    }

    public final void P(int i2) {
        boolean z2 = true;
        boolean a2 = CompositingStrategy.a(i2, 1);
        ViewLayer viewLayer = this.d;
        if (a2) {
            viewLayer.setLayerType(2, null);
        } else if (CompositingStrategy.a(i2, 2)) {
            viewLayer.setLayerType(0, null);
            z2 = false;
        } else {
            viewLayer.setLayerType(0, null);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float a() {
        return this.f15232o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean b() {
        return this.f15229l || this.d.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c(float f2) {
        this.f15232o = f2;
        this.d.setAlpha(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f2) {
        this.f15237t = f2;
        this.d.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e(float f2) {
        this.f15234q = f2;
        this.d.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(RenderEffect renderEffect) {
        this.A = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.f15266a.a(this.d, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f2) {
        this.d.setCameraDistance(f2 * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void h(float f2) {
        this.x = f2;
        this.d.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void i(float f2) {
        this.f15240y = f2;
        this.d.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void j(float f2) {
        this.f15241z = f2;
        this.d.setRotation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(float f2) {
        this.f15235r = f2;
        this.d.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f2) {
        this.f15236s = f2;
        this.d.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m() {
        this.f15221b.removeViewInLayout(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void n() {
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int p() {
        return this.f15230m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void q(Outline outline) {
        ViewLayer viewLayer = this.d;
        viewLayer.f15259f = outline;
        viewLayer.invalidateOutline();
        if (b() && outline != null) {
            this.d.setClipToOutline(true);
            if (this.f15229l) {
                this.f15229l = false;
                this.f15227j = true;
            }
        }
        this.f15228k = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final RenderEffect r() {
        return this.A;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int s() {
        return this.f15231n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(int i2, int i3, long j2) {
        boolean b2 = IntSize.b(this.f15226i, j2);
        ViewLayer viewLayer = this.d;
        if (b2) {
            int i4 = this.f15224g;
            if (i4 != i2) {
                viewLayer.offsetLeftAndRight(i2 - i4);
            }
            int i5 = this.f15225h;
            if (i5 != i3) {
                viewLayer.offsetTopAndBottom(i3 - i5);
            }
        } else {
            if (b()) {
                this.f15227j = true;
            }
            int i6 = (int) (j2 >> 32);
            int i7 = (int) (4294967295L & j2);
            viewLayer.layout(i2, i3, i2 + i6, i3 + i7);
            this.f15226i = j2;
            if (this.f15233p) {
                viewLayer.setPivotX(i6 / 2.0f);
                viewLayer.setPivotY(i7 / 2.0f);
            }
        }
        this.f15224g = i2;
        this.f15225h = i3;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float u() {
        return this.f15240y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float v() {
        return this.f15241z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void w(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f15239v = j2;
            ViewLayerVerificationHelper28.f15265a.b(this.d, ColorKt.j(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void x(boolean z2) {
        boolean z3 = false;
        this.f15229l = z2 && !this.f15228k;
        this.f15227j = true;
        if (z2 && this.f15228k) {
            z3 = true;
        }
        this.d.setClipToOutline(z3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j2;
            ViewLayerVerificationHelper28.f15265a.c(this.d, ColorKt.j(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long z() {
        return this.f15239v;
    }
}
