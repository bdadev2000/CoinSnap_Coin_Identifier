package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbcb;

/* loaded from: classes4.dex */
public final class zzdip implements zzcya, zzdff {
    private final zzbyv zza;
    private final Context zzb;
    private final zzbyz zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbcb.zza.EnumC0122zza zzf;

    public zzdip(zzbyv zzbyvVar, Context context, zzbyz zzbyzVar, @Nullable View view, zzbcb.zza.EnumC0122zza enumC0122zza) {
        this.zza = zzbyvVar;
        this.zzb = context;
        this.zzc = zzbyzVar;
        this.zzd = view;
        this.zzf = enumC0122zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(zzbwm zzbwmVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbyz zzbyzVar = this.zzc;
                Context context = this.zzb;
                zzbyzVar.zzl(context, zzbyzVar.zza(context), this.zza.zza(), zzbwmVar.zzc(), zzbwmVar.zzb());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzl() {
        if (this.zzf == zzbcb.zza.EnumC0122zza.APP_OPEN) {
            return;
        }
        String zzc = this.zzc.zzc(this.zzb);
        this.zze = zzc;
        this.zze = String.valueOf(zzc).concat(this.zzf == zzbcb.zza.EnumC0122zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
