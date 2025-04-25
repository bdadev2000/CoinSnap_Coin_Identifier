package com.google.android.gms.internal.tflite;

import android.content.SharedPreferences;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzt {
    private static final Map zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zza() {
        synchronized (zzt.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                zzt zztVar = (zzt) it.next();
                SharedPreferences sharedPreferences = zztVar.zzb;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = zztVar.zzc;
                throw null;
            }
            map.clear();
        }
    }
}
