package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzcje {
    private VersionInfoParcel zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcje zzd(long j7) {
        this.zzc = j7;
        return this;
    }

    public final zzcje zze(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcje zzf(VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }
}
