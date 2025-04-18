package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzar {
    public final Uri zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final zzao zzc;

    @Nullable
    public final zzaj zzd;
    public final List zze;

    @Nullable
    public final String zzf;
    public final zzfzo zzg;

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
    public /* synthetic */ zzar(Uri uri, String str, zzao zzaoVar, zzaj zzajVar, List list, String str2, zzfzo zzfzoVar, Object obj, long j3, zzav zzavVar) {
        this.zza = uri;
        int i10 = zzbg.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfzoVar;
        zzfzl zzfzlVar = new zzfzl();
        if (zzfzoVar.size() <= 0) {
            zzfzlVar.zzi();
            this.zzh = null;
            this.zzi = C.TIME_UNSET;
            return;
        }
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzar)) {
            return false;
        }
        zzar zzarVar = (zzar) obj;
        if (this.zza.equals(zzarVar.zza) && this.zze.equals(zzarVar.zze) && this.zzg.equals(zzarVar.zzg)) {
            Long valueOf = Long.valueOf(C.TIME_UNSET);
            if (Objects.equals(valueOf, valueOf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((this.zzg.hashCode() + e.d(this.zze, this.zza.hashCode() * 923521, 961)) * 31 * 31) + C.TIME_UNSET);
    }
}
