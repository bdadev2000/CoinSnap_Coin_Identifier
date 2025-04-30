package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzage extends zzagg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzage() {
        super(new zzadt());
        this.zzb = C.TIME_UNSET;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfu zzfuVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfuVar.zzt()));
    }

    @Nullable
    private static Object zzh(zzfu zzfuVar, int i9) {
        if (i9 != 0) {
            boolean z8 = false;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 8) {
                            if (i9 != 10) {
                                if (i9 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) zzg(zzfuVar).doubleValue());
                                zzfuVar.zzL(2);
                                return date;
                            }
                            int zzp = zzfuVar.zzp();
                            ArrayList arrayList = new ArrayList(zzp);
                            for (int i10 = 0; i10 < zzp; i10++) {
                                Object zzh = zzh(zzfuVar, zzfuVar.zzm());
                                if (zzh != null) {
                                    arrayList.add(zzh);
                                }
                            }
                            return arrayList;
                        }
                        return zzj(zzfuVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String zzi = zzi(zzfuVar);
                        int zzm = zzfuVar.zzm();
                        if (zzm == 9) {
                            return hashMap;
                        }
                        Object zzh2 = zzh(zzfuVar, zzm);
                        if (zzh2 != null) {
                            hashMap.put(zzi, zzh2);
                        }
                    }
                } else {
                    return zzi(zzfuVar);
                }
            } else {
                if (zzfuVar.zzm() == 1) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        } else {
            return zzg(zzfuVar);
        }
    }

    private static String zzi(zzfu zzfuVar) {
        int zzq = zzfuVar.zzq();
        int zzd = zzfuVar.zzd();
        zzfuVar.zzL(zzq);
        return new String(zzfuVar.zzM(), zzd, zzq);
    }

    private static HashMap zzj(zzfu zzfuVar) {
        int zzp = zzfuVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i9 = 0; i9 < zzp; i9++) {
            String zzi = zzi(zzfuVar);
            Object zzh = zzh(zzfuVar, zzfuVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean zza(zzfu zzfuVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean zzb(zzfu zzfuVar, long j7) {
        if (zzfuVar.zzm() == 2 && "onMetaData".equals(zzi(zzfuVar)) && zzfuVar.zzb() != 0 && zzfuVar.zzm() == 8) {
            HashMap zzj = zzj(zzfuVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
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
                    for (int i9 = 0; i9 < size; i9++) {
                        Object obj5 = list.get(i9);
                        Object obj6 = list2.get(i9);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.zzc[i9] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.zzd[i9] = ((Double) obj5).longValue();
                        } else {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
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
