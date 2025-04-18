package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxh extends zzaxt {
    public zzaxh(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "5M/doPlP18zj3rcFgQUszE+WSqXh/st9yUF5JdFdktMd87cDlxgzyepiU5bej2uF", "KwLCo2LsichRi68Y4oRLpNy6fN1z6Wq88wujVx/pAjo=", zzasfVar, i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavl zzavlVar = new zzavl((String) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcU)).booleanValue())));
        synchronized (this.zzd) {
            this.zzd.zzj(zzavlVar.zza);
            this.zzd.zzC(zzavlVar.zzb);
        }
    }
}
