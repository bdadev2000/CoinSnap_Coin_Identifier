package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f17316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17317b;

    public DeleteSurroundingTextCommand(int i2, int i3) {
        this.f17316a = i2;
        this.f17317b = i3;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(d.l("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i2, " and ", i3, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        int i2 = editingBuffer.f17326c;
        int i3 = this.f17317b;
        int i4 = i2 + i3;
        int i5 = (i2 ^ i4) & (i3 ^ i4);
        PartialGapBuffer partialGapBuffer = editingBuffer.f17324a;
        if (i5 < 0) {
            i4 = partialGapBuffer.a();
        }
        editingBuffer.a(editingBuffer.f17326c, Math.min(i4, partialGapBuffer.a()));
        int i6 = editingBuffer.f17325b;
        int i7 = this.f17316a;
        int i8 = i6 - i7;
        if (((i6 ^ i8) & (i7 ^ i6)) < 0) {
            i8 = 0;
        }
        editingBuffer.a(Math.max(0, i8), editingBuffer.f17325b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.f17316a == deleteSurroundingTextCommand.f17316a && this.f17317b == deleteSurroundingTextCommand.f17317b;
    }

    public final int hashCode() {
        return (this.f17316a * 31) + this.f17317b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f17316a);
        sb.append(", lengthAfterCursor=");
        return d.o(sb, this.f17317b, ')');
    }
}
