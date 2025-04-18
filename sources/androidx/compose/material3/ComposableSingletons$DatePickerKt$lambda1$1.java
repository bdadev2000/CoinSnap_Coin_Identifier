package androidx.compose.material3;

import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import d0.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import q0.p;

/* renamed from: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DatePickerKt$lambda1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$DatePickerKt$lambda1$1 f8600a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ImageVector imageVector = EditKt.f7372a;
            if (imageVector == null) {
                ImageVector.Builder builder = new ImageVector.Builder("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i2 = VectorKt.f15465a;
                SolidColor solidColor = new SolidColor(Color.f14957b);
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.f(3.0f, 17.25f);
                ArrayList arrayList = pathBuilder.f15330a;
                arrayList.add(new PathNode.VerticalTo(21.0f));
                pathBuilder.c(3.75f);
                pathBuilder.d(17.81f, 9.94f);
                pathBuilder.e(-3.75f, -3.75f);
                pathBuilder.d(3.0f, 17.25f);
                pathBuilder.a();
                pathBuilder.f(20.71f, 7.04f);
                pathBuilder.b(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                pathBuilder.e(-2.34f, -2.34f);
                pathBuilder.b(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                pathBuilder.e(-1.83f, 1.83f);
                pathBuilder.e(3.75f, 3.75f);
                pathBuilder.e(1.83f, -1.83f);
                pathBuilder.a();
                builder.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", arrayList);
                imageVector = builder.d();
                EditKt.f7372a = imageVector;
            }
            IconKt.b(imageVector, Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_switch_to_input_mode, composer), null, 0L, composer, 0, 12);
        }
        return b0.f30125a;
    }
}
