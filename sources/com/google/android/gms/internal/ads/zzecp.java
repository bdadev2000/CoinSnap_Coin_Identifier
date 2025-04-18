package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzecp extends zzbvi {
    private final Context zza;
    private final zzgfz zzb;
    private final zzedh zzc;
    private final zzcnc zzd;
    private final ArrayDeque zze;
    private final zzfmd zzf;
    private final zzbwi zzg;

    public zzecp(Context context, zzgfz zzgfzVar, zzbwi zzbwiVar, zzcnc zzcncVar, zzedh zzedhVar, ArrayDeque arrayDeque, zzede zzedeVar, zzfmd zzfmdVar) {
        zzbcv.zza(context);
        this.zza = context;
        this.zzb = zzgfzVar;
        this.zzg = zzbwiVar;
        this.zzc = zzedhVar;
        this.zzd = zzcncVar;
        this.zze = arrayDeque;
        this.zzf = zzfmdVar;
    }

    @Nullable
    private final synchronized zzecm zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzecm zzecmVar = (zzecm) it.next();
            if (zzecmVar.zzc.equals(str)) {
                it.remove();
                return zzecmVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzflg zzflgVar, zzbon zzbonVar, zzfma zzfmaVar, zzflp zzflpVar) {
        zzbod zza = zzbonVar.zza("AFMA_getAdDictionary", zzbok.zza, new zzbof() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzbof
            public final Object zza(JSONObject jSONObject) {
                return new zzbwc(jSONObject);
            }
        });
        zzflz.zzd(listenableFuture, zzflpVar);
        zzfkl zza2 = zzflgVar.zzb(zzfla.BUILD_URL, listenableFuture).zzf(zza).zza();
        zzflz.zzc(zza2, zzfmaVar, zzflpVar);
        return zza2;
    }

    private static ListenableFuture zzm(final zzbwa zzbwaVar, zzflg zzflgVar, final zzeyk zzeykVar) {
        zzgev zzgevVar = new zzgev() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeyk.this.zzb().zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((Bundle) obj), zzbwaVar.zzm);
            }
        };
        return zzflgVar.zzb(zzfla.GMS_SIGNALS, zzgfo.zzh(zzbwaVar.zza)).zzf(zzgevVar).zze(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzfkj
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzecm zzecmVar) {
        zzo();
        this.zze.addLast(zzecmVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbey.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbvt zzbvtVar, zzbwa zzbwaVar) {
        zzgfo.zzr(zzgfo.zzn(listenableFuture, new zzgev(this) { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzgfo.zzh(zzfid.zza((InputStream) obj));
            }
        }, zzcan.zza), new zzecl(this, zzbwaVar, zzbvtVar), zzcan.zzf);
    }

    public final ListenableFuture zzb(final zzbwa zzbwaVar, int i2) {
        if (!((Boolean) zzbey.zza.zze()).booleanValue()) {
            return zzgfo.zzg(new Exception("Split request is disabled."));
        }
        zzfix zzfixVar = zzbwaVar.zzi;
        if (zzfixVar == null) {
            return zzgfo.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfixVar.zzc == 0 || zzfixVar.zzd == 0) {
            return zzgfo.zzg(new Exception("Caching is disabled."));
        }
        zzbon zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeyk zzr = this.zzd.zzr(zzbwaVar, i2);
        zzflg zzc = zzr.zzc();
        final ListenableFuture zzm = zzm(zzbwaVar, zzc, zzr);
        zzfma zzd = zzr.zzd();
        final zzflp zza = zzflo.zza(this.zza, 9);
        final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza);
        return zzc.zza(zzfla.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzecp.this.zzj(zzl, zzm, zzbwaVar, zza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(final zzbwa zzbwaVar, int i2) {
        zzecm zzk;
        zzfkl zza;
        zzbon zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeyk zzr = this.zzd.zzr(zzbwaVar, i2);
        zzbod zza2 = zzb.zza("google.afma.response.normalize", zzeco.zza, zzbok.zzb);
        if (((Boolean) zzbey.zza.zze()).booleanValue()) {
            zzk = zzk(zzbwaVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbwaVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzflp zza3 = zzk == null ? zzflo.zza(this.zza, 9) : zzk.zzd;
        zzfma zzd = zzr.zzd();
        zzd.zzd(zzbwaVar.zza.getStringArrayList("ad_types"));
        zzedg zzedgVar = new zzedg(zzbwaVar.zzg, zzd, zza3);
        zzedd zzeddVar = new zzedd(this.zza, zzbwaVar.zzb.afmaVersion, this.zzg, i2);
        zzflg zzc = zzr.zzc();
        zzflp zza4 = zzflo.zza(this.zza, 11);
        if (zzk == null) {
            final ListenableFuture zzm = zzm(zzbwaVar, zzc, zzr);
            final ListenableFuture zzl = zzl(zzm, zzc, zzb, zzd, zza3);
            zzflp zza5 = zzflo.zza(this.zza, 10);
            final zzfkl zza6 = zzc.zza(zzfla.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzecd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbwa zzbwaVar2;
                    Bundle bundle;
                    zzbwc zzbwcVar = (zzbwc) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() && (bundle = (zzbwaVar2 = zzbwaVar).zzm) != null) {
                        bundle.putLong(zzdtm.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbwcVar.zzc());
                        zzbwaVar2.zzm.putLong(zzdtm.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbwcVar.zzb());
                    }
                    return new zzedf((JSONObject) zzm.get(), zzbwcVar);
                }
            }).zze(zzedgVar).zze(new zzflv(zza5)).zze(zzeddVar).zza();
            zzflz.zza(zza6, zzd, zza5);
            zzflz.zzd(zza6, zza4);
            zza = zzc.zza(zzfla.PRE_PROCESS, zzm, zzl, zza6).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzece
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() && (bundle = zzbwa.this.zzm) != null) {
                        t.t(bundle, zzdtm.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzeco((zzedc) zza6.get(), (JSONObject) zzm.get(), (zzbwc) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzedf zzedfVar = new zzedf(zzk.zzb, zzk.zza);
            zzflp zza7 = zzflo.zza(this.zza, 10);
            final zzfkl zza8 = zzc.zzb(zzfla.HTTP, zzgfo.zzh(zzedfVar)).zze(zzedgVar).zze(new zzflv(zza7)).zze(zzeddVar).zza();
            zzflz.zza(zza8, zzd, zza7);
            final ListenableFuture zzh = zzgfo.zzh(zzk);
            zzflz.zzd(zza8, zza4);
            zza = zzc.zza(zzfla.PRE_PROCESS, zza8, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeca
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzedc zzedcVar = (zzedc) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zzh;
                    return new zzeco(zzedcVar, ((zzecm) listenableFuture.get()).zzb, ((zzecm) listenableFuture.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzflz.zza(zza, zzd, zza4);
        return zza;
    }

    public final ListenableFuture zzd(final zzbwa zzbwaVar, int i2) {
        zzbon zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbfd.zza.zze()).booleanValue()) {
            return zzgfo.zzg(new Exception("Signal collection disabled."));
        }
        zzeyk zzr = this.zzd.zzr(zzbwaVar, i2);
        final zzexk zza = zzr.zza();
        zzbod zza2 = zzb.zza("google.afma.request.getSignals", zzbok.zza, zzbok.zzb);
        zzflp zza3 = zzflo.zza(this.zza, 22);
        zzfkl zza4 = zzr.zzc().zzb(zzfla.GET_SIGNALS, zzgfo.zzh(zzbwaVar.zza)).zze(new zzflv(zza3)).zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzexk.this.zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((Bundle) obj), zzbwaVar.zzm);
            }
        }).zzb(zzfla.JS_SIGNALS).zzf(zza2).zza();
        zzfma zzd = zzr.zzd();
        zzd.zzd(zzbwaVar.zza.getStringArrayList("ad_types"));
        zzd.zzf(zzbwaVar.zza.getBundle("extras"));
        zzflz.zzb(zza4, zzd, zza3);
        if (((Boolean) zzber.zzg.zze()).booleanValue()) {
            zzedh zzedhVar = this.zzc;
            Objects.requireNonNull(zzedhVar);
            zza4.addListener(new zzecg(zzedhVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbwa zzbwaVar, zzbvt zzbvtVar) {
        zzp(zzb(zzbwaVar, Binder.getCallingUid()), zzbvtVar, zzbwaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(zzbwa zzbwaVar, zzbvt zzbvtVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() && (bundle = zzbwaVar.zzm) != null) {
            t.t(bundle, zzdtm.SERVICE_CONNECTED.zza());
        }
        zzp(zzd(zzbwaVar, Binder.getCallingUid()), zzbvtVar, zzbwaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(zzbwa zzbwaVar, zzbvt zzbvtVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue() && (bundle = zzbwaVar.zzm) != null) {
            t.t(bundle, zzdtm.SERVICE_CONNECTED.zza());
        }
        ListenableFuture zzc = zzc(zzbwaVar, Binder.getCallingUid());
        zzp(zzc, zzbvtVar, zzbwaVar);
        if (((Boolean) zzber.zze.zze()).booleanValue()) {
            zzedh zzedhVar = this.zzc;
            Objects.requireNonNull(zzedhVar);
            zzc.addListener(new zzecg(zzedhVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh(String str, zzbvt zzbvtVar) {
        zzp(zzi(str), zzbvtVar, null);
    }

    public final ListenableFuture zzi(String str) {
        if (((Boolean) zzbey.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzgfo.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgfo.zzh(new zzeck(this));
        }
        return zzgfo.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbwa zzbwaVar, zzflp zzflpVar) throws Exception {
        String zze = ((zzbwc) listenableFuture.get()).zze();
        zzn(new zzecm((zzbwc) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbwaVar.zzh, zze, zzflpVar));
        return new ByteArrayInputStream(zze.getBytes(StandardCharsets.UTF_8));
    }
}
