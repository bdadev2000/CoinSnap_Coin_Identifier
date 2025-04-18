package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import b1.d0;
import d0.b0;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes4.dex */
final class DatePickerKt$DatePickerContent$1$4$2$2$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f8821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f8822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyListState f8823c;
    public final /* synthetic */ g d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f8824f;

    @e(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1$1", f = "DatePicker.kt", l = {1577}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f8825a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyListState f8826b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f8827c;
        public final /* synthetic */ g d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f8828f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, int i2, g gVar, CalendarMonth calendarMonth, h0.g gVar2) {
            super(2, gVar2);
            this.f8826b = lazyListState;
            this.f8827c = i2;
            this.d = gVar;
            this.f8828f = calendarMonth;
        }

        @Override // j0.a
        public final h0.g create(Object obj, h0.g gVar) {
            return new AnonymousClass1(this.f8826b, this.f8827c, this.d, this.f8828f, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f8825a;
            if (i2 == 0) {
                q.m(obj);
                int i3 = (((this.f8827c - this.d.f31406a) * 12) + this.f8828f.f12948b) - 1;
                this.f8825a = 1;
                if (LazyListState.j(this.f8826b, i3, this) == aVar) {
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
    public DatePickerKt$DatePickerContent$1$4$2$2$1$1(d0 d0Var, MutableState mutableState, LazyListState lazyListState, g gVar, CalendarMonth calendarMonth) {
        super(1);
        this.f8821a = d0Var;
        this.f8822b = mutableState;
        this.f8823c = lazyListState;
        this.d = gVar;
        this.f8824f = calendarMonth;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        float f2 = DatePickerKt.f8765a;
        this.f8822b.setValue(Boolean.valueOf(!((Boolean) r7.getValue()).booleanValue()));
        kotlin.jvm.internal.e.v(this.f8821a, null, 0, new AnonymousClass1(this.f8823c, intValue, this.d, this.f8824f, null), 3);
        return b0.f30125a;
    }
}
