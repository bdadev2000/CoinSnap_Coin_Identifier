package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class CanvasKt$Canvas$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2616c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanvasKt$Canvas$3(Modifier modifier, String str, l lVar, int i2) {
        super(2);
        this.f2614a = modifier;
        this.f2615b = str;
        this.f2616c = lVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        ComposerImpl g2 = ((Composer) obj).g(-1162737955);
        int i3 = a2 & 6;
        Modifier modifier = this.f2614a;
        if (i3 == 0) {
            i2 = (g2.I(modifier) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = a2 & 48;
        String str = this.f2615b;
        if (i4 == 0) {
            i2 |= g2.I(str) ? 32 : 16;
        }
        int i5 = a2 & 384;
        l lVar = this.f2616c;
        if (i5 == 0) {
            i2 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            Modifier b2 = DrawModifierKt.b(modifier, lVar);
            boolean z2 = (i2 & 112) == 32;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new CanvasKt$Canvas$2$1(str);
                g2.o(u2);
            }
            SpacerKt.a(SemanticsModifierKt.b(b2, false, (l) u2), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CanvasKt$Canvas$3(modifier, str, lVar, a2);
        }
        return b0.f30125a;
    }
}
