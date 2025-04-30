package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzcaf zzc;
    private final zzbwx zzd = new zzbwx(false, Collections.emptyList());

    public zzb(Context context, @Nullable zzcaf zzcafVar, @Nullable zzbwx zzbwxVar) {
        this.zza = context;
        this.zzc = zzcafVar;
    }

    private final boolean zzd() {
        zzcaf zzcafVar = this.zzc;
        return (zzcafVar != null && zzcafVar.zza().zzf) || this.zzd.zza;
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
            zzcaf zzcafVar = this.zzc;
            if (zzcafVar != null) {
                zzcafVar.zzd(str, null, 3);
                return;
            }
            zzbwx zzbwxVar = this.zzd;
            if (zzbwxVar.zza && (list = zzbwxVar.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzu.zzp();
                        com.google.android.gms.ads.internal.util.zzt.zzL(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
