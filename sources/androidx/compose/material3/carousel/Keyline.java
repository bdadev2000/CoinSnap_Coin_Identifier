package androidx.compose.material3.carousel;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class Keyline {

    /* renamed from: a, reason: collision with root package name */
    public final float f12721a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12722b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12723c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12724f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12725g;

    public Keyline(float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5) {
        this.f12721a = f2;
        this.f12722b = f3;
        this.f12723c = f4;
        this.d = z2;
        this.e = z3;
        this.f12724f = z4;
        this.f12725g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.f12721a, keyline.f12721a) == 0 && Float.compare(this.f12722b, keyline.f12722b) == 0 && Float.compare(this.f12723c, keyline.f12723c) == 0 && this.d == keyline.d && this.e == keyline.e && this.f12724f == keyline.f12724f && Float.compare(this.f12725g, keyline.f12725g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12725g) + d.g(this.f12724f, d.g(this.e, d.g(this.d, d.b(this.f12723c, d.b(this.f12722b, Float.hashCode(this.f12721a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.f12721a);
        sb.append(", offset=");
        sb.append(this.f12722b);
        sb.append(", unadjustedOffset=");
        sb.append(this.f12723c);
        sb.append(", isFocal=");
        sb.append(this.d);
        sb.append(", isAnchor=");
        sb.append(this.e);
        sb.append(", isPivot=");
        sb.append(this.f12724f);
        sb.append(", cutoff=");
        return d.n(sb, this.f12725g, ')');
    }
}
