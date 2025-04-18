package androidx.compose.ui.input.pointer;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {616}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f15667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f15668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, g gVar) {
        super(2, gVar);
        this.f15668b = suspendingPointerInputModifierNodeImpl;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.f15668b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f15667a;
        if (i2 == 0) {
            q.m(obj);
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f15668b;
            p pVar = suspendingPointerInputModifierNodeImpl.f15648r;
            this.f15667a = 1;
            if (pVar.invoke(suspendingPointerInputModifierNodeImpl, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
