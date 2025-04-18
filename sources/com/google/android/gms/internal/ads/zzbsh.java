package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbsh extends zzbsk {
    private final Map zza;
    private final Context zzb;

    public zzbsh(zzcfk zzcfkVar, Map map) {
        super(zzcfkVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfkVar.zzi();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new zzbbv(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            com.google.android.gms.ads.internal.zzv.zzq();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
                com.google.android.gms.ads.internal.zzv.zzq();
                AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzs.zzK(this.zzb);
                if (zze != null) {
                    str = zze.getString(R.string.f11544s1);
                } else {
                    str = "Save image";
                }
                zzK.setTitle(str);
                if (zze != null) {
                    str2 = zze.getString(R.string.f11545s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzK.setMessage(str2);
                if (zze != null) {
                    str3 = zze.getString(R.string.f11546s3);
                } else {
                    str3 = "Accept";
                }
                zzK.setPositiveButton(str3, new zzbsf(this, str5, lastPathSegment));
                if (zze != null) {
                    str4 = zze.getString(R.string.f11547s4);
                } else {
                    str4 = "Decline";
                }
                zzK.setNegativeButton(str4, new zzbsg(this));
                zzK.create().show();
                return;
            }
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        zzh("Invalid image url: ".concat(String.valueOf(str5)));
    }
}
