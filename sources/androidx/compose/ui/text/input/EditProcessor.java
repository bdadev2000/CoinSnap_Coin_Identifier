package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import e0.u;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class EditProcessor {

    /* renamed from: a, reason: collision with root package name */
    public TextFieldValue f17320a;

    /* renamed from: b, reason: collision with root package name */
    public EditingBuffer f17321b;

    public final TextFieldValue a(List list) {
        EditCommand editCommand;
        Exception e;
        try {
            int size = list.size();
            int i2 = 0;
            editCommand = null;
            while (i2 < size) {
                try {
                    EditCommand editCommand2 = (EditCommand) list.get(i2);
                    try {
                        editCommand2.a(this.f17321b);
                        i2++;
                        editCommand = editCommand2;
                    } catch (Exception e2) {
                        e = e2;
                        editCommand = editCommand2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(this.f17321b.f17324a.a());
                        sb2.append(", composition=");
                        sb2.append(this.f17321b.c());
                        sb2.append(", selection=");
                        EditingBuffer editingBuffer = this.f17321b;
                        sb2.append((Object) TextRange.h(TextRangeKt.a(editingBuffer.f17325b, editingBuffer.f17326c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        u.I0(list, sb, (r12 & 2) != 0 ? ", " : "\n", (r12 & 4) != 0 ? "" : null, (r12 & 8) != 0 ? "" : null, (r12 & 16) != 0 ? -1 : 0, (r12 & 32) != 0 ? "..." : null, (r12 & 64) != 0 ? null : new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this));
                        String sb3 = sb.toString();
                        p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                        throw new RuntimeException(sb3, e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            EditingBuffer editingBuffer2 = this.f17321b;
            editingBuffer2.getClass();
            AnnotatedString annotatedString = new AnnotatedString(editingBuffer2.f17324a.toString(), null, 6);
            EditingBuffer editingBuffer3 = this.f17321b;
            long a2 = TextRangeKt.a(editingBuffer3.f17325b, editingBuffer3.f17326c);
            TextRange textRange = TextRange.g(this.f17320a.f17362b) ? null : new TextRange(a2);
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString, textRange != null ? textRange.f17058a : TextRangeKt.a(TextRange.e(a2), TextRange.f(a2)), this.f17321b.c());
            this.f17320a = textFieldValue;
            return textFieldValue;
        } catch (Exception e4) {
            editCommand = null;
            e = e4;
        }
    }

    public final void b(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean z2 = true;
        boolean z3 = !p0.a.g(textFieldValue.f17363c, this.f17321b.c());
        AnnotatedString annotatedString = this.f17320a.f17361a;
        AnnotatedString annotatedString2 = textFieldValue.f17361a;
        boolean g2 = p0.a.g(annotatedString, annotatedString2);
        boolean z4 = false;
        long j2 = textFieldValue.f17362b;
        if (!g2) {
            this.f17321b = new EditingBuffer(annotatedString2, j2);
        } else if (TextRange.b(this.f17320a.f17362b, j2)) {
            z2 = false;
        } else {
            this.f17321b.h(TextRange.f(j2), TextRange.e(j2));
            z4 = true;
            z2 = false;
        }
        TextRange textRange = textFieldValue.f17363c;
        if (textRange == null) {
            EditingBuffer editingBuffer = this.f17321b;
            editingBuffer.d = -1;
            editingBuffer.e = -1;
        } else {
            long j3 = textRange.f17058a;
            if (!TextRange.c(j3)) {
                this.f17321b.g(TextRange.f(j3), TextRange.e(j3));
            }
        }
        if (z2 || (!z4 && z3)) {
            EditingBuffer editingBuffer2 = this.f17321b;
            editingBuffer2.d = -1;
            editingBuffer2.e = -1;
            textFieldValue = TextFieldValue.a(textFieldValue, null, 0L, 3);
        }
        TextFieldValue textFieldValue2 = this.f17320a;
        this.f17320a = textFieldValue;
        if (textInputSession == null || !p0.a.g((TextInputSession) textInputSession.f17390a.f17367b.get(), textInputSession)) {
            return;
        }
        textInputSession.f17391b.d(textFieldValue2, textFieldValue);
    }
}
