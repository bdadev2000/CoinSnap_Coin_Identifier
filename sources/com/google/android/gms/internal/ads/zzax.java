package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.d;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzax {
    public final Uri zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final zzas zzc;

    @Nullable
    public final zzal zzd;
    public final List zze;

    @Nullable
    public final String zzf;
    public final zzgax zzg;

    @Nullable
    public final Object zzh;
    public final long zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzax(Uri uri, String str, zzas zzasVar, zzal zzalVar, List list, String str2, zzgax zzgaxVar, Object obj, long j2, zzaw zzawVar) {
        this.zza = uri;
        int i2 = zzbn.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgaxVar;
        zzgau zzgauVar = new zzgau();
        if (zzgaxVar.size() > 0) {
            throw null;
        }
        zzgauVar.zzi();
        this.zzh = null;
        this.zzi = -9223372036854775807L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        return this.zza.equals(zzaxVar.zza) && this.zze.equals(zzaxVar.zze) && this.zzg.equals(zzaxVar.zzg) && Objects.equals(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((this.zzg.hashCode() + d.f(this.zze, this.zza.hashCode() * 923521, 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
