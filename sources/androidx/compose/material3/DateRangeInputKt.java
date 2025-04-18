package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes3.dex */
public final class DateRangeInputKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9036a = 8;

    public static final void a(Long l2, Long l3, p pVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        int i4;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Locale locale;
        DateInputFormat dateInputFormat;
        int i5;
        int i6;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-607499086);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(l3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(calendarModel) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(gVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (i2 & Opcodes.ASM4) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(selectableDates) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 8388608 : 4194304;
        }
        if ((i3 & 4793491) == 4793490 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            Locale a2 = CalendarLocale_androidKt.a(g2);
            boolean I = g2.I(a2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f13690a;
            if (I || u2 == composer$Companion$Empty$12) {
                u2 = calendarModel.c(a2);
                g2.o(u2);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) u2;
            String a3 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_invalid_for_pattern, g2);
            String a4 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_invalid_year_range, g2);
            String a5 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_invalid_not_allowed, g2);
            String a6 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_input_invalid_range_input, g2);
            boolean I2 = ((i3 & Opcodes.ASM7) == 131072 || ((262144 & i3) != 0 && g2.I(datePickerFormatter))) | g2.I(dateInputFormat2);
            Object u3 = g2.u();
            if (I2 || u3 == composer$Companion$Empty$12) {
                i4 = i3;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                locale = a2;
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(gVar, selectableDates, dateInputFormat2, datePickerFormatter, a3, a4, a5, a6);
                g2.o(dateInputValidator);
                u3 = dateInputValidator;
            } else {
                i4 = i3;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                locale = a2;
                dateInputFormat = dateInputFormat2;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) u3;
            dateInputValidator2.f8700h = l2;
            dateInputValidator2.f8701i = l3;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier e = PaddingKt.e(companion, DateInputKt.f8656a);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f3772a;
            RowMeasurePolicy a7 = RowKt.a(Arrangement.g(f9036a), Alignment.Companion.f14666j, g2, 6);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, e);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a7, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar2);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
            String upperCase = dateInputFormat.f12951a.toUpperCase(Locale.ROOT);
            p0.a.r(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String a8 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_start_headline, g2);
            Modifier a9 = rowScopeInstance.a(companion, 0.5f, true);
            int i8 = i4 & 896;
            int i9 = i4 & 112;
            boolean z2 = (i8 == 256) | (i9 == 32);
            Object u4 = g2.u();
            if (z2 || u4 == composer$Companion$Empty$1) {
                i5 = i9;
                u4 = new DateRangeInputKt$DateRangeInputContent$2$1$1(pVar, l3);
                g2.o(u4);
            } else {
                i5 = i9;
            }
            ComposableLambdaImpl c3 = ComposableLambdaKt.c(801434508, new DateRangeInputKt$DateRangeInputContent$2$2(a8, upperCase), g2);
            ComposableLambdaImpl c4 = ComposableLambdaKt.c(665407211, new DateRangeInputKt$DateRangeInputContent$2$3(upperCase), g2);
            int i10 = i4 & 7168;
            int i11 = (i4 >> 21) & 14;
            Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$1;
            int i12 = i4;
            DateInputFormat dateInputFormat3 = dateInputFormat;
            DateInputKt.b(a9, l2, (l) u4, calendarModel, c3, c4, 1, dateInputValidator2, dateInputFormat, locale, datePickerColors, g2, ((i4 << 3) & 112) | 1794048 | i10, i11);
            String a10 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_end_headline, g2);
            Modifier a11 = rowScopeInstance.a(companion, 0.5f, true);
            boolean z3 = (i8 == 256) | ((i12 & 14) == 4);
            Object u5 = g2.u();
            if (z3 || u5 == composer$Companion$Empty$13) {
                i6 = i5;
                u5 = new DateRangeInputKt$DateRangeInputContent$2$4$1(pVar, l2);
                g2.o(u5);
            } else {
                i6 = i5;
            }
            composerImpl = g2;
            DateInputKt.b(a11, l3, (l) u5, calendarModel, ComposableLambdaKt.c(911487285, new DateRangeInputKt$DateRangeInputContent$2$5(a10, upperCase), g2), ComposableLambdaKt.c(-961726252, new DateRangeInputKt$DateRangeInputContent$2$6(upperCase), g2), 2, dateInputValidator2, dateInputFormat3, locale, datePickerColors, g2, i6 | 1794048 | i10, i11);
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DateRangeInputKt$DateRangeInputContent$3(l2, l3, pVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i2);
        }
    }
}
