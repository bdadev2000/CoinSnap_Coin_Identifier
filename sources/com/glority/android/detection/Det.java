package com.glority.android.detection;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.detection.item.DetectOutput;
import com.glority.android.detection.p001enum.Strategy;
import com.glority.utils.stability.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;

/* compiled from: Det.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020\"R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/glority/android/detection/Det;", "", "options", "Lcom/glority/android/detection/item/DetectOptions;", "modelFileName", "", "decryptKey", "(Lcom/glority/android/detection/item/DetectOptions;Ljava/lang/String;Ljava/lang/String;)V", "initDetModeJob", "Lkotlinx/coroutines/Deferred;", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "initModelThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "mDetectInterpreter", "mDetectStrategy", "Lcom/glority/android/detection/enum/Strategy;", "getMDetectStrategy", "()Lcom/glority/android/detection/enum/Strategy;", "setMDetectStrategy", "(Lcom/glority/android/detection/enum/Strategy;)V", "mDetectThreshold", "", "getMDetectThreshold", "()F", "setMDetectThreshold", "(F)V", "mExpendRation", "getMExpendRation", "setMExpendRation", "det", "Lcom/glority/android/detection/item/DetectOutput;", "bitmap", "Landroid/graphics/Bitmap;", "initInterpreter", "", "context", "Landroid/content/Context;", "initSync", "applicationContext", "release", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class Det {
    private final String decryptKey;
    private Deferred<? extends BaseInterpreter> initDetModeJob;
    private final ExecutorCoroutineDispatcher initModelThread;
    private BaseInterpreter mDetectInterpreter;
    private Strategy mDetectStrategy;
    private float mDetectThreshold;
    private float mExpendRation;
    private final String modelFileName;
    private final DetectOptions options;

    public Det(DetectOptions options, String modelFileName, String str) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(modelFileName, "modelFileName");
        this.options = options;
        this.modelFileName = modelFileName;
        this.decryptKey = str;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.initModelThread = ExecutorsKt.from(newSingleThreadExecutor);
        this.mDetectThreshold = 0.5f;
        this.mDetectStrategy = Strategy.smart;
    }

    public final float getMDetectThreshold() {
        return this.mDetectThreshold;
    }

    public final void setMDetectThreshold(float f) {
        this.mDetectThreshold = f;
    }

    public final Strategy getMDetectStrategy() {
        return this.mDetectStrategy;
    }

    public final void setMDetectStrategy(Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "<set-?>");
        this.mDetectStrategy = strategy;
    }

    public final float getMExpendRation() {
        return this.mExpendRation;
    }

    public final void setMExpendRation(float f) {
        this.mExpendRation = f;
    }

    public final void initInterpreter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.initModelThread), null, null, new Det$initInterpreter$1(this, context.getApplicationContext(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSync(Context applicationContext) {
        BuildersKt__BuildersKt.runBlocking$default(null, new Det$initSync$1(this, applicationContext, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DetectOutput det(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt.runBlocking(this.initModelThread, new Det$det$1(this, objectRef, bitmap, null));
        return (DetectOutput) objectRef.element;
    }

    public final void release() {
        try {
            BaseInterpreter baseInterpreter = this.mDetectInterpreter;
            if (baseInterpreter != null) {
                baseInterpreter.release();
            }
            this.mDetectInterpreter = null;
            Deferred<? extends BaseInterpreter> deferred = this.initDetModeJob;
            if (deferred != null) {
                Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
            }
            this.initDetModeJob = null;
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
