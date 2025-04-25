package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1"}, k = 3, mv = {2, 0, 0}, xi = 50)
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage3Kt$Page3CoinCard$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ MutableState $coinCardVisibilityAnim$delegate$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ MutableState $goldCoinVisibilityAnim$delegate$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $silverCoinVisibilityAnim$delegate$inlined;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingScreenPage3Kt$Page3CoinCard$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$silverCoinVisibilityAnim$delegate$inlined = mutableState4;
        this.$goldCoinVisibilityAnim$delegate$inlined = mutableState5;
        this.$coinCardVisibilityAnim$delegate$inlined = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean Page3CoinCard$lambda$14;
        boolean Page3CoinCard$lambda$11;
        boolean Page3CoinCard$lambda$8;
        ComposerKt.sourceInformation(composer, "C381@17480L14,383@17562L681,383@17551L692:ConstraintLayout.kt#fysre8");
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$contentTracker.setValue(Unit.INSTANCE);
            if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
                this.$compositionSource.setValue(CompositionSource.Content);
            }
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            ConstrainedLayoutReference component1 = createRefs.component1();
            ConstrainedLayoutReference component2 = createRefs.component2();
            ConstrainedLayoutReference component3 = createRefs.component3();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), 0.8f);
            composer.startReplaceableGroup(2018372816);
            boolean changed = composer.changed(component2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new OnBoardingScreenPage3Kt$Page3CoinCard$3$1$1(component2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier constrainAs = constraintLayoutScope.constrainAs(fillMaxWidth, component3, (Function1) rememberedValue);
            Page3CoinCard$lambda$14 = OnBoardingScreenPage3Kt.Page3CoinCard$lambda$14(this.$silverCoinVisibilityAnim$delegate$inlined);
            AnimatedVisibilityKt.AnimatedVisibility(Page3CoinCard$lambda$14, constrainAs, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 1000, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 1000, null, 4, null), 0.0f, 0L, 6, null)), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7824getLambda1$splash_release(), composer, 196992, 24);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), 0.9f);
            composer.startReplaceableGroup(2018373630);
            boolean changed2 = composer.changed(component1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new OnBoardingScreenPage3Kt$Page3CoinCard$3$2$1(component1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier constrainAs2 = constraintLayoutScope.constrainAs(fillMaxWidth2, component2, (Function1) rememberedValue2);
            Page3CoinCard$lambda$11 = OnBoardingScreenPage3Kt.Page3CoinCard$lambda$11(this.$goldCoinVisibilityAnim$delegate$inlined);
            AnimatedVisibilityKt.AnimatedVisibility(Page3CoinCard$lambda$11, constrainAs2, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 500, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 500, null, 4, null), 0.0f, 0L, 6, null)), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7828getLambda2$splash_release(), composer, 196992, 24);
            Modifier constrainAs3 = constraintLayoutScope.constrainAs(Modifier.INSTANCE, component1, OnBoardingScreenPage3Kt$Page3CoinCard$3$3.INSTANCE);
            Page3CoinCard$lambda$8 = OnBoardingScreenPage3Kt.Page3CoinCard$lambda$8(this.$coinCardVisibilityAnim$delegate$inlined);
            AnimatedVisibilityKt.AnimatedVisibility(Page3CoinCard$lambda$8, constrainAs3, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 0, null, 4, null), 0.0f, 0L, 6, null)), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7829getLambda3$splash_release(), composer, 196992, 24);
            ComposerKt.sourceInformationMarkerStart(composer, -1730039667, "CC(remember):ConstraintLayout.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
            final MutableState mutableState = this.$start;
            final MutableState mutableState2 = this.$end;
            final Channel channel = this.$channel;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$Page3CoinCard$$inlined$ConstraintLayout$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        RawConstraintSet rawConstraintSet = new RawConstraintSet(ConstraintLayoutScope.this.getContainerObject().mo7479clone());
                        if (mutableState.getValue() == null || mutableState2.getValue() == null) {
                            mutableState.setValue(rawConstraintSet);
                            mutableState2.setValue(mutableState.getValue());
                        } else {
                            channel.mo9791trySendJP2dKIU(rawConstraintSet);
                        }
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            EffectsKt.SideEffect((Function0) rememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
