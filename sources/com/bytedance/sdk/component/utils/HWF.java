package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.o;
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
public class HWF {

    /* renamed from: com.bytedance.sdk.component.utils.HWF$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class zp implements Comparator<File> {
        private zp() {
        }

        private int zp(long j7, long j9) {
            if (j7 < j9) {
                return -1;
            }
            return j7 == j9 ? 0 : 1;
        }

        public /* synthetic */ zp(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return zp(file.lastModified(), file2.lastModified());
        }
    }

    private static void COT(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            HWF(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j7 = length - 1;
            try {
                randomAccessFile.seek(j7);
                byte readByte = randomAccessFile.readByte();
                randomAccessFile.seek(j7);
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

    private static void HWF(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
        } else {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    public static void KS(File file) {
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
                        KS(file2);
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (r4 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] jU(java.io.File r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L47
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L47
            boolean r1 = r7.exists()
            if (r1 == 0) goto L47
            boolean r1 = r7.canRead()
            if (r1 == 0) goto L47
            long r1 = r7.length()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L47
            long r1 = r7.length()     // Catch: java.lang.Throwable -> L43
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L43
            int r7 = r3.intValue()     // Catch: java.lang.Throwable -> L44
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L44
            int r3 = r4.read(r7)     // Catch: java.lang.Throwable -> L44
            long r5 = (long) r3
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L3f
            r4.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r7
        L3f:
            r4.close()     // Catch: java.lang.Throwable -> L47
            goto L47
        L43:
            r4 = r0
        L44:
            if (r4 == 0) goto L47
            goto L3f
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.HWF.jU(java.io.File):byte[]");
    }

    private static String lMd(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static File zp(Context context, boolean z8, String str, String str2) {
        String lMd = lMd(context);
        if (z8) {
            str = zp(context) + "-" + str;
        }
        if (lMd != null) {
            String str3 = File.separator;
            if (!lMd.endsWith(str3)) {
                lMd = o.j(lMd, str3);
            }
        }
        String j7 = o.j(lMd, str);
        File file = new File(j7);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(j7, str2);
    }

    public static void lMd(File file) throws IOException {
        if (file.exists()) {
            tG.zp("splashLoadAd", "update file modify time");
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            COT(file);
            if (file.lastModified() < currentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File zp(Context context, boolean z8, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z8) {
            str = zp(context) + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = o.j(absolutePath, str2);
            }
        }
        File file = new File(o.j(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> zp(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new zp(null));
        return asList;
    }

    public static String zp(Context context) {
        String zp2 = pvr.zp(context);
        return (TextUtils.isEmpty(zp2) || !zp2.contains(":")) ? zp2 : zp2.replace(":", "-");
    }
}
