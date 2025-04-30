package K;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1632a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1633c = new Object();

    public static Typeface a(Context context, int i9) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i9, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, K.b r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K.o.b(android.content.Context, int, android.util.TypedValue, int, K.b, boolean, boolean):android.graphics.Typeface");
    }
}
