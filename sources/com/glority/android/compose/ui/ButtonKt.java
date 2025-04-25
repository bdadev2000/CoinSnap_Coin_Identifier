package com.glority.android.compose.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ad\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0017\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"buttonConfigMap", "", "Lcom/glority/android/compose/ui/ButtonSize;", "Lcom/glority/android/compose/ui/ButtonConfig;", "GlButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "buttonSize", "background", "Landroidx/compose/ui/graphics/Shape;", "showLoading", "", "enabled", "onClick", "Lkotlin/Function0;", "GlButton-lVb_Clg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLcom/glority/android/compose/ui/ButtonSize;Landroidx/compose/ui/graphics/Shape;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "GlButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ButtonKt {
    private static final Map<ButtonSize, ButtonConfig> buttonConfigMap = MapsKt.mapOf(TuplesKt.to(ButtonSize.LARGE, new ButtonConfig(18, 11, 16, FontWeight.INSTANCE.getW600())), TuplesKt.to(ButtonSize.MEDIUM, new ButtonConfig(17, 11, 16, FontWeight.INSTANCE.getW500())), TuplesKt.to(ButtonSize.SMALL, new ButtonConfig(16, 11, 16, FontWeight.INSTANCE.getW500())));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(284391287);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284391287, i, -1, "com.glority.android.compose.ui.GlButtonPreview (Button.kt:27)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ButtonSize buttonSize = ButtonSize.LARGE;
            boolean GlButtonPreview$lambda$1 = GlButtonPreview$lambda$1(mutableState);
            startRestartGroup.startReplaceableGroup(-897860392);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.compose.ui.ButtonKt$GlButtonPreview$1$1$1
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
                        boolean GlButtonPreview$lambda$12;
                        MutableState<Boolean> mutableState2 = mutableState;
                        GlButtonPreview$lambda$12 = ButtonKt.GlButtonPreview$lambda$1(mutableState2);
                        ButtonKt.GlButtonPreview$lambda$2(mutableState2, !GlButtonPreview$lambda$12);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            m7708GlButtonlVb_Clg(null, "Button", 0L, buttonSize, null, GlButtonPreview$lambda$1, false, (Function0) rememberedValue2, startRestartGroup, 3120, 85);
            m7708GlButtonlVb_Clg(null, "Button", 0L, ButtonSize.MEDIUM, null, false, false, new Function0<Unit>() { // from class: com.glority.android.compose.ui.ButtonKt$GlButtonPreview$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 12586032, 117);
            m7708GlButtonlVb_Clg(null, "Button", 0L, ButtonSize.SMALL, null, false, false, new Function0<Unit>() { // from class: com.glority.android.compose.ui.ButtonKt$GlButtonPreview$1$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 12586032, 117);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ButtonKt$GlButtonPreview$2
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
                    ButtonKt.GlButtonPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GlButtonPreview$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlButtonPreview$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b1  */
    /* renamed from: GlButton-lVb_Clg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7708GlButtonlVb_Clg(androidx.compose.ui.Modifier r24, final java.lang.String r25, long r26, com.glority.android.compose.ui.ButtonSize r28, androidx.compose.ui.graphics.Shape r29, boolean r30, boolean r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.ButtonKt.m7708GlButtonlVb_Clg(androidx.compose.ui.Modifier, java.lang.String, long, com.glority.android.compose.ui.ButtonSize, androidx.compose.ui.graphics.Shape, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
