package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzebg extends zzbve {
    private final Context zza;
    private final zzges zzb;
    private final zzeby zzc;
    private final zzclo zzd;
    private final ArrayDeque zze;
    private final zzfko zzf;
    private final zzbwf zzg;

    public zzebg(Context context, zzges zzgesVar, zzbwf zzbwfVar, zzclo zzcloVar, zzeby zzebyVar, ArrayDeque arrayDeque, zzebv zzebvVar, zzfko zzfkoVar) {
        zzbcn.zza(context);
        this.zza = context;
        this.zzb = zzgesVar;
        this.zzg = zzbwfVar;
        this.zzc = zzebyVar;
        this.zzd = zzcloVar;
        this.zze = arrayDeque;
        this.zzf = zzfkoVar;
    }

    @Nullable
    private final synchronized zzebd zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzebd zzebdVar = (zzebd) it.next();
            if (zzebdVar.zzc.equals(str)) {
                it.remove();
                return zzebdVar;
            }
        }
        return null;
    }

    private static ua.b zzm(ua.b bVar, zzfjr zzfjrVar, zzboi zzboiVar, zzfkl zzfklVar, zzfka zzfkaVar) {
        zzbny zza = zzboiVar.zza("AFMA_getAdDictionary", zzbof.zza, new zzboa() { // from class: com.google.android.gms.internal.ads.zzeax
            @Override // com.google.android.gms.internal.ads.zzboa
            public final Object zza(JSONObject jSONObject) {
                return new zzbvz(jSONObject);
            }
        });
        zzfkk.zzd(bVar, zzfkaVar);
        zzfix zza2 = zzfjrVar.zzb(zzfjl.BUILD_URL, bVar).zzf(zza).zza();
        zzfkk.zzc(zza2, zzfklVar, zzfkaVar);
        return zza2;
    }

    private static ua.b zzn(final zzbvx zzbvxVar, zzfjr zzfjrVar, final zzexc zzexcVar) {
        zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzexc.this.zzb().zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((Bundle) obj), zzbvxVar.zzm);
            }
        };
        return zzfjrVar.zzb(zzfjl.GMS_SIGNALS, zzgei.zzh(zzbvxVar.zza)).zzf(zzgdpVar).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(zzebd zzebdVar) {
        zzp();
        this.zze.addLast(zzebdVar);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbeu.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(ua.b bVar, zzbvp zzbvpVar, zzbvx zzbvxVar) {
        zzgei.zzr(zzgei.zzn(bVar, new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzeay
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(zzfgp.zza((InputStream) obj));
            }
        }, zzcaj.zza), new zzebc(this, zzbvxVar, zzbvpVar), zzcaj.zzf);
    }

    public final ua.b zzb(final zzbvx zzbvxVar, int i10) {
        if (!((Boolean) zzbeu.zza.zze()).booleanValue()) {
            return zzgei.zzg(new Exception("Split request is disabled."));
        }
        zzfhj zzfhjVar = zzbvxVar.zzi;
        if (zzfhjVar == null) {
            return zzgei.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfhjVar.zzc != 0 && zzfhjVar.zzd != 0) {
            zzboi zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
            zzexc zzr = this.zzd.zzr(zzbvxVar, i10);
            zzfjr zzc = zzr.zzc();
            final ua.b zzn = zzn(zzbvxVar, zzc, zzr);
            zzfkl zzd = zzr.zzd();
            final zzfka zza = zzfjz.zza(this.zza, 9);
            final ua.b zzm = zzm(zzn, zzc, zzb, zzd, zza);
            return zzc.zza(zzfjl.GET_URL_AND_CACHE_KEY, zzn, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeav
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzebg.this.zzk(zzm, zzn, zzbvxVar, zza);
                }
            }).zza();
        }
        return zzgei.zzg(new Exception("Caching is disabled."));
    }

    public final ua.b zzc(final zzbvx zzbvxVar, int i10) {
        zzebd zzl;
        zzfka zzfkaVar;
        zzfix zza;
        zzboi zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzexc zzr = this.zzd.zzr(zzbvxVar, i10);
        zzbny zza2 = zzb.zza("google.afma.response.normalize", zzebf.zza, zzbof.zzb);
        if (!((Boolean) zzbeu.zza.zze()).booleanValue()) {
            String str = zzbvxVar.zzj;
            zzl = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzl = zzl(zzbvxVar.zzh);
            if (zzl == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzl == null) {
            zzfkaVar = zzfjz.zza(this.zza, 9);
        } else {
            zzfkaVar = zzl.zzd;
        }
        zzfkl zzd = zzr.zzd();
        zzd.zzd(zzbvxVar.zza.getStringArrayList("ad_types"));
        zzebx zzebxVar = new zzebx(zzbvxVar.zzg, zzd, zzfkaVar);
        zzebu zzebuVar = new zzebu(this.zza, zzbvxVar.zzb.afmaVersion, this.zzg, i10);
        zzfjr zzc = zzr.zzc();
        zzfka zza3 = zzfjz.zza(this.zza, 11);
        if (zzl == null) {
            final ua.b zzn = zzn(zzbvxVar, zzc, zzr);
            final ua.b zzm = zzm(zzn, zzc, zzb, zzd, zzfkaVar);
            zzfka zza4 = zzfjz.zza(this.zza, 10);
            final zzfix zza5 = zzc.zza(zzfjl.HTTP, zzm, zzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeat
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbvx zzbvxVar2;
                    Bundle bundle;
                    zzbvz zzbvzVar = (zzbvz) ua.b.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && (bundle = (zzbvxVar2 = zzbvxVar).zzm) != null) {
                        bundle.putLong(zzdrv.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvzVar.zzc());
                        zzbvxVar2.zzm.putLong(zzdrv.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvzVar.zzb());
                    }
                    return new zzebw((JSONObject) zzn.get(), zzbvzVar);
                }
            }).zze(zzebxVar).zze(new zzfkg(zza4)).zze(zzebuVar).zza();
            zzfkk.zza(zza5, zzd, zza4);
            zzfkk.zzd(zza5, zza3);
            zza = zzc.zza(zzfjl.PRE_PROCESS, zzn, zzm, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && (bundle = zzbvx.this.zzm) != null) {
                        e.m(bundle, zzdrv.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzebf((zzebt) zza5.get(), (JSONObject) zzn.get(), (zzbvz) zzm.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzebw zzebwVar = new zzebw(zzl.zzb, zzl.zza);
            zzfka zza6 = zzfjz.zza(this.zza, 10);
            final zzfix zza7 = zzc.zzb(zzfjl.HTTP, zzgei.zzh(zzebwVar)).zze(zzebxVar).zze(new zzfkg(zza6)).zze(zzebuVar).zza();
            zzfkk.zza(zza7, zzd, zza6);
            final ua.b zzh = zzgei.zzh(zzl);
            zzfkk.zzd(zza7, zza3);
            zza = zzc.zza(zzfjl.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzebt zzebtVar = (zzebt) ua.b.this.get();
                    ua.b bVar = zzh;
                    return new zzebf(zzebtVar, ((zzebd) bVar.get()).zzb, ((zzebd) bVar.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfkk.zza(zza, zzd, zza3);
        return zza;
    }

    public final ua.b zzd(final zzbvx zzbvxVar, int i10) {
        zzboi zzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbez.zza.zze()).booleanValue()) {
            return zzgei.zzg(new Exception("Signal collection disabled."));
        }
        zzexc zzr = this.zzd.zzr(zzbvxVar, i10);
        final zzewc zza = zzr.zza();
        zzbny zza2 = zzb.zza("google.afma.request.getSignals", zzbof.zza, zzbof.zzb);
        zzfka zza3 = zzfjz.zza(this.zza, 22);
        zzfix zza4 = zzr.zzc().zzb(zzfjl.GET_SIGNALS, zzgei.zzh(zzbvxVar.zza)).zze(new zzfkg(zza3)).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeaz
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzewc.this.zza(com.google.android.gms.ads.internal.client.zzbc.zzb().zzi((Bundle) obj), zzbvxVar.zzm);
            }
        }).zzb(zzfjl.JS_SIGNALS).zzf(zza2).zza();
        zzfkl zzd = zzr.zzd();
        zzd.zzd(zzbvxVar.zza.getStringArrayList("ad_types"));
        zzd.zzf(zzbvxVar.zza.getBundle("extras"));
        zzfkk.zzb(zza4, zzd, zza3);
        if (((Boolean) zzben.zzg.zze()).booleanValue()) {
            zzeby zzebyVar = this.zzc;
            Objects.requireNonNull(zzebyVar);
            zza4.addListener(new zzeaw(zzebyVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(zzbvx zzbvxVar, zzbvp zzbvpVar) {
        zzq(zzb(zzbvxVar, Binder.getCallingUid()), zzbvpVar, zzbvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzf(zzbvx zzbvxVar, zzbvp zzbvpVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && (bundle = zzbvxVar.zzm) != null) {
            e.m(bundle, zzdrv.SERVICE_CONNECTED.zza());
        }
        zzq(zzd(zzbvxVar, Binder.getCallingUid()), zzbvpVar, zzbvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(zzbvx zzbvxVar, zzbvp zzbvpVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue() && (bundle = zzbvxVar.zzm) != null) {
            e.m(bundle, zzdrv.SERVICE_CONNECTED.zza());
        }
        ua.b zzc = zzc(zzbvxVar, Binder.getCallingUid());
        zzq(zzc, zzbvpVar, zzbvxVar);
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            zzeby zzebyVar = this.zzc;
            Objects.requireNonNull(zzebyVar);
            zzc.addListener(new zzeaw(zzebyVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh(String str, zzbvp zzbvpVar) {
        zzq(zzj(str), zzbvpVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi(zzbuz zzbuzVar, zzbvq zzbvqVar) {
        if (!((Boolean) zzbfb.zza.zze()).booleanValue()) {
            try {
                zzbvqVar.zzf("", zzbuzVar);
                return;
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
                return;
            }
        }
        this.zzd.zzF();
        String str = zzbuzVar.zza;
        zzgei.zzr(zzgei.zzh(null), new zzeba(this, zzbvqVar, zzbuzVar), zzcaj.zzf);
    }

    public final ua.b zzj(String str) {
        if (!((Boolean) zzbeu.zza.zze()).booleanValue()) {
            return zzgei.zzg(new Exception("Split request is disabled."));
        }
        zzebb zzebbVar = new zzebb(this);
        if (zzl(str) == null) {
            return zzgei.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgei.zzh(zzebbVar);
    }

    public final /* synthetic */ InputStream zzk(ua.b bVar, ua.b bVar2, zzbvx zzbvxVar, zzfka zzfkaVar) throws Exception {
        String zze = ((zzbvz) bVar.get()).zze();
        zzo(new zzebd((zzbvz) bVar.get(), (JSONObject) bVar2.get(), zzbvxVar.zzh, zze, zzfkaVar));
        return new ByteArrayInputStream(zze.getBytes(StandardCharsets.UTF_8));
    }
}
