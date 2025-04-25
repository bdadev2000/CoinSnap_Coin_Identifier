package com.glority.android.picturexx.recognize.analyzer;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOutput;
import com.glority.android.detection.p001enum.Strategy;
import com.glority.utils.stability.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* compiled from: DetSingleton.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/DetSingleton;", "", "<init>", "()V", "initModelThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "initDetModeJob", "Lkotlinx/coroutines/Deferred;", "Lcom/glority/android/detection/interpreter/BaseInterpreter;", "mDetectInterpreter", "mDetectThreshold", "", "mDetectStrategy", "Lcom/glority/android/detection/enum/Strategy;", "mExpendRation", "initInterpreter", "", "context", "Landroid/content/Context;", "initSync", "applicationContext", "det", "Lcom/glority/android/detection/item/DetectOutput;", "bitmap", "Landroid/graphics/Bitmap;", "release", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DetSingleton {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static DetSingleton instance;
    private Deferred<? extends BaseInterpreter> initDetModeJob;
    private final ExecutorCoroutineDispatcher initModelThread;
    private BaseInterpreter mDetectInterpreter;
    private Strategy mDetectStrategy;
    private float mDetectThreshold;
    private float mExpendRation;

    public DetSingleton() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.initModelThread = ExecutorsKt.from(newSingleThreadExecutor);
        this.mDetectThreshold = 0.5f;
        this.mDetectStrategy = Strategy.smart;
    }

    /* compiled from: DetSingleton.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/DetSingleton$Companion;", "", "<init>", "()V", "instance", "Lcom/glority/android/picturexx/recognize/analyzer/DetSingleton;", "getInstance", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DetSingleton getInstance() {
            if (DetSingleton.instance == null) {
                DetSingleton.instance = new DetSingleton();
            }
            DetSingleton detSingleton = DetSingleton.instance;
            Intrinsics.checkNotNull(detSingleton);
            return detSingleton;
        }
    }

    public final void initInterpreter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.initModelThread), null, null, new DetSingleton$initInterpreter$1(this, context.getApplicationContext(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSync(Context applicationContext) {
        BuildersKt__BuildersKt.runBlocking$default(null, new DetSingleton$initSync$1(this, applicationContext, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DetectOutput det(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt.runBlocking(this.initModelThread, new DetSingleton$det$1(this, objectRef, bitmap, null));
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
