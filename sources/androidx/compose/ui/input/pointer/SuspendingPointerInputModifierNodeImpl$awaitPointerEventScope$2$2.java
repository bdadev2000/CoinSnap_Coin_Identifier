package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import b1.k;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine f15666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine) {
        super(1);
        this.f15666a = pointerEventHandlerCoroutine;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = this.f15666a;
        k kVar = pointerEventHandlerCoroutine.f15655c;
        if (kVar != null) {
            kVar.A(th);
        }
        pointerEventHandlerCoroutine.f15655c = null;
        return b0.f30125a;
    }
}
