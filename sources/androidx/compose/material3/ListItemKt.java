package androidx.compose.material3;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a©\u0001\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001at\u0010'\u001a\u00020\u00172\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001aH\u0003¢\u0006\u0002\u0010-\u001a5\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001a\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aV\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020<2\u0006\u00107\u001a\u0002082\u0006\u00106\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aN\u0010G\u001a\u00020<*\u00020=2\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010S\u001a\u00020<H\u0002\u001an\u0010T\u001a\u00020U*\u00020V2\u0006\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020<2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010\\\u001a\u0004\u0018\u00010Z2\b\u0010]\u001a\u0004\u0018\u00010Z2\b\u0010^\u001a\u0004\u0018\u00010Z2\u0006\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020<H\u0002\u001a\u0014\u0010c\u001a\u00020<*\u00020<2\u0006\u0010d\u001a\u00020<H\u0002\"\u001e\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0007\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u001e\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\u0005\"\u001e\u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u001e\u0010\u0010\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0005\"\u001e\u0010\u0013\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"LeadingContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "getLeadingContentEndPadding$annotations", "()V", "getLeadingContentEndPadding", "()F", "F", "ListItemEndPadding", "getListItemEndPadding$annotations", "getListItemEndPadding", "ListItemStartPadding", "getListItemStartPadding$annotations", "getListItemStartPadding", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "getListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "getListItemVerticalPadding$annotations", "getListItemVerticalPadding", "TrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "getTrailingContentStartPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItemLayout", "leading", "trailing", "headline", "overline", "supporting", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "color", "Landroidx/compose/ui/graphics/Color;", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "verticalPadding", "listItemType", "Landroidx/compose/material3/ListItemType;", "verticalPadding-yh95HIg", "(I)F", "calculateHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "calculateWidth", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "calculateWidth-yeHjK3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "isSupportingMultilineHeuristic", "", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "place", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "isThreeLine", "startPadding", "endPadding", "topPadding", "subtractConstraintSafely", "n", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = Dp.m6997constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = Dp.m6997constructorimpl(12);

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int subtractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2516ListItemHXNGIdc(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.ui.Modifier r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.material3.ListItemColors r44, float r45, float r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m2516ListItemHXNGIdc(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2052297037);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItemLayout)P(1,4)181@7324L36,182@7365L261:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i2, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -748109790, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ListItemMeasurePolicy();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function2[] function2Arr = new Function2[5];
            function2Arr[0] = function23;
            function2Arr[1] = function24 == null ? ComposableSingletons$ListItemKt.INSTANCE.m2287getLambda1$material3_release() : function24;
            function2Arr[2] = function25 == null ? ComposableSingletons$ListItemKt.INSTANCE.m2288getLambda2$material3_release() : function25;
            function2Arr[3] = function2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m2289getLambda3$material3_release() : function2;
            function2Arr[4] = function22 == null ? ComposableSingletons$ListItemKt.INSTANCE.m2290getLambda4$material3_release() : function22;
            List listOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761997, "CC(remember):Layout.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
            Updater.m4015setimpl(m4008constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItemLayout$1
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
                    ListItemKt.ListItemLayout(function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2523calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (Constraints.m6946getHasBoundedWidthimpl(j)) {
            return Constraints.m6950getMaxWidthimpl(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m2522calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float m3637getListItemTwoLineContainerHeightD9Ej5fM;
        if (ListItemType.m2529equalsimpl0(i6, ListItemType.INSTANCE.m2534getOneLineAlXitO8())) {
            m3637getListItemTwoLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m3632getListItemOneLineContainerHeightD9Ej5fM();
        } else {
            m3637getListItemTwoLineContainerHeightD9Ej5fM = ListItemType.m2529equalsimpl0(i6, ListItemType.INSTANCE.m2536getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m3637getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m3634getListItemThreeLineContainerHeightD9Ej5fM();
        }
        return RangesKt.coerceAtMost(Math.max(Math.max(Constraints.m6951getMinHeightimpl(j), intrinsicMeasureScope.mo671roundToPx0680j_4(m3637getListItemTwoLineContainerHeightD9Ej5fM)), i7 + Math.max(i, Math.max(i3 + i4 + i5, i2))), Constraints.m6949getMaxHeightimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final int i3, final int i4, final int i5) {
        return MeasureScope.layout$default(measureScope, i, i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt$place$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                int align;
                Placeable placeable6 = Placeable.this;
                if (placeable6 != null) {
                    int i6 = i3;
                    boolean z2 = z;
                    int i7 = i5;
                    int i8 = i2;
                    if (!z2) {
                        i7 = Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), i8);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, i6, i7, 0.0f, 4, null);
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - i4) - placeable7.getWidth(), z ? i5 : Alignment.INSTANCE.getCenterVertically().align(placeable7.getHeight(), i2), 0.0f, 4, null);
                }
                int widthOrZero = i3 + TextFieldImplKt.widthOrZero(Placeable.this);
                if (z) {
                    align = i5;
                } else {
                    align = Alignment.INSTANCE.getCenterVertically().align(TextFieldImplKt.heightOrZero(placeable3) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable5), i2);
                }
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, widthOrZero, align, 0.0f, 4, null);
                }
                int heightOrZero = align + TextFieldImplKt.heightOrZero(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, widthOrZero, heightOrZero, 0.0f, 4, null);
                }
                int heightOrZero2 = heightOrZero + TextFieldImplKt.heightOrZero(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, widthOrZero, heightOrZero2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m2517ProvideTextStyleFromToken3JVO9M(final long j, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)659@26906L5,657@26816L128:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:657)");
            }
            ProvideContentColorTextStyleKt.m3224ProvideContentColorTextStyle3JVO9M(j, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), function2, startRestartGroup, (i2 & 14) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
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
                    ListItemKt.m2517ProvideTextStyleFromToken3JVO9M(j, typographyKeyTokens, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i) {
        return i > density.mo670roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m2524verticalPaddingyh95HIg(int i) {
        return ListItemType.m2529equalsimpl0(i, ListItemType.INSTANCE.m2535getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }

    static {
        float f = 16;
        ListItemStartPadding = Dp.m6997constructorimpl(f);
        ListItemEndPadding = Dp.m6997constructorimpl(f);
        LeadingContentEndPadding = Dp.m6997constructorimpl(f);
        TrailingContentStartPadding = Dp.m6997constructorimpl(f);
    }
}
