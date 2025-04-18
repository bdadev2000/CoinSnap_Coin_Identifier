package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DatePickerKt$DateEntryContainer$2$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f8771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8773c;
    public final /* synthetic */ DatePickerColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DateEntryContainer$2$1(p pVar, p pVar2, p pVar3, DatePickerColors datePickerColors, TextStyle textStyle) {
        super(2);
        this.f8771a = pVar;
        this.f8772b = pVar2;
        this.f8773c = pVar3;
        this.d = datePickerColors;
        this.f8774f = textStyle;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier d = SizeKt.d(companion, 1.0f);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, d);
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
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar4);
            p pVar5 = this.f8771a;
            p pVar6 = this.f8772b;
            Arrangement.Horizontal horizontal = (pVar5 == null || pVar6 == null) ? pVar5 != null ? Arrangement.f3772a : Arrangement.f3773b : Arrangement.f3776g;
            Modifier d2 = SizeKt.d(companion, 1.0f);
            RowMeasurePolicy a3 = RowKt.a(horizontal, Alignment.Companion.f14667k, composer, 48);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, d2);
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
            Updater.b(composer, a3, pVar);
            Updater.b(composer, m3, pVar2);
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                d.w(E2, composer, E2, pVar3);
            }
            Updater.b(composer, c3, pVar4);
            composer.J(-1287352520);
            if (pVar5 != null) {
                TextKt.a(this.f8774f, ComposableLambdaKt.c(-962031352, new DatePickerKt$DateEntryContainer$2$1$1$1$1(pVar5), composer), composer, 48);
            }
            composer.D();
            composer.J(-1287344444);
            if (pVar6 != null) {
                pVar6.invoke(composer, 0);
            }
            composer.D();
            composer.p();
            composer.J(1995129302);
            if (this.f8773c != null || pVar5 != null || pVar6 != null) {
                DividerKt.a(0.0f, 0, 3, this.d.x, composer, null);
            }
            composer.D();
            composer.p();
        }
        return b0.f30125a;
    }
}
