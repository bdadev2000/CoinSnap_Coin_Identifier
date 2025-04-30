package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbdv;

/* loaded from: classes2.dex */
public final class zzdju implements zzczl, zzdgn {
    private final zzcaq zza;
    private final Context zzb;
    private final zzcau zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbdv.zza.EnumC0129zza zzf;

    public zzdju(zzcaq zzcaqVar, Context context, zzcau zzcauVar, @Nullable View view, zzbdv.zza.EnumC0129zza enumC0129zza) {
        this.zza = zzcaqVar;
        this.zzb = context;
        this.zzc = zzcauVar;
        this.zzd = view;
        this.zzf = enumC0129zza;
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzcau zzcauVar = this.zzc;
                Context context = this.zzb;
                zzcauVar.zzl(context, zzcauVar.zza(context), this.zza.zza(), zzbyhVar.zzc(), zzbyhVar.zzb());
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception to get reward item.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzl() {
        String str;
        if (this.zzf == zzbdv.zza.EnumC0129zza.APP_OPEN) {
            return;
        }
        String zzc = this.zzc.zzc(this.zzb);
        this.zze = zzc;
        zzbdv.zza.EnumC0129zza enumC0129zza = this.zzf;
        String valueOf = String.valueOf(zzc);
        if (enumC0129zza == zzbdv.zza.EnumC0129zza.REWARD_BASED_VIDEO_AD) {
            str = "/Rewarded";
        } else {
            str = "/Interstitial";
        }
        this.zze = valueOf.concat(str);
    }
}
