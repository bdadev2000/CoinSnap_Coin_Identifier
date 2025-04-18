package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzehz implements zzegk {
    private final Context zza;
    private final zzdic zzb;
    private final Executor zzc;
    private final zzfgg zzd;

    public zzehz(Context context, Executor executor, zzdic zzdicVar, zzfgg zzfggVar) {
        this.zza = context;
        this.zzb = zzdicVar;
        this.zzc = executor;
        this.zzd = zzfggVar;
    }

    @Nullable
    private static String zzd(zzfgh zzfghVar) {
        try {
            return zzfghVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(final zzfgt zzfgtVar, final zzfgh zzfghVar) {
        String zzd = zzd(zzfghVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzgfo.zzn(zzgfo.zzh(null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzehz.this.zzc(parse, zzfgtVar, zzfghVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbds.zzg(context) && !TextUtils.isEmpty(zzd(zzfghVar));
    }

    public final /* synthetic */ ListenableFuture zzc(Uri uri, zzfgt zzfgtVar, zzfgh zzfghVar, Object obj) throws Exception {
        try {
            CustomTabsIntent a2 = new CustomTabsIntent.Builder().a();
            a2.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(a2.intent, null);
            final zzcas zzcasVar = new zzcas();
            zzdgz zze = this.zzb.zze(new zzctu(zzfgtVar, zzfghVar, null), new zzdhc(new zzdik() { // from class: com.google.android.gms.internal.ads.zzehy
                @Override // com.google.android.gms.internal.ads.zzdik
                public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
                    zzcas zzcasVar2 = zzcas.this;
                    try {
                        com.google.android.gms.ads.internal.zzu.zzi();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzcasVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcasVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new VersionInfoParcel(0, 0, false), null, null));
            this.zzd.zza();
            return zzgfo.zzh(zze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
