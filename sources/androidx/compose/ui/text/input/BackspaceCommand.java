package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import kotlin.jvm.internal.g0;

@StabilityInferred
/* loaded from: classes4.dex */
public final class BackspaceCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        if (editingBuffer.e()) {
            editingBuffer.a(editingBuffer.d, editingBuffer.e);
            return;
        }
        if (editingBuffer.d() == -1) {
            int i2 = editingBuffer.f17325b;
            int i3 = editingBuffer.f17326c;
            editingBuffer.h(i2, i2);
            editingBuffer.a(i2, i3);
            return;
        }
        if (editingBuffer.d() == 0) {
            return;
        }
        String partialGapBuffer = editingBuffer.f17324a.toString();
        int d = editingBuffer.d();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(partialGapBuffer);
        editingBuffer.a(characterInstance.preceding(d), editingBuffer.d());
    }

    public final boolean equals(Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public final int hashCode() {
        return g0.a(BackspaceCommand.class).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
