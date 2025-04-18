package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {

    /* renamed from: q, reason: collision with root package name */
    public static final q0.p f16620q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final ViewLayer$Companion$OutlineProvider$1 f16621r = new ViewOutlineProvider();

    /* renamed from: s, reason: collision with root package name */
    public static Method f16622s;

    /* renamed from: t, reason: collision with root package name */
    public static Field f16623t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f16624u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f16625v;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f16626a;

    /* renamed from: b, reason: collision with root package name */
    public final DrawChildContainer f16627b;

    /* renamed from: c, reason: collision with root package name */
    public q0.p f16628c;
    public q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public final OutlineResolver f16629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16630g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f16631h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16632i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16633j;

    /* renamed from: k, reason: collision with root package name */
    public final CanvasHolder f16634k;

    /* renamed from: l, reason: collision with root package name */
    public final LayerMatrixCache f16635l;

    /* renamed from: m, reason: collision with root package name */
    public long f16636m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16637n;

    /* renamed from: o, reason: collision with root package name */
    public final long f16638o;

    /* renamed from: p, reason: collision with root package name */
    public int f16639p;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static void a(View view) {
            try {
                if (!ViewLayer.f16624u) {
                    ViewLayer.f16624u = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f16622s = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f16623t = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f16622s = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f16623t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f16622s;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f16623t;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f16623t;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f16622s;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.f16625v = true;
            }
        }
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

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, q0.p pVar, q0.a aVar) {
        super(androidComposeView.getContext());
        this.f16626a = androidComposeView;
        this.f16627b = drawChildContainer;
        this.f16628c = pVar;
        this.d = aVar;
        this.f16629f = new OutlineResolver();
        this.f16634k = new CanvasHolder();
        this.f16635l = new LayerMatrixCache(ViewLayer$Companion$getMatrix$1.f16640a);
        this.f16636m = TransformOrigin.f15059b;
        this.f16637n = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.f16638o = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline()) {
            OutlineResolver outlineResolver = this.f16629f;
            if (!(!outlineResolver.f16549g)) {
                outlineResolver.d();
                return outlineResolver.e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.f16632i) {
            this.f16632i = z2;
            this.f16626a.J(this, z2);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(float[] fArr) {
        Matrix.f(fArr, this.f16635l.b(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long b(long j2, boolean z2) {
        LayerMatrixCache layerMatrixCache = this.f16635l;
        if (!z2) {
            return Matrix.a(layerMatrixCache.b(this), j2);
        }
        float[] a2 = layerMatrixCache.a(this);
        if (a2 != null) {
            return Matrix.a(a2, j2);
        }
        return 9187343241974906880L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void c(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (i2 == getWidth() && i3 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.b(this.f16636m) * i2);
        setPivotY(TransformOrigin.c(this.f16636m) * i3);
        setOutlineProvider(this.f16629f.b() != null ? f16621r : null);
        layout(getLeft(), getTop(), getLeft() + i2, getTop() + i3);
        l();
        this.f16635l.c();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z2 = getElevation() > 0.0f;
        this.f16633j = z2;
        if (z2) {
            canvas.k();
        }
        this.f16627b.a(canvas, this, getDrawingTime());
        if (this.f16633j) {
            canvas.q();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f16626a;
        androidComposeView.C = true;
        this.f16628c = null;
        this.d = null;
        androidComposeView.M(this);
        this.f16627b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z2;
        CanvasHolder canvasHolder = this.f16634k;
        AndroidCanvas androidCanvas = canvasHolder.f14952a;
        android.graphics.Canvas canvas2 = androidCanvas.f14925a;
        androidCanvas.f14925a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z2 = false;
        } else {
            androidCanvas.p();
            this.f16629f.a(androidCanvas);
            z2 = true;
        }
        q0.p pVar = this.f16628c;
        if (pVar != null) {
            pVar.invoke(androidCanvas, null);
        }
        if (z2) {
            androidCanvas.i();
        }
        canvasHolder.f14952a.f14925a = canvas2;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void e(MutableRect mutableRect, boolean z2) {
        LayerMatrixCache layerMatrixCache = this.f16635l;
        if (!z2) {
            Matrix.b(layerMatrixCache.b(this), mutableRect);
            return;
        }
        float[] a2 = layerMatrixCache.a(this);
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
        this.f16627b.addView(this);
        this.f16630g = false;
        this.f16633j = false;
        int i2 = TransformOrigin.f15060c;
        this.f16636m = TransformOrigin.f15059b;
        this.f16628c = pVar;
        this.d = aVar;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j2) {
        Outline outline;
        float g2 = Offset.g(j2);
        float h2 = Offset.h(j2);
        if (this.f16630g) {
            return 0.0f <= g2 && g2 < ((float) getWidth()) && 0.0f <= h2 && h2 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        OutlineResolver outlineResolver = this.f16629f;
        if (outlineResolver.f16555m && (outline = outlineResolver.f16547c) != null) {
            return ShapeContainingUtilKt.a(outline, Offset.g(j2), Offset.h(j2), null, null);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.f16627b;
    }

    public long getLayerId() {
        return this.f16638o;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f16626a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.a(this.f16626a);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        q0.a aVar;
        int i2 = reusableGraphicsLayerScope.f15017a | this.f16639p;
        if ((i2 & 4096) != 0) {
            long j2 = reusableGraphicsLayerScope.f15029o;
            this.f16636m = j2;
            setPivotX(TransformOrigin.b(j2) * getWidth());
            setPivotY(TransformOrigin.c(this.f16636m) * getHeight());
        }
        if ((i2 & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.f15018b);
        }
        if ((i2 & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.f15019c);
        }
        if ((i2 & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.d);
        }
        if ((i2 & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.f15020f);
        }
        if ((i2 & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.f15021g);
        }
        if ((i2 & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.f15022h);
        }
        if ((i2 & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.f15027m);
        }
        if ((i2 & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.f15025k);
        }
        if ((i2 & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.f15026l);
        }
        if ((i2 & Opcodes.ACC_STRICT) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.f15028n);
        }
        boolean z2 = true;
        boolean z3 = getManualClipPath() != null;
        boolean z4 = reusableGraphicsLayerScope.f15031q;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f15014a;
        boolean z5 = z4 && reusableGraphicsLayerScope.f15030p != rectangleShapeKt$RectangleShape$1;
        if ((i2 & 24576) != 0) {
            this.f16630g = z4 && reusableGraphicsLayerScope.f15030p == rectangleShapeKt$RectangleShape$1;
            l();
            setClipToOutline(z5);
        }
        boolean c2 = this.f16629f.c(reusableGraphicsLayerScope.w, reusableGraphicsLayerScope.d, z5, reusableGraphicsLayerScope.f15022h, reusableGraphicsLayerScope.f15033s);
        OutlineResolver outlineResolver = this.f16629f;
        if (outlineResolver.f16548f) {
            setOutlineProvider(outlineResolver.b() != null ? f16621r : null);
        }
        boolean z6 = getManualClipPath() != null;
        if (z3 != z6 || (z6 && c2)) {
            invalidate();
        }
        if (!this.f16633j && getElevation() > 0.0f && (aVar = this.d) != null) {
            aVar.invoke();
        }
        if ((i2 & 7963) != 0) {
            this.f16635l.c();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = i2 & 64;
            ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = ViewLayerVerificationHelper28.f16641a;
            if (i4 != 0) {
                viewLayerVerificationHelper28.a(this, ColorKt.j(reusableGraphicsLayerScope.f15023i));
            }
            if ((i2 & 128) != 0) {
                viewLayerVerificationHelper28.b(this, ColorKt.j(reusableGraphicsLayerScope.f15024j));
            }
        }
        if (i3 >= 31 && (131072 & i2) != 0) {
            ViewLayerVerificationHelper31.f16642a.a(this, reusableGraphicsLayerScope.f15036v);
        }
        if ((i2 & 32768) != 0) {
            int i5 = reusableGraphicsLayerScope.f15032r;
            if (CompositingStrategy.a(i5, 1)) {
                setLayerType(2, null);
            } else if (CompositingStrategy.a(i5, 2)) {
                setLayerType(0, null);
                z2 = false;
            } else {
                setLayerType(0, null);
            }
            this.f16637n = z2;
        }
        this.f16639p = reusableGraphicsLayerScope.f15017a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f16637n;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i(float[] fArr) {
        float[] a2 = this.f16635l.a(this);
        if (a2 != null) {
            Matrix.f(fArr, a2);
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.f16632i) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f16626a.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void j(long j2) {
        int i2 = (int) (j2 >> 32);
        int left = getLeft();
        LayerMatrixCache layerMatrixCache = this.f16635l;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            layerMatrixCache.c();
        }
        int i3 = (int) (j2 & 4294967295L);
        if (i3 != getTop()) {
            offsetTopAndBottom(i3 - getTop());
            layerMatrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void k() {
        if (!this.f16632i || f16625v) {
            return;
        }
        Companion.a(this);
        setInvalidated(false);
    }

    public final void l() {
        Rect rect;
        if (this.f16630g) {
            Rect rect2 = this.f16631h;
            if (rect2 == null) {
                this.f16631h = new Rect(0, 0, getWidth(), getHeight());
            } else {
                p0.a.p(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f16631h;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final void setCameraDistancePx(float f2) {
        setCameraDistance(f2 * getResources().getDisplayMetrics().densityDpi);
    }
}
