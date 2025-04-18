package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzekn implements zzefb {
    private final zzefd zza;
    private final zzefh zzb;
    private final zzfjr zzc;
    private final zzges zzd;

    public zzekn(zzfjr zzfjrVar, zzges zzgesVar, zzefd zzefdVar, zzefh zzefhVar) {
        this.zzc = zzfjrVar;
        this.zzd = zzgesVar;
        this.zzb = zzefhVar;
        this.zza = zzefdVar;
    }

    public static final String zze(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        final zzefe zzefeVar;
        Iterator it = zzfetVar.zzt.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    zzefeVar = this.zza.zza((String) it.next(), zzfetVar.zzv);
                    break;
                } catch (zzffv unused) {
                }
            } else {
                zzefeVar = null;
                break;
            }
        }
        if (zzefeVar == null) {
            return zzgei.zzg(new zzeid("Unable to instantiate mediation adapter class."));
        }
        zzcao zzcaoVar = new zzcao();
        zzefeVar.zzc.zza(new zzekm(this, zzefeVar, zzcaoVar));
        if (zzfetVar.zzM) {
            Bundle bundle = zzfffVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfjr zzfjrVar = this.zzc;
        return zzfjb.zzd(new zzfiw() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzfiw
            public final void zza() {
                zzekn.this.zzd(zzfffVar, zzfetVar, zzefeVar);
            }
        }, this.zzd, zzfjl.ADAPTER_LOAD_AD_SYN, zzfjrVar).zzb(zzfjl.ADAPTER_LOAD_AD_ACK).zzd(zzcaoVar).zzb(zzfjl.ADAPTER_WRAP_ADAPTER).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                return zzekn.this.zzc(zzfffVar, zzfetVar, zzefeVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        return !zzfetVar.zzt.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar, Void r42) throws Exception {
        return this.zzb.zza(zzfffVar, zzfetVar, zzefeVar);
    }

    public final /* synthetic */ void zzd(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws Exception {
        this.zzb.zzb(zzfffVar, zzfetVar, zzefeVar);
    }
}
