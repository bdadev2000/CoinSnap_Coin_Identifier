package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzelw implements zzegk {
    private final zzegm zza;
    private final zzegq zzb;
    private final zzflg zzc;
    private final zzgfz zzd;

    public zzelw(zzflg zzflgVar, zzgfz zzgfzVar, zzegm zzegmVar, zzegq zzegqVar) {
        this.zzc = zzflgVar;
        this.zzd = zzgfzVar;
        this.zzb = zzegqVar;
        this.zza = zzegmVar;
    }

    @VisibleForTesting
    public static final String zze(String str, int i2) {
        return "Error from: " + str + ", code: " + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar) {
        final zzegn zzegnVar;
        Iterator it = zzfghVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzegnVar = null;
                break;
            }
            try {
                zzegnVar = this.zza.zza((String) it.next(), zzfghVar.zzv);
                break;
            } catch (zzfhj unused) {
            }
        }
        if (zzegnVar == null) {
            return zzgfo.zzg(new zzejm("Unable to instantiate mediation adapter class."));
        }
        zzcas zzcasVar = new zzcas();
        zzegnVar.zzc.zza(new zzelv(this, zzegnVar, zzcasVar));
        if (zzfghVar.zzM) {
            Bundle bundle = zzfgtVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzflg zzflgVar = this.zzc;
        return zzfkq.zzd(new zzfkk() { // from class: com.google.android.gms.internal.ads.zzelt
            @Override // com.google.android.gms.internal.ads.zzfkk
            public final void zza() {
                zzelw.this.zzd(zzfgtVar, zzfghVar, zzegnVar);
            }
        }, this.zzd, zzfla.ADAPTER_LOAD_AD_SYN, zzflgVar).zzb(zzfla.ADAPTER_LOAD_AD_ACK).zzd(zzcasVar).zzb(zzfla.ADAPTER_WRAP_ADAPTER).zze(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzelu
            @Override // com.google.android.gms.internal.ads.zzfkj
            public final Object zza(Object obj) {
                return zzelw.this.zzc(zzfgtVar, zzfghVar, zzegnVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        return !zzfghVar.zzt.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar, Void r4) throws Exception {
        return this.zzb.zza(zzfgtVar, zzfghVar, zzegnVar);
    }

    public final /* synthetic */ void zzd(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws Exception {
        this.zzb.zzb(zzfgtVar, zzfghVar, zzegnVar);
    }
}
