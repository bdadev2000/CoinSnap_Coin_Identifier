package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class WindowInsetsPaddingKt$consumeWindowInsets$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f4218a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$consumeWindowInsets$2(WindowInsets windowInsets) {
        super(3);
        this.f4218a = windowInsets;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(788931215);
        WindowInsets windowInsets = this.f4218a;
        boolean I = composer.I(windowInsets);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new UnionInsetsConsumingModifier(windowInsets);
            composer.o(u2);
        }
        UnionInsetsConsumingModifier unionInsetsConsumingModifier = (UnionInsetsConsumingModifier) u2;
        composer.D();
        return unionInsetsConsumingModifier;
    }
}
