package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class Lij {
    private static int KS(View view, int i9) {
        if (i9 == 3) {
            return (int) (WNy.KS(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int jU(View view, int i9) {
        if (i9 == 3) {
            return WNy.jU(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean lMd(View view) {
        return view != null && view.isShown();
    }

    private static boolean zp(View view, int i9) {
        float zp = zp(view);
        return zp > 0.0f && zp >= ((float) i9) / 100.0f;
    }

    private static boolean lMd(View view, int i9) {
        return view.getWidth() >= KS(view, i9) && view.getHeight() >= jU(view, i9);
    }

    public static float zp(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long height = r1.height() * r1.width();
                    long height2 = view.getHeight() * view.getWidth();
                    if (height2 <= 0) {
                        return -1.0f;
                    }
                    return ((float) height) / ((float) height2);
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int lMd(View view, int i9, int i10) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!lMd(view)) {
            return 1;
        }
        if (lMd(view, i10)) {
            return !zp(view, i9) ? 3 : 0;
        }
        return 6;
    }

    public static boolean zp(View view, int i9, int i10) {
        if (i10 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof NativeExpressView) || (view instanceof BannerExpressView)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return lMd(view, i9, i10) == 0;
    }
}
