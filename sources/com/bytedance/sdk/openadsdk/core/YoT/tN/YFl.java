package com.bytedance.sdk.openadsdk.core.YoT.tN;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class YFl {
    public static final Set<String> YFl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> Sg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.YoT.tN.YFl.2
        {
            add("application/x-javascript");
        }
    };

    /* loaded from: classes.dex */
    public enum Sg {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.YoT.tN.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0119YFl {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    @NonNull
    public static Point YFl(Context context, int i10, int i11, Sg sg2) {
        if (context == null) {
            context = lG.YFl();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int tN = GS.tN(context, i10);
        int tN2 = GS.tN(context, i11);
        if (tN <= width && tN2 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (Sg.HTML_RESOURCE == sg2) {
            point2.x = Math.min(width, tN);
            point2.y = Math.min(height, tN2);
        } else {
            float f10 = tN;
            float f11 = f10 / width;
            float f12 = tN2;
            float f13 = f12 / height;
            if (f11 >= f13) {
                point2.x = width;
                point2.y = (int) (f12 / f11);
            } else {
                point2.x = (int) (f10 / f13);
                point2.y = height;
            }
        }
        int i12 = point2.x;
        if (i12 >= 0 && point2.y >= 0) {
            point2.x = GS.AlY(context, i12);
            point2.y = GS.AlY(context, point2.y);
            return point2;
        }
        return point;
    }
}
