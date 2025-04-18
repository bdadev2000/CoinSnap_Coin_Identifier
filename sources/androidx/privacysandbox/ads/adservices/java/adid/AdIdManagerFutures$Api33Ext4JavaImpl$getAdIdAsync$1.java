package androidx.privacysandbox.ads.adservices.java.adid;

import androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdIdManagerFutures.Api33Ext4JavaImpl f20818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(AdIdManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, g gVar) {
        super(2, gVar);
        this.f20818b = api33Ext4JavaImpl;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this.f20818b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 adIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1 = (AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        adIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f20817a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return obj;
        }
        q.m(obj);
        this.f20818b.getClass();
        this.f20817a = 1;
        throw null;
    }
}
