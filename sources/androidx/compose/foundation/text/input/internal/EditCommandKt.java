package androidx.compose.foundation.text.input.internal;

/* loaded from: classes4.dex */
public final class EditCommandKt {
    public static final void a(EditingBuffer editingBuffer, String str, int i2) {
        int i3 = editingBuffer.f6402f;
        if (i3 != -1) {
            editingBuffer.f(i3, editingBuffer.f6403g, str);
        } else {
            editingBuffer.f(editingBuffer.f6401c, editingBuffer.d, str);
        }
        int i4 = editingBuffer.f6401c;
        int i5 = editingBuffer.d;
        int A = p0.a.A(i2 > 0 ? (r1 + i2) - 1 : ((i4 == i5 ? i5 : -1) + i2) - str.length(), 0, editingBuffer.f6399a.length());
        editingBuffer.h(A, A);
    }
}
