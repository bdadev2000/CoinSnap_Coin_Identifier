package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcn;

/* loaded from: classes3.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzac zzacVar, @Nullable zzaa zzaaVar, boolean z10) {
        if (z10) {
            return zzc(context, intent.getData(), zzacVar, zzaaVar);
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(context, intent);
            if (zzacVar != null) {
                zzacVar.zzg();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e2.getMessage());
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, @Nullable zzc zzcVar, zzac zzacVar, @Nullable zzaa zzaaVar) {
        int i10 = 0;
        if (zzcVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbcn.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzacVar, zzaaVar, zzcVar.zzj);
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
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzeC)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzeB)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzo(context, intent2);
            }
        }
        return zza(context, intent2, zzacVar, zzaaVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzac zzacVar, zzaa zzaaVar) {
        int i10;
        try {
            i10 = com.google.android.gms.ads.internal.zzv.zzq().zzm(context, uri);
            if (zzacVar != null) {
                zzacVar.zzg();
            }
        } catch (ActivityNotFoundException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e2.getMessage());
            i10 = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.zzb(i10);
        }
        if (i10 != 5) {
            return false;
        }
        return true;
    }
}
