package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Transition$animateTo$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f2307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$2(Transition transition, Object obj, int i2) {
        super(2);
        this.f2307a = transition;
        this.f2308b = obj;
        this.f2309c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f2309c | 1);
        this.f2307a.a(this.f2308b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
