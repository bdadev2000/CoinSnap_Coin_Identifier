package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;

@Immutable
/* loaded from: classes2.dex */
public final class SelectableChipElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f11163a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11164b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11165c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11166f;

    public SelectableChipElevation(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f11163a = f2;
        this.f11164b = f3;
        this.f11165c = f4;
        this.d = f5;
        this.e = f6;
        this.f11166f = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        return Dp.a(this.f11163a, selectableChipElevation.f11163a) && Dp.a(this.f11164b, selectableChipElevation.f11164b) && Dp.a(this.f11165c, selectableChipElevation.f11165c) && Dp.a(this.d, selectableChipElevation.d) && Dp.a(this.f11166f, selectableChipElevation.f11166f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f11166f) + d.b(this.d, d.b(this.f11165c, d.b(this.f11164b, Float.hashCode(this.f11163a) * 31, 31), 31), 31);
    }
}
