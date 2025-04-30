package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzpj {
    public static final zzpj zza;
    public final String zzb;

    @Nullable
    private final zzpi zzc;

    @Nullable
    private final Object zzd;

    static {
        zzpj zzpjVar;
        if (zzgd.zza < 31) {
            zzpjVar = new zzpj("");
        } else {
            zzpjVar = new zzpj(zzpi.zza, "");
        }
        zza = zzpjVar;
    }

    private zzpj(zzpi zzpiVar, String str) {
        this.zzc = zzpiVar;
        this.zzb = str;
        this.zzd = new Object();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpj)) {
            return false;
        }
        zzpj zzpjVar = (zzpj) obj;
        if (Objects.equals(this.zzb, zzpjVar.zzb) && Objects.equals(this.zzc, zzpjVar.zzc) && Objects.equals(this.zzd, zzpjVar.zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd);
    }

    @RequiresApi(31)
    public final LogSessionId zza() {
        zzpi zzpiVar = this.zzc;
        zzpiVar.getClass();
        return zzpiVar.zzb;
    }

    @RequiresApi(31)
    public zzpj(LogSessionId logSessionId, String str) {
        this(new zzpi(logSessionId), str);
    }

    public zzpj(String str) {
        zzeq.zzf(zzgd.zza < 31);
        this.zzb = str;
        this.zzc = null;
        this.zzd = new Object();
    }
}
