package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import u7.AbstractC2817h;

/* loaded from: classes3.dex */
public final class n {
    public static final n INSTANCE = new n();
    private static m objectInputStreamProvider = new com.applovin.impl.sdk.ad.g(17);
    private static final String TAG = n.class.getSimpleName();
    private static final List<Class<?>> allowedClasses = AbstractC2817h.B(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    private n() {
    }

    public static /* synthetic */ ObjectInputStream a(InputStream inputStream) {
        return m89objectInputStreamProvider$lambda0(inputStream);
    }

    public static final void delete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        u uVar = v.Companion;
                        String str = TAG;
                        G7.j.d(str, "TAG");
                        uVar.d(str, "Failed to delete file: " + file);
                    }
                }
            } catch (Exception e4) {
                u uVar2 = v.Companion;
                String str2 = TAG;
                G7.j.d(str2, "TAG");
                uVar2.e(str2, "Failed to delete file: " + e4.getLocalizedMessage());
            }
        }
    }

    public static final void deleteAndLogIfFailed(File file) {
        Path path;
        G7.j.e(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                u uVar = v.Companion;
                String str = TAG;
                G7.j.d(str, "TAG");
                uVar.e(str, "Cannot delete " + file.getName());
            }
        } catch (Exception e4) {
            u uVar2 = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar2.e(str2, "Cannot delete " + file.getName(), e4);
        }
    }

    public static final void deleteContents(File file) {
        G7.j.e(file, "folder");
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            delete(file2);
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i9) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append("|  ");
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: objectInputStreamProvider$lambda-0 */
    public static final ObjectInputStream m89objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new y(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i9, StringBuilder sb) {
        sb.append(getIndentString(i9));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:47:0x0033 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.vungle.ads.internal.util.n] */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStream;
        Closeable closeable2;
        G7.j.e(file, "file");
        ?? exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    ((com.applovin.impl.sdk.ad.g) objectInputStreamProvider).getClass();
                    objectInputStream = m89objectInputStreamProvider$lambda0(exists);
                } catch (IOException e4) {
                    e = e4;
                    objectInputStream = null;
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    objectInputStream = null;
                } catch (Exception e10) {
                    e = e10;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    ?? r02 = INSTANCE;
                    r02.closeQuietly(closeable3);
                    r02.closeQuietly(exists);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e12) {
                e = e12;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e13) {
                e = e13;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                exists = 0;
            }
            try {
                T t9 = (T) objectInputStream.readObject();
                ?? r03 = INSTANCE;
                r03.closeQuietly(objectInputStream);
                r03.closeQuietly(exists);
                return t9;
            } catch (IOException e14) {
                e = e14;
                u uVar = v.Companion;
                String str = TAG;
                G7.j.d(str, "TAG");
                uVar.e(str, "IOException: " + e.getMessage());
                closeable2 = exists;
                n nVar = INSTANCE;
                nVar.closeQuietly(objectInputStream);
                nVar.closeQuietly(closeable2);
                try {
                    delete(file);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e15) {
                e = e15;
                u uVar2 = v.Companion;
                String str2 = TAG;
                G7.j.d(str2, "TAG");
                uVar2.e(str2, "ClassNotFoundException: " + e.getMessage());
                closeable2 = exists;
                n nVar2 = INSTANCE;
                nVar2.closeQuietly(objectInputStream);
                nVar2.closeQuietly(closeable2);
                delete(file);
                return null;
            } catch (Exception e16) {
                e = e16;
                u uVar3 = v.Companion;
                String str3 = TAG;
                G7.j.d(str3, "TAG");
                uVar3.e(str3, "cannot read serializable " + e.getMessage());
                closeable2 = exists;
                n nVar22 = INSTANCE;
                nVar22.closeQuietly(objectInputStream);
                nVar22.closeQuietly(closeable2);
                delete(file);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable, java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.vungle.ads.internal.util.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.vungle.ads.internal.util.n] */
    public static final void writeSerializable(File file, Serializable serializable) {
        FileOutputStream fileOutputStream;
        ?? r42;
        G7.j.e(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                r42 = new ObjectOutputStream(fileOutputStream);
                try {
                    r42.writeObject(serializable);
                    r42.reset();
                    ?? r52 = INSTANCE;
                    r52.closeQuietly(r42);
                    r52.closeQuietly(fileOutputStream);
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream2 = fileOutputStream;
                    r42 = r42;
                    try {
                        u uVar = v.Companion;
                        String str = TAG;
                        G7.j.d(str, "TAG");
                        uVar.e(str, String.valueOf(e.getMessage()));
                        ?? r53 = INSTANCE;
                        r53.closeQuietly(r42);
                        r53.closeQuietly(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        fileOutputStream2 = r42;
                        n nVar = INSTANCE;
                        nVar.closeQuietly(fileOutputStream2);
                        nVar.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = r42;
                    n nVar2 = INSTANCE;
                    nVar2.closeQuietly(fileOutputStream2);
                    nVar2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                r42 = 0;
            } catch (Throwable th3) {
                th = th3;
                n nVar22 = INSTANCE;
                nVar22.closeQuietly(fileOutputStream2);
                nVar22.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            r42 = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final m getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String str, String str2) {
        G7.j.e(str, "url");
        String guessFileName = URLUtil.guessFileName(str, null, str2);
        G7.j.d(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }

    public final boolean isValidUrl(String str) {
        if (str != null && str.length() != 0) {
            i8.u uVar = null;
            try {
                i8.t tVar = new i8.t();
                tVar.d(null, str);
                uVar = tVar.a();
            } catch (IllegalArgumentException unused) {
            }
            if (uVar != null) {
                return true;
            }
        }
        return false;
    }

    public final String readString(File file) {
        G7.j.e(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return D7.a.X(file);
        } catch (IOException e4) {
            u uVar = v.Companion;
            String str = TAG;
            G7.j.d(str, "TAG");
            uVar.e(str, "IOException: " + e4.getMessage());
            return null;
        } catch (Exception e9) {
            u uVar2 = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar2.e(str2, "cannot read string " + e9.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(m mVar) {
        G7.j.e(mVar, "<set-?>");
        objectInputStreamProvider = mVar;
    }

    public final long size(File file) {
        boolean z8;
        long j7 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    for (File file2 : listFiles) {
                        j7 += size(file2);
                    }
                }
            }
            return j7;
        }
        return file.length();
    }

    public final void writeString(File file, String str) {
        G7.j.e(file, "file");
        if (str == null) {
            return;
        }
        try {
            Charset charset = O7.a.f2244a;
            G7.j.e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                D7.a.Y(fileOutputStream, str, charset);
                android.support.v4.media.session.a.f(fileOutputStream, null);
            } finally {
            }
        } catch (IOException e4) {
            u uVar = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar.e(str2, String.valueOf(e4.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i9, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            sb.append(getIndentString(i9));
            sb.append("+--");
            sb.append(file.getName());
            sb.append("/\n");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    printDirectoryTree(file2, i9 + 1, sb);
                } else {
                    printFile(file2, i9 + 1, sb);
                }
            }
            return;
        }
        throw new IllegalArgumentException("folder is not a Directory".toString());
    }
}
