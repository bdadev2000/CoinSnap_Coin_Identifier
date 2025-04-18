package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListScope$items$1;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes4.dex */
final class DateRangePickerKt$VerticalMonthsList$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f9155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f9157c;
    public final /* synthetic */ Long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f9158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f9159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f9160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f9162j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9163k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f9164l;

    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements q0.r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CalendarModel f9165a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f9166b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f9167c;
        public final /* synthetic */ Long d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f9168f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f9169g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f9170h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ SelectableDates f9171i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f9172j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f9173k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CalendarModel calendarModel, CalendarMonth calendarMonth, Long l2, Long l3, l lVar, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List list) {
            super(4);
            this.f9165a = calendarModel;
            this.f9166b = calendarMonth;
            this.f9167c = l2;
            this.d = l3;
            this.f9168f = lVar;
            this.f9169g = calendarDate;
            this.f9170h = datePickerFormatter;
            this.f9171i = selectableDates;
            this.f9172j = datePickerColors;
            this.f9173k = list;
        }

        @Override // q0.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i2;
            DatePickerFormatter datePickerFormatter;
            SelectableDates selectableDates;
            DatePickerColors datePickerColors;
            SelectedRangeInfo selectedRangeInfo;
            SelectedRangeInfo selectedRangeInfo2;
            LazyItemScope lazyItemScope = (LazyItemScope) obj;
            int intValue = ((Number) obj2).intValue();
            Composer composer = (Composer) obj3;
            int intValue2 = ((Number) obj4).intValue();
            if ((intValue2 & 6) == 0) {
                i2 = (composer.I(lazyItemScope) ? 4 : 2) | intValue2;
            } else {
                i2 = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i2 |= composer.c(intValue) ? 32 : 16;
            }
            if ((i2 & Opcodes.I2S) == 146 && composer.i()) {
                composer.A();
            } else {
                CalendarMonth calendarMonth = this.f9166b;
                CalendarModel calendarModel = this.f9165a;
                CalendarMonth k2 = calendarModel.k(calendarMonth, intValue);
                Modifier a2 = lazyItemScope.a(1.0f);
                Long l2 = this.f9167c;
                Long l3 = this.d;
                l lVar = this.f9168f;
                DatePickerFormatter datePickerFormatter2 = this.f9170h;
                SelectableDates selectableDates2 = this.f9171i;
                DatePickerColors datePickerColors2 = this.f9172j;
                ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, a2);
                ComposeUiNode.h8.getClass();
                q0.a aVar = ComposeUiNode.Companion.f15895b;
                if (!(composer.j() instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                Updater.b(composer, a3, ComposeUiNode.Companion.f15898g);
                Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
                p pVar = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer, E, pVar);
                }
                Updater.b(composer, c2, ComposeUiNode.Companion.d);
                TextKt.a(TypographyKt.a(DatePickerModalTokens.x, composer), ComposableLambdaKt.c(1622100276, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(datePickerFormatter2, k2, this.f9173k, datePickerColors2), composer), composer, 48);
                composer.J(2125314509);
                if (l2 == null || l3 == null) {
                    datePickerFormatter = datePickerFormatter2;
                    selectableDates = selectableDates2;
                    datePickerColors = datePickerColors2;
                    selectedRangeInfo = null;
                } else {
                    boolean I = composer.I(l2) | composer.I(l3);
                    Object u2 = composer.u();
                    if (I || u2 == Composer.Companion.f13690a) {
                        CalendarDate b2 = calendarModel.b(l2.longValue());
                        CalendarDate b3 = calendarModel.b(l3.longValue());
                        long j2 = b2.d;
                        long j3 = k2.f12950f;
                        if (j2 <= j3) {
                            selectableDates = selectableDates2;
                            datePickerColors = datePickerColors2;
                            long j4 = b3.d;
                            datePickerFormatter = datePickerFormatter2;
                            long j5 = k2.e;
                            if (j4 >= j5) {
                                boolean z2 = j2 >= j5;
                                boolean z3 = j4 <= j3;
                                int i3 = k2.d;
                                int i4 = z2 ? (b2.f12943c + i3) - 1 : i3;
                                int i5 = (i3 + (z3 ? b3.f12943c : k2.f12949c)) - 1;
                                selectedRangeInfo2 = new SelectedRangeInfo(IntOffsetKt.a(i4 % 7, i4 / 7), IntOffsetKt.a(i5 % 7, i5 / 7), z2, z3);
                                composer.o(selectedRangeInfo2);
                                u2 = selectedRangeInfo2;
                            }
                        } else {
                            datePickerFormatter = datePickerFormatter2;
                            selectableDates = selectableDates2;
                            datePickerColors = datePickerColors2;
                        }
                        selectedRangeInfo2 = null;
                        composer.o(selectedRangeInfo2);
                        u2 = selectedRangeInfo2;
                    } else {
                        datePickerFormatter = datePickerFormatter2;
                        selectableDates = selectableDates2;
                        datePickerColors = datePickerColors2;
                    }
                    selectedRangeInfo = (SelectedRangeInfo) u2;
                }
                composer.D();
                DatePickerKt.f(k2, lVar, this.f9169g.d, l2, l3, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$1$2$1(g gVar, CalendarModel calendarModel, CalendarMonth calendarMonth, Long l2, Long l3, l lVar, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List list) {
        super(1);
        this.f9155a = gVar;
        this.f9156b = calendarModel;
        this.f9157c = calendarMonth;
        this.d = l2;
        this.f9158f = l3;
        this.f9159g = lVar;
        this.f9160h = calendarDate;
        this.f9161i = datePickerFormatter;
        this.f9162j = selectableDates;
        this.f9163k = datePickerColors;
        this.f9164l = list;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2 = DatePickerKt.f8765a;
        g gVar = this.f9155a;
        int i2 = ((gVar.f31407b - gVar.f31406a) + 1) * 12;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9156b, this.f9157c, this.d, this.f9158f, this.f9159g, this.f9160h, this.f9161i, this.f9162j, this.f9163k, this.f9164l);
        Object obj2 = ComposableLambdaKt.f14482a;
        ((LazyListScope) obj).d(i2, null, LazyListScope$items$1.f4387a, new ComposableLambdaImpl(-1413501381, anonymousClass1, true));
        return b0.f30125a;
    }
}
