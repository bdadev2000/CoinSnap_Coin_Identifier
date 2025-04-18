package androidx.compose.material3;

import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* renamed from: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$TimePickerKt$lambda1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$TimePickerKt$lambda1$1 f8652a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
            composer.A();
        } else {
            TextKt.b(Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_am, composer), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return b0.f30125a;
    }
}
