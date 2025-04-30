package R3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f2641a;
    public final float b;

    public b(float f9, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2641a;
            f9 += ((b) cVar).b;
        }
        this.f2641a = cVar;
        this.b = f9;
    }

    @Override // R3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2641a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2641a.equals(bVar.f2641a) && this.b == bVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2641a, Float.valueOf(this.b)});
    }
}
