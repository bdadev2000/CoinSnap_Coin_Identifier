package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;

@RestrictTo
/* loaded from: classes2.dex */
public class AnimatorInflaterCompat {

    /* loaded from: classes2.dex */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f21665a;

        @Override // android.animation.TypeEvaluator
        public final PathParser.PathDataNode[] evaluate(float f2, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.a(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.a(this.f21665a, pathDataNodeArr3)) {
                this.f21665a = PathParser.e(pathDataNodeArr3);
            }
            for (int i2 = 0; i2 < pathDataNodeArr3.length; i2++) {
                PathParser.PathDataNode pathDataNode = this.f21665a[i2];
                PathParser.PathDataNode pathDataNode2 = pathDataNodeArr3[i2];
                PathParser.PathDataNode pathDataNode3 = pathDataNodeArr4[i2];
                pathDataNode.getClass();
                pathDataNode.f18537a = pathDataNode2.f18537a;
                int i3 = 0;
                while (true) {
                    float[] fArr = pathDataNode2.f18538b;
                    if (i3 < fArr.length) {
                        pathDataNode.f18538b[i3] = (pathDataNode3.f18538b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                        i3++;
                    }
                }
            }
            return this.f21665a;
        }
    }
}
