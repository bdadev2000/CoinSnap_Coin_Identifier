package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\t*\u00020\u001f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010 \"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"TextBaselineDistanceFromTitle", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTop", "TextPadding", "Landroidx/compose/ui/Modifier;", "TitleBaselineDistanceFromTop", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", Args.title, "text", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final Modifier TextPadding;
    private static final Modifier TitlePadding;
    private static final long TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
    private static final long TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
    private static final long TextBaselineDistanceFromTop = TextUnitKt.getSp(38);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b4  */
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1715AlertDialogContentWMdw5o4(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m1715AlertDialogContentWMdw5o4(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void AlertDialogBaselineLayout(final ColumnScope columnScope, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogBaselineLayout)P(1)98@3653L3487:AlertDialog.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555573207, i2, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:97)");
            }
            Modifier weight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final androidx.compose.ui.layout.MeasureResult mo342measure3p2s80s(androidx.compose.ui.layout.MeasureScope r17, java.util.List<? extends androidx.compose.ui.layout.Measurable> r18, long r19) {
                    /*
                        Method dump skipped, instructions count: 332
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.mo342measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(weight);
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
            Updater.m4015setimpl(m4008constructorimpl, alertDialogKt$AlertDialogBaselineLayout$2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1160646121, "C:AlertDialog.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-1160646114);
            ComposerKt.sourceInformation(startRestartGroup, "*101@3721L106");
            if (function2 != null) {
                Modifier align = columnScope.align(LayoutIdKt.layoutId(TitlePadding, Args.title), Alignment.INSTANCE.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
                Updater.m4015setimpl(m4008constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -630329008, "C102@3802L7:AlertDialog.kt#jmzs0o");
                function2.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1735756505);
            ComposerKt.sourceInformation(startRestartGroup, "*106@3890L103");
            if (function22 != null) {
                Modifier align2 = columnScope.align(LayoutIdKt.layoutId(TextPadding, "text"), Alignment.INSTANCE.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(align2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4008constructorimpl3 = Updater.m4008constructorimpl(startRestartGroup);
                Updater.m4015setimpl(m4008constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -630328841, "C107@3969L6:AlertDialog.kt#jmzs0o");
                function22.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    AlertDialogKt.AlertDialogBaselineLayout(ColumnScope.this, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1716AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)194@7398L3581:AlertDialog.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73434452, i2, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:193)");
            }
            startRestartGroup.startReplaceableGroup(941722866);
            boolean changed = startRestartGroup.changed(f) | startRestartGroup.changed(f2);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        AlertDialogKt$AlertDialogFlowRow$1$1 alertDialogKt$AlertDialogFlowRow$1$1;
                        int max;
                        Ref.IntRef intRef;
                        Ref.IntRef intRef2;
                        Ref.IntRef intRef3;
                        Ref.IntRef intRef4;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Placeable placeable;
                        Ref.IntRef intRef5;
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        final ArrayList arrayList5 = new ArrayList();
                        Ref.IntRef intRef6 = new Ref.IntRef();
                        Ref.IntRef intRef7 = new Ref.IntRef();
                        ArrayList arrayList6 = new ArrayList();
                        Ref.IntRef intRef8 = new Ref.IntRef();
                        Ref.IntRef intRef9 = new Ref.IntRef();
                        long Constraints$default = ConstraintsKt.Constraints$default(0, Constraints.m6950getMaxWidthimpl(j), 0, 0, 13, null);
                        float f3 = f;
                        float f4 = f2;
                        int size = list.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Ref.IntRef intRef10 = intRef9;
                            Placeable mo5851measureBRTryo0 = list.get(i3).mo5851measureBRTryo0(Constraints$default);
                            int i4 = i3;
                            int i5 = size;
                            float f5 = f4;
                            long j2 = Constraints$default;
                            float f6 = f3;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList6, intRef8, measureScope, f3, j, mo5851measureBRTryo0)) {
                                intRef = intRef8;
                                intRef2 = intRef6;
                                intRef3 = intRef7;
                                intRef4 = intRef10;
                                arrayList = arrayList6;
                                arrayList2 = arrayList4;
                                placeable = mo5851measureBRTryo0;
                            } else {
                                ArrayList arrayList7 = arrayList4;
                                arrayList2 = arrayList4;
                                placeable = mo5851measureBRTryo0;
                                intRef3 = intRef7;
                                intRef4 = intRef10;
                                intRef = intRef8;
                                Ref.IntRef intRef11 = intRef6;
                                intRef2 = intRef6;
                                arrayList = arrayList6;
                                measure_3p2s80s$startNewSequence(arrayList3, intRef7, measureScope, f5, arrayList6, arrayList7, intRef10, arrayList5, intRef11, intRef);
                            }
                            if (!arrayList.isEmpty()) {
                                intRef5 = intRef;
                                intRef5.element += measureScope.mo671roundToPx0680j_4(f6);
                            } else {
                                intRef5 = intRef;
                            }
                            arrayList.add(placeable);
                            intRef5.element += placeable.getWidth();
                            intRef4.element = Math.max(intRef4.element, placeable.getHeight());
                            i3 = i4 + 1;
                            f3 = f6;
                            intRef8 = intRef5;
                            arrayList6 = arrayList;
                            intRef9 = intRef4;
                            arrayList4 = arrayList2;
                            size = i5;
                            f4 = f5;
                            Constraints$default = j2;
                            intRef7 = intRef3;
                            intRef6 = intRef2;
                        }
                        ArrayList arrayList8 = arrayList4;
                        Ref.IntRef intRef12 = intRef6;
                        Ref.IntRef intRef13 = intRef7;
                        Ref.IntRef intRef14 = intRef9;
                        ArrayList arrayList9 = arrayList6;
                        Ref.IntRef intRef15 = intRef8;
                        if (!arrayList9.isEmpty()) {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                            measure_3p2s80s$startNewSequence(arrayList3, intRef13, measureScope, f2, arrayList9, arrayList8, intRef14, arrayList5, intRef12, intRef15);
                        } else {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                        }
                        if (Constraints.m6950getMaxWidthimpl(j) != Integer.MAX_VALUE) {
                            max = Constraints.m6950getMaxWidthimpl(j);
                        } else {
                            max = Math.max(intRef12.element, Constraints.m6952getMinWidthimpl(j));
                        }
                        final int i6 = max;
                        int max2 = Math.max(intRef13.element, Constraints.m6951getMinHeightimpl(j));
                        final float f7 = f;
                        return MeasureScope.layout$default(measureScope, i6, max2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                List<List<Placeable>> list2 = arrayList3;
                                MeasureScope measureScope2 = measureScope;
                                float f8 = f7;
                                int i7 = i6;
                                List<Integer> list3 = arrayList5;
                                int size2 = list2.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    List<Placeable> list4 = list2.get(i8);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i9 = 0;
                                    while (i9 < size3) {
                                        iArr[i9] = list4.get(i9).getWidth() + (i9 < CollectionsKt.getLastIndex(list4) ? measureScope2.mo671roundToPx0680j_4(f8) : 0);
                                        i9++;
                                    }
                                    Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                    int[] iArr2 = new int[size3];
                                    for (int i10 = 0; i10 < size3; i10++) {
                                        iArr2[i10] = 0;
                                    }
                                    bottom.arrange(measureScope2, i7, iArr, iArr2);
                                    int size4 = list4.size();
                                    for (int i11 = 0; i11 < size4; i11++) {
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i11), iArr2[i11], list3.get(i8).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                        return list.isEmpty() || (intRef.element + measureScope.mo671roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m6950getMaxWidthimpl(j);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!list.isEmpty()) {
                            intRef.element += measureScope.mo671roundToPx0680j_4(f3);
                        }
                        list.add(0, CollectionsKt.toList(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            int i3 = (i2 >> 6) & 14;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            int i4 = ((i3 << 9) & 7168) | 6;
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
            Updater.m4015setimpl(m4008constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    AlertDialogKt.m1716AlertDialogFlowRowixp7dh8(f, f2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 24;
        TitlePadding = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), 0.0f, 10, null);
        TextPadding = PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(28), 2, null);
    }
}
