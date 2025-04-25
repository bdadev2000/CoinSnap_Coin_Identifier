package com.glority.android.picturexx.recognize.fragment;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
import com.glority.android.picturexx.recognize.utils.RecognizeAbUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a=\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00112\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u0015j\u0002`\u0014\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"updateCaptureHint", "", "Landroid/widget/TextView;", "textId", "", "text", "", "updateCaptureHintImpl", "textView", "wrapper", "Lcom/glority/android/picturexx/recognize/fragment/AnalysisResult;", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "zoomInFactor", "", "tryCatchException", "R", "tried", "Lkotlin/Function0;", "catch", "Lkotlin/Function1;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBitmapIgnoreRotation", "Landroid/graphics/Bitmap;", "Landroidx/camera/core/ImageProxy;", "recognize_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CaptureFragmentKt {
    public static final /* synthetic */ void access$updateCaptureHint(TextView textView, int i) {
        updateCaptureHint(textView, i);
    }

    public static final /* synthetic */ void access$updateCaptureHint(TextView textView, CharSequence charSequence) {
        updateCaptureHint(textView, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCaptureHint(TextView textView, int i) {
        String string = textView.getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        updateCaptureHintImpl(textView, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCaptureHint(TextView textView, CharSequence charSequence) {
        updateCaptureHintImpl(textView, charSequence);
    }

    private static final void updateCaptureHintImpl(TextView textView, CharSequence charSequence) {
        if (!RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn()) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        TextView textView2 = textView;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(text.length() > 0 ? 0 : 8);
    }

    public static /* synthetic */ AnalysisResult wrapper$default(AreaStatus areaStatus, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return wrapper(areaStatus, f);
    }

    public static final AnalysisResult wrapper(AreaStatus areaStatus, float f) {
        Intrinsics.checkNotNullParameter(areaStatus, "<this>");
        return new AnalysisResult(areaStatus, f);
    }

    public static final <R> R tryCatchException(Function0<? extends R> tried, Function1<? super Exception, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(tried, "tried");
        Intrinsics.checkNotNullParameter(function1, "catch");
        try {
            return tried.invoke();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return function1.invoke(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap toBitmapIgnoreRotation(ImageProxy imageProxy) {
        Bitmap bitmap = imageProxy.toBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
        int rotationDegrees = imageProxy.getImageInfo().getRotationDegrees();
        Matrix matrix = new Matrix();
        matrix.postRotate(rotationDegrees);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }
}
