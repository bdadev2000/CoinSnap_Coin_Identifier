package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0082\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001a2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001az\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001a2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008e\u0001\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u000e0$¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\"2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010$¢\u0006\u0002\b\u00192\b\b\u0002\u0010(\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010,\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a?\u0010/\u001a\u00020\u000e2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u000e0$¢\u0006\u0002\b\u00192\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010$¢\u0006\u0002\b\u00192\b\b\u0001\u00100\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00101\u001aR\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2&\u0010\u001b\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a&\u0010:\u001a\u00020;*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a8\u0010C\u001a\u00020;*\u00020<2\u0006\u0010D\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\b\u0001\u00100\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\n\u00107\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "NavigationRail", "", "windowInsets", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationRail-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", Constants.ScionAnalytics.PARAM_LABEL, "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m6997constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m6997constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m6997constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m6997constructorimpl(14);
    private static final WindowInsets ZeroInsets = WindowInsetsKt.m1055WindowInsetsa9UjIt4$default(Dp.m6997constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0082  */
    /* renamed from: NavigationRail-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1908NavigationRailafqeVBk(final androidx.compose.foundation.layout.WindowInsets r24, androidx.compose.ui.Modifier r25, long r26, long r28, float r30, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1908NavigationRailafqeVBk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008a  */
    /* renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1907NavigationRailHsRjFd4(androidx.compose.ui.Modifier r22, long r23, long r25, float r27, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1907NavigationRailHsRjFd4(androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0195  */
    /* renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1909NavigationRailItem0S3VyRs(final boolean r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.ui.Modifier r26, boolean r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, boolean r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, long r31, long r33, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt.m1909NavigationRailItem0S3VyRs(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1910NavigationRailTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-207161906);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)298@12977L126,305@13178L181:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, i2, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:297)");
            }
            composer2 = startRestartGroup;
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m4566lerpjxsXWHM = ColorKt.m4566lerpjxsXWHM(j2, j, NavigationRailTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4505boximpl(Color.m4514copywmQWz5c$default(m4566lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4517getAlphaimpl(m4566lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -1688205042, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
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
                    float NavigationRailTransition_Klgx_Pg$lambda$3;
                    ComposerKt.sourceInformation(composer3, "C309@13327L26:NavigationRail.kt#jmzs0o");
                    if ((i3 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1688205042, i3, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:309)");
                    }
                    Function3<Float, Composer, Integer, Unit> function32 = function3;
                    NavigationRailTransition_Klgx_Pg$lambda$3 = NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$3(animateFloatAsState);
                    function32.invoke(Float.valueOf(NavigationRailTransition_Klgx_Pg$lambda$3), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
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
                    NavigationRailKt.m1910NavigationRailTransitionKlgxPg(j, j2, z, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1903861684);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItemBaselineLayout)P(!1,2)330@14024L1126:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1903861684, i2, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:329)");
            }
            startRestartGroup.startReplaceableGroup(-1417073720);
            boolean changedInstance = startRestartGroup.changedInstance(function22) | startRestartGroup.changed(f);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo342measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        Placeable placeable;
                        MeasureResult m1915placeLabelAndIconDIyivk0;
                        MeasureResult m1914placeIcon3p2s80s;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                                Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(j);
                                if (function22 != null) {
                                    int size2 = list.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        Measurable measurable2 = list.get(i4);
                                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), Constants.ScionAnalytics.PARAM_LABEL)) {
                                            placeable = measurable2.mo5851measureBRTryo0(Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                placeable = null;
                                Placeable placeable2 = placeable;
                                if (function22 == null) {
                                    m1914placeIcon3p2s80s = NavigationRailKt.m1914placeIcon3p2s80s(measureScope, mo5851measureBRTryo0, j);
                                    return m1914placeIcon3p2s80s;
                                }
                                Intrinsics.checkNotNull(placeable2);
                                m1915placeLabelAndIconDIyivk0 = NavigationRailKt.m1915placeLabelAndIconDIyivk0(measureScope, placeable2, mo5851measureBRTryo0, j, f);
                                return m1915placeLabelAndIconDIyivk0;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
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
            Updater.m4015setimpl(m4008constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 116753849, "C332@14054L41:NavigationRail.kt#jmzs0o");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2053497723, "C332@14087L6:NavigationRail.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(286686926);
            ComposerKt.sourceInformation(startRestartGroup, "334@14145L168");
            if (function22 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.INSTANCE, Constants.ScionAnalytics.PARAM_LABEL), f);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(alpha);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2053497940, "C338@14304L7:NavigationRail.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$3
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
                    NavigationRailKt.NavigationRailItemBaselineLayout(function2, function22, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1914placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        final int max = Math.max(0, (Constraints.m6950getMaxWidthimpl(j) - placeable.getWidth()) / 2);
        final int max2 = Math.max(0, (Constraints.m6949getMaxHeightimpl(j) - placeable.getHeight()) / 2);
        return MeasureScope.layout$default(measureScope, Constraints.m6950getMaxWidthimpl(j), Constraints.m6949getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, max, max2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1915placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        final int m6949getMaxHeightimpl = (Constraints.m6949getMaxHeightimpl(j) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo671roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int m6950getMaxWidthimpl = (Constraints.m6950getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        final int i = measureScope.mo671roundToPx0680j_4(ItemIconTopOffset);
        int m6949getMaxHeightimpl2 = (Constraints.m6949getMaxHeightimpl(j) - placeable2.getHeight()) / 2;
        final int m6950getMaxWidthimpl2 = (Constraints.m6950getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        final int roundToInt = MathKt.roundToInt((m6949getMaxHeightimpl2 - i) * (1 - f));
        return MeasureScope.layout$default(measureScope, Constraints.m6950getMaxWidthimpl(j), Constraints.m6949getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
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
                if (f != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, m6950getMaxWidthimpl, m6949getMaxHeightimpl + roundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, m6950getMaxWidthimpl2, i + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        float f = 8;
        NavigationRailPadding = Dp.m6997constructorimpl(f);
        HeaderPadding = Dp.m6997constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
