package androidx.compose.material3;

import android.content.res.Configuration;
import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class SearchBar_androidKt$DockedSearchBar$1$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$DockedSearchBar$1$1$1(SearchBarColors searchBarColors, q qVar) {
        super(3);
        this.f10909a = searchBarColors;
        this.f10910b = qVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        float f2 = ((Configuration) composer.K(AndroidCompositionLocals_androidKt.f16324a)).screenHeightDp;
        boolean b2 = composer.b(f2);
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (b2 || u2 == composer$Companion$Empty$1) {
            u2 = new Dp(f2 * 0.6666667f);
            composer.o(u2);
        }
        float f3 = ((Dp) u2).f17486a;
        boolean b3 = composer.b(f3);
        Object u3 = composer.u();
        if (b3 || u3 == composer$Companion$Empty$1) {
            Dp dp = new Dp(SearchBar_androidKt.f10896b);
            Dp dp2 = new Dp(f3);
            if (dp.compareTo(dp2) > 0) {
                dp = dp2;
            }
            Dp dp3 = new Dp(dp.f17486a);
            composer.o(dp3);
            u3 = dp3;
        }
        Modifier f4 = SizeKt.f(Modifier.Companion.f14687a, ((Dp) u3).f17486a, f3);
        ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, f4);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3837a;
        DividerKt.a(0.0f, 0, 3, this.f10909a.f10857b, composer, null);
        this.f10910b.invoke(columnScopeInstance, composer, 6);
        composer.p();
        return b0.f30125a;
    }
}
