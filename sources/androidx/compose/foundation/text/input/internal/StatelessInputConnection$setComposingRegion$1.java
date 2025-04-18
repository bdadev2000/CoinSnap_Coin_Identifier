package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class StatelessInputConnection$setComposingRegion$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$setComposingRegion$1(int i2, int i3) {
        super(1);
        this.f6496a = i2;
        this.f6497b = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        EditingBuffer editingBuffer = (EditingBuffer) obj;
        if (editingBuffer.f6402f != -1) {
            editingBuffer.b();
        }
        PartialGapBuffer partialGapBuffer = editingBuffer.f6399a;
        int A = p0.a.A(this.f6496a, 0, partialGapBuffer.length());
        int A2 = p0.a.A(this.f6497b, 0, partialGapBuffer.length());
        if (A != A2) {
            if (A < A2) {
                editingBuffer.g(A, A2);
            } else {
                editingBuffer.g(A2, A);
            }
        }
        return b0.f30125a;
    }
}
