package com.glority.base.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;

/* compiled from: ExifUtil.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ!\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/glority/base/utils/ExifUtil;", "", "<init>", "()V", "getExifInterface", "Landroidx/exifinterface/media/ExifInterface;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getExifOrientation", "", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/Integer;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ExifUtil {
    public static final int $stable = 0;
    public static final ExifUtil INSTANCE = new ExifUtil();

    private ExifUtil() {
    }

    public final ExifInterface getExifInterface(Context context, Uri uri) {
        ContentResolver contentResolver;
        if (context == null || (contentResolver = context.getContentResolver()) == null || uri == null) {
            return null;
        }
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            try {
                InputStream inputStream = openInputStream;
                if (inputStream == null) {
                    CloseableKt.closeFinally(openInputStream, null);
                    return null;
                }
                ExifInterface exifInterface = new ExifInterface(inputStream);
                CloseableKt.closeFinally(openInputStream, null);
                return exifInterface;
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Integer getExifOrientation(Context context, Uri uri) {
        ExifInterface exifInterface = getExifInterface(context, uri);
        if (exifInterface == null) {
            return null;
        }
        int i = 0;
        int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
        if (attributeInt == 3) {
            i = 180;
        } else if (attributeInt == 6) {
            i = 90;
        } else if (attributeInt == 8) {
            i = 270;
        }
        return Integer.valueOf(i);
    }
}
