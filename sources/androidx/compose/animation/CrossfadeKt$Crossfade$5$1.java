package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CrossfadeKt$Crossfade$5$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f1795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f1796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1797c;
    public final /* synthetic */ q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(Transition transition, FiniteAnimationSpec finiteAnimationSpec, Object obj, q qVar) {
        super(2);
        this.f1795a = transition;
        this.f1796b = finiteAnimationSpec;
        this.f1797c = obj;
        this.d = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2 = new CrossfadeKt$Crossfade$5$1$alpha$2(this.f1796b);
            TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
            Transition transition = this.f1795a;
            Object a2 = transition.f2267a.a();
            composer.J(-438678252);
            Object obj3 = this.f1797c;
            float f2 = p0.a.g(a2, obj3) ? 1.0f : 0.0f;
            composer.D();
            Float valueOf = Float.valueOf(f2);
            Object value = transition.d.getValue();
            composer.J(-438678252);
            float f3 = p0.a.g(value, obj3) ? 1.0f : 0.0f;
            composer.D();
            Transition.TransitionAnimationState c2 = androidx.compose.animation.core.TransitionKt.c(transition, valueOf, Float.valueOf(f3), (FiniteAnimationSpec) crossfadeKt$Crossfade$5$1$alpha$2.invoke(transition.f(), composer, 0), twoWayConverter, composer, 0);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            boolean I = composer.I(c2);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new CrossfadeKt$Crossfade$5$1$1$1(c2);
                composer.o(u2);
            }
            Modifier a3 = GraphicsLayerModifierKt.a(companion, (l) u2);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, a3);
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
            Updater.b(composer, c3, ComposeUiNode.Companion.d);
            this.d.invoke(obj3, composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
