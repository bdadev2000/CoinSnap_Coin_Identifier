package com.glority.android.picturexx.view.dialog;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
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
import com.glority.android.picturexx.business.R;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeltPriceHintDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"MeltPriceHint", "", "modifier", "Landroidx/compose/ui/Modifier;", "onCloseClick", "Lkotlin/Function0;", "onGotItClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MeltPriceHintPreview", "(Landroidx/compose/runtime/Composer;I)V", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeltPriceHintDialogKt {
    public static final /* synthetic */ void access$MeltPriceHint(Modifier modifier, Function0 function0, Function0 function02, Composer composer, int i) {
        MeltPriceHint(modifier, function0, function02, composer, i);
    }

    public static final void MeltPriceHint(final Modifier modifier, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1182860726);
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
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1182860726, i2, -1, "com.glority.android.picturexx.view.dialog.MeltPriceHint (MeltPriceHintDialog.kt:89)");
            }
            composer2 = startRestartGroup;
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null), null, CardDefaults.INSTANCE.m2150cardColorsro_MJ88(Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0L, 0L, startRestartGroup, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.composableLambda(composer2, 1942226984, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHint$1
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
                            ComposerKt.traceEventStart(1942226984, i3, -1, "com.glority.android.picturexx.view.dialog.MeltPriceHint.<anonymous> (MeltPriceHintDialog.kt:98)");
                        }
                        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                        final Function0<Unit> function03 = function0;
                        final Function0<Unit> function04 = function02;
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, wrapContentHeight$default);
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
                        Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m6997constructorimpl(28), Dp.m6997constructorimpl(30));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m986paddingVpY3zN4);
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
                        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.collection_summary_melt, composer3, 0), SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200112, 0, 131024);
                        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.melt_price_explanation, composer3, 0), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(16), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null), 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3120, 6, 130036);
                        Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6997constructorimpl(20), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null);
                        ButtonColors m2130buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2130buttonColorsro_MJ88(ColorKt.Color(4294618905L), Color.INSTANCE.m4552getWhite0d7_KjU(), 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 54, 12);
                        float f = 8;
                        PaddingValues m978PaddingValues0680j_4 = PaddingKt.m978PaddingValues0680j_4(Dp.m6997constructorimpl(f));
                        composer3.startReplaceableGroup(-385795606);
                        boolean changedInstance = composer3.changedInstance(function04);
                        Object rememberedValue = composer3.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHint$1$1$1$1$1
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
                                    function04.invoke();
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        ButtonKt.Button((Function0) rememberedValue, wrapContentHeight$default2, false, null, m2130buttonColorsro_MJ88, null, null, m978PaddingValues0680j_4, null, ComposableSingletons$MeltPriceHintDialogKt.INSTANCE.m7889getLambda1$businessMod_release(), composer3, 817889328, 364);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier align = boxScopeInstance.align(SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(f), 0.0f, 0.0f, 12, null), Dp.m6997constructorimpl(24)), Alignment.INSTANCE.getTopStart());
                        composer3.startReplaceableGroup(-385794763);
                        boolean changedInstance2 = composer3.changedInstance(function03);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHint$1$1$2$1
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
                                    function03.invoke();
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        IconButtonKt.IconButton((Function0) rememberedValue2, align, false, null, null, ComposableSingletons$MeltPriceHintDialogKt.INSTANCE.m7890getLambda2$businessMod_release(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
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
            }), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHint$2
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
                    MeltPriceHintDialogKt.MeltPriceHint(Modifier.this, function0, function02, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void MeltPriceHintPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1137283337);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1137283337, i, -1, "com.glority.android.picturexx.view.dialog.MeltPriceHintPreview (MeltPriceHintDialog.kt:175)");
            }
            MeltPriceHint(Modifier.INSTANCE, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHintPreview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHintPreview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialogKt$MeltPriceHintPreview$3
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
                    MeltPriceHintDialogKt.MeltPriceHintPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
