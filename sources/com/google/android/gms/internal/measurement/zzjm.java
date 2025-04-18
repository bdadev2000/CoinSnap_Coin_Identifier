package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjm<T extends zzjo<T>> {
    private static final zzjm<?> zzb = new zzjm<>(true);
    final zzlv<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzjm() {
        this.zza = new zzly();
    }

    public static int zza(zzms zzmsVar, int i2, Object obj) {
        int zzi = zzjc.zzi(i2);
        if (zzmsVar == zzms.zzj) {
            zzjv.zza((zzlc) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmsVar, obj);
    }

    public static <T extends zzjo<T>> zzjm<T> zzb() {
        return (zzjm<T>) zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjm zzjmVar = new zzjm();
        int zza = this.zza.zza();
        for (int i2 = 0; i2 < zza; i2++) {
            Map.Entry<T, Object> zza2 = this.zza.zza(i2);
            zzjmVar.zzb(zza2.getKey(), zza2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzjmVar.zzb(entry.getKey(), entry.getValue());
        }
        zzjmVar.zzd = this.zzd;
        return zzjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjm) {
            return this.zza.equals(((zzjm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzki(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzki(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zza = this.zza.zza();
        for (int i2 = 0; i2 < zza; i2++) {
            Object value = this.zza.zza(i2).getValue();
            if (value instanceof zzjt) {
                ((zzjt) value).zzcl();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzjt) {
                ((zzjt) value2).zzcl();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zza = this.zza.zza();
        for (int i2 = 0; i2 < zza; i2++) {
            if (!zzc(this.zza.zza(i2))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzlc zzai;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzkg;
        if (key.zze()) {
            if (!z2) {
                Object zza = zza((zzjm<T>) key);
                List list = (List) value;
                int size = list.size();
                if (zza == null) {
                    zza = new ArrayList(size);
                }
                List list2 = (List) zza;
                for (int i2 = 0; i2 < size; i2++) {
                    list2.add(zza(list.get(i2)));
                }
                this.zza.zza((zzlv<T, Object>) key, (T) zza);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.zzc() != zzmz.MESSAGE) {
            if (!z2) {
                this.zza.zza((zzlv<T, Object>) key, (T) zza(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object zza2 = zza((zzjm<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzlv<T, Object>) key, (T) zza(value));
            if (z2) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (!z2) {
            if (zza2 instanceof zzlh) {
                zzai = key.zza((zzlh) zza2, (zzlh) value);
            } else {
                zzai = key.zza(((zzlc) zza2).zzcj(), (zzlc) value).zzai();
            }
            this.zza.zza((zzlv<T, Object>) key, (T) zzai);
            return;
        }
        throw new NoSuchMethodError();
    }

    private zzjm(zzlv<T, Object> zzlvVar) {
        this.zza = zzlvVar;
        zze();
    }

    private zzjm(boolean z2) {
        this(new zzly());
        zze();
    }

    private static int zza(zzms zzmsVar, Object obj) {
        switch (zzjl.zzb[zzmsVar.ordinal()]) {
            case 1:
                return zzjc.zza(((Double) obj).doubleValue());
            case 2:
                return zzjc.zza(((Float) obj).floatValue());
            case 3:
                return zzjc.zzd(((Long) obj).longValue());
            case 4:
                return zzjc.zzg(((Long) obj).longValue());
            case 5:
                return zzjc.zzf(((Integer) obj).intValue());
            case 6:
                return zzjc.zzc(((Long) obj).longValue());
            case 7:
                return zzjc.zze(((Integer) obj).intValue());
            case 8:
                return zzjc.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzjc.zzb((zzlc) obj);
            case 10:
                if (obj instanceof zzkg) {
                    return zzjc.zza((zzkg) obj);
                }
                return zzjc.zzc((zzlc) obj);
            case 11:
                if (obj instanceof zzik) {
                    return zzjc.zzb((zzik) obj);
                }
                return zzjc.zzb((String) obj);
            case 12:
                if (obj instanceof zzik) {
                    return zzjc.zzb((zzik) obj);
                }
                return zzjc.zza((byte[]) obj);
            case 13:
                return zzjc.zzj(((Integer) obj).intValue());
            case 14:
                return zzjc.zzg(((Integer) obj).intValue());
            case 15:
                return zzjc.zze(((Long) obj).longValue());
            case 16:
                return zzjc.zzh(((Integer) obj).intValue());
            case 17:
                return zzjc.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjy) {
                    return zzjc.zzd(((zzjy) obj).zza());
                }
                return zzjc.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzms r0 = r2.zzb()
            com.google.android.gms.internal.measurement.zzjv.zza(r3)
            int[] r1 = com.google.android.gms.internal.measurement.zzjl.zza
            com.google.android.gms.internal.measurement.zzmz r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzlc
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzkg
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzjy
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzik
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zzms r2 = r2.zzb()
            com.google.android.gms.internal.measurement.zzmz r2 = r2.zzb()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjm.zzc(com.google.android.gms.internal.measurement.zzjo, java.lang.Object):void");
    }

    private static <T extends zzjo<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmz.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!zzb(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t2, Object obj) {
        if (t2.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    zzc(t2, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t2, obj);
        }
        if (obj instanceof zzkg) {
            this.zzd = true;
        }
        this.zza.zza((zzlv<T, Object>) t2, (T) obj);
    }

    public static int zza(zzjo<?> zzjoVar, Object obj) {
        zzms zzb2 = zzjoVar.zzb();
        int zza = zzjoVar.zza();
        if (zzjoVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i2 = 0;
            if (!zzjoVar.zzd()) {
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
                i4 += zza(zzb2, list.get(i2));
                i2++;
            }
            return zzjc.zzj(i4) + zzjc.zzi(zza) + i4;
        }
        return zza(zzb2, zza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzle) {
            return ((zzle) obj).zzcn();
        }
        if (obj instanceof zzkg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int zza = this.zza.zza();
        int i2 = 0;
        for (int i3 = 0; i3 < zza; i3++) {
            i2 += zza((Map.Entry) this.zza.zza(i3));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            i2 += zza((Map.Entry) it.next());
        }
        return i2;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzmz.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzkg) {
                return zzjc.zza(entry.getKey().zza(), (zzkg) value);
            }
            return zzjc.zzb(entry.getKey().zza(), (zzlc) value);
        }
        return zza((zzjo<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzlh) {
            return ((zzlh) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t2) {
        Object obj = this.zza.get(t2);
        if (!(obj instanceof zzkg)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    public final void zza(zzjm<T> zzjmVar) {
        int zza = zzjmVar.zza.zza();
        for (int i2 = 0; i2 < zza; i2++) {
            zzb((Map.Entry) zzjmVar.zza.zza(i2));
        }
        Iterator<Map.Entry<T, Object>> it = zzjmVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzjc zzjcVar, zzms zzmsVar, int i2, Object obj) throws IOException {
        if (zzmsVar == zzms.zzj) {
            zzlc zzlcVar = (zzlc) obj;
            zzjv.zza(zzlcVar);
            zzjcVar.zzc(i2, 3);
            zzlcVar.zza(zzjcVar);
            zzjcVar.zzc(i2, 4);
            return;
        }
        zzjcVar.zzc(i2, zzmsVar.zza());
        switch (zzjl.zzb[zzmsVar.ordinal()]) {
            case 1:
                zzjcVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzjcVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzjcVar.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzjcVar.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzjcVar.zzb(((Integer) obj).intValue());
                return;
            case 6:
                zzjcVar.zza(((Long) obj).longValue());
                return;
            case 7:
                zzjcVar.zza(((Integer) obj).intValue());
                return;
            case 8:
                zzjcVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzlc) obj).zza(zzjcVar);
                return;
            case 10:
                zzjcVar.zza((zzlc) obj);
                return;
            case 11:
                if (obj instanceof zzik) {
                    zzjcVar.zza((zzik) obj);
                    return;
                } else {
                    zzjcVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzik) {
                    zzjcVar.zza((zzik) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzjcVar.zzb(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzjcVar.zzc(((Integer) obj).intValue());
                return;
            case 14:
                zzjcVar.zza(((Integer) obj).intValue());
                return;
            case 15:
                zzjcVar.zza(((Long) obj).longValue());
                return;
            case 16:
                zzjcVar.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzjcVar.zzh(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjy) {
                    zzjcVar.zzb(((zzjy) obj).zza());
                    return;
                } else {
                    zzjcVar.zzb(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
