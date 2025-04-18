package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LookaheadScopeKt$LookaheadScope$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f15798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15799b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadScopeKt$LookaheadScope$4(q qVar, int i2) {
        super(2);
        this.f15798a = qVar;
        this.f15799b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f15799b | 1);
        LookaheadScopeKt.a(this.f15798a, (Composer) obj, a2);
        return b0.f30125a;
    }
}
