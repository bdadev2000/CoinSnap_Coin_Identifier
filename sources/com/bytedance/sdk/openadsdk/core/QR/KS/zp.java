package com.bytedance.sdk.openadsdk.core.QR.KS;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class zp {
    public static final Set<String> zp = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.QR.KS.zp.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> lMd = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.QR.KS.zp.2
        {
            add("application/x-javascript");
        }
    };

    /* loaded from: classes.dex */
    public enum lMd {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.QR.KS.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0100zp {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    public static Point zp(Context context, int i9, int i10, lMd lmd) {
        if (context == null) {
            context = KVG.zp();
        }
        Point point = new Point(i9, i10);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int lMd2 = WNy.lMd(context, i9);
        int lMd3 = WNy.lMd(context, i10);
        if (lMd2 <= width && lMd3 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (lMd.HTML_RESOURCE == lmd) {
            point2.x = Math.min(width, lMd2);
            point2.y = Math.min(height, lMd3);
        } else {
            float f9 = lMd2;
            float f10 = f9 / width;
            float f11 = lMd3;
            float f12 = f11 / height;
            if (f10 >= f12) {
                point2.x = width;
                point2.y = (int) (f11 / f10);
            } else {
                point2.x = (int) (f9 / f12);
                point2.y = height;
            }
        }
        int i11 = point2.x;
        if (i11 >= 0 && point2.y >= 0) {
            point2.x = WNy.KS(context, i11);
            point2.y = WNy.KS(context, point2.y);
            return point2;
        }
        return point;
    }
}
