package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextLinkScope$LinksComposables$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$2(TextLinkScope textLinkScope, int i2) {
        super(2);
        this.f6225a = textLinkScope;
        this.f6226b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f6226b | 1);
        this.f6225a.a((Composer) obj, a2);
        return b0.f30125a;
    }
}
