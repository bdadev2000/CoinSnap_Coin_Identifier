package com.glority.android.base.aws;

import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.utils.data.EncryptUtils;
import com.glority.utils.stability.LogUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;

/* compiled from: ImageUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/android/base/aws/ImageUtils;", "", "()V", "getImageSize", "", "imageUrl", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getOptions", "Landroid/graphics/BitmapFactory$Options;", "getSha1", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class ImageUtils {
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    public final Long getImageSize(String imageUrl) {
        String str = imageUrl;
        Long l = null;
        if (str != null && str.length() != 0) {
            try {
                File file = new File(imageUrl);
                if (file.exists()) {
                    l = Long.valueOf(file.length());
                }
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        return l;
    }

    public final String getSha1(String imageUrl) {
        String str = imageUrl;
        String str2 = null;
        if (str != null && str.length() != 0) {
            try {
                File file = new File(imageUrl);
                if (file.exists()) {
                    str2 = EncryptUtils.sha1(FilesKt.readBytes(file));
                }
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        return str2;
    }

    public final BitmapFactory.Options getOptions(String imageUrl) {
        String str = imageUrl;
        BitmapFactory.Options options = null;
        if (str != null && str.length() != 0) {
            try {
                if (!new File(imageUrl).exists()) {
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(imageUrl, options2);
                    options = options2;
                }
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        return options;
    }
}
