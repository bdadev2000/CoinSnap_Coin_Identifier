package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;

@Immutable
/* loaded from: classes3.dex */
public final class ChipElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f8239a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8240b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8241c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8242f;

    public ChipElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f8239a = f2;
        this.f8240b = f3;
        this.f8241c = f4;
        this.d = f5;
        this.e = f6;
        this.f8242f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipElevation)) {
            return false;
        }
        ChipElevation chipElevation = (ChipElevation) obj;
        return Dp.a(this.f8239a, chipElevation.f8239a) && Dp.a(this.f8240b, chipElevation.f8240b) && Dp.a(this.f8241c, chipElevation.f8241c) && Dp.a(this.d, chipElevation.d) && Dp.a(this.f8242f, chipElevation.f8242f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8242f) + d.b(this.d, d.b(this.f8241c, d.b(this.f8240b, Float.hashCode(this.f8239a) * 31, 31), 31), 31);
    }
}
