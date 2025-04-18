package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes4.dex */
public final class zzavh {

    @VisibleForTesting
    protected volatile Boolean zzb;
    private final zzawo zze;
    private static final ConditionVariable zzc = new ConditionVariable();

    @VisibleForTesting
    protected static volatile zzftb zza = null;
    private static volatile Random zzd = null;

    public zzavh(zzawo zzawoVar) {
        this.zze = zzawoVar;
        zzawoVar.zzk().execute(new zzavg(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzavh.class) {
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

    public final void zzc(int i2, int i3, long j2, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzarv zza2 = zzarz.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j2);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfta zza3 = zza.zza(((zzarz) zza2.zzbr()).zzaV());
            zza3.zza(i2);
            if (i3 != -1) {
                zza3.zzb(i3);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}
