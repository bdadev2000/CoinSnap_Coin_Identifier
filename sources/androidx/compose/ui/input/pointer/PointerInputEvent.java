package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PointerInputEvent {

    /* renamed from: a, reason: collision with root package name */
    public final List f15604a;

    /* renamed from: b, reason: collision with root package name */
    public final MotionEvent f15605b;

    public PointerInputEvent(ArrayList arrayList, MotionEvent motionEvent) {
        this.f15604a = arrayList;
        this.f15605b = motionEvent;
    }
}
