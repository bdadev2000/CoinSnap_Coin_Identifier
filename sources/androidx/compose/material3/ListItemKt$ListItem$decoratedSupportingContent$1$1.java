package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class ListItemKt$ListItem$decoratedSupportingContent$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListItemColors f9686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$decoratedSupportingContent$1$1(ListItemColors listItemColors, p pVar) {
        super(2);
        this.f9686a = listItemColors;
        this.f9687b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ListItemKt.b(this.f9686a.e, ListTokens.f13429q, this.f9687b, composer, 48);
        }
        return b0.f30125a;
    }
}
