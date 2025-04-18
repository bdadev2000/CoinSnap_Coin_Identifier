package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

@Deprecated
/* loaded from: classes4.dex */
public final class zzbdk {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdk(boolean z2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbdh zzf() {
        return new zzbdh(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), null, null);
    }

    public final zzbdj zza() {
        zzbdj zzbdjVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbdh zzbdhVar : this.zza) {
                    long zza = zzbdhVar.zza();
                    String zzc = zzbdhVar.zzc();
                    zzbdh zzb = zzbdhVar.zzb();
                    if (zzb != null && zza > 0) {
                        long zza2 = zza - zzb.zza();
                        sb.append(zzc);
                        sb.append('.');
                        sb.append(zza2);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                                sb2.append(SignatureVisitor.EXTENDS);
                                sb2.append(zzc);
                            } else {
                                hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
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
                zzbdjVar = new zzbdj(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbdjVar;
    }

    @VisibleForTesting
    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzu.zzo().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(@Nullable zzbdk zzbdkVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbda zzg;
        if (TextUtils.isEmpty(str2) || (zzg = com.google.android.gms.ads.internal.zzu.zzo().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbdg zza = zzg.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbdh zzbdhVar, long j2, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbdh(j2, strArr[0], zzbdhVar));
        }
        return true;
    }
}
