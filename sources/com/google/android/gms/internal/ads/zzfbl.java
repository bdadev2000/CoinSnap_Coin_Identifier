package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfbl implements zzfck {
    private zzcvt zza;
    private final Executor zzb = zzgey.zzb();

    public final zzcvt zza() {
        return this.zza;
    }

    public final ua.b zzb(zzfcl zzfclVar, zzfcj zzfcjVar, @Nullable zzcvt zzcvtVar) {
        zzcvs zza = zzfcjVar.zza(zzfclVar.zzb);
        zza.zzb(new zzfco(true));
        zzcvt zzcvtVar2 = (zzcvt) zza.zzh();
        this.zza = zzcvtVar2;
        final zzcsy zzb = zzcvtVar2.zzb();
        final zzfhl zzfhlVar = new zzfhl();
        return (zzgdz) zzgei.zzm((zzgdz) zzgei.zzn(zzgdz.zzu(zzb.zzj()), new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzfbj
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                zzfff zzfffVar = (zzfff) obj;
                zzfhlVar.zzb = zzfffVar;
                Iterator it = zzfffVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfet) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzb.zzi(zzgei.zzh(zzfffVar));
                    }
                }
                return zzgei.zzh(null);
            }
        }, this.zzb), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzfhl zzfhlVar2 = zzfhl.this;
                zzfhlVar2.zzc = (zzcrq) obj;
                return zzfhlVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ ua.b zzc(zzfcl zzfclVar, zzfcj zzfcjVar, @Nullable Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
