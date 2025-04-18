package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f11140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f11141c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2(Modifier modifier, float f2, q qVar, int i2, int i3) {
        super(2);
        this.f11139a = modifier;
        this.f11140b = f2;
        this.f11141c = qVar;
        this.d = i2;
        this.f11142f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        q qVar = this.f11141c;
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i3 = this.f11142f;
        float f2 = SegmentedButtonKt.f11096a;
        ComposerImpl g2 = ((Composer) obj).g(-1520863498);
        int i4 = i3 & 1;
        Modifier modifier = this.f11139a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i3 & 2;
        float f3 = this.f11140b;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.b(f3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.w(qVar) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            if (i5 != 0) {
                f3 = SegmentedButtonDefaults.f11084b;
            }
            Modifier b2 = IntrinsicKt.b(SizeKt.b(SelectableGroupKt.a(modifier), 0.0f, OutlinedSegmentedButtonTokens.f13463a, 1), IntrinsicSize.f4029a);
            RowMeasurePolicy a3 = RowKt.a(Arrangement.g(-f3), Alignment.Companion.f14667k, g2, 48);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, b2);
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
            Updater.b(g2, a3, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = new SingleChoiceSegmentedButtonScopeWrapper();
                g2.o(u2);
            }
            qVar.invoke((SingleChoiceSegmentedButtonScopeWrapper) u2, g2, Integer.valueOf(((i2 >> 3) & 112) | 6));
            g2.V(true);
        }
        float f4 = f3;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2(modifier, f4, qVar, a2, i3);
        }
        return b0.f30125a;
    }
}
