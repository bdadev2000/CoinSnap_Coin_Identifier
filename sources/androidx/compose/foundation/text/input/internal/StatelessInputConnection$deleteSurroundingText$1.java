package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class StatelessInputConnection$deleteSurroundingText$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6490b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$deleteSurroundingText$1(int i2, int i3) {
        super(1);
        this.f6489a = i2;
        this.f6490b = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        EditingBuffer editingBuffer = (EditingBuffer) obj;
        int i2 = this.f6489a;
        int i3 = this.f6490b;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.l("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i2, " and ", i3, " respectively.").toString());
        }
        int i4 = editingBuffer.d;
        int i5 = i4 + i3;
        int i6 = (i3 ^ i5) & (i4 ^ i5);
        PartialGapBuffer partialGapBuffer = editingBuffer.f6399a;
        if (i6 < 0) {
            i5 = partialGapBuffer.length();
        }
        editingBuffer.c(editingBuffer.d, Math.min(i5, partialGapBuffer.length()));
        int i7 = editingBuffer.f6401c;
        int i8 = i7 - i2;
        if (((i2 ^ i7) & (i7 ^ i8)) < 0) {
            i8 = 0;
        }
        editingBuffer.c(Math.max(0, i8), editingBuffer.f6401c);
        return b0.f30125a;
    }
}
