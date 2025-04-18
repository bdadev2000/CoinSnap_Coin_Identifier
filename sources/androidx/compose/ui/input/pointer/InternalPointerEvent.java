package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class InternalPointerEvent {

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f15554a;

    /* renamed from: b, reason: collision with root package name */
    public final PointerInputEvent f15555b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15556c;

    public InternalPointerEvent(LongSparseArray longSparseArray, PointerInputEvent pointerInputEvent) {
        this.f15554a = longSparseArray;
        this.f15555b = pointerInputEvent;
    }

    public final boolean a(long j2) {
        Object obj;
        List list = this.f15555b.f15604a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (PointerId.a(((PointerInputEventData) obj).f15606a, j2)) {
                break;
            }
            i2++;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            return pointerInputEventData.f15611h;
        }
        return false;
    }
}
