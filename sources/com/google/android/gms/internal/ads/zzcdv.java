package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzcdv implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdv(zzccj zzccjVar) {
        Context context = zzccjVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzu.zzp().zzc(context, zzccjVar.zzn().afmaVersion);
        this.zzc = new WeakReference(zzccjVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcdv zzcdvVar, String str, Map map) {
        zzccj zzccjVar = (zzccj) zzcdvVar.zzc.get();
        if (zzccjVar != null) {
            zzccjVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdu(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcds(this, str, str2, i2));
    }

    public final void zzj(String str, String str2, long j2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdt(this, str, str2, j2));
    }

    public final void zzn(String str, String str2, int i2, int i3, long j2, long j3, boolean z2, int i4, int i5) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdr(this, str, str2, i2, i3, j2, j3, z2, i4, i5));
    }

    public final void zzo(String str, String str2, long j2, long j3, boolean z2, long j4, long j5, long j6, int i2, int i3) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdq(this, str, str2, j2, j3, j4, j5, j6, z2, i2, i3));
    }

    public void zzp(int i2) {
    }

    public void zzq(int i2) {
    }

    public void zzr(int i2) {
    }

    public void zzs(int i2) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdn zzcdnVar) {
        return zzt(str);
    }
}
