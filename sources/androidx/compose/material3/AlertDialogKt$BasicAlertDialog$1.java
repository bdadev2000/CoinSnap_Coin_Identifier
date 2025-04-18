package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class AlertDialogKt$BasicAlertDialog$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$BasicAlertDialog$1(Modifier modifier, p pVar) {
        super(2);
        this.f7563a = modifier;
        this.f7564b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            String a2 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.m3c_dialog, composer);
            Modifier q2 = SizeKt.q(this.f7563a, AlertDialogKt.f7486a, 0.0f, AlertDialogKt.f7487b, 10);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            boolean I = composer.I(a2);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new AlertDialogKt$BasicAlertDialog$1$1$1(a2);
                composer.o(u2);
            }
            Modifier T0 = q2.T0(SemanticsModifierKt.b(companion, false, (l) u2));
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, true);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, T0);
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
            this.f7564b.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
