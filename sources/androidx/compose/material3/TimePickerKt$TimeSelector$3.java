package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$TimeSelector$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12467c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeSelector$3(int i2, TimePickerState timePickerState, int i3, long j2) {
        super(2);
        this.f12465a = i2;
        this.f12466b = timePickerState;
        this.f12467c = i3;
        this.d = j2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean g2 = this.f12466b.g();
            int i2 = this.f12465a;
            int i3 = this.f12467c;
            String v2 = TimePickerKt.v(i2, g2, i3, composer);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            long j2 = this.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            MeasurePolicy e = BoxKt.e(biasAlignment, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, companion);
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
            boolean I = composer.I(v2);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new TimePickerKt$TimeSelector$3$1$1$1(v2);
                composer.o(u2);
            }
            TextKt.b(CalendarLocale_jvmKt.a(i3, 2, 6), SemanticsModifierKt.b(companion, false, (l) u2), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131064);
            composer.p();
        }
        return b0.f30125a;
    }
}
