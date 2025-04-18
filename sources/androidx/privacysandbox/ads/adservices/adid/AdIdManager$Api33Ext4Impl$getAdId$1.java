package androidx.privacysandbox.ads.adservices.adid;

import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

@e(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", f = "AdIdManager.kt", l = {Opcodes.V18}, m = "getAdId")
/* loaded from: classes3.dex */
public final class AdIdManager$Api33Ext4Impl$getAdId$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f20805a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdIdManager.Api33Ext4Impl f20807c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManager$Api33Ext4Impl$getAdId$1(AdIdManager.Api33Ext4Impl api33Ext4Impl, g gVar) {
        super(gVar);
        this.f20807c = api33Ext4Impl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f20806b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20807c.a(this);
    }
}
