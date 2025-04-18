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

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1678}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DatePickerKt$HorizontalMonthsList$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f8891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8892c;
    public final /* synthetic */ CalendarModel d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$2$1(LazyListState lazyListState, l lVar, CalendarModel calendarModel, g gVar, h0.g gVar2) {
        super(2, gVar2);
        this.f8891b = lazyListState;
        this.f8892c = lVar;
        this.d = calendarModel;
        this.f8893f = gVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.f8891b, this.f8892c, this.d, this.f8893f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DatePickerKt$HorizontalMonthsList$2$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f8890a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            this.f8890a = 1;
            float f2 = DatePickerKt.f8765a;
            LazyListState lazyListState = this.f8891b;
            Object collect = SnapshotStateKt.l(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new DatePickerKt$updateDisplayedMonth$3(lazyListState, this.f8892c, this.d, this.f8893f), this);
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
