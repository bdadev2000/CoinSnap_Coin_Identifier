package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u001c\u001a\u00020\f*\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u0010*\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0002J \u0010!\u001a\u00020\u0010*\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0002J \u0010#\u001a\u00020\u0010*\u00020\u001f2\u0006\u0010$\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0002J \u0010%\u001a\u00020\u0010*\u00020\u001f2\u0006\u0010&\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018j\u0002`\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/DrawGlowOverscrollModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "overscrollEffect", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;Landroidx/compose/foundation/OverscrollConfiguration;Lkotlin/jvm/functions/Function1;)V", "drawWithRotationAndOffset", "", "rotationDegrees", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "edgeEffect", "Landroid/widget/EdgeEffect;", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawWithRotationAndOffset-ubNVwUQ", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawBottomGlow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", LogEvents.bottom, "drawLeftGlow", TtmlNode.LEFT, "drawRightGlow", TtmlNode.RIGHT, "drawTopGlow", "top", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DrawGlowOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final OverscrollConfiguration overscrollConfig;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public DrawGlowOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, OverscrollConfiguration overscrollConfiguration, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.overscrollConfig = overscrollConfiguration;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        this.overscrollEffect.m524updateSizeuvyYCjk$foundation_release(contentDrawScope.mo5071getSizeNHjbRc());
        if (Size.m4345isEmptyimpl(contentDrawScope.mo5071getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean drawLeftGlow = edgeEffectWrapper.isLeftAnimating() ? drawLeftGlow(contentDrawScope, edgeEffectWrapper.getOrCreateLeftEffect(), nativeCanvas) : false;
        if (edgeEffectWrapper.isTopAnimating()) {
            drawLeftGlow = drawTopGlow(contentDrawScope, edgeEffectWrapper.getOrCreateTopEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            drawLeftGlow = drawRightGlow(contentDrawScope, edgeEffectWrapper.getOrCreateRightEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            if (!drawBottomGlow(contentDrawScope, edgeEffectWrapper.getOrCreateBottomEffect(), nativeCanvas) && !drawLeftGlow) {
                return;
            }
        } else if (!drawLeftGlow) {
            return;
        }
        this.overscrollEffect.invalidateOverscroll$foundation_release();
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m594drawWithRotationAndOffsetubNVwUQ(270.0f, OffsetKt.Offset(-Size.m4340getHeightimpl(drawScope.mo5071getSizeNHjbRc()), drawScope.mo677toPx0680j_4(this.overscrollConfig.getDrawPadding().mo936calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m594drawWithRotationAndOffsetubNVwUQ(0.0f, OffsetKt.Offset(0.0f, drawScope.mo677toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop())), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m594drawWithRotationAndOffsetubNVwUQ(90.0f, OffsetKt.Offset(0.0f, (-MathKt.roundToInt(Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc()))) + drawScope.mo677toPx0680j_4(this.overscrollConfig.getDrawPadding().mo937calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean drawBottomGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return m594drawWithRotationAndOffsetubNVwUQ(180.0f, OffsetKt.Offset(-Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc()), (-Size.m4340getHeightimpl(drawScope.mo5071getSizeNHjbRc())) + drawScope.mo677toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom())), edgeEffect, canvas);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m594drawWithRotationAndOffsetubNVwUQ(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(Offset.m4274getXimpl(offset), Offset.m4275getYimpl(offset));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
