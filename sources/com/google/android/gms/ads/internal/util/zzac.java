package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzftn;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzac {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle zzb(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzac.zzb(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static void zzc(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzftl zzj = zzftl.zzj(context);
            zzftm zzi = zzftm.zzi(context);
            zzftn zza = zzftn.zza(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            zza.zzb(null);
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "clearStorageOnIdlessMode");
        }
    }
}
