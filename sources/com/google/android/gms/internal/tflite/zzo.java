package com.google.android.gms.internal.tflite;

import android.content.ContentResolver;
import android.database.ContentObserver;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public final class zzo {
    private final ContentResolver zzc;
    private final ContentObserver zzd;
    private static final Map zzb = new ArrayMap();
    public static final String[] zza = {"key", "value"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zza() {
        synchronized (zzo.class) {
            Map map = zzb;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                zzo zzoVar = (zzo) it.next();
                ContentResolver contentResolver = zzoVar.zzc;
                ContentObserver contentObserver = zzoVar.zzd;
                throw null;
            }
            map.clear();
        }
    }
}
