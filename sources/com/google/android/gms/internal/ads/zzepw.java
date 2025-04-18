package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.ImpressionLog;

/* loaded from: classes.dex */
public final class zzepw implements zzexh {
    private final zzexh zza;
    private final zzfhc zzb;
    private final Context zzc;
    private final zzcad zzd;

    public zzepw(zzerx zzerxVar, zzfhc zzfhcVar, Context context, zzcad zzcadVar) {
        this.zza = zzerxVar;
        this.zzb = zzfhcVar;
        this.zzc = context;
        this.zzd = zzcadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzm(this.zza.zzb(), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzepv
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return zzepw.this.zzc((zzexq) obj);
            }
        }, zzcan.zzf);
    }

    public final /* synthetic */ zzepx zzc(zzexq zzexqVar) {
        String str;
        boolean z2;
        String str2;
        float f2;
        int i2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = zzsVar.zzg;
        if (zzsVarArr != null) {
            str = null;
            boolean z3 = false;
            boolean z4 = false;
            z2 = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar2 : zzsVarArr) {
                boolean z5 = zzsVar2.zzi;
                if (!z5 && !z3) {
                    str = zzsVar2.zza;
                    z3 = true;
                }
                if (z5) {
                    if (z4) {
                        z4 = true;
                    } else {
                        z4 = true;
                        z2 = true;
                    }
                }
                if (z3 && z4) {
                    break;
                }
            }
        } else {
            str = zzsVar.zza;
            z2 = zzsVar.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        } else {
            zzcad zzcadVar = this.zzd;
            f2 = displayMetrics.density;
            i3 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = zzcadVar.zzi().zzm();
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr2 = zzsVar.zzg;
        if (zzsVarArr2 != null) {
            boolean z6 = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar3 : zzsVarArr2) {
                if (zzsVar3.zzi) {
                    z6 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append(ImpressionLog.Q);
                    }
                    int i5 = zzsVar3.zze;
                    if (i5 == -1) {
                        i5 = f2 != 0.0f ? (int) (zzsVar3.zzf / f2) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzsVar3.zzb;
                    if (i6 == -2) {
                        i6 = f2 != 0.0f ? (int) (zzsVar3.zzc / f2) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z6) {
                if (sb.length() != 0) {
                    i4 = 0;
                    sb.insert(0, ImpressionLog.Q);
                } else {
                    i4 = 0;
                }
                sb.insert(i4, "320x50");
            }
        }
        return new zzepx(zzsVar, str, z2, sb.toString(), f2, i3, i2, str2, this.zzb.zzq);
    }
}
