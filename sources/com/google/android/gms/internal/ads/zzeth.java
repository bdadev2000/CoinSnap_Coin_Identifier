package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeth implements zzevz {
    private final zzges zza;

    @Nullable
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzeth(zzges zzgesVar, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgesVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeth.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeti zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfN)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzeti(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfO)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        boolean z10 = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z10 = true;
                        }
                        bool = Boolean.valueOf(z10);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzeti(bool);
            }
        }
        return new zzeti(null);
    }
}
