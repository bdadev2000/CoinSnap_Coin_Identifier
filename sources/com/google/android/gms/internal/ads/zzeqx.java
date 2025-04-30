package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class zzeqx implements zzexw {
    private final zzexw zza;
    private final zzfho zzb;
    private final Context zzc;
    private final zzcby zzd;

    public zzeqx(zzesu zzesuVar, zzfho zzfhoVar, Context context, zzcby zzcbyVar) {
        this.zza = zzesuVar;
        this.zzb = zzfhoVar;
        this.zzc = context;
        this.zzd = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzm(this.zza.zzb(), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return zzeqx.this.zzc((zzeyb) obj);
            }
        }, zzcci.zzf);
    }

    public final /* synthetic */ zzeqy zzc(zzeyb zzeybVar) {
        String str;
        boolean z8;
        String str2;
        float f9;
        int i9;
        int i10;
        int i11;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr == null) {
            str = zzqVar.zza;
            z8 = zzqVar.zzi;
        } else {
            str = null;
            boolean z9 = false;
            boolean z10 = false;
            z8 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z11 = zzqVar2.zzi;
                if (!z11 && !z9) {
                    str = zzqVar2.zza;
                    z9 = true;
                }
                if (z11) {
                    if (!z10) {
                        z10 = true;
                        z8 = true;
                    } else {
                        z10 = true;
                    }
                }
                if (z9 && z10) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzcby zzcbyVar = this.zzd;
            f9 = displayMetrics.density;
            i10 = displayMetrics.widthPixels;
            i9 = displayMetrics.heightPixels;
            str2 = zzcbyVar.zzi().zzm();
        } else {
            str2 = null;
            f9 = 0.0f;
            i9 = 0;
            i10 = 0;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z12 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z12 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i12 = zzqVar3.zze;
                    if (i12 == -1) {
                        if (f9 != 0.0f) {
                            i12 = (int) (zzqVar3.zzf / f9);
                        } else {
                            i12 = -1;
                        }
                    }
                    sb.append(i12);
                    sb.append("x");
                    int i13 = zzqVar3.zzb;
                    if (i13 == -2) {
                        if (f9 != 0.0f) {
                            i13 = (int) (zzqVar3.zzc / f9);
                        } else {
                            i13 = -2;
                        }
                    }
                    sb.append(i13);
                }
            }
            if (z12) {
                if (sb.length() != 0) {
                    i11 = 0;
                    sb.insert(0, "|");
                } else {
                    i11 = 0;
                }
                sb.insert(i11, "320x50");
            }
        }
        return new zzeqy(zzqVar, str, z8, sb.toString(), f9, i10, i9, str2, this.zzb.zzq);
    }
}
