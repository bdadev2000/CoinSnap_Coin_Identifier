package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzevb implements zzexw {
    private final zzgge zza;

    @Nullable
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzevb(zzgge zzggeVar, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzggeVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevb.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzevc zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgb)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzevc(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgc)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        boolean z8 = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z8 = true;
                        }
                        bool = Boolean.valueOf(z8);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzevc(bool);
            }
        }
        return new zzevc(null);
    }
}
