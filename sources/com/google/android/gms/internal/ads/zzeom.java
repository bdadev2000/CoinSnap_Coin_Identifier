package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public final class zzeom implements zzevz {
    private final zzevz zza;
    private final zzffo zzb;
    private final Context zzc;
    private final zzbzz zzd;

    public zzeom(zzeqp zzeqpVar, zzffo zzffoVar, Context context, zzbzz zzbzzVar) {
        this.zza = zzeqpVar;
        this.zzb = zzffoVar;
        this.zzc = context;
        this.zzd = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzm(this.zza.zzb(), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return zzeom.this.zzc((zzewi) obj);
            }
        }, zzcaj.zzf);
    }

    public final /* synthetic */ zzeon zzc(zzewi zzewiVar) {
        String str;
        boolean z10;
        String str2;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = zzsVar.zzg;
        if (zzsVarArr == null) {
            str = zzsVar.zza;
            z10 = zzsVar.zzi;
        } else {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar2 : zzsVarArr) {
                boolean z13 = zzsVar2.zzi;
                if (!z13 && !z11) {
                    str = zzsVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z12 = true;
                        z10 = true;
                    } else {
                        z12 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        }
        Resources resources = this.zzc.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzbzz zzbzzVar = this.zzd;
            f10 = displayMetrics.density;
            i11 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            str2 = zzbzzVar.zzi().zzj();
        } else {
            str2 = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr2 = zzsVar.zzg;
        if (zzsVarArr2 != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar3 : zzsVarArr2) {
                if (zzsVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i13 = zzsVar3.zze;
                    if (i13 == -1) {
                        if (f10 != 0.0f) {
                            i13 = (int) (zzsVar3.zzf / f10);
                        } else {
                            i13 = -1;
                        }
                    }
                    sb2.append(i13);
                    sb2.append("x");
                    int i14 = zzsVar3.zzb;
                    if (i14 == -2) {
                        if (f10 != 0.0f) {
                            i14 = (int) (zzsVar3.zzc / f10);
                        } else {
                            i14 = -2;
                        }
                    }
                    sb2.append(i14);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzeon(zzsVar, str, z10, sb2.toString(), f10, i11, i10, str2, this.zzb.zzq);
    }
}
