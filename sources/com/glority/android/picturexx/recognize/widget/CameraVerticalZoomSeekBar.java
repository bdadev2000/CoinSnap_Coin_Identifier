package com.glority.android.picturexx.recognize.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomVerticalSeekBarBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraVerticalZoomSeekBar.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CameraVerticalZoomSeekBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/recognize/databinding/WidgetCameraZoomVerticalSeekBarBinding;", "seekBar", "Lcom/glority/android/picturexx/recognize/widget/VerticalSeekBar;", "getSeekBar", "()Lcom/glority/android/picturexx/recognize/widget/VerticalSeekBar;", "ivZoomIn", "Landroid/widget/ImageView;", "getIvZoomIn", "()Landroid/widget/ImageView;", "ivZoomOut", "getIvZoomOut", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CameraVerticalZoomSeekBar extends LinearLayout {
    private final WidgetCameraZoomVerticalSeekBarBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraVerticalZoomSeekBar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraVerticalZoomSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CameraVerticalZoomSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraVerticalZoomSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetCameraZoomVerticalSeekBarBinding inflate = WidgetCameraZoomVerticalSeekBarBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final VerticalSeekBar getSeekBar() {
        VerticalSeekBar seekBar = this.binding.seekBar;
        Intrinsics.checkNotNullExpressionValue(seekBar, "seekBar");
        return seekBar;
    }

    public final ImageView getIvZoomIn() {
        ImageView ivZoomIn = this.binding.ivZoomIn;
        Intrinsics.checkNotNullExpressionValue(ivZoomIn, "ivZoomIn");
        return ivZoomIn;
    }

    public final ImageView getIvZoomOut() {
        ImageView ivZoomOut = this.binding.ivZoomOut;
        Intrinsics.checkNotNullExpressionValue(ivZoomOut, "ivZoomOut");
        return ivZoomOut;
    }
}
