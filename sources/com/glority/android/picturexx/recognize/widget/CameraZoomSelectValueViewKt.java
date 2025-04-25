package com.glority.android.picturexx.recognize.widget;

import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomSelectValueViewBinding;
import com.glority.utils.app.ResUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraZoomSelectValueView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"setZoomValueAndSelected", "", "Lcom/glority/android/picturexx/recognize/databinding/WidgetCameraZoomSelectValueViewBinding;", "selected", "", "zoomValue", "", "(Lcom/glority/android/picturexx/recognize/databinding/WidgetCameraZoomSelectValueViewBinding;ZLjava/lang/Float;)V", "recognize_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CameraZoomSelectValueViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setZoomValueAndSelected(WidgetCameraZoomSelectValueViewBinding widgetCameraZoomSelectValueViewBinding, boolean z, Float f) {
        if (!z) {
            widgetCameraZoomSelectValueViewBinding.tvZoomValue.setBackgroundDrawable(null);
        } else {
            widgetCameraZoomSelectValueViewBinding.tvZoomValue.setBackgroundResource(R.drawable.shape_oval_white);
        }
        if (z) {
            widgetCameraZoomSelectValueViewBinding.tvZoomValue.setTextColor(ResUtils.getColor(R.color.Black));
        } else {
            widgetCameraZoomSelectValueViewBinding.tvZoomValue.setTextColor(ResUtils.getColor(R.color.White));
        }
        if (f != null) {
            String bigDecimal = new BigDecimal(String.valueOf(f.floatValue())).setScale(1, RoundingMode.HALF_UP).toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "toString(...)");
            if (z) {
                widgetCameraZoomSelectValueViewBinding.tvZoomValue.setText(bigDecimal + "x");
            } else {
                widgetCameraZoomSelectValueViewBinding.tvZoomValue.setText(bigDecimal);
            }
        }
    }
}
