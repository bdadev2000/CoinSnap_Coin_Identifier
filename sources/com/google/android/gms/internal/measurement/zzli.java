package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzli<T> implements zzlu<T> {
    private final zzlc zza;
    private final zzmk<?, ?> zzb;
    private final boolean zzc;
    private final zzji<?> zzd;

    private zzli(zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzlc zzlcVar) {
        this.zzb = zzmkVar;
        this.zzc = zzjiVar.zza(zzlcVar);
        this.zzd = zzjiVar;
        this.zza = zzlcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t5) {
        zzmk<?, ?> zzmkVar = this.zzb;
        int zzb = zzmkVar.zzb(zzmkVar.zzd(t5)) + 0;
        return this.zzc ? zzb + this.zzd.zza(t5).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t5) {
        int hashCode = this.zzb.zzd(t5).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t5).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzd(T t5) {
        this.zzb.zzf(t5);
        this.zzd.zzc(t5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze(T t5) {
        return this.zzd.zza(t5).zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzb(T t5, T t10) {
        if (!this.zzb.zzd(t5).equals(this.zzb.zzd(t10))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t5).equals(this.zzd.zza(t10));
        }
        return true;
    }

    public static <T> zzli<T> zza(zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzlc zzlcVar) {
        return new zzli<>(zzmkVar, zzjiVar, zzlcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final T zza() {
        zzlc zzlcVar = this.zza;
        if (zzlcVar instanceof zzjt) {
            return (T) ((zzjt) zzlcVar).zzce();
        }
        return (T) zzlcVar.zzci().zzaj();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t5, T t10) {
        zzlw.zza(this.zzb, t5, t10);
        if (this.zzc) {
            zzlw.zza(this.zzd, t5, t10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t5, zzlr zzlrVar, zzjg zzjgVar) throws IOException {
        boolean z10;
        zzmk<?, ?> zzmkVar = this.zzb;
        zzji<?> zzjiVar = this.zzd;
        Object zzc = zzmkVar.zzc(t5);
        zzjm<?> zzb = zzjiVar.zzb(t5);
        do {
            try {
                if (zzlrVar.zzc() == Integer.MAX_VALUE) {
                    return;
                }
                int zzd = zzlrVar.zzd();
                int i10 = 0;
                if (zzd == 11) {
                    Object obj = null;
                    zzik zzikVar = null;
                    while (zzlrVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzlrVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzlrVar.zzj();
                            obj = zzjiVar.zza(zzjgVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzjiVar.zza(zzlrVar, obj, zzjgVar, zzb);
                            } else {
                                zzikVar = zzlrVar.zzp();
                            }
                        } else if (!zzlrVar.zzt()) {
                            break;
                        }
                    }
                    if (zzlrVar.zzd() != 12) {
                        throw zzkb.zzb();
                    }
                    if (zzikVar != null) {
                        if (obj != null) {
                            zzjiVar.zza(zzikVar, obj, zzjgVar, zzb);
                        } else {
                            zzmkVar.zza((zzmk<?, ?>) zzc, i10, zzikVar);
                        }
                    }
                } else if ((zzd & 7) == 2) {
                    Object zza = zzjiVar.zza(zzjgVar, this.zza, zzd >>> 3);
                    if (zza != null) {
                        zzjiVar.zza(zzlrVar, zza, zzjgVar, zzb);
                    } else {
                        z10 = zzmkVar.zza((zzmk<?, ?>) zzc, zzlrVar, 0);
                    }
                } else {
                    z10 = zzlrVar.zzt();
                }
                z10 = true;
            } finally {
                zzmkVar.zzb((Object) t5, (T) zzc);
            }
        } while (z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzij r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzjt r0 = (com.google.android.gms.internal.measurement.zzjt) r0
            com.google.android.gms.internal.measurement.zzmj r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzmj r2 = com.google.android.gms.internal.measurement.zzmj.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzmj r1 = com.google.android.gms.internal.measurement.zzmj.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzjt$zzd r10 = (com.google.android.gms.internal.measurement.zzjt.zzd) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzig.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zzji<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzjg r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzlc r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzjt$zzf r0 = (com.google.android.gms.internal.measurement.zzjt.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzig.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzlq.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzig.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzig.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzig.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzik r2 = (com.google.android.gms.internal.measurement.zzik) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzlq.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzig.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zzji<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzjg r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzlc r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzjt$zzf r0 = (com.google.android.gms.internal.measurement.zzjt.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzig.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzkb r10 = com.google.android.gms.internal.measurement.zzkb.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzli.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzij):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t5, zznb zznbVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t5).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzjo zzjoVar = (zzjo) next.getKey();
            if (zzjoVar.zzc() == zzmz.MESSAGE && !zzjoVar.zze() && !zzjoVar.zzd()) {
                if (next instanceof zzkf) {
                    zznbVar.zza(zzjoVar.zza(), (Object) ((zzkf) next).zza().zzb());
                } else {
                    zznbVar.zza(zzjoVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzmk<?, ?> zzmkVar = this.zzb;
        zzmkVar.zza((zzmk<?, ?>) zzmkVar.zzd(t5), zznbVar);
    }
}
