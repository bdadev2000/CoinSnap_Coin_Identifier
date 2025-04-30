package com.google.vr.dynamite.client;

import android.os.IBinder;
import com.google.ar.core.dependencies.d;
import java.lang.reflect.Field;

@UsedByReflection
/* loaded from: classes3.dex */
public final class ObjectWrapper<T> extends d implements IObjectWrapper {

    @UsedByReflection
    private final T wrappedObject;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectWrapper(Object obj) {
        super("com.google.vr.dynamite.client.IObjectWrapper");
        this.wrappedObject = obj;
    }

    @UsedByReflection
    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i9 = 0;
        Field field = null;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Field field2 = declaredFields[i9];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i9++;
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    Object obj = field.get(asBinder);
                    if (obj == null) {
                        return null;
                    }
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                    throw new IllegalArgumentException("remoteBinder is the wrong class.");
                } catch (IllegalAccessException e4) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
                } catch (IllegalArgumentException e9) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e9);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
