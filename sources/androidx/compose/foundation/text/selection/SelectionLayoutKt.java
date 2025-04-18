package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes2.dex */
public final class SelectionLayoutKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ResolvedTextDirection a(TextLayoutResult textLayoutResult, int i2) {
        if (textLayoutResult.f17046a.f17038a.length() != 0) {
            int f2 = textLayoutResult.f(i2);
            if ((i2 != 0 && f2 == textLayoutResult.f(i2 - 1)) || (i2 != textLayoutResult.f17046a.f17038a.f16880a.length() && f2 == textLayoutResult.f(i2 + 1))) {
                return textLayoutResult.a(i2);
            }
        }
        return textLayoutResult.j(i2);
    }

    public static final SelectionLayout b(TextLayoutResult textLayoutResult, int i2, int i3, int i4, long j2, boolean z2, boolean z3) {
        Selection selection;
        if (z2) {
            selection = null;
        } else {
            int i5 = TextRange.f17057c;
            int i6 = (int) (j2 >> 32);
            int i7 = (int) (j2 & 4294967295L);
            selection = new Selection(new Selection.AnchorInfo(a(textLayoutResult, i6), i6, 1L), new Selection.AnchorInfo(a(textLayoutResult, i7), i7, 1L), TextRange.g(j2));
        }
        return new SingleSelectionLayout(z3, 1, 1, selection, new SelectableInfo(1L, 1, i2, i3, i4, textLayoutResult));
    }

    public static final Direction c(Direction direction, Direction direction2) {
        int ordinal = direction2.ordinal();
        Direction direction3 = Direction.f7056a;
        if (ordinal == 0) {
            return direction3;
        }
        Direction direction4 = Direction.f7058c;
        if (ordinal == 1) {
            int ordinal2 = direction.ordinal();
            if (ordinal2 == 0) {
                return direction3;
            }
            if (ordinal2 == 1) {
                return Direction.f7057b;
            }
            if (ordinal2 != 2) {
                throw new RuntimeException();
            }
        } else if (ordinal != 2) {
            throw new RuntimeException();
        }
        return direction4;
    }
}
