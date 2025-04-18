package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl f20820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReportImpressionRequest f20821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, ReportImpressionRequest reportImpressionRequest, g gVar) {
        super(2, gVar);
        this.f20820b = api33Ext4JavaImpl;
        this.f20821c = reportImpressionRequest;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this.f20820b, this.f20821c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 adSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1 = (AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        adSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f20819a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return b0.f30125a;
        }
        q.m(obj);
        this.f20820b.getClass();
        p0.a.p(null);
        this.f20819a = 1;
        throw null;
    }
}
