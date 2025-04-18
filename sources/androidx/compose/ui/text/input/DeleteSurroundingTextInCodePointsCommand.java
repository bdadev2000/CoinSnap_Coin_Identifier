package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f17318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17319b;

    public DeleteSurroundingTextInCodePointsCommand(int i2, int i3) {
        this.f17318a = i2;
        this.f17319b = i3;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(d.l("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i2, " and ", i3, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < this.f17318a) {
                int i5 = i4 + 1;
                int i6 = editingBuffer.f17325b;
                if (i6 <= i5) {
                    i4 = i6;
                    break;
                } else {
                    i4 = (Character.isHighSurrogate(editingBuffer.b((i6 - i5) + (-1))) && Character.isLowSurrogate(editingBuffer.b(editingBuffer.f17325b - i5))) ? i4 + 2 : i5;
                    i3++;
                }
            } else {
                break;
            }
        }
        int i7 = 0;
        while (true) {
            if (i2 >= this.f17319b) {
                break;
            }
            int i8 = i7 + 1;
            int i9 = editingBuffer.f17326c + i8;
            PartialGapBuffer partialGapBuffer = editingBuffer.f17324a;
            if (i9 >= partialGapBuffer.a()) {
                i7 = partialGapBuffer.a() - editingBuffer.f17326c;
                break;
            } else {
                i7 = (Character.isHighSurrogate(editingBuffer.b((editingBuffer.f17326c + i8) + (-1))) && Character.isLowSurrogate(editingBuffer.b(editingBuffer.f17326c + i8))) ? i7 + 2 : i8;
                i2++;
            }
        }
        int i10 = editingBuffer.f17326c;
        editingBuffer.a(i10, i7 + i10);
        int i11 = editingBuffer.f17325b;
        editingBuffer.a(i11 - i4, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.f17318a == deleteSurroundingTextInCodePointsCommand.f17318a && this.f17319b == deleteSurroundingTextInCodePointsCommand.f17319b;
    }

    public final int hashCode() {
        return (this.f17318a * 31) + this.f17319b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f17318a);
        sb.append(", lengthAfterCursor=");
        return d.o(sb, this.f17319b, ')');
    }
}
