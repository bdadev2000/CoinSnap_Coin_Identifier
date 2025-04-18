package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
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
import q0.q;

/* loaded from: classes4.dex */
final class NavigationRailKt$NavigationRail$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f10329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$1(WindowInsets windowInsets, q qVar, q qVar2) {
        super(2);
        this.f10327a = windowInsets;
        this.f10328b = qVar;
        this.f10329c = qVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier s2 = SizeKt.s(WindowInsetsPaddingKt.c(SizeKt.c(companion, 1.0f), this.f10327a), NavigationRailTokens.f13450c, 0.0f, 2);
            float f2 = NavigationRailKt.f10321a;
            Modifier a2 = SelectableGroupKt.a(PaddingKt.h(s2, 0.0f, f2, 1));
            ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.g(f2), Alignment.Companion.f14670n, composer, 54);
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
            Updater.b(composer, a3, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3837a;
            composer.J(722845512);
            q qVar = this.f10328b;
            if (qVar != null) {
                qVar.invoke(columnScopeInstance, composer, 6);
                SpacerKt.a(SizeKt.e(companion, NavigationRailKt.f10322b), composer);
            }
            composer.D();
            this.f10329c.invoke(columnScopeInstance, composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
