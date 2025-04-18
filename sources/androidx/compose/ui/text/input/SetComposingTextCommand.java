package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SetComposingTextCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f17357a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17358b;

    public SetComposingTextCommand(String str, int i2) {
        this.f17357a = new AnnotatedString(str, null, 6);
        this.f17358b = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        boolean e = editingBuffer.e();
        AnnotatedString annotatedString = this.f17357a;
        if (e) {
            int i2 = editingBuffer.d;
            editingBuffer.f(i2, editingBuffer.e, annotatedString.f16880a);
            String str = annotatedString.f16880a;
            if (str.length() > 0) {
                editingBuffer.g(i2, str.length() + i2);
            }
        } else {
            int i3 = editingBuffer.f17325b;
            editingBuffer.f(i3, editingBuffer.f17326c, annotatedString.f16880a);
            String str2 = annotatedString.f16880a;
            if (str2.length() > 0) {
                editingBuffer.g(i3, str2.length() + i3);
            }
        }
        int d = editingBuffer.d();
        int i4 = this.f17358b;
        int A = p0.a.A(i4 > 0 ? (d + i4) - 1 : (d + i4) - annotatedString.f16880a.length(), 0, editingBuffer.f17324a.a());
        editingBuffer.h(A, A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        return p0.a.g(this.f17357a.f16880a, setComposingTextCommand.f17357a.f16880a) && this.f17358b == setComposingTextCommand.f17358b;
    }

    public final int hashCode() {
        return (this.f17357a.f16880a.hashCode() * 31) + this.f17358b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f17357a.f16880a);
        sb.append("', newCursorPosition=");
        return d.o(sb, this.f17358b, ')');
    }
}
