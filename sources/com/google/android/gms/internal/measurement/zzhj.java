package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhg;
import eb.j;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ra.a;
import ra.g;
import ra.i;
import ra.p;
import ra.q;
import ra.r;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class zzhj<T> {
    private static final Object zza = new Object();
    private static volatile zzhu zzb = null;
    private static volatile boolean zzc = false;
    private static zzhy zzd;
    private static final AtomicInteger zze;
    private final zzhr zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzhy(new zzhx() { // from class: com.google.android.gms.internal.measurement.zzho
            @Override // com.google.android.gms.internal.measurement.zzhx
            public final boolean zza() {
                return zzhj.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Boolean bool, boolean z10) {
        return new zzhq(zzhrVar, str, bool, true);
    }

    private final T zzb(zzhu zzhuVar) {
        zzhb zza2;
        Object zza3;
        if (this.zzf.zzb != null) {
            if (!zzhi.zza(zzhuVar.zza(), this.zzf.zzb)) {
                zza2 = null;
            } else if (this.zzf.zzg) {
                zza2 = zzgu.zza(zzhuVar.zza().getContentResolver(), zzhk.zza(zzhk.zza(zzhuVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhj.zzc();
                    }
                });
            } else {
                zza2 = zzgu.zza(zzhuVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhj.zzc();
                    }
                });
            }
        } else {
            zza2 = zzhw.zza(zzhuVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhm
                @Override // java.lang.Runnable
                public final void run() {
                    zzhj.zzc();
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

    private zzhj(zzhr zzhrVar, String str, T t5, boolean z10) {
        this.zzi = -1;
        String str2 = zzhrVar.zza;
        if (str2 == null && zzhrVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzhrVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzhrVar;
        this.zzg = str;
        this.zzh = t5;
        this.zzk = z10;
        this.zzl = false;
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Double d10, boolean z10) {
        return new zzhp(zzhrVar, str, d10, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, Long l10, boolean z10) {
        return new zzhn(zzhrVar, str, l10, true);
    }

    public static /* synthetic */ zzhj zza(zzhr zzhrVar, String str, String str2, boolean z10) {
        return new zzhs(zzhrVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzk) {
            u0.n("Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.", zzd.zza(this.zzg));
        }
        int i10 = zze.get();
        if (this.zzi < i10) {
            synchronized (this) {
                if (this.zzi < i10) {
                    zzhu zzhuVar = zzb;
                    i iVar = a.f24044b;
                    String str = null;
                    if (zzhuVar != null) {
                        iVar = (i) zzhuVar.zzb().get();
                        if (iVar.b()) {
                            zzhh zzhhVar = (zzhh) iVar.a();
                            zzhr zzhrVar = this.zzf;
                            str = zzhhVar.zza(zzhrVar.zzb, zzhrVar.zza, zzhrVar.zzd, this.zzg);
                        }
                    }
                    u0.n("Must call PhenotypeFlagInitializer.maybeInit() first", zzhuVar != null);
                    if (!this.zzf.zzf ? (zzb2 = zzb(zzhuVar)) == null && (zzb2 = zza(zzhuVar)) == null : (zzb2 = zza(zzhuVar)) == null && (zzb2 = zzb(zzhuVar)) == null) {
                        zzb2 = zze();
                    }
                    if (iVar.b()) {
                        zzb2 = str == null ? zze() : zza((Object) str);
                    }
                    this.zzj = zzb2;
                    this.zzi = i10;
                }
            }
        }
        return this.zzj;
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    public static void zzb(final Context context) {
        p rVar;
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null) {
                synchronized (obj) {
                    zzhu zzhuVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhuVar == null || zzhuVar.zza() != context) {
                        if (zzhuVar != null) {
                            zzgu.zzc();
                            zzhw.zza();
                            zzhc.zza();
                        }
                        p pVar = new p() { // from class: com.google.android.gms.internal.measurement.zzhl
                            @Override // ra.p
                            public final Object get() {
                                i zza2;
                                zza2 = zzhg.zza.zza(context);
                                return zza2;
                            }
                        };
                        if (!(pVar instanceof r) && !(pVar instanceof q)) {
                            if (pVar instanceof Serializable) {
                                rVar = new q(pVar);
                            } else {
                                rVar = new r(pVar);
                            }
                            pVar = rVar;
                        }
                        zzb = new zzgv(context, pVar);
                        zze.incrementAndGet();
                    }
                }
            }
        }
    }

    private final T zza(zzhu zzhuVar) {
        g gVar;
        zzhr zzhrVar = this.zzf;
        if (!zzhrVar.zze && ((gVar = zzhrVar.zzh) == null || ((Boolean) gVar.apply(zzhuVar.zza())).booleanValue())) {
            zzhc zza2 = zzhc.zza(zzhuVar.zza());
            zzhr zzhrVar2 = this.zzf;
            Object zza3 = zza2.zza(zzhrVar2.zze ? null : zza(zzhrVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? j.k(str, this.zzg) : this.zzg;
    }
}
