package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfic {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return new Bundle();
        }
        return bundle2;
    }

    public static void zzb(Bundle bundle, @Nullable String str, @Nullable Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzc(Bundle bundle, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzd(Bundle bundle, @Nullable String str, @Nullable List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zze(Bundle bundle, @Nullable String str, int i9, boolean z8) {
        if (z8) {
            bundle.putInt(str, i9);
        }
    }

    public static void zzf(Bundle bundle, @Nullable String str, @Nullable String str2, boolean z8) {
        if (z8 && str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzg(Bundle bundle, @Nullable String str, boolean z8, boolean z9) {
        if (z9) {
            bundle.putBoolean(str, z8);
        }
    }
}
