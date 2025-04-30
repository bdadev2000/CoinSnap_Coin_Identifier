package com.apm.insight.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.annotation.Nullable;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static List<String> f5815a = new ArrayList();

    @Nullable
    public static String a(Context context, String str, File file) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String a6 = a(applicationInfo.sourceDir, str, file);
        if (a6 == null) {
            return null;
        }
        for (String str2 : applicationInfo.splitSourceDirs) {
            a6 = a(str2, str, file);
            if (a6 == null) {
                return null;
            }
        }
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            while (!(classLoader instanceof BaseDexClassLoader) && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return a6;
            }
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            for (String str3 : (String[]) declaredField2.get(obj)) {
                File file2 = new File(str3, System.mapLibraryName(str));
                if (file2.exists()) {
                    i.a(file2, file);
                    k.a(file.getAbsolutePath(), 493);
                    return null;
                }
            }
            return "not_found";
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static String a(String str, String str2, File file) {
        InputStream inputStream;
        ZipFile zipFile;
        String message;
        String str3;
        ZipEntry entry;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(new File(str), 1);
            try {
                StringBuilder sb = new StringBuilder("lib/");
                str3 = Build.CPU_ABI;
                sb.append(str3);
                sb.append("/");
                sb.append(System.mapLibraryName(str2));
                entry = zipFile.getEntry(sb.toString());
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            zipFile = null;
        }
        if (entry == null) {
            int indexOf = str3.indexOf(45);
            StringBuilder sb2 = new StringBuilder("lib/");
            if (indexOf <= 0) {
                indexOf = str3.length();
            }
            sb2.append(str3.substring(0, indexOf));
            sb2.append("/");
            sb2.append(System.mapLibraryName(str2));
            String sb3 = sb2.toString();
            ZipEntry entry2 = zipFile.getEntry(sb3);
            if (entry2 == null) {
                message = "Library entry not found:" + sb3;
                k.a((Closeable) null);
                k.a((Closeable) null);
                k.a(zipFile);
                return message;
            }
            entry = entry2;
        }
        file.createNewFile();
        InputStream inputStream2 = zipFile.getInputStream(entry);
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th3) {
            inputStream = inputStream2;
            th = th3;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read <= 0) {
                    k.a(file.getAbsolutePath(), 493);
                    k.a(fileOutputStream);
                    k.a(inputStream2);
                    k.a(zipFile);
                    return null;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th4) {
            fileOutputStream2 = fileOutputStream;
            inputStream = inputStream2;
            th = th4;
            try {
                message = th.getMessage();
                k.a(fileOutputStream2);
                k.a(inputStream);
                k.a(zipFile);
                return message;
            } catch (Throwable th5) {
                k.a(fileOutputStream2);
                k.a(inputStream);
                k.a(zipFile);
                throw th5;
            }
        }
    }
}
