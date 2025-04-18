package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f4219a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(l lVar) {
        super(3);
        this.f4219a = lVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1608161351);
        l lVar = this.f4219a;
        boolean I = composer.I(lVar);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new ConsumedInsetsModifier(lVar);
            composer.o(u2);
        }
        ConsumedInsetsModifier consumedInsetsModifier = (ConsumedInsetsModifier) u2;
        composer.D();
        return consumedInsetsModifier;
    }
}
