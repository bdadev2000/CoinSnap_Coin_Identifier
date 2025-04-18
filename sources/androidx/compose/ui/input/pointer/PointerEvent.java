package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PointerEvent {

    /* renamed from: a, reason: collision with root package name */
    public final List f15569a;

    /* renamed from: b, reason: collision with root package name */
    public final InternalPointerEvent f15570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15571c;
    public int d;

    public PointerEvent(List list, InternalPointerEvent internalPointerEvent) {
        this.f15569a = list;
        this.f15570b = internalPointerEvent;
        MotionEvent a2 = a();
        int i2 = 0;
        this.f15571c = a2 != null ? a2.getButtonState() : 0;
        MotionEvent a3 = a();
        if (a3 != null) {
            a3.getMetaState();
        }
        MotionEvent a4 = a();
        int i3 = 1;
        if (a4 == null) {
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    i3 = 3;
                    break;
                }
                PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
                if (PointerEventKt.c(pointerInputChange)) {
                    i3 = 2;
                    break;
                } else if (PointerEventKt.a(pointerInputChange)) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            int actionMasked = a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                        i3 = i2;
                    }
                    i2 = 3;
                    i3 = i2;
                }
                i2 = 2;
                i3 = i2;
            }
            i2 = 1;
            i3 = i2;
        }
        this.d = i3;
    }

    public final MotionEvent a() {
        InternalPointerEvent internalPointerEvent = this.f15570b;
        if (internalPointerEvent != null) {
            return internalPointerEvent.f15555b.f15605b;
        }
        return null;
    }
}
