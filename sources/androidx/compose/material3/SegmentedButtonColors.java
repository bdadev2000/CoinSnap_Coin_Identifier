package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes.dex */
public final class SegmentedButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f11062a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11063b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11064c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11065f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11066g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11067h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11068i;

    /* renamed from: j, reason: collision with root package name */
    public final long f11069j;

    /* renamed from: k, reason: collision with root package name */
    public final long f11070k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11071l;

    public SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f11062a = j2;
        this.f11063b = j3;
        this.f11064c = j4;
        this.d = j5;
        this.e = j6;
        this.f11065f = j7;
        this.f11066g = j8;
        this.f11067h = j9;
        this.f11068i = j10;
        this.f11069j = j11;
        this.f11070k = j12;
        this.f11071l = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SegmentedButtonColors.class != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        return Color.c(this.f11064c, segmentedButtonColors.f11064c) && Color.c(this.f11063b, segmentedButtonColors.f11063b) && Color.c(this.f11062a, segmentedButtonColors.f11062a) && Color.c(this.f11065f, segmentedButtonColors.f11065f) && Color.c(this.e, segmentedButtonColors.e) && Color.c(this.d, segmentedButtonColors.d) && Color.c(this.f11068i, segmentedButtonColors.f11068i) && Color.c(this.f11067h, segmentedButtonColors.f11067h) && Color.c(this.f11066g, segmentedButtonColors.f11066g) && Color.c(this.f11071l, segmentedButtonColors.f11071l) && Color.c(this.f11070k, segmentedButtonColors.f11070k) && Color.c(this.f11069j, segmentedButtonColors.f11069j);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f11069j) + d.d(this.f11070k, d.d(this.f11071l, d.d(this.f11066g, d.d(this.f11067h, d.d(this.f11068i, d.d(this.d, d.d(this.e, d.d(this.f11065f, d.d(this.f11062a, d.d(this.f11063b, Long.hashCode(this.f11064c) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
