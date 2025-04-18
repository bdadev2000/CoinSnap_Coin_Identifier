package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes3.dex */
public final class ViewLayer extends View {

    /* renamed from: l, reason: collision with root package name */
    public static final ViewLayer$Companion$LayerOutlineProvider$1 f15255l = new ViewOutlineProvider();

    /* renamed from: a, reason: collision with root package name */
    public final View f15256a;

    /* renamed from: b, reason: collision with root package name */
    public final CanvasHolder f15257b;

    /* renamed from: c, reason: collision with root package name */
    public final CanvasDrawScope f15258c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public Outline f15259f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15260g;

    /* renamed from: h, reason: collision with root package name */
    public Density f15261h;

    /* renamed from: i, reason: collision with root package name */
    public LayoutDirection f15262i;

    /* renamed from: j, reason: collision with root package name */
    public l f15263j;

    /* renamed from: k, reason: collision with root package name */
    public GraphicsLayer f15264k;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.f15256a = view;
        this.f15257b = canvasHolder;
        this.f15258c = canvasDrawScope;
        setOutlineProvider(f15255l);
        this.f15260g = true;
        this.f15261h = DrawContextKt.f15143a;
        this.f15262i = LayoutDirection.f17494a;
        GraphicsLayerImpl.f15177a.getClass();
        this.f15263j = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.f15179a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.f15257b;
        AndroidCanvas androidCanvas = canvasHolder.f14952a;
        Canvas canvas2 = androidCanvas.f14925a;
        androidCanvas.f14925a = canvas;
        Density density = this.f15261h;
        LayoutDirection layoutDirection = this.f15262i;
        long a2 = SizeKt.a(getWidth(), getHeight());
        GraphicsLayer graphicsLayer = this.f15264k;
        l lVar = this.f15263j;
        CanvasDrawScope canvasDrawScope = this.f15258c;
        Density d = canvasDrawScope.f15134b.d();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.f15134b;
        LayoutDirection f2 = canvasDrawScope$drawContext$1.f();
        androidx.compose.ui.graphics.Canvas a3 = canvasDrawScope$drawContext$1.a();
        long b2 = canvasDrawScope$drawContext$1.b();
        GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$1.f15140b;
        canvasDrawScope$drawContext$1.h(density);
        canvasDrawScope$drawContext$1.j(layoutDirection);
        canvasDrawScope$drawContext$1.g(androidCanvas);
        canvasDrawScope$drawContext$1.c(a2);
        canvasDrawScope$drawContext$1.f15140b = graphicsLayer;
        androidCanvas.p();
        try {
            lVar.invoke(canvasDrawScope);
            androidCanvas.i();
            canvasDrawScope$drawContext$1.h(d);
            canvasDrawScope$drawContext$1.j(f2);
            canvasDrawScope$drawContext$1.g(a3);
            canvasDrawScope$drawContext$1.c(b2);
            canvasDrawScope$drawContext$1.f15140b = graphicsLayer2;
            canvasHolder.f14952a.f14925a = canvas2;
            this.d = false;
        } catch (Throwable th) {
            androidCanvas.i();
            canvasDrawScope$drawContext$1.h(d);
            canvasDrawScope$drawContext$1.j(f2);
            canvasDrawScope$drawContext$1.g(a3);
            canvasDrawScope$drawContext$1.c(b2);
            canvasDrawScope$drawContext$1.f15140b = graphicsLayer2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f15260g;
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.f15257b;
    }

    @NotNull
    public final View getOwnerView() {
        return this.f15256a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f15260g;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z2) {
        if (this.f15260g != z2) {
            this.f15260g = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.d = z2;
    }
}
