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
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class n {
    public static final n INSTANCE = new n();
    private static m objectInputStreamProvider = new nb.a(17);
    private static final String TAG = n.class.getSimpleName();
    private static final List<Class<?>> allowedClasses = CollectionsKt.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    private n() {
    }

    @JvmStatic
    public static final void delete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        u uVar = v.Companion;
                        String TAG2 = TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        uVar.d(TAG2, "Failed to delete file: " + file);
                    }
                }
            } catch (Exception e2) {
                u uVar2 = v.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                uVar2.e(TAG3, "Failed to delete file: " + e2.getLocalizedMessage());
            }
        }
    }

    @JvmStatic
    public static final void deleteAndLogIfFailed(File file) {
        Path path;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                u uVar = v.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                uVar.e(TAG2, "Cannot delete " + file.getName());
            }
        } catch (Exception e2) {
            u uVar2 = v.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            uVar2.e(TAG3, "Cannot delete " + file.getName(), e2);
        }
    }

    @JvmStatic
    public static final void deleteContents(File folder) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] listFiles = folder.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            delete(file);
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("|  ");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m69objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new y(inputStream, allowedClasses);
    }

    @JvmStatic
    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i10, StringBuilder sb2) {
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00ad: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:174), block:B:47:0x00ad */
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
    @JvmStatic
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStream;
        Closeable closeable2;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    ((nb.a) objectInputStreamProvider).getClass();
                    objectInputStream = m69objectInputStreamProvider$lambda0(exists);
                } catch (IOException e2) {
                    e = e2;
                    objectInputStream = null;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    objectInputStream = null;
                } catch (Exception e11) {
                    e = e11;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    ?? r02 = INSTANCE;
                    r02.closeQuietly(closeable3);
                    r02.closeQuietly(exists);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e13) {
                e = e13;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e14) {
                e = e14;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                exists = 0;
            }
            try {
                T t5 = (T) objectInputStream.readObject();
                ?? r03 = INSTANCE;
                r03.closeQuietly(objectInputStream);
                r03.closeQuietly(exists);
                return t5;
            } catch (IOException e15) {
                e = e15;
                u uVar = v.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                uVar.e(TAG2, "IOException: " + e.getMessage());
                closeable2 = exists;
                n nVar = INSTANCE;
                nVar.closeQuietly(objectInputStream);
                nVar.closeQuietly(closeable2);
                try {
                    delete(file);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e16) {
                e = e16;
                u uVar2 = v.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                uVar2.e(TAG3, "ClassNotFoundException: " + e.getMessage());
                closeable2 = exists;
                n nVar2 = INSTANCE;
                nVar2.closeQuietly(objectInputStream);
                nVar2.closeQuietly(closeable2);
                delete(file);
                return null;
            } catch (Exception e17) {
                e = e17;
                u uVar3 = v.Companion;
                String TAG4 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                uVar3.e(TAG4, "cannot read serializable " + e.getMessage());
                closeable2 = exists;
                n nVar22 = INSTANCE;
                nVar22.closeQuietly(objectInputStream);
                nVar22.closeQuietly(closeable2);
                delete(file);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
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
    @JvmStatic
    public static final void writeSerializable(File file, Serializable serializable) {
        FileOutputStream fileOutputStream;
        ?? r42;
        Intrinsics.checkNotNullParameter(file, "file");
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
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    r42 = r42;
                    try {
                        u uVar = v.Companion;
                        String TAG2 = TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        uVar.e(TAG2, String.valueOf(e.getMessage()));
                        ?? r53 = INSTANCE;
                        r53.closeQuietly(r42);
                        r53.closeQuietly(fileOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        fileOutputStream2 = r42;
                        n nVar = INSTANCE;
                        nVar.closeQuietly(fileOutputStream2);
                        nVar.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = r42;
                    n nVar2 = INSTANCE;
                    nVar2.closeQuietly(fileOutputStream2);
                    nVar2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                r42 = 0;
            } catch (Throwable th4) {
                th = th4;
                n nVar22 = INSTANCE;
                nVar22.closeQuietly(fileOutputStream2);
                nVar22.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            r42 = 0;
        } catch (Throwable th5) {
            th = th5;
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

    public final String guessFileName(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        String guessFileName = URLUtil.guessFileName(url, null, str);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }

    public final boolean isValidUrl(String str) {
        boolean z10;
        wh.d0 d0Var;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return false;
        }
        char[] cArr = wh.d0.f27032k;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            d0Var = wh.c0.i(str);
        } catch (IllegalArgumentException unused) {
            d0Var = null;
        }
        if (d0Var == null) {
            return false;
        }
        return true;
    }

    public final String readString(File file) {
        String readText$default;
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            readText$default = FilesKt__FileReadWriteKt.readText$default(file, null, 1, null);
            return readText$default;
        } catch (IOException e2) {
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.e(TAG2, "IOException: " + e2.getMessage());
            return null;
        } catch (Exception e10) {
            u uVar2 = v.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            uVar2.e(TAG3, "cannot read string " + e10.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        objectInputStreamProvider = mVar;
    }

    public final long size(File file) {
        boolean z10;
        long j3 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    for (File file2 : listFiles) {
                        j3 += size(file2);
                    }
                }
            }
            return j3;
        }
        return file.length();
    }

    public final void writeString(File file, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (str == null) {
            return;
        }
        try {
            FilesKt.writeText(file, str, Charsets.UTF_8);
        } catch (IOException e2) {
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.e(TAG2, String.valueOf(e2.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i10, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            sb2.append(getIndentString(i10));
            sb2.append("+--");
            sb2.append(file.getName());
            sb2.append("/\n");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    printDirectoryTree(file2, i10 + 1, sb2);
                } else {
                    Intrinsics.checkNotNullExpressionValue(file2, "file");
                    printFile(file2, i10 + 1, sb2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("folder is not a Directory".toString());
    }
}
