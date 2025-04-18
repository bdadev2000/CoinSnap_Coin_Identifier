package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    /* renamed from: o, reason: collision with root package name */
    public static final q0.p f16572o = null;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f16573a;

    /* renamed from: b, reason: collision with root package name */
    public q0.p f16574b;

    /* renamed from: c, reason: collision with root package name */
    public q0.a f16575c;
    public boolean d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16577g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16578h;

    /* renamed from: i, reason: collision with root package name */
    public AndroidPaint f16579i;

    /* renamed from: m, reason: collision with root package name */
    public final DeviceRenderNode f16583m;

    /* renamed from: n, reason: collision with root package name */
    public int f16584n;

    /* renamed from: f, reason: collision with root package name */
    public final OutlineResolver f16576f = new OutlineResolver();

    /* renamed from: j, reason: collision with root package name */
    public final LayerMatrixCache f16580j = new LayerMatrixCache(RenderNodeLayer$Companion$getMatrix$1.f16585a);

    /* renamed from: k, reason: collision with root package name */
    public final CanvasHolder f16581k = new CanvasHolder();

    /* renamed from: l, reason: collision with root package name */
    public long f16582l = TransformOrigin.f15059b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class UniqueDrawingIdApi29 {
        @DoNotInline
        public static final long a(@NotNull View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, q0.p pVar, q0.a aVar) {
        this.f16573a = androidComposeView;
        this.f16574b = pVar;
        this.f16575c = aVar;
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29() : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.v();
        renderNodeApi29.p(false);
        this.f16583m = renderNodeApi29;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(float[] fArr) {
        Matrix.f(fArr, this.f16580j.b(this.f16583m));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long b(long j2, boolean z2) {
        DeviceRenderNode deviceRenderNode = this.f16583m;
        LayerMatrixCache layerMatrixCache = this.f16580j;
        if (!z2) {
            return Matrix.a(layerMatrixCache.b(deviceRenderNode), j2);
        }
        float[] a2 = layerMatrixCache.a(deviceRenderNode);
        if (a2 != null) {
            return Matrix.a(a2, j2);
        }
        return 9187343241974906880L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void c(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        float b2 = TransformOrigin.b(this.f16582l) * i2;
        DeviceRenderNode deviceRenderNode = this.f16583m;
        deviceRenderNode.D(b2);
        deviceRenderNode.E(TransformOrigin.c(this.f16582l) * i3);
        if (deviceRenderNode.r(deviceRenderNode.n(), deviceRenderNode.x(), deviceRenderNode.n() + i2, deviceRenderNode.x() + i3)) {
            deviceRenderNode.q(this.f16576f.b());
            if (!this.d && !this.f16577g) {
                this.f16573a.invalidate();
                l(true);
            }
            this.f16580j.c();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas b2 = AndroidCanvas_androidKt.b(canvas);
        boolean isHardwareAccelerated = b2.isHardwareAccelerated();
        DeviceRenderNode deviceRenderNode = this.f16583m;
        if (isHardwareAccelerated) {
            k();
            boolean z2 = deviceRenderNode.J() > 0.0f;
            this.f16578h = z2;
            if (z2) {
                canvas.k();
            }
            deviceRenderNode.b(b2);
            if (this.f16578h) {
                canvas.q();
                return;
            }
            return;
        }
        float n2 = deviceRenderNode.n();
        float x = deviceRenderNode.x();
        float G = deviceRenderNode.G();
        float C = deviceRenderNode.C();
        if (deviceRenderNode.a() < 1.0f) {
            AndroidPaint androidPaint = this.f16579i;
            if (androidPaint == null) {
                androidPaint = AndroidPaint_androidKt.a();
                this.f16579i = androidPaint;
            }
            androidPaint.c(deviceRenderNode.a());
            b2.saveLayer(n2, x, G, C, androidPaint.f14933a);
        } else {
            canvas.p();
        }
        canvas.h(n2, x);
        canvas.r(this.f16580j.b(deviceRenderNode));
        if (deviceRenderNode.y() || deviceRenderNode.w()) {
            this.f16576f.a(canvas);
        }
        q0.p pVar = this.f16574b;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.i();
        l(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        DeviceRenderNode deviceRenderNode = this.f16583m;
        if (deviceRenderNode.o()) {
            deviceRenderNode.m();
        }
        this.f16574b = null;
        this.f16575c = null;
        this.f16577g = true;
        l(false);
        AndroidComposeView androidComposeView = this.f16573a;
        androidComposeView.C = true;
        androidComposeView.M(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void e(MutableRect mutableRect, boolean z2) {
        DeviceRenderNode deviceRenderNode = this.f16583m;
        LayerMatrixCache layerMatrixCache = this.f16580j;
        if (!z2) {
            Matrix.b(layerMatrixCache.b(deviceRenderNode), mutableRect);
            return;
        }
        float[] a2 = layerMatrixCache.a(deviceRenderNode);
        if (a2 != null) {
            Matrix.b(a2, mutableRect);
            return;
        }
        mutableRect.f14910a = 0.0f;
        mutableRect.f14911b = 0.0f;
        mutableRect.f14912c = 0.0f;
        mutableRect.d = 0.0f;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void f(q0.p pVar, q0.a aVar) {
        l(false);
        this.f16577g = false;
        this.f16578h = false;
        this.f16582l = TransformOrigin.f15059b;
        this.f16574b = pVar;
        this.f16575c = aVar;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j2) {
        Outline outline;
        float g2 = Offset.g(j2);
        float h2 = Offset.h(j2);
        DeviceRenderNode deviceRenderNode = this.f16583m;
        if (deviceRenderNode.w()) {
            return 0.0f <= g2 && g2 < ((float) deviceRenderNode.getWidth()) && 0.0f <= h2 && h2 < ((float) deviceRenderNode.getHeight());
        }
        if (!deviceRenderNode.y()) {
            return true;
        }
        OutlineResolver outlineResolver = this.f16576f;
        if (outlineResolver.f16555m && (outline = outlineResolver.f16547c) != null) {
            return ShapeContainingUtilKt.a(outline, Offset.g(j2), Offset.h(j2), null, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        q0.a aVar;
        int i2 = reusableGraphicsLayerScope.f15017a | this.f16584n;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.f16582l = reusableGraphicsLayerScope.f15029o;
        }
        DeviceRenderNode deviceRenderNode = this.f16583m;
        boolean y2 = deviceRenderNode.y();
        OutlineResolver outlineResolver = this.f16576f;
        boolean z2 = y2 && !(outlineResolver.f16549g ^ true);
        if ((i2 & 1) != 0) {
            deviceRenderNode.e(reusableGraphicsLayerScope.f15018b);
        }
        if ((i2 & 2) != 0) {
            deviceRenderNode.k(reusableGraphicsLayerScope.f15019c);
        }
        if ((i2 & 4) != 0) {
            deviceRenderNode.c(reusableGraphicsLayerScope.d);
        }
        if ((i2 & 8) != 0) {
            deviceRenderNode.l(reusableGraphicsLayerScope.f15020f);
        }
        if ((i2 & 16) != 0) {
            deviceRenderNode.d(reusableGraphicsLayerScope.f15021g);
        }
        if ((i2 & 32) != 0) {
            deviceRenderNode.s(reusableGraphicsLayerScope.f15022h);
        }
        if ((i2 & 64) != 0) {
            deviceRenderNode.F(ColorKt.j(reusableGraphicsLayerScope.f15023i));
        }
        if ((i2 & 128) != 0) {
            deviceRenderNode.I(ColorKt.j(reusableGraphicsLayerScope.f15024j));
        }
        if ((i2 & 1024) != 0) {
            deviceRenderNode.j(reusableGraphicsLayerScope.f15027m);
        }
        if ((i2 & 256) != 0) {
            deviceRenderNode.h(reusableGraphicsLayerScope.f15025k);
        }
        if ((i2 & 512) != 0) {
            deviceRenderNode.i(reusableGraphicsLayerScope.f15026l);
        }
        if ((i2 & Opcodes.ACC_STRICT) != 0) {
            deviceRenderNode.g(reusableGraphicsLayerScope.f15028n);
        }
        if (i3 != 0) {
            deviceRenderNode.D(TransformOrigin.b(this.f16582l) * deviceRenderNode.getWidth());
            deviceRenderNode.E(TransformOrigin.c(this.f16582l) * deviceRenderNode.getHeight());
        }
        boolean z3 = reusableGraphicsLayerScope.f15031q;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f15014a;
        boolean z4 = z3 && reusableGraphicsLayerScope.f15030p != rectangleShapeKt$RectangleShape$1;
        if ((i2 & 24576) != 0) {
            deviceRenderNode.H(z4);
            deviceRenderNode.p(reusableGraphicsLayerScope.f15031q && reusableGraphicsLayerScope.f15030p == rectangleShapeKt$RectangleShape$1);
        }
        if ((131072 & i2) != 0) {
            deviceRenderNode.f(reusableGraphicsLayerScope.f15036v);
        }
        if ((32768 & i2) != 0) {
            deviceRenderNode.t(reusableGraphicsLayerScope.f15032r);
        }
        boolean c2 = this.f16576f.c(reusableGraphicsLayerScope.w, reusableGraphicsLayerScope.d, z4, reusableGraphicsLayerScope.f15022h, reusableGraphicsLayerScope.f15033s);
        if (outlineResolver.f16548f) {
            deviceRenderNode.q(outlineResolver.b());
        }
        boolean z5 = z4 && !(outlineResolver.f16549g ^ true);
        AndroidComposeView androidComposeView = this.f16573a;
        if (z2 == z5 && (!z5 || !c2)) {
            WrapperRenderNodeLayerHelperMethods.f16700a.a(androidComposeView);
        } else if (!this.d && !this.f16577g) {
            androidComposeView.invalidate();
            l(true);
        }
        if (!this.f16578h && deviceRenderNode.J() > 0.0f && (aVar = this.f16575c) != null) {
            aVar.invoke();
        }
        if ((i2 & 7963) != 0) {
            this.f16580j.c();
        }
        this.f16584n = reusableGraphicsLayerScope.f15017a;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i(float[] fArr) {
        float[] a2 = this.f16580j.a(this.f16583m);
        if (a2 != null) {
            Matrix.f(fArr, a2);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.d || this.f16577g) {
            return;
        }
        this.f16573a.invalidate();
        l(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void j(long j2) {
        DeviceRenderNode deviceRenderNode = this.f16583m;
        int n2 = deviceRenderNode.n();
        int x = deviceRenderNode.x();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (n2 == i2 && x == i3) {
            return;
        }
        if (n2 != i2) {
            deviceRenderNode.B(i2 - n2);
        }
        if (x != i3) {
            deviceRenderNode.u(i3 - x);
        }
        WrapperRenderNodeLayerHelperMethods.f16700a.a(this.f16573a);
        this.f16580j.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // androidx.compose.ui.node.OwnedLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r4 = this;
            boolean r0 = r4.d
            androidx.compose.ui.platform.DeviceRenderNode r1 = r4.f16583m
            if (r0 != 0) goto Lc
            boolean r0 = r1.o()
            if (r0 != 0) goto L33
        Lc:
            boolean r0 = r1.y()
            if (r0 == 0) goto L20
            androidx.compose.ui.platform.OutlineResolver r0 = r4.f16576f
            boolean r2 = r0.f16549g
            r2 = r2 ^ 1
            if (r2 != 0) goto L20
            r0.d()
            androidx.compose.ui.graphics.Path r0 = r0.e
            goto L21
        L20:
            r0 = 0
        L21:
            q0.p r2 = r4.f16574b
            if (r2 == 0) goto L2f
            androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1 r3 = new androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
            r3.<init>(r2)
            androidx.compose.ui.graphics.CanvasHolder r2 = r4.f16581k
            r1.z(r2, r0, r3)
        L2f:
            r0 = 0
            r4.l(r0)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.RenderNodeLayer.k():void");
    }

    public final void l(boolean z2) {
        if (z2 != this.d) {
            this.d = z2;
            this.f16573a.J(this, z2);
        }
    }
}
