package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.picturexx.splash.R;
import com.glority.android.picturexx.splash.logevents.SplashLogEvents;
import com.glority.base.composables.ComposableExtensionsKt;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBoardingScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"OnBoardingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "IndicatorArk", "totalCount", "", "index", "(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)V", "PreviewOnBoardingScreen", "(Landroidx/compose/runtime/Composer;I)V", "splash_release", "currentPage", "Lcom/glority/android/picturexx/splash/composables/onboarding/OnBoardingScreenPage;", "animation1Progress", "", "onboardingLogStep", "startAngle"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingScreenKt {
    public static final void OnBoardingScreen(final Modifier modifier, final Function0<Unit> onAnimationFinish, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onAnimationFinish, "onAnimationFinish");
        Composer startRestartGroup = composer.startRestartGroup(2014905569);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(onAnimationFinish) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2014905569, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreen (OnBoardingScreen.kt:46)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OnBoardingScreenPage.PAGE_1, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            AnimatedVisibilityKt.AnimatedVisibility((OnBoardingScreen$lambda$1(mutableState) == OnBoardingScreenPage.PAGE_1 && OnBoardingScreen$lambda$4(mutableState2) > 0.5f) || OnBoardingScreen$lambda$1(mutableState) == OnBoardingScreenPage.PAGE_2 || OnBoardingScreen$lambda$1(mutableState) == OnBoardingScreenPage.PAGE_3 || OnBoardingScreen$lambda$1(mutableState) == OnBoardingScreenPage.PAGE_4, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1258172481, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$1

                /* compiled from: OnBoardingScreen.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                /* loaded from: classes5.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[OnBoardingScreenPage.values().length];
                        try {
                            iArr[OnBoardingScreenPage.PAGE_1.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_2.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_3.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_4.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

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

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
                
                    if (r7 != 4) goto L14;
                 */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
                /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(androidx.compose.animation.AnimatedVisibilityScope r5, androidx.compose.runtime.Composer r6, int r7) {
                    /*
                        r4 = this;
                        java.lang.String r0 = "$this$AnimatedVisibility"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                        boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r5 == 0) goto L14
                        r5 = -1
                        java.lang.String r0 = "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreen.<anonymous>.<anonymous> (OnBoardingScreen.kt:79)"
                        r1 = -1258172481(0xffffffffb501cfbf, float:-4.8358555E-7)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r1, r7, r5, r0)
                    L14:
                        androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.INSTANCE
                        androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
                        r7 = 0
                        r0 = 0
                        r1 = 1
                        androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r5, r7, r1, r0)
                        androidx.compose.runtime.MutableState<com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage> r7 = r1
                        com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage r7 = com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt.access$OnBoardingScreen$lambda$1(r7)
                        int[] r0 = com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$1.WhenMappings.$EnumSwitchMapping$0
                        int r7 = r7.ordinal()
                        r7 = r0[r7]
                        r0 = 0
                        r2 = 4
                        if (r7 == r1) goto L3c
                        r3 = 2
                        if (r7 == r3) goto L3d
                        r1 = 3
                        if (r7 == r1) goto L3a
                        if (r7 == r2) goto L3d
                        goto L3c
                    L3a:
                        r1 = r3
                        goto L3d
                    L3c:
                        r1 = r0
                    L3d:
                        r7 = 54
                        com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt.access$IndicatorArk(r5, r2, r1, r6, r7)
                        boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r5 == 0) goto L4b
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L4b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$1.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                }
            }), startRestartGroup, 200112, 16);
            AnimatedContentKt.AnimatedContent(OnBoardingScreen$lambda$1(mutableState), modifier, new Function1<AnimatedContentTransitionScope<OnBoardingScreenPage>, ContentTransform>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$2
                @Override // kotlin.jvm.functions.Function1
                public final ContentTransform invoke(AnimatedContentTransitionScope<OnBoardingScreenPage> AnimatedContent) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                }
            }, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1304675446, true, new Function4<AnimatedContentScope, OnBoardingScreenPage, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3

                /* compiled from: OnBoardingScreen.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                /* loaded from: classes5.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[OnBoardingScreenPage.values().length];
                        try {
                            iArr[OnBoardingScreenPage.PAGE_1.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_2.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_3.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_4.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[OnBoardingScreenPage.PAGE_5.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, OnBoardingScreenPage onBoardingScreenPage, Composer composer2, Integer num) {
                    invoke(animatedContentScope, onBoardingScreenPage, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, OnBoardingScreenPage it, Composer composer2, int i4) {
                    int OnBoardingScreen$lambda$7;
                    int OnBoardingScreen$lambda$72;
                    int OnBoardingScreen$lambda$73;
                    int OnBoardingScreen$lambda$74;
                    int OnBoardingScreen$lambda$75;
                    int OnBoardingScreen$lambda$76;
                    int OnBoardingScreen$lambda$77;
                    int OnBoardingScreen$lambda$78;
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1304675446, i4, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreen.<anonymous>.<anonymous> (OnBoardingScreen.kt:100)");
                    }
                    int i5 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                    if (i5 == 1) {
                        composer2.startReplaceableGroup(806154242);
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer2.startReplaceableGroup(528923498);
                        boolean changed = composer2.changed(mutableState3) | composer2.changed(mutableState2);
                        final MutableState<Integer> mutableState4 = mutableState3;
                        final MutableState<Float> mutableState5 = mutableState2;
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3$1$1
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
                                    int OnBoardingScreen$lambda$79;
                                    int OnBoardingScreen$lambda$710;
                                    int OnBoardingScreen$lambda$711;
                                    int OnBoardingScreen$lambda$712;
                                    double d = f;
                                    if (d <= 0.5d) {
                                        OnBoardingScreen$lambda$711 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState4);
                                        if (OnBoardingScreen$lambda$711 == 0) {
                                            new LogEventRequest(SplashLogEvents.Onboarding_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STEP, 0))).post();
                                            MutableState<Integer> mutableState6 = mutableState4;
                                            OnBoardingScreen$lambda$712 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState6);
                                            OnBoardingScreenKt.OnBoardingScreen$lambda$8(mutableState6, OnBoardingScreen$lambda$712 + 1);
                                        }
                                    }
                                    if (d > 0.5d) {
                                        OnBoardingScreen$lambda$79 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState4);
                                        if (OnBoardingScreen$lambda$79 == 1) {
                                            new LogEventRequest(SplashLogEvents.Onboarding_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STEP, 1))).post();
                                            MutableState<Integer> mutableState7 = mutableState4;
                                            OnBoardingScreen$lambda$710 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState7);
                                            OnBoardingScreenKt.OnBoardingScreen$lambda$8(mutableState7, OnBoardingScreen$lambda$710 + 1);
                                        }
                                    }
                                    OnBoardingScreenKt.OnBoardingScreen$lambda$5(mutableState5, f);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        Function1 function1 = (Function1) rememberedValue4;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(528924214);
                        boolean changed2 = composer2.changed(mutableState);
                        final MutableState<OnBoardingScreenPage> mutableState6 = mutableState;
                        Object rememberedValue5 = composer2.rememberedValue();
                        if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                    mutableState6.setValue(OnBoardingScreenPage.PAGE_2);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        OnBoardingScreenPage1Kt.OnboardingPage1(fillMaxSize$default, function1, (Function0) rememberedValue5, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else if (i5 == 2) {
                        composer2.startReplaceableGroup(806155198);
                        OnBoardingScreen$lambda$7 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState3);
                        if (OnBoardingScreen$lambda$7 == 2) {
                            new LogEventRequest(SplashLogEvents.Onboarding_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STEP, 2))).post();
                            MutableState<Integer> mutableState7 = mutableState3;
                            OnBoardingScreen$lambda$72 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState7);
                            OnBoardingScreenKt.OnBoardingScreen$lambda$8(mutableState7, OnBoardingScreen$lambda$72 + 1);
                        }
                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer2.startReplaceableGroup(528924705);
                        boolean changed3 = composer2.changed(mutableState);
                        final MutableState<OnBoardingScreenPage> mutableState8 = mutableState;
                        Object rememberedValue6 = composer2.rememberedValue();
                        if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3$3$1
                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                    mutableState8.setValue(OnBoardingScreenPage.PAGE_3);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        OnBoardingScreenPage2Kt.OnboardingPage2(fillMaxSize$default2, (Function0) rememberedValue6, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else if (i5 == 3) {
                        composer2.startReplaceableGroup(806155689);
                        OnBoardingScreen$lambda$73 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState3);
                        if (OnBoardingScreen$lambda$73 == 3) {
                            new LogEventRequest(SplashLogEvents.Onboarding_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STEP, 3))).post();
                            MutableState<Integer> mutableState9 = mutableState3;
                            OnBoardingScreen$lambda$74 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState9);
                            OnBoardingScreenKt.OnBoardingScreen$lambda$8(mutableState9, OnBoardingScreen$lambda$74 + 1);
                        }
                        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer2.startReplaceableGroup(528925196);
                        boolean changed4 = composer2.changed(mutableState);
                        final MutableState<OnBoardingScreenPage> mutableState10 = mutableState;
                        Object rememberedValue7 = composer2.rememberedValue();
                        if (changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3$4$1
                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                    mutableState10.setValue(OnBoardingScreenPage.PAGE_4);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        composer2.endReplaceableGroup();
                        OnBoardingScreenPage3Kt.OnboardingPage3(fillMaxSize$default3, (Function0) rememberedValue7, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else if (i5 == 4) {
                        composer2.startReplaceableGroup(806156180);
                        OnBoardingScreen$lambda$75 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState3);
                        if (OnBoardingScreen$lambda$75 == 4) {
                            new LogEventRequest(SplashLogEvents.Onboarding_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STEP, 4))).post();
                            MutableState<Integer> mutableState11 = mutableState3;
                            OnBoardingScreen$lambda$76 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState11);
                            OnBoardingScreenKt.OnBoardingScreen$lambda$8(mutableState11, OnBoardingScreen$lambda$76 + 1);
                        }
                        Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer2.startReplaceableGroup(528925687);
                        boolean changed5 = composer2.changed(mutableState);
                        final MutableState<OnBoardingScreenPage> mutableState12 = mutableState;
                        Object rememberedValue8 = composer2.rememberedValue();
                        if (changed5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3$5$1
                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                    mutableState12.setValue(OnBoardingScreenPage.PAGE_5);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        composer2.endReplaceableGroup();
                        OnBoardingScreenPage4Kt.OnboardingPage4(fillMaxSize$default4, (Function0) rememberedValue8, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        if (i5 != 5) {
                            composer2.startReplaceableGroup(806154161);
                            composer2.endReplaceableGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceableGroup(806156671);
                        OnBoardingScreen$lambda$77 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState3);
                        if (OnBoardingScreen$lambda$77 == 5) {
                            new LogEventRequest(SplashLogEvents.Onboarding_Exposure, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STEP, 5))).post();
                            MutableState<Integer> mutableState13 = mutableState3;
                            OnBoardingScreen$lambda$78 = OnBoardingScreenKt.OnBoardingScreen$lambda$7(mutableState13);
                            OnBoardingScreenKt.OnBoardingScreen$lambda$8(mutableState13, OnBoardingScreen$lambda$78 + 1);
                        }
                        Modifier fillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer2.startReplaceableGroup(528926178);
                        boolean changedInstance = composer2.changedInstance(onAnimationFinish);
                        final Function0<Unit> function0 = onAnimationFinish;
                        Object rememberedValue9 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$1$3$6$1
                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        composer2.endReplaceableGroup();
                        OnBoardingScreenPage5Kt.OnboardingPage5(fillMaxSize$default5, (Function0) rememberedValue9, composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, ((i3 << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 1573248, 56);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$OnBoardingScreen$2
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
                    OnBoardingScreenKt.OnBoardingScreen(Modifier.this, onAnimationFinish, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnBoardingScreen$lambda$5(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnBoardingScreen$lambda$8(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IndicatorArk(final Modifier modifier, final int i, final int i2, Composer composer, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-879936169);
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879936169, i4, -1, "com.glority.android.picturexx.splash.composables.onboarding.IndicatorArk (OnBoardingScreen.kt:167)");
            }
            final float asDp = ComposableExtensionsKt.asDp(R.dimen.x12, startRestartGroup, 0);
            final float f = 60.0f;
            final float f2 = 60.0f / i;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(120.0f - (i2 * f2), AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, startRestartGroup, 48, 28);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(528926742);
            boolean changed = startRestartGroup.changed(60.0f) | startRestartGroup.changed(asDp) | startRestartGroup.changed(i) | startRestartGroup.changed(i2) | startRestartGroup.changed(animateFloatAsState) | startRestartGroup.changed(f2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i5 = 0;
                composer2 = startRestartGroup;
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$IndicatorArk$1$1
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
                        float IndicatorArk$lambda$10;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float f3 = 2;
                        DrawScope.m5050drawArcyD3GUKo$default(Canvas, Color.m4514copywmQWz5c$default(Color.INSTANCE.m4541getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 120.0f, -f, false, OffsetKt.Offset(asDp / f3, Size.m4341getMaxDimensionimpl(Canvas.mo5071getSizeNHjbRc()) * 0.35f), androidx.compose.ui.geometry.SizeKt.Size(Size.m4342getMinDimensionimpl(Canvas.mo5071getSizeNHjbRc()) - asDp, Size.m4342getMinDimensionimpl(Canvas.mo5071getSizeNHjbRc()) - asDp), 0.0f, new Stroke(asDp, 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
                        int i6 = i2;
                        if (i6 < 0 || i6 >= i) {
                            return;
                        }
                        long Color = ColorKt.Color(4281545523L);
                        IndicatorArk$lambda$10 = OnBoardingScreenKt.IndicatorArk$lambda$10(animateFloatAsState);
                        DrawScope.m5050drawArcyD3GUKo$default(Canvas, Color, IndicatorArk$lambda$10, -f2, false, OffsetKt.Offset(asDp / f3, Size.m4341getMaxDimensionimpl(Canvas.mo5071getSizeNHjbRc()) * 0.35f), androidx.compose.ui.geometry.SizeKt.Size(Size.m4342getMinDimensionimpl(Canvas.mo5071getSizeNHjbRc()) - asDp, Size.m4342getMinDimensionimpl(Canvas.mo5071getSizeNHjbRc()) - asDp), 0.0f, new Stroke(asDp, 0.0f, StrokeCap.INSTANCE.m4869getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            } else {
                i5 = 0;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, composer2, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$IndicatorArk$2
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

                public final void invoke(Composer composer3, int i6) {
                    OnBoardingScreenKt.IndicatorArk(Modifier.this, i, i2, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    public static final void PreviewOnBoardingScreen(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(273395666);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(273395666, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.PreviewOnBoardingScreen (OnBoardingScreen.kt:216)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenKt.INSTANCE.m7815getLambda1$splash_release(), startRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenKt$PreviewOnBoardingScreen$1
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
                    OnBoardingScreenKt.PreviewOnBoardingScreen(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnBoardingScreenPage OnBoardingScreen$lambda$1(MutableState<OnBoardingScreenPage> mutableState) {
        return mutableState.getValue();
    }

    private static final float OnBoardingScreen$lambda$4(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OnBoardingScreen$lambda$7(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float IndicatorArk$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }
}
