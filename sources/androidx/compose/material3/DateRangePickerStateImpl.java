package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import w0.g;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f9203f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f9204g;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public DateRangePickerStateImpl(Long l2, Long l3, Long l4, g gVar, int i2) {
        super(l4, gVar);
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.e = f2;
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f9203f = f3;
        h(l2, l3);
        f4 = SnapshotStateKt.f(new DisplayMode(i2), StructuralEqualityPolicy.f14078a);
        this.f9204g = f4;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public final void d(int i2) {
        Long j2 = j();
        if (j2 != null) {
            a(this.f7911c.f(j2.longValue()).e);
        }
        this.f9204g.setValue(new DisplayMode(i2));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public final int e() {
        return ((DisplayMode) this.f9204g.getValue()).f9223a;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public final Long g() {
        CalendarDate calendarDate = (CalendarDate) this.f9203f.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.d);
        }
        return null;
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public final void h(Long l2, Long l3) {
        CalendarModelImpl calendarModelImpl = this.f7911c;
        CalendarDate b2 = l2 != null ? calendarModelImpl.b(l2.longValue()) : null;
        CalendarDate b3 = l3 != null ? calendarModelImpl.b(l3.longValue()) : null;
        g gVar = this.f7909a;
        if (b2 != null) {
            int i2 = b2.f12941a;
            if (!gVar.c(i2)) {
                throw new IllegalArgumentException(("The provided start date year (" + i2 + ") is out of the years range of " + gVar + '.').toString());
            }
        }
        if (b3 != null) {
            int i3 = b3.f12941a;
            if (!gVar.c(i3)) {
                throw new IllegalArgumentException(("The provided end date year (" + i3 + ") is out of the years range of " + gVar + '.').toString());
            }
        }
        if (b3 != null) {
            if (b2 == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.".toString());
            }
            if (b2.d > b3.d) {
                throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
            }
        }
        this.e.setValue(b2);
        this.f9203f.setValue(b3);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public final Long j() {
        CalendarDate calendarDate = (CalendarDate) this.e.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.d);
        }
        return null;
    }
}
