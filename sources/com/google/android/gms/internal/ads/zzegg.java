package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzegg {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzegg(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures a2 = MeasurementManagerFutures.a(this.zzb);
            this.zza = a2;
            return a2 == null ? zzgfo.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : a2.b();
        } catch (Exception e) {
            return zzgfo.zzg(e);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.c(uri, inputEvent);
        } catch (Exception e) {
            return zzgfo.zzg(e);
        }
    }
}
