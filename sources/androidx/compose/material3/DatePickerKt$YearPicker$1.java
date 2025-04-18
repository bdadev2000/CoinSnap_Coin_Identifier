package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DatePickerKt$YearPicker$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f8976c;
    public final /* synthetic */ DatePickerColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Modifier f8977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f8978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8979h;

    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f8980a = new r(1);

        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C00351 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public static final C00351 f8981a = new r(0);

            @Override // q0.a
            public final Object invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass2 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public static final AnonymousClass2 f8982a = new r(0);

            @Override // q0.a
            public final Object invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            SemanticsPropertiesKt.v((SemanticsPropertyReceiver) obj, new ScrollAxisRange(C00351.f8981a, AnonymousClass2.f8982a, false));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPicker$1(CalendarModel calendarModel, long j2, g gVar, DatePickerColors datePickerColors, Modifier modifier, l lVar, SelectableDates selectableDates) {
        super(2);
        this.f8974a = calendarModel;
        this.f8975b = j2;
        this.f8976c = gVar;
        this.d = datePickerColors;
        this.f8977f = modifier;
        this.f8978g = lVar;
        this.f8979h = selectableDates;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            CalendarModel calendarModel = this.f8974a;
            int i2 = calendarModel.g(calendarModel.h()).f12947a;
            int i3 = calendarModel.f(this.f8975b).f12947a;
            g gVar = this.f8976c;
            LazyGridState a2 = LazyGridStateKt.a(Math.max(0, (i3 - gVar.f31406a) - 3), composer, 2);
            DatePickerColors datePickerColors = this.d;
            long j2 = datePickerColors.f8702a;
            Object u2 = composer.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.g(composer));
                composer.o(compositionScopedCoroutineScopeCanceller);
                u2 = compositionScopedCoroutineScopeCanceller;
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
            String a3 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_scroll_to_earlier_years, composer);
            String a4 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_scroll_to_later_years, composer);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier b2 = SemanticsModifierKt.b(BackgroundKt.a(this.f8977f, j2, RectangleShapeKt.f15014a), false, AnonymousClass1.f8980a);
            Arrangement$SpaceEvenly$1 arrangement$SpaceEvenly$1 = Arrangement.f3775f;
            Arrangement.SpacedAligned g2 = Arrangement.g(DatePickerKt.f8769g);
            boolean w = composer.w(gVar) | composer.I(a2) | composer.w(d0Var) | composer.I(a3) | composer.I(a4) | composer.c(i3) | composer.c(i2) | composer.I(this.f8978g) | composer.I(this.f8979h) | composer.I(datePickerColors);
            g gVar2 = this.f8976c;
            l lVar = this.f8978g;
            SelectableDates selectableDates = this.f8979h;
            DatePickerColors datePickerColors2 = this.d;
            Object u3 = composer.u();
            if (w || u3 == composer$Companion$Empty$1) {
                u3 = new DatePickerKt$YearPicker$1$2$1(gVar2, a2, d0Var, a3, a4, i3, i2, lVar, selectableDates, datePickerColors2);
                composer.o(u3);
            }
            LazyGridDslKt.a(1769472, 408, null, arrangement$SpaceEvenly$1, g2, null, fixed, a2, composer, b2, (l) u3, false, false);
        }
        return b0.f30125a;
    }
}
