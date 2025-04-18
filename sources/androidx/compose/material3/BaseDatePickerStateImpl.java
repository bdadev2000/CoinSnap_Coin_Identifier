package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import w0.g;

@Stable
/* loaded from: classes.dex */
public abstract class BaseDatePickerStateImpl {

    /* renamed from: a, reason: collision with root package name */
    public final g f7909a;

    /* renamed from: b, reason: collision with root package name */
    public final SelectableDates f7910b = null;

    /* renamed from: c, reason: collision with root package name */
    public final CalendarModelImpl f7911c;
    public final ParcelableSnapshotMutableState d;

    public BaseDatePickerStateImpl(Long l2, g gVar) {
        CalendarMonth g2;
        ParcelableSnapshotMutableState f2;
        this.f7909a = gVar;
        CalendarModelImpl calendarModelImpl = new CalendarModelImpl(null);
        this.f7911c = calendarModelImpl;
        if (l2 != null) {
            g2 = calendarModelImpl.f(l2.longValue());
            int i2 = g2.f12947a;
            if (!gVar.c(i2)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i2 + ") is out of the years range of " + gVar + '.').toString());
            }
        } else {
            g2 = calendarModelImpl.g(calendarModelImpl.h());
        }
        f2 = SnapshotStateKt.f(g2, StructuralEqualityPolicy.f14078a);
        this.d = f2;
    }

    public final void a(long j2) {
        CalendarMonth f2 = this.f7911c.f(j2);
        g gVar = this.f7909a;
        int i2 = f2.f12947a;
        if (gVar.c(i2)) {
            this.d.setValue(f2);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + i2 + ") is out of the years range of " + gVar + '.').toString());
    }

    public final SelectableDates b() {
        return this.f7910b;
    }

    public final g c() {
        return this.f7909a;
    }

    public final long f() {
        return ((CalendarMonth) this.d.getValue()).e;
    }
}
