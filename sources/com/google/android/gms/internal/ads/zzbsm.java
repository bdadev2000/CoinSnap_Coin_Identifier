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
public final class zzbsm extends zzbsp {
    private final Map zza;
    private final Context zzb;

    public zzbsm(zzcfo zzcfoVar, Map map) {
        super(zzcfoVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfoVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        if (!new zzbcd(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzu.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(this.zzb);
        zzK.setTitle(zze != null ? zze.getString(R.string.s1) : "Save image");
        zzK.setMessage(zze != null ? zze.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        zzK.setPositiveButton(zze != null ? zze.getString(R.string.s3) : "Accept", new zzbsk(this, str, lastPathSegment));
        zzK.setNegativeButton(zze != null ? zze.getString(R.string.s4) : "Decline", new zzbsl(this));
        zzK.create().show();
    }
}
