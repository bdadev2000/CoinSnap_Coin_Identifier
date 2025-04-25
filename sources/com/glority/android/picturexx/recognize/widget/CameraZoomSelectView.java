package com.glority.android.picturexx.recognize.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomSelectViewBinding;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraZoomSelectView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CameraZoomSelectView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/recognize/databinding/WidgetCameraZoomSelectViewBinding;", "onZoomValueClickListener", "Lcom/glority/android/picturexx/recognize/widget/CameraZoomSelectView$OnZoomValueClickListener;", "zoomValueBindingList", "", "Lcom/glority/android/picturexx/recognize/widget/CameraZoomSelectValueView;", "currentZoomValue", "", "setZoomValues", "", "zoomValue", "", "updateZoomValue", "setOnZoomValueClickListener", "getZoomValueSubView", "nextValue", "OnZoomValueClickListener", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CameraZoomSelectView extends LinearLayout {
    private final WidgetCameraZoomSelectViewBinding binding;
    private float currentZoomValue;
    private OnZoomValueClickListener onZoomValueClickListener;
    private final List<CameraZoomSelectValueView> zoomValueBindingList;

    /* compiled from: CameraZoomSelectView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CameraZoomSelectView$OnZoomValueClickListener;", "", "onClick", "", "value", "", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface OnZoomValueClickListener {
        void onClick(float value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraZoomSelectView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraZoomSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CameraZoomSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraZoomSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = WidgetCameraZoomSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        this.zoomValueBindingList = new ArrayList();
        this.currentZoomValue = 1.0f;
    }

    public final void setZoomValues(List<Float> zoomValue) {
        Intrinsics.checkNotNullParameter(zoomValue, "zoomValue");
        removeAllViews();
        List mutableList = CollectionsKt.toMutableList((Collection) zoomValue);
        mutableList.add(Float.valueOf(Float.MAX_VALUE));
        int size = mutableList.size() - 1;
        int i = 0;
        while (i < size) {
            float floatValue = ((Number) mutableList.get(i)).floatValue();
            i++;
            final CameraZoomSelectValueView zoomValueSubView = getZoomValueSubView(floatValue, ((Number) mutableList.get(i)).floatValue());
            CameraZoomSelectValueView cameraZoomSelectValueView = zoomValueSubView;
            ViewExtensionsKt.setSingleClickListener$default(cameraZoomSelectValueView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.widget.CameraZoomSelectView$setZoomValues$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
                
                    r2 = r2.onZoomValueClickListener;
                 */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke2(android.view.View r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        com.glority.android.picturexx.recognize.widget.CameraZoomSelectValueView r2 = com.glority.android.picturexx.recognize.widget.CameraZoomSelectValueView.this
                        com.glority.android.picturexx.recognize.widget.CameraZoomSelectView r0 = r2
                        float r0 = com.glority.android.picturexx.recognize.widget.CameraZoomSelectView.access$getCurrentZoomValue$p(r0)
                        boolean r2 = r2.checkIfSelected(r0)
                        if (r2 != 0) goto L24
                        com.glority.android.picturexx.recognize.widget.CameraZoomSelectView r2 = r2
                        com.glority.android.picturexx.recognize.widget.CameraZoomSelectView$OnZoomValueClickListener r2 = com.glority.android.picturexx.recognize.widget.CameraZoomSelectView.access$getOnZoomValueClickListener$p(r2)
                        if (r2 == 0) goto L24
                        com.glority.android.picturexx.recognize.widget.CameraZoomSelectValueView r0 = com.glority.android.picturexx.recognize.widget.CameraZoomSelectValueView.this
                        float r0 = r0.getMinValue()
                        r2.onClick(r0)
                    L24:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.recognize.widget.CameraZoomSelectView$setZoomValues$1.invoke2(android.view.View):void");
                }
            }, 1, (Object) null);
            this.zoomValueBindingList.add(zoomValueSubView);
            addView(cameraZoomSelectValueView);
        }
    }

    public final void updateZoomValue(float zoomValue) {
        this.currentZoomValue = zoomValue;
        Iterator<T> it = this.zoomValueBindingList.iterator();
        while (it.hasNext()) {
            ((CameraZoomSelectValueView) it.next()).updateZoomValue(zoomValue);
        }
    }

    public final void setOnZoomValueClickListener(OnZoomValueClickListener onZoomValueClickListener) {
        Intrinsics.checkNotNullParameter(onZoomValueClickListener, "onZoomValueClickListener");
        this.onZoomValueClickListener = onZoomValueClickListener;
    }

    private final CameraZoomSelectValueView getZoomValueSubView(float zoomValue, float nextValue) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CameraZoomSelectValueView cameraZoomSelectValueView = new CameraZoomSelectValueView(context, null, 0, 6, null);
        cameraZoomSelectValueView.setValues(zoomValue, nextValue);
        cameraZoomSelectValueView.updateZoomValue(zoomValue);
        return cameraZoomSelectValueView;
    }
}
