package kotlin.ranges;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    private final double _endInclusive;
    private final double _start;

    public ClosedDoubleRange(double d10, double d11) {
        this._start = d10;
        this._endInclusive = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(Object other) {
        boolean z10;
        boolean z11;
        if (!(other instanceof ClosedDoubleRange)) {
            return false;
        }
        if (!isEmpty() || !((ClosedDoubleRange) other).isEmpty()) {
            ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) other;
            if (this._start == closedDoubleRange._start) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (this._endInclusive == closedDoubleRange._endInclusive) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this._start) * 31) + Double.hashCode(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(double a, double b3) {
        return a <= b3;
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    public boolean contains(double value) {
        return value >= this._start && value <= this._endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    public Double getEndInclusive() {
        return Double.valueOf(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Double d10, Double d11) {
        return lessThanOrEquals(d10.doubleValue(), d11.doubleValue());
    }
}
