package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzehh {

    @Nullable
    private y0.e zza;
    private final Context zzb;

    public zzehh(Context context) {
        this.zzb = context;
    }

    public final f4.c zza() {
        try {
            y0.d a6 = y0.e.a(this.zzb);
            this.zza = a6;
            if (a6 == null) {
                return zzgft.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return a6.b();
        } catch (Exception e4) {
            return zzgft.zzg(e4);
        }
    }

    public final f4.c zzb(Uri uri, InputEvent inputEvent) {
        try {
            y0.e eVar = this.zza;
            Objects.requireNonNull(eVar);
            return eVar.c(uri, inputEvent);
        } catch (Exception e4) {
            return zzgft.zzg(e4);
        }
    }
}
