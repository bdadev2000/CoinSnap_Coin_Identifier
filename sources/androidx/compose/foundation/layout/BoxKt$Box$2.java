package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BoxKt$Box$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f3799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxKt$Box$2(Modifier modifier, int i2) {
        super(2);
        this.f3799a = modifier;
        this.f3800b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f3800b | 1);
        BoxKt.a(this.f3799a, (Composer) obj, a2);
        return b0.f30125a;
    }
}
