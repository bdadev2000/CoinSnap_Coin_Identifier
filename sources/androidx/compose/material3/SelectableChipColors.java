package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes2.dex */
public final class SelectableChipColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f11152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11153b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11154c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11155f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11156g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11157h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11158i;

    /* renamed from: j, reason: collision with root package name */
    public final long f11159j;

    /* renamed from: k, reason: collision with root package name */
    public final long f11160k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11161l;

    /* renamed from: m, reason: collision with root package name */
    public final long f11162m;

    public SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f11152a = j2;
        this.f11153b = j3;
        this.f11154c = j4;
        this.d = j5;
        this.e = j6;
        this.f11155f = j7;
        this.f11156g = j8;
        this.f11157h = j9;
        this.f11158i = j10;
        this.f11159j = j11;
        this.f11160k = j12;
        this.f11161l = j13;
        this.f11162m = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        return Color.c(this.f11152a, selectableChipColors.f11152a) && Color.c(this.f11153b, selectableChipColors.f11153b) && Color.c(this.f11154c, selectableChipColors.f11154c) && Color.c(this.d, selectableChipColors.d) && Color.c(this.e, selectableChipColors.e) && Color.c(this.f11155f, selectableChipColors.f11155f) && Color.c(this.f11156g, selectableChipColors.f11156g) && Color.c(this.f11157h, selectableChipColors.f11157h) && Color.c(this.f11158i, selectableChipColors.f11158i) && Color.c(this.f11159j, selectableChipColors.f11159j) && Color.c(this.f11160k, selectableChipColors.f11160k) && Color.c(this.f11161l, selectableChipColors.f11161l) && Color.c(this.f11162m, selectableChipColors.f11162m);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f11162m) + d.d(this.f11161l, d.d(this.f11160k, d.d(this.f11159j, d.d(this.f11158i, d.d(this.f11157h, d.d(this.f11156g, d.d(this.f11155f, d.d(this.e, d.d(this.d, d.d(this.f11154c, d.d(this.f11153b, Long.hashCode(this.f11152a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
