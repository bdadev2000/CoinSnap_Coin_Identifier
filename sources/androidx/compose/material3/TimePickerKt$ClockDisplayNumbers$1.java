package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TimePickerKt$ClockDisplayNumbers$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12344b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockDisplayNumbers$1(TimePickerState timePickerState, TimePickerColors timePickerColors) {
        super(2);
        this.f12343a = timePickerState;
        this.f12344b = timePickerColors;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TimePickerColors timePickerColors = this.f12344b;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            RowMeasurePolicy a2 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, composer, 0);
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
            Updater.b(composer, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            float f2 = TimePickerTokens.f13576q;
            float f3 = TimePickerTokens.f13574o;
            Modifier o2 = SizeKt.o(companion, f2, f3);
            TimePickerState timePickerState = this.f12343a;
            TimePickerKt.h(TimePickerKt.s(timePickerState), 0, 3078, timePickerColors, timePickerState, composer, o2);
            TimePickerKt.o(SizeKt.o(companion, TimePickerKt.e, TimePickerTokens.f13572m), composer, 6);
            TimePickerKt.h(timePickerState.f(), 1, 3078, timePickerColors, timePickerState, composer, SizeKt.o(companion, f2, f3));
            composer.p();
        }
        return b0.f30125a;
    }
}
