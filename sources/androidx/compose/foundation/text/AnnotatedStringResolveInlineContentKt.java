package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import d0.k;
import e0.w;
import java.util.List;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
public final class AnnotatedStringResolveInlineContentKt {

    /* renamed from: a, reason: collision with root package name */
    public static final k f5410a;

    static {
        w wVar = w.f30218a;
        f5410a = new k(wVar, wVar);
    }

    public static final void a(AnnotatedString annotatedString, List list, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1794596951);
        int i3 = (i2 & 6) == 0 ? (g2.I(annotatedString) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= g2.w(list) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i4);
                q qVar = (q) range.f16890a;
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.f5411a;
                Modifier.Companion companion = Modifier.Companion.f14687a;
                int i5 = g2.P;
                PersistentCompositionLocalMap Q = g2.Q();
                Modifier c2 = ComposedModifierKt.c(g2, companion);
                ComposeUiNode.h8.getClass();
                q0.a aVar = ComposeUiNode.Companion.f15895b;
                if (!(g2.f13691a instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                g2.z();
                if (g2.O) {
                    g2.B(aVar);
                } else {
                    g2.n();
                }
                Updater.b(g2, annotatedStringResolveInlineContentKt$InlineChildren$1$2, ComposeUiNode.Companion.f15898g);
                Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
                p pVar = ComposeUiNode.Companion.f15900i;
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                    d.x(i5, g2, i5, pVar);
                }
                Updater.b(g2, c2, ComposeUiNode.Companion.d);
                qVar.invoke(annotatedString.subSequence(range.f16891b, range.f16892c).f16880a, g2, 0);
                g2.V(true);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AnnotatedStringResolveInlineContentKt$InlineChildren$2(annotatedString, list, i2);
        }
    }
}
