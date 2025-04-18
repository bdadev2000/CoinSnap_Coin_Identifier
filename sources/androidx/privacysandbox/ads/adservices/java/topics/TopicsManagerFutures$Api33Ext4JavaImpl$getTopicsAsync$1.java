package androidx.privacysandbox.ads.adservices.java.topics;

import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopicsManagerFutures.Api33Ext4JavaImpl f20857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GetTopicsRequest f20858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(TopicsManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, GetTopicsRequest getTopicsRequest, g gVar) {
        super(2, gVar);
        this.f20857b = api33Ext4JavaImpl;
        this.f20858c = getTopicsRequest;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this.f20857b, this.f20858c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f20856a;
        if (i2 == 0) {
            q.m(obj);
            TopicsManager topicsManager = this.f20857b.f20855a;
            this.f20856a = 1;
            obj = topicsManager.a(this.f20858c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
