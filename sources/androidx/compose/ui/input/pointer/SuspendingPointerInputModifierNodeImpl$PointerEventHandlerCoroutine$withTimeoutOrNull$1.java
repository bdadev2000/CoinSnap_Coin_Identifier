package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {753}, m = "withTimeoutOrNull")
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine f15664b;

    /* renamed from: c, reason: collision with root package name */
    public int f15665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, g gVar) {
        super(gVar);
        this.f15664b = pointerEventHandlerCoroutine;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f15663a = obj;
        this.f15665c |= Integer.MIN_VALUE;
        return this.f15664b.E1(0L, null, this);
    }
}
