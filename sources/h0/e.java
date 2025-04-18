package h0;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class e {
    public static int a(Object obj) {
        int resId;
        resId = ((Icon) obj).getResId();
        return resId;
    }

    public static String b(Object obj) {
        String resPackage;
        resPackage = ((Icon) obj).getResPackage();
        return resPackage;
    }

    public static int c(Object obj) {
        int type;
        type = ((Icon) obj).getType();
        return type;
    }

    public static Uri d(Object obj) {
        Uri uri;
        uri = ((Icon) obj).getUri();
        return uri;
    }
}
