package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBarImpl$wrappedContent$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f11032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f11033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarImpl$wrappedContent$1(Animatable animatable, SearchBarColors searchBarColors, q qVar) {
        super(2);
        this.f11032a = animatable;
        this.f11033b = searchBarColors;
        this.f11034c = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Animatable animatable = this.f11032a;
            boolean w = composer.w(animatable);
            Object u2 = composer.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1(animatable);
                composer.o(u2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(companion, (l) u2);
            ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
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
            DividerKt.a(0.0f, 0, 3, this.f11033b.f10857b, composer, null);
            this.f11034c.invoke(columnScopeInstance, composer, 6);
            composer.p();
        }
        return b0.f30125a;
    }
}
