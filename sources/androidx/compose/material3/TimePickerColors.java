package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class TimePickerColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f12310a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12311b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12312c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12313f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12314g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12315h;

    /* renamed from: i, reason: collision with root package name */
    public final long f12316i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12317j;

    /* renamed from: k, reason: collision with root package name */
    public final long f12318k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12319l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12320m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12321n;

    public TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f12310a = j2;
        this.f12311b = j3;
        this.f12312c = j4;
        this.d = j5;
        this.e = j6;
        this.f12313f = j7;
        this.f12314g = j8;
        this.f12315h = j9;
        this.f12316i = j10;
        this.f12317j = j11;
        this.f12318k = j12;
        this.f12319l = j13;
        this.f12320m = j14;
        this.f12321n = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimePickerColors.class != obj.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        return Color.c(this.f12310a, timePickerColors.f12310a) && Color.c(this.f12311b, timePickerColors.f12311b) && Color.c(this.f12312c, timePickerColors.f12312c) && Color.c(this.d, timePickerColors.d) && Color.c(this.f12314g, timePickerColors.f12314g) && Color.c(this.f12315h, timePickerColors.f12315h) && Color.c(this.f12316i, timePickerColors.f12316i) && Color.c(this.f12317j, timePickerColors.f12317j) && Color.c(this.f12318k, timePickerColors.f12318k) && Color.c(this.f12319l, timePickerColors.f12319l) && Color.c(this.f12320m, timePickerColors.f12320m) && Color.c(this.f12321n, timePickerColors.f12321n);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f12321n) + d.d(this.f12320m, d.d(this.f12319l, d.d(this.f12318k, d.d(this.f12317j, d.d(this.f12316i, d.d(this.f12315h, d.d(this.f12314g, d.d(this.d, d.d(this.f12312c, d.d(this.f12311b, Long.hashCode(this.f12310a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
