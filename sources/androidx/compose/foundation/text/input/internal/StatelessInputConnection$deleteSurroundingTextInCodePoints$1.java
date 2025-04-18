package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class StatelessInputConnection$deleteSurroundingTextInCodePoints$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6492b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$deleteSurroundingTextInCodePoints$1(int i2, int i3) {
        super(1);
        this.f6491a = i2;
        this.f6492b = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        EditingBuffer editingBuffer = (EditingBuffer) obj;
        int i2 = this.f6491a;
        int i3 = this.f6492b;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.l("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i2, " and ", i3, " respectively.").toString());
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < i2) {
                int i7 = i6 + 1;
                int i8 = editingBuffer.f6401c;
                if (i8 <= i7) {
                    i6 = i8;
                    break;
                }
                PartialGapBuffer partialGapBuffer = editingBuffer.f6399a;
                i6 = (Character.isHighSurrogate(partialGapBuffer.charAt((i8 - i7) + (-1))) && Character.isLowSurrogate(partialGapBuffer.charAt(editingBuffer.f6401c - i7))) ? i6 + 2 : i7;
                i5++;
            } else {
                break;
            }
        }
        int i9 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i10 = i9 + 1;
            int i11 = editingBuffer.d + i10;
            PartialGapBuffer partialGapBuffer2 = editingBuffer.f6399a;
            if (i11 >= partialGapBuffer2.length()) {
                i9 = partialGapBuffer2.length() - editingBuffer.d;
                break;
            }
            i9 = (Character.isHighSurrogate(partialGapBuffer2.charAt((editingBuffer.d + i10) + (-1))) && Character.isLowSurrogate(partialGapBuffer2.charAt(editingBuffer.d + i10))) ? i9 + 2 : i10;
            i4++;
        }
        int i12 = editingBuffer.d;
        editingBuffer.c(i12, i9 + i12);
        int i13 = editingBuffer.f6401c;
        editingBuffer.c(i13 - i6, i13);
        return b0.f30125a;
    }
}
