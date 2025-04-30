package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzcfp implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcfp(zzcee zzceeVar) {
        Context context = zzceeVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzu.zzp().zzc(context, zzceeVar.zzn().afmaVersion);
        this.zzc = new WeakReference(zzceeVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcfp zzcfpVar, String str, Map map) {
        zzcee zzceeVar = (zzcee) zzcfpVar.zzc.get();
        if (zzceeVar != null) {
            zzceeVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfo(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i9) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfm(this, str, str2, i9));
    }

    public final void zzj(String str, String str2, long j7) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfn(this, str, str2, j7));
    }

    public final void zzn(String str, String str2, int i9, int i10, long j7, long j9, boolean z8, int i11, int i12) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfl(this, str, str2, i9, i10, j7, j9, z8, i11, i12));
    }

    public final void zzo(String str, String str2, long j7, long j9, boolean z8, long j10, long j11, long j12, int i9, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfk(this, str, str2, j7, j9, j10, j11, j12, z8, i9, i10));
    }

    public void zzp(int i9) {
    }

    public void zzq(int i9) {
    }

    public void zzr(int i9) {
    }

    public void zzs(int i9) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcfh zzcfhVar) {
        return zzt(str);
    }
}
