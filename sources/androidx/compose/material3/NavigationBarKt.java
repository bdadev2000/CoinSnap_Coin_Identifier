package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001ab\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00140\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aq\u0010$\u001a\u00020\u00142\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010&¢\u0006\u0002\b 2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0&H\u0003¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010/\u001a\u00020\u0014*\u00020\u001f2\u0006\u00100\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u00102\u001a\u00020+2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010&¢\u0006\u0002\b 2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0002\u00107\u001a8\u00108\u001a\u000209*\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001aP\u0010C\u001a\u000209*\u00020:2\u0006\u0010D\u001a\u00020<2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\n\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\n\u0010H\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "()F", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationBarHeight", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemLayout", NavigationBarKt.IndicatorRippleLayoutIdTag, "Lkotlin/Function0;", NavigationBarKt.IndicatorLayoutIdTag, NavigationBarKt.IconLayoutIdTag, "label", "alwaysShowLabel", "", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NavigationBarItem", "selected", "onClick", "enabled", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "iconColor", "textColor", "itemWidth"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight = NavigationBarTokens.INSTANCE.m3642getContainerHeightD9Ej5fM();
    private static final float NavigationBarItemHorizontalPadding = Dp.m6997constructorimpl(8);
    private static final float NavigationBarIndicatorToLabelPadding = Dp.m6997constructorimpl(4);
    private static final float IndicatorVerticalOffset = Dp.m6997constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0099  */
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2594NavigationBarHsRjFd4(androidx.compose.ui.Modifier r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m2594NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0481  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavigationBarItem(final androidx.compose.foundation.layout.RowScope r32, final boolean r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.ui.Modifier r36, boolean r37, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, boolean r39, androidx.compose.material3.NavigationBarItemColors r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final int NavigationBarItem$lambda$3(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationBarItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final Function0<Float> function0, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z2;
        String str;
        int i4;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(-1427075886);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationBarItemLayout)P(4,3,2,5)532@23467L1717,517@23004L2180:NavigationBar.kt#uh7d8r");
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
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427075886, i2, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:516)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -96239762, "CC(remember):NavigationBar.kt#9igjgp");
            int i5 = 458752 & i2;
            int i6 = 57344 & i2;
            boolean z3 = (i5 == 131072) | ((i2 & 7168) == 2048) | (i6 == 16384);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        float f;
                        Measurable measurable;
                        Placeable placeable;
                        MeasureResult m2598placeLabelAndIconzUg2_y0;
                        MeasureResult m2597placeIconX9ElhV4;
                        float floatValue = function0.invoke().floatValue();
                        long m6941copyZbe2FdA$default = Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable2 = list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable mo5851measureBRTryo0 = measurable2.mo5851measureBRTryo0(m6941copyZbe2FdA$default);
                                int width = mo5851measureBRTryo0.getWidth();
                                f = NavigationBarKt.IndicatorHorizontalPadding;
                                float f2 = 2;
                                int i8 = width + measureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(f * f2));
                                int roundToInt = MathKt.roundToInt(i8 * floatValue);
                                int height = mo5851measureBRTryo0.getHeight() + measureScope.mo671roundToPx0680j_4(Dp.m6997constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f2));
                                int size2 = list.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    Measurable measurable3 = list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable mo5851measureBRTryo02 = measurable3.mo5851measureBRTryo0(Constraints.INSTANCE.m6960fixedJhjzzOo(i8, height));
                                        int size3 = list.size();
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i10++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable mo5851measureBRTryo03 = measurable4 != null ? measurable4.mo5851measureBRTryo0(Constraints.INSTANCE.m6960fixedJhjzzOo(roundToInt, height)) : null;
                                        if (function24 != null) {
                                            int size4 = list.size();
                                            for (int i11 = 0; i11 < size4; i11++) {
                                                Measurable measurable5 = list.get(i11);
                                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), Constants.ScionAnalytics.PARAM_LABEL)) {
                                                    placeable = measurable5.mo5851measureBRTryo0(m6941copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeable = null;
                                        if (function24 == null) {
                                            m2597placeIconX9ElhV4 = NavigationBarKt.m2597placeIconX9ElhV4(measureScope, mo5851measureBRTryo0, mo5851measureBRTryo02, mo5851measureBRTryo03, j);
                                            return m2597placeIconX9ElhV4;
                                        }
                                        Intrinsics.checkNotNull(placeable);
                                        m2598placeLabelAndIconzUg2_y0 = NavigationBarKt.m2598placeLabelAndIconzUg2_y0(measureScope, placeable, mo5851measureBRTryo0, mo5851measureBRTryo02, mo5851measureBRTryo03, j, z, floatValue);
                                        return m2598placeLabelAndIconzUg2_y0;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -656695659, "C518@23021L17,519@23047L11,521@23068L50:NavigationBar.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, IconLayoutIdTag);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2034219770, "C521@23110L6:NavigationBar.kt#uh7d8r");
            function23.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1087198243);
            ComposerKt.sourceInformation(startRestartGroup, "526@23253L60,524@23161L288");
            if (function24 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "label");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1087201972, "CC(remember):NavigationBar.kt#9igjgp");
                if (i6 == 16384) {
                    i3 = 131072;
                    z2 = true;
                } else {
                    i3 = 131072;
                    z2 = false;
                }
                boolean z4 = (i5 == i3) | z2;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    i4 = -692256719;
                    obj = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$2$1
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
                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z ? 1.0f : function0.invoke().floatValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    obj = rememberedValue2;
                    i4 = -692256719;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(layoutId2, (Function1) obj), Dp.m6997constructorimpl(NavigationBarItemHorizontalPadding / 2), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m987paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i4, str);
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
                Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2033904283, "C529@23428L7:NavigationBar.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i2 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$3
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

                public final void invoke(Composer composer2, int i7) {
                    NavigationBarKt.NavigationBarItemLayout(function2, function22, function23, function24, z, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2597placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j) {
        final int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j);
        final int m6966constrainHeightK40F9xA = ConstraintsKt.m6966constrainHeightK40F9xA(j, measureScope.mo671roundToPx0680j_4(NavigationBarHeight));
        final int width = (m6950getMaxWidthimpl - placeable.getWidth()) / 2;
        final int height = (m6966constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (m6950getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int height2 = (m6966constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, m6950getMaxWidthimpl, m6966constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
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
                Placeable placeable4 = Placeable.this;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (m6950getMaxWidthimpl - placeable4.getWidth()) / 2, (m6966constrainHeightK40F9xA - placeable4.getHeight()) / 2, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, height2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m2598placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j, final boolean z, final float f) {
        float height = placeable2.getHeight();
        float f2 = IndicatorVerticalPadding;
        float f3 = height + measureScope.mo677toPx0680j_4(f2);
        float f4 = NavigationBarIndicatorToLabelPadding;
        float f5 = f3 + measureScope.mo677toPx0680j_4(f4) + placeable.getHeight();
        float f6 = 2;
        final float coerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6951getMinHeightimpl(j) - f5) / f6, measureScope.mo677toPx0680j_4(f2));
        float f7 = f5 + (coerceAtLeast * f6);
        final float height2 = ((z ? coerceAtLeast : (f7 - placeable2.getHeight()) / f6) - coerceAtLeast) * (1 - f);
        final float height3 = placeable2.getHeight() + coerceAtLeast + measureScope.mo677toPx0680j_4(f2) + measureScope.mo677toPx0680j_4(f4);
        final int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j);
        final int width = (m6950getMaxWidthimpl - placeable.getWidth()) / 2;
        final int width2 = (m6950getMaxWidthimpl - placeable2.getWidth()) / 2;
        final int width3 = (m6950getMaxWidthimpl - placeable3.getWidth()) / 2;
        final float f8 = coerceAtLeast - measureScope.mo677toPx0680j_4(f2);
        return MeasureScope.layout$default(measureScope, m6950getMaxWidthimpl, MathKt.roundToInt(f7), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
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
                Placeable placeable5 = Placeable.this;
                if (placeable5 != null) {
                    int i = m6950getMaxWidthimpl;
                    float f9 = coerceAtLeast;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, (i - placeable5.getWidth()) / 2, MathKt.roundToInt((f9 - measureScope2.mo671roundToPx0680j_4(NavigationBarKt.getIndicatorVerticalPadding())) + height2), 0.0f, 4, null);
                }
                if (z || f != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, MathKt.roundToInt(height3 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, MathKt.roundToInt(coerceAtLeast + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width3, MathKt.roundToInt(f8 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        float f = 2;
        IndicatorHorizontalPadding = Dp.m6997constructorimpl(Dp.m6997constructorimpl(NavigationBarTokens.INSTANCE.m3640getActiveIndicatorWidthD9Ej5fM() - NavigationBarTokens.INSTANCE.m3643getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = Dp.m6997constructorimpl(Dp.m6997constructorimpl(NavigationBarTokens.INSTANCE.m3639getActiveIndicatorHeightD9Ej5fM() - NavigationBarTokens.INSTANCE.m3643getIconSizeD9Ej5fM()) / f);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }
}
