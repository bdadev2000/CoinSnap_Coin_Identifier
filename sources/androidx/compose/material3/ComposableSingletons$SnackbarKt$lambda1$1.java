package androidx.compose.material3;

import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SnackbarKt$lambda1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$SnackbarKt$lambda1$1 f8637a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ImageVector imageVector = CloseKt.f7370a;
            if (imageVector == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i2 = VectorKt.f15465a;
                SolidColor solidColor = new SolidColor(Color.f14957b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.f(19.0f, 6.41f);
                pathBuilder.d(17.59f, 5.0f);
                pathBuilder.d(12.0f, 10.59f);
                pathBuilder.d(6.41f, 5.0f);
                pathBuilder.d(5.0f, 6.41f);
                pathBuilder.d(10.59f, 12.0f);
                pathBuilder.d(5.0f, 17.59f);
                pathBuilder.d(6.41f, 19.0f);
                pathBuilder.d(12.0f, 13.41f);
                pathBuilder.d(17.59f, 19.0f);
                pathBuilder.d(19.0f, 17.59f);
                pathBuilder.d(13.41f, 12.0f);
                pathBuilder.a();
                builder.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.f15330a);
                imageVector = builder.d();
                CloseKt.f7370a = imageVector;
            }
            IconKt.b(imageVector, Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_snackbar_dismiss, composer), null, 0L, composer, 0, 12);
        }
        return b0.f30125a;
    }
}
