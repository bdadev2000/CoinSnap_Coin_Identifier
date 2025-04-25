package com.glority.utils.store;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.utils.ui.ImageUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes9.dex */
public class CacheUtils {
    @Deprecated
    public static File cacheSmallImage(Bitmap bitmap, int i) {
        return cacheSmallImage(bitmap, i, Bitmap.CompressFormat.JPEG);
    }

    public static File cacheSmallImage(Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) {
        return cacheSmallImage(bitmap, i, 90, compressFormat);
    }

    public static File cacheSmallImage(Bitmap bitmap, int i, int i2, Bitmap.CompressFormat compressFormat) {
        return cacheImageFile(ImageUtils.scale(bitmap, i), i2, compressFormat);
    }

    @Deprecated
    public static File cacheImageFile(Bitmap bitmap, int i) {
        return cacheImageFile(bitmap, i, Bitmap.CompressFormat.JPEG);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File cacheImageFile(android.graphics.Bitmap r3, int r4, android.graphics.Bitmap.CompressFormat r5) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = getPictureFileExt(r5)
            java.io.File r1 = getPictureCacheFile(r1)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b java.io.FileNotFoundException -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2b java.io.FileNotFoundException -> L2d
            boolean r3 = r3.compress(r5, r4, r2)     // Catch: java.io.FileNotFoundException -> L29 java.lang.Throwable -> L3d
            if (r3 == 0) goto L20
            r2.close()     // Catch: java.io.IOException -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r3.printStackTrace()
        L1f:
            return r1
        L20:
            r2.close()     // Catch: java.io.IOException -> L24
            goto L28
        L24:
            r3 = move-exception
            r3.printStackTrace()
        L28:
            return r0
        L29:
            r3 = move-exception
            goto L2f
        L2b:
            r3 = move-exception
            goto L3f
        L2d:
            r3 = move-exception
            r2 = r0
        L2f:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r3 = move-exception
            r3.printStackTrace()
        L3c:
            return r0
        L3d:
            r3 = move-exception
            r0 = r2
        L3f:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r4 = move-exception
            r4.printStackTrace()
        L49:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.CacheUtils.cacheImageFile(android.graphics.Bitmap, int, android.graphics.Bitmap$CompressFormat):java.io.File");
    }

    public static Uri cacheImageFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (bArr == null) {
            return null;
        }
        File pictureCacheFile = getPictureCacheFile(str);
        try {
            fileOutputStream = new FileOutputStream(pictureCacheFile);
            try {
                fileOutputStream.write(bArr);
                Uri fromFile = Uri.fromFile(pictureCacheFile);
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return fromFile;
            } catch (Exception unused) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        r0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File cacheFile(android.net.Uri r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.app.Application r1 = com.glority.utils.UtilsApp.getApp()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L67
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L67
            java.io.InputStream r5 = r1.openInputStream(r5)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L67
            if (r5 != 0) goto L1d
            if (r5 == 0) goto L1c
            r5.close()     // Catch: java.io.IOException -> L18
            goto L1c
        L18:
            r5 = move-exception
            r5.printStackTrace()
        L1c:
            return r0
        L1d:
            java.io.File r6 = getPictureCacheFile(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L69
        L2a:
            int r3 = r5.read(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L69
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L69
            r4 = -1
            if (r3 == r4) goto L36
            goto L2a
        L36:
            r1.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r0.printStackTrace()
        L3e:
            if (r5 == 0) goto L48
            r5.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r5 = move-exception
            r5.printStackTrace()
        L48:
            return r6
        L49:
            r6 = move-exception
            r0 = r1
            goto L52
        L4c:
            r6 = move-exception
            goto L52
        L4e:
            r1 = r0
            goto L69
        L50:
            r6 = move-exception
            r5 = r0
        L52:
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r0 = move-exception
            r0.printStackTrace()
        L5c:
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r5 = move-exception
            r5.printStackTrace()
        L66:
            throw r6
        L67:
            r5 = r0
            r1 = r5
        L69:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r6 = move-exception
            r6.printStackTrace()
        L73:
            if (r5 == 0) goto L7d
            r5.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r5 = move-exception
            r5.printStackTrace()
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.utils.store.CacheUtils.cacheFile(android.net.Uri, java.lang.String):java.io.File");
    }

    private static File getPictureCacheFile(String str) {
        String str2;
        try {
            str2 = PathUtils.getExternalAppCachePath();
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = PathUtils.getInternalAppCachePath();
        }
        File file = new File(str2, "pictures");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getPath() + File.separator + getPictureFileName(true, str));
    }

    private static String getPictureFileName(Boolean bool, String str) {
        String str2 = "img_" + System.nanoTime() + InstructionFileId.DOT + str;
        return bool.booleanValue() ? "glority_cache_" + str2 : str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.glority.utils.store.CacheUtils$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP_LOSSY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static String getPictureFileExt(Bitmap.CompressFormat compressFormat) {
        int i = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        if (i == 2) {
            return "png";
        }
        if (i == 3 || i == 4 || i == 5) {
            return "webp";
        }
        return "jpg";
    }
}
