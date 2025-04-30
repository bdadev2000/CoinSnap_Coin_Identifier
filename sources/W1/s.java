package W1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3596a = new Object();

    public static C0320d a(Q1.a aVar, Drawable drawable, int i9, int i10) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z8 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i9 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i10 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i9 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i10 = current.getIntrinsicHeight();
                }
                Lock lock = A.b;
                lock.lock();
                Bitmap k6 = aVar.k(i9, i10, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(k6);
                    current.setBounds(0, 0, i9, i10);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = k6;
                    z8 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z8 = true;
        } else {
            bitmap = null;
        }
        if (!z8) {
            aVar = f3596a;
        }
        return C0320d.b(aVar, bitmap);
    }
}
