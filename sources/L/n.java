package L;

import android.graphics.Typeface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n extends m {
    @Override // L.m
    public final Typeface C(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1682g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, C.SANS_SERIF_NAME, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // L.m
    public final Method H(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
