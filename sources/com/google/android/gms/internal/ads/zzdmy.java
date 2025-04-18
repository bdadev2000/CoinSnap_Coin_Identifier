package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdmy {
    private final zzffo zza;
    private final Executor zzb;
    private final zzdpn zzc;
    private final zzdoi zzd;
    private final Context zze;
    private final zzdsm zzf;
    private final zzflr zzg;
    private final zzedp zzh;

    public zzdmy(zzffo zzffoVar, Executor executor, zzdpn zzdpnVar, Context context, zzdsm zzdsmVar, zzflr zzflrVar, zzedp zzedpVar, zzdoi zzdoiVar) {
        this.zza = zzffoVar;
        this.zzb = executor;
        this.zzc = zzdpnVar;
        this.zze = context;
        this.zzf = zzdsmVar;
        this.zzg = zzflrVar;
        this.zzh = zzedpVar;
        this.zzd = zzdoiVar;
    }

    private final void zzh(zzcfk zzcfkVar) {
        zzj(zzcfkVar);
        zzcfkVar.zzag("/video", zzbjq.zzl);
        zzcfkVar.zzag("/videoMeta", zzbjq.zzm);
        zzcfkVar.zzag("/precache", new zzcds());
        zzcfkVar.zzag("/delayPageLoaded", zzbjq.zzp);
        zzcfkVar.zzag("/instrument", zzbjq.zzn);
        zzcfkVar.zzag("/log", zzbjq.zzg);
        zzcfkVar.zzag("/click", new zzbip(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcfkVar.zzN().zzF(true);
            zzcfkVar.zzag("/open", new zzbkd(null, null, null, null, null));
        } else {
            zzcfkVar.zzN().zzF(false);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcfkVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcfkVar.zzD() != null) {
                hashMap = zzcfkVar.zzD().zzaw;
            }
            zzcfkVar.zzag("/logScionEvent", new zzbjx(zzcfkVar.getContext(), hashMap));
        }
    }

    private final void zzi(zzcfk zzcfkVar, zzcan zzcanVar) {
        if (this.zza.zza != null && zzcfkVar.zzq() != null) {
            zzcfkVar.zzq().zzs(this.zza.zza);
        }
        zzcanVar.zzb();
    }

    private static final void zzj(zzcfk zzcfkVar) {
        zzcfkVar.zzag("/videoClicked", zzbjq.zzh);
        zzcfkVar.zzN().zzH(true);
        zzcfkVar.zzag("/getNativeAdViewSignals", zzbjq.zzs);
        zzcfkVar.zzag("/getNativeClickMeta", zzbjq.zzt);
    }

    public final ua.b zza(final JSONObject jSONObject) {
        return zzgei.zzn(zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdmy.this.zze(obj);
            }
        }, this.zzb), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdmy.this.zzc(jSONObject, (zzcfk) obj);
            }
        }, this.zzb);
    }

    public final ua.b zzb(final String str, final String str2, final zzfet zzfetVar, final zzfew zzfewVar, final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        return zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdmn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdmy.this.zzd(zzsVar, zzfetVar, zzfewVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ua.b zzc(JSONObject jSONObject, final zzcfk zzcfkVar) throws Exception {
        zzbmb zzbmbVar = this.zza.zzb;
        final zzcan zza = zzcan.zza(zzcfkVar);
        if (zzbmbVar != null) {
            zzcfkVar.zzaj(zzche.zzd());
        } else {
            zzcfkVar.zzaj(zzche.zze());
        }
        zzcfkVar.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z10, int i10, String str, String str2) {
                zzdmy.this.zzf(zzcfkVar, zza, z10, i10, str, str2);
            }
        });
        zzcfkVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ ua.b zzd(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfet zzfetVar, zzfew zzfewVar, String str, String str2, Object obj) throws Exception {
        final zzcfk zza = this.zzc.zza(zzsVar, zzfetVar, zzfewVar);
        final zzcan zza2 = zzcan.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzaj(zzche.zzd());
        } else {
            zzdof zzb = this.zzd.zzb();
            zza.zzN().zzU(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzb, null, null, null, null);
            zzj(zza);
        }
        zza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzcha
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzdmy.this.zzg(zza, zza2, z10, i10, str3, str4);
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ ua.b zze(Object obj) throws Exception {
        zzcfk zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        final zzcan zza2 = zzcan.zza(zza);
        zzh(zza);
        zza.zzN().zzI(new zzchb() { // from class: com.google.android.gms.internal.ads.zzdms
            @Override // com.google.android.gms.internal.ads.zzchb
            public final void zza() {
                zzcan.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdQ));
        return zza2;
    }

    public final /* synthetic */ void zzf(zzcfk zzcfkVar, zzcan zzcanVar, boolean z10, int i10, String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdY)).booleanValue()) {
            if (z10) {
                zzi(zzcfkVar, zzcanVar);
                return;
            }
            zzcanVar.zzd(new zzeiz(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
            return;
        }
        zzi(zzcfkVar, zzcanVar);
    }

    public final /* synthetic */ void zzg(zzcfk zzcfkVar, zzcan zzcanVar, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (this.zza.zza != null && zzcfkVar.zzq() != null) {
                zzcfkVar.zzq().zzs(this.zza.zza);
            }
            zzcanVar.zzb();
            return;
        }
        zzcanVar.zzd(new zzeiz(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
