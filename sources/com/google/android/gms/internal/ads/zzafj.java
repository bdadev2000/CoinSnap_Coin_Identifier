package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzafj extends zzafl {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafj() {
        super(new zzacw());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzek zzekVar) {
        return Double.valueOf(Double.longBitsToDouble(zzekVar.zzt()));
    }

    @Nullable
    private static Object zzh(zzek zzekVar, int i2) {
        if (i2 == 0) {
            return zzg(zzekVar);
        }
        if (i2 == 1) {
            return Boolean.valueOf(zzekVar.zzm() == 1);
        }
        if (i2 == 2) {
            return zzi(zzekVar);
        }
        if (i2 != 3) {
            if (i2 == 8) {
                return zzj(zzekVar);
            }
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzekVar).doubleValue());
                zzekVar.zzM(2);
                return date;
            }
            int zzp = zzekVar.zzp();
            ArrayList arrayList = new ArrayList(zzp);
            for (int i3 = 0; i3 < zzp; i3++) {
                Object zzh = zzh(zzekVar, zzekVar.zzm());
                if (zzh != null) {
                    arrayList.add(zzh);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzi = zzi(zzekVar);
            int zzm = zzekVar.zzm();
            if (zzm == 9) {
                return hashMap;
            }
            Object zzh2 = zzh(zzekVar, zzm);
            if (zzh2 != null) {
                hashMap.put(zzi, zzh2);
            }
        }
    }

    private static String zzi(zzek zzekVar) {
        int zzq = zzekVar.zzq();
        int zzd = zzekVar.zzd();
        zzekVar.zzM(zzq);
        return new String(zzekVar.zzN(), zzd, zzq);
    }

    private static HashMap zzj(zzek zzekVar) {
        int zzp = zzekVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i2 = 0; i2 < zzp; i2++) {
            String zzi = zzi(zzekVar);
            Object zzh = zzh(zzekVar, zzekVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zza(zzek zzekVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zzb(zzek zzekVar, long j2) {
        if (zzekVar.zzm() == 2 && "onMetaData".equals(zzi(zzekVar)) && zzekVar.zzb() != 0 && zzekVar.zzm() == 8) {
            HashMap zzj = zzj(zzekVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj5 = list.get(i2);
                        Object obj6 = list2.get(i2);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i2] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
