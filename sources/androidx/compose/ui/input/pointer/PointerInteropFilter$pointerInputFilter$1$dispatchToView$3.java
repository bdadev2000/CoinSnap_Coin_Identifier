package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 f15628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f15629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f15628a = pointerInteropFilter$pointerInputFilter$1;
        this.f15629b = pointerInteropFilter;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        int actionMasked = motionEvent.getActionMasked();
        PointerInteropFilter pointerInteropFilter = this.f15629b;
        if (actionMasked == 0) {
            l lVar = pointerInteropFilter.f15619a;
            if (lVar == null) {
                a.B0("onTouchEvent");
                throw null;
            }
            this.f15628a.f15625b = ((Boolean) lVar.invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.f15623b : PointerInteropFilter.DispatchToViewState.f15624c;
        } else {
            l lVar2 = pointerInteropFilter.f15619a;
            if (lVar2 == null) {
                a.B0("onTouchEvent");
                throw null;
            }
            lVar2.invoke(motionEvent);
        }
        return b0.f30125a;
    }
}
