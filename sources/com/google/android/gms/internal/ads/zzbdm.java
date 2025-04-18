package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.h;
import o.o;
import o.s;

/* loaded from: classes3.dex */
public final class zzbdm extends o {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzdsm zzd;

    @Nullable
    private s zze;

    @Nullable
    private h zzf;

    private final void zzf(@Nullable Context context) {
        String b3;
        if (this.zzf == null && context != null && (b3 = h.b(context)) != null) {
            h.a(context, b3, this);
        }
    }

    @Override // o.o
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull h hVar) {
        this.zzf = hVar;
        hVar.getClass();
        try {
            ((b.c) hVar.a).l();
        } catch (RemoteException unused) {
        }
        this.zze = hVar.c(new zzbdl(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    @Nullable
    public final s zza() {
        if (this.zze == null) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdk
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdm.this.zzc();
                }
            });
        }
        return this.zze;
    }

    public final void zzb(Context context, zzdsm zzdsmVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdsmVar;
        zzf(context);
    }

    public final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zzd(int i10) {
        zzdsm zzdsmVar = this.zzd;
        if (zzdsmVar != null) {
            zzdsl zza2 = zzdsmVar.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i10));
            zza2.zzf();
        }
    }

    public final void zze(final int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeE)).booleanValue() && this.zzd != null) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdj
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdm.this.zzd(i10);
                }
            });
        }
    }
}
