package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import u.C2732a;

/* loaded from: classes2.dex */
public final class zzbfn extends C2732a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjP)).split(","));
    private final zzbfq zzc;

    @Nullable
    private final C2732a zzd;

    public zzbfn(@NonNull zzbfq zzbfqVar, @Nullable C2732a c2732a) {
        this.zzd = c2732a;
        this.zzc = zzbfqVar;
    }

    @Override // u.C2732a
    public final void extraCallback(String str, @Nullable Bundle bundle) {
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            c2732a.extraCallback(str, bundle);
        }
    }

    @Override // u.C2732a
    @Nullable
    public final Bundle extraCallbackWithResult(String str, @Nullable Bundle bundle) {
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            return c2732a.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // u.C2732a
    public final void onActivityResized(int i9, int i10, Bundle bundle) {
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            c2732a.onActivityResized(i9, i10, bundle);
        }
    }

    @Override // u.C2732a
    public final void onMessageChannelReady(@Nullable Bundle bundle) {
        this.zza.set(false);
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            c2732a.onMessageChannelReady(bundle);
        }
    }

    @Override // u.C2732a
    public final void onNavigationEvent(int i9, @Nullable Bundle bundle) {
        List list;
        this.zza.set(false);
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            c2732a.onNavigationEvent(i9, bundle);
        }
        this.zzc.zzi(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        if (this.zzc != null && (list = this.zzb) != null && list.contains(String.valueOf(i9))) {
            this.zzc.zzf();
        }
    }

    @Override // u.C2732a
    public final void onPostMessage(String str, @Nullable Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e4);
        }
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            c2732a.onPostMessage(str, bundle);
        }
    }

    @Override // u.C2732a
    public final void onRelationshipValidationResult(int i9, Uri uri, boolean z8, @Nullable Bundle bundle) {
        C2732a c2732a = this.zzd;
        if (c2732a != null) {
            c2732a.onRelationshipValidationResult(i9, uri, z8, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
