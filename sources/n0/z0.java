package n0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z0 {
    public static View.AccessibilityDelegate a(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        accessibilityDelegate = view.getAccessibilityDelegate();
        return accessibilityDelegate;
    }

    public static ContentCaptureSession b(View view) {
        ContentCaptureSession contentCaptureSession;
        contentCaptureSession = view.getContentCaptureSession();
        return contentCaptureSession;
    }

    public static List<Rect> c(View view) {
        List<Rect> systemGestureExclusionRects;
        systemGestureExclusionRects = view.getSystemGestureExclusionRects();
        return systemGestureExclusionRects;
    }

    public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
    }

    public static void e(View view, r0.a aVar) {
        ContentCaptureSession h10;
        if (aVar == null) {
            h10 = null;
        } else {
            h10 = f2.h(aVar.a);
        }
        view.setContentCaptureSession(h10);
    }

    public static void f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
