package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbep;

/* loaded from: classes2.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzaa zzaaVar, @Nullable zzy zzyVar, boolean z8) {
        if (z8) {
            return zzc(context, intent.getData(), zzaaVar, zzyVar);
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
            if (zzyVar != null) {
                zzyVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e4.getMessage());
            if (zzyVar != null) {
                zzyVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, @Nullable zzc zzcVar, zzaa zzaaVar, @Nullable zzy zzyVar) {
        int i9 = 0;
        if (zzcVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbep.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzaaVar, zzyVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzcVar.zzc)) {
            String str = zzcVar.zzb;
            intent2.setDataAndType(Uri.parse(str), zzcVar.zzc);
        } else {
            intent2.setData(Uri.parse(zzcVar.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i9 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i9);
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzeA)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().zza(zzbep.zzez)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intent2);
            }
        }
        return zza(context, intent2, zzaaVar, zzyVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzaa zzaaVar, zzy zzyVar) {
        int i9;
        try {
            i9 = com.google.android.gms.ads.internal.zzu.zzp().zzm(context, uri);
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
        } catch (ActivityNotFoundException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e4.getMessage());
            i9 = 6;
        }
        if (zzyVar != null) {
            zzyVar.zzb(i9);
        }
        if (i9 != 5) {
            return false;
        }
        return true;
    }
}
