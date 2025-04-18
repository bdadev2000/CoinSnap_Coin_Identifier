package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgym {
    private static final zzgym zzb = new zzgym(true);
    final zzhbj zza = new zzhbe();
    private boolean zzc;
    private boolean zzd;

    private zzgym() {
    }

    public static int zza(zzhca zzhcaVar, int i10, Object obj) {
        int zzD = zzgyc.zzD(i10 << 3);
        if (zzhcaVar == zzhca.zzj) {
            zzhai zzhaiVar = (zzhai) obj;
            byte[] bArr = zzgzk.zzb;
            if (!(zzhaiVar instanceof zzgwz)) {
                zzD += zzD;
            } else {
                throw null;
            }
        }
        return zzD + zzb(zzhcaVar, obj);
    }

    public static int zzb(zzhca zzhcaVar, Object obj) {
        int zzd;
        int zzD;
        zzhca zzhcaVar2 = zzhca.zza;
        zzhcb zzhcbVar = zzhcb.INT;
        switch (zzhcaVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = zzgyc.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = zzgyc.zzf;
                return 4;
            case 2:
                return zzgyc.zzE(((Long) obj).longValue());
            case 3:
                return zzgyc.zzE(((Long) obj).longValue());
            case 4:
                return zzgyc.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = zzgyc.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = zzgyc.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = zzgyc.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgxp) {
                    int i15 = zzgyc.zzf;
                    zzd = ((zzgxp) obj).zzd();
                    zzD = zzgyc.zzD(zzd);
                    break;
                } else {
                    return zzgyc.zzC((String) obj);
                }
            case 9:
                int i16 = zzgyc.zzf;
                return ((zzhai) obj).zzaY();
            case 10:
                if (obj instanceof zzgzs) {
                    int i17 = zzgyc.zzf;
                    zzd = ((zzgzs) obj).zza();
                    zzD = zzgyc.zzD(zzd);
                    break;
                } else {
                    return zzgyc.zzz((zzhai) obj);
                }
            case 11:
                if (obj instanceof zzgxp) {
                    int i18 = zzgyc.zzf;
                    zzd = ((zzgxp) obj).zzd();
                    zzD = zzgyc.zzD(zzd);
                    break;
                } else {
                    int i19 = zzgyc.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzgyc.zzD(zzd);
                    break;
                }
            case 12:
                return zzgyc.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgzb) {
                    return zzgyc.zzE(((zzgzb) obj).zza());
                }
                return zzgyc.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i20 = zzgyc.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i21 = zzgyc.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgyc.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgyc.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzgyl zzgylVar, Object obj) {
        zzhca zzb2 = zzgylVar.zzb();
        int zza = zzgylVar.zza();
        if (zzgylVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (zzgylVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int i11 = 0;
                while (i10 < size) {
                    i11 += zzb(zzb2, list.get(i10));
                    i10++;
                }
                return zzgyc.zzD(i11) + zzgyc.zzD(zza << 3) + i11;
            }
            int i12 = 0;
            while (i10 < size) {
                i12 += zza(zzb2, zza, list.get(i10));
                i10++;
            }
            return i12;
        }
        return zza(zzb2, zza, obj);
    }

    public static zzgym zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgyl zzgylVar = (zzgyl) entry.getKey();
        if (zzgylVar.zzc() == zzhcb.MESSAGE) {
            if (zzgylVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!zzk(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return zzk(entry.getValue());
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzhaj) {
            return ((zzhaj) obj).zzbw();
        }
        if (obj instanceof zzgzs) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        zzgyl zzgylVar = (zzgyl) entry.getKey();
        Object value = entry.getValue();
        if (zzgylVar.zzc() == zzhcb.MESSAGE && !zzgylVar.zze() && !zzgylVar.zzd()) {
            if (value instanceof zzgzs) {
                int zza = ((zzgyl) entry.getKey()).zza();
                int zzD = zzgyc.zzD(8);
                int zzD2 = zzgyc.zzD(zza) + zzgyc.zzD(16);
                int zzD3 = zzgyc.zzD(24);
                int zza2 = ((zzgzs) value).zza();
                return zzD + zzD + zzD2 + zzgyc.zzD(zza2) + zza2 + zzD3;
            }
            int zza3 = ((zzgyl) entry.getKey()).zza();
            int zzD4 = zzgyc.zzD(8);
            int zzD5 = zzgyc.zzD(zza3) + zzgyc.zzD(16);
            return zzD4 + zzD4 + zzD5 + zzgyc.zzz((zzhai) value) + zzgyc.zzD(24);
        }
        return zzc(zzgylVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzm(com.google.android.gms.internal.ads.zzgyl r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhca r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzgzk.zzb
            r5.getClass()
            com.google.android.gms.internal.ads.zzhca r1 = com.google.android.gms.internal.ads.zzhca.zza
            com.google.android.gms.internal.ads.zzhcb r1 = com.google.android.gms.internal.ads.zzhcb.INT
            com.google.android.gms.internal.ads.zzhcb r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhai
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzs
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzb
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgxp
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzhca r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzhcb r4 = r4.zza()
            r2 = 1
            r1[r2] = r4
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgym.zzm(com.google.android.gms.internal.ads.zzgyl, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgym zzgymVar = new zzgym();
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgymVar.zzh((zzgyl) ((zzhbf) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzgymVar.zzh((zzgyl) entry.getKey(), entry.getValue());
        }
        zzgymVar.zzd = this.zzd;
        return zzgymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgym)) {
            return false;
        }
        return this.zza.equals(((zzgym) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int zzc = this.zza.zzc();
        int i10 = 0;
        for (int i11 = 0; i11 < zzc; i11++) {
            i10 += zzl(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i10 += zzl((Map.Entry) it.next());
        }
        return i10;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzgzq(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Object value = this.zza.zzg(i10).getValue();
            if (value instanceof zzgyx) {
                ((zzgyx) value).zzbW();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgyx) {
                ((zzgyx) value2).zzbW();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgyl zzgylVar, Object obj) {
        if (zzgylVar.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    zzm(zzgylVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzm(zzgylVar, obj);
        }
        if (obj instanceof zzgzs) {
            this.zzd = true;
        }
        this.zza.put(zzgylVar, obj);
    }

    public final boolean zzi() {
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            if (!zzj(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgym(boolean z10) {
        zzg();
        zzg();
    }
}
