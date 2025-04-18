package n4;

import android.graphics.Bitmap;
import g4.g0;

/* loaded from: classes.dex */
public abstract class e implements e4.q {
    @Override // e4.q
    public final g0 a(com.bumptech.glide.g gVar, g0 g0Var, int i10, int i11) {
        if (w4.m.h(i10, i11)) {
            h4.d dVar = com.bumptech.glide.b.a(gVar).f9606b;
            Bitmap bitmap = (Bitmap) g0Var.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(dVar, bitmap, i10, i11);
            if (!bitmap.equals(c10)) {
                return d.b(c10, dVar);
            }
            return g0Var;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Cannot apply transformation on width: ", i10, " or height: ", i11, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap c(h4.d dVar, Bitmap bitmap, int i10, int i11);
}
