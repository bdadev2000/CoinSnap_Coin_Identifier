package com.glority.android.picturexx.splash.composables.onboarding;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ImageResources_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicPropertiesKt;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnBoardingScreenPage1.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001a)\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\"\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082D¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"OnboardingPage1", "", "modifier", "Landroidx/compose/ui/Modifier;", "onProgressChanged", "Lkotlin/Function1;", "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "coinKeyPath", "", "", "[Ljava/lang/String;", "IdentifyLottieAnimation", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Page1CoinCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "OnboardingPage1Preview", "(Landroidx/compose/runtime/Composer;I)V", "splash_release", "identifyTitleAnim", "", "coinCardAnim", "sizeChangeStart", "increaseScaleFloat", "decreaseScaleFloat", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "coinBitmap", "Landroid/graphics/Bitmap;"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage1Kt {
    private static final String[] coinKeyPath = {"币"};

    public static final /* synthetic */ void access$Page1CoinCard(Modifier modifier, Composer composer, int i) {
        Page1CoinCard(modifier, composer, i);
    }

    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.ui.Alignment$Vertical, androidx.compose.animation.core.Easing, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    public static final void OnboardingPage1(final Modifier modifier, final Function1<? super Float, Unit> onProgressChanged, final Function0<Unit> onAnimationFinish, Composer composer, final int i) {
        int i2;
        int i3;
        String str;
        String str2;
        BoxScopeInstance boxScopeInstance;
        String str3;
        String str4;
        int i4;
        String str5;
        Composer composer2;
        int i5;
        ?? r3;
        float f;
        Composer composer3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        Intrinsics.checkNotNullParameter(onAnimationFinish, "onAnimationFinish");
        Composer startRestartGroup = composer.startRestartGroup(2098413698);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(onProgressChanged) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onAnimationFinish) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2098413698, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage1 (OnBoardingScreenPage1.kt:63)");
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
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState2 = (MutableState) rememberedValue2;
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(2018368319);
            boolean changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(onProgressChanged);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$OnboardingPage1$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                        invoke(f2.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2) {
                        boolean OnboardingPage1$lambda$1;
                        if (f2 >= 0.5f) {
                            OnboardingPage1$lambda$1 = OnBoardingScreenPage1Kt.OnboardingPage1$lambda$1(mutableState);
                            if (!OnboardingPage1$lambda$1) {
                                OnBoardingScreenPage1Kt.OnboardingPage1$lambda$2(mutableState, true);
                            }
                        }
                        if (f2 >= 1.0f) {
                            OnBoardingScreenPage1Kt.OnboardingPage1$lambda$5(mutableState2, true);
                        }
                        onProgressChanged.invoke(Float.valueOf(f2));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            IdentifyLottieAnimation(fillMaxSize$default2, (Function1) rememberedValue3, startRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(OnboardingPage1$lambda$1(mutableState), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x200, startRestartGroup, 0), 0.0f, 0.0f, 13, null), ComposableExtensionsKt.asDp(R.dimen.x40, startRestartGroup, 0), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage1Kt.INSTANCE.m7816getLambda1$splash_release(), startRestartGroup, 196992, 24);
            Boolean valueOf = Boolean.valueOf(OnboardingPage1$lambda$4(mutableState2));
            startRestartGroup.startReplaceableGroup(2018369409);
            boolean changed2 = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(1000) | startRestartGroup.changed(400) | startRestartGroup.changedInstance(onAnimationFinish);
            OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                i3 = 1000;
                str = "CC(remember):Composables.kt#9igjgp";
                str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                boxScopeInstance = boxScopeInstance2;
                str3 = "C73@3429L9:Box.kt#2w3rfo";
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                i4 = 4;
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                composer2 = startRestartGroup;
                rememberedValue4 = new OnBoardingScreenPage1Kt$OnboardingPage1$1$2$1(1000, 400, onAnimationFinish, mutableState2, null);
                composer2.updateRememberedValue(rememberedValue4);
            } else {
                str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                i3 = 1000;
                str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                composer2 = startRestartGroup;
                str = "CC(remember):Composables.kt#9igjgp";
                str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                boxScopeInstance = boxScopeInstance2;
                str3 = "C73@3429L9:Box.kt#2w3rfo";
                i4 = 4;
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, 64);
            ComposerKt.sourceInformationMarkerStart(composer2, -492369756, str);
            Object rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$OnboardingPage1$1$sizeChangeStart$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        boolean OnboardingPage1$lambda$4;
                        OnboardingPage1$lambda$4 = OnBoardingScreenPage1Kt.OnboardingPage1$lambda$4(mutableState2);
                        return Boolean.valueOf(OnboardingPage1$lambda$4);
                    }
                });
                composer2.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            State state = (State) rememberedValue5;
            if (OnboardingPage1$lambda$13$lambda$9(state)) {
                f = 1.2f;
                i5 = i3;
                r3 = 0;
            } else {
                i5 = i3;
                r3 = 0;
                f = 1.0f;
            }
            Composer composer4 = composer2;
            String str6 = str5;
            String str7 = str4;
            Modifier align = boxScopeInstance.align(ScaleKt.scale(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, r3), r3, false, 3, r3), Color.INSTANCE.m4550getTransparent0d7_KjU(), null, 2, null), OnboardingPage1$lambda$13$lambda$10(AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(i5, i5, r3, i4, r3), 0.0f, null, null, composer4, 48, 28)) * OnboardingPage1$lambda$13$lambda$11(AnimateAsStateKt.animateFloatAsState(OnboardingPage1$lambda$13$lambda$9(state) ? 0.8333333f : 1.0f, AnimationSpecKt.tween$default(i5, 2000, r3, 4, r3), 0.0f, null, null, composer4, 48, 28))), new BiasAlignment(0.0f, 0.25f));
            composer3 = composer4;
            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, str2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, align);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str7);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer3);
            Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, str3);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            AnimatedVisibilityKt.AnimatedVisibility(OnboardingPage1$lambda$4(mutableState2), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x88, composer3, 0), 0.0f, 2, r3), 0.0f, 1, r3), r3, false, 3, r3), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, r3, 6, r3), 0.0f, 2, r3).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 0, r3, 6, r3), 0.0f, 0L, 6, null)), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage1Kt.INSTANCE.m7817getLambda2$splash_release(), composer3, 196992, 24);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$OnboardingPage1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i6) {
                    OnBoardingScreenPage1Kt.OnboardingPage1(Modifier.this, onProgressChanged, onAnimationFinish, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage1$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage1$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void IdentifyLottieAnimation(final Modifier modifier, final Function1<? super Float, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-398599904);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-398599904, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.IdentifyLottieAnimation (OnBoardingScreenPage1.kt:171)");
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.coin_lottie_anim1)), null, null, null, null, null, startRestartGroup, 0, 62);
            final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(IdentifyLottieAnimation$lambda$14(rememberLottieComposition), false, false, false, null, 0.0f, 0, null, false, false, startRestartGroup, 8, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, R.drawable.image_onboarding_sample_coin, startRestartGroup, 8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Bitmap.createScaledBitmap(asAndroidBitmap, 512, 512, false), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Bitmap bitmap = LottieProperty.IMAGE;
            String[] strArr = coinKeyPath;
            LottieDynamicProperties rememberLottieDynamicProperties = LottieDynamicPropertiesKt.rememberLottieDynamicProperties(new LottieDynamicProperty[]{LottieDynamicPropertiesKt.rememberLottieDynamicProperty(bitmap, IdentifyLottieAnimation$lambda$17((MutableState) rememberedValue), (String[]) Arrays.copyOf(strArr, strArr.length), startRestartGroup, 72)}, startRestartGroup, LottieDynamicProperty.$stable);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            LottieComposition IdentifyLottieAnimation$lambda$14 = IdentifyLottieAnimation$lambda$14(rememberLottieComposition);
            startRestartGroup.startReplaceableGroup(2018371871);
            boolean changedInstance = startRestartGroup.changedInstance(function1) | startRestartGroup.changed(animateLottieCompositionAsState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Float>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$IdentifyLottieAnimation$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        float IdentifyLottieAnimation$lambda$15;
                        float IdentifyLottieAnimation$lambda$152;
                        Function1<Float, Unit> function12 = function1;
                        IdentifyLottieAnimation$lambda$15 = OnBoardingScreenPage1Kt.IdentifyLottieAnimation$lambda$15(animateLottieCompositionAsState);
                        function12.invoke(Float.valueOf(IdentifyLottieAnimation$lambda$15));
                        IdentifyLottieAnimation$lambda$152 = OnBoardingScreenPage1Kt.IdentifyLottieAnimation$lambda$15(animateLottieCompositionAsState);
                        return Float.valueOf(IdentifyLottieAnimation$lambda$152);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            LottieAnimationKt.LottieAnimation(IdentifyLottieAnimation$lambda$14, (Function0) rememberedValue2, fillMaxSize$default, false, false, false, null, false, rememberLottieDynamicProperties, null, null, false, null, null, composer2, (LottieDynamicProperties.$stable << 24) | 8, 0, 16120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$IdentifyLottieAnimation$2
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

                public final void invoke(Composer composer3, int i3) {
                    OnBoardingScreenPage1Kt.IdentifyLottieAnimation(Modifier.this, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void Page1CoinCard(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(40903735);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(40903735, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.Page1CoinCard (OnBoardingScreenPage1.kt:202)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(modifier, null, Color.INSTANCE.m4550getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage1Kt.INSTANCE.m7819getLambda4$splash_release(), startRestartGroup, (i2 & 14) | 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$Page1CoinCard$1
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
                    OnBoardingScreenPage1Kt.Page1CoinCard(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage1Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(372101992);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372101992, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage1Preview (OnBoardingScreenPage1.kt:264)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage1Kt.INSTANCE.m7820getLambda5$splash_release(), startRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage1Kt$OnboardingPage1Preview$1
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
                    OnBoardingScreenPage1Kt.OnboardingPage1Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean OnboardingPage1$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean OnboardingPage1$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean OnboardingPage1$lambda$13$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float OnboardingPage1$lambda$13$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float OnboardingPage1$lambda$13$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final LottieComposition IdentifyLottieAnimation$lambda$14(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final float IdentifyLottieAnimation$lambda$15(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final Bitmap IdentifyLottieAnimation$lambda$17(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }
}
