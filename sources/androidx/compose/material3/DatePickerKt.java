package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes3.dex */
public final class DatePickerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8765a = 48;

    /* renamed from: b, reason: collision with root package name */
    public static final float f8766b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f8767c;
    public static final PaddingValuesImpl d;
    public static final PaddingValuesImpl e;

    /* renamed from: f, reason: collision with root package name */
    public static final PaddingValuesImpl f8768f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f8769g;

    static {
        float f2 = 12;
        f8767c = f2;
        d = PaddingKt.b(0.0f, 0.0f, f2, f2, 3);
        float f3 = 24;
        float f4 = 16;
        e = PaddingKt.b(f3, f4, f2, 0.0f, 8);
        f8768f = PaddingKt.b(f3, 0.0f, f2, f2, 2);
        f8769g = f4;
    }

    public static final void a(Modifier modifier, p pVar, p pVar2, p pVar3, DatePickerColors datePickerColors, TextStyle textStyle, float f2, p pVar4, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1507356255);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(datePickerColors) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(textStyle) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.b(f2) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.w(pVar4) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if ((i4 & 4793491) == 4793490 && g2.i()) {
            g2.A();
        } else {
            Modifier a2 = BackgroundKt.a(SemanticsModifierKt.b(SizeKt.q(modifier, DatePickerModalTokens.f13291c, 0.0f, 0.0f, 14), false, DatePickerKt$DateEntryContainer$1.f8770a), datePickerColors.f8702a, RectangleShapeKt.f15014a);
            ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
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
            p pVar5 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar5);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            b(Modifier.Companion.f14687a, pVar, datePickerColors.f8703b, datePickerColors.f8704c, f2, ComposableLambdaKt.c(-229007058, new DatePickerKt$DateEntryContainer$2$1(pVar2, pVar3, pVar, datePickerColors, textStyle), g2), g2, (i4 & 112) | 196614 | (57344 & (i4 >> 6)));
            d.y((i4 >> 21) & 14, pVar4, g2, true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$DateEntryContainer$3(modifier, pVar, pVar2, pVar3, datePickerColors, textStyle, f2, pVar4, i2);
        }
    }

    public static final void b(Modifier modifier, p pVar, long j2, long j3, float f2, p pVar2, Composer composer, int i2) {
        int i3;
        boolean z2;
        ComposerImpl g2 = composer.g(-996037719);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.d(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.d(j3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.b(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(pVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i3) == 74898 && g2.i()) {
            g2.A();
        } else {
            Modifier modifier2 = Modifier.Companion.f14687a;
            if (pVar != null) {
                modifier2 = SizeKt.b(modifier2, 0.0f, f2, 1);
            }
            Modifier T0 = SizeKt.d(modifier, 1.0f).T0(modifier2);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3776g, Alignment.Companion.f14669m, g2, 6);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, T0);
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
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(594298678);
            if (pVar != null) {
                z2 = true;
                ProvideContentColorTextStyleKt.a(j2, TypographyKt.a(DatePickerModalTokens.f13304r, g2), ComposableLambdaKt.c(1936268514, new DatePickerKt$DatePickerHeader$1$1(pVar), g2), g2, ((i3 >> 6) & 14) | 384);
            } else {
                z2 = true;
            }
            g2.V(false);
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j3, ContentColorKt.f8654a), pVar2, g2, ((i3 >> 12) & 112) | 8);
            g2.V(z2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$DatePickerHeader$2(modifier, pVar, j2, j3, f2, pVar2, i2);
        }
    }

    public static final void c(Modifier modifier, boolean z2, q0.a aVar, boolean z3, boolean z4, boolean z5, boolean z6, String str, DatePickerColors datePickerColors, p pVar, Composer composer, int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        State k2;
        int i4;
        long j3;
        long j4;
        BorderStroke borderStroke;
        State a2;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-1434777861);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.a(z3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.a(z4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.a(z5) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.a(z6) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.I(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= g2.w(pVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            boolean z7 = (29360128 & i3) == 8388608;
            Object u2 = g2.u();
            if (z7 || u2 == Composer.Companion.f13690a) {
                u2 = new DatePickerKt$Day$1$1(str);
                g2.o(u2);
            }
            Modifier b2 = SemanticsModifierKt.b(modifier, true, (l) u2);
            Shape a3 = ShapesKt.a(DatePickerModalTokens.d, g2);
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            if (z2) {
                j2 = z4 ? datePickerColors.f8717r : datePickerColors.f8718s;
            } else {
                datePickerColors.getClass();
                j2 = Color.f14961h;
            }
            if (z3) {
                g2.J(-217548653);
                modifier2 = b2;
                k2 = SingleValueAnimationKt.a(j2, AnimationSpecKt.d(100, 0, null, 6), g2, 0);
                g2.V(false);
            } else {
                modifier2 = b2;
                g2.J(-217433457);
                k2 = SnapshotStateKt.k(new Color(j2), g2);
                g2.V(false);
            }
            long j5 = ((Color) k2.getValue()).f14964a;
            int i7 = i5 & 7168;
            if (z2 && z4) {
                i4 = i5;
                j3 = datePickerColors.f8715p;
            } else {
                i4 = i5;
                if (z2 && !z4) {
                    j3 = datePickerColors.f8716q;
                } else if (z6 && z4) {
                    j3 = datePickerColors.w;
                } else {
                    j3 = datePickerColors.f8714o;
                    if (!z6 || z4) {
                        if (z5) {
                            j3 = datePickerColors.f8719t;
                        } else if (z4) {
                            j3 = datePickerColors.f8713n;
                        }
                    }
                }
            }
            if (z6) {
                g2.J(-828488761);
                a2 = SnapshotStateKt.k(new Color(j3), g2);
                g2.V(false);
                j4 = j5;
                borderStroke = null;
            } else {
                g2.J(-828426947);
                j4 = j5;
                borderStroke = null;
                a2 = SingleValueAnimationKt.a(j3, AnimationSpecKt.d(100, 0, null, 6), g2, 0);
                g2.V(false);
            }
            long j6 = ((Color) a2.getValue()).f14964a;
            composerImpl = g2;
            SurfaceKt.b(z2, aVar, modifier2, z4, a3, j4, j6, 0.0f, (!z5 || z2) ? borderStroke : BorderStrokeKt.a(datePickerColors.f8720u, DatePickerModalTokens.f13297k), null, ComposableLambdaKt.c(-2031780827, new DatePickerKt$Day$2(pVar), g2), composerImpl, i6 | (i4 & 112) | i7, 1408);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$Day$3(modifier, z2, aVar, z3, z4, z5, z6, str, datePickerColors, pVar, i2);
        }
    }

    public static final void d(Modifier modifier, int i2, l lVar, Composer composer, int i3) {
        int i4;
        boolean z2;
        ComposerImpl g2 = composer.g(1393846115);
        if ((i3 & 6) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.c(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            boolean a2 = DisplayMode.a(i2, 0);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (a2) {
                g2.J(-411460444);
                z2 = (i4 & 896) == 256;
                Object u2 = g2.u();
                if (z2 || u2 == composer$Companion$Empty$1) {
                    u2 = new DatePickerKt$DisplayModeToggleButton$1$1(lVar);
                    g2.o(u2);
                }
                IconButtonKt.a((q0.a) u2, modifier, false, null, null, ComposableSingletons$DatePickerKt.f8597a, g2, ((i4 << 3) & 112) | 196608, 28);
                g2.V(false);
            } else {
                g2.J(-411178437);
                z2 = (i4 & 896) == 256;
                Object u3 = g2.u();
                if (z2 || u3 == composer$Companion$Empty$1) {
                    u3 = new DatePickerKt$DisplayModeToggleButton$2$1(lVar);
                    g2.o(u3);
                }
                IconButtonKt.a((q0.a) u3, modifier, false, null, null, ComposableSingletons$DatePickerKt.f8598b, g2, ((i4 << 3) & 112) | 196608, 28);
                g2.V(false);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$DisplayModeToggleButton$3(modifier, i2, lVar, i3);
        }
    }

    public static final void e(LazyListState lazyListState, Long l2, l lVar, l lVar2, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-1994757941);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(lazyListState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(lVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(gVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.I(selectableDates) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if ((38347923 & i4) == 38347922 && g2.i()) {
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
            TextKt.a(TypographyKt.a(DatePickerModalTokens.e, g2), ComposableLambdaKt.c(1504086906, new DatePickerKt$HorizontalMonthsList$1(lazyListState, gVar, calendarModel, (CalendarMonth) u2, lVar, h2, l2, datePickerFormatter, selectableDates, datePickerColors), composerImpl), composerImpl, 48);
            boolean w = ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | composerImpl.w(calendarModel) | composerImpl.w(gVar);
            Object u3 = composerImpl.u();
            if (w || u3 == composer$Companion$Empty$1) {
                DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState, lVar2, calendarModel, gVar, null);
                composerImpl.o(datePickerKt$HorizontalMonthsList$2$1);
                u3 = datePickerKt$HorizontalMonthsList$2$1;
            }
            EffectsKt.f(lazyListState, (p) u3, composerImpl);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$HorizontalMonthsList$3(lazyListState, l2, lVar, lVar2, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i2);
        }
    }

    public static final void f(CalendarMonth calendarMonth, l lVar, long j2, Long l2, Long l3, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Modifier modifier;
        ComposerImpl composerImpl;
        int i4;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        ComposerImpl composerImpl2;
        float f2;
        Locale locale;
        Modifier.Companion companion;
        Applier applier;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        CalendarMonth calendarMonth2 = calendarMonth;
        long j3 = j2;
        Object obj = l2;
        Object obj2 = l3;
        SelectedRangeInfo selectedRangeInfo2 = selectedRangeInfo;
        ComposerImpl g2 = composer.g(-1912870997);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(calendarMonth2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(lVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.d(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(obj) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(obj2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(selectedRangeInfo2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.I(selectableDates) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 67108864 : 33554432;
        }
        int i6 = i3;
        if ((i6 & 38347923) == 38347922 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            g2.J(1821406531);
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f13690a;
            Modifier.Companion companion2 = Modifier.Companion.f14687a;
            if (selectedRangeInfo2 != null) {
                boolean z5 = ((i6 & 234881024) == 67108864) | ((i6 & Opcodes.ASM7) == 131072);
                Object u2 = g2.u();
                if (z5 || u2 == composer$Companion$Empty$12) {
                    u2 = new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(selectedRangeInfo2, datePickerColors);
                    g2.o(u2);
                }
                modifier = DrawModifierKt.d(companion2, (l) u2);
            } else {
                modifier = companion2;
            }
            g2.V(false);
            Locale a2 = CalendarLocale_androidKt.a(g2);
            float f3 = f8765a;
            Modifier T0 = SizeKt.h(companion2, 6 * f3).T0(modifier);
            float f4 = f3;
            ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3775f, Alignment.Companion.f14669m, g2, 6);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, T0);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier2 = g2.f13691a;
            Locale locale2 = a2;
            if (!(applier2 instanceof Applier)) {
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
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(-647488269);
            int i8 = 0;
            int i9 = 0;
            int i10 = 6;
            while (i8 < i10) {
                Modifier d2 = SizeKt.d(companion2, 1.0f);
                RowMeasurePolicy a4 = RowKt.a(Arrangement.f3775f, Alignment.Companion.f14667k, g2, 54);
                int i11 = g2.P;
                PersistentCompositionLocalMap Q2 = g2.Q();
                Modifier c3 = ComposedModifierKt.c(g2, d2);
                ComposeUiNode.h8.getClass();
                int i12 = i9;
                q0.a aVar2 = ComposeUiNode.Companion.f15895b;
                Modifier.Companion companion3 = companion2;
                if (!(applier2 instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                g2.z();
                if (g2.O) {
                    g2.B(aVar2);
                } else {
                    g2.n();
                }
                Updater.b(g2, a4, ComposeUiNode.Companion.f15898g);
                Updater.b(g2, Q2, ComposeUiNode.Companion.f15897f);
                p pVar2 = ComposeUiNode.Companion.f15900i;
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i11))) {
                    d.x(i11, g2, i11, pVar2);
                }
                Updater.b(g2, c3, ComposeUiNode.Companion.d);
                g2.J(-88422904);
                i9 = i12;
                int i13 = 0;
                while (i13 < 7) {
                    int i14 = calendarMonth2.d;
                    if (i9 < i14 || i9 >= i14 + calendarMonth2.f12949c) {
                        i4 = i8;
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        composerImpl2 = g2;
                        f2 = f4;
                        locale = locale2;
                        companion = companion3;
                        applier = applier2;
                        i5 = i13;
                        composerImpl2.J(1554022070);
                        SpacerKt.a(SizeKt.k(companion, f2, f2), composerImpl2);
                        composerImpl2.V(false);
                    } else {
                        g2.J(1554536112);
                        int i15 = i9 - calendarMonth2.d;
                        Applier applier3 = applier2;
                        long j4 = (i15 * 86400000) + calendarMonth2.e;
                        boolean z6 = j4 == j3;
                        boolean z7 = obj != null && j4 == l2.longValue();
                        boolean z8 = obj2 != null && j4 == l3.longValue();
                        g2.J(-88387804);
                        if (selectedRangeInfo2 != null) {
                            boolean d3 = ((i6 & Opcodes.ASM7) == 131072) | g2.d(j4);
                            Object u3 = g2.u();
                            if (d3 || u3 == composer$Companion$Empty$12) {
                                if (j4 >= (obj != null ? l2.longValue() : Long.MAX_VALUE)) {
                                    if (j4 <= (obj2 != null ? l3.longValue() : Long.MIN_VALUE)) {
                                        z4 = true;
                                        u3 = SnapshotStateKt.f(Boolean.valueOf(z4), StructuralEqualityPolicy.f14078a);
                                        g2.o(u3);
                                    }
                                }
                                z4 = false;
                                u3 = SnapshotStateKt.f(Boolean.valueOf(z4), StructuralEqualityPolicy.f14078a);
                                g2.o(u3);
                            }
                            z2 = ((Boolean) ((MutableState) u3).getValue()).booleanValue();
                        } else {
                            z2 = false;
                        }
                        g2.V(false);
                        boolean z9 = selectedRangeInfo2 != null;
                        StringBuilder sb = new StringBuilder();
                        g2.J(-647758197);
                        if (!z9) {
                            z3 = false;
                        } else if (z7) {
                            g2.J(-647755172);
                            sb.append(Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_start_headline, g2));
                            z3 = false;
                            g2.V(false);
                        } else {
                            z3 = false;
                            if (z8) {
                                g2.J(-647751174);
                                sb.append(Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_end_headline, g2));
                                g2.V(false);
                            } else if (z2) {
                                g2.J(-647747239);
                                sb.append(Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_day_in_range, g2));
                                g2.V(false);
                            } else {
                                g2.J(1394740614);
                                g2.V(false);
                            }
                        }
                        g2.V(z3);
                        g2.J(-647744489);
                        if (z6) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_today_description, g2));
                        }
                        g2.V(false);
                        String sb2 = sb.length() == 0 ? null : sb.toString();
                        Locale locale3 = locale2;
                        applier = applier3;
                        String b2 = datePickerFormatter.b(Long.valueOf(j4), locale3, true);
                        if (b2 == null) {
                            b2 = "";
                        }
                        boolean z10 = z7 || z8;
                        boolean d4 = ((i6 & 112) == 32) | g2.d(j4);
                        Object u4 = g2.u();
                        if (d4 || u4 == composer$Companion$Empty$12) {
                            u4 = new DatePickerKt$Month$1$1$1$1(j4, lVar);
                            g2.o(u4);
                        }
                        q0.a aVar3 = (q0.a) u4;
                        boolean d5 = g2.d(j4);
                        Object u5 = g2.u();
                        if (d5 || u5 == composer$Companion$Empty$12) {
                            selectableDates.getClass();
                            u5 = true;
                            g2.o(u5);
                        }
                        boolean booleanValue = ((Boolean) u5).booleanValue();
                        if (sb2 != null) {
                            b2 = androidx.compose.foundation.text.input.a.k(sb2, ", ", b2);
                        }
                        Modifier.Companion companion4 = companion3;
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        boolean z11 = z10;
                        companion = companion4;
                        f2 = f4;
                        locale = locale3;
                        i4 = i8;
                        ComposerImpl composerImpl3 = g2;
                        boolean z12 = z6;
                        i5 = i13;
                        c(companion4, z11, aVar3, z7, booleanValue, z12, z2, b2, datePickerColors, ComposableLambdaKt.c(-2095706591, new DatePickerKt$Month$1$1$3(i15), g2), composerImpl3, 805306374 | (i6 & 234881024));
                        composerImpl2 = composerImpl3;
                        composerImpl2.V(false);
                    }
                    i9++;
                    i13 = i5 + 1;
                    j3 = j2;
                    obj = l2;
                    g2 = composerImpl2;
                    f4 = f2;
                    companion3 = companion;
                    applier2 = applier;
                    composer$Companion$Empty$12 = composer$Companion$Empty$1;
                    i8 = i4;
                    locale2 = locale;
                    calendarMonth2 = calendarMonth;
                    obj2 = l3;
                    selectedRangeInfo2 = selectedRangeInfo;
                }
                ComposerImpl composerImpl4 = g2;
                composerImpl4.V(false);
                composerImpl4.V(true);
                obj = l2;
                g2 = composerImpl4;
                i8++;
                f4 = f4;
                companion2 = companion3;
                applier2 = applier2;
                composer$Companion$Empty$12 = composer$Companion$Empty$12;
                i10 = 6;
                locale2 = locale2;
                calendarMonth2 = calendarMonth;
                j3 = j2;
                obj2 = l3;
                selectedRangeInfo2 = selectedRangeInfo;
            }
            composerImpl = g2;
            composerImpl.V(false);
            composerImpl.V(true);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$Month$2(calendarMonth, lVar, j2, l2, l3, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, i2);
        }
    }

    public static final void g(Modifier modifier, boolean z2, boolean z3, boolean z4, String str, q0.a aVar, q0.a aVar2, q0.a aVar3, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-773929258);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.a(z4) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(aVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.w(aVar2) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.w(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) == 38347922 && g2.i()) {
            g2.A();
        } else {
            Modifier h2 = SizeKt.h(SizeKt.d(modifier, 1.0f), f8766b);
            RowMeasurePolicy a2 = RowKt.a(z4 ? Arrangement.f3772a : Arrangement.f3776g, Alignment.Companion.f14667k, g2, 48);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            q0.a aVar4 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar4);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(datePickerColors.f8705f, ContentColorKt.f8654a), ComposableLambdaKt.c(-962805198, new DatePickerKt$MonthsNavigation$1$1(aVar3, z4, str, aVar2, z3, aVar, z2), g2), g2, 56);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$MonthsNavigation$2(modifier, z2, z3, z4, str, aVar, aVar2, aVar3, datePickerColors, i2);
        }
    }

    public static final void h(DatePickerColors datePickerColors, CalendarModel calendarModel, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1849465391);
        int i3 = (i2 & 6) == 0 ? (g2.I(datePickerColors) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= g2.w(calendarModel) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            int d2 = calendarModel.d();
            List i4 = calendarModel.i();
            ArrayList arrayList = new ArrayList();
            int i5 = d2 - 1;
            int size = i4.size();
            for (int i6 = i5; i6 < size; i6++) {
                arrayList.add(i4.get(i6));
            }
            boolean z2 = false;
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList.add(i4.get(i7));
            }
            TextStyle a2 = TypographyKt.a(DatePickerModalTokens.f13310z, g2);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = f8765a;
            Modifier d3 = SizeKt.d(SizeKt.b(companion, 0.0f, f2, 1), 1.0f);
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3775f, Alignment.Companion.f14667k, g2, 54);
            int i8 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, d3);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
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
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i8))) {
                d.x(i8, g2, i8, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(396170355);
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                k kVar = (k) arrayList.get(i9);
                boolean I = g2.I(kVar);
                Object u2 = g2.u();
                if (I || u2 == Composer.Companion.f13690a) {
                    u2 = new DatePickerKt$WeekDays$1$1$1$1(kVar);
                    g2.o(u2);
                }
                Modifier o2 = SizeKt.o(SemanticsModifierKt.a(companion, (l) u2), f2, f2);
                MeasurePolicy e2 = BoxKt.e(Alignment.Companion.e, z2);
                int i10 = g2.P;
                PersistentCompositionLocalMap Q2 = g2.Q();
                Modifier c3 = ComposedModifierKt.c(g2, o2);
                ComposeUiNode.h8.getClass();
                q0.a aVar2 = ComposeUiNode.Companion.f15895b;
                int i11 = size2;
                if (!(applier instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                g2.z();
                if (g2.O) {
                    g2.B(aVar2);
                } else {
                    g2.n();
                }
                Updater.b(g2, e2, ComposeUiNode.Companion.f15898g);
                Updater.b(g2, Q2, ComposeUiNode.Companion.f15897f);
                p pVar2 = ComposeUiNode.Companion.f15900i;
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i10))) {
                    d.x(i10, g2, i10, pVar2);
                }
                Updater.b(g2, c3, ComposeUiNode.Companion.d);
                TextKt.b((String) kVar.f30135b, SizeKt.u(companion, null, 3), datePickerColors.d, 0L, null, null, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, a2, g2, 48, 0, 65016);
                g2.V(true);
                i9++;
                applier = applier;
                f2 = f2;
                arrayList = arrayList;
                size2 = i11;
                companion = companion;
                z2 = false;
            }
            g2.V(z2);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$WeekDays$2(datePickerColors, calendarModel, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0189, code lost:
    
        if (p0.a.g(r8.u(), java.lang.Integer.valueOf(r3)) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d2, code lost:
    
        if (r2 == r0) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(java.lang.Long r38, long r39, q0.l r41, q0.l r42, androidx.compose.material3.internal.CalendarModel r43, w0.g r44, androidx.compose.material3.DatePickerFormatter r45, androidx.compose.material3.SelectableDates r46, androidx.compose.material3.DatePickerColors r47, androidx.compose.runtime.Composer r48, int r49) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.i(java.lang.Long, long, q0.l, q0.l, androidx.compose.material3.internal.CalendarModel, w0.g, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final void j(Long l2, long j2, int i2, l lVar, l lVar2, CalendarModel calendarModel, g gVar, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-895379221);
        if ((i3 & 6) == 0) {
            i4 = (g2.I(l2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.d(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.c(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g2.w(lVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= g2.w(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= g2.w(calendarModel) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= g2.w(gVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i3) == 0) {
            i4 |= (16777216 & i3) == 0 ? g2.I(datePickerFormatter) : g2.w(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= g2.I(selectableDates) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= g2.I(datePickerColors) ? 536870912 : 268435456;
        }
        int i5 = i4;
        if ((i5 & 306783379) == 306783378 && g2.i()) {
            g2.A();
        } else {
            int i6 = -((Density) g2.K(CompositionLocalsKt.f16434f)).F0(48);
            DisplayMode displayMode = new DisplayMode(i2);
            Modifier b2 = SemanticsModifierKt.b(Modifier.Companion.f14687a, false, DatePickerKt$SwitchableDateEntryContent$1.f8935a);
            boolean c2 = g2.c(i6);
            Object u2 = g2.u();
            if (c2 || u2 == Composer.Companion.f13690a) {
                u2 = new DatePickerKt$SwitchableDateEntryContent$2$1(i6);
                g2.o(u2);
            }
            AnimatedContentKt.b(displayMode, b2, (l) u2, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.c(-459778869, new DatePickerKt$SwitchableDateEntryContent$3(l2, j2, lVar, lVar2, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors), g2), g2, ((i5 >> 6) & 14) | 1597440, 40);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$SwitchableDateEntryContent$4(l2, j2, i2, lVar, lVar2, calendarModel, gVar, datePickerFormatter, selectableDates, datePickerColors, i3);
        }
    }

    public static final void k(Modifier modifier, boolean z2, boolean z3, q0.a aVar, boolean z4, String str, DatePickerColors datePickerColors, p pVar, Composer composer, int i2) {
        int i3;
        Object a2;
        Modifier modifier2;
        long j2;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(238547184);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(aVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.a(z4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.w(pVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            boolean z5 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (z5 || u2 == composer$Companion$Empty$1) {
                a2 = (!z3 || z2) ? null : BorderStrokeKt.a(datePickerColors.f8720u, DatePickerModalTokens.f13297k);
                g2.o(a2);
            } else {
                a2 = u2;
            }
            BorderStroke borderStroke = (BorderStroke) a2;
            boolean z6 = (458752 & i3) == 131072;
            Object u3 = g2.u();
            if (z6 || u3 == composer$Companion$Empty$1) {
                u3 = new DatePickerKt$Year$1$1(str);
                g2.o(u3);
            }
            Modifier b2 = SemanticsModifierKt.b(modifier, true, (l) u3);
            Shape a3 = ShapesKt.a(DatePickerModalTokens.F, g2);
            int i4 = i3 >> 3;
            int i5 = i4 & 14;
            if (!z2) {
                modifier2 = b2;
                datePickerColors.getClass();
                j2 = Color.f14961h;
            } else if (z4) {
                modifier2 = b2;
                j2 = datePickerColors.f8711l;
            } else {
                modifier2 = b2;
                j2 = datePickerColors.f8712m;
            }
            composerImpl = g2;
            SurfaceKt.b(z2, aVar, modifier2, z4, a3, ((Color) SingleValueAnimationKt.a(j2, AnimationSpecKt.d(100, 0, null, 6), g2, 0).getValue()).f14964a, ((Color) SingleValueAnimationKt.a((z2 && z4) ? datePickerColors.f8709j : (!z2 || z4) ? z3 ? datePickerColors.f8708i : z4 ? datePickerColors.f8706g : datePickerColors.f8707h : datePickerColors.f8710k, AnimationSpecKt.d(100, 0, null, 6), g2, 0).getValue()).f14964a, 0.0f, borderStroke, null, ComposableLambdaKt.c(-1573188346, new DatePickerKt$Year$2(pVar), g2), composerImpl, ((i3 >> 6) & 112) | i5 | (i4 & 7168), 1408);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$Year$3(modifier, z2, z3, aVar, z4, str, datePickerColors, pVar, i2);
        }
    }

    public static final void l(Modifier modifier, long j2, l lVar, SelectableDates selectableDates, CalendarModel calendarModel, g gVar, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1286899812);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.d(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(selectableDates) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(gVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(datePickerColors) ? 1048576 : Opcodes.ASM8;
        }
        if ((i3 & 599187) == 599186 && g2.i()) {
            g2.A();
        } else {
            TextKt.a(TypographyKt.a(DatePickerModalTokens.C, g2), ComposableLambdaKt.c(1301915789, new DatePickerKt$YearPicker$1(calendarModel, j2, gVar, datePickerColors, modifier, lVar, selectableDates), g2), g2, 48);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DatePickerKt$YearPicker$2(modifier, j2, lVar, selectableDates, calendarModel, gVar, datePickerColors, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(q0.a r20, boolean r21, androidx.compose.ui.Modifier r22, q0.p r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.m(q0.a, boolean, androidx.compose.ui.Modifier, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
