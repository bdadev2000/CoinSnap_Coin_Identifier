package R3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2640a;

    public a(float f9) {
        this.f2640a = f9;
    }

    @Override // R3.c
    public final float a(RectF rectF) {
        return this.f2640a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f2640a == ((a) obj).f2640a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2640a)});
    }
}
