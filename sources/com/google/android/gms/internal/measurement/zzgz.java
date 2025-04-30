package com.google.android.gms.internal.measurement;

import c4.C0607a;
import c4.b;
import c4.c;
import com.mbridge.msdk.foundation.entity.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class zzgz<T> {
    private static final Object zza = new Object();
    private static volatile zzhg zzb = null;
    private static volatile boolean zzc = false;
    private static zzhk zzd;
    private static final AtomicInteger zze;
    private final zzhh zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzhk(new zzhn() { // from class: com.google.android.gms.internal.measurement.zzha
            @Override // com.google.android.gms.internal.measurement.zzhn
            public final boolean zza() {
                return zzgz.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    public static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, Boolean bool, boolean z8) {
        return new zzhc(zzhhVar, str, bool, true);
    }

    private final T zzb(zzhg zzhgVar) {
        zzgn zza2;
        Object zza3;
        if (this.zzf.zzb != null) {
            if (!zzgx.zza(zzhgVar.zza(), this.zzf.zzb)) {
                zza2 = null;
            } else if (this.zzf.zzg) {
                zza2 = zzgk.zza(zzhgVar.zza().getContentResolver(), zzgw.zza(zzgw.zza(zzhgVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgz.zzc();
                    }
                });
            } else {
                zza2 = zzgk.zza(zzhgVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgz.zzc();
                    }
                });
            }
        } else {
            zza2 = zzhi.zza(zzhgVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgz.zzc();
                }
            });
        }
        if (zza2 == null || (zza3 = zza2.zza(zzb())) == null) {
            return null;
        }
        return zza(zza3);
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    public abstract T zza(Object obj);

    private zzgz(zzhh zzhhVar, String str, T t9, boolean z8) {
        this.zzi = -1;
        String str2 = zzhhVar.zza;
        if (str2 == null && zzhhVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzhhVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhhVar;
        this.zzg = str;
        this.zzh = t9;
        this.zzk = z8;
        this.zzl = false;
    }

    public static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, Double d2, boolean z8) {
        return new zzhf(zzhhVar, str, d2, true);
    }

    public static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, Long l, boolean z8) {
        return new zzhd(zzhhVar, str, l, true);
    }

    public static /* synthetic */ zzgz zza(zzhh zzhhVar, String str, String str2, boolean z8) {
        return new zzhe(zzhhVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzk && !zzd.zza(this.zzg)) {
            throw new IllegalStateException("Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i9 = zze.get();
        if (this.zzi < i9) {
            synchronized (this) {
                try {
                    if (this.zzi < i9) {
                        zzhg zzhgVar = zzb;
                        c cVar = C0607a.b;
                        String str = null;
                        if (zzhgVar != null) {
                            cVar = (c) zzhgVar.zzb().get();
                            if (cVar.b()) {
                                zzgt zzgtVar = (zzgt) cVar.a();
                                zzhh zzhhVar = this.zzf;
                                str = zzgtVar.zza(zzhhVar.zzb, zzhhVar.zza, zzhhVar.zzd, this.zzg);
                            }
                        }
                        if (zzhgVar != null) {
                            if (!this.zzf.zzf ? (zzb2 = zzb(zzhgVar)) == null && (zzb2 = zza(zzhgVar)) == null : (zzb2 = zza(zzhgVar)) == null && (zzb2 = zzb(zzhgVar)) == null) {
                                zzb2 = zze();
                            }
                            if (cVar.b()) {
                                zzb2 = str == null ? zze() : zza((Object) str);
                            }
                            this.zzj = zzb2;
                            this.zzi = i9;
                        } else {
                            throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzb(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzhg r0 = com.google.android.gms.internal.measurement.zzgz.zzb
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzgz.zza
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzhg r1 = com.google.android.gms.internal.measurement.zzgz.zzb     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.zzhg r1 = com.google.android.gms.internal.measurement.zzgz.zzb     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.zzgk.zzc()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzhi.zza()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzgs.zza()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.zzhb r1 = new com.google.android.gms.internal.measurement.zzhb     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            c4.e r1 = R2.b.t(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzgh r2 = new com.google.android.gms.internal.measurement.zzgh     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.zzgz.zzb = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzgz.zze     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgz.zzb(android.content.Context):void");
    }

    private final T zza(zzhg zzhgVar) {
        b bVar;
        zzhh zzhhVar = this.zzf;
        if (!zzhhVar.zze && ((bVar = zzhhVar.zzh) == null || ((Boolean) bVar.apply(zzhgVar.zza())).booleanValue())) {
            zzgs zza2 = zzgs.zza(zzhgVar.zza());
            zzhh zzhhVar2 = this.zzf;
            Object zza3 = zza2.zza(zzhhVar2.zze ? null : zza(zzhhVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? o.j(str, this.zzg) : this.zzg;
    }
}
