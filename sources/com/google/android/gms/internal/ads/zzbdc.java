package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbdc {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdc(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcz zzf() {
        return new zzbcz(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), null, null);
    }

    public final zzbdb zza() {
        zzbdb zzbdbVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbcz zzbczVar : this.zza) {
                long zza = zzbczVar.zza();
                String zzc = zzbczVar.zzc();
                zzbcz zzb = zzbczVar.zzb();
                if (zzb != null && zza > 0) {
                    long zza2 = zza - zzb.zza();
                    sb2.append(zzc);
                    sb2.append('.');
                    sb2.append(zza2);
                    sb2.append(AbstractJsonLexerKt.COMMA);
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb3.append('+');
                            sb3.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime()));
                    sb4.append(AbstractJsonLexerKt.COMMA);
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str = sb4.toString();
            }
            zzbdbVar = new zzbdb(sb2.toString(), str);
        }
        return zzbdbVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(@Nullable zzbdc zzbdcVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcs zzg;
        if (!TextUtils.isEmpty(str2) && (zzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) != null) {
            synchronized (this.zzc) {
                zzbcy zza = zzg.zza(str);
                Map map = this.zzb;
                map.put(str, zza.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbcz zzbczVar, long j3, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcz(j3, strArr[0], zzbczVar));
        }
        return true;
    }
}
