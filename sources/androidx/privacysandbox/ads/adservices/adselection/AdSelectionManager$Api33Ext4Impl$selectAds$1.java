package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

@e(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", f = "AdSelectionManager.kt", l = {Opcodes.DUP2}, m = "selectAds")
/* loaded from: classes3.dex */
public final class AdSelectionManager$Api33Ext4Impl$selectAds$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSelectionManager.Api33Ext4Impl f20809b;

    /* renamed from: c, reason: collision with root package name */
    public int f20810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManager$Api33Ext4Impl$selectAds$1(AdSelectionManager.Api33Ext4Impl api33Ext4Impl, g gVar) {
        super(gVar);
        this.f20809b = api33Ext4Impl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f20808a = obj;
        this.f20810c |= Integer.MIN_VALUE;
        return this.f20809b.b(null, this);
    }
}
