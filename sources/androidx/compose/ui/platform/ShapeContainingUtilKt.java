package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes2.dex */
public final class ShapeContainingUtilKt {
    public static final boolean a(Outline outline, float f2, float f3, Path path, Path path2) {
        boolean c2;
        if (!(outline instanceof Outline.Rectangle)) {
            if (!(outline instanceof Outline.Rounded)) {
                if (outline instanceof Outline.Generic) {
                    return b(((Outline.Generic) outline).f15000a, f2, f3, path, path2);
                }
                throw new RuntimeException();
            }
            RoundRect roundRect = ((Outline.Rounded) outline).f15002a;
            if (f2 < roundRect.f14917a) {
                return false;
            }
            float f4 = roundRect.f14919c;
            if (f2 >= f4) {
                return false;
            }
            float f5 = roundRect.f14918b;
            if (f3 < f5) {
                return false;
            }
            float f6 = roundRect.d;
            if (f3 >= f6) {
                return false;
            }
            long j2 = roundRect.e;
            float b2 = CornerRadius.b(j2);
            long j3 = roundRect.f14920f;
            if (CornerRadius.b(j3) + b2 <= roundRect.b()) {
                long j4 = roundRect.f14922h;
                float b3 = CornerRadius.b(j4);
                long j5 = roundRect.f14921g;
                if (CornerRadius.b(j5) + b3 <= roundRect.b()) {
                    if (CornerRadius.c(j4) + CornerRadius.c(j2) <= roundRect.a()) {
                        if (CornerRadius.c(j5) + CornerRadius.c(j3) <= roundRect.a()) {
                            float b4 = CornerRadius.b(j2);
                            float f7 = roundRect.f14917a;
                            float f8 = b4 + f7;
                            float c3 = CornerRadius.c(j2) + f5;
                            float b5 = f4 - CornerRadius.b(j3);
                            float c4 = CornerRadius.c(j3) + f5;
                            float b6 = f4 - CornerRadius.b(j5);
                            float c5 = f6 - CornerRadius.c(j5);
                            float c6 = f6 - CornerRadius.c(j4);
                            float b7 = f7 + CornerRadius.b(j4);
                            if (f2 < f8 && f3 < c3) {
                                c2 = c(f2, f3, f8, c3, roundRect.e);
                            } else if (f2 < b7 && f3 > c6) {
                                c2 = c(f2, f3, b7, c6, roundRect.f14922h);
                            } else if (f2 > b5 && f3 < c4) {
                                c2 = c(f2, f3, b5, c4, roundRect.f14920f);
                            } else if (f2 > b6 && f3 > c5) {
                                c2 = c(f2, f3, b6, c5, roundRect.f14921g);
                            }
                            return c2;
                        }
                    }
                }
            }
            Path a2 = path2 == null ? AndroidPath_androidKt.a() : path2;
            a2.v(roundRect, Path.Direction.f15004a);
            return b(a2, f2, f3, path, path2);
        }
        Rect rect = ((Outline.Rectangle) outline).f15001a;
        if (rect.f14914a > f2 || f2 >= rect.f14916c || rect.f14915b > f3 || f3 >= rect.d) {
            return false;
        }
        return true;
    }

    public static final boolean b(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.a();
        }
        path2.i(rect, Path.Direction.f15004a);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.a();
        }
        path3.q(path, path2, 1);
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    public static final boolean c(float f2, float f3, float f4, float f5, long j2) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float b2 = CornerRadius.b(j2);
        float c2 = CornerRadius.c(j2);
        return ((f7 * f7) / (c2 * c2)) + ((f6 * f6) / (b2 * b2)) <= 1.0f;
    }
}
