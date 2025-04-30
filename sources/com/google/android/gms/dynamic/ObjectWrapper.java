package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.reflect.Field;

@RetainForClient
@KeepForSdk
/* loaded from: classes2.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object zza;

    private ObjectWrapper(Object obj) {
        this.zza = obj;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <T> T unwrap(@NonNull IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i9 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i9++;
                field = field2;
            }
        }
        if (i9 == 1) {
            Preconditions.checkNotNull(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e4) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
                } catch (NullPointerException e9) {
                    throw new IllegalArgumentException("Binder object is null.", e9);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(o.h(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }

    @NonNull
    @KeepForSdk
    public static <T> IObjectWrapper wrap(@NonNull T t9) {
        return new ObjectWrapper(t9);
    }
}
