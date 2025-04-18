package androidx.compose.material3;

import androidx.compose.material.icons.filled.DateRangeKt;
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

/* renamed from: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DatePickerKt$lambda2$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$DatePickerKt$lambda2$1 f8601a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ImageVector imageVector = DateRangeKt.f7371a;
            if (imageVector == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i2 = VectorKt.f15465a;
                SolidColor solidColor = new SolidColor(Color.f14957b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.f(9.0f, 11.0f);
                pathBuilder.d(7.0f, 11.0f);
                pathBuilder.g(2.0f);
                pathBuilder.c(2.0f);
                pathBuilder.g(-2.0f);
                pathBuilder.a();
                pathBuilder.f(13.0f, 11.0f);
                pathBuilder.c(-2.0f);
                pathBuilder.g(2.0f);
                pathBuilder.c(2.0f);
                pathBuilder.g(-2.0f);
                pathBuilder.a();
                pathBuilder.f(17.0f, 11.0f);
                pathBuilder.c(-2.0f);
                pathBuilder.g(2.0f);
                pathBuilder.c(2.0f);
                pathBuilder.g(-2.0f);
                pathBuilder.a();
                pathBuilder.f(19.0f, 4.0f);
                pathBuilder.c(-1.0f);
                pathBuilder.d(18.0f, 2.0f);
                pathBuilder.c(-2.0f);
                pathBuilder.g(2.0f);
                pathBuilder.d(8.0f, 4.0f);
                pathBuilder.d(8.0f, 2.0f);
                pathBuilder.d(6.0f, 2.0f);
                pathBuilder.g(2.0f);
                pathBuilder.d(5.0f, 4.0f);
                pathBuilder.b(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                pathBuilder.d(3.0f, 20.0f);
                pathBuilder.b(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                pathBuilder.c(14.0f);
                pathBuilder.b(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                pathBuilder.d(21.0f, 6.0f);
                pathBuilder.b(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                pathBuilder.a();
                pathBuilder.f(19.0f, 20.0f);
                pathBuilder.d(5.0f, 20.0f);
                pathBuilder.d(5.0f, 9.0f);
                pathBuilder.c(14.0f);
                pathBuilder.g(11.0f);
                pathBuilder.a();
                builder.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.f15330a);
                imageVector = builder.d();
                DateRangeKt.f7371a = imageVector;
            }
            IconKt.b(imageVector, Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_switch_to_calendar_mode, composer), null, 0L, composer, 0, 12);
        }
        return b0.f30125a;
    }
}
