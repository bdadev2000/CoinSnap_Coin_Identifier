package com.glority.base.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.core.app.AppContext;
import java.io.File;
import java.io.IOException;

/* loaded from: classes6.dex */
public class FileUtils {
    private static final String PICTURE_FOLDER = "picturethis";

    public static boolean delDir(String str, boolean z) {
        if (z) {
            File file = new File(str);
            if (file.isFile()) {
                return file.delete();
            }
            if (!file.isDirectory()) {
                return false;
            }
            if (file.listFiles() == null || file.listFiles().length == 0) {
                return file.delete();
            }
            int length = file.listFiles().length;
            File[] listFiles = file.listFiles();
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    delDir(listFiles[i].getAbsolutePath(), true);
                }
                listFiles[i].delete();
            }
            return file.delete();
        }
        return new File(str).delete();
    }

    public static String getPathFromContentUri(Context context, Uri uri) {
        String[] strArr = {"_data"};
        Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex(strArr[0]));
        query.close();
        return string;
    }

    public static File createEmptyImageFile(File file, Bitmap.CompressFormat compressFormat) {
        File file2 = new File(file, ImageUtils.INSTANCE.getPICTURE_PREFIX() + System.currentTimeMillis() + InstructionFileId.DOT + getFileExtension(compressFormat));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.glority.base.utils.FileUtils$1, reason: invalid class name */
    /* loaded from: classes6.dex */
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
        }
    }

    public static String getFileExtension(Bitmap.CompressFormat compressFormat) {
        int i = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        if (i == 1) {
            return ImageUtils.INSTANCE.getJPG_PICTURE_EXTENSION();
        }
        if (i == 2) {
            return ImageUtils.INSTANCE.getPNG_PICTURE_EXTENSION();
        }
        if (i == 3) {
            return ImageUtils.INSTANCE.getWEBP_PICTURE_EXTENSION();
        }
        return ImageUtils.INSTANCE.getJPG_PICTURE_EXTENSION();
    }

    public static boolean isAndroidQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static File getTmepDir(Context context) {
        File cacheDir;
        if (Environment.getExternalStorageState().equals("mounted")) {
            cacheDir = context.getExternalCacheDir();
        } else {
            cacheDir = context.getCacheDir();
        }
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, ".temp");
        if (file.exists()) {
            return file;
        }
        file.mkdir();
        return file;
    }

    public static File getTmepDir() {
        return getTmepDir(AppContext.INSTANCE.peekContext().getApplicationContext());
    }

    public static void clearTempCache() {
        File tmepDir = getTmepDir();
        if (tmepDir == null || !tmepDir.exists()) {
            return;
        }
        delDir(tmepDir.getAbsolutePath(), true);
    }

    public static File getPictureThisDir() {
        return getDir(PICTURE_FOLDER);
    }

    private static File getDir(String str) {
        File filesDir;
        if (Environment.getExternalStorageState().equals("mounted")) {
            filesDir = AppContext.INSTANCE.peekContext().getApplicationContext().getExternalFilesDir("");
        } else {
            filesDir = AppContext.INSTANCE.peekContext().getApplicationContext().getFilesDir();
        }
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir, str);
        if (file.exists()) {
            return file;
        }
        file.mkdir();
        return file;
    }
}
