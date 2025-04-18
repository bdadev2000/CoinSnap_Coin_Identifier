package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* loaded from: classes4.dex */
public final class PointerInteropFilter_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [q0.l, java.lang.Object, androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent] */
    public static final Modifier a(Modifier modifier, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.f15619a = new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder);
        ?? obj = new Object();
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = pointerInteropFilter.f15620b;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.f15639a = null;
        }
        pointerInteropFilter.f15620b = obj;
        obj.f15639a = pointerInteropFilter;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(obj);
        return modifier.T0(pointerInteropFilter);
    }
}
