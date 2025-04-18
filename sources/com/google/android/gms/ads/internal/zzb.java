package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbux;
import com.google.android.gms.internal.ads.zzbyh;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzbyh zzc;
    private final zzbux zzd = new zzbux(false, Collections.emptyList());

    public zzb(Context context, @Nullable zzbyh zzbyhVar, @Nullable zzbux zzbuxVar) {
        this.zza = context;
        this.zzc = zzbyhVar;
    }

    private final boolean zzd() {
        zzbyh zzbyhVar = this.zzc;
        return (zzbyhVar != null && zzbyhVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbyh zzbyhVar = this.zzc;
            if (zzbyhVar != null) {
                zzbyhVar.zzd(str, null, 3);
                return;
            }
            zzbux zzbuxVar = this.zzd;
            if (zzbuxVar.zza && (list = zzbuxVar.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzv.zzq();
                        com.google.android.gms.ads.internal.util.zzs.zzL(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
