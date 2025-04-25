package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentInViewNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdatableAnimationState $animationState;
    final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation<? super ContentInViewNode$launchAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = contentInViewNode;
        this.$animationState = updatableAnimationState;
        this.$bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, continuation);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContentInViewNode$launchAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollingLogic = this.this$0.scrollingLogic;
                    this.label = 1;
                    if (scrollingLogic.scroll(MutatePriority.Default, new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, job, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll((Throwable) null);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {ComposerKt.providerKey}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $animationJob;
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, Job job, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animationState = updatableAnimationState;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = bringIntoViewSpec;
            this.$animationJob = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NestedScrollScope nestedScrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float calculateScrollDelta;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                UpdatableAnimationState updatableAnimationState = this.$animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta(this.$bringIntoViewSpec);
                updatableAnimationState.setValue(calculateScrollDelta);
                UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                final UpdatableAnimationState updatableAnimationState3 = this.$animationState;
                final Job job = this.$animationJob;
                Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        boolean z;
                        ScrollingLogic scrollingLogic;
                        z = ContentInViewNode.this.reverseDirection;
                        float f2 = z ? 1.0f : -1.0f;
                        scrollingLogic = ContentInViewNode.this.scrollingLogic;
                        float m802toFloatk4lQ0M = f2 * scrollingLogic.m802toFloatk4lQ0M(scrollingLogic.m800reverseIfNeededMKHz9U(nestedScrollScope.mo758scrollByOzD1aCk(scrollingLogic.m800reverseIfNeededMKHz9U(scrollingLogic.m803toOffsettuRUvjQ(f2 * f)), NestedScrollSource.INSTANCE.m5617getUserInputWNlRxjI())));
                        if (Math.abs(m802toFloatk4lQ0M) < Math.abs(f)) {
                            JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + m802toFloatk4lQ0M + " < " + f + ')', null, 2, null);
                        }
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.this$0;
                final UpdatableAnimationState updatableAnimationState4 = this.$animationState;
                final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                this.label = 1;
                if (updatableAnimationState2.animateToZero(function1, new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
                    
                        r2 = r1.getFocusedChildBounds();
                     */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke2() {
                        /*
                            r9 = this;
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue r0 = androidx.compose.foundation.gestures.ContentInViewNode.access$getBringIntoViewRequests$p(r0)
                            androidx.compose.foundation.gestures.ContentInViewNode r7 = androidx.compose.foundation.gestures.ContentInViewNode.this
                        L8:
                            androidx.compose.runtime.collection.MutableVector r1 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            boolean r1 = r1.isNotEmpty()
                            r8 = 1
                            if (r1 == 0) goto L5b
                            androidx.compose.runtime.collection.MutableVector r1 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            java.lang.Object r1 = r1.last()
                            androidx.compose.foundation.gestures.ContentInViewNode$Request r1 = (androidx.compose.foundation.gestures.ContentInViewNode.Request) r1
                            kotlin.jvm.functions.Function0 r1 = r1.getCurrentBounds()
                            java.lang.Object r1 = r1.invoke()
                            r2 = r1
                            androidx.compose.ui.geometry.Rect r2 = (androidx.compose.ui.geometry.Rect) r2
                            if (r2 != 0) goto L2b
                            goto L36
                        L2b:
                            r5 = 1
                            r6 = 0
                            r3 = 0
                            r1 = r7
                            boolean r1 = androidx.compose.foundation.gestures.ContentInViewNode.m703isMaxVisibleO0kMr_c$default(r1, r2, r3, r5, r6)
                            if (r1 == 0) goto L5b
                        L36:
                            androidx.compose.runtime.collection.MutableVector r1 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            androidx.compose.runtime.collection.MutableVector r2 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            int r2 = r2.getSize()
                            int r2 = r2 - r8
                            java.lang.Object r1 = r1.removeAt(r2)
                            androidx.compose.foundation.gestures.ContentInViewNode$Request r1 = (androidx.compose.foundation.gestures.ContentInViewNode.Request) r1
                            kotlinx.coroutines.CancellableContinuation r1 = r1.getContinuation()
                            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                            kotlin.Unit r2 = kotlin.Unit.INSTANCE
                            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
                            java.lang.Object r2 = kotlin.Result.m8274constructorimpl(r2)
                            r1.resumeWith(r2)
                            goto L8
                        L5b:
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            boolean r0 = androidx.compose.foundation.gestures.ContentInViewNode.access$getTrackingFocusedChild$p(r0)
                            if (r0 == 0) goto L7d
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            androidx.compose.ui.geometry.Rect r2 = androidx.compose.foundation.gestures.ContentInViewNode.access$getFocusedChildBounds(r0)
                            if (r2 == 0) goto L7d
                            androidx.compose.foundation.gestures.ContentInViewNode r1 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            r5 = 1
                            r6 = 0
                            r3 = 0
                            boolean r0 = androidx.compose.foundation.gestures.ContentInViewNode.m703isMaxVisibleO0kMr_c$default(r1, r2, r3, r5, r6)
                            if (r0 != r8) goto L7d
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            r1 = 0
                            androidx.compose.foundation.gestures.ContentInViewNode.access$setTrackingFocusedChild$p(r0, r1)
                        L7d:
                            androidx.compose.foundation.gestures.UpdatableAnimationState r0 = r2
                            androidx.compose.foundation.gestures.ContentInViewNode r1 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            androidx.compose.foundation.gestures.BringIntoViewSpec r2 = r3
                            float r1 = androidx.compose.foundation.gestures.ContentInViewNode.access$calculateScrollDelta(r1, r2)
                            r0.setValue(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1.AnonymousClass2.invoke2():void");
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
