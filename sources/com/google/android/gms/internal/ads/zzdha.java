package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbs;

/* loaded from: classes3.dex */
public final class zzdha implements zzcwm, zzddq {
    private final zzbyr zza;
    private final Context zzb;
    private final zzbyv zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbbs.zza.EnumC0141zza zzf;

    public zzdha(zzbyr zzbyrVar, Context context, zzbyv zzbyvVar, @Nullable View view, zzbbs.zza.EnumC0141zza enumC0141zza) {
        this.zza = zzbyrVar;
        this.zzb = context;
        this.zzc = zzbyvVar;
        this.zzd = view;
        this.zzf = enumC0141zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbyv zzbyvVar = this.zzc;
                Context context = this.zzb;
                zzbyvVar.zzl(context, zzbyvVar.zza(context), this.zza.zza(), zzbwjVar.zzc(), zzbwjVar.zzb());
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzl() {
        String str;
        if (this.zzf == zzbbs.zza.EnumC0141zza.APP_OPEN) {
            return;
        }
        String zzc = this.zzc.zzc(this.zzb);
        this.zze = zzc;
        zzbbs.zza.EnumC0141zza enumC0141zza = this.zzf;
        String valueOf = String.valueOf(zzc);
        if (enumC0141zza == zzbbs.zza.EnumC0141zza.REWARD_BASED_VIDEO_AD) {
            str = "/Rewarded";
        } else {
            str = "/Interstitial";
        }
        this.zze = valueOf.concat(str);
    }
}
