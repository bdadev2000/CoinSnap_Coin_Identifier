package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzezm implements zzevz {
    private final zzbzz zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzges zze;

    public zzezm(zzbzz zzbzzVar, boolean z10, boolean z11, zzbzo zzbzoVar, zzges zzgesVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzzVar;
        this.zzb = z10;
        this.zzc = z11;
        this.zze = zzgesVar;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgS)).booleanValue() && this.zzc) {
            return zzgei.zzh(null);
        }
        if (!this.zzb) {
            return zzgei.zzh(null);
        }
        return zzgei.zze(zzgei.zzo(zzgei.zzm(zzgei.zzh(null), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzezk
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzezn(str);
            }
        }, this.zze), ((Long) zzbfb.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzezl
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzezm.this.zzc((Exception) obj);
                return null;
            }
        }, this.zze);
    }

    public final /* synthetic */ zzezn zzc(Exception exc) {
        this.zza.zzw(exc, "TrustlessTokenSignal");
        return null;
    }
}
