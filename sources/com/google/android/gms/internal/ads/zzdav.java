package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes3.dex */
public final class zzdav implements AppEventListener, OnAdMetadataChangedListener, zzcwm, com.google.android.gms.ads.internal.client.zza, zzcyx, zzcxg, zzcyl, com.google.android.gms.ads.internal.overlay.zzr, zzcxc, zzdel {
    private final zzdas zza = new zzdas(this, null);
    private zzems zzb;
    private zzemw zzc;
    private zzfar zzd;
    private zzfdw zze;

    private static void zzn(Object obj, zzdat zzdatVar) {
        if (obj != null) {
            zzdatVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzemw) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczx
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdaq
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zza();
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdar
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdaj
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzb();
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdak
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzc();
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdag
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzdG();
            }
        });
        zzn(this.zzc, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdal
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzemw) obj).zzdG();
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdam
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzdG();
            }
        });
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdan
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzdG();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdae
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczy
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzdf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdad
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzdq();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczz
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(final zzbwj zzbwjVar, final String str, final String str2) {
        zzn(this.zzb, new zzdat(zzbwjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzds(zzbwj.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdaf
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzdt();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(final int i10) {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdah
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzdu(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzg() {
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdai
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdaa
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzh(com.google.android.gms.ads.internal.client.zzu.this);
            }
        });
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdab
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzh(com.google.android.gms.ads.internal.client.zzu.this);
            }
        });
        zzn(this.zzd, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdac
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfar) obj).zzh(com.google.android.gms.ads.internal.client.zzu.this);
            }
        });
    }

    public final zzdas zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdao
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzfdw) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzdap
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzn(this.zzb, new zzdat() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // com.google.android.gms.internal.ads.zzdat
            public final void zza(Object obj) {
                ((zzems) obj).zzr();
            }
        });
    }
}
