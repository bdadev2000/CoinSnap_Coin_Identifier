package com.glority.android.detection.interpreter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.detection.helper.BoundingBox;
import com.glority.android.detection.helper.DetResizeOp;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.detection.p001enum.ModelType;
import com.glority.android.detection.singleton.GoogleServiceTFSingleton;
import com.glority.utils.stability.LogUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.java.TfLite;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.common.SequentialProcessor;
import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.ops.NormalizeOp;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.TensorImage;

/* compiled from: TFLiteInterpreter.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00011B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J0\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002J\u001d\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u0010-J-\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0014H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/glority/android/detection/interpreter/TFLiteInterpreter;", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "inputStream", "Ljava/io/InputStream;", "decryptKey", "", "options", "Lcom/glority/android/detection/item/DetectOptions;", "context", "Landroid/content/Context;", "initStatusCallback", "Lcom/glority/android/detection/interpreter/BaseInterpreter$InitStatusCallback;", "(Ljava/io/InputStream;Ljava/lang/String;Lcom/glority/android/detection/item/DetectOptions;Landroid/content/Context;Lcom/glority/android/detection/interpreter/BaseInterpreter$InitStatusCallback;)V", "interpreter", "Lorg/tensorflow/lite/InterpreterApi;", "isGoogleServiceEngine", "", "tfImageBuffer", "Lorg/tensorflow/lite/support/image/TensorImage;", "enableGoogleServiceEngine", "", "enable", "getBaseOption", "Lorg/tensorflow/lite/InterpreterApi$Options;", "getInterpreterOutput", "", "", "", "googleServiceEngineEnabled", "initInterpreter", "byteBuffer", "Ljava/nio/ByteBuffer;", "inverseTransform", "Landroid/graphics/RectF;", "box", "inputWidth", "inputHeight", "outputWidth", "outputHeight", "normalizeBitmap", "bitmap", "Landroid/graphics/Bitmap;", "predict", "", "Lcom/glority/android/detection/helper/BoundingBox;", "(Landroid/graphics/Bitmap;)[Lcom/glority/android/detection/helper/BoundingBox;", "normalizeData", "(Lorg/tensorflow/lite/support/image/TensorImage;II)[Lcom/glority/android/detection/helper/BoundingBox;", "release", "Companion", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class TFLiteInterpreter extends BaseInterpreter {
    private static final String TAG = "TFLiteInterpreter";
    private InterpreterApi interpreter;
    private boolean isGoogleServiceEngine;
    private final TensorImage tfImageBuffer;

    /* compiled from: TFLiteInterpreter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelType.values().length];
            try {
                iArr[ModelType.Yolov5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TFLiteInterpreter(InputStream inputStream, String str, DetectOptions detectOptions, Context context, BaseInterpreter.InitStatusCallback initStatusCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, str, detectOptions, context, (i & 16) != 0 ? null : initStatusCallback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TFLiteInterpreter(InputStream inputStream, String str, DetectOptions options, Context context, BaseInterpreter.InitStatusCallback initStatusCallback) {
        super(inputStream, str, options, context, initStatusCallback);
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(context, "context");
        this.tfImageBuffer = new TensorImage(DataType.UINT8);
        this.isGoogleServiceEngine = true;
    }

    @Override // com.glority.android.detection.interpreter.BaseInterpreter
    public void initInterpreter(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Log.e(TAG, "initInterpreter: ");
        try {
            if (Build.VERSION.SDK_INT > 28 && GoogleServiceTFSingleton.INSTANCE.getInstance().isInstalled(getContext()) && googleServiceEngineEnabled()) {
                this.isGoogleServiceEngine = true;
                TfLiteInitializationOptions.Builder builder = TfLiteInitializationOptions.builder();
                Intrinsics.checkNotNullExpressionValue(builder, "builder()");
                builder.setEnableGpuDelegateSupport(false);
                builder.setEnableAutomaticDownload(true);
                Tasks.await(TfLite.initialize(getContext(), builder.build()), 10L, TimeUnit.SECONDS);
                this.interpreter = InterpreterApi.create(byteBuffer, getBaseOption());
            } else {
                this.isGoogleServiceEngine = false;
                this.interpreter = new Interpreter(byteBuffer);
            }
        } catch (Throwable unused) {
            this.isGoogleServiceEngine = false;
            this.interpreter = new Interpreter(byteBuffer);
        }
    }

    @Override // com.glority.android.detection.interpreter.BaseInterpreter
    public BoundingBox[] predict(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        BoundingBox[] boundingBoxArr = null;
        if (this.interpreter != null) {
            TensorImage normalizeBitmap = normalizeBitmap(bitmap);
            if (this.isGoogleServiceEngine) {
                enableGoogleServiceEngine(false);
            }
            try {
                boundingBoxArr = predict(normalizeBitmap, bitmap.getWidth(), bitmap.getHeight());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            if (this.isGoogleServiceEngine) {
                enableGoogleServiceEngine(true);
            }
        }
        return boundingBoxArr;
    }

    private final RectF inverseTransform(RectF box, int inputWidth, int inputHeight, int outputWidth, int outputHeight) {
        float f = outputWidth;
        float f2 = inputWidth;
        float f3 = outputHeight;
        float f4 = inputHeight;
        float max = Math.max(f / f2, f3 / f4);
        float f5 = (f2 * max) / f;
        float f6 = (f4 * max) / f3;
        return new RectF(box.left * f6, box.top * f5, box.right * f6, box.bottom * f5);
    }

    private final BoundingBox[] predict(TensorImage normalizeData, int inputWidth, int inputHeight) {
        Map<Integer, Object> interpreterOutput;
        InterpreterApi interpreterApi = this.interpreter;
        if (interpreterApi != null && (interpreterOutput = getInterpreterOutput(interpreterApi)) != null) {
            int i = 1;
            int i2 = 0;
            interpreterApi.runForMultipleInputsOutputs(new ByteBuffer[]{normalizeData.getBuffer()}, interpreterOutput);
            int width = normalizeData.getWidth();
            int height = normalizeData.getHeight();
            if (WhenMappings.$EnumSwitchMapping$0[getOptions().getModelType().ordinal()] == 1) {
                Object obj = interpreterOutput.get(0);
                float[][][] fArr = obj instanceof float[][][] ? (float[][][]) obj : null;
                if (fArr != null) {
                    float[][] fArr2 = fArr[0];
                    ArrayList arrayList = new ArrayList();
                    int length = fArr2.length;
                    int i3 = 0;
                    while (i3 < length) {
                        float[] fArr3 = fArr2[i3];
                        List<Float> slice = ArraysKt.slice(fArr3, new IntRange(i2, 3));
                        float f = fArr3[4] * fArr3[5];
                        float floatValue = slice.get(i2).floatValue();
                        float f2 = 2;
                        RectF rectF = new RectF(floatValue - (slice.get(2).floatValue() / f2), slice.get(i).floatValue() - (slice.get(3).floatValue() / f2), slice.get(0).floatValue() + (slice.get(2).floatValue() / f2), slice.get(1).floatValue() + (slice.get(3).floatValue() / f2));
                        i = 1;
                        arrayList.add(new BoundingBox(0, f, inverseTransform(rectF, inputWidth, inputHeight, width, height)));
                        i3++;
                        i2 = 0;
                    }
                    return (BoundingBox[]) arrayList.toArray(new BoundingBox[i2]);
                }
            }
        }
        return null;
    }

    private final Map<Integer, Object> getInterpreterOutput(InterpreterApi interpreter) {
        if (WhenMappings.$EnumSwitchMapping$0[getOptions().getModelType().ordinal()] != 1) {
            return null;
        }
        if (interpreter.getOutputTensorCount() != 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Tensor outputTensor = interpreter.getOutputTensor(0);
        DataType dataType = outputTensor.dataType();
        int[] shape = outputTensor.shape();
        if (dataType != DataType.FLOAT32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (shape.length != 3) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = shape[0];
        float[][][] fArr = new float[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = shape[1];
            float[][] fArr2 = new float[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                fArr2[i4] = new float[shape[2]];
            }
            fArr[i2] = fArr2;
        }
        linkedHashMap.put(0, fArr);
        return linkedHashMap;
    }

    private final TensorImage normalizeBitmap(Bitmap bitmap) {
        SequentialProcessor<TensorImage> build = new ImageProcessor.Builder().add((ImageOperator) new DetResizeOp(getOptions().getHeight(), getOptions().getWidth())).add((TensorOperator) new NormalizeOp(0.0f, 255.0f)).build();
        TensorImage tensorImage = this.tfImageBuffer;
        tensorImage.load(bitmap);
        TensorImage process = build.process(tensorImage);
        Intrinsics.checkNotNullExpressionValue(process, "Builder()\n            .a…r.apply { load(bitmap) })");
        return process;
    }

    private final InterpreterApi.Options getBaseOption() {
        InterpreterApi.Options options = new InterpreterApi.Options();
        options.setRuntime(InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION);
        return options;
    }

    @Override // com.glority.android.detection.interpreter.BaseInterpreter
    public void release() {
        InterpreterApi interpreterApi = this.interpreter;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
    }

    private final boolean googleServiceEngineEnabled() {
        return getContext().getSharedPreferences("image-deetction", 0).getBoolean("googleServiceEngine", true);
    }

    private final void enableGoogleServiceEngine(boolean enable) {
        getContext().getSharedPreferences("image-detection", 0).edit().putBoolean("googleServiceEngine", enable).apply();
    }
}
