package t4;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f25263d;
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25264b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public b0.e f25265c;

    public f(View view) {
        this.a = view;
    }

    public final int a(int i10, int i11, int i12) {
        int i13 = i11 - i12;
        if (i13 > 0) {
            return i13;
        }
        int i14 = i10 - i12;
        if (i14 > 0) {
            return i14;
        }
        View view = this.a;
        if (!view.isLayoutRequested() && i11 == -2) {
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f25263d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                com.bumptech.glide.c.l(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f25263d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f25263d.intValue();
        }
        return 0;
    }

    public final int b() {
        int i10;
        View view = this.a;
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.height;
        } else {
            i10 = 0;
        }
        return a(view.getHeight(), i10, paddingBottom);
    }

    public final int c() {
        int i10;
        View view = this.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = 0;
        }
        return a(view.getWidth(), i10, paddingRight);
    }
}
