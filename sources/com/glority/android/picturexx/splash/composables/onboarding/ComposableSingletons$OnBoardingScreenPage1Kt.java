package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBoardingScreenPage1.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$OnBoardingScreenPage1Kt {
    public static final ComposableSingletons$OnBoardingScreenPage1Kt INSTANCE = new ComposableSingletons$OnBoardingScreenPage1Kt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f117lambda1 = ComposableLambdaKt.composableLambdaInstance(303607520, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(303607520, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt.lambda-1.<anonymous> (OnBoardingScreenPage1.kt:102)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_identify_title, composer, 0), wrapContentHeight$default, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(44), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(50), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200112, 6, 129488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f118lambda2 = ComposableLambdaKt.composableLambdaInstance(1522353126, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522353126, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt.lambda-2.<anonymous> (OnBoardingScreenPage1.kt:157)");
            }
            OnBoardingScreenPage1Kt.access$Page1CoinCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f119lambda3 = ComposableLambdaKt.composableLambdaInstance(1764373978, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Card, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(Card) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1764373978, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt.lambda-3.<anonymous> (OnBoardingScreenPage1.kt:226)");
                }
                SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x140, composer, 0)), composer, 0);
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_sample_coin_name, composer, 0), Card.align(SizeKt.fillMaxWidth$default(SizeKt.m1016height3ABfNKs(PaddingKt.m985padding3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(10)), ComposableExtensionsKt.asDp(R.dimen.x328, composer, 0)), 0.0f, 1, null), Alignment.INSTANCE.getCenterHorizontally()), Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(21), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 6, 129488);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f120lambda4 = ComposableLambdaKt.composableLambdaInstance(365607890, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(365607890, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt.lambda-4.<anonymous> (OnBoardingScreenPage1.kt:207)");
                }
                Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4008constructorimpl = Updater.m4008constructorimpl(composer);
                Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 10;
                CardKt.Card(SizeKt.fillMaxWidth$default(SizeKt.m1016height3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m987paddingVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x100, composer, 0), 0.0f, 0.0f, 13, null), Dp.m6997constructorimpl(f), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m6997constructorimpl(f), 7, null), ComposableExtensionsKt.asDp(R.dimen.x288, composer, 0)), 0.0f, 1, null), null, CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.INSTANCE.m4552getWhite0d7_KjU(), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0L, composer, (CardDefaults.$stable << 12) | 54, 12), CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(Dp.m6997constructorimpl(5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableSingletons$OnBoardingScreenPage1Kt.INSTANCE.m7818getLambda3$splash_release(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(ComposableExtensionsKt.asDp(R.dimen.x188, composer, 0) + Dp.m6997constructorimpl(20))), Alignment.INSTANCE.getTopCenter()), RoundedCornerShapeKt.getCircleShape()), Color.INSTANCE.m4552getWhite0d7_KjU(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m540backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer);
                Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.image_onboarding_sample_coin, composer, 0), "sample coin", BoxScopeInstance.INSTANCE.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x188, composer, 0)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f121lambda5 = ComposableLambdaKt.composableLambdaInstance(1847996205, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1847996205, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt.lambda-5.<anonymous> (OnBoardingScreenPage1.kt:266)");
                }
                OnBoardingScreenPage1Kt.OnboardingPage1(Modifier.INSTANCE, new Function1<Float, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-5$1.1
                    public final void invoke(float f) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }
                }, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage1Kt$lambda-5$1.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, composer, 438);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7816getLambda1$splash_release() {
        return f117lambda1;
    }

    /* renamed from: getLambda-2$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7817getLambda2$splash_release() {
        return f118lambda2;
    }

    /* renamed from: getLambda-3$splash_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7818getLambda3$splash_release() {
        return f119lambda3;
    }

    /* renamed from: getLambda-4$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7819getLambda4$splash_release() {
        return f120lambda4;
    }

    /* renamed from: getLambda-5$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7820getLambda5$splash_release() {
        return f121lambda5;
    }
}
