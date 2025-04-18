package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzcdr implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdr(zzccf zzccfVar) {
        Context context = zzccfVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzq().zzc(context, zzccfVar.zzn().afmaVersion);
        this.zzc = new WeakReference(zzccfVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcdr zzcdrVar, String str, Map map) {
        zzccf zzccfVar = (zzccf) zzcdrVar.zzc.get();
        if (zzccfVar != null) {
            zzccfVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdq(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdo(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j3) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdp(this, str, str2, j3));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j3, long j10, boolean z10, int i12, int i13) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdn(this, str, str2, i10, i11, j3, j10, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j3, long j10, boolean z10, long j11, long j12, long j13, int i10, int i11) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdm(this, str, str2, j3, j10, j11, j12, j13, z10, i10, i11));
    }

    public void zzp(int i10) {
    }

    public void zzq(int i10) {
    }

    public void zzr(int i10) {
    }

    public void zzs(int i10) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdj zzcdjVar) {
        return zzt(str);
    }
}
