package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzanj implements zzamz {
    private zzaeh zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzek zza = new zzek(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzb);
        if (this.zzc) {
            int zzb = zzekVar.zzb();
            int i2 = this.zzf;
            if (i2 < 10) {
                int min = Math.min(zzb, 10 - i2);
                System.arraycopy(zzekVar.zzN(), zzekVar.zzd(), this.zza.zzN(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzL(0);
                    if (this.zza.zzm() != 73 || this.zza.zzm() != 68 || this.zza.zzm() != 51) {
                        zzea.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzM(3);
                        this.zze = this.zza.zzl() + 10;
                    }
                }
            }
            int min2 = Math.min(zzb, this.zze - this.zzf);
            this.zzb.zzq(zzekVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 5);
        this.zzb = zzw;
        zzad zzadVar = new zzad();
        zzadVar.zzL(zzaonVar.zzb());
        zzadVar.zzZ("application/id3");
        zzw.zzl(zzadVar.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
        int i2;
        zzdi.zzb(this.zzb);
        if (this.zzc && (i2 = this.zze) != 0 && this.zzf == i2) {
            zzdi.zzf(this.zzd != -9223372036854775807L);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j2;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
