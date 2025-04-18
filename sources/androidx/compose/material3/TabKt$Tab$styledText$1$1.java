package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class TabKt$Tab$styledText$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$styledText$1$1(p pVar) {
        super(2);
        this.f11777a = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextKt.a(TextStyle.a(3, 16744447, 0L, 0L, 0L, 0L, null, TypographyKt.a(PrimaryNavigationTabTokens.f13491f, composer), null, null, null), this.f11777a, composer, 0);
        }
        return b0.f30125a;
    }
}
