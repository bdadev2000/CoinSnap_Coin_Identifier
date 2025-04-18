package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PointerInputChangeEventProducer {

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f15600a = new LongSparseArray((Object) null);

    /* loaded from: classes3.dex */
    public static final class PointerInputData {

        /* renamed from: a, reason: collision with root package name */
        public final long f15601a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15602b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15603c;

        public PointerInputData(long j2, long j3, boolean z2) {
            this.f15601a = j2;
            this.f15602b = j3;
            this.f15603c = z2;
        }
    }

    public final InternalPointerEvent a(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        boolean z2;
        long j2;
        long j3;
        List list = pointerInputEvent.f15604a;
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) list.get(i2);
            long j4 = pointerInputEventData.f15606a;
            LongSparseArray longSparseArray2 = this.f15600a;
            PointerInputData pointerInputData = (PointerInputData) longSparseArray2.c(j4);
            if (pointerInputData == null) {
                j3 = pointerInputEventData.f15607b;
                j2 = pointerInputEventData.d;
                z2 = false;
            } else {
                long n2 = positionCalculator.n(pointerInputData.f15602b);
                long j5 = pointerInputData.f15601a;
                z2 = pointerInputData.f15603c;
                j2 = n2;
                j3 = j5;
            }
            long j6 = pointerInputEventData.f15606a;
            int i3 = i2;
            List list2 = list;
            int i4 = size;
            LongSparseArray longSparseArray3 = longSparseArray;
            longSparseArray3.h(j6, new PointerInputChange(j6, pointerInputEventData.f15607b, pointerInputEventData.d, pointerInputEventData.e, pointerInputEventData.f15609f, j3, j2, z2, pointerInputEventData.f15610g, pointerInputEventData.f15612i, pointerInputEventData.f15613j, pointerInputEventData.f15614k));
            boolean z3 = pointerInputEventData.e;
            long j7 = pointerInputEventData.f15606a;
            if (z3) {
                longSparseArray2.h(j7, new PointerInputData(pointerInputEventData.f15607b, pointerInputEventData.f15608c, z3));
            } else {
                longSparseArray2.i(j7);
            }
            i2 = i3 + 1;
            longSparseArray = longSparseArray3;
            list = list2;
            size = i4;
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
