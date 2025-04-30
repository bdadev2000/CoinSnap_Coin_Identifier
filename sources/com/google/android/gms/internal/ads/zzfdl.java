package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfdl implements zzfek {
    private zzcys zza;
    private final Executor zzb = zzggk.zzb();

    public final zzcys zza() {
        return this.zza;
    }

    public final f4.c zzb(zzfel zzfelVar, zzfej zzfejVar, @Nullable zzcys zzcysVar) {
        zzcyr zza = zzfejVar.zza(zzfelVar.zzb);
        zza.zzb(new zzfeo(true));
        zzcys zzcysVar2 = (zzcys) zza.zzh();
        this.zza = zzcysVar2;
        final zzcvx zzb = zzcysVar2.zzb();
        final zzfjl zzfjlVar = new zzfjl();
        return zzgft.zzm(zzgft.zzn(zzgfk.zzu(zzb.zzj()), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzfdj
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                zzfhf zzfhfVar = (zzfhf) obj;
                zzfjlVar.zzb = zzfhfVar;
                Iterator it = zzfhfVar.zzb.zza.iterator();
                boolean z8 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfgt) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z8 = true;
                        }
                    } else if (z8) {
                        return zzb.zzi(zzgft.zzh(zzfhfVar));
                    }
                }
                return zzgft.zzh(null);
            }
        }, this.zzb), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfdk
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzfjl zzfjlVar2 = zzfjl.this;
                zzfjlVar2.zzc = (zzcup) obj;
                return zzfjlVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* bridge */ /* synthetic */ f4.c zzc(zzfel zzfelVar, zzfej zzfejVar, @Nullable Object obj) {
        return zzb(zzfelVar, zzfejVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfek
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
