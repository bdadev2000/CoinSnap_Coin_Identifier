package g2;

import G.f;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import j2.g;
import java.util.ArrayList;

/* renamed from: g2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2290d {

    /* renamed from: d, reason: collision with root package name */
    public static Integer f20422d;

    /* renamed from: a, reason: collision with root package name */
    public final View f20423a;
    public final ArrayList b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public f f20424c;

    public C2290d(View view) {
        this.f20423a = view;
    }

    public final int a(int i9, int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i9 - i11;
        if (i13 > 0) {
            return i13;
        }
        View view = this.f20423a;
        if (!view.isLayoutRequested() && i10 == -2) {
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f20422d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                g.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f20422d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f20422d.intValue();
        }
        return 0;
    }
}
