package com.glority.android.picturexx.recognize.analyzer;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.support.common.SequentialProcessor;
import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.ops.NormalizeOp;
import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.TensorImage;

/* compiled from: BlurSingleton.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/BlurSingleton;", "", "<init>", "()V", "TAG", "", "tfImageBuffer", "Lorg/tensorflow/lite/support/image/TensorImage;", "interpreter", "Lorg/tensorflow/lite/InterpreterApi;", "getInterpreter", "()Lorg/tensorflow/lite/InterpreterApi;", "setInterpreter", "(Lorg/tensorflow/lite/InterpreterApi;)V", "singleThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "initInterpreter", "", "context", "Landroid/content/Context;", "modelPath", "blur", "", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)Ljava/lang/Float;", "normalizeBitmap", "getBaseOption", "Lorg/tensorflow/lite/InterpreterApi$Options;", "release", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class BlurSingleton {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static BlurSingleton instance;
    private InterpreterApi interpreter;
    private final ExecutorCoroutineDispatcher singleThread;
    private final String TAG = "BlurSingleton";
    private final TensorImage tfImageBuffer = new TensorImage(DataType.UINT8);

    public BlurSingleton() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.singleThread = ExecutorsKt.from(newSingleThreadExecutor);
    }

    public final InterpreterApi getInterpreter() {
        return this.interpreter;
    }

    public final void setInterpreter(InterpreterApi interpreterApi) {
        this.interpreter = interpreterApi;
    }

    /* compiled from: BlurSingleton.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/BlurSingleton$Companion;", "", "<init>", "()V", "instance", "Lcom/glority/android/picturexx/recognize/analyzer/BlurSingleton;", "getInstance", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BlurSingleton getInstance() {
            if (BlurSingleton.instance == null) {
                synchronized (BlurSingleton.class) {
                    if (BlurSingleton.instance == null) {
                        Companion companion = BlurSingleton.INSTANCE;
                        BlurSingleton.instance = new BlurSingleton();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            BlurSingleton blurSingleton = BlurSingleton.instance;
            Intrinsics.checkNotNull(blurSingleton);
            return blurSingleton;
        }
    }

    public final void initInterpreter(Context context, String modelPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modelPath, "modelPath");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.singleThread), null, null, new BlurSingleton$initInterpreter$1(this, context.getApplicationContext(), modelPath, null), 3, null);
    }

    public final Float blur(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            TensorImage normalizeBitmap = normalizeBitmap(bitmap);
            float[][] fArr = {new float[2]};
            InterpreterApi interpreterApi = this.interpreter;
            if (interpreterApi != null) {
                interpreterApi.run(normalizeBitmap.getBuffer(), fArr);
            }
            return Float.valueOf(fArr[0][1]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final TensorImage normalizeBitmap(Bitmap bitmap) {
        SequentialProcessor<TensorImage> build = new ImageProcessor.Builder().add((TensorOperator) new NormalizeOp(0.0f, 255.0f)).build();
        TensorImage tensorImage = this.tfImageBuffer;
        tensorImage.load(bitmap);
        TensorImage process = build.process(tensorImage);
        Intrinsics.checkNotNullExpressionValue(process, "process(...)");
        return process;
    }

    private final InterpreterApi.Options getBaseOption() {
        InterpreterApi.Options options = new InterpreterApi.Options();
        options.setRuntime(InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION);
        options.setNumThreads(4);
        return options;
    }

    public final void release() {
        InterpreterApi interpreterApi = this.interpreter;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
        this.interpreter = null;
    }
}
