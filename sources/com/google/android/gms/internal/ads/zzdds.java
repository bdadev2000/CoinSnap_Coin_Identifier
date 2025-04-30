package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
public final class zzdds implements AppEventListener, OnAdMetadataChangedListener, zzczl, com.google.android.gms.ads.internal.client.zza, zzdbw, zzdaf, zzdbk, com.google.android.gms.ads.internal.overlay.zzp, zzdab, zzdhi {
    private final zzddq zza = new zzddq(this, null);
    private zzepc zzb;
    private zzepg zzc;
    private zzfcr zzd;
    private zzffw zze;

    public static /* bridge */ /* synthetic */ void zzj(zzdds zzddsVar, zzepc zzepcVar) {
        zzddsVar.zzb = zzepcVar;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzdds zzddsVar, zzfcr zzfcrVar) {
        zzddsVar.zzd = zzfcrVar;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzdds zzddsVar, zzepg zzepgVar) {
        zzddsVar.zzc = zzepgVar;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzdds zzddsVar, zzffw zzffwVar) {
        zzddsVar.zze = zzffwVar;
    }

    private static void zzn(Object obj, zzddr zzddrVar) {
        if (obj != null) {
            zzddrVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdci
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcj
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepg) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdco
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcu
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddn
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zza();
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddo
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddg
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzb();
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddh
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcp
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzc();
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcq
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddd
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzdG();
            }
        });
        zzn(this.zzc, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddi
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepg) obj).zzdG();
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddj
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzdG();
            }
        });
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddk
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzdG();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddb
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcv
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzdf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcn
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdda
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzdq();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcw
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(final zzbyh zzbyhVar, final String str, final String str2) {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcr
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdct
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzds(zzbyh.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddc
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzdt();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(final int i9) {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdde
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzdu(i9);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdch
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcs
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdck
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcl
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    public final void zzg() {
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddf
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcx
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcy
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zzd, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcz
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzfcr) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final zzddq zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzffw) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzddm
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        zzn(this.zzb, new zzddr() { // from class: com.google.android.gms.internal.ads.zzdcm
            @Override // com.google.android.gms.internal.ads.zzddr
            public final void zza(Object obj) {
                ((zzepc) obj).zzr();
            }
        });
    }
}
