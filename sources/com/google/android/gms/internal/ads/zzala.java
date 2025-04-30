package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzala implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzakz
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzala()};
        }
    };
    private zzadx zzb;
    private zzali zzc;
    private boolean zzd;

    private final boolean zza(zzadv zzadvVar) throws IOException {
        zzalc zzalcVar = new zzalc();
        if (zzalcVar.zzb(zzadvVar, true) && (zzalcVar.zza & 2) == 2) {
            int min = Math.min(zzalcVar.zze, 8);
            zzfu zzfuVar = new zzfu(min);
            ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, min, false);
            zzfuVar.zzK(0);
            if (zzfuVar.zzb() >= 5 && zzfuVar.zzm() == 127 && zzfuVar.zzu() == 1179402563) {
                this.zzc = new zzaky();
            } else {
                zzfuVar.zzK(0);
                try {
                    if (zzafg.zzd(1, zzfuVar, true)) {
                        this.zzc = new zzalk();
                    }
                } catch (zzch unused) {
                }
                zzfuVar.zzK(0);
                if (zzale.zzd(zzfuVar)) {
                    this.zzc = new zzale();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzb);
        if (this.zzc == null) {
            if (zza(zzadvVar)) {
                zzadvVar.zzj();
            } else {
                throw zzch.zza("Failed to determine bitstream type", null);
            }
        }
        if (!this.zzd) {
            zzafa zzw = this.zzb.zzw(0, 1);
            this.zzb.zzD();
            this.zzc.zzh(this.zzb, zzw);
            this.zzd = true;
        }
        return this.zzc.zze(zzadvVar, zzaeqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        zzali zzaliVar = this.zzc;
        if (zzaliVar != null) {
            zzaliVar.zzj(j7, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        try {
            return zza(zzadvVar);
        } catch (zzch unused) {
            return false;
        }
    }
}
