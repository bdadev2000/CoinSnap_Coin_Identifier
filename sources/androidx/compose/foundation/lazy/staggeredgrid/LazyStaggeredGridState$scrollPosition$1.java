package androidx.compose.foundation.lazy.staggeredgrid;

import android.support.v4.media.d;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import e0.q;
import kotlin.jvm.internal.o;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends o implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) this.receiver;
        SaverKt$Saver$1 saverKt$Saver$1 = LazyStaggeredGridState.f5048u;
        lazyStaggeredGridState.getClass();
        int[] iArr = new int[intValue2];
        ((LazyStaggeredGridMeasureResult) lazyStaggeredGridState.f5050b.getValue()).f5005h.a(intValue);
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridState.f5051c;
        lazyStaggeredGridLaneInfo.c(intValue + intValue2);
        int f2 = lazyStaggeredGridLaneInfo.f(intValue);
        if (f2 == -2 || f2 == -1) {
            i2 = 0;
        } else {
            if (f2 < 0) {
                throw new IllegalArgumentException(d.j("Expected positive lane number, got ", f2, " instead.").toString());
            }
            i2 = Math.min(f2, intValue2);
        }
        int i3 = i2 - 1;
        int i4 = intValue;
        while (true) {
            if (-1 >= i3) {
                break;
            }
            i4 = lazyStaggeredGridLaneInfo.d(i4, i3);
            iArr[i3] = i4;
            if (i4 == -1) {
                q.X(iArr, -1, i3, 2);
                break;
            }
            i3--;
        }
        iArr[i2] = intValue;
        while (true) {
            i2++;
            if (i2 >= intValue2) {
                return iArr;
            }
            intValue++;
            int length = lazyStaggeredGridLaneInfo.f4963a + lazyStaggeredGridLaneInfo.f4964b.length;
            while (true) {
                if (intValue >= length) {
                    intValue = lazyStaggeredGridLaneInfo.f4963a + lazyStaggeredGridLaneInfo.f4964b.length;
                    break;
                }
                if (lazyStaggeredGridLaneInfo.a(intValue, i2)) {
                    break;
                }
                intValue++;
            }
            iArr[i2] = intValue;
        }
    }
}
