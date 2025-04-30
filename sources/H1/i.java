package H1;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1367a = new h(0);
    public static final h b = new h(1);

    /* renamed from: c, reason: collision with root package name */
    public static final h f1368c = new h(2);

    /* renamed from: d, reason: collision with root package name */
    public static final h f1369d = new h(3);

    /* renamed from: e, reason: collision with root package name */
    public static final float f1370e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f9, float f10, float f11) {
        PathMeasure pathMeasure = (PathMeasure) f1367a.get();
        Path path2 = (Path) b.get();
        Path path3 = (Path) f1368c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f9 != 1.0f || f10 != 0.0f) && length >= 1.0f && Math.abs((f10 - f9) - 1.0f) >= 0.01d) {
            float f12 = f9 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = g.c(min, length);
                max = g.c(max, length);
            }
            if (min < 0.0f) {
                min = g.c(min, length);
            }
            if (max < 0.0f) {
                max = g.c(max, length);
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
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = (float[]) f1369d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f9 = f1370e;
        fArr[2] = f9;
        fArr[3] = f9;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }
}
