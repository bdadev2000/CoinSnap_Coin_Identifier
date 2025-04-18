package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes3.dex */
final class MaterialThemeKt$MaterialExpressiveTheme$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ColorScheme f9717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shapes f9718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typography f9719c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialExpressiveTheme$2(ColorScheme colorScheme, Shapes shapes, Typography typography, p pVar, int i2, int i3) {
        super(2);
        this.f9717a = colorScheme;
        this.f9718b = shapes;
        this.f9719c = typography;
        this.d = pVar;
        this.f9720f = i2;
        this.f9721g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Typography typography;
        Shapes shapes;
        ((Number) obj2).intValue();
        p pVar = this.d;
        int a2 = RecomposeScopeImplKt.a(this.f9720f | 1);
        int i3 = this.f9721g;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = MaterialThemeKt.f9712a;
        ComposerImpl g2 = ((Composer) obj).g(-1399457222);
        int i4 = i3 & 1;
        ColorScheme colorScheme = this.f9717a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(colorScheme) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i3 & 2;
        Shapes shapes2 = this.f9718b;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(shapes2) ? 32 : 16;
        }
        int i6 = i3 & 4;
        Typography typography2 = this.f9719c;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(typography2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            shapes = shapes2;
            typography = typography2;
        } else {
            ColorScheme colorScheme2 = i4 != 0 ? null : colorScheme;
            Shapes shapes3 = i5 != 0 ? null : shapes2;
            Typography typography3 = i6 == 0 ? typography2 : null;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = MaterialThemeKt.f9712a;
            if (((Boolean) g2.K(staticProvidableCompositionLocal2)).booleanValue()) {
                g2.J(547059915);
                g2.J(1126027167);
                ColorScheme a3 = colorScheme2 == null ? MaterialTheme.a(g2) : colorScheme2;
                g2.V(false);
                g2.J(1126029309);
                Typography b2 = typography3 == null ? MaterialTheme.b(g2) : typography3;
                g2.V(false);
                g2.J(1126031253);
                Shapes shapes4 = shapes3 == null ? (Shapes) g2.K(ShapesKt.f11185a) : shapes3;
                g2.V(false);
                MaterialThemeKt.a(a3, shapes4, b2, pVar, g2, i2 & 7168, 0);
                g2.V(false);
            } else {
                g2.J(547327197);
                CompositionLocalKt.a(staticProvidableCompositionLocal2.c(Boolean.TRUE), ComposableLambdaKt.c(2050809758, new MaterialThemeKt$MaterialExpressiveTheme$1(colorScheme2, shapes3, typography3, pVar), g2), g2, 56);
                g2.V(false);
            }
            typography = typography3;
            colorScheme = colorScheme2;
            shapes = shapes3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MaterialThemeKt$MaterialExpressiveTheme$2(colorScheme, shapes, typography, pVar, a2, i3);
        }
        return b0.f30125a;
    }
}
