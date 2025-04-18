package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.MeasureResult;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class FlowLayoutKt$placeHelper$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableVector f3934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$placeHelper$5(MutableVector mutableVector) {
        super(1);
        this.f3934a = mutableVector;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        MutableVector mutableVector = this.f3934a;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i3 = 0;
            do {
                ((MeasureResult) objArr[i3]).r();
                i3++;
            } while (i3 < i2);
        }
        return b0.f30125a;
    }
}
