package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzge implements zzgg {
    @Override // com.google.android.gms.internal.measurement.zzgg
    @Nullable
    public final String zza(ContentResolver contentResolver, String str) throws zzgf {
        Cursor query = contentResolver.query(zzfy.zza, null, null, new String[]{str}, null);
        try {
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(1);
                    query.close();
                    return string;
                }
                query.close();
                return null;
            }
            throw new zzgf("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgd<T> zzgdVar) throws zzgf {
        Cursor query = contentResolver.query(zzfy.zzb, null, null, strArr, null);
        try {
            if (query != null) {
                T zza = zzgdVar.zza(query.getCount());
                while (query.moveToNext()) {
                    zza.put(query.getString(0), query.getString(1));
                }
                query.close();
                return zza;
            }
            throw new zzgf("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
