package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzoj {
    public final String zza;

    @Nullable
    private final zzoi zzb;

    @Nullable
    private final Object zzc;

    static {
        if (zzen.zza < 31) {
            new zzoj("");
        } else {
            int i10 = zzoi.zzb;
        }
    }

    @RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
    public zzoj(LogSessionId logSessionId, String str) {
        this.zzb = new zzoi(logSessionId);
        this.zza = str;
        this.zzc = new Object();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        if (Objects.equals(this.zza, zzojVar.zza) && Objects.equals(this.zzb, zzojVar.zzb) && Objects.equals(this.zzc, zzojVar.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    @RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
    public final LogSessionId zza() {
        zzoi zzoiVar = this.zzb;
        zzoiVar.getClass();
        return zzoiVar.zza;
    }

    public zzoj(String str) {
        zzdb.zzf(zzen.zza < 31);
        this.zza = str;
        this.zzb = null;
        this.zzc = new Object();
    }
}
