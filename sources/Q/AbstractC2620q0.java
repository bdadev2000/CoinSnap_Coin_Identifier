package q;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: q.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2620q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f22707a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
        f22707a = field;
    }
}
