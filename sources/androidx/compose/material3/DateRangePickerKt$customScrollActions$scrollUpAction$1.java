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

/* loaded from: classes2.dex */
final class DateRangePickerKt$customScrollActions$scrollUpAction$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f9199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9200b;

    @e(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", l = {1032}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9201a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyListState f9202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, g gVar) {
            super(2, gVar);
            this.f9202b = lazyListState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9202b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9201a;
            if (i2 == 0) {
                q.m(obj);
                LazyListState lazyListState = this.f9202b;
                int g2 = lazyListState.g() - 1;
                this.f9201a = 1;
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
    public DateRangePickerKt$customScrollActions$scrollUpAction$1(LazyListState lazyListState, d0 d0Var) {
        super(0);
        this.f9199a = lazyListState;
        this.f9200b = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyListState lazyListState = this.f9199a;
        boolean z2 = false;
        if (lazyListState.c()) {
            kotlin.jvm.internal.e.v(this.f9200b, null, 0, new AnonymousClass1(lazyListState, null), 3);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
