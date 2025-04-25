package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.location.LocationRequestCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import com.glority.base.utils.StatusBarUtils;
import com.google.logging.type.LogSeverity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnBoardingScreenPage5.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"ANIMATION_DURATION", "", "ANIMATION_DELAY", "createEnterAnimation", "Landroidx/compose/animation/EnterTransition;", "index", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "OnboardingPage5", "", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HonorBanner1", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HonorBanner2", "isPlaying", "", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V", "HonorBanner3", "HonorHint", "OliverImage", "OnboardingPage5Preview", "(Landroidx/compose/runtime/Composer;I)V", "splash_release", "animStart", "currentPage", "Lcom/glority/android/picturexx/splash/composables/onboarding/HonorPage;", "honor2Playing", "honor3Playing", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage5Kt {
    private static final int ANIMATION_DELAY = 800;
    private static final int ANIMATION_DURATION = 800;

    public static final /* synthetic */ void access$HonorBanner1(Modifier modifier, Composer composer, int i) {
        HonorBanner1(modifier, composer, i);
    }

    public static final EnterTransition createEnterAnimation(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-465920719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-465920719, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.createEnterAnimation (OnBoardingScreenPage5.kt:53)");
        }
        int i3 = i * LogSeverity.EMERGENCY_VALUE;
        EnterTransition plus = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, i3, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, i3, null, 4, null), 0.0f, 0L, 6, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return plus;
    }

    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.compose.runtime.SnapshotMutationPolicy, kotlin.coroutines.Continuation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    public static final void OnboardingPage5(final Modifier modifier, final Function0<Unit> onAnimationFinish, Composer composer, final int i) {
        int i2;
        ?? r6;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onAnimationFinish, "onAnimationFinish");
        Composer startRestartGroup = composer.startRestartGroup(-1429375249);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(onAnimationFinish) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1429375249, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage5 (OnBoardingScreenPage5.kt:71)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HonorPage.Honor_banners, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(2018371912);
            boolean changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(onAnimationFinish);
            OnBoardingScreenPage5Kt$OnboardingPage5$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new OnBoardingScreenPage5Kt$OnboardingPage5$1$1(onAnimationFinish, mutableState, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 70);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.bg_coin_onboarding_page5_world_map, startRestartGroup, 0), (String) null, BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Alignment.INSTANCE.getCenter()), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24632, LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                r6 = 0;
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                r6 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, r6, 2, r6);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState4 = (MutableState) rememberedValue5;
            Boolean valueOf = Boolean.valueOf(OnboardingPage5$lambda$1(mutableState));
            startRestartGroup.startReplaceableGroup(2018372754);
            boolean changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState4);
            OnBoardingScreenPage5Kt$OnboardingPage5$2$1$1 rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new OnBoardingScreenPage5Kt$OnboardingPage5$2$1$1(mutableState, mutableState3, mutableState4, r6);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 64);
            AnimatedContentKt.AnimatedContent(OnboardingPage5$lambda$4(mutableState2), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, r6), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 276338857, true, new Function4<AnimatedContentScope, HonorPage, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OnboardingPage5$2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, HonorPage honorPage, Composer composer2, Integer num) {
                    invoke(animatedContentScope, honorPage, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, HonorPage it, Composer composer2, int i3) {
                    boolean OnboardingPage5$lambda$1;
                    EnterTransition createEnterAnimation;
                    boolean OnboardingPage5$lambda$12;
                    EnterTransition createEnterAnimation2;
                    boolean OnboardingPage5$lambda$13;
                    EnterTransition createEnterAnimation3;
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(276338857, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage5.<anonymous>.<anonymous> (OnBoardingScreenPage5.kt:116)");
                    }
                    if (it == HonorPage.Honor_banners) {
                        composer2.startReplaceableGroup(321583006);
                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        MutableState<Boolean> mutableState5 = mutableState;
                        final MutableState<Boolean> mutableState6 = mutableState3;
                        final MutableState<Boolean> mutableState7 = mutableState4;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer2);
                        Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x80, composer2, 0), 0.0f, 2, null), 0.0f, 1, null);
                        OnboardingPage5$lambda$1 = OnBoardingScreenPage5Kt.OnboardingPage5$lambda$1(mutableState5);
                        createEnterAnimation = OnBoardingScreenPage5Kt.createEnterAnimation(0, composer2, 6);
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, OnboardingPage5$lambda$1, fillMaxWidth$default, createEnterAnimation, (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage5Kt.INSTANCE.m7848getLambda1$splash_release(), composer2, 1572870, 24);
                        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x100, composer2, 0)), composer2, 0);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x80, composer2, 0), 0.0f, 2, null), 0.0f, 1, null);
                        OnboardingPage5$lambda$12 = OnBoardingScreenPage5Kt.OnboardingPage5$lambda$1(mutableState5);
                        createEnterAnimation2 = OnBoardingScreenPage5Kt.createEnterAnimation(1, composer2, 6);
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, OnboardingPage5$lambda$12, fillMaxWidth$default2, createEnterAnimation2, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 1378074761, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OnboardingPage5$2$2$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i4) {
                                boolean OnboardingPage5$lambda$14$lambda$8;
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1378074761, i4, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage5.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnBoardingScreenPage5.kt:145)");
                                }
                                Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                OnboardingPage5$lambda$14$lambda$8 = OnBoardingScreenPage5Kt.OnboardingPage5$lambda$14$lambda$8(mutableState6);
                                OnBoardingScreenPage5Kt.HonorBanner2(fillMaxWidth$default3, OnboardingPage5$lambda$14$lambda$8, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 1572870, 24);
                        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x100, composer2, 0)), composer2, 0);
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x80, composer2, 0), 0.0f, 2, null), 0.0f, 1, null);
                        OnboardingPage5$lambda$13 = OnBoardingScreenPage5Kt.OnboardingPage5$lambda$1(mutableState5);
                        createEnterAnimation3 = OnBoardingScreenPage5Kt.createEnterAnimation(2, composer2, 6);
                        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, OnboardingPage5$lambda$13, fillMaxWidth$default3, createEnterAnimation3, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 624050472, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OnboardingPage5$2$2$1$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i4) {
                                boolean OnboardingPage5$lambda$14$lambda$11;
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(624050472, i4, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage5.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnBoardingScreenPage5.kt:160)");
                                }
                                Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                OnboardingPage5$lambda$14$lambda$11 = OnBoardingScreenPage5Kt.OnboardingPage5$lambda$14$lambda$11(mutableState7);
                                OnBoardingScreenPage5Kt.HonorBanner3(fillMaxWidth$default4, OnboardingPage5$lambda$14$lambda$11, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 1572870, 24);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(321584955);
                        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default3);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4008constructorimpl3 = Updater.m4008constructorimpl(composer2);
                        Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        OnBoardingScreenPage5Kt.HonorHint(BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x60, composer2, 0), 0.0f, 0.0f, 13, null), ComposableExtensionsKt.asDp(R.dimen.x60, composer2, 0), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null), new BiasAlignment(0.0f, -0.3f)), composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 1572912, 60);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OnboardingPage5$3
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
                    OnBoardingScreenPage5Kt.OnboardingPage5(Modifier.this, onAnimationFinish, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage5$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage5$lambda$14$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage5$lambda$14$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void HonorBanner1(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1975210713);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1975210713, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.HonorBanner1 (OnBoardingScreenPage5.kt:187)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            OliverImage(Modifier.INSTANCE, true, startRestartGroup, 54);
            Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableExtensionsKt.asDp(R.dimen.x20, startRestartGroup, 0), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m987paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_14_million_plus, startRestartGroup, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(30), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 131026);
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_user_choice, startRestartGroup, 0), SizeKt.wrapContentSize$default(PaddingKt.m985padding3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x20, startRestartGroup, 0)), null, false, 3, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$HonorBanner1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    OnBoardingScreenPage5Kt.HonorBanner1(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void HonorBanner2(final Modifier modifier, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2015950028);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2015950028, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.HonorBanner2 (OnBoardingScreenPage5.kt:225)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            OliverImage(Modifier.INSTANCE, z, startRestartGroup, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 6);
            Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableExtensionsKt.asDp(R.dimen.x20, startRestartGroup, 0), 0.0f, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m987paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_150_thousand_plus, startRestartGroup, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(30), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 131026);
            ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.image_coin_onboarding_honor_five_stars, startRestartGroup, 0), (String) null, PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x16, startRestartGroup, 0), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_5_star_ratings, startRestartGroup, 0), SizeKt.wrapContentSize$default(PaddingKt.m985padding3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x16, startRestartGroup, 0)), null, false, 3, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$HonorBanner2$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    OnBoardingScreenPage5Kt.HonorBanner2(Modifier.this, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void HonorBanner3(final Modifier modifier, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-992534963);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992534963, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.HonorBanner3 (OnBoardingScreenPage5.kt:270)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            OliverImage(Modifier.INSTANCE, z, startRestartGroup, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 6);
            Modifier align = boxScopeInstance.align(PaddingKt.m987paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableExtensionsKt.asDp(R.dimen.x20, startRestartGroup, 0), 0.0f, 2, null), Alignment.INSTANCE.getCenter());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_99_percent, startRestartGroup, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(30), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 131026);
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_accuracy, startRestartGroup, 0), SizeKt.wrapContentSize$default(PaddingKt.m985padding3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x20, startRestartGroup, 0)), null, false, 3, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$HonorBanner3$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    OnBoardingScreenPage5Kt.HonorBanner3(Modifier.this, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void HonorHint(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-687313695);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-687313695, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.HonorHint (OnBoardingScreenPage5.kt:310)");
            }
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_honor_hint, startRestartGroup, 0), modifier, ColorKt.Color(4281545523L), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(40), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i2 << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 200064, 6, 129488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$HonorHint$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    OnBoardingScreenPage5Kt.HonorHint(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OliverImage(final Modifier modifier, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(301600920);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(301600920, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.OliverImage (OnBoardingScreenPage5.kt:326)");
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.img_oliver)), null, null, null, null, null, startRestartGroup, 0, 62);
            composer2 = startRestartGroup;
            final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(OliverImage$lambda$21(rememberLottieComposition), z, false, false, null, 0.0f, 0, null, false, false, startRestartGroup, (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8, 1020);
            Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ComposableExtensionsKt.asDp(R.dimen.x200, composer2, 0));
            LottieComposition OliverImage$lambda$21 = OliverImage$lambda$21(rememberLottieComposition);
            composer2.startReplaceableGroup(2018379963);
            boolean changed = composer2.changed(animateLottieCompositionAsState);
            Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Float>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OliverImage$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        float OliverImage$lambda$22;
                        OliverImage$lambda$22 = OnBoardingScreenPage5Kt.OliverImage$lambda$22(LottieAnimationState.this);
                        return Float.valueOf(OliverImage$lambda$22);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceableGroup();
            LottieAnimationKt.LottieAnimation(OliverImage$lambda$21, (Function0) rememberedValue, m1016height3ABfNKs, false, false, false, null, false, null, null, null, false, null, null, composer2, 8, 0, 16376);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OliverImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    OnBoardingScreenPage5Kt.OliverImage(Modifier.this, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage5Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(720857696);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(720857696, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage5Preview (OnBoardingScreenPage5.kt:340)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage5Kt.INSTANCE.m7849getLambda2$splash_release(), startRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage5Kt$OnboardingPage5Preview$1
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

                public final void invoke(Composer composer2, int i2) {
                    OnBoardingScreenPage5Kt.OnboardingPage5Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean OnboardingPage5$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final HonorPage OnboardingPage5$lambda$4(MutableState<HonorPage> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean OnboardingPage5$lambda$14$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean OnboardingPage5$lambda$14$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final LottieComposition OliverImage$lambda$21(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final float OliverImage$lambda$22(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
