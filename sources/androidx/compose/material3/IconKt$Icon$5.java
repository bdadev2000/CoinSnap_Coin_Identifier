package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class IconKt$Icon$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Painter f9612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColorProducer f9613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9614c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$5(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, int i2, int i3) {
        super(2);
        this.f9612a = painter;
        this.f9613b = colorProducer;
        this.f9614c = str;
        this.d = modifier;
        this.f9615f = i2;
        this.f9616g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        int i3;
        Modifier modifier2;
        boolean w;
        Object u2;
        ((Number) obj2).intValue();
        Painter painter = this.f9612a;
        ColorProducer colorProducer = this.f9613b;
        String str = this.f9614c;
        int a2 = RecomposeScopeImplKt.a(this.f9615f | 1);
        int i4 = this.f9616g;
        Modifier modifier3 = IconKt.f9594a;
        ComposerImpl g2 = ((Composer) obj).g(1755070997);
        if ((i4 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.w(painter) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i4 & 2) != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.w(colorProducer) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(str) ? 256 : 128;
        }
        int i5 = i4 & 8;
        Modifier modifier4 = this.d;
        if (i5 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.I(modifier4) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            i3 = i4;
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            if (i5 != 0) {
                modifier4 = companion;
            }
            g2.J(-2144829472);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (str != null) {
                boolean z2 = (i2 & 896) == 256;
                Object u3 = g2.u();
                if (z2 || u3 == composer$Companion$Empty$1) {
                    u3 = new IconKt$Icon$semantics$2$1(str);
                    g2.o(u3);
                }
                modifier = SemanticsModifierKt.b(companion, false, (l) u3);
            } else {
                modifier = companion;
            }
            g2.V(false);
            i3 = i4;
            if (!Size.a(painter.mo2getIntrinsicSizeNHjbRc(), 9205357640488583168L)) {
                long mo2getIntrinsicSizeNHjbRc = painter.mo2getIntrinsicSizeNHjbRc();
                if (!Float.isInfinite(Size.d(mo2getIntrinsicSizeNHjbRc)) || !Float.isInfinite(Size.b(mo2getIntrinsicSizeNHjbRc))) {
                    long mo2getIntrinsicSizeNHjbRc2 = painter.mo2getIntrinsicSizeNHjbRc();
                    modifier2 = LayoutModifierKt.a(companion, new IconKt$defaultSizeForColorProducer$1(Size.d(mo2getIntrinsicSizeNHjbRc2), Size.b(mo2getIntrinsicSizeNHjbRc2)));
                    Modifier T0 = modifier4.T0(modifier2);
                    w = g2.w(painter) | g2.w(colorProducer);
                    u2 = g2.u();
                    if (!w || u2 == composer$Companion$Empty$1) {
                        u2 = new IconKt$Icon$4$1(painter, colorProducer);
                        g2.o(u2);
                    }
                    BoxKt.a(DrawModifierKt.b(T0, (l) u2).T0(modifier), g2, 0);
                }
            }
            modifier2 = IconKt.f9594a;
            Modifier T02 = modifier4.T0(modifier2);
            w = g2.w(painter) | g2.w(colorProducer);
            u2 = g2.u();
            if (!w) {
            }
            u2 = new IconKt$Icon$4$1(painter, colorProducer);
            g2.o(u2);
            BoxKt.a(DrawModifierKt.b(T02, (l) u2).T0(modifier), g2, 0);
        }
        Modifier modifier5 = modifier4;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new IconKt$Icon$5(painter, colorProducer, str, modifier5, a2, i3);
        }
        return b0.f30125a;
    }
}
