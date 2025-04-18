package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.node.ComposeUiNode;
import b1.d0;
import b1.f0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class SegmentedButtonKt$SegmentedButtonContent$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$SegmentedButtonContent$1$1(p pVar, p pVar2) {
        super(2);
        this.f11134a = pVar;
        this.f11135b = pVar2;
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
            Object u3 = composer.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new SegmentedButtonContentMeasurePolicy(d0Var);
                composer.o(u3);
            }
            SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) u3;
            Modifier a2 = IntrinsicKt.a();
            ComposableLambdaImpl a3 = LayoutKt.a(f0.v(this.f11134a, this.f11135b));
            Object u4 = composer.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new MultiContentMeasurePolicyImpl(segmentedButtonContentMeasurePolicy);
                composer.o(u4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u4;
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
            Updater.b(composer, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            a3.invoke(composer, 0);
            composer.p();
        }
        return b0.f30125a;
    }
}
