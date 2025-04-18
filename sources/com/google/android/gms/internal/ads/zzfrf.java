package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfrf {
    public static File zza(@NonNull File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, @NonNull File file) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new File(zzc(str, file), str2);
        }
        return null;
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
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z10 = true;
            for (File file2 : listFiles) {
                if (file2 != null && zzd(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (file.delete() && z10) {
            return true;
        }
        return false;
    }

    public static boolean zze(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
