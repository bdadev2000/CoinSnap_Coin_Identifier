package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {774, 775}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f15660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine f15662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(long j2, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, g gVar) {
        super(2, gVar);
        this.f15661b = j2;
        this.f15662c = pointerEventHandlerCoroutine;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.f15661b, this.f15662c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r10.f15660a
            r2 = 1
            long r4 = r10.f15661b
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            kotlin.jvm.internal.q.m(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.jvm.internal.q.m(r11)
            goto L2e
        L20:
            kotlin.jvm.internal.q.m(r11)
            long r8 = r4 - r2
            r10.f15660a = r7
            java.lang.Object r11 = p0.a.L(r8, r10)
            if (r11 != r0) goto L2e
            return r0
        L2e:
            r10.f15660a = r6
            java.lang.Object r11 = p0.a.L(r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r11 = r10.f15662c
            b1.k r11 = r11.f15655c
            if (r11 == 0) goto L49
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r0.<init>(r4)
            d0.m r0 = kotlin.jvm.internal.q.d(r0)
            r11.resumeWith(r0)
        L49:
            d0.b0 r11 = d0.b0.f30125a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
