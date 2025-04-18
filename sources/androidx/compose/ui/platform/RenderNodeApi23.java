package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f16565g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f16566a;

    /* renamed from: b, reason: collision with root package name */
    public int f16567b;

    /* renamed from: c, reason: collision with root package name */
    public int f16568c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16569f;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.f16566a = create;
        if (f16565g) {
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
                RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.f16588a;
                renderNodeVerificationHelper28.c(create, renderNodeVerificationHelper28.a(create));
                renderNodeVerificationHelper28.d(create, renderNodeVerificationHelper28.b(create));
            }
            RenderNodeVerificationHelper24.f16587a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f16565g = false;
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void A(Matrix matrix) {
        this.f16566a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void B(int i2) {
        this.f16567b += i2;
        this.d += i2;
        this.f16566a.offsetLeftAndRight(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int C() {
        return this.e;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void D(float f2) {
        this.f16566a.setPivotX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void E(float f2) {
        this.f16566a.setPivotY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void F(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.f16588a.c(this.f16566a, i2);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int G() {
        return this.d;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void H(boolean z2) {
        this.f16566a.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void I(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.f16588a.d(this.f16566a, i2);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float J() {
        return this.f16566a.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float a() {
        return this.f16566a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void b(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f16566a);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void c(float f2) {
        this.f16566a.setAlpha(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void d(float f2) {
        this.f16566a.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void e(float f2) {
        this.f16566a.setScaleX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void f(RenderEffect renderEffect) {
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void g(float f2) {
        this.f16566a.setCameraDistance(-f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        return this.e - this.f16568c;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        return this.d - this.f16567b;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void h(float f2) {
        this.f16566a.setRotationX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void i(float f2) {
        this.f16566a.setRotationY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void j(float f2) {
        this.f16566a.setRotation(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void k(float f2) {
        this.f16566a.setScaleY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void l(float f2) {
        this.f16566a.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void m() {
        RenderNodeVerificationHelper24.f16587a.a(this.f16566a);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int n() {
        return this.f16567b;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean o() {
        return this.f16566a.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void p(boolean z2) {
        this.f16569f = z2;
        this.f16566a.setClipToBounds(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void q(Outline outline) {
        this.f16566a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean r(int i2, int i3, int i4, int i5) {
        this.f16567b = i2;
        this.f16568c = i3;
        this.d = i4;
        this.e = i5;
        return this.f16566a.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void s(float f2) {
        this.f16566a.setElevation(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void t(int i2) {
        boolean a2 = CompositingStrategy.a(i2, 1);
        RenderNode renderNode = this.f16566a;
        if (a2) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.a(i2, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void u(int i2) {
        this.f16568c += i2;
        this.e += i2;
        this.f16566a.offsetTopAndBottom(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean v() {
        return this.f16566a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean w() {
        return this.f16569f;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int x() {
        return this.f16568c;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean y() {
        return this.f16566a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void z(CanvasHolder canvasHolder, Path path, q0.l lVar) {
        int width = getWidth();
        int height = getHeight();
        RenderNode renderNode = this.f16566a;
        DisplayListCanvas start = renderNode.start(width, height);
        Canvas w = canvasHolder.a().w();
        canvasHolder.a().x((Canvas) start);
        AndroidCanvas a2 = canvasHolder.a();
        if (path != null) {
            a2.p();
            a2.g(path, 1);
        }
        ((RenderNodeLayer$updateDisplayList$1$1) lVar).invoke(a2);
        if (path != null) {
            a2.i();
        }
        canvasHolder.a().x(w);
        renderNode.end(start);
    }
}
