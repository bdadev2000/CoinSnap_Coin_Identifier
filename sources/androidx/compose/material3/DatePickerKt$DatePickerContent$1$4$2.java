package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DatePickerKt$DatePickerContent$1$4$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f8813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f8814c;
    public final /* synthetic */ LazyListState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f8816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8817h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CalendarModel f8818i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8819j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$4$2(long j2, MutableState mutableState, d0 d0Var, LazyListState lazyListState, g gVar, CalendarMonth calendarMonth, SelectableDates selectableDates, CalendarModel calendarModel, DatePickerColors datePickerColors) {
        super(3);
        this.f8812a = j2;
        this.f8813b = mutableState;
        this.f8814c = d0Var;
        this.d = lazyListState;
        this.f8815f = gVar;
        this.f8816g = calendarMonth;
        this.f8817h = selectableDates;
        this.f8818i = calendarModel;
        this.f8819j = datePickerColors;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DatePickerColors datePickerColors;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_date_picker_year_picker_pane_title, composer);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        boolean I = composer.I(a2);
        Object u2 = composer.u();
        Object obj4 = Composer.Companion.f13690a;
        if (I || u2 == obj4) {
            u2 = new DatePickerKt$DatePickerContent$1$4$2$1$1(a2);
            composer.o(u2);
        }
        Modifier b2 = SemanticsModifierKt.b(companion, false, (l) u2);
        long j2 = this.f8812a;
        MutableState mutableState = this.f8813b;
        d0 d0Var = this.f8814c;
        LazyListState lazyListState = this.d;
        g gVar = this.f8815f;
        CalendarMonth calendarMonth = this.f8816g;
        SelectableDates selectableDates = this.f8817h;
        CalendarModel calendarModel = this.f8818i;
        DatePickerColors datePickerColors2 = this.f8819j;
        ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, b2);
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
        Modifier h2 = PaddingKt.h(SizeKt.h(companion, (DatePickerKt.f8765a * 7) - DividerDefaults.f9224a), DatePickerKt.f8767c, 0.0f, 2);
        boolean I2 = composer.I(mutableState) | composer.w(d0Var) | composer.I(lazyListState) | composer.w(gVar) | composer.I(calendarMonth);
        Object u3 = composer.u();
        if (I2 || u3 == obj4) {
            datePickerColors = datePickerColors2;
            u3 = new DatePickerKt$DatePickerContent$1$4$2$2$1$1(d0Var, mutableState, lazyListState, gVar, calendarMonth);
            composer.o(u3);
        } else {
            datePickerColors = datePickerColors2;
        }
        DatePickerKt.l(h2, j2, (l) u3, selectableDates, calendarModel, gVar, datePickerColors, composer, 6);
        DividerKt.a(0.0f, 0, 3, datePickerColors.x, composer, null);
        composer.p();
        return b0.f30125a;
    }
}
