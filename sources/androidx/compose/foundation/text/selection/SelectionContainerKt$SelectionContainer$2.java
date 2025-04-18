package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
final class SelectionContainerKt$SelectionContainer$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7106c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$2(Modifier modifier, p pVar, int i2, int i3) {
        super(2);
        this.f7104a = modifier;
        this.f7105b = pVar;
        this.f7106c = i2;
        this.d = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        p pVar = this.f7105b;
        int a2 = RecomposeScopeImplKt.a(this.f7106c | 1);
        ComposerImpl g2 = ((Composer) obj).g(-1075498320);
        int i3 = this.d;
        int i4 = i3 & 1;
        Modifier modifier = this.f7104a;
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
        if ((i2 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            Modifier modifier2 = modifier;
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            Selection selection = (Selection) mutableState.getValue();
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new SelectionContainerKt$SelectionContainer$1$1(mutableState);
                g2.o(u3);
            }
            SelectionContainerKt.a(modifier2, selection, (l) u3, pVar, g2, (i2 & 14) | 384 | ((i2 << 6) & 7168), 0);
            modifier = modifier2;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SelectionContainerKt$SelectionContainer$2(modifier, pVar, a2, i3);
        }
        return b0.f30125a;
    }
}
