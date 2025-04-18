package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdkc implements View.OnClickListener {

    @Nullable
    String zza;

    @Nullable
    Long zzb;

    @Nullable
    WeakReference zzc;
    private final zzdoc zzd;
    private final Clock zze;

    @Nullable
    private zzbhs zzf;

    @Nullable
    private zzbjr zzg;

    public zzdkc(zzdoc zzdocVar, Clock clock) {
        this.zzd = zzdocVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener(null);
            this.zzc = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (this.zza != null && this.zzb != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzj("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    @Nullable
    public final zzbhs zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void zzc(final zzbhs zzbhsVar) {
        this.zzf = zzbhsVar;
        zzbjr zzbjrVar = this.zzg;
        if (zzbjrVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbjrVar);
        }
        zzbjr zzbjrVar2 = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdkc zzdkcVar = zzdkc.this;
                try {
                    zzdkcVar.zzb = Long.valueOf(Long.parseLong((String) map.get(CampaignEx.JSON_KEY_TIMESTAMP)));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhs zzbhsVar2 = zzbhsVar;
                zzdkcVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhsVar2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbhsVar2.zzf(str);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
        };
        this.zzg = zzbjrVar2;
        this.zzd.zzl("/unconfirmedClick", zzbjrVar2);
    }
}
