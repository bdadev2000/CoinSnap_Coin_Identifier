package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import eb.j;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class vc {

    /* renamed from: com.bytedance.sdk.component.utils.vc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class YFl implements Comparator<File> {
        private YFl() {
        }

        public /* synthetic */ YFl(AnonymousClass1 anonymousClass1) {
            this();
        }

        private int YFl(long j3, long j10) {
            if (j3 < j10) {
                return -1;
            }
            return j3 == j10 ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return YFl(file.lastModified(), file2.lastModified());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] AlY(java.io.File r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L4b
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L4b
            boolean r1 = r7.exists()
            if (r1 == 0) goto L4b
            boolean r1 = r7.canRead()
            if (r1 == 0) goto L4b
            long r1 = r7.length()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4b
            long r1 = r7.length()     // Catch: java.lang.Throwable -> L47
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L47
            int r7 = r1.intValue()     // Catch: java.lang.Throwable -> L48
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L48
            int r3 = r2.read(r7)     // Catch: java.lang.Throwable -> L48
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L48
            long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L48
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            r2.close()     // Catch: java.lang.Throwable -> L42
        L42:
            return r7
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L4b
        L47:
            r2 = r0
        L48:
            if (r2 == 0) goto L4b
            goto L43
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.vc.AlY(java.io.File):byte[]");
    }

    private static String Sg(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static File YFl(Context context, boolean z10, String str, String str2) {
        String Sg = Sg(context);
        if (z10) {
            str = YFl(context) + "-" + str;
        }
        if (Sg != null) {
            String str3 = File.separator;
            if (!Sg.endsWith(str3)) {
                Sg = j.k(Sg, str3);
            }
        }
        String k10 = j.k(Sg, str);
        File file = new File(k10);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(k10, str2);
    }

    public static void tN(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                try {
                    file.delete();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        tN(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            try {
                file.delete();
            } catch (Throwable unused3) {
            }
        }
    }

    private static void vc(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
        } else {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static void wN(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            vc(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j3 = length - 1;
            try {
                randomAccessFile.seek(j3);
                byte readByte = randomAccessFile.readByte();
                randomAccessFile.seek(j3);
                randomAccessFile.write(readByte);
                randomAccessFile.close();
            } catch (Throwable unused) {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    public static void Sg(File file) throws IOException {
        if (file.exists()) {
            YoT.YFl("splashLoadAd", "update file modify time");
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            wN(file);
            if (file.lastModified() < currentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File YFl(Context context, boolean z10, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z10) {
            str = YFl(context) + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = j.k(absolutePath, str2);
            }
        }
        File file = new File(j.k(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> YFl(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new YFl(null));
        return asList;
    }

    public static String YFl(Context context) {
        String YFl2 = Wwa.YFl(context);
        return (TextUtils.isEmpty(YFl2) || !YFl2.contains(":")) ? YFl2 : YFl2.replace(":", "-");
    }
}
