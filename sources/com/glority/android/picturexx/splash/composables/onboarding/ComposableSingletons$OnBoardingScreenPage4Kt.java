package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
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
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBoardingScreenPage4.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$OnBoardingScreenPage4Kt {
    public static final ComposableSingletons$OnBoardingScreenPage4Kt INSTANCE = new ComposableSingletons$OnBoardingScreenPage4Kt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f137lambda1 = ComposableLambdaKt.composableLambdaInstance(2107773535, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2107773535, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-1.<anonymous> (OnBoardingScreenPage4.kt:153)");
            }
            OnBoardingScreenPage4Kt.access$Profile1(Modifier.INSTANCE, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f141lambda2 = ComposableLambdaKt.composableLambdaInstance(1901727510, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901727510, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-2.<anonymous> (OnBoardingScreenPage4.kt:172)");
            }
            OnBoardingScreenPage4Kt.access$Profile3(Modifier.INSTANCE, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f142lambda3 = ComposableLambdaKt.composableLambdaInstance(1951769065, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951769065, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-3.<anonymous> (OnBoardingScreenPage4.kt:193)");
            }
            OnBoardingScreenPage4Kt.access$Profile2(Modifier.INSTANCE, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f143lambda4 = ComposableLambdaKt.composableLambdaInstance(809686028, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(809686028, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-4.<anonymous> (OnBoardingScreenPage4.kt:282)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f144lambda5 = ComposableLambdaKt.composableLambdaInstance(-105160523, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-105160523, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-5.<anonymous> (OnBoardingScreenPage4.kt:293)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f145lambda6 = ComposableLambdaKt.composableLambdaInstance(-1274514115, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Card, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1274514115, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-6.<anonymous> (OnBoardingScreenPage4.kt:257)");
                }
                Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x36, composer, 0), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x40, composer, 0), 7, null), 0.0f, ComposableExtensionsKt.asDp(R.dimen.x68, composer, 0), 0.0f, 0.0f, 13, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m989paddingqDBjuR0$default);
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
                Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_7_24_expert_consultation, composer, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 6, 129490);
                SurfaceKt.m2864SurfaceT9BRK9s(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x20, composer, 0), 0.0f, 0.0f, 13, null), 0.0f, 1, null), ComposableExtensionsKt.asDp(R.dimen.x15, composer, 0)), RoundedCornerShapeKt.RoundedCornerShape(50), ColorKt.Color(4294046193L), 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage4Kt.INSTANCE.m7842getLambda4$splash_release(), composer, 12583296, 120);
                SurfaceKt.m2864SurfaceT9BRK9s(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x30, composer, 0), 0.0f, 0.0f, 13, null), 0.0f, 1, null), ComposableExtensionsKt.asDp(R.dimen.x15, composer, 0)), RoundedCornerShapeKt.RoundedCornerShape(50), ColorKt.Color(4294046193L), 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage4Kt.INSTANCE.m7843getLambda5$splash_release(), composer, 12583296, 120);
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

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f146lambda7 = ComposableLambdaKt.composableLambdaInstance(178825935, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178825935, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-7.<anonymous> (OnBoardingScreenPage4.kt:357)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f147lambda8 = ComposableLambdaKt.composableLambdaInstance(-1793806402, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v3 */
        public final void invoke(ColumnScope Card, Composer composer, int i) {
            boolean z;
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1793806402, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-8.<anonymous> (OnBoardingScreenPage4.kt:326)");
                }
                ?? r14 = 0;
                float f = 0.0f;
                int i2 = 2;
                Alignment.Vertical vertical = null;
                Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x36, composer, 0), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x40, composer, 0), 7, null), 0.0f, ComposableExtensionsKt.asDp(R.dimen.x68, composer, 0), 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int i3 = -1323940314;
                String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m989paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = -692256719;
                String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
                Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceableGroup(615343959);
                int i5 = 3;
                int i6 = 1;
                int i7 = 0;
                for (Object obj : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.icon_coin_onboarding_vast_knowledge_brownze), Integer.valueOf(R.drawable.icon_coin_onboarding_vast_knowledge_silver), Integer.valueOf(R.drawable.icon_coin_onboarding_vast_knowledge_gold)})) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int intValue = ((Number) obj).intValue();
                    Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i6, vertical), vertical, r14, i5, vertical);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                    ComposerKt.sourceInformationMarkerStart(composer, i3, str);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, r14);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, i4, str2);
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
                    Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i9 = i7;
                    String str3 = str2;
                    String str4 = str;
                    ImageKt.Image(ComposableExtensionsKt.asPainter(intValue, composer, r14), "", SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x60, composer, r14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                    SpacerKt.Spacer(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x50, composer, r14)), composer, r14);
                    int i10 = i3;
                    Alignment.Vertical vertical2 = vertical;
                    int i11 = i2;
                    SurfaceKt.m2864SurfaceT9BRK9s(RowScope.weight$default(rowScopeInstance, SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x15, composer, r14)), 1.0f, false, 2, null), RoundedCornerShapeKt.RoundedCornerShape(50), ColorKt.Color(4294046193L), 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage4Kt.INSTANCE.m7845getLambda7$splash_release(), composer, 12583296, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (i9 != i11) {
                        z = false;
                        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x20, composer, 0)), composer, 0);
                    } else {
                        z = false;
                    }
                    i2 = i11;
                    i7 = i8;
                    i4 = -692256719;
                    i3 = i10;
                    vertical = vertical2;
                    i6 = 1;
                    i5 = 3;
                    str2 = str3;
                    str = str4;
                    f = 0.0f;
                    r14 = z;
                }
                composer.endReplaceableGroup();
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

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f148lambda9 = ComposableLambdaKt.composableLambdaInstance(1274952885, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1274952885, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-9.<anonymous> (OnBoardingScreenPage4.kt:375)");
                }
                ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_coin_onboarding_vast_knowledge_top_30, composer, 0), "", SizeKt.m1030size3ABfNKs(PaddingKt.m985padding3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x10, composer, 0)), ComposableExtensionsKt.asDp(R.dimen.x100, composer, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f138lambda10 = ComposableLambdaKt.composableLambdaInstance(-340466352, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-340466352, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-10.<anonymous> (OnBoardingScreenPage4.kt:440)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f139lambda11 = ComposableLambdaKt.composableLambdaInstance(1981868607, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-11$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v5 */
        public final void invoke(ColumnScope Card, Composer composer, int i) {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1981868607, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-11.<anonymous> (OnBoardingScreenPage4.kt:408)");
                }
                ?? r12 = 0;
                float f = 0.0f;
                Alignment.Vertical vertical = null;
                Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m989paddingqDBjuR0$default(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x36, composer2, 0), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x40, composer2, 0), 7, null), 0.0f, ComposableExtensionsKt.asDp(R.dimen.x68, composer2, 0), 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int i2 = -1323940314;
                String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m989paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i3 = -692256719;
                String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4008constructorimpl = Updater.m4008constructorimpl(composer);
                Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-1971565610);
                int i4 = 3;
                int i5 = 1;
                int i6 = 0;
                for (Object obj : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.onboarding_vast_knowledge_mintage), Integer.valueOf(R.string.onboarding_vast_knowledge_composition), Integer.valueOf(R.string.onboarding_vast_knowledge_weight)})) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int intValue = ((Number) obj).intValue();
                    Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, vertical), vertical, r12, i4, vertical);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, i2, str);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r12);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, wrapContentHeight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, i3, str2);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer);
                    Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str3 = str2;
                    int i8 = i4;
                    int i9 = i6;
                    String str4 = str;
                    Alignment.Vertical vertical2 = vertical;
                    float f2 = f;
                    TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(intValue, composer2, r12), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                    SpacerKt.Spacer(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x50, composer, 0)), composer, 0);
                    SurfaceKt.m2864SurfaceT9BRK9s(RowScope.weight$default(rowScopeInstance, SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x15, composer, 0)), 1.0f, false, 2, null), RoundedCornerShapeKt.RoundedCornerShape(50), ColorKt.Color(4294046193L), 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage4Kt.INSTANCE.m7837getLambda10$splash_release(), composer, 12583296, 120);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (i9 != 2) {
                        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x20, composer, 0)), composer, 0);
                    }
                    composer2 = composer;
                    r12 = 0;
                    i6 = i7;
                    i5 = 1;
                    i4 = i8;
                    str2 = str3;
                    i3 = -692256719;
                    str = str4;
                    i2 = -1323940314;
                    vertical = vertical2;
                    f = f2;
                }
                composer.endReplaceableGroup();
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

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f140lambda12 = ComposableLambdaKt.composableLambdaInstance(-1111662489, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-12$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1111662489, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt.lambda-12.<anonymous> (OnBoardingScreenPage4.kt:478)");
            }
            OnBoardingScreenPage4Kt.OnboardingPage4(Modifier.INSTANCE, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.ComposableSingletons$OnBoardingScreenPage4Kt$lambda-12$1.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7836getLambda1$splash_release() {
        return f137lambda1;
    }

    /* renamed from: getLambda-10$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7837getLambda10$splash_release() {
        return f138lambda10;
    }

    /* renamed from: getLambda-11$splash_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7838getLambda11$splash_release() {
        return f139lambda11;
    }

    /* renamed from: getLambda-12$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7839getLambda12$splash_release() {
        return f140lambda12;
    }

    /* renamed from: getLambda-2$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7840getLambda2$splash_release() {
        return f141lambda2;
    }

    /* renamed from: getLambda-3$splash_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7841getLambda3$splash_release() {
        return f142lambda3;
    }

    /* renamed from: getLambda-4$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7842getLambda4$splash_release() {
        return f143lambda4;
    }

    /* renamed from: getLambda-5$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7843getLambda5$splash_release() {
        return f144lambda5;
    }

    /* renamed from: getLambda-6$splash_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7844getLambda6$splash_release() {
        return f145lambda6;
    }

    /* renamed from: getLambda-7$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7845getLambda7$splash_release() {
        return f146lambda7;
    }

    /* renamed from: getLambda-8$splash_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7846getLambda8$splash_release() {
        return f147lambda8;
    }

    /* renamed from: getLambda-9$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7847getLambda9$splash_release() {
        return f148lambda9;
    }
}
