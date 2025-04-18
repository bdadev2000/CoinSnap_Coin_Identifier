package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", f = "AdSelectionManagerFutures.kt", l = {Opcodes.DUP2_X2}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl f20823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSelectionConfig f20824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, AdSelectionConfig adSelectionConfig, g gVar) {
        super(2, gVar);
        this.f20823b = api33Ext4JavaImpl;
        this.f20824c = adSelectionConfig;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this.f20823b, this.f20824c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1 adSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1 = (AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        adSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f20822a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return obj;
        }
        q.m(obj);
        this.f20823b.getClass();
        p0.a.p(null);
        this.f20822a = 1;
        throw null;
    }
}
