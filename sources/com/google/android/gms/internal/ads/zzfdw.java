package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfdw implements OnAdMetadataChangedListener, zzcya, zzcwp, zzcwm, zzcxc, zzcyx, zzfch, zzdel {
    private final zzfgy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfdw zzi = null;

    public zzfdw(zzfgy zzfgyVar) {
        this.zza = zzfgyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.onAdMetadataChanged();
        } else {
            zzfby.zza(this.zzb, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdk
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zza();
            return;
        }
        this.zza.zza();
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbxf) obj).zzg();
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdt
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbwp) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzb();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdu
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbwp) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzc();
            return;
        }
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfde
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbxf) obj).zzj();
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdf
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbwp) obj).zzj();
            }
        });
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbxf) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzdB(zzeVar);
            return;
        }
        final int i10 = zzeVar.zza;
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbxj) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdq
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbxj) obj).zze(i10);
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdr
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbwp) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzdG();
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdl
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbxf) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(final zzbwj zzbwjVar, final String str, final String str2) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzds(zzbwjVar, str, str2);
            return;
        }
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdv
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                zzbwj zzbwjVar2 = zzbwj.this;
                ((zzbxf) obj).zzk(new zzbxt(zzbwjVar2.zzc(), zzbwjVar2.zzb()));
            }
        });
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdb
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                zzbwj zzbwjVar2 = zzbwj.this;
                ((zzbxk) obj).zze(new zzbxt(zzbwjVar2.zzc(), zzbwjVar2.zzb()), str, str2);
            }
        });
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdc
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbwp) obj).zze(zzbwj.this);
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdd
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((zzbwk) obj).zze(zzbwj.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zze();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdo
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbwp) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzf();
        } else {
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfda
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbwp) obj).zzl();
                }
            });
        }
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzh(zzuVar);
        } else {
            zzfby.zza(this.zzh, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdh
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(com.google.android.gms.ads.internal.client.zzu.this);
                }
            });
        }
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzh.set(zzdrVar);
    }

    public final void zzj(zzbxf zzbxfVar) {
        this.zzd.set(zzbxfVar);
    }

    public final void zzk(zzbxj zzbxjVar) {
        this.zzc.set(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfch
    public final void zzl(zzfch zzfchVar) {
        this.zzi = (zzfdw) zzfchVar;
    }

    @Deprecated
    public final void zzm(zzbwp zzbwpVar) {
        this.zze.set(zzbwpVar);
    }

    @Deprecated
    public final void zzn(zzbwk zzbwkVar) {
        this.zzg.set(zzbwkVar);
    }

    public final void zzo(zzbxk zzbxkVar) {
        this.zzf.set(zzbxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzq(zzeVar);
        } else {
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdm
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbxf) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
            zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdn
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbxf) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        zzfdw zzfdwVar = this.zzi;
        if (zzfdwVar != null) {
            zzfdwVar.zzs();
        } else {
            zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdi
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbxj) obj).zzg();
                }
            });
            zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzfdj
                @Override // com.google.android.gms.internal.ads.zzfbx
                public final void zza(Object obj) {
                    ((zzbwp) obj).zzi();
                }
            });
        }
    }
}
