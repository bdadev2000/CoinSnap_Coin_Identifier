package com.swordfish.libretrodroid;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.View;
import com.google.common.primitives.Ints;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class AspectRatioGLSurfaceView extends GLSurfaceView {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int resizeMode;
    private float videoAspectRatio;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioGLSurfaceView(@NotNull Context context) {
        super(context);
        p0.a.s(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        super.onMeasure(i2, i3);
        if (this.resizeMode == 3 || this.videoAspectRatio <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = (this.videoAspectRatio / (f4 / f5)) - 1;
        if (Math.abs(f6) <= MAX_ASPECT_RATIO_DEFORMATION_FRACTION) {
            return;
        }
        int i4 = this.resizeMode;
        if (i4 != 1) {
            if (i4 == 2) {
                f3 = this.videoAspectRatio;
            } else if (f6 > 0.0f) {
                f2 = this.videoAspectRatio;
            } else {
                f3 = this.videoAspectRatio;
            }
            measuredWidth = (int) (f5 * f3);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO));
        }
        f2 = this.videoAspectRatio;
        measuredHeight = (int) (f4 / f2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, Ints.MAX_POWER_OF_TWO));
    }

    public final void setAspectRatio(float f2) {
        if (Math.abs(this.videoAspectRatio - f2) > MAX_ASPECT_RATIO_DEFORMATION_FRACTION) {
            this.videoAspectRatio = f2;
            requestLayout();
        }
    }

    public final void setResizeMode(int i2) {
        if (this.resizeMode != i2) {
            this.resizeMode = i2;
            requestLayout();
        }
    }
}
