package com.glority.base.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.core.app.AppContext;
import com.glority.utils.store.PathUtils;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileHelper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002¨\u0006\u0012"}, d2 = {"Lcom/glority/base/utils/FileHelper;", "", "<init>", "()V", "cacheImageFile", "Ljava/io/File;", "src", "Landroid/graphics/Bitmap;", "Landroid/net/Uri;", "data", "", "getPictureCacheFile", "format", "", "getPictureFileName", "isCache", "", "getPictureDir", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class FileHelper {
    public static final int $stable = 0;
    public static final FileHelper INSTANCE = new FileHelper();

    private FileHelper() {
    }

    public final File cacheImageFile(Bitmap src) {
        if (src == null) {
            return null;
        }
        File pictureCacheFile = getPictureCacheFile("webp");
        FileOutputStream fileOutputStream = new FileOutputStream(pictureCacheFile);
        try {
            if (!src.compress(Bitmap.CompressFormat.WEBP, 90, fileOutputStream)) {
                pictureCacheFile = null;
            }
            CloseableKt.closeFinally(fileOutputStream, null);
            return pictureCacheFile;
        } finally {
        }
    }

    public final Uri cacheImageFile(byte[] data) {
        if (data == null) {
            return null;
        }
        try {
            File pictureCacheFile = getPictureCacheFile("jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(pictureCacheFile);
            try {
                fileOutputStream.write(data);
                Uri fromFile = Uri.fromFile(pictureCacheFile);
                CloseableKt.closeFinally(fileOutputStream, null);
                return fromFile;
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final File getPictureCacheFile(String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String externalAppCachePath = PathUtils.getExternalAppCachePath();
        if (TextUtils.isEmpty(externalAppCachePath)) {
            externalAppCachePath = PathUtils.getInternalAppCachePath();
        }
        File file = new File(externalAppCachePath, "pictures");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getPath() + File.separator + getPictureFileName(format, true));
    }

    static /* synthetic */ String getPictureFileName$default(FileHelper fileHelper, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fileHelper.getPictureFileName(str, z);
    }

    private final String getPictureFileName(String format, boolean isCache) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (isCache) {
            valueOf = "glority_cache_" + valueOf;
        }
        return valueOf + InstructionFileId.DOT + format;
    }

    private final File getPictureDir() {
        String externalPicturesPath = PathUtils.getExternalPicturesPath();
        if (!TextUtils.isEmpty(externalPicturesPath)) {
            File file = new File(externalPicturesPath + File.separator + AppContext.INSTANCE.getConfig("appName"));
            if (file.exists()) {
                return file;
            }
            file.mkdir();
            return file;
        }
        return new File(PathUtils.getInternalAppDataPath(), Environment.DIRECTORY_PICTURES);
    }
}
