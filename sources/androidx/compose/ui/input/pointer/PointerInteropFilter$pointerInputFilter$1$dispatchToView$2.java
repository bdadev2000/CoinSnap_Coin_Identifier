package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f15627a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f15627a = pointerInteropFilter;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        l lVar = this.f15627a.f15619a;
        if (lVar != null) {
            lVar.invoke(motionEvent);
            return b0.f30125a;
        }
        a.B0("onTouchEvent");
        throw null;
    }
}
