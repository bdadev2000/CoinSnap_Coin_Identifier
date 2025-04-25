package androidx.constraintlayout.compose;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: MotionLayout.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\b\u0004\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\b\u0004\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\n\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\"2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\b\u0004\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010#\u001a£\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0002\u00100\u001a\u0084\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a¤\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\"2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\b\u0010%\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0002\u00108\u001a\u0015\u00109\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010:\u001a\\\u0010;\u001a\u00020<2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010=2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020@2\u0006\u00106\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u001a4\u0010C\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020(X\u008a\u008e\u0002"}, d2 = {"MotionLayout", "", "start", "Landroidx/constraintlayout/compose/ConstraintSet;", TtmlNode.END, "progress", "", "modifier", "Landroidx/compose/ui/Modifier;", "transition", "Landroidx/constraintlayout/compose/Transition;", "debugFlags", "Landroidx/constraintlayout/compose/DebugFlags;", "optimizationLevel", "", "invalidationStrategy", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "MotionLayout-T3LJ6Qw", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;FLandroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/Transition;IILandroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "motionScene", "Landroidx/constraintlayout/compose/MotionScene;", Args.transitionName, "", "MotionLayout-6oYECBM", "(Landroidx/constraintlayout/compose/MotionScene;FLandroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSetName", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedAnimationListener", "Lkotlin/Function0;", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IILandroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", "informationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "showBounds", "", "showPaths", "showKeyPositions", "contentTracker", "Landroidx/compose/runtime/MutableState;", "compositionSource", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLandroidx/constraintlayout/compose/LayoutInformationReceiver;IZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore-SehEMGo", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/lang/String;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "MotionLayoutCore-TEds9UA", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "UpdateWithForcedIfNoUserChange", Key.MOTIONPROGRESS, "Landroidx/compose/runtime/MutableFloatState;", "(Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/runtime/Composer;I)V", "createAndUpdateMotionProgress", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableFloatState;", "motionLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/runtime/State;", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/TransitionImpl;", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "motionDebug", "scaleFactor", "constraintlayout-compose_release", "animateToEnd"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class MotionLayoutKt {
    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m7413MotionLayoutT3LJ6Qw(ConstraintSet constraintSet, ConstraintSet constraintSet2, float f, Modifier modifier, Transition transition, int i, int i2, InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -531105279, "CC(MotionLayout)P(7,2,6,4,8,1:androidx.constraintlayout.compose.DebugFlags,5,3)143@6062L53,144@6144L93,149@6399L627,164@7031L556:MotionLayout.kt#fysre8");
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Transition transition2 = (i4 & 16) != 0 ? null : transition;
        int m7356getNonebfy_xzQ = (i4 & 32) != 0 ? DebugFlags.INSTANCE.m7356getNonebfy_xzQ() : i;
        int i5 = (i4 & 64) != 0 ? 257 : i2;
        final InvalidationStrategy defaultInvalidationStrategy = (i4 & 128) != 0 ? InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy() : invalidationStrategy;
        ComposerKt.sourceInformationMarkerStart(composer, 1692700147, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1692702811, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        ComposerKt.sourceInformationMarkerEnd(composer);
        MotionLayoutCore(constraintSet, constraintSet2, transition2, f, null, i5, DebugFlags.m7349getShowBoundsimpl(m7356getNonebfy_xzQ), DebugFlags.m7351getShowPathsimpl(m7356getNonebfy_xzQ), DebugFlags.m7350getShowKeyPositionsimpl(m7356getNonebfy_xzQ), modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i6) {
                ComposerKt.sourceInformation(composer2, "C162@7011L9:MotionLayout.kt#fysre8");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(284503157, i6, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:152)");
                }
                mutableState.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                function3.invoke(motionLayoutScope, composer2, Integer.valueOf(i6 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i3 & 14) | 24576 | (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ((i3 >> 6) & 896) | ((i3 << 3) & 7168) | ((i3 >> 3) & 458752) | ((i3 << 18) & 1879048192), (Ref.$stable << 3) | 3078 | ((i3 >> 15) & 896));
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: MotionLayout-6oYECBM, reason: not valid java name */
    public static final void m7412MotionLayout6oYECBM(MotionScene motionScene, float f, Modifier modifier, String str, int i, int i2, InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -808697931, "CC(MotionLayout)P(4,6,3,7,1:androidx.constraintlayout.compose.DebugFlags,5,2)253@10965L53,254@11047L93,259@11302L627,275@11935L412:MotionLayout.kt#fysre8");
        Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        String str2 = (i4 & 8) != 0 ? "default" : str;
        int m7356getNonebfy_xzQ = (i4 & 16) != 0 ? DebugFlags.INSTANCE.m7356getNonebfy_xzQ() : i;
        int i5 = (i4 & 32) != 0 ? 257 : i2;
        final InvalidationStrategy defaultInvalidationStrategy = (i4 & 64) != 0 ? InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy() : invalidationStrategy;
        ComposerKt.sourceInformationMarkerStart(composer, 1692857043, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1692859707, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        ComposerKt.sourceInformationMarkerEnd(composer);
        m7415MotionLayoutCoreSehEMGo(motionScene, f, str2, i5, m7356getNonebfy_xzQ, modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(-23317463, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i6) {
                ComposerKt.sourceInformation(composer2, "C272@11914L9:MotionLayout.kt#fysre8");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-23317463, i6, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:262)");
                }
                mutableState.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                function3.invoke(motionLayoutScope, composer2, Integer.valueOf(i6 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i3 & 14) | 806879232 | (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168) | (i3 & 57344) | ((i3 << 9) & 458752) | (Ref.$stable << 21) | (234881024 & (i3 << 6)));
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m7414MotionLayoutT3LJ6Qw(MotionScene motionScene, String str, AnimationSpec<Float> animationSpec, Modifier modifier, Function0<Unit> function0, int i, int i2, InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, -267984822, "CC(MotionLayout)P(7,1!1,6,4,3:androidx.constraintlayout.compose.DebugFlags,8,5)379@16664L53,380@16746L93,385@17001L627,401@17634L491:MotionLayout.kt#fysre8");
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function0<Unit> function02 = (i4 & 16) != 0 ? null : function0;
        int m7356getNonebfy_xzQ = (i4 & 32) != 0 ? DebugFlags.INSTANCE.m7356getNonebfy_xzQ() : i;
        int i5 = (i4 & 64) != 0 ? 257 : i2;
        final InvalidationStrategy defaultInvalidationStrategy = (i4 & 128) != 0 ? InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy() : invalidationStrategy;
        ComposerKt.sourceInformationMarkerStart(composer, 1693039411, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1693042075, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        ComposerKt.sourceInformationMarkerEnd(composer);
        m7416MotionLayoutCoreTEds9UA(motionScene, str, animationSpec, modifier2, function02, m7356getNonebfy_xzQ, i5, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(1064705982, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i6) {
                ComposerKt.sourceInformation(composer2, "C398@17613L9:MotionLayout.kt#fysre8");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1064705982, i6, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:388)");
                }
                mutableState.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                function3.invoke(motionLayoutScope, composer2, Integer.valueOf(i6 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i3 & 14) | 12582912 | (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (Ref.$stable << 24) | ((i3 << 6) & 1879048192), 6, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0287 A[ADDED_TO_REGION] */
    /* renamed from: MotionLayoutCore-TEds9UA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7416MotionLayoutCoreTEds9UA(final androidx.constraintlayout.compose.MotionScene r35, final java.lang.String r36, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> r37, androidx.compose.ui.Modifier r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, int r40, int r41, final androidx.compose.runtime.MutableState<kotlin.Unit> r42, final androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r43, final androidx.constraintlayout.compose.InvalidationStrategy r44, final kotlin.jvm.functions.Function3<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m7416MotionLayoutCoreTEds9UA(androidx.constraintlayout.compose.MotionScene, java.lang.String, androidx.compose.animation.core.AnimationSpec, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, int, int, androidx.compose.runtime.MutableState, androidx.compose.ui.node.Ref, androidx.constraintlayout.compose.InvalidationStrategy, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$14(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$17(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MotionLayoutCore_TEds9UA$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MotionLayoutCore_TEds9UA$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: MotionLayoutCore-SehEMGo, reason: not valid java name */
    public static final void m7415MotionLayoutCoreSehEMGo(final MotionScene motionScene, final float f, final String str, final int i, final int i2, final Modifier modifier, final MutableState<Unit> mutableState, final Ref<CompositionSource> ref, final InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3) {
        int i4;
        String str2;
        String str3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1160212844);
        ComposerKt.sourceInformation(startRestartGroup, "C(MotionLayoutCore)P(6,8,9,7,3:androidx.constraintlayout.compose.DebugFlags,5,2!1,4)523@22002L91,526@22119L178,531@22320L170,539@22557L585:MotionLayout.kt#fysre8");
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(motionScene) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= startRestartGroup.changed(mutableState) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= (16777216 & i3) == 0 ? startRestartGroup.changed(ref) : startRestartGroup.changedInstance(ref) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= startRestartGroup.changedInstance(invalidationStrategy) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160212844, i4, -1, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:521)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -487958632, "CC(remember):MotionLayout.kt#9igjgp");
            int i5 = i4 & 14;
            boolean z = ((i4 & 896) == 256) | (i5 == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = motionScene.getTransitionInstance(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Transition transition = (Transition) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -487954801, "CC(remember):MotionLayout.kt#9igjgp");
            boolean changed = (i5 == 4) | startRestartGroup.changed(transition);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (transition == null || (str2 = transition.getStartConstraintSetId()) == null) {
                    str2 = "start";
                }
                rememberedValue2 = motionScene.getConstraintSetInstance(str2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ConstraintSet constraintSet = (ConstraintSet) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -487948377, "CC(remember):MotionLayout.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(transition) | (i5 == 4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (transition == null || (str3 = transition.getEndConstraintSetId()) == null) {
                    str3 = TtmlNode.END;
                }
                rememberedValue3 = motionScene.getConstraintSetInstance(str3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ConstraintSet constraintSet2 = (ConstraintSet) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (constraintSet == null || constraintSet2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
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

                        public final void invoke(Composer composer3, int i6) {
                            MotionLayoutKt.m7415MotionLayoutCoreSehEMGo(MotionScene.this, f, str, i, i2, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            int i6 = i4 << 6;
            int i7 = i4 >> 18;
            composer2 = startRestartGroup;
            MotionLayoutCore(constraintSet, constraintSet2, transition, f, motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null, i, DebugFlags.m7349getShowBoundsimpl(i2), DebugFlags.m7351getShowPathsimpl(i2), DebugFlags.m7350getShowKeyPositionsimpl(i2), modifier, mutableState, ref, invalidationStrategy, function3, composer2, (i6 & 7168) | (i6 & 458752) | ((i4 << 12) & 1879048192), (i7 & 14) | (Ref.$stable << 3) | (i7 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i7 & 896) | (i7 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$6
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

                public final void invoke(Composer composer3, int i8) {
                    MotionLayoutKt.m7415MotionLayoutCoreSehEMGo(MotionScene.this, f, str, i, i2, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MotionLayoutCore(final androidx.constraintlayout.compose.ConstraintSet r32, final androidx.constraintlayout.compose.ConstraintSet r33, final androidx.constraintlayout.compose.Transition r34, final float r35, final androidx.constraintlayout.compose.LayoutInformationReceiver r36, final int r37, final boolean r38, final boolean r39, final boolean r40, final androidx.compose.ui.Modifier r41, final androidx.compose.runtime.MutableState<kotlin.Unit> r42, final androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r43, final androidx.constraintlayout.compose.InvalidationStrategy r44, final kotlin.jvm.functions.Function3<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore(androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.Transition, float, androidx.constraintlayout.compose.LayoutInformationReceiver, int, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.MutableState, androidx.compose.ui.node.Ref, androidx.constraintlayout.compose.InvalidationStrategy, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final MeasurePolicy motionLayoutMeasurePolicy(final androidx.compose.runtime.State<Unit> state, final Ref<CompositionSource> ref, final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final TransitionImpl transitionImpl, final MutableFloatState mutableFloatState, final MotionMeasurer motionMeasurer, final int i, final InvalidationStrategy invalidationStrategy) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSet3 = constraintSet;
                ConstraintSet constraintSet4 = constraintSet2;
                TransitionImpl transitionImpl2 = transitionImpl;
                int i2 = i;
                float floatValue = mutableFloatState.getFloatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long m7439performInterpolationMeasurelUsXzhU = motionMeasurer2.m7439performInterpolationMeasurelUsXzhU(j, layoutDirection, constraintSet3, constraintSet4, transitionImpl2, list, i2, floatValue, value, invalidationStrategy.getShouldInvalidate());
                ref.setValue(CompositionSource.Unknown);
                int m7167getWidthimpl = IntSize.m7167getWidthimpl(m7439performInterpolationMeasurelUsXzhU);
                int m7166getHeightimpl = IntSize.m7166getHeightimpl(m7439performInterpolationMeasurelUsXzhU);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, m7167getWidthimpl, m7166getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        MotionMeasurer.this.performLayout(placementScope, list);
                    }
                }, 4, null);
            }
        };
    }

    public static final void UpdateWithForcedIfNoUserChange(final MutableFloatState mutableFloatState, final LayoutInformationReceiver layoutInformationReceiver, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1501096015);
        ComposerKt.sourceInformation(startRestartGroup, "C(UpdateWithForcedIfNoUserChange)P(1)1019@41023L63:MotionLayout.kt#fysre8");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(mutableFloatState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(layoutInformationReceiver) : startRestartGroup.changedInstance(layoutInformationReceiver) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501096015, i2, -1, "androidx.constraintlayout.compose.UpdateWithForcedIfNoUserChange (MotionLayout.kt:1011)");
            }
            if (layoutInformationReceiver == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$1
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

                        public final void invoke(Composer composer2, int i3) {
                            MotionLayoutKt.UpdateWithForcedIfNoUserChange(MutableFloatState.this, layoutInformationReceiver, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            float floatValue = mutableFloatState.getFloatValue();
            float forcedProgress = layoutInformationReceiver.getForcedProgress();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 744481438, "CC(remember):MotionLayout.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(Float.valueOf(floatValue));
                startRestartGroup.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (!Float.isNaN(forcedProgress) && Intrinsics.areEqual((Float) ref2.getValue(), floatValue)) {
                mutableFloatState.setFloatValue(forcedProgress);
            } else {
                layoutInformationReceiver.resetForcedProgress();
            }
            ref2.setValue(Float.valueOf(floatValue));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$2
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

                public final void invoke(Composer composer2, int i3) {
                    MotionLayoutKt.UpdateWithForcedIfNoUserChange(MutableFloatState.this, layoutInformationReceiver, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final MutableFloatState createAndUpdateMotionProgress(float f, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1721363510, "C(createAndUpdateMotionProgress)1039@41867L42,1040@41925L52:MotionLayout.kt#fysre8");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1721363510, i, -1, "androidx.constraintlayout.compose.createAndUpdateMotionProgress (MotionLayout.kt:1038)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 346851123, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 346852989, "CC(remember):MotionLayout.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f;
            composer.updateRememberedValue(floatRef);
            obj = floatRef;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) obj;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (floatRef2.element != f) {
            floatRef2.element = f;
            mutableFloatState.setFloatValue(f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableFloatState;
    }

    public static final Modifier motionDebug(Modifier modifier, final MotionMeasurer motionMeasurer, float f, final boolean z, final boolean z2, final boolean z3) {
        if (!Float.isNaN(f)) {
            modifier = ScaleKt.scale(modifier, f);
        }
        return (z || z3 || z2) ? DrawModifierKt.drawBehind(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionDebug$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                MotionMeasurer.this.drawDebug(drawScope, z, z2, z3);
            }
        }) : modifier;
    }
}
