package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import d0.b0;
import e1.i;
import q0.l;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DatePickerKt$updateDisplayedMonth$3<T> implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f9032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9034c;
    public final /* synthetic */ g d;

    public DatePickerKt$updateDisplayedMonth$3(LazyListState lazyListState, l lVar, CalendarModel calendarModel, g gVar) {
        this.f9032a = lazyListState;
        this.f9033b = lVar;
        this.f9034c = calendarModel;
        this.d = gVar;
    }

    @Override // e1.i
    public final Object emit(Object obj, h0.g gVar) {
        ((Number) obj).intValue();
        LazyListState lazyListState = this.f9032a;
        int g2 = lazyListState.g() / 12;
        int g3 = (lazyListState.g() % 12) + 1;
        this.f9033b.invoke(new Long(this.f9034c.e(this.d.f31406a + g2, g3).e));
        return b0.f30125a;
    }
}
