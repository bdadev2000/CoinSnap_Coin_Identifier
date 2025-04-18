package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class DatePickerKt$customScrollActions$scrollUpAction$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f9027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9028b;

    @e(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", f = "DatePicker.kt", l = {2222}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9029a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyGridState f9030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyGridState lazyGridState, g gVar) {
            super(2, gVar);
            this.f9030b = lazyGridState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f9030b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f9029a;
            if (i2 == 0) {
                q.m(obj);
                LazyGridState lazyGridState = this.f9030b;
                int g2 = lazyGridState.g() - 3;
                this.f9029a = 1;
                if (LazyGridState.j(lazyGridState, g2, this) == aVar) {
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
    public DatePickerKt$customScrollActions$scrollUpAction$1(LazyGridState lazyGridState, d0 d0Var) {
        super(0);
        this.f9027a = lazyGridState;
        this.f9028b = d0Var;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyGridState lazyGridState = this.f9027a;
        boolean z2 = false;
        if (lazyGridState.c()) {
            kotlin.jvm.internal.e.v(this.f9028b, null, 0, new AnonymousClass1(lazyGridState, null), 3);
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
