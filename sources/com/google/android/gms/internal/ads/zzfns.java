package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final class zzfns {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfob zzc;

    public zzfns(zzfob zzfobVar) {
        this.zzc = zzfobVar;
    }

    public static String zzd(String str, @Nullable AdFormat adFormat) {
        return androidx.compose.foundation.text.input.a.k(str, "#", adFormat == null ? "NULL" : adFormat.name());
    }

    private final synchronized List zzj(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfu zzfuVar = (com.google.android.gms.ads.internal.client.zzfu) it.next();
                String zzd = zzd(zzfuVar.zza, AdFormat.getAdFormat(zzfuVar.zzb));
                hashSet.add(zzd);
                zzfoa zzfoaVar = (zzfoa) this.zza.get(zzd);
                if (zzfoaVar == null) {
                    arrayList.add(zzfuVar);
                } else if (!zzfoaVar.zze.equals(zzfuVar)) {
                    this.zzb.put(zzd, zzfoaVar);
                    this.zza.remove(zzd);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfoa) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfoa zzfoaVar2 = (zzfoa) ((Map.Entry) it3.next()).getValue();
                zzfoaVar2.zzk();
                if (!zzfoaVar2.zzl()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized Optional zzk(final Class cls, String str, AdFormat adFormat) {
        ConcurrentMap concurrentMap = this.zza;
        String zzd = zzd(str, adFormat);
        if (!concurrentMap.containsKey(zzd) && !this.zzb.containsKey(zzd)) {
            return Optional.empty();
        }
        zzfoa zzfoaVar = (zzfoa) this.zza.get(zzd);
        if (zzfoaVar == null && (zzfoaVar = (zzfoa) this.zzb.get(zzd)) == null) {
            return Optional.empty();
        }
        try {
            Optional ofNullable = Optional.ofNullable(zzfoaVar.zzd());
            Objects.requireNonNull(cls);
            return ofNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.zzfnr
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return Optional.empty();
        }
    }

    private final synchronized void zzl(String str, zzfoa zzfoaVar) {
        zzfoaVar.zzc();
        this.zza.put(str, zzfoaVar);
    }

    private final synchronized boolean zzm(String str, AdFormat adFormat) {
        ConcurrentMap concurrentMap = this.zza;
        String zzd = zzd(str, adFormat);
        if (!concurrentMap.containsKey(zzd) && !this.zzb.containsKey(zzd)) {
            return false;
        }
        zzfoa zzfoaVar = (zzfoa) this.zza.get(zzd);
        if (zzfoaVar == null) {
            zzfoaVar = (zzfoa) this.zzb.get(zzd);
        }
        if (zzfoaVar != null) {
            if (zzfoaVar.zzl()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final synchronized zzbao zza(String str) {
        return (zzbao) zzk(zzbao.class, str, AdFormat.APP_OPEN_AD).orElse(null);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzby zzb(String str) {
        return (com.google.android.gms.ads.internal.client.zzby) zzk(com.google.android.gms.ads.internal.client.zzby.class, str, AdFormat.INTERSTITIAL).orElse(null);
    }

    @Nullable
    public final synchronized zzbxf zzc(String str) {
        return (zzbxf) zzk(zzbxf.class, str, AdFormat.REWARDED).orElse(null);
    }

    public final void zze(zzbpl zzbplVar) {
        this.zzc.zzb(zzbplVar);
    }

    public final synchronized void zzf(List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        for (com.google.android.gms.ads.internal.client.zzfu zzfuVar : zzj(list)) {
            String str = zzfuVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzfuVar.zzb);
            zzfoa zza = this.zzc.zza(zzfuVar, zzcfVar);
            if (adFormat != null && zza != null) {
                zzl(zzd(str, adFormat), zza);
            }
        }
    }

    public final synchronized boolean zzg(String str) {
        return zzm(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzh(String str) {
        return zzm(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzi(String str) {
        return zzm(str, AdFormat.REWARDED);
    }
}
