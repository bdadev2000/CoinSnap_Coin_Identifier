package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzedq extends zzbxc {
    private final Context zza;
    private final zzgge zzb;
    private final zzeei zzc;
    private final zzcoq zzd;
    private final ArrayDeque zze;
    private final zzfmq zzf;
    private final zzbyd zzg;
    private final zzeef zzh;

    public zzedq(Context context, zzgge zzggeVar, zzbyd zzbydVar, zzcoq zzcoqVar, zzeei zzeeiVar, ArrayDeque arrayDeque, zzeef zzeefVar, zzfmq zzfmqVar) {
        zzbep.zza(context);
        this.zza = context;
        this.zzb = zzggeVar;
        this.zzg = zzbydVar;
        this.zzc = zzeeiVar;
        this.zzd = zzcoqVar;
        this.zze = arrayDeque;
        this.zzh = zzeefVar;
        this.zzf = zzfmqVar;
    }

    @Nullable
    private final synchronized zzedn zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzedn zzednVar = (zzedn) it.next();
            if (zzednVar.zzc.equals(str)) {
                it.remove();
                return zzednVar;
            }
        }
        return null;
    }

    private static f4.c zzl(f4.c cVar, zzflt zzfltVar, zzbqh zzbqhVar, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        zzbpx zza = zzbqhVar.zza("AFMA_getAdDictionary", zzbqe.zza, new zzbpz() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // com.google.android.gms.internal.ads.zzbpz
            public final Object zza(JSONObject jSONObject) {
                return new zzbxx(jSONObject);
            }
        });
        zzfmm.zze(cVar, zzfmcVar);
        zzfky zza2 = zzfltVar.zzb(zzfln.BUILD_URL, cVar).zzf(zza).zza();
        zzfmm.zzd(zza2, zzfmnVar, zzfmcVar);
        return zza2;
    }

    private static f4.c zzm(final zzbxu zzbxuVar, zzflt zzfltVar, final zzeyv zzeyvVar) {
        zzgfa zzgfaVar = new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeyv.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxuVar.zzm);
            }
        };
        return zzfltVar.zzb(zzfln.GMS_SIGNALS, zzgft.zzh(zzbxuVar.zza)).zzf(zzgfaVar).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzedn zzednVar) {
        zzo();
        this.zze.addLast(zzednVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbgr.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(f4.c cVar, zzbxn zzbxnVar, zzbxu zzbxuVar) {
        zzgft.zzr(zzgft.zzn(cVar, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedj
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(zzfip.zza((InputStream) obj));
            }
        }, zzcci.zza), new zzedm(this, zzbxnVar, zzbxuVar), zzcci.zzf);
    }

    public final f4.c zzb(final zzbxu zzbxuVar, int i9) {
        if (!((Boolean) zzbgr.zza.zze()).booleanValue()) {
            return zzgft.zzg(new Exception("Split request is disabled."));
        }
        zzfjj zzfjjVar = zzbxuVar.zzi;
        if (zzfjjVar == null) {
            return zzgft.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfjjVar.zzc != 0 && zzfjjVar.zzd != 0) {
            zzbqh zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
            zzeyv zzr = this.zzd.zzr(zzbxuVar, i9);
            zzflt zzc = zzr.zzc();
            final f4.c zzm = zzm(zzbxuVar, zzc, zzr);
            zzfmn zzd = zzr.zzd();
            final zzfmc zza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_BUILDURL);
            final f4.c zzl = zzl(zzm, zzc, zzb, zzd, zza);
            return zzc.zza(zzfln.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzedq.this.zzj(zzl, zzm, zzbxuVar, zza);
                }
            }).zza();
        }
        return zzgft.zzg(new Exception("Caching is disabled."));
    }

    public final f4.c zzc(final zzbxu zzbxuVar, int i9) {
        zzedn zzk;
        zzfmc zzfmcVar;
        zzfky zza;
        zzbqh zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeyv zzr = this.zzd.zzr(zzbxuVar, i9);
        zzbpx zza2 = zzb.zza("google.afma.response.normalize", zzedp.zza, zzbqe.zzb);
        if (!((Boolean) zzbgr.zza.zze()).booleanValue()) {
            String str = zzbxuVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzk = zzk(zzbxuVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzk == null) {
            zzfmcVar = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_BUILDURL);
        } else {
            zzfmcVar = zzk.zze;
        }
        zzfmn zzd = zzr.zzd();
        zzd.zze(zzbxuVar.zza.getStringArrayList("ad_types"));
        zzeeh zzeehVar = new zzeeh(zzbxuVar.zzg, zzd, zzfmcVar);
        zzeee zzeeeVar = new zzeee(this.zza, zzbxuVar.zzb.afmaVersion, this.zzg, i9);
        zzflt zzc = zzr.zzc();
        zzfmc zza3 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_PARSERESPONSE);
        if (zzk == null) {
            final f4.c zzm = zzm(zzbxuVar, zzc, zzr);
            final f4.c zzl = zzl(zzm, zzc, zzb, zzd, zzfmcVar);
            zzfmc zza4 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_REQUEST);
            final zzfky zza5 = zzc.zza(zzfln.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzede
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbxu zzbxuVar2;
                    Bundle bundle;
                    zzbxx zzbxxVar = (zzbxx) f4.c.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = (zzbxuVar2 = zzbxuVar).zzm) != null) {
                        bundle.putLong(zzdul.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbxxVar.zzc());
                        zzbxuVar2.zzm.putLong(zzdul.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbxxVar.zzb());
                    }
                    return new zzeeg((JSONObject) zzm.get(), zzbxxVar);
                }
            }).zze(zzeehVar).zze(new zzfmi(zza4)).zze(zzeeeVar).zza();
            zzfmm.zzb(zza5, zzd, zza4);
            zzfmm.zze(zza5, zza3);
            zza = zzc.zza(zzfln.PRE_PROCESS, zzm, zzl, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = zzbxu.this.zzm) != null) {
                        bundle.putLong(zzdul.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                    }
                    return new zzedp((zzeed) zza5.get(), (JSONObject) zzm.get(), (zzbxx) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzeeg zzeegVar = new zzeeg(zzk.zzb, zzk.zza);
            zzfmc zza6 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_REQUEST);
            final zzfky zza7 = zzc.zzb(zzfln.HTTP, zzgft.zzh(zzeegVar)).zze(zzeehVar).zze(new zzfmi(zza6)).zze(zzeeeVar).zza();
            zzfmm.zzb(zza7, zzd, zza6);
            final f4.c zzh = zzgft.zzh(zzk);
            zzfmm.zze(zza7, zza3);
            zza = zzc.zza(zzfln.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzeed zzeedVar = (zzeed) f4.c.this.get();
                    f4.c cVar = zzh;
                    return new zzedp(zzeedVar, ((zzedn) cVar.get()).zzb, ((zzedn) cVar.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfmm.zzb(zza, zzd, zza3);
        return zza;
    }

    public final f4.c zzd(final zzbxu zzbxuVar, int i9) {
        zzbqh zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbgw.zza.zze()).booleanValue()) {
            return zzgft.zzg(new Exception("Signal collection disabled."));
        }
        zzeyv zzr = this.zzd.zzr(zzbxuVar, i9);
        final zzexz zza = zzr.zza();
        zzbpx zza2 = zzb.zza("google.afma.request.getSignals", zzbqe.zza, zzbqe.zzb);
        zzfmc zza3 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_SCAR_SIGNALS);
        zzfky zza4 = zzr.zzc().zzb(zzfln.GET_SIGNALS, zzgft.zzh(zzbxuVar.zza)).zze(new zzfmi(zza3)).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzexz.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxuVar.zzm);
            }
        }).zzb(zzfln.JS_SIGNALS).zzf(zza2).zza();
        zzfmn zzd = zzr.zzd();
        zzd.zze(zzbxuVar.zza.getStringArrayList("ad_types"));
        zzd.zzg(zzbxuVar.zza.getBundle("extras"));
        zzfmm.zzc(zza4, zzd, zza3);
        if (((Boolean) zzbgk.zzg.zze()).booleanValue()) {
            zzeei zzeeiVar = this.zzc;
            Objects.requireNonNull(zzeeiVar);
            zza4.addListener(new zzedh(zzeeiVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zze(zzbxu zzbxuVar, zzbxn zzbxnVar) {
        zzp(zzb(zzbxuVar, Binder.getCallingUid()), zzbxnVar, zzbxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzf(zzbxu zzbxuVar, zzbxn zzbxnVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = zzbxuVar.zzm) != null) {
            bundle.putLong(zzdul.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        zzp(zzd(zzbxuVar, Binder.getCallingUid()), zzbxnVar, zzbxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzg(zzbxu zzbxuVar, zzbxn zzbxnVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = zzbxuVar.zzm) != null) {
            bundle.putLong(zzdul.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        f4.c zzc = zzc(zzbxuVar, Binder.getCallingUid());
        zzp(zzc, zzbxnVar, zzbxuVar);
        if (((Boolean) zzbgk.zze.zze()).booleanValue()) {
            zzeei zzeeiVar = this.zzc;
            Objects.requireNonNull(zzeeiVar);
            zzc.addListener(new zzedh(zzeeiVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzh(String str, zzbxn zzbxnVar) {
        zzp(zzi(str), zzbxnVar, null);
    }

    public final f4.c zzi(String str) {
        if (!((Boolean) zzbgr.zza.zze()).booleanValue()) {
            return zzgft.zzg(new Exception("Split request is disabled."));
        }
        zzedl zzedlVar = new zzedl(this);
        if (zzk(str) == null) {
            return zzgft.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgft.zzh(zzedlVar);
    }

    public final /* synthetic */ InputStream zzj(f4.c cVar, f4.c cVar2, zzbxu zzbxuVar, zzfmc zzfmcVar) throws Exception {
        String zze = ((zzbxx) cVar.get()).zze();
        zzn(new zzedn((zzbxx) cVar.get(), (JSONObject) cVar2.get(), zzbxuVar.zzh, zze, zzfmcVar));
        return new ByteArrayInputStream(zze.getBytes(zzfxs.zzc));
    }
}
