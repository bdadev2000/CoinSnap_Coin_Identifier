package R3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2681a;

    public h(float f9) {
        this.f2681a = f9;
    }

    @Override // R3.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f2681a == ((h) obj).f2681a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2681a)});
    }
}
