package com.glority.base.utils;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kotlin.Metadata;

/* compiled from: DataUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/base/utils/DataUtils;", "", "<init>", "()V", "deepClone", ExifInterface.GPS_DIRECTION_TRUE, "obj", "(Ljava/lang/Object;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class DataUtils {
    public static final int $stable = 0;
    public static final DataUtils INSTANCE = new DataUtils();

    private DataUtils() {
    }

    public final <T> T deepClone(T obj) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
            return (T) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
