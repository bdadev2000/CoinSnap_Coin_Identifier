package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class StatelessInputConnection$setComposingText$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f6498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$setComposingText$1(int i2, CharSequence charSequence) {
        super(1);
        this.f6498a = charSequence;
        this.f6499b = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        EditingBuffer editingBuffer = (EditingBuffer) obj;
        String valueOf = String.valueOf(this.f6498a);
        int i2 = editingBuffer.f6402f;
        if (i2 != -1) {
            editingBuffer.f(i2, editingBuffer.f6403g, valueOf);
            if (valueOf.length() > 0) {
                editingBuffer.g(i2, valueOf.length() + i2);
            }
        } else {
            int i3 = editingBuffer.f6401c;
            editingBuffer.f(i3, editingBuffer.d, valueOf);
            if (valueOf.length() > 0) {
                editingBuffer.g(i3, valueOf.length() + i3);
            }
        }
        int i4 = editingBuffer.f6401c;
        int i5 = editingBuffer.d;
        int i6 = i4 == i5 ? i5 : -1;
        int i7 = this.f6499b;
        int A = p0.a.A(i7 > 0 ? (i6 + i7) - 1 : (i6 + i7) - valueOf.length(), 0, editingBuffer.f6399a.length());
        editingBuffer.h(A, A);
        return b0.f30125a;
    }
}
