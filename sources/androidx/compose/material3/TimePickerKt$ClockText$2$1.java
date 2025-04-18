package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$ClockText$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f12368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f12369c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableState f12371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableState f12372h;

    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f12373a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnalogTimePickerState f12374b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f12375c;
        public final /* synthetic */ boolean d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableState f12376f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState f12377g;

        @e(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1674}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00461 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f12378a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalogTimePickerState f12379b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f12380c;
            public final /* synthetic */ boolean d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MutableState f12381f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ MutableState f12382g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00461(AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2, g gVar) {
                super(2, gVar);
                this.f12379b = analogTimePickerState;
                this.f12380c = f2;
                this.d = z2;
                this.f12381f = mutableState;
                this.f12382g = mutableState2;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00461(this.f12379b, this.f12380c, this.d, this.f12381f, this.f12382g, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00461) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f12378a;
                if (i2 == 0) {
                    q.m(obj);
                    AnalogTimePickerState analogTimePickerState = this.f12379b;
                    float f2 = TimePickerKt.f12322a;
                    MutableState mutableState = this.f12381f;
                    float g2 = Offset.g(((Offset) mutableState.getValue()).f14913a);
                    float h2 = Offset.h(((Offset) mutableState.getValue()).f14913a);
                    float f3 = this.f12380c;
                    boolean z2 = this.d;
                    long j2 = ((IntOffset) this.f12382g.getValue()).f17489a;
                    this.f12378a = 1;
                    if (TimePickerKt.q(analogTimePickerState, g2, h2, f3, z2, j2, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2) {
            super(0);
            this.f12373a = d0Var;
            this.f12374b = analogTimePickerState;
            this.f12375c = f2;
            this.d = z2;
            this.f12376f = mutableState;
            this.f12377g = mutableState2;
        }

        @Override // q0.a
        public final Object invoke() {
            kotlin.jvm.internal.e.v(this.f12373a, null, 0, new C00461(this.f12374b, this.f12375c, this.d, this.f12376f, this.f12377g, null), 3);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1(boolean z2, d0 d0Var, AnalogTimePickerState analogTimePickerState, float f2, boolean z3, MutableState mutableState, MutableState mutableState2) {
        super(1);
        this.f12367a = z2;
        this.f12368b = d0Var;
        this.f12369c = analogTimePickerState;
        this.d = f2;
        this.f12370f = z3;
        this.f12371g = mutableState;
        this.f12372h = mutableState2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, new AnonymousClass1(this.f12368b, this.f12369c, this.d, this.f12370f, this.f12371g, this.f12372h));
        SemanticsPropertiesKt.s(semanticsPropertyReceiver, this.f12367a);
        return b0.f30125a;
    }
}
