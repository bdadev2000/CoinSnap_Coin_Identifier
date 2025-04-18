package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class ListItemKt$ListItem$decoratedOverlineContent$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListItemColors f9684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$decoratedOverlineContent$1$1(ListItemColors listItemColors, p pVar) {
        super(2);
        this.f9684a = listItemColors;
        this.f9685b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ListItemKt.b(this.f9684a.d, ListTokens.f13427o, this.f9685b, composer, 48);
        }
        return b0.f30125a;
    }
}
