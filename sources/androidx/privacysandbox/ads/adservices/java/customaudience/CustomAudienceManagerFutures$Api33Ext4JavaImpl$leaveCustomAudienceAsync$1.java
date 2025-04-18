package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", l = {Opcodes.LSHR}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomAudienceManagerFutures.Api33Ext4JavaImpl f20831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LeaveCustomAudienceRequest f20832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(CustomAudienceManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, LeaveCustomAudienceRequest leaveCustomAudienceRequest, g gVar) {
        super(2, gVar);
        this.f20831b = api33Ext4JavaImpl;
        this.f20832c = leaveCustomAudienceRequest;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this.f20831b, this.f20832c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1 customAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1 = (CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        customAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f20830a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return b0.f30125a;
        }
        q.m(obj);
        this.f20831b.getClass();
        p0.a.p(null);
        this.f20830a = 1;
        throw null;
    }
}
