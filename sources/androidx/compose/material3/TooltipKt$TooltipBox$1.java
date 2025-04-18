package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
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
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class TooltipKt$TooltipBox$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f12539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f12540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipScopeImpl f12541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$1(Transition transition, q qVar, TooltipScopeImpl tooltipScopeImpl) {
        super(2);
        this.f12539a = transition;
        this.f12540b = qVar;
        this.f12541c = tooltipScopeImpl;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = TooltipKt.f12528a;
            Modifier a2 = ComposedModifierKt.a(companion, new TooltipKt$animateTooltip$2(this.f12539a));
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
            this.f12540b.invoke(this.f12541c, composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
