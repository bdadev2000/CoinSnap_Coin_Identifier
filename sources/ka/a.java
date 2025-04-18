package ka;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements c {
    public final float a;

    public a(float f10) {
        this.a = f10;
    }

    @Override // ka.c
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
