package androidx.compose.material3;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.p;

@e(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", l = {1503}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ClockDialNode$updateNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f8504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$updateNode$1(AnalogTimePickerState analogTimePickerState, g gVar) {
        super(2, gVar);
        this.f8504b = analogTimePickerState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ClockDialNode$updateNode$1(this.f8504b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ClockDialNode$updateNode$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r7.f8503a
            d0.b0 r2 = d0.b0.f30125a
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.jvm.internal.q.m(r8)
            goto L9b
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.jvm.internal.q.m(r8)
            r7.f8503a = r3
            androidx.compose.material3.AnalogTimePickerState r8 = r7.f8504b
            androidx.compose.material3.TimePickerState r1 = r8.f7571a
            int r4 = r1.c()
            r5 = 0
            boolean r4 = androidx.compose.material3.TimePickerSelectionMode.a(r4, r5)
            if (r4 == 0) goto L49
            androidx.compose.animation.core.Animatable r4 = r8.d
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r4.e
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = androidx.compose.material3.AnalogTimePickerState.k(r4)
            float r6 = r8.f7572b
            float r6 = androidx.compose.material3.AnalogTimePickerState.k(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            goto L6f
        L49:
            int r4 = r1.c()
            boolean r3 = androidx.compose.material3.TimePickerSelectionMode.a(r4, r3)
            if (r3 == 0) goto L71
            androidx.compose.animation.core.Animatable r3 = r8.d
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r3.e
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = androidx.compose.material3.AnalogTimePickerState.k(r3)
            float r4 = r8.f7573c
            float r4 = androidx.compose.material3.AnalogTimePickerState.k(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L71
        L6f:
            r8 = r2
            goto L98
        L71:
            int r1 = r1.c()
            boolean r1 = androidx.compose.material3.TimePickerSelectionMode.a(r1, r5)
            if (r1 == 0) goto L82
            float r1 = r8.f7572b
            float r1 = r8.j(r1)
            goto L88
        L82:
            float r1 = r8.f7573c
            float r1 = r8.j(r1)
        L88:
            androidx.compose.foundation.MutatePriority r3 = androidx.compose.foundation.MutatePriority.f2813c
            androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2 r4 = new androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2
            r5 = 0
            r4.<init>(r8, r1, r5)
            androidx.compose.foundation.MutatorMutex r8 = r8.e
            java.lang.Object r8 = r8.b(r3, r4, r7)
            if (r8 != r0) goto L6f
        L98:
            if (r8 != r0) goto L9b
            return r0
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ClockDialNode$updateNode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
