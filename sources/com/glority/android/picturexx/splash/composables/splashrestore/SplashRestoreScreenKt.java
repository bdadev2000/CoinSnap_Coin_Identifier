package com.glority.android.picturexx.splash.composables.splashrestore;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SplashRestoreScreen.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\u001a1\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0015\u001a7\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"SplashRestoreScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/glority/android/picturexx/splash/composables/splashrestore/RestoreState;", "onClose", "Lkotlin/Function0;", "onEmailSend", "Lkotlin/Function1;", "", "onSkipManualRestore", "onSkipFailRestore", "onManualRestoreClick", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/splash/composables/splashrestore/RestoreState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SplashRestoreLoadingView", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "SplashRestoreDoneView", "SplashManualRestoreView", "onRestore", "onSkip", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SplashRestoreFailView", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SplashRestoreScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "splash_release", "animationStart", "", "progressFloat", "", "email"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashRestoreScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SplashRestoreScreen(final androidx.compose.ui.Modifier r26, final com.glority.android.picturexx.splash.composables.splashrestore.RestoreState r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt.SplashRestoreScreen(androidx.compose.ui.Modifier, com.glority.android.picturexx.splash.composables.splashrestore.RestoreState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashRestoreLoadingView(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1598994492);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598994492, i2, -1, "com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreLoadingView (SplashRestoreScreen.kt:163)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableState mutableState = (MutableState) rememberedValue;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!SplashRestoreLoadingView$lambda$3(mutableState) ? 0.0f : 0.95f, AnimationSpecKt.tween$default(2000, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, null, null, startRestartGroup, 48, 28);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1093426337);
            boolean changed = startRestartGroup.changed(mutableState);
            SplashRestoreScreenKt$SplashRestoreLoadingView$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SplashRestoreScreenKt$SplashRestoreLoadingView$1$1(mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 70);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.welcomescreen_title_text, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0L, TextUnitKt.getSp(34), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 6, 129492);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(16)), startRestartGroup, 6);
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.welcomescreen_subscription_status_message, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4285295724L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 6, 129520);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, wrapContentHeight$default);
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
            Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_splash_restore_coin_icon, composer2, 0), "restore coin icon", ColumnScopeInstance.INSTANCE.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(24)), new BiasAlignment.Horizontal((SplashRestoreLoadingView$lambda$5(animateFloatAsState) * 2) - 1)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, ComposableExtensionsKt.asDp(R.dimen.x10, composer2, 0)), composer2, 0);
            composer2.startReplaceableGroup(-1093424812);
            boolean changed2 = composer2.changed(animateFloatAsState);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Float>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreLoadingView$2$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        float SplashRestoreLoadingView$lambda$5;
                        SplashRestoreLoadingView$lambda$5 = SplashRestoreScreenKt.SplashRestoreLoadingView$lambda$5(animateFloatAsState);
                        return Float.valueOf(SplashRestoreLoadingView$lambda$5);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceableGroup();
            ProgressIndicatorKt.m2692LinearProgressIndicatorGJbTh5U((Function0) rememberedValue3, SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableExtensionsKt.asDp(R.dimen.x14, composer2, 0)), ComposableExtensionsKt.asColor(R.color.colorAccent, composer2, 0), ColorKt.Color(4293980400L), 0, Dp.m6997constructorimpl(0), new Function1<DrawScope, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreLoadingView$2$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope LinearProgressIndicator) {
                    Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }
            }, composer2, 1772544, 16);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreLoadingView$3
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
                    SplashRestoreScreenKt.SplashRestoreLoadingView(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashRestoreLoadingView$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashRestoreDoneView(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1281432228);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1281432228, i2, -1, "com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreDoneView (SplashRestoreScreen.kt:250)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.completescreen_title_text, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0L, TextUnitKt.getSp(34), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 6, 129492);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            TextKt.m3014Text4IGK_g("100%", PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6997constructorimpl(16), 7, null), ComposableExtensionsKt.asColor(R.color.colorAccent, startRestartGroup, 0), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199734, 0, 131024);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreDoneView$2
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
                    SplashRestoreScreenKt.SplashRestoreDoneView(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashManualRestoreView(final Modifier modifier, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1985552452);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1985552452, i3, -1, "com.glority.android.picturexx.splash.composables.splashrestore.SplashManualRestoreView (SplashRestoreScreen.kt:288)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.welcomescreen_title_text, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0L, TextUnitKt.getSp(34), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 6, 129492);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(16)), startRestartGroup, 6);
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.welcome_screen_message, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4285295724L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 6, 129520);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(20)), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1739079748);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            String stringResource = StringResources_androidKt.stringResource(R.string.welcome_screen_important_note, startRestartGroup, 0);
            builder.append(stringResource);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.welcome_screen_important_note_keyword, startRestartGroup, 0);
            int indexOf$default = StringsKt.indexOf$default((CharSequence) stringResource, stringResource2, 0, false, 6, (Object) null);
            if (indexOf$default != -1) {
                builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), indexOf$default, stringResource2.length() + indexOf$default);
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            startRestartGroup.endReplaceableGroup();
            TextKt.m3015TextIbK3jfQ(annotatedString, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4285295724L), TextUnitKt.getSp(16), null, null, null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, null, null, null, startRestartGroup, 3504, 6, 260592);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            composer2 = startRestartGroup;
            ButtonKt.Button(function0, PaddingKt.m989paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6997constructorimpl(12), 7, null), false, RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(100)), ButtonDefaults.INSTANCE.m2130buttonColorsro_MJ88(ComposableExtensionsKt.asColor(R.color.colorAccent, startRestartGroup, 0), 0L, 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 14), null, null, PaddingKt.m980PaddingValuesYgX7TsA$default(0.0f, ComposableExtensionsKt.asDp(R.dimen.x24, startRestartGroup, 0), 1, null), null, ComposableSingletons$SplashRestoreScreenKt.INSTANCE.m7851getLambda2$splash_release(), startRestartGroup, ((i3 >> 3) & 14) | 805306416, 356);
            ButtonKt.TextButton(function02, PaddingKt.m989paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6997constructorimpl(32), 7, null), false, null, null, null, null, null, null, ComposableSingletons$SplashRestoreScreenKt.INSTANCE.m7852getLambda3$splash_release(), composer2, ((i3 >> 6) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashManualRestoreView$2
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
                    SplashRestoreScreenKt.SplashManualRestoreView(Modifier.this, function0, function02, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashRestoreFailView(final Modifier modifier, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(127219553);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127219553, i2, -1, "com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreFailView (SplashRestoreScreen.kt:390)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState = (MutableState) rememberedValue;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.restorefailedscreen_title_text, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0L, TextUnitKt.getSp(34), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(44), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199728, 6, 129492);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(16)), startRestartGroup, 6);
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.restorefailedscreen_instructions_message, startRestartGroup, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4285295724L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6869getStarte0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 6, 129520);
            SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(24)), startRestartGroup, 6);
            String SplashRestoreFailView$lambda$14 = SplashRestoreFailView$lambda$14(mutableState);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f = 12;
            RoundedCornerShape m1268RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(f));
            TextFieldColors m2664colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2664colors0hiis_0(0L, 0L, 0L, 0L, ColorKt.Color(4294309365L), ColorKt.Color(4294309365L), 0L, 0L, 0L, 0L, null, Color.INSTANCE.m4550getTransparent0d7_KjU(), Color.INSTANCE.m4550getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 221184, 432, 0, 0, 3072, 2147477455, 4095);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6694getEmailPjHm6EE(), ImeAction.INSTANCE.m6639getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            TextStyle textStyle = new TextStyle(ColorKt.Color(4279900698L), TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646140, (DefaultConstructorMarker) null);
            startRestartGroup.startReplaceableGroup(-1093419293);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<String, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreFailView$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(it);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldKt.OutlinedTextField(SplashRestoreFailView$lambda$14, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default, false, false, textStyle, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SplashRestoreScreenKt.INSTANCE.m7853getLambda4$splash_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m1268RoundedCornerShape0680j_4, m2664colors0hiis_0, startRestartGroup, 12583296, 12779520, 0, 1933144);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6997constructorimpl(f), 7, null);
            RoundedCornerShape m1268RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(100));
            ButtonColors m2130buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2130buttonColorsro_MJ88(ComposableExtensionsKt.asColor(R.color.colorAccent, startRestartGroup, 0), 0L, Color.m4514copywmQWz5c$default(ComposableExtensionsKt.asColor(R.color.colorAccent, startRestartGroup, 0), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, startRestartGroup, ButtonDefaults.$stable << 12, 10);
            PaddingValues m980PaddingValuesYgX7TsA$default = PaddingKt.m980PaddingValuesYgX7TsA$default(0.0f, ComposableExtensionsKt.asDp(R.dimen.x24, startRestartGroup, 0), 1, null);
            boolean z = StringsKt.trim((CharSequence) SplashRestoreFailView$lambda$14(mutableState)).toString().length() > 0;
            startRestartGroup.startReplaceableGroup(-1093418081);
            boolean changedInstance = startRestartGroup.changedInstance(function1) | startRestartGroup.changed(mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreFailView$1$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        String SplashRestoreFailView$lambda$142;
                        Function1<String, Unit> function12 = function1;
                        SplashRestoreFailView$lambda$142 = SplashRestoreScreenKt.SplashRestoreFailView$lambda$14(mutableState);
                        function12.invoke(SplashRestoreFailView$lambda$142);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.Button((Function0) rememberedValue3, m989paddingqDBjuR0$default, z, m1268RoundedCornerShape0680j_42, m2130buttonColorsro_MJ88, null, null, m980PaddingValuesYgX7TsA$default, null, ComposableSingletons$SplashRestoreScreenKt.INSTANCE.m7854getLambda5$splash_release(), startRestartGroup, 805306416, 352);
            composer2 = startRestartGroup;
            ButtonKt.TextButton(function0, PaddingKt.m989paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6997constructorimpl(32), 7, null), false, null, null, null, null, null, null, ComposableSingletons$SplashRestoreScreenKt.INSTANCE.m7855getLambda6$splash_release(), startRestartGroup, ((i2 >> 6) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreFailView$2
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
                    SplashRestoreScreenKt.SplashRestoreFailView(Modifier.this, function1, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SplashRestoreScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(933293994);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(933293994, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenPreview (SplashRestoreScreen.kt:502)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$SplashRestoreScreenKt.INSTANCE.m7856getLambda7$splash_release(), startRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.SplashRestoreScreenKt$SplashRestoreScreenPreview$1
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
                    SplashRestoreScreenKt.SplashRestoreScreenPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final boolean SplashRestoreLoadingView$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SplashRestoreLoadingView$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SplashRestoreFailView$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
