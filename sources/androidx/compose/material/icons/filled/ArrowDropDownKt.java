package androidx.compose.material.icons.filled;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;

/* loaded from: classes4.dex */
public final class ArrowDropDownKt {

    /* renamed from: a, reason: collision with root package name */
    public static ImageVector f7368a;

    public static final ImageVector a() {
        ImageVector imageVector = f7368a;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = VectorKt.f15465a;
        SolidColor solidColor = new SolidColor(Color.f14957b);
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.f(7.0f, 10.0f);
        pathBuilder.e(5.0f, 5.0f);
        pathBuilder.e(5.0f, -5.0f);
        pathBuilder.a();
        builder.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.f15330a);
        ImageVector d = builder.d();
        f7368a = d;
        return d;
    }
}
