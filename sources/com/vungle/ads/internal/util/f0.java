package com.vungle.ads.internal.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class f0 {
    private static final int BUFFER_SIZE = 4096;
    public static final f0 INSTANCE = new f0();
    private static final String TAG = f0.class.getCanonicalName();

    private f0() {
    }

    public static /* synthetic */ List unzip$default(f0 f0Var, String str, String str2, d0 d0Var, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            d0Var = null;
        }
        return f0Var.unzip(str, str2, d0Var);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        boolean startsWith$default;
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalID = new File(str2).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullExpressionValue(canonicalID, "canonicalID");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(canonicalPath, canonicalID, false, 2, null);
        if (startsWith$default) {
            return canonicalPath;
        }
        u uVar = v.Companion;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        uVar.e(TAG2, "File is outside extraction target directory.");
        throw new e0("File is outside extraction target directory.");
    }

    public final void extractFile(InputStream zipIn, String str) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        Intrinsics.checkNotNullParameter(zipIn, "zipIn");
        File file = new File(str);
        n.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            } catch (Throwable th3) {
                th2 = th3;
                bufferedOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th2 = th4;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = zipIn.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    n nVar = n.INSTANCE;
                    nVar.closeQuietly(zipIn);
                    nVar.closeQuietly(bufferedOutputStream);
                    nVar.closeQuietly(fileOutputStream);
                    return;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            n nVar2 = n.INSTANCE;
            nVar2.closeQuietly(zipIn);
            nVar2.closeQuietly(bufferedOutputStream);
            nVar2.closeQuietly(fileOutputStream);
            throw th2;
        }
    }

    @JvmOverloads
    public final List<File> unzip(String str, String destDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(destDirectory, "destDirectory");
        return unzip$default(this, str, destDirectory, null, 4, null);
    }

    @JvmOverloads
    public final List<File> unzip(String str, String destDirectory, d0 d0Var) throws IOException {
        ZipFile zipFile;
        Intrinsics.checkNotNullParameter(destDirectory, "destDirectory");
        if (!(str == null || str.length() == 0)) {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(destDirectory);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                ArrayList arrayList = new ArrayList();
                ZipFile zipFile2 = null;
                try {
                    zipFile = new ZipFile(file);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        String str2 = destDirectory + File.separator + nextElement.getName();
                        if (d0Var == null || ((com.vungle.ads.internal.load.i) d0Var).matches(str2)) {
                            validateFilename(str2, destDirectory);
                            if (nextElement.isDirectory()) {
                                File file3 = new File(str2);
                                if (!file3.exists()) {
                                    file3.mkdirs();
                                }
                            } else {
                                InputStream inputStream = zipFile.getInputStream(nextElement);
                                Intrinsics.checkNotNullExpressionValue(inputStream, "zipFile.getInputStream(entry)");
                                extractFile(inputStream, str2);
                                arrayList.add(new File(str2));
                            }
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
            throw new IOException("File does not exist");
        }
        throw new IOException("Path is empty");
    }
}
