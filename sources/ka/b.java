package ka;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements c {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20529b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f10 += ((b) cVar).f20529b;
        }
        this.a = cVar;
        this.f20529b = f10;
    }

    @Override // ka.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f20529b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a.equals(bVar.a) && this.f20529b == bVar.f20529b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f20529b)});
    }
}
