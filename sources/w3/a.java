package W3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.d;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3610a = {R.attr.theme, com.tools.arruler.photomeasure.camera.ruler.R.attr.theme};
    public static final int[] b = {com.tools.arruler.photomeasure.camera.ruler.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i9, int i10) {
        boolean z8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i9, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof d) && ((d) context).f21873a == resourceId) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (resourceId != 0 && !z8) {
            d dVar = new d(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3610a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                dVar.getTheme().applyStyle(resourceId2, true);
            }
            return dVar;
        }
        return context;
    }
}
