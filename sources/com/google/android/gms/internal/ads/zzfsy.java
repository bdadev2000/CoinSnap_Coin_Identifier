package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfsy {
    public static File zza(@NonNull File file, boolean z8) {
        if (z8 && file.exists() && !file.isDirectory()) {
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
        boolean z8;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z8 = true;
            for (File file2 : listFiles) {
                if (file2 != null && zzd(file2) && z8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
        } else {
            z8 = true;
        }
        if (file.delete() && z8) {
            return true;
        }
        return false;
    }

    public static boolean zze(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            IOUtils.closeQuietly(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            IOUtils.closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            IOUtils.closeQuietly(fileOutputStream2);
            throw th;
        }
    }
}
