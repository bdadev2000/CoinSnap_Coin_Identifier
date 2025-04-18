package ka;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j implements c {
    public final float a;

    public j(float f10) {
        this.a = f10;
    }

    @Override // ka.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.a == ((j) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
