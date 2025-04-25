package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: AndroidTextInputSession.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {115, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ MutableSharedFlow<Unit> $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(MutableSharedFlow<Unit> mutableSharedFlow, ComposeInputMethodManager composeInputMethodManager, Continuation<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1> continuation) {
        super(2, continuation);
        this.$it = mutableSharedFlow;
        this.$composeImm = composeInputMethodManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(this.$it, this.$composeImm, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameMillis(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.1
                public final void invoke(long j) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                    invoke(l.longValue());
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableSharedFlow<Unit> mutableSharedFlow = this.$it;
        final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
        this.label = 2;
        if (mutableSharedFlow.collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                ComposeInputMethodManager.this.startStylusHandwriting();
                return Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw new KotlinNothingValueException();
    }
}
