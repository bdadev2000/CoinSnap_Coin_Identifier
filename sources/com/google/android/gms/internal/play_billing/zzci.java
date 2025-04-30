package com.google.android.gms.internal.play_billing;

import com.applovin.impl.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzci {
    private static final zzci zzb = new zzci(true);
    final zzfb zza = new zzer(16);
    private boolean zzc;
    private boolean zzd;

    private zzci() {
    }

    public static int zza(zzfv zzfvVar, int i9, Object obj) {
        zzby.zzw(i9 << 3);
        if (zzfv.zzj == null) {
            byte[] bArr = zzda.zzd;
            if (((zzec) obj) instanceof zzaz) {
                throw null;
            }
        }
        zzfw zzfwVar = zzfw.INT;
        throw null;
    }

    public static int zzb(zzch zzchVar, Object obj) {
        zzfv zzd = zzchVar.zzd();
        int zza = zzchVar.zza();
        if (zzchVar.zzg()) {
            List list = (List) obj;
            int i9 = 0;
            if (zzchVar.zzf()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    return zzby.zzw(0) + zzby.zzw(zza << 3);
                }
                it.next();
                zzfv zzfvVar = zzfv.zza;
                zzfw zzfwVar = zzfw.INT;
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i9 += zza(zzd, zza, it2.next());
            }
            return i9;
        }
        return zza(zzd, zza, obj);
    }

    public static zzci zzd() {
        return zzb;
    }

    private static Object zzk(Object obj) {
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzd();
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

    private final void zzl(Map.Entry entry) {
        zzec zzf;
        zzch zzchVar = (zzch) entry.getKey();
        Object value = entry.getValue();
        boolean z8 = value instanceof zzdh;
        if (zzchVar.zzg()) {
            if (!z8) {
                Object zze = zze(zzchVar);
                if (zze == null) {
                    zze = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) zze).add(zzk(it.next()));
                }
                this.zza.put(zzchVar, zze);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (zzchVar.zze() == zzfw.MESSAGE) {
            Object zze2 = zze(zzchVar);
            if (zze2 == null) {
                this.zza.put(zzchVar, zzk(value));
                if (z8) {
                    this.zzd = true;
                    return;
                }
                return;
            }
            if (!z8) {
                if (zze2 instanceof zzeh) {
                    zzf = zzchVar.zzc((zzeh) zze2, (zzeh) value);
                } else {
                    zzf = zzchVar.zzb(((zzec) zze2).zzF(), (zzec) value).zzf();
                }
                this.zza.put(zzchVar, zzf);
                return;
            }
            throw null;
        }
        if (!z8) {
            this.zza.put(zzchVar, zzk(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private static boolean zzm(Map.Entry entry) {
        zzch zzchVar = (zzch) entry.getKey();
        if (zzchVar.zze() == zzfw.MESSAGE) {
            if (zzchVar.zzg()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!zzn(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            return zzn(entry.getValue());
        }
        return true;
    }

    private static boolean zzn(Object obj) {
        if (obj instanceof zzed) {
            return ((zzed) obj).zzk();
        }
        if (obj instanceof zzdh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i9;
        int zzw;
        int y4;
        zzch zzchVar = (zzch) entry.getKey();
        Object value = entry.getValue();
        if (zzchVar.zze() == zzfw.MESSAGE && !zzchVar.zzg() && !zzchVar.zzf()) {
            if (value instanceof zzdh) {
                int zza = ((zzch) entry.getKey()).zza();
                int zzw2 = zzby.zzw(8);
                i9 = zzw2 + zzw2;
                zzw = zzby.zzw(zza) + zzby.zzw(16);
                int zzw3 = zzby.zzw(24);
                int zza2 = ((zzdh) value).zza();
                y4 = L.y(zza2, zza2, zzw3);
            } else {
                int zza3 = ((zzch) entry.getKey()).zza();
                int zzw4 = zzby.zzw(8);
                i9 = zzw4 + zzw4;
                zzw = zzby.zzw(zza3) + zzby.zzw(16);
                int zzw5 = zzby.zzw(24);
                int zzf = ((zzec) value).zzf();
                y4 = L.y(zzf, zzf, zzw5);
            }
            return i9 + zzw + y4;
        }
        return zzb(zzchVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzp(com.google.android.gms.internal.play_billing.zzch r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.play_billing.zzfv r0 = r2.zzd()
            byte[] r1 = com.google.android.gms.internal.play_billing.zzda.zzd
            r3.getClass()
            com.google.android.gms.internal.play_billing.zzfv r1 = com.google.android.gms.internal.play_billing.zzfv.zza
            com.google.android.gms.internal.play_billing.zzfw r1 = com.google.android.gms.internal.play_billing.zzfw.INT
            com.google.android.gms.internal.play_billing.zzfw r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzec
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzdh
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzcu
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzbq
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
            com.google.android.gms.internal.play_billing.zzfv r2 = r2.zzd()
            com.google.android.gms.internal.play_billing.zzfw r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzci.zzp(com.google.android.gms.internal.play_billing.zzch, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzci zzciVar = new zzci();
        for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
            Map.Entry zzg = this.zza.zzg(i9);
            zzciVar.zzi((zzch) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzciVar.zzi((zzch) entry.getKey(), entry.getValue());
        }
        zzciVar.zzd = this.zzd;
        return zzciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzci)) {
            return false;
        }
        return this.zza.equals(((zzci) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            i9 += zzo(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i9 += zzo((Map.Entry) it.next());
        }
        return i9;
    }

    public final Object zze(zzch zzchVar) {
        Object obj = this.zza.get(zzchVar);
        if (!(obj instanceof zzdh)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        if (this.zzd) {
            return new zzdg(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
                Map.Entry zzg = this.zza.zzg(i9);
                if (zzg.getValue() instanceof zzcs) {
                    ((zzcs) zzg.getValue()).zzr();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzci zzciVar) {
        for (int i9 = 0; i9 < zzciVar.zza.zzb(); i9++) {
            zzl(zzciVar.zza.zzg(i9));
        }
        Iterator it = zzciVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzl((Map.Entry) it.next());
        }
    }

    public final void zzi(zzch zzchVar, Object obj) {
        if (zzchVar.zzg()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    zzp(zzchVar, arrayList.get(i9));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzp(zzchVar, obj);
        }
        if (obj instanceof zzdh) {
            this.zzd = true;
        }
        this.zza.put(zzchVar, obj);
    }

    public final boolean zzj() {
        for (int i9 = 0; i9 < this.zza.zzb(); i9++) {
            if (!zzm(this.zza.zzg(i9))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzm((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzci(boolean z8) {
        zzg();
        zzg();
    }
}
