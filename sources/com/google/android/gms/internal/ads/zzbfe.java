package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbfe {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbfe(boolean z8, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbfb zzf() {
        return new zzbfb(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), null, null);
    }

    public final zzbfd zza() {
        zzbfd zzbfdVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbfb zzbfbVar : this.zza) {
                    long zza = zzbfbVar.zza();
                    String zzc = zzbfbVar.zzc();
                    zzbfb zzb = zzbfbVar.zzb();
                    if (zzb != null && zza > 0) {
                        long zza2 = zza - zzb.zza();
                        sb.append(zzc);
                        sb.append('.');
                        sb.append(zza2);
                        sb.append(',');
                        if (booleanValue) {
                            if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                                hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                            } else {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                                sb2.append('+');
                                sb2.append(zzc);
                            }
                        }
                    }
                }
                this.zza.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbfdVar = new zzbfd(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbfdVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzu.zzo().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(@Nullable zzbfe zzbfeVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbeu zzg;
        if (!TextUtils.isEmpty(str2) && (zzg = com.google.android.gms.ads.internal.zzu.zzo().zzg()) != null) {
            synchronized (this.zzc) {
                zzbfa zza = zzg.zza(str);
                Map map = this.zzb;
                map.put(str, zza.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbfb zzbfbVar, long j7, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbfb(j7, strArr[0], zzbfbVar));
        }
        return true;
    }
}
