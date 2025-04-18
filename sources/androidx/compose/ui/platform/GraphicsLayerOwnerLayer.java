package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import org.objectweb.asm.Opcodes;

@StabilityInferred
/* loaded from: classes4.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {

    /* renamed from: a, reason: collision with root package name */
    public GraphicsLayer f16494a;

    /* renamed from: b, reason: collision with root package name */
    public final GraphicsContext f16495b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f16496c;
    public q0.p d;

    /* renamed from: f, reason: collision with root package name */
    public q0.a f16497f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16499h;

    /* renamed from: j, reason: collision with root package name */
    public float[] f16501j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16502k;

    /* renamed from: o, reason: collision with root package name */
    public int f16506o;

    /* renamed from: q, reason: collision with root package name */
    public Outline f16508q;

    /* renamed from: r, reason: collision with root package name */
    public AndroidPath f16509r;

    /* renamed from: s, reason: collision with root package name */
    public AndroidPaint f16510s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16511t;

    /* renamed from: g, reason: collision with root package name */
    public long f16498g = IntSizeKt.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* renamed from: i, reason: collision with root package name */
    public final float[] f16500i = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    public Density f16503l = DensityKt.b();

    /* renamed from: m, reason: collision with root package name */
    public LayoutDirection f16504m = LayoutDirection.f17494a;

    /* renamed from: n, reason: collision with root package name */
    public final CanvasDrawScope f16505n = new CanvasDrawScope();

    /* renamed from: p, reason: collision with root package name */
    public long f16507p = TransformOrigin.f15059b;

    /* renamed from: u, reason: collision with root package name */
    public final q0.l f16512u = new GraphicsLayerOwnerLayer$recordLambda$1(this);

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, q0.p pVar, q0.a aVar) {
        this.f16494a = graphicsLayer;
        this.f16495b = graphicsContext;
        this.f16496c = androidComposeView;
        this.d = pVar;
        this.f16497f = aVar;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(float[] fArr) {
        Matrix.f(fArr, m());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long b(long j2, boolean z2) {
        if (!z2) {
            return Matrix.a(m(), j2);
        }
        float[] l2 = l();
        if (l2 != null) {
            return Matrix.a(l2, j2);
        }
        return 9187343241974906880L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void c(long j2) {
        if (IntSize.b(j2, this.f16498g)) {
            return;
        }
        this.f16498g = j2;
        if (this.f16502k || this.f16499h) {
            return;
        }
        AndroidComposeView androidComposeView = this.f16496c;
        androidComposeView.invalidate();
        if (true != this.f16502k) {
            this.f16502k = true;
            androidComposeView.J(this, true);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas b2 = AndroidCanvas_androidKt.b(canvas);
        if (b2.isHardwareAccelerated()) {
            k();
            this.f16511t = this.f16494a.f15154a.M() > 0.0f;
            CanvasDrawScope canvasDrawScope = this.f16505n;
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.f15134b;
            canvasDrawScope$drawContext$1.g(canvas);
            canvasDrawScope$drawContext$1.f15140b = graphicsLayer;
            GraphicsLayerKt.a(canvasDrawScope, this.f16494a);
            return;
        }
        GraphicsLayer graphicsLayer2 = this.f16494a;
        long j2 = graphicsLayer2.f15170s;
        float f2 = (int) (j2 >> 32);
        float f3 = (int) (j2 & 4294967295L);
        long j3 = this.f16498g;
        float f4 = ((int) (j3 >> 32)) + f2;
        float f5 = f3 + ((int) (j3 & 4294967295L));
        if (graphicsLayer2.f15154a.a() < 1.0f) {
            AndroidPaint androidPaint = this.f16510s;
            if (androidPaint == null) {
                androidPaint = AndroidPaint_androidKt.a();
                this.f16510s = androidPaint;
            }
            androidPaint.c(this.f16494a.f15154a.a());
            b2.saveLayer(f2, f3, f4, f5, androidPaint.f14933a);
        } else {
            canvas.p();
        }
        canvas.h(f2, f3);
        canvas.r(m());
        if (this.f16494a.f15154a.b() && this.f16494a.f15154a.b()) {
            Outline d = this.f16494a.d();
            if (d instanceof Outline.Rectangle) {
                canvas.t(1, ((Outline.Rectangle) d).f15001a);
            } else if (d instanceof Outline.Rounded) {
                AndroidPath androidPath = this.f16509r;
                if (androidPath == null) {
                    androidPath = AndroidPath_androidKt.a();
                    this.f16509r = androidPath;
                }
                androidPath.reset();
                androidPath.v(((Outline.Rounded) d).f15002a, Path.Direction.f15004a);
                canvas.g(androidPath, 1);
            } else if (d instanceof Outline.Generic) {
                canvas.g(((Outline.Generic) d).f15000a, 1);
            }
        }
        q0.p pVar = this.d;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.i();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        this.d = null;
        this.f16497f = null;
        this.f16499h = true;
        boolean z2 = this.f16502k;
        AndroidComposeView androidComposeView = this.f16496c;
        if (z2) {
            this.f16502k = false;
            androidComposeView.J(this, false);
        }
        GraphicsContext graphicsContext = this.f16495b;
        if (graphicsContext != null) {
            graphicsContext.b(this.f16494a);
            androidComposeView.M(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void e(MutableRect mutableRect, boolean z2) {
        if (!z2) {
            Matrix.b(m(), mutableRect);
            return;
        }
        float[] l2 = l();
        if (l2 != null) {
            Matrix.b(l2, mutableRect);
            return;
        }
        mutableRect.f14910a = 0.0f;
        mutableRect.f14911b = 0.0f;
        mutableRect.f14912c = 0.0f;
        mutableRect.d = 0.0f;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void f(q0.p pVar, q0.a aVar) {
        GraphicsContext graphicsContext = this.f16495b;
        if (graphicsContext == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle".toString());
        }
        if (!this.f16494a.f15169r) {
            throw new IllegalArgumentException("layer should have been released before reuse".toString());
        }
        this.f16494a = graphicsContext.a();
        this.f16499h = false;
        this.d = pVar;
        this.f16497f = aVar;
        int i2 = TransformOrigin.f15060c;
        this.f16507p = TransformOrigin.f15059b;
        this.f16511t = false;
        this.f16498g = IntSizeKt.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f16508q = null;
        this.f16506o = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j2) {
        float g2 = Offset.g(j2);
        float h2 = Offset.h(j2);
        if (this.f16494a.f15154a.b()) {
            return ShapeContainingUtilKt.a(this.f16494a.d(), g2, h2, null, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        q0.a aVar;
        int i2;
        q0.a aVar2;
        int i3 = reusableGraphicsLayerScope.f15017a | this.f16506o;
        this.f16504m = reusableGraphicsLayerScope.f15035u;
        this.f16503l = reusableGraphicsLayerScope.f15034t;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.f16507p = reusableGraphicsLayerScope.f15029o;
        }
        if ((i3 & 1) != 0) {
            GraphicsLayer graphicsLayer = this.f16494a;
            float f2 = reusableGraphicsLayerScope.f15018b;
            GraphicsLayerImpl graphicsLayerImpl = graphicsLayer.f15154a;
            if (graphicsLayerImpl.E() != f2) {
                graphicsLayerImpl.e(f2);
            }
        }
        if ((i3 & 2) != 0) {
            GraphicsLayer graphicsLayer2 = this.f16494a;
            float f3 = reusableGraphicsLayerScope.f15019c;
            GraphicsLayerImpl graphicsLayerImpl2 = graphicsLayer2.f15154a;
            if (graphicsLayerImpl2.N() != f3) {
                graphicsLayerImpl2.k(f3);
            }
        }
        if ((i3 & 4) != 0) {
            this.f16494a.g(reusableGraphicsLayerScope.d);
        }
        if ((i3 & 8) != 0) {
            GraphicsLayer graphicsLayer3 = this.f16494a;
            float f4 = reusableGraphicsLayerScope.f15020f;
            GraphicsLayerImpl graphicsLayerImpl3 = graphicsLayer3.f15154a;
            if (graphicsLayerImpl3.J() != f4) {
                graphicsLayerImpl3.l(f4);
            }
        }
        if ((i3 & 16) != 0) {
            GraphicsLayer graphicsLayer4 = this.f16494a;
            float f5 = reusableGraphicsLayerScope.f15021g;
            GraphicsLayerImpl graphicsLayerImpl4 = graphicsLayer4.f15154a;
            if (graphicsLayerImpl4.H() != f5) {
                graphicsLayerImpl4.d(f5);
            }
        }
        boolean z2 = false;
        if ((i3 & 32) != 0) {
            GraphicsLayer graphicsLayer5 = this.f16494a;
            float f6 = reusableGraphicsLayerScope.f15022h;
            GraphicsLayerImpl graphicsLayerImpl5 = graphicsLayer5.f15154a;
            if (graphicsLayerImpl5.M() != f6) {
                graphicsLayerImpl5.C(f6);
                graphicsLayerImpl5.x(graphicsLayerImpl5.b() || f6 > 0.0f);
                graphicsLayer5.f15158g = true;
                graphicsLayer5.a();
            }
            if (reusableGraphicsLayerScope.f15022h > 0.0f && !this.f16511t && (aVar2 = this.f16497f) != null) {
                aVar2.invoke();
            }
        }
        if ((i3 & 64) != 0) {
            GraphicsLayer graphicsLayer6 = this.f16494a;
            long j2 = reusableGraphicsLayerScope.f15023i;
            GraphicsLayerImpl graphicsLayerImpl6 = graphicsLayer6.f15154a;
            if (!Color.c(j2, graphicsLayerImpl6.z())) {
                graphicsLayerImpl6.w(j2);
            }
        }
        if ((i3 & 128) != 0) {
            GraphicsLayer graphicsLayer7 = this.f16494a;
            long j3 = reusableGraphicsLayerScope.f15024j;
            GraphicsLayerImpl graphicsLayerImpl7 = graphicsLayer7.f15154a;
            if (!Color.c(j3, graphicsLayerImpl7.A())) {
                graphicsLayerImpl7.y(j3);
            }
        }
        if ((i3 & 1024) != 0) {
            GraphicsLayer graphicsLayer8 = this.f16494a;
            float f7 = reusableGraphicsLayerScope.f15027m;
            GraphicsLayerImpl graphicsLayerImpl8 = graphicsLayer8.f15154a;
            if (graphicsLayerImpl8.v() != f7) {
                graphicsLayerImpl8.j(f7);
            }
        }
        if ((i3 & 256) != 0) {
            GraphicsLayer graphicsLayer9 = this.f16494a;
            float f8 = reusableGraphicsLayerScope.f15025k;
            GraphicsLayerImpl graphicsLayerImpl9 = graphicsLayer9.f15154a;
            if (graphicsLayerImpl9.K() != f8) {
                graphicsLayerImpl9.h(f8);
            }
        }
        if ((i3 & 512) != 0) {
            GraphicsLayer graphicsLayer10 = this.f16494a;
            float f9 = reusableGraphicsLayerScope.f15026l;
            GraphicsLayerImpl graphicsLayerImpl10 = graphicsLayer10.f15154a;
            if (graphicsLayerImpl10.u() != f9) {
                graphicsLayerImpl10.i(f9);
            }
        }
        if ((i3 & Opcodes.ACC_STRICT) != 0) {
            GraphicsLayer graphicsLayer11 = this.f16494a;
            float f10 = reusableGraphicsLayerScope.f15028n;
            GraphicsLayerImpl graphicsLayerImpl11 = graphicsLayer11.f15154a;
            if (graphicsLayerImpl11.B() != f10) {
                graphicsLayerImpl11.g(f10);
            }
        }
        if (i4 != 0) {
            if (TransformOrigin.a(this.f16507p, TransformOrigin.f15059b)) {
                GraphicsLayer graphicsLayer12 = this.f16494a;
                if (!Offset.d(graphicsLayer12.f15172u, 9205357640488583168L)) {
                    graphicsLayer12.f15172u = 9205357640488583168L;
                    graphicsLayer12.f15154a.G(9205357640488583168L);
                }
            } else {
                GraphicsLayer graphicsLayer13 = this.f16494a;
                long a2 = OffsetKt.a(TransformOrigin.b(this.f16507p) * ((int) (this.f16498g >> 32)), TransformOrigin.c(this.f16507p) * ((int) (this.f16498g & 4294967295L)));
                if (!Offset.d(graphicsLayer13.f15172u, a2)) {
                    graphicsLayer13.f15172u = a2;
                    graphicsLayer13.f15154a.G(a2);
                }
            }
        }
        if ((i3 & 16384) != 0) {
            GraphicsLayer graphicsLayer14 = this.f16494a;
            boolean z3 = reusableGraphicsLayerScope.f15031q;
            GraphicsLayerImpl graphicsLayerImpl12 = graphicsLayer14.f15154a;
            if (graphicsLayerImpl12.b() != z3) {
                graphicsLayerImpl12.x(z3);
                graphicsLayer14.f15158g = true;
                graphicsLayer14.a();
            }
        }
        if ((131072 & i3) != 0) {
            GraphicsLayer graphicsLayer15 = this.f16494a;
            RenderEffect renderEffect = reusableGraphicsLayerScope.f15036v;
            GraphicsLayerImpl graphicsLayerImpl13 = graphicsLayer15.f15154a;
            if (!p0.a.g(graphicsLayerImpl13.r(), renderEffect)) {
                graphicsLayerImpl13.f(renderEffect);
            }
        }
        if ((32768 & i3) != 0) {
            GraphicsLayer graphicsLayer16 = this.f16494a;
            int i5 = reusableGraphicsLayerScope.f15032r;
            if (CompositingStrategy.a(i5, 0)) {
                i2 = 0;
            } else if (CompositingStrategy.a(i5, 1)) {
                i2 = 1;
            } else {
                i2 = 2;
                if (!CompositingStrategy.a(i5, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            GraphicsLayerImpl graphicsLayerImpl14 = graphicsLayer16.f15154a;
            if (!androidx.compose.ui.graphics.layer.CompositingStrategy.a(graphicsLayerImpl14.s(), i2)) {
                graphicsLayerImpl14.L(i2);
            }
        }
        if (!p0.a.g(this.f16508q, reusableGraphicsLayerScope.w)) {
            Outline outline = reusableGraphicsLayerScope.w;
            this.f16508q = outline;
            if (outline != null) {
                GraphicsLayer graphicsLayer17 = this.f16494a;
                if (outline instanceof Outline.Rectangle) {
                    Rect rect = ((Outline.Rectangle) outline).f15001a;
                    graphicsLayer17.h(OffsetKt.a(rect.f14914a, rect.f14915b), SizeKt.a(rect.h(), rect.e()), 0.0f);
                } else if (outline instanceof Outline.Generic) {
                    graphicsLayer17.f15162k = null;
                    graphicsLayer17.f15160i = 9205357640488583168L;
                    graphicsLayer17.f15159h = 0L;
                    graphicsLayer17.f15161j = 0.0f;
                    graphicsLayer17.f15158g = true;
                    graphicsLayer17.f15165n = false;
                    graphicsLayer17.f15163l = ((Outline.Generic) outline).f15000a;
                    graphicsLayer17.a();
                } else if (outline instanceof Outline.Rounded) {
                    Outline.Rounded rounded = (Outline.Rounded) outline;
                    AndroidPath androidPath = rounded.f15003b;
                    if (androidPath != null) {
                        graphicsLayer17.f15162k = null;
                        graphicsLayer17.f15160i = 9205357640488583168L;
                        graphicsLayer17.f15159h = 0L;
                        graphicsLayer17.f15161j = 0.0f;
                        graphicsLayer17.f15158g = true;
                        graphicsLayer17.f15165n = false;
                        graphicsLayer17.f15163l = androidPath;
                        graphicsLayer17.a();
                    } else {
                        RoundRect roundRect = rounded.f15002a;
                        graphicsLayer17.h(OffsetKt.a(roundRect.f14917a, roundRect.f14918b), SizeKt.a(roundRect.b(), roundRect.a()), CornerRadius.b(roundRect.f14922h));
                    }
                }
                if ((outline instanceof Outline.Generic) && Build.VERSION.SDK_INT < 33 && (aVar = this.f16497f) != null) {
                    aVar.invoke();
                }
            }
            z2 = true;
        }
        this.f16506o = reusableGraphicsLayerScope.f15017a;
        if (i3 != 0 || z2) {
            WrapperRenderNodeLayerHelperMethods.f16700a.a(this.f16496c);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i(float[] fArr) {
        float[] l2 = l();
        if (l2 != null) {
            Matrix.f(fArr, l2);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.f16502k || this.f16499h) {
            return;
        }
        AndroidComposeView androidComposeView = this.f16496c;
        androidComposeView.invalidate();
        if (true != this.f16502k) {
            this.f16502k = true;
            androidComposeView.J(this, true);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void j(long j2) {
        GraphicsLayer graphicsLayer = this.f16494a;
        if (!IntOffset.b(graphicsLayer.f15170s, j2)) {
            graphicsLayer.f15170s = j2;
            long j3 = graphicsLayer.f15171t;
            graphicsLayer.f15154a.t((int) (j2 >> 32), (int) (j2 & 4294967295L), j3);
        }
        WrapperRenderNodeLayerHelperMethods.f16700a.a(this.f16496c);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void k() {
        if (this.f16502k) {
            if (!TransformOrigin.a(this.f16507p, TransformOrigin.f15059b) && !IntSize.b(this.f16494a.f15171t, this.f16498g)) {
                GraphicsLayer graphicsLayer = this.f16494a;
                long a2 = OffsetKt.a(TransformOrigin.b(this.f16507p) * ((int) (this.f16498g >> 32)), TransformOrigin.c(this.f16507p) * ((int) (this.f16498g & 4294967295L)));
                if (!Offset.d(graphicsLayer.f15172u, a2)) {
                    graphicsLayer.f15172u = a2;
                    graphicsLayer.f15154a.G(a2);
                }
            }
            this.f16494a.e(this.f16503l, this.f16504m, this.f16498g, this.f16512u);
            if (this.f16502k) {
                this.f16502k = false;
                this.f16496c.J(this, false);
            }
        }
    }

    public final float[] l() {
        float[] m2 = m();
        float[] fArr = this.f16501j;
        if (fArr == null) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            this.f16501j = fArr;
        }
        if (InvertMatrixKt.a(m2, fArr)) {
            return fArr;
        }
        return null;
    }

    public final float[] m() {
        GraphicsLayer graphicsLayer = this.f16494a;
        long b2 = OffsetKt.d(graphicsLayer.f15172u) ? SizeKt.b(IntSizeKt.c(this.f16498g)) : graphicsLayer.f15172u;
        float[] fArr = this.f16500i;
        Matrix.c(fArr);
        float[] fArr2 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        Matrix.g(-Offset.g(b2), -Offset.h(b2), 0.0f, fArr2);
        Matrix.f(fArr, fArr2);
        float[] fArr3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        GraphicsLayerImpl graphicsLayerImpl = graphicsLayer.f15154a;
        Matrix.g(graphicsLayerImpl.J(), graphicsLayerImpl.H(), 0.0f, fArr3);
        double K = (graphicsLayerImpl.K() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(K);
        float sin = (float) Math.sin(K);
        float f2 = fArr3[1];
        float f3 = fArr3[2];
        float f4 = fArr3[5];
        float f5 = fArr3[6];
        float f6 = fArr3[9];
        float f7 = fArr3[10];
        float f8 = fArr3[13];
        float f9 = fArr3[14];
        fArr3[1] = (f2 * cos) - (f3 * sin);
        fArr3[2] = (f3 * cos) + (f2 * sin);
        fArr3[5] = (f4 * cos) - (f5 * sin);
        fArr3[6] = (f5 * cos) + (f4 * sin);
        fArr3[9] = (f6 * cos) - (f7 * sin);
        fArr3[10] = (f7 * cos) + (f6 * sin);
        fArr3[13] = (f8 * cos) - (f9 * sin);
        fArr3[14] = (f9 * cos) + (f8 * sin);
        double u2 = (graphicsLayerImpl.u() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(u2);
        float sin2 = (float) Math.sin(u2);
        float f10 = fArr3[0];
        float f11 = fArr3[2];
        float f12 = fArr3[4];
        float f13 = fArr3[6];
        float f14 = fArr3[8];
        float f15 = fArr3[10];
        float f16 = fArr3[12];
        float f17 = fArr3[14];
        fArr3[0] = (f11 * sin2) + (f10 * cos2);
        fArr3[2] = (f11 * cos2) + ((-f10) * sin2);
        fArr3[4] = (f13 * sin2) + (f12 * cos2);
        fArr3[6] = (f13 * cos2) + ((-f12) * sin2);
        fArr3[8] = (f15 * sin2) + (f14 * cos2);
        fArr3[10] = (f15 * cos2) + ((-f14) * sin2);
        fArr3[12] = (f17 * sin2) + (f16 * cos2);
        fArr3[14] = (f17 * cos2) + ((-f16) * sin2);
        Matrix.d(graphicsLayerImpl.v(), fArr3);
        Matrix.e(graphicsLayerImpl.E(), graphicsLayerImpl.N(), 1.0f, fArr3);
        Matrix.f(fArr, fArr3);
        float[] fArr4 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        Matrix.g(Offset.g(b2), Offset.h(b2), 0.0f, fArr4);
        Matrix.f(fArr, fArr4);
        return fArr;
    }
}
