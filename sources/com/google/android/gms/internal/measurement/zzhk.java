package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.compose.foundation.text.input.a;

/* loaded from: classes3.dex */
public final class zzhk {

    @GuardedBy
    private static final ArrayMap<String, Uri> zza = new SimpleArrayMap();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzhk.class) {
            ArrayMap<String, Uri> arrayMap = zza;
            uri = (Uri) arrayMap.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                arrayMap.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return a.k(str, "#", context.getPackageName());
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
