package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.collection.MutableVector;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class StatelessInputConnection$endBatchEditInternal$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StatelessInputConnection f6493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$endBatchEditInternal$1(StatelessInputConnection statelessInputConnection) {
        super(1);
        this.f6493a = statelessInputConnection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        EditingBuffer editingBuffer = (EditingBuffer) obj;
        MutableVector mutableVector = this.f6493a.f6485c;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((l) objArr[i3]).invoke(editingBuffer);
                i3++;
            } while (i3 < i2);
        }
        return b0.f30125a;
    }
}
