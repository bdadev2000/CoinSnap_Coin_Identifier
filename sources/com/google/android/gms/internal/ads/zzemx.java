package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzemx implements zzehl {
    private final zzehn zza;
    private final zzehr zzb;
    private final zzflt zzc;
    private final zzgge zzd;

    public zzemx(zzflt zzfltVar, zzgge zzggeVar, zzehn zzehnVar, zzehr zzehrVar) {
        this.zzc = zzfltVar;
        this.zzd = zzggeVar;
        this.zzb = zzehrVar;
        this.zza = zzehnVar;
    }

    public static final String zze(String str, int i9) {
        return "Error from: " + str + ", code: " + i9;
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final zzeho zzehoVar;
        Iterator it = zzfgtVar.zzu.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    zzehoVar = this.zza.zza((String) it.next(), zzfgtVar.zzw);
                    break;
                } catch (zzfhv unused) {
                }
            } else {
                zzehoVar = null;
                break;
            }
        }
        if (zzehoVar == null) {
            return zzgft.zzg(new zzekn("Unable to instantiate mediation adapter class."));
        }
        zzccn zzccnVar = new zzccn();
        zzehoVar.zzc.zza(new zzemw(this, zzehoVar, zzccnVar));
        if (zzfgtVar.zzN) {
            Bundle bundle = zzfhfVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzflt zzfltVar = this.zzc;
        return zzfld.zzd(new zzfkx() { // from class: com.google.android.gms.internal.ads.zzemu
            @Override // com.google.android.gms.internal.ads.zzfkx
            public final void zza() {
                zzemx.this.zzd(zzfhfVar, zzfgtVar, zzehoVar);
            }
        }, this.zzd, zzfln.ADAPTER_LOAD_AD_SYN, zzfltVar).zzb(zzfln.ADAPTER_LOAD_AD_ACK).zzd(zzccnVar).zzb(zzfln.ADAPTER_WRAP_ADAPTER).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzemv
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                return zzemx.this.zzc(zzfhfVar, zzfgtVar, zzehoVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        if (!zzfgtVar.zzu.isEmpty()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object zzc(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar, Void r42) throws Exception {
        return this.zzb.zza(zzfhfVar, zzfgtVar, zzehoVar);
    }

    public final /* synthetic */ void zzd(zzfhf zzfhfVar, zzfgt zzfgtVar, zzeho zzehoVar) throws Exception {
        this.zzb.zzb(zzfhfVar, zzfgtVar, zzehoVar);
    }
}
