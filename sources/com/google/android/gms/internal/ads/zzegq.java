package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import o.l;

/* loaded from: classes3.dex */
public final class zzegq implements zzefb {
    private final Context zza;
    private final zzdgn zzb;
    private final Executor zzc;
    private final zzfes zzd;

    public zzegq(Context context, Executor executor, zzdgn zzdgnVar, zzfes zzfesVar) {
        this.zza = context;
        this.zzb = zzdgnVar;
        this.zzc = executor;
        this.zzd = zzfesVar;
    }

    @Nullable
    private static String zzd(zzfet zzfetVar) {
        try {
            return zzfetVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final ua.b zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        final Uri uri;
        String zzd = zzd(zzfetVar);
        if (zzd != null) {
            uri = Uri.parse(zzd);
        } else {
            uri = null;
        }
        return zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzegq.this.zzc(uri, zzfffVar, zzfetVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        Context context = this.zza;
        if ((context instanceof Activity) && zzbdo.zzg(context) && !TextUtils.isEmpty(zzd(zzfetVar))) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ ua.b zzc(Uri uri, zzfff zzfffVar, zzfet zzfetVar, Object obj) throws Exception {
        try {
            Intent intent = new l().a().a;
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            final zzcao zzcaoVar = new zzcao();
            zzdfk zze = this.zzb.zze(new zzcsg(zzfffVar, zzfetVar, null), new zzdfn(new zzdgv() { // from class: com.google.android.gms.internal.ads.zzegp
                @Override // com.google.android.gms.internal.ads.zzdgv
                public final void zza(boolean z10, Context context, zzcwz zzcwzVar) {
                    zzcao zzcaoVar2 = zzcao.this;
                    try {
                        com.google.android.gms.ads.internal.zzv.zzj();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzcaoVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcaoVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new VersionInfoParcel(0, 0, false), null, null));
            this.zzd.zza();
            return zzgei.zzh(zze.zzg());
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }
}
