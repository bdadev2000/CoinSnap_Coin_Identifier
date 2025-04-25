package androidx.compose.foundation.text.input.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CursorAnimationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CursorAnimationState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, Continuation<? super CursorAnimationState$snapToVisibleAndAnimate$2> continuation) {
        super(2, continuation);
        this.this$0 = cursorAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Job launch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            atomicReference = this.this$0.animationJob;
            Job job = (Job) atomicReference.getAndSet(null);
            atomicReference2 = this.this$0.animationJob;
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(job, this.this$0, null), 3, null);
            return Boxing.boxBoolean(PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, null, launch$default));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CursorAnimationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {69, 77, 79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $oldJob;
        int label;
        final /* synthetic */ CursorAnimationState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Job job, CursorAnimationState cursorAnimationState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$oldJob = job;
            this.this$0 = cursorAnimationState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$oldJob, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:8:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 0
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L2b
                if (r1 == r7) goto L27
                if (r1 == r6) goto L21
                if (r1 != r5) goto L18
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L25
                goto L3e
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L25
                goto L51
            L25:
                r9 = move-exception
                goto L62
            L27:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L3e
            L2b:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlinx.coroutines.Job r9 = r8.$oldJob
                if (r9 == 0) goto L3e
                r1 = r8
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r8.label = r7
                java.lang.Object r9 = kotlinx.coroutines.JobKt.cancelAndJoin(r9, r1)
                if (r9 != r0) goto L3e
                return r0
            L3e:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r9 = r8.this$0     // Catch: java.lang.Throwable -> L25
                r1 = 1065353216(0x3f800000, float:1.0)
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r9, r1)     // Catch: java.lang.Throwable -> L25
                r9 = r8
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9     // Catch: java.lang.Throwable -> L25
                r8.label = r6     // Catch: java.lang.Throwable -> L25
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r2, r9)     // Catch: java.lang.Throwable -> L25
                if (r9 != r0) goto L51
                return r0
            L51:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r9 = r8.this$0     // Catch: java.lang.Throwable -> L25
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r9, r4)     // Catch: java.lang.Throwable -> L25
                r9 = r8
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9     // Catch: java.lang.Throwable -> L25
                r8.label = r5     // Catch: java.lang.Throwable -> L25
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r2, r9)     // Catch: java.lang.Throwable -> L25
                if (r9 != r0) goto L3e
                return r0
            L62:
                androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r8.this$0
                androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r0, r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
