package com.glority.android.picturexx.recognize.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomSelectValueViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraZoomSelectValueView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u000bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CameraZoomSelectValueView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minValue", "", "getMinValue", "()F", "setMinValue", "(F)V", "maxValue", "getMaxValue", "setMaxValue", "currentZoomValue", "getCurrentZoomValue", "setCurrentZoomValue", "binding", "Lcom/glority/android/picturexx/recognize/databinding/WidgetCameraZoomSelectValueViewBinding;", "setValues", "", "updateZoomValue", "zoomValue", "checkIfSelected", "", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CameraZoomSelectValueView extends ConstraintLayout {
    private final WidgetCameraZoomSelectValueViewBinding binding;
    private float currentZoomValue;
    private float maxValue;
    private float minValue;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraZoomSelectValueView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraZoomSelectValueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CameraZoomSelectValueView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraZoomSelectValueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minValue = 1.0f;
        this.maxValue = 1.0f;
        this.currentZoomValue = 1.0f;
        this.binding = WidgetCameraZoomSelectValueViewBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final void setMinValue(float f) {
        this.minValue = f;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final void setMaxValue(float f) {
        this.maxValue = f;
    }

    public final float getCurrentZoomValue() {
        return this.currentZoomValue;
    }

    public final void setCurrentZoomValue(float f) {
        this.currentZoomValue = f;
    }

    public final void setValues(float minValue, float maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public final void updateZoomValue(float zoomValue) {
        this.currentZoomValue = zoomValue;
        boolean checkIfSelected = checkIfSelected(zoomValue);
        if (checkIfSelected) {
            CameraZoomSelectValueViewKt.setZoomValueAndSelected(this.binding, checkIfSelected, Float.valueOf(zoomValue));
        } else {
            CameraZoomSelectValueViewKt.setZoomValueAndSelected(this.binding, checkIfSelected, Float.valueOf(this.minValue));
        }
    }

    public final boolean checkIfSelected(float zoomValue) {
        return zoomValue >= this.minValue && zoomValue < this.maxValue;
    }
}
