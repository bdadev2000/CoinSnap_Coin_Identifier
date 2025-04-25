package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* compiled from: LateMotionLayout.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a^\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006 "}, d2 = {"LateMotionLayout", "", "start", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/ConstraintSet;", TtmlNode.END, "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "contentTracker", "Landroidx/compose/runtime/State;", "compositionSource", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "optimizationLevel", "", "finishedAnimationListener", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/AnimationSpec;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lateMotionLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startProvider", "endProvider", Key.MOTIONPROGRESS, "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class LateMotionLayoutKt {
    public static final void LateMotionLayout(final MutableState<ConstraintSet> mutableState, final MutableState<ConstraintSet> mutableState2, final AnimationSpec<Float> animationSpec, final Channel<ConstraintSet> channel, final androidx.compose.runtime.State<Unit> state, final Ref<CompositionSource> ref, final int i, final Function0<Unit> function0, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(688627412);
        ComposerKt.sourceInformation(startRestartGroup, "C(LateMotionLayout)P(9,5!2,4!1,8,6,7)56@2099L7,57@2126L36,59@2193L29,60@2248L41,61@2310L33,67@2542L30,68@2600L28,78@2956L33,77@2898L163,83@3091L941,83@3067L965:LateMotionLayout.kt#fysre8");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(mutableState2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(animationSpec) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(channel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (i2 & 262144) == 0 ? startRestartGroup.changed(ref) : startRestartGroup.changedInstance(ref) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(688627412, i3, -1, "androidx.constraintlayout.compose.LateMotionLayout (LateMotionLayout.kt:55)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999655640, "CC(remember):LateMotionLayout.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MotionMeasurer(density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999653503, "CC(remember):LateMotionLayout.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable = (Animatable) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999651731, "CC(remember):LateMotionLayout.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = animatable.asState();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.State state2 = (androidx.compose.runtime.State) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999649755, "CC(remember):LateMotionLayout.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            int i4 = i3;
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(1);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999642334, "CC(remember):LateMotionLayout.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (Function0) new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintSet invoke() {
                        ConstraintSet value = mutableState.getValue();
                        Intrinsics.checkNotNull(value);
                        return value;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            Function0 function02 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999640480, "CC(remember):LateMotionLayout.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function0) new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintSet invoke() {
                        ConstraintSet value = mutableState2.getValue();
                        Intrinsics.checkNotNull(value);
                        return value;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MeasurePolicy lateMotionLayoutMeasurePolicy = lateMotionLayoutMeasurePolicy(function02, (Function0) rememberedValue6, state, ref, state2, motionMeasurer, i);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999629083, "CC(remember):LateMotionLayout.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(motionMeasurer);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, MotionMeasurer.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z = true;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue7, 1, null), function2, lateMotionLayoutMeasurePolicy, startRestartGroup, (i4 >> 24) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -999623855, "CC(remember):LateMotionLayout.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(channel) | ((i4 & 14) == 4) | ((i4 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 32) | ((i4 & 458752) == 131072 || ((i4 & 262144) != 0 && startRestartGroup.changedInstance(ref))) | startRestartGroup.changedInstance(animatable) | startRestartGroup.changedInstance(animationSpec);
            if ((i4 & 29360128) != 8388608) {
                z = false;
            }
            boolean z2 = changedInstance2 | z;
            LateMotionLayoutKt$LateMotionLayout$2$1 rememberedValue8 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                composer2 = startRestartGroup;
                rememberedValue8 = new LateMotionLayoutKt$LateMotionLayout$2$1(channel, mutableIntState, mutableState, mutableState2, ref, animatable, animationSpec, function0, null);
                composer2.updateRememberedValue(rememberedValue8);
            } else {
                composer2 = startRestartGroup;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, composer2, (i4 >> 9) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$3
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

                public final void invoke(Composer composer3, int i5) {
                    LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec, channel, state, ref, i, function0, modifier, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final MeasurePolicy lateMotionLayoutMeasurePolicy(final Function0<? extends ConstraintSet> function0, final Function0<? extends ConstraintSet> function02, final androidx.compose.runtime.State<Unit> state, final Ref<CompositionSource> ref, final androidx.compose.runtime.State<Float> state2, final MotionMeasurer motionMeasurer, final int i) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet invoke = function0.invoke();
                ConstraintSet invoke2 = function02.invoke();
                TransitionImpl eMPTY$constraintlayout_compose_release = TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
                int i2 = i;
                float floatValue = state2.getValue().floatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long m7439performInterpolationMeasurelUsXzhU = motionMeasurer2.m7439performInterpolationMeasurelUsXzhU(j, layoutDirection, invoke, invoke2, eMPTY$constraintlayout_compose_release, list, i2, floatValue, value, null);
                ref.setValue(CompositionSource.Unknown);
                int m7167getWidthimpl = IntSize.m7167getWidthimpl(m7439performInterpolationMeasurelUsXzhU);
                int m7166getHeightimpl = IntSize.m7166getHeightimpl(m7439performInterpolationMeasurelUsXzhU);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, m7167getWidthimpl, m7166getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1.1
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
}
