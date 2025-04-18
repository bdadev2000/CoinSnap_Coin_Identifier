package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes.dex */
public final class SelectionAdjustment$Companion$Paragraph$1$1 implements BoundaryFunction {

    /* renamed from: a, reason: collision with root package name */
    public static final SelectionAdjustment$Companion$Paragraph$1$1 f7092a = new Object();

    @Override // androidx.compose.foundation.text.selection.BoundaryFunction
    public final long a(SelectableInfo selectableInfo, int i2) {
        String str = selectableInfo.f7082f.f17046a.f17038a.f16880a;
        return TextRangeKt.a(StringHelpersKt.b(i2, str), StringHelpersKt.a(i2, str));
    }
}
