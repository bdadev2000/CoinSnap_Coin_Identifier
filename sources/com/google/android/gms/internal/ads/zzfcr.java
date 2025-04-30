package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfcr implements zzczo, zzdbk, zzfeh, com.google.android.gms.ads.internal.overlay.zzp, zzdbw, zzdab, zzdhi {
    private final zzfiy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfcr zzh = null;

    public zzfcr(zzfiy zzfiyVar) {
        this.zza = zzfiyVar;
    }

    public static zzfcr zzi(zzfcr zzfcrVar) {
        zzfcr zzfcrVar2 = new zzfcr(zzfcrVar.zza);
        zzfcrVar2.zzh = zzfcrVar;
        return zzfcrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzdB(zzeVar);
        } else {
            zzfdy.zza(this.zzb, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcm
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((zzbcj) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
            zzfdy.zza(this.zzb, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcn
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((zzbcj) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzdG();
        } else {
            zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfci
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((zzbcn) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzdq();
        } else {
            zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcf
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdq();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzdr();
            return;
        }
        zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcq
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdr();
            }
        });
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcd
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((zzbcn) obj).zzf();
            }
        });
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfce
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((zzbcn) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzdt();
        } else {
            zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcp
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdt();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(final int i9) {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzdu(i9);
        } else {
            zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcl
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzp) obj).zzdu(i9);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    public final void zzg() {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzg();
        } else {
            zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfco
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((zzdbk) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzh(zzsVar);
        } else {
            zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcc
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    public final void zzj() {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzj();
            return;
        }
        this.zza.zza();
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((zzbck) obj).zza();
            }
        });
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfck
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((zzbcn) obj).zzc();
            }
        });
    }

    public final void zzk(final zzbcg zzbcgVar) {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzk(zzbcgVar);
        } else {
            zzfdy.zza(this.zzb, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfch
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((zzbcj) obj).zzd(zzbcg.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final void zzl(zzfeh zzfehVar) {
        this.zzh = (zzfcr) zzfehVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zzf.set(zzpVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzo(zzbcj zzbcjVar) {
        this.zzb.set(zzbcjVar);
    }

    public final void zzp(zzbcn zzbcnVar) {
        this.zzd.set(zzbcnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfcr zzfcrVar = this.zzh;
        if (zzfcrVar != null) {
            zzfcrVar.zzq(zzeVar);
        } else {
            zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfcg
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final void zza(Object obj) {
                    ((zzbcn) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }
}
