package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class FloatingActionButtonKt$ExtendedFloatingActionButton$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$3(boolean z2, p pVar, p pVar2) {
        super(2);
        this.f9464a = z2;
        this.f9465b = pVar;
        this.f9466c = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean z2 = this.f9464a;
            Modifier j2 = PaddingKt.j(SizeKt.q(Modifier.Companion.f14687a, z2 ? FloatingActionButtonKt.d : FabPrimaryTokens.d, 0.0f, 0.0f, 14), z2 ? FloatingActionButtonKt.f9450a : 0, 0.0f, z2 ? FloatingActionButtonKt.f9452c : 0, 0.0f, 10);
            BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
            boolean z3 = this.f9464a;
            RowMeasurePolicy a2 = RowKt.a(z3 ? Arrangement.f3772a : Arrangement.e, vertical, composer, 48);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, j2);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
            this.f9465b.invoke(composer, 0);
            AnimatedVisibilityKt.c(rowScopeInstance, z3, null, FloatingActionButtonKt.f9453f, FloatingActionButtonKt.e, null, ComposableLambdaKt.c(176242764, new FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1(this.f9466c), composer), composer, 1600518, 18);
            composer.p();
        }
        return b0.f30125a;
    }
}
