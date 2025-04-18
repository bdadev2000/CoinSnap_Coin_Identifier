package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public final class ShapesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f11185a = new CompositionLocal(ShapesKt$LocalShapes$1.f11186a);

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final Shape a(ShapeKeyTokens shapeKeyTokens, Composer composer) {
        Shapes shapes = (Shapes) composer.K(f11185a);
        switch (shapeKeyTokens.ordinal()) {
            case 0:
                return shapes.e;
            case 1:
                return b(shapes.e);
            case 2:
                return shapes.f11182a;
            case 3:
                return b(shapes.f11182a);
            case 4:
                return RoundedCornerShapeKt.f5392a;
            case 5:
                return shapes.d;
            case 6:
                CornerBasedShape cornerBasedShape = shapes.d;
                float f2 = (float) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                return CornerBasedShape.c(cornerBasedShape, CornerSizeKt.a(f2), null, null, CornerSizeKt.a(f2), 6);
            case 7:
                return b(shapes.d);
            case 8:
                return shapes.f11184c;
            case 9:
                return RectangleShapeKt.f15014a;
            case 10:
                return shapes.f11183b;
            default:
                throw new RuntimeException();
        }
    }

    public static final CornerBasedShape b(CornerBasedShape cornerBasedShape) {
        float f2 = (float) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        return CornerBasedShape.c(cornerBasedShape, null, null, CornerSizeKt.a(f2), CornerSizeKt.a(f2), 3);
    }
}
