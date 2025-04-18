package y3;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class h {
    public static final g a = new g(0);

    /* renamed from: b, reason: collision with root package name */
    public static final g f27908b = new g(1);

    /* renamed from: c, reason: collision with root package name */
    public static final g f27909c = new g(2);

    /* renamed from: d, reason: collision with root package name */
    public static final g f27910d = new g(3);

    /* renamed from: e, reason: collision with root package name */
    public static final float f27911e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = (PathMeasure) a.get();
        Path path2 = (Path) f27908b.get();
        Path path3 = (Path) f27909c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f10 != 1.0f || f11 != 0.0f) && length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < 0.0f) {
                min = f.c(min, length);
            }
            if (max < 0.0f) {
                max = f.c(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f27910d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f27911e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }
}
