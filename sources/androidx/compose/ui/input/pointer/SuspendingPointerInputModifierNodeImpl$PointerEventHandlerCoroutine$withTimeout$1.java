package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import b1.a2;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {782}, m = "withTimeout")
/* loaded from: classes4.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    public a2 f15657a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f15658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine f15659c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, g gVar) {
        super(gVar);
        this.f15659c = pointerEventHandlerCoroutine;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f15658b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15659c.f1(0L, null, this);
    }
}
