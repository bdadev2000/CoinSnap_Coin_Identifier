package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzdxe implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzdxe(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        zzfjr zzfjrVar = (zzfjr) this.zza.zzb();
        final CookieManager zza = com.google.android.gms.ads.internal.zzv.zzr().zza((Context) this.zzb.zzb());
        zzfjh zzi = zzfjb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaV));
            }
        }, zzfjl.WEBVIEW_COOKIE, zzfjrVar).zzi(1L, TimeUnit.SECONDS);
        final zzfiv zzfivVar = new zzfiv() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzgdp(zzfivVar) { // from class: com.google.android.gms.internal.ads.zzfjc
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh("");
            }
        }).zza();
    }
}
