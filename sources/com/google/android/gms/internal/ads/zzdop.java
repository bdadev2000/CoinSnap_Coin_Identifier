package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdop {
    private final zzfhc zza;
    private final Executor zzb;
    private final zzdre zzc;
    private final zzdpz zzd;
    private final Context zze;
    private final zzdud zzf;
    private final zzfng zzg;
    private final zzeey zzh;

    public zzdop(zzfhc zzfhcVar, Executor executor, zzdre zzdreVar, Context context, zzdud zzdudVar, zzfng zzfngVar, zzeey zzeeyVar, zzdpz zzdpzVar) {
        this.zza = zzfhcVar;
        this.zzb = executor;
        this.zzc = zzdreVar;
        this.zze = context;
        this.zzf = zzdudVar;
        this.zzg = zzfngVar;
        this.zzh = zzeeyVar;
        this.zzd = zzdpzVar;
    }

    private final void zzh(zzcfo zzcfoVar) {
        zzj(zzcfoVar);
        zzcfoVar.zzag("/video", zzbjv.zzl);
        zzcfoVar.zzag("/videoMeta", zzbjv.zzm);
        zzcfoVar.zzag("/precache", new zzcdw());
        zzcfoVar.zzag("/delayPageLoaded", zzbjv.zzp);
        zzcfoVar.zzag("/instrument", zzbjv.zzn);
        zzcfoVar.zzag("/log", zzbjv.zzg);
        zzcfoVar.zzag("/click", new zzbiu(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcfoVar.zzN().zzE(true);
            zzcfoVar.zzag("/open", new zzbki(null, null, null, null, null));
        } else {
            zzcfoVar.zzN().zzE(false);
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(zzcfoVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcfoVar.zzD() != null) {
                hashMap = zzcfoVar.zzD().zzaw;
            }
            zzcfoVar.zzag("/logScionEvent", new zzbkc(zzcfoVar.getContext(), hashMap));
        }
    }

    private final void zzi(zzcfo zzcfoVar, zzcar zzcarVar) {
        if (this.zza.zza != null && zzcfoVar.zzq() != null) {
            zzcfoVar.zzq().zzs(this.zza.zza);
        }
        zzcarVar.zzb();
    }

    private static final void zzj(zzcfo zzcfoVar) {
        zzcfoVar.zzag("/videoClicked", zzbjv.zzh);
        zzcfoVar.zzN().zzG(true);
        zzcfoVar.zzag("/getNativeAdViewSignals", zzbjv.zzs);
        zzcfoVar.zzag("/getNativeClickMeta", zzbjv.zzt);
    }

    public final ListenableFuture zza(final JSONObject jSONObject) {
        return zzgfo.zzn(zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdog
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdop.this.zze(obj);
            }
        }, this.zzb), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdof
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdop.this.zzc(jSONObject, (zzcfo) obj);
            }
        }, this.zzb);
    }

    public final ListenableFuture zzb(final String str, final String str2, final zzfgh zzfghVar, final zzfgk zzfgkVar, final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        return zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdop.this.zzd(zzsVar, zzfghVar, zzfgkVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, final zzcfo zzcfoVar) throws Exception {
        zzbmg zzbmgVar = this.zza.zzb;
        final zzcar zza = zzcar.zza(zzcfoVar);
        if (zzbmgVar != null) {
            zzcfoVar.zzaj(zzchi.zzd());
        } else {
            zzcfoVar.zzaj(zzchi.zze());
        }
        zzcfoVar.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdoh
            @Override // com.google.android.gms.internal.ads.zzche
            public final void zza(boolean z2, int i2, String str, String str2) {
                zzdop.this.zzf(zzcfoVar, zza, z2, i2, str, str2);
            }
        });
        zzcfoVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfgh zzfghVar, zzfgk zzfgkVar, String str, String str2, Object obj) throws Exception {
        final zzcfo zza = this.zzc.zza(zzsVar, zzfghVar, zzfgkVar);
        final zzcar zza2 = zzcar.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzaj(zzchi.zzd());
        } else {
            zzdpw zzb = this.zzd.zzb();
            zza.zzN().zzS(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzb, null, null, null, null);
            zzj(zza);
        }
        zza.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // com.google.android.gms.internal.ads.zzche
            public final void zza(boolean z2, int i2, String str3, String str4) {
                zzdop.this.zzg(zza, zza2, z2, i2, str3, str4);
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ ListenableFuture zze(Object obj) throws Exception {
        zzcfo zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        final zzcar zza2 = zzcar.zza(zza);
        zzh(zza);
        zza.zzN().zzH(new zzchf() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // com.google.android.gms.internal.ads.zzchf
            public final void zza() {
                zzcar.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdJ));
        return zza2;
    }

    public final /* synthetic */ void zzf(zzcfo zzcfoVar, zzcar zzcarVar, boolean z2, int i2, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdR)).booleanValue()) {
            zzi(zzcfoVar, zzcarVar);
            return;
        }
        if (z2) {
            zzi(zzcfoVar, zzcarVar);
            return;
        }
        zzcarVar.zzd(new zzeki(1, "Native Video WebView failed to load. Error code: " + i2 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public final /* synthetic */ void zzg(zzcfo zzcfoVar, zzcar zzcarVar, boolean z2, int i2, String str, String str2) {
        if (z2) {
            if (this.zza.zza != null && zzcfoVar.zzq() != null) {
                zzcfoVar.zzq().zzs(this.zza.zza);
            }
            zzcarVar.zzb();
            return;
        }
        zzcarVar.zzd(new zzeki(1, "Html video Web View failed to load. Error code: " + i2 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
