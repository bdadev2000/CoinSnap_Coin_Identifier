package W1;

import android.content.Context;
import android.graphics.Bitmap;
import x0.AbstractC2914a;

/* renamed from: W1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0321e implements N1.m {
    @Override // N1.m
    public final P1.B a(Context context, P1.B b, int i9, int i10) {
        if (j2.n.i(i9, i10)) {
            Q1.a aVar = com.bumptech.glide.b.a(context).b;
            Bitmap bitmap = (Bitmap) b.get();
            if (i9 == Integer.MIN_VALUE) {
                i9 = bitmap.getWidth();
            }
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getHeight();
            }
            Bitmap c9 = c(aVar, bitmap, i9, i10);
            if (!bitmap.equals(c9)) {
                return C0320d.b(aVar, c9);
            }
            return b;
        }
        throw new IllegalArgumentException(AbstractC2914a.c(i9, i10, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap c(Q1.a aVar, Bitmap bitmap, int i9, int i10);
}
