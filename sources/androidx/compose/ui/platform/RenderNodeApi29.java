package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class RenderNodeApi29 implements DeviceRenderNode {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f16570a = i.c();

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void A(Matrix matrix) {
        this.f16570a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void B(int i2) {
        this.f16570a.offsetLeftAndRight(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int C() {
        int bottom;
        bottom = this.f16570a.getBottom();
        return bottom;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void D(float f2) {
        this.f16570a.setPivotX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void E(float f2) {
        this.f16570a.setPivotY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void F(int i2) {
        this.f16570a.setAmbientShadowColor(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int G() {
        int right;
        right = this.f16570a.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void H(boolean z2) {
        this.f16570a.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void I(int i2) {
        this.f16570a.setSpotShadowColor(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float J() {
        float elevation;
        elevation = this.f16570a.getElevation();
        return elevation;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final float a() {
        float alpha;
        alpha = this.f16570a.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void b(Canvas canvas) {
        canvas.drawRenderNode(this.f16570a);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void c(float f2) {
        this.f16570a.setAlpha(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void d(float f2) {
        this.f16570a.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void e(float f2) {
        this.f16570a.setScaleX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void f(RenderEffect renderEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.f16571a.a(this.f16570a, renderEffect);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void g(float f2) {
        this.f16570a.setCameraDistance(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getHeight() {
        int height;
        height = this.f16570a.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int getWidth() {
        int width;
        width = this.f16570a.getWidth();
        return width;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void h(float f2) {
        this.f16570a.setRotationX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void i(float f2) {
        this.f16570a.setRotationY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void j(float f2) {
        this.f16570a.setRotationZ(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void k(float f2) {
        this.f16570a.setScaleY(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void l(float f2) {
        this.f16570a.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void m() {
        this.f16570a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int n() {
        int left;
        left = this.f16570a.getLeft();
        return left;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean o() {
        boolean hasDisplayList;
        hasDisplayList = this.f16570a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void p(boolean z2) {
        this.f16570a.setClipToBounds(z2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void q(Outline outline) {
        this.f16570a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean r(int i2, int i3, int i4, int i5) {
        boolean position;
        position = this.f16570a.setPosition(i2, i3, i4, i5);
        return position;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void s(float f2) {
        this.f16570a.setElevation(f2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void t(int i2) {
        boolean a2 = CompositingStrategy.a(i2, 1);
        RenderNode renderNode = this.f16570a;
        if (a2) {
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

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void u(int i2) {
        this.f16570a.offsetTopAndBottom(i2);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean v() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f16570a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean w() {
        boolean clipToBounds;
        clipToBounds = this.f16570a.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final int x() {
        int top;
        top = this.f16570a.getTop();
        return top;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final boolean y() {
        boolean clipToOutline;
        clipToOutline = this.f16570a.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public final void z(CanvasHolder canvasHolder, Path path, q0.l lVar) {
        RecordingCanvas beginRecording;
        RenderNode renderNode = this.f16570a;
        beginRecording = renderNode.beginRecording();
        AndroidCanvas androidCanvas = canvasHolder.f14952a;
        Canvas canvas = androidCanvas.f14925a;
        androidCanvas.f14925a = beginRecording;
        if (path != null) {
            androidCanvas.p();
            androidCanvas.g(path, 1);
        }
        ((RenderNodeLayer$updateDisplayList$1$1) lVar).invoke(androidCanvas);
        if (path != null) {
            androidCanvas.i();
        }
        canvasHolder.f14952a.f14925a = canvas;
        renderNode.endRecording();
    }
}
