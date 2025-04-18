package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
final class NavigationRailKt$NavigationRailItem$styledLabel$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationRailItemColors f10360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10362c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$styledLabel$1$1(NavigationRailItemColors navigationRailItemColors, boolean z2, boolean z3, p pVar) {
        super(2);
        this.f10360a = navigationRailItemColors;
        this.f10361b = z2;
        this.f10362c = z3;
        this.d = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextStyle a2 = TypographyKt.a(NavigationRailTokens.f13452g, composer);
            boolean z2 = this.f10362c;
            NavigationRailItemColors navigationRailItemColors = this.f10360a;
            ProvideContentColorTextStyleKt.a(((Color) SingleValueAnimationKt.a(!z2 ? navigationRailItemColors.f10320g : this.f10361b ? navigationRailItemColors.f10317b : navigationRailItemColors.e, AnimationSpecKt.d(Opcodes.FCMPG, 0, null, 6), composer, 48).getValue()).f14964a, a2, this.d, composer, 0);
        }
        return b0.f30125a;
    }
}
