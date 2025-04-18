package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfar implements zzcwp, zzcyl, zzfch, com.google.android.gms.ads.internal.overlay.zzr, zzcyx, zzcxc, zzdel {
    private final zzfgy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfar zzh = null;

    public zzfar(zzfgy zzfgyVar) {
        this.zza = zzfgyVar;
    }

    public static zzfar zzi(zzfar zzfarVar) {
        zzfar zzfarVar2 = new zzfar(zzfarVar.zza);
        zzfarVar2.zzh = zzfarVar;
        return zzfarVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdB(zzeVar);
        } else {
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbai) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfan
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbai) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdG();
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfai
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbam) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdq();
        } else {
            zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfaf
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdq();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdr();
            return;
        }
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdr();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbam) obj).zzf();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbam) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdt();
        } else {
            zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfap
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdt();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(final int i10) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzdu(i10);
        } else {
            zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfal
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdu(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzg() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzg();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzcyl) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzh(zzuVar);
        } else {
            zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfac
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(com.google.android.gms.ads.internal.client.zzu.this);
                }
            });
        }
    }

    public final void zzj() {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzj();
            return;
        }
        this.zza.zza();
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfaj
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbaj) obj).zza();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbam) obj).zzc();
            }
        });
    }

    public final void zzk(final zzbaf zzbafVar) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzk(zzbafVar);
        } else {
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbai) obj).zzd(zzbaf.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfch
    public final void zzl(zzfch zzfchVar) {
        this.zzh = (zzfar) zzfchVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzg.set(zzdrVar);
    }

    public final void zzo(zzbai zzbaiVar) {
        this.zzb.set(zzbaiVar);
    }

    public final void zzp(zzbam zzbamVar) {
        this.zzd.set(zzbamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfar zzfarVar = this.zzh;
        if (zzfarVar != null) {
            zzfarVar.zzq(zzeVar);
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbam) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }
}
