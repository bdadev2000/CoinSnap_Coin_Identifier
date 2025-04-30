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

/* loaded from: classes3.dex */
public final class F {
    private static final int BUFFER_SIZE = 4096;
    public static final F INSTANCE = new F();
    private static final String TAG = F.class.getCanonicalName();

    private F() {
    }

    public static /* synthetic */ List unzip$default(F f9, String str, String str2, D d2, int i9, Object obj) throws IOException {
        if ((i9 & 4) != 0) {
            d2 = null;
        }
        return f9.unzip(str, str2, d2);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        G7.j.d(canonicalPath, "canonicalPath");
        G7.j.d(canonicalPath2, "canonicalID");
        if (O7.o.C(canonicalPath, canonicalPath2, false)) {
            return canonicalPath;
        }
        u uVar = v.Companion;
        String str3 = TAG;
        G7.j.d(str3, "TAG");
        uVar.e(str3, "File is outside extraction target directory.");
        throw new E("File is outside extraction target directory.");
    }

    public final void extractFile(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        G7.j.e(inputStream, "zipIn");
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
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            n nVar = n.INSTANCE;
                            nVar.closeQuietly(inputStream);
                            nVar.closeQuietly(bufferedOutputStream);
                            nVar.closeQuietly(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    n nVar2 = n.INSTANCE;
                    nVar2.closeQuietly(inputStream);
                    nVar2.closeQuietly(bufferedOutputStream);
                    nVar2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final List<File> unzip(String str, String str2) throws IOException {
        G7.j.e(str2, "destDirectory");
        return unzip$default(this, str, str2, null, 4, null);
    }

    public final List<File> unzip(String str, String str2, D d2) throws IOException {
        G7.j.e(str2, "destDirectory");
        if (str != null && str.length() != 0) {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                ArrayList arrayList = new ArrayList();
                ZipFile zipFile = null;
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            String str3 = str2 + File.separator + nextElement.getName();
                            if (d2 != null && !((com.vungle.ads.internal.load.i) d2).matches(str3)) {
                            }
                            validateFilename(str3, str2);
                            if (nextElement.isDirectory()) {
                                File file3 = new File(str3);
                                if (!file3.exists()) {
                                    file3.mkdirs();
                                }
                            } else {
                                InputStream inputStream = zipFile2.getInputStream(nextElement);
                                G7.j.d(inputStream, "zipFile.getInputStream(entry)");
                                extractFile(inputStream, str3);
                                arrayList.add(new File(str3));
                            }
                        }
                        try {
                            zipFile2.close();
                        } catch (IOException unused) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IOException("File does not exist");
            }
        } else {
            throw new IOException("Path is empty");
        }
    }
}
