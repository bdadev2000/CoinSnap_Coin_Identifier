package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbdp extends o.a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjx)).split(","));
    private final zzbds zzc;

    @Nullable
    private final o.a zzd;
    private final zzdsr zze;

    public zzbdp(@NonNull zzbds zzbdsVar, @Nullable o.a aVar, zzdsr zzdsrVar) {
        this.zzd = aVar;
        this.zzc = zzbdsVar;
        this.zze = zzdsrVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // o.a
    public final void extraCallback(String str, @Nullable Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // o.a
    @Nullable
    public final Bundle extraCallbackWithResult(String str, @Nullable Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // o.a
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // o.a
    public final void onMessageChannelReady(@Nullable Bundle bundle) {
        this.zza.set(false);
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // o.a
    public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
        List list;
        this.zza.set(false);
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onNavigationEvent(i10, bundle);
        }
        this.zzc.zzi(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        if (this.zzc != null && (list = this.zzb) != null && list.contains(String.valueOf(i10))) {
            this.zzc.zzf();
            zzb("pact_reqpmc");
        }
    }

    @Override // o.a
    public final void onPostMessage(String str, @Nullable Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e2);
        }
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // o.a
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, @Nullable Bundle bundle) {
        o.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
