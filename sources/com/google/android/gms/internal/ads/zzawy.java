package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class zzawy {
    protected volatile Boolean zzb;
    private final zzaye zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzftk zza = null;
    private static volatile Random zzd = null;

    public zzawy(zzaye zzayeVar) {
        this.zze = zzayeVar;
        zzayeVar.zzk().execute(new zzawx(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzawy.class) {
                    try {
                        if (zzd == null) {
                            zzd = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i9, int i10, long j7, String str, Exception exc) {
        try {
            zzc.block();
            if (this.zzb.booleanValue() && zza != null) {
                zzasx zza2 = zzatd.zza();
                zza2.zza(this.zze.zza.getPackageName());
                zza2.zzf(j7);
                if (str != null) {
                    zza2.zzb(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    zza2.zzg(stringWriter.toString());
                    zza2.zzd(exc.getClass().getName());
                }
                zzftj zza3 = zza.zza(((zzatd) zza2.zzbr()).zzaV());
                zza3.zza(i9);
                if (i10 != -1) {
                    zza3.zzb(i10);
                }
                zza3.zzc();
            }
        } catch (Exception unused) {
        }
    }
}
