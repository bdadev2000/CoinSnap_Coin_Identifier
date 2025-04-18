package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class LayoutKt$materializerOf$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = ((SkippableUpdater) obj).f13976a;
        Composer composer2 = (Composer) obj2;
        ((Number) obj3).intValue();
        int E = composer2.E();
        Modifier c2 = ComposedModifierKt.c(composer2, null);
        composer.t(509942095);
        ComposeUiNode.h8.getClass();
        Updater.b(composer, c2, ComposeUiNode.Companion.d);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
            d.w(E, composer, E, pVar);
        }
        composer.H();
        return b0.f30125a;
    }
}
