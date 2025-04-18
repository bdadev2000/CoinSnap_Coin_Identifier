package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class NavigationBarKt$NavigationBarItem$styledLabel$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemColors f10005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10007c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$styledLabel$1$1(NavigationBarItemColors navigationBarItemColors, boolean z2, boolean z3, p pVar) {
        super(2);
        this.f10005a = navigationBarItemColors;
        this.f10006b = z2;
        this.f10007c = z3;
        this.d = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextStyle a2 = TypographyKt.a(NavigationBarTokens.f13444g, composer);
            boolean z2 = this.f10007c;
            NavigationBarItemColors navigationBarItemColors = this.f10005a;
            ProvideContentColorTextStyleKt.a(((Color) SingleValueAnimationKt.a(!z2 ? navigationBarItemColors.f9968g : this.f10006b ? navigationBarItemColors.f9965b : navigationBarItemColors.e, AnimationSpecKt.d(100, 0, null, 6), composer, 48).getValue()).f14964a, a2, this.d, composer, 0);
        }
        return b0.f30125a;
    }
}
