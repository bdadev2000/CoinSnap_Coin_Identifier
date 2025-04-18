package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14432c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$2(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i2) {
        super(2);
        this.f14430a = composableLambdaImpl;
        this.f14431b = obj;
        this.f14432c = obj2;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d) | 1;
        Object obj3 = this.f14431b;
        Object obj4 = this.f14432c;
        this.f14430a.c(obj3, obj4, (Composer) obj, a2);
        return b0.f30125a;
    }
}
