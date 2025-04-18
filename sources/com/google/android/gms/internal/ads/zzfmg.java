package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
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

/* loaded from: classes3.dex */
public final class zzfmg {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfmp zzc;
    private final zzfmd zzd;
    private final Clock zze;

    public zzfmg(zzfmp zzfmpVar, zzfmd zzfmdVar, Clock clock) {
        this.zzc = zzfmpVar;
        this.zzd = zzfmdVar;
        this.zze = clock;
    }

    public static String zzd(String str, @Nullable AdFormat adFormat) {
        String name;
        if (adFormat == null) {
            name = "NULL";
        } else {
            name = adFormat.name();
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "#", name);
    }

    private final synchronized List zzj(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
            String zzd = zzd(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
            hashSet.add(zzd);
            zzfmo zzfmoVar = (zzfmo) this.zza.get(zzd);
            if (zzfmoVar != null) {
                if (!zzfmoVar.zze.equals(zzftVar)) {
                    this.zzb.put(zzd, zzfmoVar);
                    this.zza.remove(zzd);
                }
            } else {
                arrayList.add(zzftVar);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzfmo) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzfmo zzfmoVar2 = (zzfmo) ((Map.Entry) it3.next()).getValue();
            zzfmoVar2.zzk();
            if (!zzfmoVar2.zzl()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized Optional zzk(final Class cls, String str, AdFormat adFormat) {
        ConcurrentMap concurrentMap = this.zza;
        String zzd = zzd(str, adFormat);
        if (!concurrentMap.containsKey(zzd) && !this.zzb.containsKey(zzd)) {
            return Optional.empty();
        }
        zzfmo zzfmoVar = (zzfmo) this.zza.get(zzd);
        if (zzfmoVar == null && (zzfmoVar = (zzfmo) this.zzb.get(zzd)) == null) {
            return Optional.empty();
        }
        try {
            Optional ofNullable = Optional.ofNullable(zzfmoVar.zzd());
            Objects.requireNonNull(cls);
            return ofNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.zzfmf
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
        } catch (ClassCastException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e2);
            return Optional.empty();
        }
    }

    private final synchronized void zzl(String str, zzfmo zzfmoVar) {
        zzfmoVar.zzc();
        this.zza.put(str, zzfmoVar);
    }

    private final synchronized boolean zzm(String str, AdFormat adFormat) {
        Optional empty;
        long currentTimeMillis = this.zze.currentTimeMillis();
        ConcurrentMap concurrentMap = this.zza;
        String zzd = zzd(str, adFormat);
        boolean z10 = false;
        if (!concurrentMap.containsKey(zzd) && !this.zzb.containsKey(zzd)) {
            return false;
        }
        zzfmo zzfmoVar = (zzfmo) this.zza.get(zzd);
        if (zzfmoVar == null) {
            zzfmoVar = (zzfmo) this.zzb.get(zzd);
        }
        if (zzfmoVar != null && zzfmoVar.zzl()) {
            z10 = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzs)).booleanValue()) {
            if (z10) {
                empty = Optional.of(Long.valueOf(this.zze.currentTimeMillis()));
            } else {
                empty = Optional.empty();
            }
            this.zzd.zza(adFormat, currentTimeMillis, empty);
        }
        return z10;
    }

    @Nullable
    public final synchronized zzbaf zza(String str) {
        return (zzbaf) zzk(zzbaf.class, str, AdFormat.APP_OPEN_AD).orElse(null);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzby zzb(String str) {
        return (com.google.android.gms.ads.internal.client.zzby) zzk(com.google.android.gms.ads.internal.client.zzby.class, str, AdFormat.INTERSTITIAL).orElse(null);
    }

    @Nullable
    public final synchronized zzbxc zzc(String str) {
        return (zzbxc) zzk(zzbxc.class, str, AdFormat.REWARDED).orElse(null);
    }

    public final void zze(zzbpg zzbpgVar) {
        this.zzc.zzb(zzbpgVar);
    }

    public final synchronized void zzf(List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        for (com.google.android.gms.ads.internal.client.zzft zzftVar : zzj(list)) {
            String str = zzftVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            zzfmo zza = this.zzc.zza(zzftVar, zzcfVar);
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
