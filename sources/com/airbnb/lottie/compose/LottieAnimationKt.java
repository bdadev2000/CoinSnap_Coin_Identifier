package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.utils.Utils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.glority.base.utils.StatusBarUtils;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: LottieAnimation.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001aÝ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010&\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010'\u001a\"\u0010(\u001a\u00020)*\u00020*2\u0006\u0010+\u001a\u00020,H\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"LottieAnimation", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipToCompositionBounds", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", TransferTable.COLUMN_SPEED, "iterations", "", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "(Lcom/airbnb/lottie/LottieComposition;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LottieAnimationKt {
    public static final void LottieAnimation(final LottieComposition lottieComposition, final Function0<Float> progress, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, Composer composer, final int i, final int i2, final int i3) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer startRestartGroup = composer.startRestartGroup(-1070242582);
        ComposerKt.sourceInformation(startRestartGroup, "C(LottieAnimation)P(4,12,10,11,1,7,13,9,6!1,5,3,8)");
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        Map<String, ? extends Typeface> map2 = (i3 & 4096) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & 8192) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1070242582, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:75)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LottieDrawable();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final LottieDrawable lottieDrawable = (LottieDrawable) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Matrix();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        final Matrix matrix = (Matrix) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(lottieComposition);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(185151773);
        if (lottieComposition == null || lottieComposition.getDuration() == 0.0f) {
            final Modifier modifier3 = modifier2;
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                composer2 = startRestartGroup;
            } else {
                final boolean z11 = z6;
                final boolean z12 = z7;
                final boolean z13 = z8;
                final RenderMode renderMode3 = renderMode2;
                final boolean z14 = z9;
                final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
                final Alignment alignment2 = center;
                final ContentScale contentScale2 = fit;
                final boolean z15 = z10;
                final Map<String, ? extends Typeface> map3 = map2;
                final AsyncUpdates asyncUpdates3 = asyncUpdates2;
                composer2 = startRestartGroup;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        LottieAnimationKt.LottieAnimation(LottieComposition.this, progress, modifier3, z11, z12, z13, renderMode3, z14, lottieDynamicProperties3, alignment2, contentScale2, z15, map3, asyncUpdates3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
            BoxKt.Box(modifier3, composer2, (i >> 6) & 14);
            return;
        }
        startRestartGroup.endReplaceableGroup();
        float dpScale = Utils.dpScale();
        Modifier m1032sizeVpY3zN4 = SizeKt.m1032sizeVpY3zN4(modifier2, Dp.m6997constructorimpl(lottieComposition.getBounds().width() / dpScale), Dp.m6997constructorimpl(lottieComposition.getBounds().height() / dpScale));
        final ContentScale contentScale3 = fit;
        final Alignment alignment3 = center;
        final boolean z16 = z8;
        final RenderMode renderMode4 = renderMode2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final Map<String, ? extends Typeface> map4 = map2;
        final Modifier modifier4 = modifier2;
        final LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
        final boolean z17 = z6;
        final boolean z18 = z7;
        final boolean z19 = z9;
        final boolean z20 = z10;
        CanvasKt.Canvas(m1032sizeVpY3zN4, new Function1<DrawScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                long m7607timesUQTWf7w;
                LottieDynamicProperties LottieAnimation$lambda$3;
                LottieDynamicProperties LottieAnimation$lambda$32;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                LottieComposition lottieComposition2 = LottieComposition.this;
                ContentScale contentScale4 = contentScale3;
                Alignment alignment4 = alignment3;
                Matrix matrix2 = matrix;
                LottieDrawable lottieDrawable2 = lottieDrawable;
                boolean z21 = z16;
                RenderMode renderMode5 = renderMode4;
                AsyncUpdates asyncUpdates5 = asyncUpdates4;
                Map<String, Typeface> map5 = map4;
                LottieDynamicProperties lottieDynamicProperties5 = lottieDynamicProperties4;
                boolean z22 = z17;
                boolean z23 = z18;
                boolean z24 = z19;
                boolean z25 = z20;
                Function0<Float> function0 = progress;
                MutableState<LottieDynamicProperties> mutableState2 = mutableState;
                Canvas canvas = Canvas.getDrawContext().getCanvas();
                long Size = androidx.compose.ui.geometry.SizeKt.Size(lottieComposition2.getBounds().width(), lottieComposition2.getBounds().height());
                long IntSize = IntSizeKt.IntSize(MathKt.roundToInt(Size.m4343getWidthimpl(Canvas.mo5071getSizeNHjbRc())), MathKt.roundToInt(Size.m4340getHeightimpl(Canvas.mo5071getSizeNHjbRc())));
                long mo5842computeScaleFactorH7hwNQA = contentScale4.mo5842computeScaleFactorH7hwNQA(Size, Canvas.mo5071getSizeNHjbRc());
                m7607timesUQTWf7w = LottieAnimationKt.m7607timesUQTWf7w(Size, mo5842computeScaleFactorH7hwNQA);
                long mo4120alignKFBX0sM = alignment4.mo4120alignKFBX0sM(m7607timesUQTWf7w, IntSize, Canvas.getLayoutDirection());
                matrix2.reset();
                matrix2.preTranslate(IntOffset.m7125getXimpl(mo4120alignKFBX0sM), IntOffset.m7126getYimpl(mo4120alignKFBX0sM));
                matrix2.preScale(ScaleFactor.m5940getScaleXimpl(mo5842computeScaleFactorH7hwNQA), ScaleFactor.m5941getScaleYimpl(mo5842computeScaleFactorH7hwNQA));
                lottieDrawable2.enableMergePathsForKitKatAndAbove(z21);
                lottieDrawable2.setRenderMode(renderMode5);
                lottieDrawable2.setAsyncUpdates(asyncUpdates5);
                lottieDrawable2.setComposition(lottieComposition2);
                lottieDrawable2.setFontMap(map5);
                LottieAnimation$lambda$3 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState2);
                if (lottieDynamicProperties5 != LottieAnimation$lambda$3) {
                    LottieAnimation$lambda$32 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState2);
                    if (LottieAnimation$lambda$32 != null) {
                        LottieAnimation$lambda$32.removeFrom$lottie_compose_release(lottieDrawable2);
                    }
                    if (lottieDynamicProperties5 != null) {
                        lottieDynamicProperties5.addTo$lottie_compose_release(lottieDrawable2);
                    }
                    mutableState2.setValue(lottieDynamicProperties5);
                }
                lottieDrawable2.setOutlineMasksAndMattes(z22);
                lottieDrawable2.setApplyingOpacityToLayersEnabled(z23);
                lottieDrawable2.setMaintainOriginalImageBounds(z24);
                lottieDrawable2.setClipToCompositionBounds(z25);
                lottieDrawable2.setProgress(function0.invoke().floatValue());
                lottieDrawable2.setBounds(0, 0, lottieComposition2.getBounds().width(), lottieComposition2.getBounds().height());
                lottieDrawable2.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix2);
            }
        }, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        final boolean z21 = z6;
        final boolean z22 = z7;
        final boolean z23 = z8;
        final RenderMode renderMode5 = renderMode2;
        final boolean z24 = z9;
        final LottieDynamicProperties lottieDynamicProperties5 = lottieDynamicProperties2;
        final Alignment alignment4 = center;
        final ContentScale contentScale4 = fit;
        final boolean z25 = z10;
        final Map<String, ? extends Typeface> map5 = map2;
        final AsyncUpdates asyncUpdates5 = asyncUpdates2;
        endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i4) {
                LottieAnimationKt.LottieAnimation(LottieComposition.this, progress, modifier4, z21, z22, z23, renderMode5, z24, lottieDynamicProperties5, alignment4, contentScale4, z25, map5, asyncUpdates5, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieDynamicProperties LottieAnimation$lambda$3(MutableState<LottieDynamicProperties> mutableState) {
        return mutableState.getValue();
    }

    @Deprecated(message = "Pass progress as a lambda instead of a float. This overload will be removed in the next release.")
    public static final void LottieAnimation(final LottieComposition lottieComposition, final float f, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, AsyncUpdates asyncUpdates, Composer composer, final int i, final int i2, final int i3) {
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(627485782);
        ComposerKt.sourceInformation(startRestartGroup, "C(LottieAnimation)P(4,11,9,10,1,7,12,8,6!1,5,3)");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        AsyncUpdates asyncUpdates2 = (i3 & 4096) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(627485782, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:140)");
        }
        Float valueOf = Float.valueOf(f);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(valueOf);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            obj = (Function0) new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$4$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    return Float.valueOf(f);
                }
            };
            startRestartGroup.updateRememberedValue(obj);
        } else {
            obj = rememberedValue;
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimation(lottieComposition, (Function0) obj, modifier2, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, null, asyncUpdates2, startRestartGroup, (i & 896) | 134217736 | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (1879048192 & i), (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ((i2 << 3) & 7168), 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final boolean z11 = z6;
        final boolean z12 = z7;
        final boolean z13 = z8;
        final RenderMode renderMode3 = renderMode2;
        final boolean z14 = z9;
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final boolean z15 = z10;
        final AsyncUpdates asyncUpdates3 = asyncUpdates2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                LottieAnimationKt.LottieAnimation(LottieComposition.this, f, modifier2, z11, z12, z13, renderMode3, z14, lottieDynamicProperties3, alignment2, contentScale2, z15, asyncUpdates3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
            }
        });
    }

    public static final void LottieAnimation(final LottieComposition lottieComposition, Modifier modifier, boolean z, boolean z2, LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, RenderMode renderMode, boolean z6, boolean z7, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z8, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, Composer composer, final int i2, final int i3, final int i4) {
        Composer startRestartGroup = composer.startRestartGroup(1541656025);
        ComposerKt.sourceInformation(startRestartGroup, "C(LottieAnimation)P(5,13,10,16,3,18,11,14,1,8,15,17,12,7!1,6,4,9)");
        final Modifier.Companion companion = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z9 = (i4 & 4) != 0 ? true : z;
        boolean z10 = (i4 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i4 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i4 & 32) != 0 ? 1.0f : f;
        int i5 = (i4 & 64) != 0 ? 1 : i;
        boolean z11 = (i4 & 128) != 0 ? false : z3;
        boolean z12 = (i4 & 256) != 0 ? false : z4;
        boolean z13 = (i4 & 512) != 0 ? false : z5;
        RenderMode renderMode2 = (i4 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z14 = (i4 & 2048) != 0 ? false : z6;
        boolean z15 = (i4 & 4096) != 0 ? false : z7;
        LottieDynamicProperties lottieDynamicProperties2 = (i4 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i4 & 16384) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (32768 & i4) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z16 = (65536 & i4) != 0 ? true : z8;
        Map<String, ? extends Typeface> map2 = (131072 & i4) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (262144 & i4) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1541656025, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:181)");
        }
        int i6 = i2 >> 3;
        final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z9, z10, z14, lottieClipSpec2, f2, i5, null, false, false, startRestartGroup, (i6 & 896) | (i6 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | ((i3 << 6) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(animateLottieCompositionAsState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float LottieAnimation$lambda$6;
                    LottieAnimation$lambda$6 = LottieAnimationKt.LottieAnimation$lambda$6(LottieAnimationState.this);
                    return Float.valueOf(LottieAnimation$lambda$6);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Function0 function0 = (Function0) rememberedValue;
        int i7 = i2 >> 12;
        int i8 = i3 << 15;
        int i9 = i3 >> 15;
        Modifier modifier2 = companion;
        boolean z17 = z11;
        boolean z18 = z12;
        boolean z19 = z13;
        RenderMode renderMode3 = renderMode2;
        boolean z20 = z15;
        LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        Alignment alignment2 = center;
        ContentScale contentScale2 = fit;
        boolean z21 = z16;
        Map<String, ? extends Typeface> map3 = map2;
        AsyncUpdates asyncUpdates3 = asyncUpdates2;
        LottieAnimation(lottieComposition, function0, modifier2, z17, z18, z19, renderMode3, z20, lottieDynamicProperties3, alignment2, contentScale2, z21, map3, asyncUpdates3, startRestartGroup, ((i2 << 3) & 896) | 134217736 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | ((i3 << 18) & 3670016) | (29360128 & i8) | (i8 & 1879048192), (i9 & 7168) | (i9 & 14) | 512 | (i9 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final boolean z22 = z10;
        final LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
        final float f3 = f2;
        final int i10 = i5;
        final boolean z23 = z11;
        final boolean z24 = z12;
        final boolean z25 = z13;
        final RenderMode renderMode4 = renderMode2;
        final boolean z26 = z14;
        final boolean z27 = z15;
        final LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
        final Alignment alignment3 = center;
        final ContentScale contentScale3 = fit;
        final boolean z28 = z16;
        final Map<String, ? extends Typeface> map4 = map2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i11) {
                LottieAnimationKt.LottieAnimation(LottieComposition.this, companion, z9, z22, lottieClipSpec3, f3, i10, z23, z24, z25, renderMode4, z26, z27, lottieDynamicProperties4, alignment3, contentScale3, z28, map4, asyncUpdates4, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m7607timesUQTWf7w(long j, long j2) {
        return IntSizeKt.IntSize((int) (Size.m4343getWidthimpl(j) * ScaleFactor.m5940getScaleXimpl(j2)), (int) (Size.m4340getHeightimpl(j) * ScaleFactor.m5941getScaleYimpl(j2)));
    }
}
