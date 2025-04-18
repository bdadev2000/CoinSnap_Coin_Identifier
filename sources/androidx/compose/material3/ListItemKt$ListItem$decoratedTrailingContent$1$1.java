package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.ListTokens;
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

/* loaded from: classes4.dex */
final class ListItemKt$ListItem$decoratedTrailingContent$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListItemColors f9688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$decoratedTrailingContent$1$1(ListItemColors listItemColors, p pVar) {
        super(2);
        this.f9688a = listItemColors;
        this.f9689b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier j2 = PaddingKt.j(Modifier.Companion.f14687a, ListItemKt.f9664f, 0.0f, 0.0f, 0.0f, 14);
            p pVar = this.f9689b;
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
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
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar2);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            ListItemKt.b(this.f9688a.f9659f, ListTokens.f13433u, pVar, composer, 48);
            composer.p();
        }
        return b0.f30125a;
    }
}
