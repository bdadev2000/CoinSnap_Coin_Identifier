package M0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: M0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0224o {
    public static <T, V> ObjectAnimator a(T t9, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t9, property, (TypeConverter) null, path);
    }
}
