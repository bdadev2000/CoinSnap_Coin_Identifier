package androidx.compose.material3;

import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class MaterialThemeKt$MaterialExpressiveTheme$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ColorScheme f9714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shapes f9715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typography f9716c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialExpressiveTheme$1(ColorScheme colorScheme, Shapes shapes, Typography typography, p pVar) {
        super(2);
        this.f9714a = colorScheme;
        this.f9715b = shapes;
        this.f9716c = typography;
        this.d = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ColorScheme colorScheme = this.f9714a;
            if (colorScheme == null) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorSchemeKt.f8552a;
                long j2 = PaletteTokens.G;
                long j3 = PaletteTokens.N;
                colorScheme = ColorSchemeKt.g(0L, 0L, 0L, j2, 0L, 0L, 0L, 0L, j3, 0L, 0L, 0L, j3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15);
            }
            Shapes shapes = this.f9715b;
            if (shapes == null) {
                shapes = new Shapes();
            }
            Typography typography = this.f9716c;
            if (typography == null) {
                typography = new Typography(null, 32767);
            }
            MaterialThemeKt.a(colorScheme, shapes, typography, this.d, composer, 0, 0);
        }
        return b0.f30125a;
    }
}
