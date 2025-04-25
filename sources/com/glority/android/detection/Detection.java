package com.glority.android.detection;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.interpreter.TFLiteInterpreter;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.detection.p001enum.ModelType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Detection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/glority/android/detection/Detection;", "", "()V", "Companion", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class Detection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static DetectOptions DefaultSSDOptions = new DetectOptions(320, 320, 20, 127.5f, 127.5f, ModelType.SSD);
    private static DetectOptions DefaultCenterentOptions = new DetectOptions(512, 512, 20, 0.0f, 1.0f, ModelType.Centernet);
    private static DetectOptions DefaultYolov5Options = new DetectOptions(640, 640, 20, 0.0f, 255.0f, ModelType.Yolov5);

    /* compiled from: Detection.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J#\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\u0010 R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006!"}, d2 = {"Lcom/glority/android/detection/Detection$Companion;", "", "()V", "DefaultCenterentOptions", "Lcom/glority/android/detection/item/DetectOptions;", "getDefaultCenterentOptions", "()Lcom/glority/android/detection/item/DetectOptions;", "setDefaultCenterentOptions", "(Lcom/glority/android/detection/item/DetectOptions;)V", "DefaultSSDOptions", "getDefaultSSDOptions", "setDefaultSSDOptions", "DefaultYolov5Options", "getDefaultYolov5Options", "setDefaultYolov5Options", "createTFLiteInterpreter", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "inputStream", "Ljava/io/InputStream;", "decryptKey", "", "options", "context", "Landroid/content/Context;", "initStatusCallback", "Lcom/glority/android/detection/interpreter/BaseInterpreter$InitStatusCallback;", "cropImage", "Landroid/graphics/Bitmap;", "bitmap", TtmlNode.TAG_REGION, "", "", "(Landroid/graphics/Bitmap;[Ljava/lang/Float;)Landroid/graphics/Bitmap;", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DetectOptions getDefaultSSDOptions() {
            return Detection.DefaultSSDOptions;
        }

        public final void setDefaultSSDOptions(DetectOptions detectOptions) {
            Intrinsics.checkNotNullParameter(detectOptions, "<set-?>");
            Detection.DefaultSSDOptions = detectOptions;
        }

        public final DetectOptions getDefaultCenterentOptions() {
            return Detection.DefaultCenterentOptions;
        }

        public final void setDefaultCenterentOptions(DetectOptions detectOptions) {
            Intrinsics.checkNotNullParameter(detectOptions, "<set-?>");
            Detection.DefaultCenterentOptions = detectOptions;
        }

        public final DetectOptions getDefaultYolov5Options() {
            return Detection.DefaultYolov5Options;
        }

        public final void setDefaultYolov5Options(DetectOptions detectOptions) {
            Intrinsics.checkNotNullParameter(detectOptions, "<set-?>");
            Detection.DefaultYolov5Options = detectOptions;
        }

        public static /* synthetic */ BaseInterpreter createTFLiteInterpreter$default(Companion companion, InputStream inputStream, String str, DetectOptions detectOptions, Context context, BaseInterpreter.InitStatusCallback initStatusCallback, int i, Object obj) {
            if ((i & 16) != 0) {
                initStatusCallback = null;
            }
            return companion.createTFLiteInterpreter(inputStream, str, detectOptions, context, initStatusCallback);
        }

        public final BaseInterpreter createTFLiteInterpreter(InputStream inputStream, String decryptKey, DetectOptions options, Context context, BaseInterpreter.InitStatusCallback initStatusCallback) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(context, "context");
            return new TFLiteInterpreter(inputStream, decryptKey, options, context, initStatusCallback);
        }

        public final Bitmap cropImage(Bitmap bitmap, Float[] region) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(region, "region");
            int width = bitmap.getWidth();
            float height = bitmap.getHeight();
            int floatValue = (int) (region[0].floatValue() * height);
            float f = width;
            int floatValue2 = (int) (region[1].floatValue() * f);
            int floatValue3 = (int) (region[2].floatValue() * height);
            int floatValue4 = (int) (region[3].floatValue() * f);
            if (floatValue4 <= floatValue2 || floatValue3 <= floatValue) {
                return null;
            }
            try {
                return Bitmap.createBitmap(bitmap, floatValue2, floatValue, floatValue4 - floatValue2, floatValue3 - floatValue);
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
