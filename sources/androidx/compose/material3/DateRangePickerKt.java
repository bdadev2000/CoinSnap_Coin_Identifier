package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes4.dex */
public final class DateRangePickerKt {

    /* renamed from: b, reason: collision with root package name */
    public static final PaddingValuesImpl f9090b;

    /* renamed from: c, reason: collision with root package name */
    public static final PaddingValuesImpl f9091c;

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f9089a = PaddingKt.b(24, 20, 0.0f, 8, 4);
    public static final float d = 60;

    static {
        float f2 = 64;
        float f3 = 12;
        f9090b = PaddingKt.b(f2, 0.0f, f3, 0.0f, 10);
        f9091c = PaddingKt.b(f2, 0.0f, f3, f3, 2);
    }

    public static final void a(LazyListState lazyListState, Long l2, Long l3, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1257365001);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(lazyListState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(l3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(lVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(calendarModel) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.w(gVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(selectableDates) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if ((i4 & 306783379) == 306783378 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            CalendarDate h2 = calendarModel.h();
            boolean I = g2.I(gVar);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (I || u2 == composer$Companion$Empty$1) {
                u2 = calendarModel.e(gVar.f31406a, 1);
                g2.o(u2);
            }
            composerImpl = g2;
            TextKt.a(TypographyKt.a(DatePickerModalTokens.e, g2), ComposableLambdaKt.c(1090773432, new DateRangePickerKt$VerticalMonthsList$1(l2, l3, pVar, lazyListState, gVar, calendarModel, (CalendarMonth) u2, datePickerFormatter, datePickerColors, h2, selectableDates), composerImpl), composerImpl, 48);
            boolean w = ((i4 & 14) == 4) | ((i4 & 57344) == 16384) | composerImpl.w(calendarModel) | composerImpl.w(gVar);
            Object u3 = composerImpl.u();
            if (w || u3 == composer$Companion$Empty$1) {
                DateRangePickerKt$VerticalMonthsList$2$1 dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, lVar, calendarModel, gVar, null);
                composerImpl.o(dateRangePickerKt$VerticalMonthsList$2$1);
                u3 = dateRangePickerKt$VerticalMonthsList$2$1;
            }
            EffectsKt.f(lazyListState, (p) u3, composerImpl);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DateRangePickerKt$VerticalMonthsList$3(lazyListState, l2, l3, pVar, lVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i2);
        }
    }

    public static final void b(Long l2, Long l3, long j2, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-787063721);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(l3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.d(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(lVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(calendarModel) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.w(gVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(selectableDates) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            CalendarMonth f2 = calendarModel.f(j2);
            f2.getClass();
            LazyListState a2 = LazyListStateKt.a((((f2.f12947a - gVar.f31406a) * 12) + f2.f12948b) - 1, g2, 2);
            Modifier h2 = PaddingKt.h(Modifier.Companion.f14687a, DatePickerKt.f8767c, 0.0f, 2);
            ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
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
            Updater.b(g2, a3, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar2);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            DatePickerKt.h(datePickerColors, calendarModel, g2, ((i3 >> 27) & 14) | ((i3 >> 12) & 112));
            int i5 = i3 << 3;
            int i6 = (i5 & 896) | (i5 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3);
            composerImpl = g2;
            a(a2, l2, l3, pVar, lVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, composerImpl, i6);
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DateRangePickerKt$DateRangePickerContent$2(l2, l3, j2, pVar, lVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i2);
        }
    }

    public static final void c(Long l2, Long l3, long j2, int i2, p pVar, l lVar, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        ComposerImpl g2 = composer.g(-532789335);
        if ((i3 & 6) == 0) {
            i5 = (g2.I(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.I(l3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.d(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.c(i2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= g2.w(lVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= g2.w(calendarModel) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i3) == 0) {
            i5 |= g2.w(gVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= (134217728 & i3) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= g2.I(selectableDates) ? 536870912 : 268435456;
        }
        int i7 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (g2.I(datePickerColors) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i7 & 306783379) == 306783378 && (i6 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            CrossfadeKt.b(new DisplayMode(i2), SemanticsModifierKt.b(Modifier.Companion.f14687a, false, DateRangePickerKt$SwitchableDateEntryContent$1.f9120a), AnimationSpecKt.c(0.0f, 0.0f, null, 7), null, ComposableLambdaKt.c(-1026642619, new DateRangePickerKt$SwitchableDateEntryContent$2(l2, l3, j2, pVar, lVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors), g2), g2, ((i7 >> 9) & 14) | 24960, 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DateRangePickerKt$SwitchableDateEntryContent$3(l2, l3, j2, i2, pVar, lVar, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i3, i4);
        }
    }
}
