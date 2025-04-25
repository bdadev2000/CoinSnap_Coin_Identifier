package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GraphicsLayerOwnerLayer.android.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00128\u0010\t\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010=\u001a\u00020\u0010H\u0016J\u001a\u0010>\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0017\u0010?\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010AJ\b\u0010D\u001a\u00020\u0010H\u0016J\u001a\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001a\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020KH\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0017H\u0016J\"\u0010R\u001a\u00020K2\u0006\u0010S\u001a\u00020K2\u0006\u0010Q\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u001a\u0010V\u001a\u00020\u00102\u0006\u0010J\u001a\u00020WH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u001a\u0010Z\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010YJP\u0010\\\u001a\u00020\u001028\u0010\t\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016J\u001a\u0010]\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b^\u0010HJ\b\u0010_\u001a\u00020\u0010H\u0002J\b\u0010`\u001a\u00020\u0010H\u0016J\u0010\u0010a\u001a\u00020\u00102\u0006\u00101\u001a\u00020bH\u0016J\b\u0010c\u001a\u00020\u0010H\u0002J\b\u0010d\u001a\u00020\u0010H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\t\u001a6\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u00020\u0019X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010#R\u001f\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00100.¢\u0006\u0002\b0X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\u000204X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\u00020;X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "context", "Landroidx/compose/ui/graphics/GraphicsContext;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "parentLayer", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "density", "Landroidx/compose/ui/unit/Density;", "drawnWithEnabledZ", "", "inverseMatrixCache", "Landroidx/compose/ui/graphics/Matrix;", "[F", "isDestroyed", "value", "isDirty", "setDirty", "(Z)V", "layerId", "", "getLayerId", "()J", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "matrixCache", "mutatedFields", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "ownerViewId", "getOwnerViewId", "recordLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "scope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", LogEventArguments.ARG_SIZE, "Landroidx/compose/ui/unit/IntSize;", "J", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "tmpPath", "Landroidx/compose/ui/graphics/Path;", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "clipManually", "destroy", "drawLayer", "getInverseMatrix", "getInverseMatrix-3i98HWw", "()[F", "getMatrix", "getMatrix-sQKQjiQ", "invalidate", "inverseTransform", "matrix", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "resize-ozmzZPI", "reuseLayer", "transform", "transform-58bKbWc", "triggerRepaint", "updateDisplayList", "updateLayerProperties", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "updateMatrix", "updateOutline", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;
    private boolean drawnWithEnabledZ;
    private GraphicsLayer graphicsLayer;
    private Function0<Unit> invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private Paint softwareLayerPaint;
    private Path tmpPath;
    private long size = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private final float[] matrixCache = Matrix.m4746constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.INSTANCE.m4906getCenterSzJe1aQ();
    private final Function1<DrawScope, Unit> recordLambda = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Function2 function2;
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = GraphicsLayerOwnerLayer.this;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            function2 = graphicsLayerOwnerLayer.drawBlock;
            if (function2 != null) {
                function2.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope scope) {
        boolean z;
        int m5152getModulateAlphake2Ky5w;
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.setShadowElevation(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.m5166setAmbientShadowColor8_81llA(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.m5172setSpotShadowColor8_81llA(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.setRotationZ(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(scope.getCameraDistance());
        }
        if (i != 0) {
            if (TransformOrigin.m4900equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m4906getCenterSzJe1aQ())) {
                this.graphicsLayer.m5169setPivotOffsetk4lQ0M(Offset.INSTANCE.m4289getUnspecifiedF1C5BW0());
            } else {
                this.graphicsLayer.m5169setPivotOffsetk4lQ0M(OffsetKt.Offset(TransformOrigin.m4901getPivotFractionXimpl(this.transformOrigin) * IntSize.m7167getWidthimpl(this.size), TransformOrigin.m4902getPivotFractionYimpl(this.transformOrigin) * IntSize.m7166getHeightimpl(this.size)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.setClip(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.graphicsLayer.setRenderEffect(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            if (CompositingStrategy.m4600equalsimpl0(compositingStrategy, CompositingStrategy.INSTANCE.m4604getAutoNrFUSI())) {
                m5152getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m5151getAutoke2Ky5w();
            } else if (CompositingStrategy.m4600equalsimpl0(compositingStrategy, CompositingStrategy.INSTANCE.m4606getOffscreenNrFUSI())) {
                m5152getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m5153getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m4600equalsimpl0(compositingStrategy, CompositingStrategy.INSTANCE.m4605getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                m5152getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m5152getModulateAlphake2Ky5w();
            }
            graphicsLayer.m5168setCompositingStrategyWpw9cng(m5152getModulateAlphake2Ky5w);
        }
        if (Intrinsics.areEqual(this.outline, scope.getOutline())) {
            z = false;
        } else {
            this.outline = scope.getOutline();
            updateOutline();
            z = true;
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z) {
            triggerRepaint();
        }
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    private final void updateOutline() {
        Function0<Unit> function0;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo6134isInLayerk4lQ0M(long position) {
        float m4274getXimpl = Offset.m4274getXimpl(position);
        float m4275getYimpl = Offset.m4275getYimpl(position);
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), m4274getXimpl, m4275getYimpl, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo6136movegyyYBs(long position) {
        this.graphicsLayer.m5173setTopLeftgyyYBs(position);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo6137resizeozmzZPI(long size) {
        if (IntSize.m7165equalsimpl0(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
            DrawContext drawContext = this.scope.getDrawContext();
            drawContext.setCanvas(canvas);
            drawContext.setGraphicsLayer(parentLayer);
            GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
            return;
        }
        float m7125getXimpl = IntOffset.m7125getXimpl(this.graphicsLayer.getTopLeft());
        float m7126getYimpl = IntOffset.m7126getYimpl(this.graphicsLayer.getTopLeft());
        float m7167getWidthimpl = m7125getXimpl + IntSize.m7167getWidthimpl(this.size);
        float m7166getHeightimpl = m7126getYimpl + IntSize.m7166getHeightimpl(this.size);
        if (this.graphicsLayer.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.graphicsLayer.getAlpha());
            nativeCanvas.saveLayer(m7125getXimpl, m7126getYimpl, m7167getWidthimpl, m7166getHeightimpl, paint.getInternalPaint());
        } else {
            canvas.save();
        }
        canvas.translate(m7125getXimpl, m7126getYimpl);
        canvas.mo4370concat58bKbWc(m6215getMatrixsQKQjiQ());
        if (this.graphicsLayer.getClip()) {
            clipManually(canvas);
        }
        Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.restore();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m4900equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m4906getCenterSzJe1aQ()) && !IntSize.m7165equalsimpl0(this.graphicsLayer.getSize(), this.size)) {
                this.graphicsLayer.m5169setPivotOffsetk4lQ0M(OffsetKt.Offset(TransformOrigin.m4901getPivotFractionXimpl(this.transformOrigin) * IntSize.m7167getWidthimpl(this.size), TransformOrigin.m4902getPivotFractionYimpl(this.transformOrigin) * IntSize.m7166getHeightimpl(this.size)));
            }
            this.graphicsLayer.m5165recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo6135mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse) {
            float[] m6214getInverseMatrix3i98HWw = m6214getInverseMatrix3i98HWw();
            return m6214getInverseMatrix3i98HWw != null ? Matrix.m4752mapMKHz9U(m6214getInverseMatrix3i98HWw, point) : Offset.INSTANCE.m4288getInfiniteF1C5BW0();
        }
        return Matrix.m4752mapMKHz9U(m6215getMatrixsQKQjiQ(), point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        if (inverse) {
            float[] m6214getInverseMatrix3i98HWw = m6214getInverseMatrix3i98HWw();
            if (m6214getInverseMatrix3i98HWw == null) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                Matrix.m4754mapimpl(m6214getInverseMatrix3i98HWw, rect);
                return;
            }
        }
        Matrix.m4754mapimpl(m6215getMatrixsQKQjiQ(), rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle".toString());
        }
        if (!this.graphicsLayer.getIsReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse".toString());
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.transformOrigin = TransformOrigin.INSTANCE.m4906getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        this.size = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo6138transform58bKbWc(float[] matrix) {
        Matrix.m4763timesAssign58bKbWc(matrix, m6215getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo6133inverseTransform58bKbWc(float[] matrix) {
        float[] m6214getInverseMatrix3i98HWw = m6214getInverseMatrix3i98HWw();
        if (m6214getInverseMatrix3i98HWw != null) {
            Matrix.m4763timesAssign58bKbWc(matrix, m6214getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m6215getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m6214getInverseMatrix3i98HWw() {
        float[] m6215getMatrixsQKQjiQ = m6215getMatrixsQKQjiQ();
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = Matrix.m4746constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (InvertMatrixKt.m6216invertToJiSxe2E(m6215getMatrixsQKQjiQ, fArr)) {
            return fArr;
        }
        return null;
    }

    private final void updateMatrix() {
        long pivotOffset;
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (OffsetKt.m4295isUnspecifiedk4lQ0M(graphicsLayer.getPivotOffset())) {
            pivotOffset = SizeKt.m4353getCenteruvyYCjk(IntSizeKt.m7179toSizeozmzZPI(this.size));
        } else {
            pivotOffset = graphicsLayer.getPivotOffset();
        }
        Matrix.m4755resetimpl(this.matrixCache);
        float[] fArr = this.matrixCache;
        float[] m4746constructorimpl$default = Matrix.m4746constructorimpl$default(null, 1, null);
        Matrix.m4766translateimpl$default(m4746constructorimpl$default, -Offset.m4274getXimpl(pivotOffset), -Offset.m4275getYimpl(pivotOffset), 0.0f, 4, null);
        Matrix.m4763timesAssign58bKbWc(fArr, m4746constructorimpl$default);
        float[] fArr2 = this.matrixCache;
        float[] m4746constructorimpl$default2 = Matrix.m4746constructorimpl$default(null, 1, null);
        Matrix.m4766translateimpl$default(m4746constructorimpl$default2, graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 0.0f, 4, null);
        Matrix.m4756rotateXimpl(m4746constructorimpl$default2, graphicsLayer.getRotationX());
        Matrix.m4757rotateYimpl(m4746constructorimpl$default2, graphicsLayer.getRotationY());
        Matrix.m4758rotateZimpl(m4746constructorimpl$default2, graphicsLayer.getRotationZ());
        Matrix.m4760scaleimpl$default(m4746constructorimpl$default2, graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 0.0f, 4, null);
        Matrix.m4763timesAssign58bKbWc(fArr2, m4746constructorimpl$default2);
        float[] fArr3 = this.matrixCache;
        float[] m4746constructorimpl$default3 = Matrix.m4746constructorimpl$default(null, 1, null);
        Matrix.m4766translateimpl$default(m4746constructorimpl$default3, Offset.m4274getXimpl(pivotOffset), Offset.m4275getYimpl(pivotOffset), 0.0f, 4, null);
        Matrix.m4763timesAssign58bKbWc(fArr3, m4746constructorimpl$default3);
    }

    private final void clipManually(Canvas canvas) {
        if (this.graphicsLayer.getClip()) {
            Outline outline = this.graphicsLayer.getOutline();
            if (outline instanceof Outline.Rectangle) {
                Canvas.m4488clipRectmtrdDE$default(canvas, ((Outline.Rectangle) outline).getRect(), 0, 2, null);
                return;
            }
            if (outline instanceof Outline.Rounded) {
                Path path = this.tmpPath;
                if (path == null) {
                    path = AndroidPath_androidKt.Path();
                    this.tmpPath = path;
                }
                path.reset();
                Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                Canvas.m4486clipPathmtrdDE$default(canvas, path, 0, 2, null);
                return;
            }
            if (outline instanceof Outline.Generic) {
                Canvas.m4486clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
    }
}
