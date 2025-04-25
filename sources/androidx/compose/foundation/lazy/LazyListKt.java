package androidx.compose.foundation.lazy;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u009a\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u0003¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyHeadersEnabled", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;ZLandroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyList(final androidx.compose.ui.Modifier r38, final androidx.compose.foundation.lazy.LazyListState r39, final androidx.compose.foundation.layout.PaddingValues r40, final boolean r41, final boolean r42, final androidx.compose.foundation.gestures.FlingBehavior r43, final boolean r44, int r45, androidx.compose.ui.Alignment.Horizontal r46, androidx.compose.foundation.layout.Arrangement.Vertical r47, androidx.compose.ui.Alignment.Vertical r48, androidx.compose.foundation.layout.Arrangement.Horizontal r49, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r34.changed(r29) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r34.changed(r30) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        if (r34.changed(r33) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r34.changed(r22) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyListMeasurePolicy(final kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.LazyListItemProvider> r21, final androidx.compose.foundation.lazy.LazyListState r22, final androidx.compose.foundation.layout.PaddingValues r23, final boolean r24, final boolean r25, final int r26, final androidx.compose.ui.Alignment.Horizontal r27, final androidx.compose.ui.Alignment.Vertical r28, final androidx.compose.foundation.layout.Arrangement.Horizontal r29, final androidx.compose.foundation.layout.Arrangement.Vertical r30, final kotlinx.coroutines.CoroutineScope r31, final androidx.compose.ui.graphics.GraphicsContext r32, final boolean r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.rememberLazyListMeasurePolicy(kotlin.jvm.functions.Function0, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext, boolean, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
