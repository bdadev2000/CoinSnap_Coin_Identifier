package androidx.compose.material3;

import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
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

/* renamed from: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DatePickerKt$lambda4$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$DatePickerKt$lambda4$1 f8603a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ImageVector imageVector = KeyboardArrowRightKt.f7367a;
            if (imageVector == null) {
                ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i2 = VectorKt.f15465a;
                SolidColor solidColor = new SolidColor(Color.f14957b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.f(8.59f, 16.59f);
                pathBuilder.d(13.17f, 12.0f);
                pathBuilder.d(8.59f, 7.41f);
                pathBuilder.d(10.0f, 6.0f);
                pathBuilder.e(6.0f, 6.0f);
                pathBuilder.e(-6.0f, 6.0f);
                pathBuilder.e(-1.41f, -1.41f);
                pathBuilder.a();
                builder.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.f15330a);
                imageVector = builder.d();
                KeyboardArrowRightKt.f7367a = imageVector;
            }
            IconKt.b(imageVector, Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_switch_to_next_month, composer), null, 0L, composer, 0, 12);
        }
        return b0.f30125a;
    }
}
