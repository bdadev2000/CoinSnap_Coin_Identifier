package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import java.util.Objects;
import q1.g;
import q1.h;

/* loaded from: classes3.dex */
public final class zzeex {

    @Nullable
    private h zza;
    private final Context zzb;

    public zzeex(Context context) {
        this.zzb = context;
    }

    public final ua.b zza() {
        try {
            g a = h.a(this.zzb);
            this.zza = a;
            if (a == null) {
                return zzgei.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return a.b();
        } catch (Exception e2) {
            return zzgei.zzg(e2);
        }
    }

    public final ua.b zzb(Uri uri, InputEvent inputEvent) {
        try {
            h hVar = this.zza;
            Objects.requireNonNull(hVar);
            return hVar.c(uri, inputEvent);
        } catch (Exception e2) {
            return zzgei.zzg(e2);
        }
    }
}
