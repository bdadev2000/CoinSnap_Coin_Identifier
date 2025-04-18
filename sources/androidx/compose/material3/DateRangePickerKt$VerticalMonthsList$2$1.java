package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.SnapshotStateKt;
import b1.d0;
import d0.b0;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;
import w0.g;

@e(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {841}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DateRangePickerKt$VerticalMonthsList$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f9182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f9183c;
    public final /* synthetic */ CalendarModel d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f9184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$2$1(LazyListState lazyListState, l lVar, CalendarModel calendarModel, g gVar, h0.g gVar2) {
        super(2, gVar2);
        this.f9182b = lazyListState;
        this.f9183c = lVar;
        this.d = calendarModel;
        this.f9184f = gVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.f9182b, this.f9183c, this.d, this.f9184f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DateRangePickerKt$VerticalMonthsList$2$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9181a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            this.f9181a = 1;
            float f2 = DatePickerKt.f8765a;
            LazyListState lazyListState = this.f9182b;
            Object collect = SnapshotStateKt.l(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new DatePickerKt$updateDisplayedMonth$3(lazyListState, this.f9183c, this.d, this.f9184f), this);
            if (collect != aVar) {
                collect = b0Var;
            }
            if (collect == aVar) {
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
