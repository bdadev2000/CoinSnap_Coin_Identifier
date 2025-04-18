package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class i extends d0.h {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i10) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (!TextUtils.isEmpty(strArr[i11])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            } else {
                throw new IllegalArgumentException(vd.e.h(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof g) {
            ((g) activity).validateRequestPermissionsRequestCode(i10);
        }
        b.b(activity, strArr, i10);
    }

    public static boolean b(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return e.a(activity, str);
        }
        if (i10 == 31) {
            return d.b(activity, str);
        }
        return b.c(activity, str);
    }
}
