package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbug extends zzbuj {
    private final Map zza;
    private final Context zzb;

    public zzbug(zzchd zzchdVar, Map map) {
        super(zzchdVar, "storePicture");
        this.zza = map;
        this.zzb = zzchdVar.zzi();
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
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!new zzbdx(this.zzb).zzc()) {
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
            com.google.android.gms.ads.internal.zzu.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
                com.google.android.gms.ads.internal.zzu.zzp();
                AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(this.zzb);
                if (zze != null) {
                    str = zze.getString(R.string.s1);
                } else {
                    str = "Save image";
                }
                zzK.setTitle(str);
                if (zze != null) {
                    str2 = zze.getString(R.string.f13883s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzK.setMessage(str2);
                if (zze != null) {
                    str3 = zze.getString(R.string.f13884s3);
                } else {
                    str3 = "Accept";
                }
                zzK.setPositiveButton(str3, new zzbue(this, str5, lastPathSegment));
                if (zze != null) {
                    str4 = zze.getString(R.string.f13885s4);
                } else {
                    str4 = "Decline";
                }
                zzK.setNegativeButton(str4, new zzbuf(this));
                zzK.create().show();
                return;
            }
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        zzh("Invalid image url: ".concat(String.valueOf(str5)));
    }
}
