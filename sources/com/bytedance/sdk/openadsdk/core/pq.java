package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class pq {
    private static int AlY(View view, int i10) {
        if (i10 == 3) {
            return GS.AlY(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean Sg(View view) {
        return view != null && view.isShown();
    }

    private static boolean YFl(View view, int i10) {
        float YFl = YFl(view);
        return YFl > 0.0f && YFl >= ((float) i10) / 100.0f;
    }

    private static int tN(View view, int i10) {
        if (i10 == 3) {
            return (int) (GS.tN(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static boolean Sg(View view, int i10) {
        return view.getWidth() >= tN(view, i10) && view.getHeight() >= AlY(view, i10);
    }

    public static float YFl(View view) {
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

    private static int Sg(View view, int i10, int i11) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!Sg(view)) {
            return 1;
        }
        if (Sg(view, i11)) {
            return !YFl(view, i10) ? 3 : 0;
        }
        return 6;
    }

    public static boolean YFl(View view, int i10, int i11) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof com.bytedance.sdk.openadsdk.core.qsH.qO) || (view instanceof com.bytedance.sdk.openadsdk.core.tN.tN)) {
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
        return Sg(view, i10, i11) == 0;
    }
}
