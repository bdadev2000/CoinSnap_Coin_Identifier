package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SetSelectionCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f17359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17360b;

    public SetSelectionCommand(int i2, int i3) {
        this.f17359a = i2;
        this.f17360b = i3;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        int A = p0.a.A(this.f17359a, 0, editingBuffer.f17324a.a());
        int A2 = p0.a.A(this.f17360b, 0, editingBuffer.f17324a.a());
        if (A < A2) {
            editingBuffer.h(A, A2);
        } else {
            editingBuffer.h(A2, A);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.f17359a == setSelectionCommand.f17359a && this.f17360b == setSelectionCommand.f17360b;
    }

    public final int hashCode() {
        return (this.f17359a * 31) + this.f17360b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f17359a);
        sb.append(", end=");
        return d.o(sb, this.f17360b, ')');
    }
}
