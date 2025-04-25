package com.glority.android.picturexx.splash.composables.onboarding;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
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
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnBoardingScreenPage3.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"OnboardingPage3", "", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Page3CoinCard", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Page3CollectionCardAvatar", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ManageCollectionCard", "ManageCollectionGoldCoin", "ManageCollectionSilverCoin", "OnboardingPage3Preview", "(Landroidx/compose/runtime/Composer;I)V", "splash_release", "flipAnimStart", "", "rotationX", "", "coinCardVisibilityAnim", "goldCoinVisibilityAnim", "silverCoinVisibilityAnim", "transitionAnimationState", "moveDownDp", "Landroidx/compose/ui/unit/Dp;", "moveUpDp"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OnBoardingScreenPage3Kt {
    public static final /* synthetic */ void access$ManageCollectionCard(Modifier modifier, Composer composer, int i) {
        ManageCollectionCard(modifier, composer, i);
    }

    public static final /* synthetic */ void access$ManageCollectionGoldCoin(Modifier modifier, Composer composer, int i) {
        ManageCollectionGoldCoin(modifier, composer, i);
    }

    public static final /* synthetic */ void access$ManageCollectionSilverCoin(Modifier modifier, Composer composer, int i) {
        ManageCollectionSilverCoin(modifier, composer, i);
    }

    public static final void OnboardingPage3(final Modifier modifier, final Function0<Unit> onAnimationFinish, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onAnimationFinish, "onAnimationFinish");
        Composer startRestartGroup = composer.startRestartGroup(-147262545);
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
                ComposerKt.traceEventStart(-147262545, i3, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage3 (OnBoardingScreenPage3.kt:59)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState = (MutableState) rememberedValue;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!OnboardingPage3$lambda$1(mutableState) ? 90.0f : 0.0f, AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, "rotationX", null, startRestartGroup, 3120, 20);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(2018370019);
            boolean changed = startRestartGroup.changed(mutableState);
            OnBoardingScreenPage3Kt$OnboardingPage3$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new OnBoardingScreenPage3Kt$OnboardingPage3$1$1(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 70);
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
            Modifier align = boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenter());
            startRestartGroup.startReplaceableGroup(2018370324);
            boolean changed2 = startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$OnboardingPage3$2$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayer) {
                        float OnboardingPage3$lambda$3;
                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                        OnboardingPage3$lambda$3 = OnBoardingScreenPage3Kt.OnboardingPage3$lambda$3(animateFloatAsState);
                        graphicsLayer.setRotationX(OnboardingPage3$lambda$3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.bg_coin_onboarding_vast_knowledge, startRestartGroup, 0), (String) null, GraphicsLayerModifierKt.graphicsLayer(align, (Function1) rememberedValue3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.onboarding_vast_knowledge_title, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m987paddingVpY3zN4$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x160, startRestartGroup, 0), 0.0f, 0.0f, 13, null), ComposableExtensionsKt.asDp(R.dimen.x40, startRestartGroup, 0), 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null), Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(44), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(50), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 6, 129488);
            composer2 = startRestartGroup;
            Page3CoinCard(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x50, composer2, 0), 0.0f, 2, null), Alignment.INSTANCE.getCenter()), 0.0f, 1, null), null, false, 3, null), onAnimationFinish, composer2, i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA, 0);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$OnboardingPage3$3
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
                    OnBoardingScreenPage3Kt.OnboardingPage3(Modifier.this, onAnimationFinish, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage3$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Page3CoinCard(final androidx.compose.ui.Modifier r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt.Page3CoinCard(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void Page3CoinCard$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void Page3CoinCard$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void Page3CoinCard$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void Page3CoinCard$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void Page3CollectionCardAvatar(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-880498051);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880498051, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.Page3CollectionCardAvatar (OnBoardingScreenPage3.kt:248)");
            }
            composer2 = startRestartGroup;
            SurfaceKt.m2864SurfaceT9BRK9s(SizeKt.wrapContentSize$default(modifier, null, false, 3, null), RoundedCornerShapeKt.getCircleShape(), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7830getLambda4$splash_release(), startRestartGroup, 12583344, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$Page3CollectionCardAvatar$1
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
                    OnBoardingScreenPage3Kt.Page3CollectionCardAvatar(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ManageCollectionCard(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(24567617);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(24567617, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.ManageCollectionCard (OnBoardingScreenPage3.kt:268)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ComposableExtensionsKt.asDp(R.dimen.x54, startRestartGroup, 0), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(ComposableExtensionsKt.asDp(R.dimen.x30, startRestartGroup, 0)), CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.INSTANCE.m4552getWhite0d7_KjU(), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 54, 12), CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(Dp.m6997constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7831getLambda5$splash_release(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            Page3CollectionCardAvatar(boxScopeInstance.align(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x40, startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), Alignment.INSTANCE.getTopStart()), startRestartGroup, 0);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$ManageCollectionCard$2
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
                    OnBoardingScreenPage3Kt.ManageCollectionCard(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ManageCollectionGoldCoin(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1351528126);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1351528126, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.ManageCollectionGoldCoin (OnBoardingScreenPage3.kt:380)");
            }
            composer2 = startRestartGroup;
            CardKt.Card(modifier, RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(ComposableExtensionsKt.asDp(R.dimen.x30, startRestartGroup, 0)), CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.INSTANCE.m4552getWhite0d7_KjU(), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 54, 12), CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(Dp.m6997constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7834getLambda8$splash_release(), startRestartGroup, (i2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$ManageCollectionGoldCoin$1
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
                    OnBoardingScreenPage3Kt.ManageCollectionGoldCoin(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ManageCollectionSilverCoin(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1778058671);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1778058671, i2, -1, "com.glority.android.picturexx.splash.composables.onboarding.ManageCollectionSilverCoin (OnBoardingScreenPage3.kt:434)");
            }
            composer2 = startRestartGroup;
            CardKt.Card(modifier, RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(ComposableExtensionsKt.asDp(R.dimen.x30, startRestartGroup, 0)), CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.INSTANCE.m4552getWhite0d7_KjU(), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 54, 12), CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(Dp.m6997constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7826getLambda11$splash_release(), startRestartGroup, (i2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$ManageCollectionSilverCoin$1
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
                    OnBoardingScreenPage3Kt.ManageCollectionSilverCoin(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void OnboardingPage3Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1601003804);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1601003804, i, -1, "com.glority.android.picturexx.splash.composables.onboarding.OnboardingPage3Preview (OnBoardingScreenPage3.kt:504)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OnBoardingScreenPage3Kt.INSTANCE.m7827getLambda12$splash_release(), startRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.onboarding.OnBoardingScreenPage3Kt$OnboardingPage3Preview$1
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
                    OnBoardingScreenPage3Kt.OnboardingPage3Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final boolean OnboardingPage3$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float OnboardingPage3$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final boolean Page3CoinCard$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean Page3CoinCard$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean Page3CoinCard$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean Page3CoinCard$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final float Page3CoinCard$lambda$20(State<Dp> state) {
        return state.getValue().m7011unboximpl();
    }

    private static final float Page3CoinCard$lambda$21(State<Dp> state) {
        return state.getValue().m7011unboximpl();
    }
}
