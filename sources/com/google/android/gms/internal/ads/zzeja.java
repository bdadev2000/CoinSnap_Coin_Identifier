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
import u.C2738g;

/* loaded from: classes2.dex */
public final class zzeja implements zzehl {
    private final Context zza;
    private final zzdjh zzb;
    private final Executor zzc;
    private final zzfgs zzd;

    public zzeja(Context context, Executor executor, zzdjh zzdjhVar, zzfgs zzfgsVar) {
        this.zza = context;
        this.zzb = zzdjhVar;
        this.zzc = executor;
        this.zzd = zzfgsVar;
    }

    @Nullable
    private static String zzd(zzfgt zzfgtVar) {
        try {
            return zzfgtVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final f4.c zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        final Uri uri;
        String zzd = zzd(zzfgtVar);
        if (zzd != null) {
            uri = Uri.parse(zzd);
        } else {
            uri = null;
        }
        return zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeja.this.zzc(uri, zzfhfVar, zzfgtVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        Context context = this.zza;
        if ((context instanceof Activity) && zzbfm.zzg(context) && !TextUtils.isEmpty(zzd(zzfgtVar))) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ f4.c zzc(Uri uri, zzfhf zzfhfVar, zzfgt zzfgtVar, Object obj) throws Exception {
        try {
            Intent intent = new C2738g().a().f23048a;
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            final zzccn zzccnVar = new zzccn();
            zzdih zze = this.zzb.zze(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdik(new zzdjp() { // from class: com.google.android.gms.internal.ads.zzeiz
                @Override // com.google.android.gms.internal.ads.zzdjp
                public final void zza(boolean z8, Context context, zzczy zzczyVar) {
                    zzccn zzccnVar2 = zzccn.this;
                    try {
                        com.google.android.gms.ads.internal.zzu.zzi();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzccnVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzccnVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new VersionInfoParcel(0, 0, false), null, null));
            this.zzd.zza();
            return zzgft.zzh(zze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
