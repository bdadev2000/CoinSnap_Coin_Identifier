package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjd<T extends zzjf<T>> {
    private static final zzjd zzb = new zzjd(true);
    final zzlm<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzjd() {
        this.zza = new zzlp();
    }

    public static int zza(zzmn zzmnVar, int i9, Object obj) {
        int zzi = zzit.zzi(i9);
        if (zzmnVar == zzmn.zzj) {
            zzjm.zza((zzkt) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmnVar, obj);
    }

    public static <T extends zzjf<T>> zzjd<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjd zzjdVar = new zzjd();
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            Map.Entry<T, Object> zza = this.zza.zza(i9);
            zzjdVar.zzb(zza.getKey(), zza.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzjdVar.zzb(entry.getKey(), entry.getValue());
        }
        zzjdVar.zzd = this.zzd;
        return zzjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjd)) {
            return false;
        }
        return this.zza.equals(((zzjd) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzjy(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzjy(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            Map.Entry<T, Object> zza = this.zza.zza(i9);
            if (zza.getValue() instanceof zzjk) {
                ((zzjk) zza.getValue()).zzck();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            if (!zzc(this.zza.zza(i9))) {
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
        zzkt zzai;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z8 = value instanceof zzjx;
        if (key.zze()) {
            if (!z8) {
                Object zza = zza((zzjd<T>) key);
                if (zza == null) {
                    zza = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) zza).add(zza(it.next()));
                }
                this.zza.zza((zzlm<T, Object>) key, (T) zza);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.zzc() != zzmx.MESSAGE) {
            if (!z8) {
                this.zza.zza((zzlm<T, Object>) key, (T) zza(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object zza2 = zza((zzjd<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzlm<T, Object>) key, (T) zza(value));
            if (z8) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (!z8) {
            if (zza2 instanceof zzky) {
                zzai = key.zza((zzky) zza2, (zzky) value);
            } else {
                zzai = key.zza(((zzkt) zza2).zzci(), (zzkt) value).zzai();
            }
            this.zza.zza((zzlm<T, Object>) key, (T) zzai);
            return;
        }
        throw new NoSuchMethodError();
    }

    private zzjd(zzlm<T, Object> zzlmVar) {
        this.zza = zzlmVar;
        zze();
    }

    private static int zza(zzmn zzmnVar, Object obj) {
        switch (zzjc.zzb[zzmnVar.ordinal()]) {
            case 1:
                return zzit.zza(((Double) obj).doubleValue());
            case 2:
                return zzit.zza(((Float) obj).floatValue());
            case 3:
                return zzit.zzd(((Long) obj).longValue());
            case 4:
                return zzit.zzg(((Long) obj).longValue());
            case 5:
                return zzit.zzf(((Integer) obj).intValue());
            case 6:
                return zzit.zzc(((Long) obj).longValue());
            case 7:
                return zzit.zze(((Integer) obj).intValue());
            case 8:
                return zzit.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzit.zzb((zzkt) obj);
            case 10:
                if (obj instanceof zzjx) {
                    return zzit.zza((zzjx) obj);
                }
                return zzit.zzc((zzkt) obj);
            case 11:
                if (obj instanceof zzia) {
                    return zzit.zzb((zzia) obj);
                }
                return zzit.zzb((String) obj);
            case 12:
                if (obj instanceof zzia) {
                    return zzit.zzb((zzia) obj);
                }
                return zzit.zza((byte[]) obj);
            case 13:
                return zzit.zzj(((Integer) obj).intValue());
            case 14:
                return zzit.zzg(((Integer) obj).intValue());
            case 15:
                return zzit.zze(((Long) obj).longValue());
            case 16:
                return zzit.zzh(((Integer) obj).intValue());
            case 17:
                return zzit.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjp) {
                    return zzit.zzd(((zzjp) obj).zza());
                }
                return zzit.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjx) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjp) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.zzmn r0 = r3.zzb()
            com.google.android.gms.internal.measurement.zzjm.zza(r4)
            int[] r1 = com.google.android.gms.internal.measurement.zzjc.zza
            com.google.android.gms.internal.measurement.zzmx r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzkt
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjx
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjp
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzia
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zzmn r3 = r3.zzb()
            com.google.android.gms.internal.measurement.zzmx r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjd.zzc(com.google.android.gms.internal.measurement.zzjf, java.lang.Object):void");
    }

    private zzjd(boolean z8) {
        this(new zzlp());
        zze();
    }

    private static <T extends zzjf<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmx.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!zzb(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t9, Object obj) {
        if (t9.zze()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    zzc(t9, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t9, obj);
        }
        if (obj instanceof zzjx) {
            this.zzd = true;
        }
        this.zza.zza((zzlm<T, Object>) t9, (T) obj);
    }

    public static int zza(zzjf<?> zzjfVar, Object obj) {
        zzmn zzb2 = zzjfVar.zzb();
        int zza = zzjfVar.zza();
        if (zzjfVar.zze()) {
            List list = (List) obj;
            int i9 = 0;
            if (zzjfVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i9 += zza(zzb2, it.next());
                }
                return zzit.zzj(i9) + zzit.zzi(zza) + i9;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i9 += zza(zzb2, zza, it2.next());
            }
            return i9;
        }
        return zza(zzb2, zza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzkv) {
            return ((zzkv) obj).zzcm();
        }
        if (obj instanceof zzjx) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            i9 += zza((Map.Entry) this.zza.zza(i10));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            i9 += zza((Map.Entry) it.next());
        }
        return i9;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzmx.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzjx) {
                return zzit.zza(entry.getKey().zza(), (zzjx) value);
            }
            return zzit.zzb(entry.getKey().zza(), (zzkt) value);
        }
        return zza((zzjf<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzky) {
            return ((zzky) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t9) {
        Object obj = this.zza.get(t9);
        if (obj instanceof zzjx) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzjd<T> zzjdVar) {
        for (int i9 = 0; i9 < zzjdVar.zza.zza(); i9++) {
            zzb((Map.Entry) zzjdVar.zza.zza(i9));
        }
        Iterator<Map.Entry<T, Object>> it = zzjdVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzit zzitVar, zzmn zzmnVar, int i9, Object obj) throws IOException {
        if (zzmnVar == zzmn.zzj) {
            zzkt zzktVar = (zzkt) obj;
            zzjm.zza(zzktVar);
            zzitVar.zzc(i9, 3);
            zzktVar.zza(zzitVar);
            zzitVar.zzc(i9, 4);
            return;
        }
        zzitVar.zzc(i9, zzmnVar.zza());
        switch (zzjc.zzb[zzmnVar.ordinal()]) {
            case 1:
                zzitVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzitVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzitVar.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzitVar.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzitVar.zzb(((Integer) obj).intValue());
                return;
            case 6:
                zzitVar.zza(((Long) obj).longValue());
                return;
            case 7:
                zzitVar.zza(((Integer) obj).intValue());
                return;
            case 8:
                zzitVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzkt) obj).zza(zzitVar);
                return;
            case 10:
                zzitVar.zza((zzkt) obj);
                return;
            case 11:
                if (obj instanceof zzia) {
                    zzitVar.zza((zzia) obj);
                    return;
                } else {
                    zzitVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzia) {
                    zzitVar.zza((zzia) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzitVar.zzb(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzitVar.zzc(((Integer) obj).intValue());
                return;
            case 14:
                zzitVar.zza(((Integer) obj).intValue());
                return;
            case 15:
                zzitVar.zza(((Long) obj).longValue());
                return;
            case 16:
                zzitVar.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzitVar.zzh(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjp) {
                    zzitVar.zzb(((zzjp) obj).zza());
                    return;
                } else {
                    zzitVar.zzb(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
