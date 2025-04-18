package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfsp {
    public static File zza(@NonNull File file, boolean z2) {
        if (z2 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, @NonNull File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static File zzc(String str, @NonNull File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(@NonNull File file) {
        boolean z2;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z2 = true;
            for (int i2 = 0; i2 < listFiles.length; i2++) {
                File file2 = listFiles[i2];
                z2 = file2 != null && zzd(file2) && z2;
            }
        } else {
            z2 = true;
        }
        return file.delete() && z2;
    }

    public static boolean zze(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStreamCtor.write(bArr);
                fileOutputStreamCtor.flush();
                IOUtils.closeQuietly(fileOutputStreamCtor);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStreamCtor;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStreamCtor;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
