package com.google.android.gms.internal.ads;

import com.applovin.impl.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhbd {
    private static final zzhbd zzb = new zzhbd(true);
    final zzhem zza = new zzhec(16);
    private boolean zzc;
    private boolean zzd;

    private zzhbd() {
    }

    public static int zza(zzhfg zzhfgVar, int i9, Object obj) {
        int zzD = zzhat.zzD(i9 << 3);
        if (zzhfgVar == zzhfg.zzj) {
            byte[] bArr = zzhcb.zzd;
            if (!(((zzhde) obj) instanceof zzgzj)) {
                zzD += zzD;
            } else {
                throw null;
            }
        }
        return zzD + zzb(zzhfgVar, obj);
    }

    public static int zzb(zzhfg zzhfgVar, Object obj) {
        int zzd;
        int zzD;
        zzhfg zzhfgVar2 = zzhfg.zza;
        zzhfh zzhfhVar = zzhfh.INT;
        switch (zzhfgVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i9 = zzhat.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i10 = zzhat.zzf;
                return 4;
            case 2:
                return zzhat.zzE(((Long) obj).longValue());
            case 3:
                return zzhat.zzE(((Long) obj).longValue());
            case 4:
                return zzhat.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i11 = zzhat.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i12 = zzhat.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i13 = zzhat.zzf;
                return 1;
            case 8:
                if (obj instanceof zzhac) {
                    int i14 = zzhat.zzf;
                    zzd = ((zzhac) obj).zzd();
                    zzD = zzhat.zzD(zzd);
                    break;
                } else {
                    return zzhat.zzC((String) obj);
                }
            case 9:
                int i15 = zzhat.zzf;
                return ((zzhde) obj).zzaY();
            case 10:
                if (obj instanceof zzhcj) {
                    int i16 = zzhat.zzf;
                    zzd = ((zzhcj) obj).zza();
                    zzD = zzhat.zzD(zzd);
                    break;
                } else {
                    return zzhat.zzz((zzhde) obj);
                }
            case 11:
                if (obj instanceof zzhac) {
                    int i17 = zzhat.zzf;
                    zzd = ((zzhac) obj).zzd();
                    zzD = zzhat.zzD(zzd);
                    break;
                } else {
                    int i18 = zzhat.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzhat.zzD(zzd);
                    break;
                }
            case 12:
                return zzhat.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzhbs) {
                    return zzhat.zzE(((zzhbs) obj).zza());
                }
                return zzhat.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i19 = zzhat.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i20 = zzhat.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzhat.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzhat.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzhbc zzhbcVar, Object obj) {
        zzhfg zzd = zzhbcVar.zzd();
        int zza = zzhbcVar.zza();
        if (zzhbcVar.zzg()) {
            List list = (List) obj;
            int i9 = 0;
            if (zzhbcVar.zzf()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i9 += zzb(zzd, it.next());
                }
                return zzhat.zzD(i9) + zzhat.zzD(zza << 3) + i9;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i9 += zza(zzd, zza, it2.next());
            }
            return i9;
        }
        return zza(zzd, zza, obj);
    }

    public static zzhbd zze() {
        return zzb;
    }

    private static Object zzm(Object obj) {
        if (obj instanceof zzhdj) {
            return ((zzhdj) obj).zzc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzn(Map.Entry entry) {
        zzhde zzbr;
        zzhbc zzhbcVar = (zzhbc) entry.getKey();
        Object value = entry.getValue();
        boolean z8 = value instanceof zzhcj;
        if (zzhbcVar.zzg()) {
            if (!z8) {
                Object zzf = zzf(zzhbcVar);
                if (zzf == null) {
                    zzf = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) zzf).add(zzm(it.next()));
                }
                this.zza.put(zzhbcVar, zzf);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (zzhbcVar.zze() == zzhfh.MESSAGE) {
            Object zzf2 = zzf(zzhbcVar);
            if (zzf2 == null) {
                this.zza.put(zzhbcVar, zzm(value));
                if (z8) {
                    this.zzd = true;
                    return;
                }
                return;
            }
            if (!z8) {
                if (zzf2 instanceof zzhdj) {
                    zzbr = zzhbcVar.zzc((zzhdj) zzf2, (zzhdj) value);
                } else {
                    zzhdd zzcZ = ((zzhde) zzf2).zzcZ();
                    zzhbcVar.zzb(zzcZ, (zzhde) value);
                    zzbr = zzcZ.zzbr();
                }
                this.zza.put(zzhbcVar, zzbr);
                return;
            }
            throw null;
        }
        if (!z8) {
            this.zza.put(zzhbcVar, zzm(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private static boolean zzo(Map.Entry entry) {
        zzhbc zzhbcVar = (zzhbc) entry.getKey();
        if (zzhbcVar.zze() == zzhfh.MESSAGE) {
            if (zzhbcVar.zzg()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!zzp(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            return zzp(entry.getValue());
        }
        return true;
    }

    private static boolean zzp(Object obj) {
        if (obj instanceof zzhdf) {
            return ((zzhdf) obj).zzbw();
        }
        if (obj instanceof zzhcj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzq(Map.Entry entry) {
        int i9;
        int zzD;
        int zzz;
        zzhbc zzhbcVar = (zzhbc) entry.getKey();
        Object value = entry.getValue();
        if (zzhbcVar.zze() == zzhfh.MESSAGE && !zzhbcVar.zzg() && !zzhbcVar.zzf()) {
            if (value instanceof zzhcj) {
                int zza = ((zzhbc) entry.getKey()).zza();
                int zzD2 = zzhat.zzD(8);
                i9 = zzD2 + zzD2;
                zzD = zzhat.zzD(zza) + zzhat.zzD(16);
                int zzD3 = zzhat.zzD(24);
                int zza2 = ((zzhcj) value).zza();
                zzz = L.b(zza2, zza2, zzD3);
            } else {
                int zza3 = ((zzhbc) entry.getKey()).zza();
                int zzD4 = zzhat.zzD(8);
                i9 = zzD4 + zzD4;
                zzD = zzhat.zzD(zza3) + zzhat.zzD(16);
                zzz = zzhat.zzz((zzhde) value) + zzhat.zzD(24);
            }
            return i9 + zzD + zzz;
        }
        return zzc(zzhbcVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzr(com.google.android.gms.internal.ads.zzhbc r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzhfg r0 = r2.zzd()
            byte[] r1 = com.google.android.gms.internal.ads.zzhcb.zzd
            r3.getClass()
            com.google.android.gms.internal.ads.zzhfg r1 = com.google.android.gms.internal.ads.zzhfg.zza
            com.google.android.gms.internal.ads.zzhfh r1 = com.google.android.gms.internal.ads.zzhfh.INT
            com.google.android.gms.internal.ads.zzhfh r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhde
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhcj
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhbs
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhac
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zzhfg r2 = r2.zzd()
            com.google.android.gms.internal.ads.zzhfh r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbd.zzr(com.google.android.gms.internal.ads.zzhbc, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhbd zzhbdVar = new zzhbd();
        for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
            Map.Entry zzg = this.zza.zzg(i9);
            zzhbdVar.zzk((zzhbc) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzhbdVar.zzk((zzhbc) entry.getKey(), entry.getValue());
        }
        zzhbdVar.zzd = this.zzd;
        return zzhbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhbd)) {
            return false;
        }
        return this.zza.equals(((zzhbd) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            i9 += zzq(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i9 += zzq((Map.Entry) it.next());
        }
        return i9;
    }

    public final Object zzf(zzhbc zzhbcVar) {
        Object obj = this.zza.get(zzhbcVar);
        if (!(obj instanceof zzhcj)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        if (this.zzd) {
            return new zzhci(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzh(zzhbc zzhbcVar, Object obj) {
        List list;
        if (((zzhbl) zzhbcVar).zzd) {
            zzr(zzhbcVar, obj);
            Object zzf = zzf(zzhbcVar);
            if (zzf == null) {
                list = new ArrayList();
                this.zza.put(zzhbcVar, list);
            } else {
                list = (List) zzf;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void zzi() {
        if (!this.zzc) {
            for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
                Map.Entry zzg = this.zza.zzg(i9);
                if (zzg.getValue() instanceof zzhbo) {
                    ((zzhbo) zzg.getValue()).zzbV();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzj(zzhbd zzhbdVar) {
        for (int i9 = 0; i9 < zzhbdVar.zza.zzb(); i9++) {
            zzn(zzhbdVar.zza.zzg(i9));
        }
        Iterator it = zzhbdVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzn((Map.Entry) it.next());
        }
    }

    public final void zzk(zzhbc zzhbcVar, Object obj) {
        if (zzhbcVar.zzg()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    zzr(zzhbcVar, arrayList.get(i9));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzr(zzhbcVar, obj);
        }
        if (obj instanceof zzhcj) {
            this.zzd = true;
        }
        this.zza.put(zzhbcVar, obj);
    }

    public final boolean zzl() {
        for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
            if (!zzo(this.zza.zzg(i9))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzo((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzhbd(boolean z8) {
        zzi();
        zzi();
    }
}
