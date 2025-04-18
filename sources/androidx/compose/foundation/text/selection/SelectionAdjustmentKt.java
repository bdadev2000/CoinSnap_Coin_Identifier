package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import b1.f0;
import d0.h;
import d0.i;

/* loaded from: classes3.dex */
public final class SelectionAdjustmentKt {
    public static final Selection a(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z2 = selectionLayout.e() == CrossStatus.f7053a;
        return new Selection(c(selectionLayout.k(), z2, true, selectionLayout.l(), boundaryFunction), c(selectionLayout.i(), z2, false, selectionLayout.d(), boundaryFunction), z2);
    }

    public static final Selection.AnchorInfo b(SelectionLayout selectionLayout, SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        int i2 = selectionLayout.a() ? selectableInfo.f7081c : selectableInfo.d;
        if ((selectionLayout.a() ? selectionLayout.l() : selectionLayout.d()) != selectableInfo.f7080b) {
            return selectableInfo.a(i2);
        }
        i iVar = i.f30133c;
        h s2 = f0.s(iVar, new SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(selectableInfo, i2));
        h s3 = f0.s(iVar, new SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(selectableInfo, i2, selectionLayout.a() ? selectableInfo.d : selectableInfo.f7081c, selectionLayout, s2));
        if (selectableInfo.f7079a != anchorInfo.f7088c) {
            return (Selection.AnchorInfo) s3.getValue();
        }
        int i3 = selectableInfo.e;
        if (i2 == i3) {
            return anchorInfo;
        }
        TextLayoutResult textLayoutResult = selectableInfo.f7082f;
        if (((Number) s2.getValue()).intValue() != textLayoutResult.f(i3)) {
            return (Selection.AnchorInfo) s3.getValue();
        }
        int i4 = anchorInfo.f7087b;
        long l2 = textLayoutResult.l(i4);
        boolean a2 = selectionLayout.a();
        if (i3 != -1) {
            if (i2 != i3) {
                if (!(a2 ^ (selectableInfo.b() == CrossStatus.f7053a))) {
                }
            }
            return selectableInfo.a(i2);
        }
        int i5 = TextRange.f17057c;
        return (i4 == ((int) (l2 >> 32)) || i4 == ((int) (l2 & 4294967295L))) ? (Selection.AnchorInfo) s3.getValue() : selectableInfo.a(i2);
    }

    public static final Selection.AnchorInfo c(SelectableInfo selectableInfo, boolean z2, boolean z3, int i2, BoundaryFunction boundaryFunction) {
        long j2;
        int i3 = z3 ? selectableInfo.f7081c : selectableInfo.d;
        if (i2 != selectableInfo.f7080b) {
            return selectableInfo.a(i3);
        }
        long a2 = boundaryFunction.a(selectableInfo, i3);
        if (z2 ^ z3) {
            int i4 = TextRange.f17057c;
            j2 = a2 >> 32;
        } else {
            int i5 = TextRange.f17057c;
            j2 = 4294967295L & a2;
        }
        return selectableInfo.a((int) j2);
    }

    public static final Selection.AnchorInfo d(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i2) {
        return new Selection.AnchorInfo(selectableInfo.f7082f.a(i2), i2, anchorInfo.f7088c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1.f30919a == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1.f7087b == r4.f7087b) goto L25;
     */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.text.selection.Selection e(androidx.compose.foundation.text.selection.Selection r8, androidx.compose.foundation.text.selection.SelectionLayout r9) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionAdjustmentKt.e(androidx.compose.foundation.text.selection.Selection, androidx.compose.foundation.text.selection.SelectionLayout):androidx.compose.foundation.text.selection.Selection");
    }
}
