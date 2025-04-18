package g0;

import android.graphics.Typeface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p extends o {
    @Override // g0.o
    public final Typeface I(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f17926j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f17932p.invoke(null, newInstance, C.SANS_SERIF_NAME, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // g0.o
    public final Method N(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
