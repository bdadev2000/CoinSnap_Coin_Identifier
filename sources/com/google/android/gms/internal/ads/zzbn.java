package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbn {
    public final Uri zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final zzbg zzd;

    @Nullable
    public final zzav zze;
    public final List zzf;

    @Nullable
    public final String zzg;
    public final zzgbc zzh;

    @Deprecated
    public final List zzi;

    @Nullable
    public final Object zzj;
    public final long zzk;
    private static final String zzl = Integer.toString(0, 36);
    private static final String zzm = Integer.toString(1, 36);
    private static final String zzn = Integer.toString(2, 36);
    private static final String zzo = Integer.toString(3, 36);
    private static final String zzp = Integer.toString(4, 36);
    private static final String zzq = Integer.toString(5, 36);
    private static final String zzr = Integer.toString(6, 36);
    private static final String zzs = Integer.toString(7, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzbl
    };

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzbn(Uri uri, String str, zzbg zzbgVar, zzav zzavVar, List list, String str2, zzgbc zzgbcVar, Object obj, long j7, zzbm zzbmVar) {
        this.zzb = uri;
        int i9 = zzcg.zza;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = list;
        this.zzg = null;
        this.zzh = zzgbcVar;
        zzgaz zzgazVar = new zzgaz();
        if (zzgbcVar.size() <= 0) {
            this.zzi = zzgazVar.zzi();
            this.zzj = null;
            this.zzk = C.TIME_UNSET;
            return;
        }
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbnVar = (zzbn) obj;
        if (this.zzb.equals(zzbnVar.zzb) && zzgd.zzG(null, null) && zzgd.zzG(null, null) && zzgd.zzG(null, null) && this.zzf.equals(zzbnVar.zzf) && zzgd.zzG(null, null) && this.zzh.equals(zzbnVar.zzh) && zzgd.zzG(null, null)) {
            Long valueOf = Long.valueOf(C.TIME_UNSET);
            if (zzgd.zzG(valueOf, valueOf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) (((this.zzh.hashCode() + ((this.zzf.hashCode() + (this.zzb.hashCode() * 923521)) * 961)) * 31 * 31) + C.TIME_UNSET);
    }
}
