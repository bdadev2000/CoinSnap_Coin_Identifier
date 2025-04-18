package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", f = "TimePicker.kt", l = {1439}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ClockDialNode$pointerInputTapNode$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8494a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClockDialNode f8496c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements q {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ long f8497a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClockDialNode f8498b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClockDialNode clockDialNode, g gVar) {
            super(3, gVar);
            this.f8498b = clockDialNode;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j2 = ((Offset) obj2).f14913a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8498b, (g) obj3);
            anonymousClass1.f8497a = j2;
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            kotlin.jvm.internal.q.m(obj);
            long j2 = this.f8497a;
            float g2 = Offset.g(j2);
            ClockDialNode clockDialNode = this.f8498b;
            clockDialNode.f8481t = g2;
            clockDialNode.f8482u = Offset.h(j2);
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ClockDialNode f8499a;

        @e(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1446}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass1 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f8500a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ClockDialNode f8501b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f8502c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ClockDialNode clockDialNode, long j2, g gVar) {
                super(2, gVar);
                this.f8501b = clockDialNode;
                this.f8502c = j2;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass1(this.f8501b, this.f8502c, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f8500a;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    ClockDialNode clockDialNode = this.f8501b;
                    AnalogTimePickerState analogTimePickerState = clockDialNode.f8478q;
                    long j2 = this.f8502c;
                    float g2 = Offset.g(j2);
                    float h2 = Offset.h(j2);
                    float y1 = DelegatableNodeKt.f(clockDialNode).f15959u.y1(TimePickerKt.f12327h);
                    boolean z2 = clockDialNode.f8479r;
                    long j3 = clockDialNode.f8483v;
                    this.f8500a = 1;
                    if (TimePickerKt.q(analogTimePickerState, g2, h2, y1, z2, j3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.q.m(obj);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClockDialNode clockDialNode) {
            super(1);
            this.f8499a = clockDialNode;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((Offset) obj).f14913a;
            ClockDialNode clockDialNode = this.f8499a;
            kotlin.jvm.internal.e.v(clockDialNode.S1(), null, 0, new AnonymousClass1(clockDialNode, j2, null), 3);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, g gVar) {
        super(2, gVar);
        this.f8496c = clockDialNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.f8496c, gVar);
        clockDialNode$pointerInputTapNode$1.f8495b = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ClockDialNode$pointerInputTapNode$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f8494a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f8495b;
            ClockDialNode clockDialNode = this.f8496c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(clockDialNode, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(clockDialNode);
            this.f8494a = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, anonymousClass1, anonymousClass2, this, 3) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
