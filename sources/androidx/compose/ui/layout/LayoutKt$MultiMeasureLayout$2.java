package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes4.dex */
final class LayoutKt$MultiMeasureLayout$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f15744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeasurePolicy f15746c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$MultiMeasureLayout$2(Modifier modifier, p pVar, MeasurePolicy measurePolicy, int i2, int i3) {
        super(2);
        this.f15744a = modifier;
        this.f15745b = pVar;
        this.f15746c = measurePolicy;
        this.d = i2;
        this.f15747f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        p pVar = this.f15745b;
        MeasurePolicy measurePolicy = this.f15746c;
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i3 = this.f15747f;
        ComposerImpl g2 = ((Composer) obj).g(1949933075);
        int i4 = i3 & 1;
        Modifier modifier = this.f15744a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i3 & 2) != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(measurePolicy) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            int i5 = g2.P;
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            PersistentCompositionLocalMap Q = g2.Q();
            a a3 = LayoutNode.Companion.a();
            int i6 = ((i2 << 3) & 896) | 6;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(a3);
            } else {
                g2.n();
            }
            ComposeUiNode.h8.getClass();
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            Updater.a(g2, LayoutKt$MultiMeasureLayout$1$1.f15743a);
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar2);
            }
            d.y((i6 >> 6) & 14, pVar, g2, true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LayoutKt$MultiMeasureLayout$2(modifier, pVar, measurePolicy, a2, i3);
        }
        return b0.f30125a;
    }
}
