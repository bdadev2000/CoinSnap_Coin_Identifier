package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import b1.f0;
import java.util.List;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {

    /* renamed from: h, reason: collision with root package name */
    public final TextFieldValue f7298h;

    /* renamed from: i, reason: collision with root package name */
    public final TextLayoutResultProxy f7299i;

    public TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.f17361a, textFieldValue.f17362b, textLayoutResultProxy != null ? textLayoutResultProxy.f6210a : null, offsetMapping, textPreparedSelectionState);
        this.f7298h = textFieldValue;
        this.f7299i = textLayoutResultProxy;
    }

    public final List n(l lVar) {
        if (!TextRange.c(this.f7048f)) {
            return f0.v(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.f(this.f7048f), TextRange.f(this.f7048f)));
        }
        EditCommand editCommand = (EditCommand) lVar.invoke(this);
        if (editCommand != null) {
            return f0.u(editCommand);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(androidx.compose.foundation.text.TextLayoutResultProxy r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r6.f6211b
            if (r0 == 0) goto L11
            androidx.compose.ui.layout.LayoutCoordinates r1 = r6.f6212c
            if (r1 == 0) goto Le
            r2 = 1
            androidx.compose.ui.geometry.Rect r0 = r1.Q(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.Rect.e
        L13:
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.f7298h
            long r1 = r1.f17362b
            int r3 = androidx.compose.ui.text.TextRange.f17057c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            androidx.compose.ui.text.input.OffsetMapping r2 = r5.d
            int r1 = r2.b(r1)
            androidx.compose.ui.text.TextLayoutResult r6 = r6.f6210a
            androidx.compose.ui.geometry.Rect r1 = r6.c(r1)
            long r3 = r0.f()
            float r0 = androidx.compose.ui.geometry.Size.b(r3)
            float r7 = (float) r7
            float r0 = r0 * r7
            float r7 = r1.f14915b
            float r0 = r0 + r7
            float r7 = r1.f14914a
            long r0 = androidx.compose.ui.geometry.OffsetKt.a(r7, r0)
            androidx.compose.ui.text.MultiParagraph r6 = r6.f17047b
            int r6 = r6.e(r0)
            int r6 = r2.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.o(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }
}
