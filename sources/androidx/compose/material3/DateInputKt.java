package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import w0.g;
import z0.m;

/* loaded from: classes.dex */
public final class DateInputKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f8656a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f8657b = 16;

    static {
        float f2 = 24;
        f8656a = PaddingKt.b(f2, 10, f2, 0.0f, 8);
    }

    public static final void a(Long l2, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        DateInputFormat dateInputFormat;
        Locale locale;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(643325609);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(lVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(calendarModel) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(gVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(selectableDates) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 1048576 : Opcodes.ASM8;
        }
        int i4 = i3;
        if ((i4 & 599187) == 599186 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            Locale a2 = CalendarLocale_androidKt.a(g2);
            boolean I = g2.I(a2);
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (I || u2 == obj) {
                u2 = calendarModel.c(a2);
                g2.o(u2);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) u2;
            String a3 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_invalid_for_pattern, g2);
            String a4 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_invalid_year_range, g2);
            String a5 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_invalid_not_allowed, g2);
            boolean I2 = g2.I(dateInputFormat2) | ((i4 & 57344) == 16384 || ((i4 & 32768) != 0 && g2.I(datePickerFormatter)));
            Object u3 = g2.u();
            if (I2 || u3 == obj) {
                dateInputFormat = dateInputFormat2;
                locale = a2;
                Object dateInputValidator = new DateInputValidator(gVar, selectableDates, dateInputFormat2, datePickerFormatter, a3, a4, a5, "");
                g2.o(dateInputValidator);
                u3 = dateInputValidator;
            } else {
                dateInputFormat = dateInputFormat2;
                locale = a2;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) u3;
            String upperCase = dateInputFormat.f12951a.toUpperCase(Locale.ROOT);
            p0.a.r(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String a6 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_input_label, g2);
            Modifier e = PaddingKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), f8656a);
            dateInputValidator2.f8700h = l2;
            ComposableLambdaImpl c2 = ComposableLambdaKt.c(-1819015125, new DateInputKt$DateInputContent$2(a6, upperCase), g2);
            ComposableLambdaImpl c3 = ComposableLambdaKt.c(-564233108, new DateInputKt$DateInputContent$3(upperCase), g2);
            int i5 = i4 << 3;
            Locale locale2 = locale;
            composerImpl = g2;
            b(e, l2, lVar, calendarModel, c2, c3, 0, dateInputValidator2, dateInputFormat, locale2, datePickerColors, g2, (i5 & 112) | 1794054 | (i5 & 896) | (i5 & 7168), (i4 >> 18) & 14);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DateInputKt$DateInputContent$4(l2, lVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i2);
        }
    }

    public static final void b(Modifier modifier, Long l2, l lVar, CalendarModel calendarModel, p pVar, p pVar2, int i2, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i7;
        MutableState mutableState;
        ComposerImpl g2 = composer.g(-857008589);
        if ((i3 & 6) == 0) {
            i5 = (g2.I(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.I(l2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.w(calendarModel) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= g2.w(pVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= g2.c(i2) ? 1048576 : Opcodes.ASM8;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= g2.I(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= g2.I(dateInputFormat) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= g2.w(locale) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (g2.I(datePickerColors) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            int i8 = i5;
            MutableState mutableState2 = (MutableState) RememberSaveableKt.c(new Object[0], null, null, DateInputKt$DateInputTextField$errorText$1.f8691a, g2, 3072, 6);
            Object[] objArr = new Object[0];
            SaverKt$Saver$1 saverKt$Saver$1 = TextFieldValue.d;
            int i9 = 234881024 & i8;
            boolean w = ((i8 & 112) == 32) | g2.w(calendarModel) | (i9 == 67108864) | g2.w(locale);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f13690a;
            if (w || u2 == composer$Companion$Empty$12) {
                u2 = new DateInputKt$DateInputTextField$text$2$1(l2, calendarModel, dateInputFormat, locale);
                g2.o(u2);
            }
            MutableState b2 = RememberSaveableKt.b(objArr, saverKt$Saver$1, (q0.a) u2, g2);
            TextFieldValue textFieldValue = (TextFieldValue) b2.getValue();
            boolean I = (i9 == 67108864) | g2.I(b2) | g2.I(mutableState2) | ((i8 & 896) == 256) | g2.w(calendarModel) | ((i8 & 29360128) == 8388608) | ((i8 & 3670016) == 1048576) | g2.w(locale);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$12) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i7 = i8;
                mutableState = mutableState2;
                DateInputKt$DateInputTextField$1$1 dateInputKt$DateInputTextField$1$1 = new DateInputKt$DateInputTextField$1$1(dateInputFormat, mutableState2, lVar, calendarModel, dateInputValidator, i2, locale, b2);
                g2.o(dateInputKt$DateInputTextField$1$1);
                u3 = dateInputKt$DateInputTextField$1$1;
            } else {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i7 = i8;
                mutableState = mutableState2;
            }
            l lVar2 = (l) u3;
            Modifier j2 = PaddingKt.j(modifier, 0.0f, 0.0f, 0.0f, m.Z0((CharSequence) mutableState.getValue()) ^ true ? 0 : f8657b, 7);
            MutableState mutableState3 = mutableState;
            boolean I2 = g2.I(mutableState3);
            Object u4 = g2.u();
            if (I2 || u4 == composer$Companion$Empty$1) {
                u4 = new DateInputKt$DateInputTextField$2$1(mutableState3);
                g2.o(u4);
            }
            int i10 = i7 << 6;
            OutlinedTextFieldKt.a(textFieldValue, lVar2, SemanticsModifierKt.b(j2, false, (l) u4), false, false, null, pVar, pVar2, null, null, null, null, ComposableLambdaKt.c(-591991974, new DateInputKt$DateInputTextField$3(mutableState3), g2), !m.Z0((CharSequence) mutableState3.getValue()), new DateVisualTransformation(dateInputFormat), new KeyboardOptions(Boolean.FALSE, 3, 7, Opcodes.LREM), null, true, 0, 0, null, null, datePickerColors.f8722y, g2, (i10 & 3670016) | (i10 & 29360128), 12779904, 0, 4001592);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DateInputKt$DateInputTextField$4(modifier, l2, lVar, calendarModel, pVar, pVar2, i2, dateInputValidator, dateInputFormat, locale, datePickerColors, i3, i4);
        }
    }
}
