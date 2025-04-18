package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f15858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15859b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(int i2, l lVar) {
        super(2);
        this.f15858a = lVar;
        this.f15859b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f15859b | 1);
        ComposerImpl g2 = ((Composer) obj).g(-1673066036);
        int i3 = a2 & 6;
        l lVar = this.f15858a;
        if (i3 == 0) {
            i2 = (g2.w(lVar) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i2 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            int i4 = g2.P;
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.f15860a;
            a a3 = LayoutNode.Companion.a();
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.w0();
            if (g2.O) {
                g2.B(a3);
            } else {
                g2.n();
            }
            ComposeUiNode.h8.getClass();
            Updater.b(g2, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, ComposeUiNode.Companion.f15898g);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.a(g2, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(lVar));
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(a2, lVar);
        }
        return b0.f30125a;
    }
}
