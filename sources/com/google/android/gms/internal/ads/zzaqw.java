package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class zzaqw {
    @NonNull
    public static zzaps zza(Context context, zzaqd zzaqdVar) {
        zzaqe zzaqeVar;
        if (zzaqdVar == null) {
            zzaqeVar = new zzaqe(new zzaqq(null, null));
        } else {
            zzaqeVar = new zzaqe(zzaqdVar);
        }
        zzaps zzapsVar = new zzaps(new zzaql(new zzaqv(context.getApplicationContext()), 5242880), zzaqeVar, 4);
        zzapsVar.zzd();
        return zzapsVar;
    }
}
