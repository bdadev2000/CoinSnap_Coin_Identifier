package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SetComposingRegionCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f17355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17356b;

    public SetComposingRegionCommand(int i2, int i3) {
        this.f17355a = i2;
        this.f17356b = i3;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        if (editingBuffer.e()) {
            editingBuffer.d = -1;
            editingBuffer.e = -1;
        }
        PartialGapBuffer partialGapBuffer = editingBuffer.f17324a;
        int A = p0.a.A(this.f17355a, 0, partialGapBuffer.a());
        int A2 = p0.a.A(this.f17356b, 0, partialGapBuffer.a());
        if (A != A2) {
            if (A < A2) {
                editingBuffer.g(A, A2);
            } else {
                editingBuffer.g(A2, A);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.f17355a == setComposingRegionCommand.f17355a && this.f17356b == setComposingRegionCommand.f17356b;
    }

    public final int hashCode() {
        return (this.f17355a * 31) + this.f17356b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f17355a);
        sb.append(", end=");
        return d.o(sb, this.f17356b, ')');
    }
}
