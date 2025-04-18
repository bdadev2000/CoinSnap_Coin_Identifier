package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import b1.f0;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes3.dex */
final class DateRangePickerKt$VerticalMonthsList$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f9142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9144c;
    public final /* synthetic */ LazyListState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f9145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9146g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f9147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9148i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9149j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f9150k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9151l;

    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f9152a = new r(1);

        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C00371 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public static final C00371 f9153a = new r(0);

            @Override // q0.a
            public final Object invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        final class AnonymousClass2 extends r implements q0.a {

            /* renamed from: a, reason: collision with root package name */
            public static final AnonymousClass2 f9154a = new r(0);

            @Override // q0.a
            public final Object invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            SemanticsPropertiesKt.v((SemanticsPropertyReceiver) obj, new ScrollAxisRange(C00371.f9153a, AnonymousClass2.f9154a, false));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1(Long l2, Long l3, p pVar, LazyListState lazyListState, g gVar, CalendarModel calendarModel, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, CalendarDate calendarDate, SelectableDates selectableDates) {
        super(2);
        this.f9142a = l2;
        this.f9143b = l3;
        this.f9144c = pVar;
        this.d = lazyListState;
        this.f9145f = gVar;
        this.f9146g = calendarModel;
        this.f9147h = calendarMonth;
        this.f9148i = datePickerFormatter;
        this.f9149j = datePickerColors;
        this.f9150k = calendarDate;
        this.f9151l = selectableDates;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Object u2 = composer.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.g(composer));
                composer.o(compositionScopedCoroutineScopeCanceller);
                u2 = compositionScopedCoroutineScopeCanceller;
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_scroll_to_previous_month, composer);
            String a3 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_range_picker_scroll_to_next_month, composer);
            Long l2 = this.f9142a;
            boolean I = composer.I(l2);
            Long l3 = this.f9143b;
            boolean I2 = I | composer.I(l3);
            p pVar = this.f9144c;
            boolean I3 = I2 | composer.I(pVar);
            Object u3 = composer.u();
            if (I3 || u3 == composer$Companion$Empty$1) {
                u3 = new DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1(l2, l3, pVar);
                composer.o(u3);
            }
            l lVar = (l) u3;
            PaddingValuesImpl paddingValuesImpl = DateRangePickerKt.f9089a;
            LazyListState lazyListState = this.d;
            List v2 = f0.v(new CustomAccessibilityAction(a2, new DateRangePickerKt$customScrollActions$scrollUpAction$1(lazyListState, d0Var)), new CustomAccessibilityAction(a3, new DateRangePickerKt$customScrollActions$scrollDownAction$1(lazyListState, d0Var)));
            Modifier b2 = SemanticsModifierKt.b(Modifier.Companion.f14687a, false, AnonymousClass1.f9152a);
            LazyListState lazyListState2 = this.d;
            boolean I4 = composer.I(l2) | composer.w(this.f9145f) | composer.w(this.f9146g) | composer.I(this.f9147h) | composer.w(this.f9148i) | composer.w(v2) | composer.I(this.f9149j) | composer.I(l3) | composer.I(lVar) | composer.I(this.f9150k) | composer.I(this.f9151l);
            g gVar = this.f9145f;
            CalendarModel calendarModel = this.f9146g;
            CalendarMonth calendarMonth = this.f9147h;
            Long l4 = this.f9142a;
            Long l5 = this.f9143b;
            CalendarDate calendarDate = this.f9150k;
            DatePickerFormatter datePickerFormatter = this.f9148i;
            SelectableDates selectableDates = this.f9151l;
            DatePickerColors datePickerColors = this.f9149j;
            Object u4 = composer.u();
            if (I4 || u4 == composer$Companion$Empty$1) {
                u4 = new DateRangePickerKt$VerticalMonthsList$1$2$1(gVar, calendarModel, calendarMonth, l4, l5, lVar, calendarDate, datePickerFormatter, selectableDates, datePickerColors, v2);
                composer.o(u4);
            }
            LazyDslKt.a(b2, lazyListState2, null, false, null, null, null, false, (l) u4, composer, 0, 252);
        }
        return b0.f30125a;
    }
}
