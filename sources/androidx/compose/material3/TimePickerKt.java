package androidx.compose.material3;

import android.content.res.Configuration;
import android.support.v4.media.d;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.ConfigurationCompat;
import b1.d0;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
public final class TimePickerKt {
    public static final float d;
    public static final float e;

    /* renamed from: g, reason: collision with root package name */
    public static final float f12326g;

    /* renamed from: k, reason: collision with root package name */
    public static final MutableIntList f12330k;

    /* renamed from: l, reason: collision with root package name */
    public static final MutableIntList f12331l;

    /* renamed from: m, reason: collision with root package name */
    public static final float f12332m;

    /* renamed from: a, reason: collision with root package name */
    public static final float f12322a = 101;

    /* renamed from: b, reason: collision with root package name */
    public static final float f12323b = 69;

    /* renamed from: c, reason: collision with root package name */
    public static final float f12324c = 36;

    /* renamed from: f, reason: collision with root package name */
    public static final float f12325f = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final float f12327h = 74;

    /* renamed from: i, reason: collision with root package name */
    public static final float f12328i = 48;

    /* renamed from: j, reason: collision with root package name */
    public static final MutableIntList f12329j = IntListKt.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f2 = 24;
        d = f2;
        e = f2;
        f12326g = f2;
        MutableIntList a2 = IntListKt.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f12330k = a2;
        MutableIntList mutableIntList = new MutableIntList(a2.f1434b);
        int[] iArr = a2.f1433a;
        int i2 = a2.f1434b;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableIntList.b((iArr[i3] % 12) + 12);
        }
        f12331l = mutableIntList;
        f12332m = 12;
    }

    public static final void a(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-934561141);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            CompositionLocalKt.b(new ProvidedValue[]{TextKt.f12204a.c(TypographyKt.a(TimePickerTokens.f13577r, g2)), CompositionLocalsKt.f16440l.c(LayoutDirection.f17494a)}, ComposableLambdaKt.c(-477913269, new TimePickerKt$ClockDisplayNumbers$1(timePickerState, timePickerColors), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$ClockDisplayNumbers$2(timePickerState, timePickerColors, i2);
        }
    }

    public static final void b(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1170157036);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z2) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            CrossfadeKt.b(TimePickerSelectionMode.a(analogTimePickerState.f7571a.c(), 1) ? f12329j : f12330k, DrawModifierKt.d(SizeKt.n(BackgroundKt.a(Modifier.Companion.f14687a, timePickerColors.f12310a, RoundedCornerShapeKt.f5392a).T0(new ClockDialModifier(analogTimePickerState, z2, analogTimePickerState.f7571a.c())), TimePickerTokens.f13562a), new TimePickerKt$drawSelector$1(analogTimePickerState, timePickerColors)), AnimationSpecKt.d(200, 0, null, 6), null, ComposableLambdaKt.c(-1022006568, new TimePickerKt$ClockFace$1(timePickerColors, analogTimePickerState, z2), g2), g2, 24960, 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$ClockFace$2(analogTimePickerState, timePickerColors, z2, i2);
        }
    }

    public static final void c(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ComposerImpl g2 = composer.g(755539561);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, Alignment.Companion.f14669m, g2, 6);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
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
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            a(timePickerState, timePickerColors, g2, (i3 & 14) | (i3 & 112));
            g2.J(919638492);
            if (timePickerState.g()) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                Modifier j2 = PaddingKt.j(companion, 0.0f, f12332m, 0.0f, 0.0f, 13);
                MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
                int i5 = g2.P;
                PersistentCompositionLocalMap Q2 = g2.Q();
                Modifier c3 = ComposedModifierKt.c(g2, j2);
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
                Updater.b(g2, e2, pVar);
                Updater.b(g2, Q2, pVar2);
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                    d.x(i5, g2, i5, pVar3);
                }
                Updater.b(g2, c3, pVar4);
                int i6 = i3 << 3;
                d((i6 & 896) | (i6 & 112) | 6, timePickerColors, timePickerState, g2, SizeKt.o(companion, TimePickerTokens.f13566g, TimePickerTokens.f13565f));
                z3 = true;
                g2.V(true);
            }
            g2.V(z2);
            g2.V(z3);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$HorizontalClockDisplay$2(timePickerState, timePickerColors, i2);
        }
    }

    public static final void d(int i2, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, Modifier modifier) {
        int i3;
        ComposerImpl g2 = composer.g(1261215927);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(timePickerColors) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.f12397a;
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            Shape a2 = ShapesKt.a(TimePickerTokens.e, g2);
            p0.a.q(a2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) a2;
            float f2 = (float) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            f(modifier, timePickerState, timePickerColors, measurePolicy, CornerBasedShape.c(cornerBasedShape, null, CornerSizeKt.a(f2), CornerSizeKt.a(f2), null, 9), CornerBasedShape.c(cornerBasedShape, CornerSizeKt.a(f2), null, null, CornerSizeKt.a(f2), 6), g2, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$HorizontalPeriodToggle$1(i2, timePickerColors, timePickerState, modifier);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.material3.AnalogTimePickerState r16, androidx.compose.ui.Modifier r17, androidx.compose.material3.TimePickerColors r18, boolean r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.e(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(measurePolicy) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(shape2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        int i4 = i3;
        if ((i4 & 74899) == 74898 && g2.i()) {
            g2.A();
        } else {
            BorderStroke a2 = BorderStrokeKt.a(timePickerColors.d, TimePickerTokens.f13568i);
            Shape a3 = ShapesKt.a(TimePickerTokens.e, g2);
            p0.a.q(a3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) a3;
            String a4 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_period_toggle_description, g2);
            boolean I = g2.I(a4);
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (I || u2 == obj) {
                u2 = new TimePickerKt$PeriodToggleImpl$1$1(a4);
                g2.o(u2);
            }
            Modifier T0 = SelectableGroupKt.a(SemanticsModifierKt.b(modifier, false, (l) u2)).T0(new BorderModifierNodeElement(a2.f2608a, a2.f2609b, cornerBasedShape));
            int i5 = g2.P;
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
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            boolean z2 = !timePickerState.i();
            int i6 = i4 & 112;
            boolean z3 = i6 == 32 || ((i4 & 64) != 0 && g2.w(timePickerState));
            Object u3 = g2.u();
            if (z3 || u3 == obj) {
                u3 = new TimePickerKt$PeriodToggleImpl$2$1$1(timePickerState);
                g2.o(u3);
            }
            int i7 = (i4 << 3) & 7168;
            i(z2, shape, (q0.a) u3, timePickerColors, ComposableSingletons$TimePickerKt.f8650a, g2, ((i4 >> 9) & 112) | 24576 | i7);
            SpacerKt.a(BackgroundKt.a(LayoutIdKt.b(Modifier.Companion.f14687a, "Spacer").T0(new ZIndexElement(2.0f)).T0(SizeKt.f4107c), timePickerColors.d, RectangleShapeKt.f15014a), g2);
            boolean i8 = timePickerState.i();
            boolean z4 = i6 == 32 || ((i4 & 64) != 0 && g2.w(timePickerState));
            Object u4 = g2.u();
            if (z4 || u4 == obj) {
                u4 = new TimePickerKt$PeriodToggleImpl$2$2$1(timePickerState);
                g2.o(u4);
            }
            i(i8, shape2, (q0.a) u4, timePickerColors, ComposableSingletons$TimePickerKt.f8651b, g2, ((i4 >> 12) & 112) | 24576 | i7);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$PeriodToggleImpl$3(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i2);
        }
    }

    public static final void g(int i2, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, Modifier modifier) {
        int i3;
        boolean z2;
        ComposerImpl g2 = composer.g(-475657989);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(timePickerColors) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            Object[] objArr = new Object[0];
            SaverKt$Saver$1 saverKt$Saver$1 = TextFieldValue.d;
            int i5 = i4 & 896;
            boolean z3 = i5 == 256 || ((i4 & 512) != 0 && g2.w(timePickerState));
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (z3 || u2 == composer$Companion$Empty$1) {
                u2 = new TimePickerKt$TimeInputImpl$hourValue$2$1(timePickerState);
                g2.o(u2);
            }
            MutableState b2 = RememberSaveableKt.b(objArr, saverKt$Saver$1, (q0.a) u2, g2);
            Object[] objArr2 = new Object[0];
            boolean z4 = i5 == 256 || ((i4 & 512) != 0 && g2.w(timePickerState));
            Object u3 = g2.u();
            if (z4 || u3 == composer$Companion$Empty$1) {
                u3 = new TimePickerKt$TimeInputImpl$minuteValue$2$1(timePickerState);
                g2.o(u3);
            }
            MutableState b3 = RememberSaveableKt.b(objArr2, saverKt$Saver$1, (q0.a) u3, g2);
            Modifier j2 = PaddingKt.j(modifier, 0.0f, 0.0f, 0.0f, f12326g, 7);
            RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, g2, 48);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, j2);
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
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            CompositionLocalKt.b(new ProvidedValue[]{TextKt.f12204a.c(TextStyle.a(3, 16744446, timePickerColors.f12320m, 0L, 0L, 0L, null, TypographyKt.a(TimeInputTokens.f13558f, g2), null, null, null)), CompositionLocalsKt.f16440l.c(LayoutDirection.f17494a)}, ComposableLambdaKt.c(1306700887, new TimePickerKt$TimeInputImpl$1$1(b2, timePickerState, timePickerColors, b3), g2), g2, 56);
            g2.J(511443242);
            if (timePickerState.g()) {
                z2 = true;
            } else {
                Modifier.Companion companion = Modifier.Companion.f14687a;
                Modifier j3 = PaddingKt.j(companion, f12332m, 0.0f, 0.0f, 0.0f, 14);
                MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
                int i7 = g2.P;
                PersistentCompositionLocalMap Q2 = g2.Q();
                Modifier c3 = ComposedModifierKt.c(g2, j3);
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
                Updater.b(g2, e2, pVar);
                Updater.b(g2, Q2, pVar2);
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                    d.x(i7, g2, i7, pVar3);
                }
                Updater.b(g2, c3, pVar4);
                k(((i4 << 3) & 896) | ((i4 >> 3) & 112) | 6, timePickerColors, timePickerState, g2, SizeKt.o(companion, TimeInputTokens.f13556b, TimeInputTokens.f13555a));
                z2 = true;
                g2.V(true);
            }
            g2.V(false);
            g2.V(z2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$TimeInputImpl$2(i2, timePickerColors, timePickerState, modifier);
        }
    }

    public static final void h(int i2, int i3, int i4, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, Modifier modifier) {
        int i5;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-1148055889);
        if ((i4 & 6) == 0) {
            i5 = (g2.I(modifier) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= g2.c(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= (i4 & 512) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= g2.c(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= g2.I(timePickerColors) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            boolean a2 = TimePickerSelectionMode.a(timePickerState.c(), i3);
            String a3 = Strings_androidKt.a(TimePickerSelectionMode.a(i3, 0) ? com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_hour_selection : com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_minute_selection, g2);
            long j2 = a2 ? timePickerColors.f12318k : timePickerColors.f12319l;
            long j3 = a2 ? timePickerColors.f12320m : timePickerColors.f12321n;
            boolean I = g2.I(a3);
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (I || u2 == obj) {
                u2 = new TimePickerKt$TimeSelector$1$1(a3);
                g2.o(u2);
            }
            boolean z2 = true;
            Modifier b2 = SemanticsModifierKt.b(modifier, true, (l) u2);
            Shape a4 = ShapesKt.a(TimePickerTokens.f13575p, g2);
            boolean z3 = (i5 & 7168) == 2048;
            if ((i5 & 896) != 256 && ((i5 & 512) == 0 || !g2.w(timePickerState))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object u3 = g2.u();
            if (z4 || u3 == obj) {
                u3 = new TimePickerKt$TimeSelector$2$1(i3, timePickerState);
                g2.o(u3);
            }
            composerImpl = g2;
            SurfaceKt.b(a2, (q0.a) u3, b2, false, a4, j2, 0L, 0.0f, null, null, ComposableLambdaKt.c(-1477282471, new TimePickerKt$TimeSelector$3(i3, timePickerState, i2, j3), g2), composerImpl, 0, 1992);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$TimeSelector$4(i2, i3, i4, timePickerColors, timePickerState, modifier);
        }
    }

    public static final void i(boolean z2, Shape shape, q0.a aVar, TimePickerColors timePickerColors, q qVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1937408098);
        if ((i2 & 6) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(shape) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(timePickerColors) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(qVar) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && g2.i()) {
            g2.A();
        } else {
            long j2 = z2 ? timePickerColors.f12316i : timePickerColors.f12317j;
            long j3 = z2 ? timePickerColors.f12314g : timePickerColors.f12315h;
            Modifier T0 = new ZIndexElement(z2 ? 0.0f : 1.0f).T0(SizeKt.f4107c);
            boolean z3 = (i3 & 14) == 4;
            Object u2 = g2.u();
            if (z3 || u2 == Composer.Companion.f13690a) {
                u2 = new TimePickerKt$ToggleItem$1$1(z2);
                g2.o(u2);
            }
            Modifier b2 = SemanticsModifierKt.b(T0, false, (l) u2);
            float f2 = 0;
            ButtonKt.c(aVar, b2, false, shape, ButtonDefaults.e(j3, j2, g2, 12), null, null, new PaddingValuesImpl(f2, f2, f2, f2), null, qVar, g2, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$ToggleItem$2(z2, shape, aVar, timePickerColors, qVar, i2);
        }
    }

    public static final void j(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ComposerImpl g2 = composer.g(2054675515);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            RowMeasurePolicy a2 = RowKt.a(arrangement$Center$1, Alignment.Companion.f14666j, g2, 6);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
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
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            a(timePickerState, timePickerColors, g2, (i3 & 14) | (i3 & 112));
            g2.J(-709485014);
            if (timePickerState.g()) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                Modifier j2 = PaddingKt.j(companion, f12332m, 0.0f, 0.0f, 0.0f, 14);
                MeasurePolicy e2 = BoxKt.e(Alignment.Companion.f14659a, false);
                int i5 = g2.P;
                PersistentCompositionLocalMap Q2 = g2.Q();
                Modifier c3 = ComposedModifierKt.c(g2, j2);
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
                Updater.b(g2, e2, pVar);
                Updater.b(g2, Q2, pVar2);
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                    d.x(i5, g2, i5, pVar3);
                }
                Updater.b(g2, c3, pVar4);
                int i6 = i3 << 3;
                k((i6 & 896) | (i6 & 112) | 6, timePickerColors, timePickerState, g2, SizeKt.o(companion, TimePickerTokens.f13573n, TimePickerTokens.f13572m));
                z3 = true;
                g2.V(true);
            }
            g2.V(z2);
            g2.V(z3);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$VerticalClockDisplay$2(timePickerState, timePickerColors, i2);
        }
    }

    public static final void k(int i2, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, Modifier modifier) {
        int i3;
        ComposerImpl g2 = composer.g(-1898918107);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(timePickerState) : g2.w(timePickerState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(timePickerColors) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.f12486a;
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            Shape a2 = ShapesKt.a(TimePickerTokens.e, g2);
            p0.a.q(a2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) a2;
            CornerBasedShape b2 = ShapesKt.b(cornerBasedShape);
            float f2 = (float) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            f(modifier, timePickerState, timePickerColors, measurePolicy, b2, CornerBasedShape.c(cornerBasedShape, CornerSizeKt.a(f2), CornerSizeKt.a(f2), null, null, 12), g2, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$VerticalPeriodToggle$1(i2, timePickerColors, timePickerState, modifier);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if ((r14 & 4) != 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(androidx.compose.material3.AnalogTimePickerState r8, androidx.compose.ui.Modifier r9, androidx.compose.material3.TimePickerColors r10, boolean r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.l(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void m(Modifier modifier, final float f2, p pVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(1548175696);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.b(f2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            boolean z2 = (i4 & 112) == 32;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1

                    /* renamed from: androidx.compose.material3.TimePickerKt$CircularLayout$1$1$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    final class AnonymousClass1 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Placeable f12334a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ List f12335b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Placeable f12336c;
                        public final /* synthetic */ long d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ float f12337f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ float f12338g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Placeable placeable, ArrayList arrayList, Placeable placeable2, long j2, float f2, float f3) {
                            super(1);
                            this.f12334a = placeable;
                            this.f12335b = arrayList;
                            this.f12336c = placeable2;
                            this.d = j2;
                            this.f12337f = f2;
                            this.f12338g = f3;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            long j2;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            int i2 = 0;
                            Placeable placeable = this.f12334a;
                            if (placeable != null) {
                                placementScope.e(placeable, 0, 0, 0.0f);
                            }
                            List list = this.f12335b;
                            int size = list.size();
                            while (true) {
                                j2 = this.d;
                                if (i2 >= size) {
                                    break;
                                }
                                Placeable placeable2 = (Placeable) list.get(i2);
                                int i3 = (Constraints.i(j2) / 2) - (placeable2.f15825a / 2);
                                int h2 = (Constraints.h(j2) / 2) - (placeable2.f15826b / 2);
                                double d = this.f12337f;
                                double d2 = (this.f12338g * i2) - 1.5707963267948966d;
                                placementScope.e(placeable2, p0.a.s0((Math.cos(d2) * d) + i3), p0.a.s0((Math.sin(d2) * d) + h2), 0.0f);
                                i2++;
                                list = list;
                                size = size;
                            }
                            Placeable placeable3 = this.f12336c;
                            if (placeable3 != null) {
                                placementScope.e(placeable3, (Constraints.k(j2) - placeable3.f15825a) / 2, (Constraints.j(j2) - placeable3.f15826b) / 2, 0.0f);
                            }
                            return b0.f30125a;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                        LayoutId layoutId;
                        LayoutId layoutId2;
                        Object obj;
                        Object obj2;
                        float y1 = measureScope.y1(f2);
                        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i6 = 0;
                        while (true) {
                            layoutId = LayoutId.f9654b;
                            layoutId2 = LayoutId.f9653a;
                            if (i6 >= size) {
                                break;
                            }
                            Object obj3 = list.get(i6);
                            Measurable measurable = (Measurable) obj3;
                            if (LayoutIdKt.a(measurable) != layoutId2 && LayoutIdKt.a(measurable) != layoutId) {
                                arrayList.add(obj3);
                            }
                            i6++;
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            i7 = d.e((Measurable) arrayList.get(i7), b2, arrayList2, i7, 1);
                            layoutId2 = layoutId2;
                        }
                        LayoutId layoutId3 = layoutId2;
                        int size3 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i8);
                            if (LayoutIdKt.a((Measurable) obj) == layoutId3) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable2 = (Measurable) obj;
                        int size4 = list.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i9);
                            if (LayoutIdKt.a((Measurable) obj2) == layoutId) {
                                break;
                            }
                            i9++;
                        }
                        Measurable measurable3 = (Measurable) obj2;
                        return measureScope.T(Constraints.k(j2), Constraints.j(j2), x.f30219a, new AnonymousClass1(measurable2 != null ? measurable2.V(b2) : null, arrayList2, measurable3 != null ? measurable3.V(b2) : null, j2, y1, 6.2831855f / arrayList2.size()));
                    }
                };
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            int i6 = ((i4 >> 6) & 14) | ((i4 << 3) & 112);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            int i8 = ((i6 << 6) & 896) | 6;
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
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar2);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            d.y((i8 >> 6) & 14, pVar, g2, true);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$CircularLayout$2(modifier2, f2, pVar, i2, i3);
        }
    }

    public static final void n(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i2, boolean z2, Composer composer, int i3) {
        int i4;
        Throwable th;
        boolean z3;
        BiasAlignment biasAlignment;
        String str;
        ComposerImpl g2 = composer.g(-206784607);
        if ((i3 & 6) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.w(analogTimePickerState) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.c(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g2.a(z2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            float f2 = TimePickerTokens.f13562a;
            TextStyle a2 = TypographyKt.a(TypographyKeyTokens.f13642a, g2);
            float y1 = ((Density) g2.K(CompositionLocalsKt.f16434f)).y1(f12327h);
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (u2 == obj) {
                u2 = SnapshotStateKt.f(new Offset(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            Object u3 = g2.u();
            if (u3 == obj) {
                u3 = SnapshotStateKt.f(new IntOffset(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u3);
            }
            MutableState mutableState2 = (MutableState) u3;
            Object u4 = g2.u();
            if (u4 == obj) {
                u4 = d.h(EffectsKt.g(g2), g2);
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u4).f13774a;
            int c2 = analogTimePickerState.f7571a.c();
            TimePickerState timePickerState = analogTimePickerState.f7571a;
            String v2 = v(c2, timePickerState.g(), i2, g2);
            String a3 = CalendarLocale_jvmKt.a(i2, 0, 7);
            boolean g3 = TimePickerSelectionMode.a(timePickerState.c(), 1) ? p0.a.g(CalendarLocale_jvmKt.a(timePickerState.f(), 0, 7), a3) : p0.a.g(CalendarLocale_jvmKt.a(timePickerState.h(), 0, 7), a3);
            BiasAlignment biasAlignment2 = Alignment.Companion.e;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f9627a;
            Modifier n2 = SizeKt.n(modifier.T0(MinimumInteractiveModifier.f9779a), f12328i);
            Object u5 = g2.u();
            if (u5 == obj) {
                u5 = new TimePickerKt$ClockText$1$1(mutableState2, mutableState);
                g2.o(u5);
            }
            Modifier a4 = FocusableKt.a(null, OnGloballyPositionedModifierKt.a(n2, (l) u5), true);
            boolean w = g2.w(d0Var) | g2.w(analogTimePickerState) | g2.b(y1) | ((i4 & 7168) == 2048) | g2.a(g3);
            Object u6 = g2.u();
            if (w || u6 == obj) {
                th = null;
                z3 = true;
                biasAlignment = biasAlignment2;
                str = v2;
                Object timePickerKt$ClockText$2$1 = new TimePickerKt$ClockText$2$1(g3, d0Var, analogTimePickerState, y1, z2, mutableState, mutableState2);
                g2.o(timePickerKt$ClockText$2$1);
                u6 = timePickerKt$ClockText$2$1;
            } else {
                z3 = true;
                str = v2;
                biasAlignment = biasAlignment2;
                th = null;
            }
            Modifier b2 = SemanticsModifierKt.b(a4, z3, (l) u6);
            MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, b2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw th;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c3, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            String str2 = str;
            boolean I = g2.I(str2);
            Object u7 = g2.u();
            if (I || u7 == obj) {
                u7 = new TimePickerKt$ClockText$3$1$1(str2);
                g2.o(u7);
            }
            TextKt.b(a3, SemanticsModifierKt.a(companion, (l) u7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a2, g2, 0, 0, 65532);
            g2.V(z3);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$ClockText$4(modifier, analogTimePickerState, i2, z2, i3);
        }
    }

    public static final void o(Modifier modifier, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(2100674302);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            TextStyle a2 = TextStyle.a(3, 15695871, 0L, 0L, 0L, 0L, null, (TextStyle) g2.K(TextKt.f12204a), null, null, new LineHeightStyle(LineHeightStyle.Alignment.f17457a, 17));
            Modifier a3 = SemanticsModifierKt.a(modifier, TimePickerKt$DisplaySeparator$1.f12388a);
            MeasurePolicy e2 = BoxKt.e(Alignment.Companion.e, false);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a3);
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
            Updater.b(g2, e2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            TextKt.b(CertificateUtil.DELIMITER, null, ColorSchemeKt.f(TimeInputTokens.f13559g, g2), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a2, g2, 6, 0, 65530);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TimePickerKt$DisplaySeparator$3(modifier, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0207, code lost:
    
        if (p0.a.g(r11.u(), java.lang.Integer.valueOf(r3)) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0302, code lost:
    
        if (r5 == r4) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04c9, code lost:
    
        if (r2.w(r6) != false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(androidx.compose.ui.Modifier r128, androidx.compose.ui.text.input.TextFieldValue r129, q0.l r130, androidx.compose.material3.TimePickerState r131, int r132, androidx.compose.foundation.text.KeyboardOptions r133, androidx.compose.foundation.text.KeyboardActions r134, androidx.compose.material3.TimePickerColors r135, androidx.compose.runtime.Composer r136, int r137, int r138) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.p(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, q0.l, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(androidx.compose.material3.AnalogTimePickerState r13, float r14, float r15, float r16, boolean r17, long r18, h0.g r20) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.q(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[Catch: NumberFormatException | IllegalArgumentException -> 0x0085, TryCatch #0 {NumberFormatException | IllegalArgumentException -> 0x0085, blocks: (B:15:0x0035, B:17:0x003d, B:19:0x0047, B:21:0x0056, B:23:0x005c, B:25:0x0061, B:27:0x0067, B:28:0x006e, B:31:0x0082, B:34:0x0076, B:35:0x006b, B:37:0x0050), top: B:14:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r(int r6, androidx.compose.material3.TimePickerState r7, androidx.compose.ui.text.input.TextFieldValue r8, androidx.compose.ui.text.input.TextFieldValue r9, int r10, q0.l r11) {
        /*
            androidx.compose.ui.text.AnnotatedString r0 = r8.f17361a
            java.lang.String r0 = r0.f16880a
            androidx.compose.ui.text.AnnotatedString r9 = r9.f17361a
            java.lang.String r9 = r9.f16880a
            boolean r9 = p0.a.g(r0, r9)
            if (r9 == 0) goto L13
            r11.invoke(r8)
            goto L85
        L13:
            androidx.compose.ui.text.AnnotatedString r9 = r8.f17361a
            java.lang.String r9 = r9.f16880a
            int r0 = r9.length()
            r1 = 0
            if (r0 != 0) goto L35
            boolean r6 = androidx.compose.material3.TimePickerSelectionMode.a(r6, r1)
            if (r6 == 0) goto L28
            r7.d(r1)
            goto L2b
        L28:
            r7.e(r1)
        L2b:
            java.lang.String r6 = ""
            androidx.compose.ui.text.input.TextFieldValue r6 = androidx.compose.ui.text.input.TextFieldValue.b(r8, r6)
            r11.invoke(r6)
            goto L85
        L35:
            int r0 = r9.length()     // Catch: java.lang.Throwable -> L85
            r2 = 3
            r3 = 1
            if (r0 != r2) goto L50
            long r4 = r8.f17362b     // Catch: java.lang.Throwable -> L85
            int r0 = androidx.compose.ui.text.TextRange.f17057c     // Catch: java.lang.Throwable -> L85
            r0 = 32
            long r4 = r4 >> r0
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L85
            if (r0 != r3) goto L50
            char r0 = r9.charAt(r1)     // Catch: java.lang.Throwable -> L85
            int r0 = p0.a.M(r0)     // Catch: java.lang.Throwable -> L85
            goto L54
        L50:
            int r0 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Throwable -> L85
        L54:
            if (r0 > r10) goto L85
            boolean r6 = androidx.compose.material3.TimePickerSelectionMode.a(r6, r1)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L6b
            r7.d(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 <= r3) goto L6e
            boolean r6 = r7.g()     // Catch: java.lang.Throwable -> L85
            if (r6 != 0) goto L6e
            r7.b(r3)     // Catch: java.lang.Throwable -> L85
            goto L6e
        L6b:
            r7.e(r0)     // Catch: java.lang.Throwable -> L85
        L6e:
            int r6 = r9.length()     // Catch: java.lang.Throwable -> L85
            r7 = 2
            if (r6 > r7) goto L76
            goto L82
        L76:
            char r6 = r9.charAt(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L85
            androidx.compose.ui.text.input.TextFieldValue r8 = androidx.compose.ui.text.input.TextFieldValue.b(r8, r6)     // Catch: java.lang.Throwable -> L85
        L82:
            r11.invoke(r8)     // Catch: java.lang.Throwable -> L85
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.r(int, androidx.compose.material3.TimePickerState, androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.text.input.TextFieldValue, int, q0.l):void");
    }

    public static final int s(TimePickerState timePickerState) {
        if (timePickerState.g()) {
            return timePickerState.h() % 24;
        }
        if (timePickerState.h() % 12 == 0) {
            return 12;
        }
        return timePickerState.i() ? timePickerState.h() - 12 : timePickerState.h();
    }

    public static final long t(AnalogTimePickerState analogTimePickerState) {
        float f2;
        float f3 = 2;
        float f4 = TimePickerTokens.f13564c / f3;
        if (analogTimePickerState.f7571a.g()) {
            TimePickerState timePickerState = analogTimePickerState.f7571a;
            if (timePickerState.i() && TimePickerSelectionMode.a(timePickerState.c(), 0)) {
                f2 = f12323b;
                float f5 = (f2 - f4) + f4;
                float cos = ((float) Math.cos(((Number) analogTimePickerState.d.d()).floatValue())) * f5;
                float f6 = TimePickerTokens.f13562a / f3;
                return DpKt.a(cos + f6, (f5 * ((float) Math.sin(((Number) analogTimePickerState.d.d()).floatValue()))) + f6);
            }
        }
        f2 = f12322a;
        float f52 = (f2 - f4) + f4;
        float cos2 = ((float) Math.cos(((Number) analogTimePickerState.d.d()).floatValue())) * f52;
        float f62 = TimePickerTokens.f13562a / f3;
        return DpKt.a(cos2 + f62, (f52 * ((float) Math.sin(((Number) analogTimePickerState.d.d()).floatValue()))) + f62);
    }

    public static final void u(TimePickerState timePickerState, float f2, float f3, float f4, long j2) {
        if (TimePickerSelectionMode.a(timePickerState.c(), 0) && timePickerState.g()) {
            timePickerState.a(((float) Math.hypot((double) (((float) ((int) (j2 >> 32))) - f2), (double) (((float) ((int) (j2 & 4294967295L))) - f3))) < f4);
        }
    }

    public static final String v(int i2, boolean z2, int i3, Composer composer) {
        int i4 = TimePickerSelectionMode.a(i2, 1) ? com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_minute_suffix : z2 ? com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_hour_24h_suffix : com.cooldev.gba.emulator.gameboy.R.string.m3c_time_picker_hour_suffix;
        Object[] objArr = {Integer.valueOf(i3)};
        String a2 = Strings_androidKt.a(i4, composer);
        Locale c2 = ConfigurationCompat.a((Configuration) composer.K(AndroidCompositionLocals_androidKt.f16324a)).c(0);
        if (c2 == null) {
            c2 = Locale.getDefault();
        }
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        return androidx.compose.foundation.text.input.a.p(copyOf, copyOf.length, c2, a2, "format(locale, format, *args)");
    }
}
