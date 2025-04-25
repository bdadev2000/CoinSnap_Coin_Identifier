package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0083\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\"\u001a%\u0010#\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00104\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00106\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010;\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", TtmlNode.TAG_SPAN, "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1181LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r29, androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, float r34, androidx.compose.foundation.layout.Arrangement.Horizontal r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m1181LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1267076841, "C(rememberColumnSlots)P(!1,2)94@4216L1114:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 463564400, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m1182invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m1182invoke0kLqBqw(Density density, long j) {
                    if (Constraints.m6950getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j) - density.mo671roundToPx0680j_4(Dp.m6997constructorimpl(PaddingKt.calculateStartPadding(PaddingValues.this, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(PaddingValues.this, LayoutDirection.Ltr)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] calculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, m6950getMaxWidthimpl, density.mo671roundToPx0680j_4(horizontal2.getSpacing()));
                    int[] iArr = new int[calculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, m6950getMaxWidthimpl, calculateCrossAxisCellSizes, LayoutDirection.Ltr, iArr);
                    return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1180LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m1180LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1532383053, "C(rememberRowSlots)P(1,2)184@8120L940:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1011137904, "CC(remember):LazyStaggeredGridDsl.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4) | ((((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i & 384) == 256);
        LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m1183invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m1183invoke0kLqBqw(Density density, long j) {
                    if (Constraints.m6949getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    int m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j) - density.mo671roundToPx0680j_4(Dp.m6997constructorimpl(PaddingValues.this.getTop() + PaddingValues.this.getBottom()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] calculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, m6949getMaxHeightimpl, density.mo671roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[calculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, m6949getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return lazyGridStaggeredGridSlotsProvider;
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((LazyStaggeredGridDslKt$items$1) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$1
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((LazyStaggeredGridDslKt$items$6) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null, new LazyStaggeredGridDslKt$items$8(function12, objArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new LazyStaggeredGridDslKt$items$8(function12, tArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$6
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(function22, objArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(tArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(function22, tArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(function5, tArr)));
    }
}
