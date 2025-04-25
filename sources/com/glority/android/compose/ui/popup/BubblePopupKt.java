package com.glority.android.compose.ui.popup;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.picturexx.ui.components.state.VisibleSate;
import com.glority.android.picturexx.ui.components.state.VisibleSateKt;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubblePopup.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"BubblePopup", "", "modifier", "Landroidx/compose/ui/Modifier;", "visibleSate", "Lcom/glority/android/picturexx/ui/components/state/VisibleSate;", "color", "Landroidx/compose/ui/graphics/Color;", "archInWindowX", "", "onDismissRequest", "Lkotlin/Function0;", "popupOffset", "Landroidx/compose/ui/unit/DpOffset;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BubblePopup-U88Bizw", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/ui/components/state/VisibleSate;JFLkotlin/jvm/functions/Function0;JLandroidx/compose/ui/window/PopupProperties;Landroidx/compose/foundation/shape/CornerSize;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BubblePopupPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose_release", "archPosition", "scale"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BubblePopupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BubblePopupPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-948944912);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-948944912, i, -1, "com.glority.android.compose.ui.popup.BubblePopupPreview (BubblePopup.kt:35)");
            }
            final VisibleSate rememberVisibleSate = VisibleSateKt.rememberVisibleSate(false, startRestartGroup, 6);
            SurfaceKt.m2864SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -2105014005, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.popup.BubblePopupKt$BubblePopupPreview$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2105014005, i2, -1, "com.glority.android.compose.ui.popup.BubblePopupPreview.<anonymous> (BubblePopup.kt:38)");
                        }
                        Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(50), 0.0f, 0.0f, 0.0f, 14, null);
                        final VisibleSate visibleSate = VisibleSate.this;
                        composer2.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m989paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                        Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-24905642);
                        boolean changed = composer2.changed(visibleSate);
                        Object rememberedValue = composer2.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.compose.ui.popup.BubblePopupKt$BubblePopupPreview$1$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                    VisibleSate.this.setVisible(true);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BubblePopupKt.INSTANCE.m7720getLambda1$lib_compose_release(), composer2, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_POSITION_TYPE);
                        BubblePopupKt.m7718BubblePopupU88Bizw(null, visibleSate, Color.INSTANCE.m4549getRed0d7_KjU(), 20.0f, null, 0L, null, null, ComposableSingletons$BubblePopupKt.INSTANCE.m7721getLambda2$lib_compose_release(), composer2, 100666752, 241);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 12582918, 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.popup.BubblePopupKt$BubblePopupPreview$2
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
                    BubblePopupKt.BubblePopupPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    /* renamed from: BubblePopup-U88Bizw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7718BubblePopupU88Bizw(androidx.compose.ui.Modifier r32, final com.glority.android.picturexx.ui.components.state.VisibleSate r33, final long r34, final float r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, long r38, androidx.compose.ui.window.PopupProperties r40, androidx.compose.foundation.shape.CornerSize r41, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.popup.BubblePopupKt.m7718BubblePopupU88Bizw(androidx.compose.ui.Modifier, com.glority.android.picturexx.ui.components.state.VisibleSate, long, float, kotlin.jvm.functions.Function0, long, androidx.compose.ui.window.PopupProperties, androidx.compose.foundation.shape.CornerSize, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BubblePopup_U88Bizw$lambda$1(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BubblePopup_U88Bizw$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }
}
