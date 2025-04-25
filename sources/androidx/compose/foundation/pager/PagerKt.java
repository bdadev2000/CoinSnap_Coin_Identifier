package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aâ\u0001\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010,\u001a\u00020\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082\b\u001aL\u00100\u001a\u00020\u000b*\u00020\u001e2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000bH\u0000\u001a,\u00109\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "currentPageOffset", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "currentPageOffsetFraction", "", "pageCount", "pagerSemantics", "isVertical", "scope", "Lkotlinx/coroutines/CoroutineScope;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PagerKt {
    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1222HorizontalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState r34, androidx.compose.ui.Modifier r35, androidx.compose.foundation.layout.PaddingValues r36, androidx.compose.foundation.pager.PageSize r37, int r38, float r39, androidx.compose.ui.Alignment.Vertical r40, androidx.compose.foundation.gestures.TargetedFlingBehavior r41, boolean r42, boolean r43, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r44, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, androidx.compose.foundation.gestures.snapping.SnapPosition r46, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m1222HorizontalPageroI3XNZo(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1223VerticalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState r34, androidx.compose.ui.Modifier r35, androidx.compose.foundation.layout.PaddingValues r36, androidx.compose.foundation.pager.PageSize r37, int r38, float r39, androidx.compose.ui.Alignment.Horizontal r40, androidx.compose.foundation.gestures.TargetedFlingBehavior r41, boolean r42, boolean r43, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r44, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, androidx.compose.foundation.gestures.snapping.SnapPosition r46, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m1223VerticalPageroI3XNZo(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return MathKt.roundToInt(snapPosition.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    public static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z, final CoroutineScope coroutineScope, boolean z2) {
        if (z2) {
            return modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    if (z) {
                        final PagerState pagerState2 = pagerState;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                boolean pagerSemantics$performBackwardPaging;
                                pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(PagerState.this, coroutineScope2);
                                return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                            }
                        }, 1, null);
                        final PagerState pagerState3 = pagerState;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                boolean pagerSemantics$performForwardPaging;
                                pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(PagerState.this, coroutineScope3);
                                return Boolean.valueOf(pagerSemantics$performForwardPaging);
                            }
                        }, 1, null);
                        return;
                    }
                    final PagerState pagerState4 = pagerState;
                    final CoroutineScope coroutineScope4 = coroutineScope;
                    SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            boolean pagerSemantics$performBackwardPaging;
                            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(PagerState.this, coroutineScope4);
                            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
                        }
                    }, 1, null);
                    final PagerState pagerState5 = pagerState;
                    final CoroutineScope coroutineScope5 = coroutineScope;
                    SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            boolean pagerSemantics$performForwardPaging;
                            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(PagerState.this, coroutineScope5);
                            return Boolean.valueOf(pagerSemantics$performForwardPaging);
                        }
                    }, 1, null);
                }
            }, 1, null));
        }
        return modifier.then(Modifier.INSTANCE);
    }
}
