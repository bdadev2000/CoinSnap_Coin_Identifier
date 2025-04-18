package androidx.compose.animation;

import android.support.v4.media.d;
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
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class SharedTransitionScopeKt$SharedTransitionLayout$1 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f1927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$1(Modifier modifier, q qVar) {
        super(4);
        this.f1927a = modifier;
        this.f1928b = qVar;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj;
        Modifier modifier = (Modifier) obj2;
        Composer composer = (Composer) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            i2 = (composer.I(sharedTransitionScope) ? 4 : 2) | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            i2 |= composer.I(modifier) ? 32 : 16;
        }
        if ((i2 & Opcodes.I2S) == 146 && composer.i()) {
            composer.A();
        } else {
            Modifier T0 = this.f1927a.T0(modifier);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
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
            this.f1928b.invoke(sharedTransitionScope, composer, Integer.valueOf(i2 & 14));
            composer.p();
        }
        return b0.f30125a;
    }
}
