package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzbwd;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* loaded from: classes2.dex */
public final class ReportingInfo {
    private final zzbwd zza;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final zzbwc zza;

        @KeepForSdk
        public Builder(@NonNull View view) {
            zzbwc zzbwcVar = new zzbwc();
            this.zza = zzbwcVar;
            zzbwcVar.zzb(view);
        }

        @NonNull
        @KeepForSdk
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @NonNull
        @KeepForSdk
        public Builder setAssetViews(@NonNull Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbwd(builder.zza);
    }

    @KeepForSdk
    public void recordClick(@NonNull List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    public void recordImpression(@NonNull List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    public void reportTouchEvent(@NonNull MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    public void updateClickUrl(@NonNull Uri uri, @NonNull UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    public void updateImpressionUrls(@NonNull List<Uri> list, @NonNull UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
