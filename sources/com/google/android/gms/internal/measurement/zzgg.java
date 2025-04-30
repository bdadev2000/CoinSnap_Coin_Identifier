package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzgg {
    @Nullable
    String zza(ContentResolver contentResolver, String str) throws zzgf;

    <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgd<T> zzgdVar) throws zzgf;
}
