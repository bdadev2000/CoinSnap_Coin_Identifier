package com.glority.android.picturexx.recognize.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.bumptech.glide.Glide;
import com.glority.utils.store.PathUtils;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FileHelper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/recognize/utils/FileHelper;", "", "<init>", "()V", "cacheImageFile", "Ljava/io/File;", "src", "Landroid/graphics/Bitmap;", "quality", "", "cacheImageFileWebp", "context", "Landroid/content/Context;", TransferTable.COLUMN_FILE, "Landroid/net/Uri;", "data", "", "getPictureCacheFile", "getPictureFileName", "", "isCache", "", "getFileName", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FileHelper {
    public static final FileHelper INSTANCE = new FileHelper();

    private FileHelper() {
    }

    public static /* synthetic */ File cacheImageFile$default(FileHelper fileHelper, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return fileHelper.cacheImageFile(bitmap, i);
    }

    public final File cacheImageFile(Bitmap src, int quality) {
        if (src == null) {
            return null;
        }
        File pictureCacheFile = getPictureCacheFile();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pictureCacheFile);
            try {
                if (!src.compress(Bitmap.CompressFormat.JPEG, quality, fileOutputStream)) {
                    pictureCacheFile = null;
                }
                CloseableKt.closeFinally(fileOutputStream, null);
                return pictureCacheFile;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ File cacheImageFileWebp$default(FileHelper fileHelper, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return fileHelper.cacheImageFileWebp(bitmap, i);
    }

    public final File cacheImageFileWebp(Bitmap src, int quality) {
        if (src == null) {
            return null;
        }
        File pictureCacheFile = getPictureCacheFile();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pictureCacheFile);
            try {
                if (!src.compress(Bitmap.CompressFormat.WEBP, quality, fileOutputStream)) {
                    pictureCacheFile = null;
                }
                CloseableKt.closeFinally(fileOutputStream, null);
                return pictureCacheFile;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ File cacheImageFile$default(FileHelper fileHelper, Context context, File file, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 100;
        }
        return fileHelper.cacheImageFile(context, file, i);
    }

    public final File cacheImageFile(Context context, File file, int quality) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            File file2 = new File(StringsKt.replace$default(absolutePath, ".jpg", ".webp", false, 4, (Object) null));
            file.renameTo(file2);
            Bitmap bitmap = Glide.with(context).asBitmap().load(file2).submit().get();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                if (!bitmap.compress(Bitmap.CompressFormat.WEBP, quality, fileOutputStream)) {
                    file2 = null;
                }
                CloseableKt.closeFinally(fileOutputStream, null);
                return file2;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final Uri cacheImageFile(byte[] data) {
        if (data == null) {
            return null;
        }
        File pictureCacheFile = getPictureCacheFile();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pictureCacheFile);
            try {
                fileOutputStream.write(data);
                Uri fromFile = Uri.fromFile(pictureCacheFile);
                CloseableKt.closeFinally(fileOutputStream, null);
                return fromFile;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final File getPictureCacheFile() {
        String externalAppCachePath = PathUtils.getExternalAppCachePath();
        if (TextUtils.isEmpty(externalAppCachePath)) {
            externalAppCachePath = PathUtils.getInternalAppCachePath();
        }
        File file = new File(externalAppCachePath, "pictures");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getPath() + File.separator + getPictureFileName(true));
    }

    public static /* synthetic */ String getPictureFileName$default(FileHelper fileHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fileHelper.getPictureFileName(z);
    }

    public final String getPictureFileName(boolean isCache) {
        String fileName = getFileName();
        return isCache ? "glority_cache_" + fileName : fileName;
    }

    private final String getFileName() {
        return (System.currentTimeMillis() + ((int) (Math.random() * 1000))) + ".jpg";
    }
}
