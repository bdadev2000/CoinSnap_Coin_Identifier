package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class DateRangePickerKt$customScrollActions$scrollDownAction$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f9195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9196b;

    @e(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", l = {1040}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9197a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyListState f9198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, g gVar) {
            super(2, gVar);
            this.f9198b = lazyListState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9198b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9197a;
            if (i2 == 0) {
                q.m(obj);
                LazyListState lazyListState = this.f9198b;
                int g2 = lazyListState.g() + 1;
                this.f9197a = 1;
                if (LazyListState.j(lazyListState, g2, this) == aVar) {
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
    public DateRangePickerKt$customScrollActions$scrollDownAction$1(LazyListState lazyListState, d0 d0Var) {
        super(0);
        this.f9195a = lazyListState;
        this.f9196b = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyListState lazyListState = this.f9195a;
        boolean z2 = false;
        if (lazyListState.d()) {
            kotlin.jvm.internal.e.v(this.f9196b, null, 0, new AnonymousClass1(lazyListState, null), 3);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
