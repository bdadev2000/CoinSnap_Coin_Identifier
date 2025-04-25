package com.glority.android.detection;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectOutput;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Det.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.detection.Det$det$1", f = "Det.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class Det$det$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Ref.ObjectRef<DetectOutput> $result;
    int label;
    final /* synthetic */ Det this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Det$det$1(Det det, Ref.ObjectRef<DetectOutput> objectRef, Bitmap bitmap, Continuation<? super Det$det$1> continuation) {
        super(2, continuation);
        this.this$0 = det;
        this.$result = objectRef;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Det$det$1(this.this$0, this.$result, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Det$det$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BaseInterpreter baseInterpreter;
        BaseInterpreter baseInterpreter2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            baseInterpreter = this.this$0.mDetectInterpreter;
            if (baseInterpreter == null) {
                this.this$0.initSync(AppContext.INSTANCE.peekContext());
            }
            Ref.ObjectRef<DetectOutput> objectRef = this.$result;
            baseInterpreter2 = this.this$0.mDetectInterpreter;
            objectRef.element = baseInterpreter2 != null ? BaseInterpreter.detect$default(baseInterpreter2, this.$bitmap, this.this$0.getMDetectThreshold(), this.this$0.getMDetectStrategy(), this.this$0.getMExpendRation(), 0.0f, 0.0f, 0, StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA, null) : 0;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
