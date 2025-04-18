package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CommitTextCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f17296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17297b;

    public CommitTextCommand(AnnotatedString annotatedString, int i2) {
        this.f17296a = annotatedString;
        this.f17297b = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        boolean e = editingBuffer.e();
        AnnotatedString annotatedString = this.f17296a;
        if (e) {
            editingBuffer.f(editingBuffer.d, editingBuffer.e, annotatedString.f16880a);
        } else {
            editingBuffer.f(editingBuffer.f17325b, editingBuffer.f17326c, annotatedString.f16880a);
        }
        int d = editingBuffer.d();
        int i2 = this.f17297b;
        int A = p0.a.A(i2 > 0 ? (d + i2) - 1 : (d + i2) - annotatedString.f16880a.length(), 0, editingBuffer.f17324a.a());
        editingBuffer.h(A, A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return p0.a.g(this.f17296a.f16880a, commitTextCommand.f17296a.f16880a) && this.f17297b == commitTextCommand.f17297b;
    }

    public final int hashCode() {
        return (this.f17296a.f16880a.hashCode() * 31) + this.f17297b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f17296a.f16880a);
        sb.append("', newCursorPosition=");
        return d.o(sb, this.f17297b, ')');
    }

    public CommitTextCommand(String str, int i2) {
        this(new AnnotatedString(str, null, 6), i2);
    }
}
