package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2;
import androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", f = "TimePicker.kt", l = {1456}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputDragNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8484a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClockDialNode f8486c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClockDialNode f8487a;

        @e(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1462}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00331 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f8488a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClockDialNode f8489b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00331(ClockDialNode clockDialNode, g gVar) {
                super(2, gVar);
                this.f8489b = clockDialNode;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00331(this.f8489b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00331) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f8488a;
                b0 b0Var = b0.f30125a;
                if (i2 == 0) {
                    q.m(obj);
                    ClockDialNode clockDialNode = this.f8489b;
                    if (clockDialNode.f8479r) {
                        clockDialNode.f8478q.b(1);
                    }
                    AnalogTimePickerState analogTimePickerState = clockDialNode.f8478q;
                    this.f8488a = 1;
                    Object b2 = analogTimePickerState.e.b(MutatePriority.f2813c, new AnalogTimePickerState$onGestureEnd$2(analogTimePickerState, analogTimePickerState.j(TimePickerSelectionMode.a(analogTimePickerState.f7571a.c(), 0) ? analogTimePickerState.f7572b : analogTimePickerState.f7573c), null), this);
                    if (b2 != aVar) {
                        b2 = b0Var;
                    }
                    if (b2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                return b0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClockDialNode clockDialNode) {
            super(0);
            this.f8487a = clockDialNode;
        }

        @Override // q0.a
        public final Object invoke() {
            ClockDialNode clockDialNode = this.f8487a;
            kotlin.jvm.internal.e.v(clockDialNode.S1(), null, 0, new C00331(clockDialNode, null), 3);
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClockDialNode f8490a;

        @e(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1469}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        final class AnonymousClass1 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f8491a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClockDialNode f8492b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f8493c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ClockDialNode clockDialNode, long j2, g gVar) {
                super(2, gVar);
                this.f8492b = clockDialNode;
                this.f8493c = j2;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass1(this.f8492b, this.f8493c, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f8491a;
                b0 b0Var = b0.f30125a;
                if (i2 == 0) {
                    q.m(obj);
                    ClockDialNode clockDialNode = this.f8492b;
                    float f2 = clockDialNode.f8481t;
                    long j2 = this.f8493c;
                    clockDialNode.f8481t = Offset.g(j2) + f2;
                    float h2 = Offset.h(j2) + clockDialNode.f8482u;
                    clockDialNode.f8482u = h2;
                    AnalogTimePickerState analogTimePickerState = clockDialNode.f8478q;
                    long j3 = clockDialNode.f8483v;
                    float f3 = h2 - ((int) (4294967295L & j3));
                    float f4 = clockDialNode.f8481t - ((int) (j3 >> 32));
                    float f5 = TimePickerKt.f12322a;
                    float atan2 = ((float) Math.atan2(f3, f4)) - 1.5707964f;
                    if (atan2 < 0.0f) {
                        atan2 += 6.2831855f;
                    }
                    this.f8491a = 1;
                    analogTimePickerState.getClass();
                    Object b2 = analogTimePickerState.e.b(MutatePriority.f2812b, new AnalogTimePickerState$rotateTo$2(analogTimePickerState, atan2, false, null), this);
                    if (b2 != aVar) {
                        b2 = b0Var;
                    }
                    if (b2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                return b0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClockDialNode clockDialNode) {
            super(2);
            this.f8490a = clockDialNode;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            long j2 = ((Offset) obj2).f14913a;
            ClockDialNode clockDialNode = this.f8490a;
            kotlin.jvm.internal.e.v(clockDialNode.S1(), null, 0, new AnonymousClass1(clockDialNode, j2, null), 3);
            TimePickerKt.u(clockDialNode.f8478q, clockDialNode.f8481t, clockDialNode.f8482u, DelegatableNodeKt.f(clockDialNode).f15959u.y1(TimePickerKt.f12327h), clockDialNode.f8483v);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, g gVar) {
        super(2, gVar);
        this.f8486c = clockDialNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.f8486c, gVar);
        clockDialNode$pointerInputDragNode$1.f8485b = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ClockDialNode$pointerInputDragNode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object f2;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f8484a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f8485b;
            ClockDialNode clockDialNode = this.f8486c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(clockDialNode);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(clockDialNode);
            this.f8484a = 1;
            f2 = DragGestureDetectorKt.f(pointerInputScope, DragGestureDetectorKt$detectDragGestures$2.f3227a, anonymousClass1, DragGestureDetectorKt$detectDragGestures$4.f3228a, anonymousClass2, this);
            if (f2 == aVar) {
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
