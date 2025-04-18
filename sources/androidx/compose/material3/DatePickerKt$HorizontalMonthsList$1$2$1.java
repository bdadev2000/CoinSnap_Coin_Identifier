package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListScope$items$1;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import w0.g;

/* loaded from: classes4.dex */
final class DatePickerKt$HorizontalMonthsList$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f8875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f8877c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarDate f8878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Long f8879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f8880h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8882j;

    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements q0.r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CalendarModel f8883a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f8884b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f8885c;
        public final /* synthetic */ CalendarDate d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Long f8886f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f8887g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ SelectableDates f8888h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f8889i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CalendarModel calendarModel, CalendarMonth calendarMonth, l lVar, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
            super(4);
            this.f8883a = calendarModel;
            this.f8884b = calendarMonth;
            this.f8885c = lVar;
            this.d = calendarDate;
            this.f8886f = l2;
            this.f8887g = datePickerFormatter;
            this.f8888h = selectableDates;
            this.f8889i = datePickerColors;
        }

        @Override // q0.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i2;
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
                CalendarMonth k2 = this.f8883a.k(this.f8884b, intValue);
                Modifier a2 = lazyItemScope.a(1.0f);
                l lVar = this.f8885c;
                Long l2 = this.f8886f;
                DatePickerFormatter datePickerFormatter = this.f8887g;
                SelectableDates selectableDates = this.f8888h;
                DatePickerColors datePickerColors = this.f8889i;
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
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
                Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
                Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
                p pVar = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer, E, pVar);
                }
                Updater.b(composer, c2, ComposeUiNode.Companion.d);
                DatePickerKt.f(k2, lVar, this.d.d, l2, null, null, datePickerFormatter, selectableDates, datePickerColors, composer, 221184);
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$1$2$1(g gVar, CalendarModel calendarModel, CalendarMonth calendarMonth, l lVar, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(1);
        this.f8875a = gVar;
        this.f8876b = calendarModel;
        this.f8877c = calendarMonth;
        this.d = lVar;
        this.f8878f = calendarDate;
        this.f8879g = l2;
        this.f8880h = datePickerFormatter;
        this.f8881i = selectableDates;
        this.f8882j = datePickerColors;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2 = DatePickerKt.f8765a;
        g gVar = this.f8875a;
        int i2 = ((gVar.f31407b - gVar.f31406a) + 1) * 12;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8876b, this.f8877c, this.d, this.f8878f, this.f8879g, this.f8880h, this.f8881i, this.f8882j);
        Object obj2 = ComposableLambdaKt.f14482a;
        ((LazyListScope) obj).d(i2, null, LazyListScope$items$1.f4387a, new ComposableLambdaImpl(1137566309, anonymousClass1, true));
        return b0.f30125a;
    }
}
