package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$DatePickerContent$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f8803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f8804b;

    @e(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1$1$1", f = "DatePicker.kt", l = {1507}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f8805a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyListState f8806b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, g gVar) {
            super(2, gVar);
            this.f8806b = lazyListState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f8806b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f8805a;
            b0 b0Var = b0.f30125a;
            try {
                if (i2 == 0) {
                    q.m(obj);
                    LazyListState lazyListState = this.f8806b;
                    int g2 = lazyListState.g() + 1;
                    this.f8805a = 1;
                    Object a2 = LazyAnimateScrollKt.a(g2, 0, lazyListState.e, ((LazyListMeasureResult) lazyListState.f4394f.getValue()).f4353h, this);
                    if (a2 != aVar) {
                        a2 = b0Var;
                    }
                    if (a2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$1$1(LazyListState lazyListState, d0 d0Var) {
        super(0);
        this.f8803a = d0Var;
        this.f8804b = lazyListState;
    }

    @Override // q0.a
    public final Object invoke() {
        kotlin.jvm.internal.e.v(this.f8803a, null, 0, new AnonymousClass1(this.f8804b, null), 3);
        return b0.f30125a;
    }
}
