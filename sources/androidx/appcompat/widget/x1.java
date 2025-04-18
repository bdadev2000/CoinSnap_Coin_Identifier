package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class x1 {
    public static final Field a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        a = field;
    }
}
