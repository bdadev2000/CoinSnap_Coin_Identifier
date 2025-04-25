package com.glority.android.picturexx.recognize.analyzer;

import android.content.Context;
import android.util.Log;
import com.glority.utils.stability.LogUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.java.TfLite;
import java.nio.MappedByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.common.FileUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BlurSingleton.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.analyzer.BlurSingleton$initInterpreter$1", f = "BlurSingleton.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BlurSingleton$initInterpreter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ String $modelPath;
    int label;
    final /* synthetic */ BlurSingleton this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurSingleton$initInterpreter$1(BlurSingleton blurSingleton, Context context, String str, Continuation<? super BlurSingleton$initInterpreter$1> continuation) {
        super(2, continuation);
        this.this$0 = blurSingleton;
        this.$applicationContext = context;
        this.$modelPath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlurSingleton$initInterpreter$1(this.this$0, this.$applicationContext, this.$modelPath, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BlurSingleton$initInterpreter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.getInterpreter() != null) {
            return Unit.INSTANCE;
        }
        try {
            LogUtils.d("BlurSingleton initInterpreter");
            MappedByteBuffer loadMappedFile = FileUtil.loadMappedFile(this.$applicationContext, this.$modelPath);
            Intrinsics.checkNotNullExpressionValue(loadMappedFile, "loadMappedFile(...)");
            Tasks.await(TfLite.initialize(this.$applicationContext), 2L, TimeUnit.SECONDS);
            this.this$0.setInterpreter(new Interpreter(loadMappedFile));
        } catch (Throwable th) {
            str = this.this$0.TAG;
            Log.e(str, "initInterpreter: " + th.getMessage());
        }
        return Unit.INSTANCE;
    }
}
