package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ProvideTextStyleFromToken$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypographyKeyTokens f9696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9697c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ProvideTextStyleFromToken$1(long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2) {
        super(2);
        this.f9695a = j2;
        this.f9696b = typographyKeyTokens;
        this.f9697c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ListItemKt.b(this.f9695a, this.f9696b, this.f9697c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1));
        return b0.f30125a;
    }
}
