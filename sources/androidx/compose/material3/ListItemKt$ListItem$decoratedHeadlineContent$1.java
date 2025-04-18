package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class ListItemKt$ListItem$decoratedHeadlineContent$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListItemColors f9680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$decoratedHeadlineContent$1(ListItemColors listItemColors, p pVar) {
        super(2);
        this.f9680a = listItemColors;
        this.f9681b = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ListItemKt.b(this.f9680a.f9657b, ListTokens.f13422j, this.f9681b, composer, 48);
        }
        return b0.f30125a;
    }
}
