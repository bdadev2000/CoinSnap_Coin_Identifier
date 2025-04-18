package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import w0.g;

@Stable
/* loaded from: classes.dex */
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f9035f;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public DatePickerStateImpl(Long l2, Long l3, g gVar, int i2) {
        super(l3, gVar);
        CalendarDate calendarDate;
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        if (l2 != null) {
            calendarDate = this.f7911c.b(l2.longValue());
            int i3 = calendarDate.f12941a;
            if (!gVar.c(i3)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i3 + ") is out of the years range of " + gVar + '.').toString());
            }
        } else {
            calendarDate = null;
        }
        f2 = SnapshotStateKt.f(calendarDate, StructuralEqualityPolicy.f14078a);
        this.e = f2;
        f3 = SnapshotStateKt.f(new DisplayMode(i2), StructuralEqualityPolicy.f14078a);
        this.f9035f = f3;
    }

    @Override // androidx.compose.material3.DatePickerState
    public final void d(int i2) {
        Long i3 = i();
        if (i3 != null) {
            a(this.f7911c.f(i3.longValue()).e);
        }
        this.f9035f.setValue(new DisplayMode(i2));
    }

    @Override // androidx.compose.material3.DatePickerState
    public final int e() {
        return ((DisplayMode) this.f9035f.getValue()).f9223a;
    }

    @Override // androidx.compose.material3.DatePickerState
    public final Long i() {
        CalendarDate calendarDate = (CalendarDate) this.e.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.d);
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    public final void k(Long l2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.e;
        if (l2 == null) {
            parcelableSnapshotMutableState.setValue(null);
            return;
        }
        CalendarDate b2 = this.f7911c.b(l2.longValue());
        g gVar = this.f7909a;
        int i2 = b2.f12941a;
        if (gVar.c(i2)) {
            parcelableSnapshotMutableState.setValue(b2);
            return;
        }
        throw new IllegalArgumentException(("The provided date's year (" + i2 + ") is out of the years range of " + gVar + '.').toString());
    }
}
