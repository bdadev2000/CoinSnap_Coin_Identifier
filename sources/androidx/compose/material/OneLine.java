package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0002\b\u00132\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/OneLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconVerticalPadding", "MinHeight", "MinHeightWithIcon", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class OneLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float TrailingRightPadding;
    public static final OneLine INSTANCE = new OneLine();
    private static final float MinHeight = Dp.m6997constructorimpl(48);
    private static final float MinHeightWithIcon = Dp.m6997constructorimpl(56);
    private static final float IconMinPaddedWidth = Dp.m6997constructorimpl(40);
    private static final float IconVerticalPadding = Dp.m6997constructorimpl(8);

    private OneLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ListItem(androidx.compose.ui.Modifier r32, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OneLine.ListItem(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    static {
        float f = 16;
        IconLeftPadding = Dp.m6997constructorimpl(f);
        ContentLeftPadding = Dp.m6997constructorimpl(f);
        ContentRightPadding = Dp.m6997constructorimpl(f);
        TrailingRightPadding = Dp.m6997constructorimpl(f);
    }
}
