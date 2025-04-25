package com.glority.android.picturexx.splash.composables.onboarding;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: OnBoardingScreenPage2.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a)\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e\"\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082D¢\u0006\u0004\n\u0002\u0010\n\"\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082D¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"OnboardingPage2", "", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "phoneImageKeyPath", "", "", "[Ljava/lang/String;", "coinImageKeyPath", "GradingLottieAnimation", "onProgressChanged", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Page2GradingCard1", "animationDelay", "", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V", "Page2GradingCard2", "startZoomAnim", "", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GradingArk", "progress", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;I)V", "GradingFireworks", "OnboardingPage2Preview", "(Landroidx/compose/runtime/Composer;I)V", "splash_release", "gradingTitleAnim", "coinCardAnim", "referencePriceCardAnim", "fireworkAnim", "card2ZoomAnim", "composition", "Lcom/airbnb/lottie/LottieComposition;", "phoneBitmap", "Landroid/graphics/Bitmap;", "coinBitmap", "arkAnimStart", "arkPercentage", "increaseScaleFloat", "decreaseScaleFloat"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage2Kt {
    private static final String[] phoneImageKeyPath = {"grading手机"};
    private static final String[] coinImageKeyPath = {"grading币"};

    public static final /* synthetic */ void access$Page2GradingCard1(Modifier modifier, long j, Composer composer, int i) {
        Page2GradingCard1(modifier, j, composer, i);
    }

    public static final void OnboardingPage2(final Modifier modifier, final Function0<Unit> onAnimationFinish, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onAnimationFinish, "onAnimationFinish");
        Composer startRestartGroup = composer.startRestartGroup(493793807);
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
                ComposerKt.traceEventStart(493793807, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage2 (OnBoardingScreenPage2.kt:74)");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState3 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState4 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue5 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue5).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.bg_coin_onboarding_grading_bg, startRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(2018370205);
            boolean changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        boolean OnboardingPage2$lambda$4;
                        boolean OnboardingPage2$lambda$1;
                        if (f >= 0.1f) {
                            OnboardingPage2$lambda$1 = OnBoardingScreenPage2Kt.OnboardingPage2$lambda$1(mutableState);
                            if (!OnboardingPage2$lambda$1) {
                                OnBoardingScreenPage2Kt.OnboardingPage2$lambda$2(mutableState, true);
                            }
                        }
                        if (f >= 0.8f) {
                            OnboardingPage2$lambda$4 = OnBoardingScreenPage2Kt.OnboardingPage2$lambda$4(mutableState2);
                            if (OnboardingPage2$lambda$4) {
                                return;
                            }
                            OnBoardingScreenPage2Kt.OnboardingPage2$lambda$5(mutableState2, true);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceableGroup();
            GradingLottieAnimation(fillMaxSize$default2, (Function1) rememberedValue6, startRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(OnboardingPage2$lambda$1(mutableState), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x200, startRestartGroup, 0), 0.0f, 0.0f, 13, null), ComposableExtensionsKt.asDp(R.dimen.x40, startRestartGroup, 0), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage2Kt.INSTANCE.m7821getLambda1$splash_release(), startRestartGroup, 196992, 24);
            AnimatedVisibilityKt.AnimatedVisibility(OnboardingPage2$lambda$4(mutableState2), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x88, startRestartGroup, 0), 0.0f, 2, null), new BiasAlignment(0.0f, 0.25f)), 0.0f, 1, null), null, false, 3, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 0L, 6, null)), (ExitTransition) null, (String) null, ComposableSingletons$OnBoardingScreenPage2Kt.INSTANCE.m7822getLambda2$splash_release(), startRestartGroup, 196992, 24);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState5 = (MutableState) rememberedValue7;
            Boolean valueOf = Boolean.valueOf(OnboardingPage2$lambda$4(mutableState2));
            startRestartGroup.startReplaceableGroup(2018371932);
            boolean changed2 = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState5);
            OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1 rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new OnBoardingScreenPage2Kt$OnboardingPage2$1$2$1(mutableState2, mutableState3, mutableState5, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 64);
            AnimatedVisibilityKt.AnimatedVisibility(OnboardingPage2$lambda$7(mutableState3), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x88, startRestartGroup, 0), 0.0f, 2, null), new BiasAlignment(0.0f, 0.25f)), 0.0f, 1, null), null, false, 3, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m378scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 0L, 6, null)), (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -637206683, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    boolean OnboardingPage2$lambda$18$lambda$14;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-637206683, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage2.<anonymous>.<anonymous> (OnBoardingScreenPage2.kt:187)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    OnboardingPage2$lambda$18$lambda$14 = OnBoardingScreenPage2Kt.OnboardingPage2$lambda$18$lambda$14(mutableState5);
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final Function0<Unit> function0 = onAnimationFinish;
                    OnBoardingScreenPage2Kt.Page2GradingCard2(fillMaxWidth$default, OnboardingPage2$lambda$18$lambda$14, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: OnBoardingScreenPage2.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                        @DebugMetadata(c = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$3$1$1", f = "OnBoardingScreenPage2.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$3$1$1, reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes5.dex */
                        public static final class C01001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Function0<Unit> $onAnimationFinish;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01001(Function0<Unit> function0, Continuation<? super C01001> continuation) {
                                super(2, continuation);
                                this.$onAnimationFinish = function0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C01001(this.$onAnimationFinish, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C01001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (DelayKt.delay(800L, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                this.$onAnimationFinish.invoke();
                                return Unit.INSTANCE;
                            }
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C01001(function0, null), 3, null);
                        }
                    }, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 196992, 24);
            Boolean valueOf2 = Boolean.valueOf(OnboardingPage2$lambda$7(mutableState3));
            startRestartGroup.startReplaceableGroup(2018372919);
            boolean changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState4);
            OnBoardingScreenPage2Kt$OnboardingPage2$1$4$1 rememberedValue9 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new OnBoardingScreenPage2Kt$OnboardingPage2$1$4$1(mutableState3, mutableState4, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue9, startRestartGroup, 64);
            startRestartGroup.startReplaceableGroup(-2114384299);
            if (OnboardingPage2$lambda$10(mutableState4)) {
                GradingFireworks(boxScopeInstance.align(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.6f), Alignment.INSTANCE.getCenterEnd()), new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$1$5
                    public final void invoke(float f) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }
                }, startRestartGroup, 48);
            }
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2$2
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
                    OnBoardingScreenPage2Kt.OnboardingPage2(Modifier.this, onAnimationFinish, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage2$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage2$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage2$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage2$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void OnboardingPage2$lambda$18$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void GradingLottieAnimation(final Modifier modifier, final Function1<? super Float, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1119110227);
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
                ComposerKt.traceEventStart(1119110227, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.GradingLottieAnimation (OnBoardingScreenPage2.kt:224)");
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.coin_lottie_anim2)), null, null, null, null, null, startRestartGroup, 0, 62);
            final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(GradingLottieAnimation$lambda$19(rememberLottieComposition), false, false, false, null, 0.0f, 0, null, false, false, startRestartGroup, 8, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            ImageBitmap imageResource = ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, R.drawable.image_onboarding_sample_coin_phone, startRestartGroup, 8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = 2;
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidImageBitmap_androidKt.asAndroidBitmap(imageResource), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = 2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState = (MutableState) rememberedValue;
            ImageBitmap imageResource2 = ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, R.drawable.image_onboarding_sample_coin, startRestartGroup, 8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Bitmap.createScaledBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageResource2), 1092, 1092, false), null, i3, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String[] strArr = phoneImageKeyPath;
            LottieDynamicProperty rememberLottieDynamicProperty = LottieDynamicPropertiesKt.rememberLottieDynamicProperty(LottieProperty.IMAGE, GradingLottieAnimation$lambda$22(mutableState), (String[]) Arrays.copyOf(strArr, strArr.length), startRestartGroup, 72);
            String[] strArr2 = coinImageKeyPath;
            LottieDynamicProperties rememberLottieDynamicProperties = LottieDynamicPropertiesKt.rememberLottieDynamicProperties(new LottieDynamicProperty[]{rememberLottieDynamicProperty, LottieDynamicPropertiesKt.rememberLottieDynamicProperty(LottieProperty.IMAGE, GradingLottieAnimation$lambda$24((MutableState) rememberedValue2), (String[]) Arrays.copyOf(strArr2, strArr2.length), startRestartGroup, 72)}, startRestartGroup, LottieDynamicProperty.$stable);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            LottieComposition GradingLottieAnimation$lambda$19 = GradingLottieAnimation$lambda$19(rememberLottieComposition);
            startRestartGroup.startReplaceableGroup(2018374797);
            boolean changedInstance = startRestartGroup.changedInstance(function1) | startRestartGroup.changed(animateLottieCompositionAsState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Float>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$GradingLottieAnimation$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        float GradingLottieAnimation$lambda$20;
                        float GradingLottieAnimation$lambda$202;
                        Function1<Float, Unit> function12 = function1;
                        GradingLottieAnimation$lambda$20 = OnBoardingScreenPage2Kt.GradingLottieAnimation$lambda$20(animateLottieCompositionAsState);
                        function12.invoke(Float.valueOf(GradingLottieAnimation$lambda$20));
                        GradingLottieAnimation$lambda$202 = OnBoardingScreenPage2Kt.GradingLottieAnimation$lambda$20(animateLottieCompositionAsState);
                        return Float.valueOf(GradingLottieAnimation$lambda$202);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            LottieAnimationKt.LottieAnimation(GradingLottieAnimation$lambda$19, (Function0) rememberedValue3, fillMaxSize$default, false, false, false, null, false, rememberLottieDynamicProperties, null, null, false, null, null, composer2, (LottieDynamicProperties.$stable << 24) | 8, 0, 16120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$GradingLottieAnimation$2
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
                    OnBoardingScreenPage2Kt.GradingLottieAnimation(Modifier.this, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void Page2GradingCard1(final Modifier modifier, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2063428693);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2063428693, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.Page2GradingCard1 (OnBoardingScreenPage2.kt:275)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState = (MutableState) rememberedValue;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(Page2GradingCard1$lambda$27(mutableState) ? 0.9f : 0.0f, AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, "arkPercentage", null, startRestartGroup, 3120, 20);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(2018375307);
            boolean changed = startRestartGroup.changed(j) | startRestartGroup.changed(mutableState);
            OnBoardingScreenPage2Kt$Page2GradingCard1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new OnBoardingScreenPage2Kt$Page2GradingCard1$1$1(j, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 70);
            composer2 = startRestartGroup;
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(ComposableExtensionsKt.asDp(R.dimen.x32, composer2, 0)), CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.m4514copywmQWz5c$default(Color.INSTANCE.m4552getWhite0d7_KjU(), 0.98f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14), CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(Dp.m6997constructorimpl(5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.composableLambda(composer2, -458159581, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$Page2GradingCard1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer3, int i3) {
                    float Page2GradingCard1$lambda$29;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-458159581, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.Page2GradingCard1.<anonymous> (OnBoardingScreenPage2.kt:302)");
                        }
                        Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableExtensionsKt.asDp(R.dimen.x280, composer3, 0));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        State<Float> state = animateFloatAsState;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1016height3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4008constructorimpl = Updater.m4008constructorimpl(composer3);
                        Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.55f, false, 2, null), null, false, 3, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, wrapContentHeight$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                        Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier m1016height3ABfNKs2 = SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x180, composer3, 0)), ComposableExtensionsKt.asDp(R.dimen.x100, composer3, 0));
                        Page2GradingCard1$lambda$29 = OnBoardingScreenPage2Kt.Page2GradingCard1$lambda$29(state);
                        OnBoardingScreenPage2Kt.GradingArk(m1016height3ABfNKs2, Page2GradingCard1$lambda$29, composer3, 0);
                        Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x10, composer3, 0), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null);
                        Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceAround, Alignment.INSTANCE.getTop(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, wrapContentHeight$default2);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4008constructorimpl3 = Updater.m4008constructorimpl(composer3);
                        Updater.m4015setimpl(m4008constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_common, composer3, 0), wrapContentSize$default, ComposableExtensionsKt.asColor(R.color.color_666666, composer3, 0), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 0, 131056);
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_ultra_rare, composer3, 0), (Modifier) null, ComposableExtensionsKt.asColor(R.color.color_666666, composer3, 0), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131058);
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
                        Modifier wrapContentHeight$default3 = SizeKt.wrapContentHeight$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.45f, false, 2, null), null, false, 3, null);
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, wrapContentHeight$default3);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4008constructorimpl4 = Updater.m4008constructorimpl(composer3);
                        Updater.m4015setimpl(m4008constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_ultra_rare, composer3, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131026);
                        Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(SizeKt.wrapContentSize$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x32, composer3, 0), 0.0f, 0.0f, 13, null), null, false, 3, null), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(ComposableExtensionsKt.asDp(R.dimen.x12, composer3, 0))), Color.m4514copywmQWz5c$default(ColorKt.Color(4294945287L), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), ComposableExtensionsKt.asDp(R.dimen.x36, composer3, 0), ComposableExtensionsKt.asDp(R.dimen.x12, composer3, 0));
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_mint_state, composer3, 0), m986paddingVpY3zN4, ColorKt.Color(4290937088L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131056);
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
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$Page2GradingCard1$3
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
                    OnBoardingScreenPage2Kt.Page2GradingCard1(Modifier.this, j, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void Page2GradingCard1$lambda$28(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void Page2GradingCard2(final Modifier modifier, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2009491868);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2009491868, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.Page2GradingCard2 (OnBoardingScreenPage2.kt:383)");
            }
            composer2 = startRestartGroup;
            CardKt.Card(modifier, RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(ComposableExtensionsKt.asDp(R.dimen.x32, startRestartGroup, 0)), CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.m4514copywmQWz5c$default(Color.INSTANCE.m4552getWhite0d7_KjU(), 0.98f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1846684302, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$Page2GradingCard2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1846684302, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.Page2GradingCard2.<anonymous> (OnBoardingScreenPage2.kt:391)");
                        }
                        Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableExtensionsKt.asDp(R.dimen.x280, composer3, 0));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        boolean z2 = z;
                        final Function0<Unit> function02 = function0;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1016height3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4008constructorimpl = Updater.m4008constructorimpl(composer3);
                        Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_reference_price, composer3, 0), (Modifier) null, ComposableExtensionsKt.asColor(R.color.color_666666, composer3, 0), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131058);
                        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z2 ? 2.0f : 1.0f, AnimationSpecKt.tween$default(500, 500, null, 4, null), 0.0f, null, null, composer3, 48, 28);
                        float f = z2 ? 0.5f : 1.0f;
                        TweenSpec tween$default = AnimationSpecKt.tween$default(500, 1000, null, 4, null);
                        composer3.startReplaceableGroup(2018379660);
                        boolean changedInstance = composer3.changedInstance(function02);
                        Object rememberedValue = composer3.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$Page2GradingCard2$1$1$decreaseScaleFloat$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                    invoke(f2.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f2) {
                                    function02.invoke();
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        Modifier scale = ScaleKt.scale(SizeKt.wrapContentSize$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x32, composer3, 0), 0.0f, 0.0f, 13, null), null, false, 3, null), invoke$lambda$4$lambda$0(animateFloatAsState) * invoke$lambda$4$lambda$2(AnimateAsStateKt.animateFloatAsState(f, tween$default, 0.0f, null, (Function1) rememberedValue, composer3, 48, 12)));
                        Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, scale);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                        Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_price_currency, composer3, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131026);
                        TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_grading_price_price, composer3, 0), SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(27), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200112, 0, 131024);
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
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                private static final float invoke$lambda$4$lambda$0(State<Float> state) {
                    return state.getValue().floatValue();
                }

                private static final float invoke$lambda$4$lambda$2(State<Float> state) {
                    return state.getValue().floatValue();
                }
            }), startRestartGroup, (i2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$Page2GradingCard2$2
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
                    OnBoardingScreenPage2Kt.Page2GradingCard2(Modifier.this, z, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void GradingArk(final Modifier modifier, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1194955749);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1194955749, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.GradingArk (OnBoardingScreenPage2.kt:449)");
            }
            final float asDp = ComposableExtensionsKt.asDp(R.dimen.x22, startRestartGroup, 0);
            Modifier m985padding3ABfNKs = PaddingKt.m985padding3ABfNKs(modifier, Dp.m6997constructorimpl(asDp / 2));
            startRestartGroup.startReplaceableGroup(2018380921);
            boolean changed = startRestartGroup.changed(asDp) | startRestartGroup.changed(f);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$GradingArk$1$1
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
                    public final void invoke2(DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float m4342getMinDimensionimpl = Size.m4342getMinDimensionimpl(Canvas.mo5071getSizeNHjbRc());
                        float f2 = 2;
                        long Offset = OffsetKt.Offset(Size.m4343getWidthimpl(Canvas.mo5071getSizeNHjbRc()) / f2, Size.m4340getHeightimpl(Canvas.mo5071getSizeNHjbRc()));
                        float f3 = m4342getMinDimensionimpl * f2;
                        DrawScope.m5050drawArcyD3GUKo$default(Canvas, ColorKt.Color(4292138196L), 180.0f, 180.0f, false, OffsetKt.Offset(Offset.m4274getXimpl(Offset) - m4342getMinDimensionimpl, Offset.m4275getYimpl(Offset) - m4342getMinDimensionimpl), androidx.compose.ui.geometry.SizeKt.Size(f3, f3), 0.0f, new Stroke(Canvas.mo677toPx0680j_4(asDp), 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
                        DrawScope.m5049drawArcillE91I$default(Canvas, Brush.Companion.m4466linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4505boximpl(ColorKt.Color(4294618905L)), Color.m4505boximpl(ColorKt.Color(4294929409L))}), 0L, 0L, 0, 14, (Object) null), 180.0f, f * 180.0f, false, OffsetKt.Offset(Offset.m4274getXimpl(Offset) - m4342getMinDimensionimpl, Offset.m4275getYimpl(Offset) - m4342getMinDimensionimpl), androidx.compose.ui.geometry.SizeKt.Size(f3, f3), 0.0f, new Stroke(Canvas.mo677toPx0680j_4(asDp), 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m985padding3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$GradingArk$2
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
                    OnBoardingScreenPage2Kt.GradingArk(Modifier.this, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void GradingFireworks(final Modifier modifier, final Function1<? super Float, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1154181894);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1154181894, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.GradingFireworks (OnBoardingScreenPage2.kt:497)");
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m7636boximpl(LottieCompositionSpec.RawRes.m7637constructorimpl(R.raw.coin_lottie_anim3_fireworks)), null, null, null, null, null, startRestartGroup, 0, 62);
            final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(GradingFireworks$lambda$32(rememberLottieComposition), false, false, false, null, 0.0f, 0, null, false, false, startRestartGroup, 8, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            LottieComposition GradingFireworks$lambda$32 = GradingFireworks$lambda$32(rememberLottieComposition);
            startRestartGroup.startReplaceableGroup(2018382517);
            boolean changedInstance = startRestartGroup.changedInstance(function1) | startRestartGroup.changed(animateLottieCompositionAsState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Float>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$GradingFireworks$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        float GradingFireworks$lambda$33;
                        float GradingFireworks$lambda$332;
                        Function1<Float, Unit> function12 = function1;
                        GradingFireworks$lambda$33 = OnBoardingScreenPage2Kt.GradingFireworks$lambda$33(animateLottieCompositionAsState);
                        function12.invoke(Float.valueOf(GradingFireworks$lambda$33));
                        GradingFireworks$lambda$332 = OnBoardingScreenPage2Kt.GradingFireworks$lambda$33(animateLottieCompositionAsState);
                        return Float.valueOf(GradingFireworks$lambda$332);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            LottieAnimationKt.LottieAnimation(GradingFireworks$lambda$32, (Function0) rememberedValue, modifier, false, false, false, null, false, null, null, null, false, null, null, composer2, ((i3 << 6) & 896) | 8, 0, 16376);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$GradingFireworks$2
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
                    OnBoardingScreenPage2Kt.GradingFireworks(Modifier.this, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage2Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-614450906);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-614450906, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage2Preview (OnBoardingScreenPage2.kt:541)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage2Kt.INSTANCE.m7823getLambda3$splash_release(), startRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage2Kt$OnboardingPage2Preview$1
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
                    OnBoardingScreenPage2Kt.OnboardingPage2Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean OnboardingPage2$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean OnboardingPage2$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean OnboardingPage2$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean OnboardingPage2$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean OnboardingPage2$lambda$18$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final LottieComposition GradingLottieAnimation$lambda$19(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final float GradingLottieAnimation$lambda$20(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final Bitmap GradingLottieAnimation$lambda$22(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    private static final Bitmap GradingLottieAnimation$lambda$24(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean Page2GradingCard1$lambda$27(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float Page2GradingCard1$lambda$29(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final LottieComposition GradingFireworks$lambda$32(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final float GradingFireworks$lambda$33(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
