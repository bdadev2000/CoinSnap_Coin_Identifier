package com.google.android.gms.internal.ads;

import com.applovin.impl.adview.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhat {
    private static final zzhat zzb = new zzhat(true);
    final zzhdu zza = new zzhdn();
    private boolean zzc;
    private boolean zzd;

    private zzhat() {
    }

    public static int zza(zzhel zzhelVar, int i2, Object obj) {
        int zzD = zzhaj.zzD(i2 << 3);
        if (zzhelVar == zzhel.zzj) {
            zzhcp zzhcpVar = (zzhcp) obj;
            byte[] bArr = zzhbr.zzb;
            if (zzhcpVar instanceof zzgzc) {
                throw null;
            }
            zzD += zzD;
        }
        return zzD + zzb(zzhelVar, obj);
    }

    public static int zzb(zzhel zzhelVar, Object obj) {
        int zzd;
        int zzD;
        zzhel zzhelVar2 = zzhel.zza;
        zzhem zzhemVar = zzhem.INT;
        switch (zzhelVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i2 = zzhaj.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i3 = zzhaj.zzf;
                return 4;
            case 2:
                return zzhaj.zzE(((Long) obj).longValue());
            case 3:
                return zzhaj.zzE(((Long) obj).longValue());
            case 4:
                return zzhaj.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i4 = zzhaj.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i5 = zzhaj.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i6 = zzhaj.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzgzs)) {
                    return zzhaj.zzC((String) obj);
                }
                int i7 = zzhaj.zzf;
                zzd = ((zzgzs) obj).zzd();
                zzD = zzhaj.zzD(zzd);
                break;
            case 9:
                int i8 = zzhaj.zzf;
                return ((zzhcp) obj).zzaY();
            case 10:
                if (!(obj instanceof zzhbz)) {
                    return zzhaj.zzz((zzhcp) obj);
                }
                int i9 = zzhaj.zzf;
                zzd = ((zzhbz) obj).zza();
                zzD = zzhaj.zzD(zzd);
                break;
            case 11:
                if (!(obj instanceof zzgzs)) {
                    int i10 = zzhaj.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzhaj.zzD(zzd);
                    break;
                } else {
                    int i11 = zzhaj.zzf;
                    zzd = ((zzgzs) obj).zzd();
                    zzD = zzhaj.zzD(zzd);
                    break;
                }
            case 12:
                return zzhaj.zzD(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzhbi ? zzhaj.zzE(((zzhbi) obj).zza()) : zzhaj.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i12 = zzhaj.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i13 = zzhaj.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzhaj.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzhaj.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzhas zzhasVar, Object obj) {
        zzhel zzb2 = zzhasVar.zzb();
        int zza = zzhasVar.zza();
        if (!zzhasVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!zzhasVar.zzd()) {
            int i3 = 0;
            while (i2 < size) {
                i3 += zza(zzb2, zza, list.get(i2));
                i2++;
            }
            return i3;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i4 = 0;
        while (i2 < size) {
            i4 += zzb(zzb2, list.get(i2));
            i2++;
        }
        return zzhaj.zzD(i4) + zzhaj.zzD(zza << 3) + i4;
    }

    public static zzhat zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzhas zzhasVar = (zzhas) entry.getKey();
        if (zzhasVar.zzc() != zzhem.MESSAGE) {
            return true;
        }
        if (!zzhasVar.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zzk(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzhcq) {
            return ((zzhcq) obj).zzbw();
        }
        if (obj instanceof zzhbz) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i2;
        int zzD;
        int zzz;
        zzhas zzhasVar = (zzhas) entry.getKey();
        Object value = entry.getValue();
        if (zzhasVar.zzc() != zzhem.MESSAGE || zzhasVar.zze() || zzhasVar.zzd()) {
            return zzc(zzhasVar, value);
        }
        if (value instanceof zzhbz) {
            int zza = ((zzhas) entry.getKey()).zza();
            int zzD2 = zzhaj.zzD(8);
            i2 = zzD2 + zzD2;
            zzD = zzhaj.zzD(zza) + zzhaj.zzD(16);
            int zzD3 = zzhaj.zzD(24);
            int zza2 = ((zzhbz) value).zza();
            zzz = t.a(zza2, zza2, zzD3);
        } else {
            int zza3 = ((zzhas) entry.getKey()).zza();
            int zzD4 = zzhaj.zzD(8);
            i2 = zzD4 + zzD4;
            zzD = zzhaj.zzD(zza3) + zzhaj.zzD(16);
            zzz = zzhaj.zzz((zzhcp) value) + zzhaj.zzD(24);
        }
        return i2 + zzD + zzz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzm(com.google.android.gms.internal.ads.zzhas r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzhel r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzhbr.zzb
            r3.getClass()
            com.google.android.gms.internal.ads.zzhel r1 = com.google.android.gms.internal.ads.zzhel.zza
            com.google.android.gms.internal.ads.zzhem r1 = com.google.android.gms.internal.ads.zzhem.INT
            com.google.android.gms.internal.ads.zzhem r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhcp
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhbz
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhbi
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgzs
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
            com.google.android.gms.internal.ads.zzhel r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzhem r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhat.zzm(com.google.android.gms.internal.ads.zzhas, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhat zzhatVar = new zzhat();
        int zzc = this.zza.zzc();
        for (int i2 = 0; i2 < zzc; i2++) {
            Map.Entry zzg = this.zza.zzg(i2);
            zzhatVar.zzh((zzhas) ((zzhdo) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzhatVar.zzh((zzhas) entry.getKey(), entry.getValue());
        }
        zzhatVar.zzd = this.zzd;
        return zzhatVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhat) {
            return this.zza.equals(((zzhat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int zzc = this.zza.zzc();
        int i2 = 0;
        for (int i3 = 0; i3 < zzc; i3++) {
            i2 += zzl(this.zza.zzg(i3));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i2 += zzl((Map.Entry) it.next());
        }
        return i2;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzhby(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i2 = 0; i2 < zzc; i2++) {
            Map.Entry zzg = this.zza.zzg(i2);
            if (zzg.getValue() instanceof zzhbe) {
                ((zzhbe) zzg.getValue()).zzbW();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzhas zzhasVar, Object obj) {
        if (!zzhasVar.zze()) {
            zzm(zzhasVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                zzm(zzhasVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhbz) {
            this.zzd = true;
        }
        this.zza.put(zzhasVar, obj);
    }

    public final boolean zzi() {
        int zzc = this.zza.zzc();
        for (int i2 = 0; i2 < zzc; i2++) {
            if (!zzj(this.zza.zzg(i2))) {
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

    private zzhat(boolean z2) {
        zzg();
        zzg();
    }
}
