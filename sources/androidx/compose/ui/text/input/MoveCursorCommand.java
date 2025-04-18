package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MoveCursorCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        if (editingBuffer.d() == -1) {
            int i2 = editingBuffer.f17325b;
            editingBuffer.h(i2, i2);
        }
        int i3 = editingBuffer.f17325b;
        editingBuffer.f17324a.toString();
        editingBuffer.h(i3, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoveCursorCommand)) {
            return false;
        }
        ((MoveCursorCommand) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MoveCursorCommand(amount=0)";
    }
}
