package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
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
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

@RequiresApi
/* loaded from: classes3.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {

    /* renamed from: b, reason: collision with root package name */
    public final CanvasHolder f15201b;

    /* renamed from: c, reason: collision with root package name */
    public final CanvasDrawScope f15202c;
    public final RenderNode d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f15203f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15204g;

    /* renamed from: h, reason: collision with root package name */
    public float f15205h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15206i;

    /* renamed from: j, reason: collision with root package name */
    public float f15207j;

    /* renamed from: k, reason: collision with root package name */
    public float f15208k;

    /* renamed from: l, reason: collision with root package name */
    public float f15209l;

    /* renamed from: m, reason: collision with root package name */
    public float f15210m;

    /* renamed from: n, reason: collision with root package name */
    public float f15211n;

    /* renamed from: o, reason: collision with root package name */
    public long f15212o;

    /* renamed from: p, reason: collision with root package name */
    public long f15213p;

    /* renamed from: q, reason: collision with root package name */
    public float f15214q;

    /* renamed from: r, reason: collision with root package name */
    public float f15215r;

    /* renamed from: s, reason: collision with root package name */
    public float f15216s;

    /* renamed from: t, reason: collision with root package name */
    public float f15217t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15218u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15219v;
    public boolean w;
    public RenderEffect x;

    /* renamed from: y, reason: collision with root package name */
    public int f15220y;

    public GraphicsLayerV29() {
        CanvasHolder canvasHolder = new CanvasHolder();
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        this.f15201b = canvasHolder;
        this.f15202c = canvasDrawScope;
        RenderNode e = androidx.compose.ui.graphics.b.e();
        this.d = e;
        this.e = 0L;
        e.setClipToBounds(false);
        Q(e, 0);
        this.f15205h = 1.0f;
        this.f15206i = 3;
        this.f15207j = 1.0f;
        this.f15208k = 1.0f;
        long j2 = Color.f14957b;
        this.f15212o = j2;
        this.f15213p = j2;
        this.f15217t = 8.0f;
        this.f15220y = 0;
    }

    public static void Q(RenderNode renderNode, int i2) {
        if (CompositingStrategy.a(i2, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.a(i2, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long A() {
        return this.f15213p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float B() {
        return this.f15217t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void C(float f2) {
        this.f15211n = f2;
        this.d.setElevation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix D() {
        Matrix matrix = this.f15203f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f15203f = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float E() {
        return this.f15207j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void F(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l lVar) {
        RecordingCanvas beginRecording;
        CanvasDrawScope canvasDrawScope = this.f15202c;
        RenderNode renderNode = this.d;
        beginRecording = renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.f15201b;
            AndroidCanvas androidCanvas = canvasHolder.f14952a;
            Canvas canvas = androidCanvas.f14925a;
            androidCanvas.f14925a = beginRecording;
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.f15134b;
            canvasDrawScope$drawContext$1.h(density);
            canvasDrawScope$drawContext$1.j(layoutDirection);
            canvasDrawScope$drawContext$1.f15140b = graphicsLayer;
            canvasDrawScope$drawContext$1.c(this.e);
            canvasDrawScope$drawContext$1.g(androidCanvas);
            lVar.invoke(canvasDrawScope);
            canvasHolder.f14952a.f14925a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void G(long j2) {
        boolean d = OffsetKt.d(j2);
        RenderNode renderNode = this.d;
        if (d) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Offset.g(j2));
            renderNode.setPivotY(Offset.h(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float H() {
        return this.f15210m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void I() {
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float J() {
        return this.f15209l;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float K() {
        return this.f15214q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void L(int i2) {
        this.f15220y = i2;
        boolean a2 = CompositingStrategy.a(i2, 1);
        RenderNode renderNode = this.d;
        if (a2 || (!BlendMode.a(this.f15206i, 3)) || this.x != null) {
            Q(renderNode, 1);
        } else {
            Q(renderNode, this.f15220y);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float M() {
        return this.f15211n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float N() {
        return this.f15208k;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void O(androidx.compose.ui.graphics.Canvas canvas) {
        AndroidCanvas_androidKt.b(canvas).drawRenderNode(this.d);
    }

    public final void P() {
        boolean z2 = this.f15218u;
        boolean z3 = false;
        boolean z4 = z2 && !this.f15204g;
        if (z2 && this.f15204g) {
            z3 = true;
        }
        boolean z5 = this.f15219v;
        RenderNode renderNode = this.d;
        if (z4 != z5) {
            this.f15219v = z4;
            renderNode.setClipToBounds(z4);
        }
        if (z3 != this.w) {
            this.w = z3;
            renderNode.setClipToOutline(z3);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float a() {
        return this.f15205h;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean b() {
        return this.f15218u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c(float f2) {
        this.f15205h = f2;
        this.d.setAlpha(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f2) {
        this.f15210m = f2;
        this.d.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e(float f2) {
        this.f15207j = f2;
        this.d.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(RenderEffect renderEffect) {
        this.x = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.f15251a.a(this.d, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f2) {
        this.f15217t = f2;
        this.d.setCameraDistance(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void h(float f2) {
        this.f15214q = f2;
        this.d.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void i(float f2) {
        this.f15215r = f2;
        this.d.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void j(float f2) {
        this.f15216s = f2;
        this.d.setRotationZ(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(float f2) {
        this.f15208k = f2;
        this.d.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f2) {
        this.f15209l = f2;
        this.d.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m() {
        this.d.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void n() {
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean o() {
        boolean hasDisplayList;
        hasDisplayList = this.d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int p() {
        return this.f15206i;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void q(Outline outline) {
        this.d.setOutline(outline);
        this.f15204g = outline != null;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final RenderEffect r() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int s() {
        return this.f15220y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(int i2, int i3, long j2) {
        this.d.setPosition(i2, i3, ((int) (j2 >> 32)) + i2, ((int) (4294967295L & j2)) + i3);
        this.e = IntSizeKt.c(j2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float u() {
        return this.f15215r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float v() {
        return this.f15216s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void w(long j2) {
        this.f15212o = j2;
        this.d.setAmbientShadowColor(ColorKt.j(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void x(boolean z2) {
        this.f15218u = z2;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(long j2) {
        this.f15213p = j2;
        this.d.setSpotShadowColor(ColorKt.j(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long z() {
        return this.f15212o;
    }
}
