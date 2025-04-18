package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$YearPickerMenuButton$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPickerMenuButton$1(p pVar, boolean z2) {
        super(3);
        this.f9016a = pVar;
        this.f9017b = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String a2;
        Composer composer = (Composer) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
            composer.A();
        } else {
            this.f9016a.invoke(composer, 0);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            SpacerKt.a(SizeKt.n(companion, ButtonDefaults.e), composer);
            ImageVector a3 = ArrowDropDownKt.a();
            boolean z2 = this.f9017b;
            if (z2) {
                composer.J(-1360891317);
                a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_switch_to_day_selection, composer);
                composer.D();
            } else {
                composer.J(-1360797046);
                a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_switch_to_year_selection, composer);
                composer.D();
            }
            IconKt.b(a3, a2, RotateKt.a(companion, z2 ? 180.0f : 0.0f), 0L, composer, 0, 8);
        }
        return b0.f30125a;
    }
}
