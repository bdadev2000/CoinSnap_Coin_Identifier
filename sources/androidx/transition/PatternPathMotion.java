package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes4.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a, reason: collision with root package name */
    public final Path f21584a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f21585b;

    public PatternPathMotion(Path path) {
        Path path2 = new Path();
        this.f21584a = path2;
        Matrix matrix = new Matrix();
        this.f21585b = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f2 = fArr[0];
        float f3 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f4 = fArr[0];
        float f5 = fArr[1];
        if (f4 == f2 && f5 == f3) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f4, -f5);
        float f6 = f3 - f5;
        float sqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (r4 * r4)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f2 - f4)));
        path.transform(matrix, path2);
    }

    @Override // androidx.transition.PathMotion
    public final Path getPath(float f2, float f3, float f4, float f5) {
        float f6 = f5 - f3;
        float sqrt = (float) Math.sqrt((f6 * f6) + (r6 * r6));
        double atan2 = Math.atan2(f6, f4 - f2);
        Matrix matrix = this.f21585b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f2, f3);
        Path path = new Path();
        this.f21584a.transform(matrix, path);
        return path;
    }
}
