package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzchl {
    private VersionInfoParcel zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzchl zzd(long j3) {
        this.zzc = j3;
        return this;
    }

    public final zzchl zze(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzchl zzf(VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }
}
