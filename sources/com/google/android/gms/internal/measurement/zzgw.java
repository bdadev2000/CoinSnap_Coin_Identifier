package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.o;
import x.b;
import x.l;

/* loaded from: classes2.dex */
public final class zzgw {
    private static final b zza = new l();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzgw.class) {
            b bVar = zza;
            uri = (Uri) bVar.getOrDefault(str, null);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                bVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return o.k(str, "#", context.getPackageName());
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
