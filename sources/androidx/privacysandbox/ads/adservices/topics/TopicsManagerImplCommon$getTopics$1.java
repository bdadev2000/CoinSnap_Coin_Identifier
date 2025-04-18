package androidx.privacysandbox.ads.adservices.topics;

import h0.g;
import j0.c;
import j0.e;

@e(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
/* loaded from: classes3.dex */
public final class TopicsManagerImplCommon$getTopics$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public TopicsManagerImplCommon f20869a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopicsManagerImplCommon f20871c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, g gVar) {
        super(gVar);
        this.f20871c = topicsManagerImplCommon;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f20870b = obj;
        this.d |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.c(this.f20871c, null, this);
    }
}
