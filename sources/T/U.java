package T;

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
public abstract class U {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i9, int i10) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i9, i10);
    }

    public static void e(View view, X.a aVar) {
        ContentCaptureSession contentCaptureSession;
        if (aVar == null) {
            contentCaptureSession = null;
        } else {
            contentCaptureSession = (ContentCaptureSession) aVar.f3629a;
        }
        view.setContentCaptureSession(contentCaptureSession);
    }

    public static void f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
