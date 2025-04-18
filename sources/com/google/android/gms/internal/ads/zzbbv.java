package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzbbv {
    private final Context zza;

    public zzbbv(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        if (this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.util.zzcc.zza(this.zza, new Callable() { // from class: com.google.android.gms.internal.ads.zzbbu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && Wrappers.packageManager(this.zza).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }
}
