package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes3.dex */
public final class zzauw {
    protected volatile Boolean zzb;
    private final zzawf zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfrr zza = null;
    private static volatile Random zzd = null;

    public zzauw(zzawf zzawfVar) {
        this.zze = zzawfVar;
        zzawfVar.zzk().execute(new zzauv(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzauw.class) {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i10, int i11, long j3, String str, Exception exc) {
        try {
            zzc.block();
            if (this.zzb.booleanValue() && zza != null) {
                zzarl zza2 = zzarp.zza();
                zza2.zza(this.zze.zza.getPackageName());
                zza2.zze(j3);
                if (str != null) {
                    zza2.zzb(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    zza2.zzf(stringWriter.toString());
                    zza2.zzd(exc.getClass().getName());
                }
                zzfrp zza3 = zza.zza(((zzarp) zza2.zzbr()).zzaV());
                zza3.zza(i10);
                if (i11 != -1) {
                    zza3.zzb(i11);
                }
                zza3.zzc();
            }
        } catch (Exception unused) {
        }
    }
}
