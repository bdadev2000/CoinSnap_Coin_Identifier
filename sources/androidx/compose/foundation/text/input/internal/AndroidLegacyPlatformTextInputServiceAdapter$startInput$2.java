package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements Function2<PlatformTextInputSession, Continuation<?>, Object> {
    final /* synthetic */ Function1<LegacyTextInputMethodRequest, Unit> $initializeRequest;
    final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(Function1<? super LegacyTextInputMethodRequest, Unit> function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, Continuation<? super AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> continuation) {
        super(2, continuation);
        this.$initializeRequest = function1;
        this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
        this.$node = legacyPlatformTextInputNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, continuation);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PlatformTextInputSession platformTextInputSession, Continuation<?> continuation) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(platformTextInputSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final /* synthetic */ PlatformTextInputSession $$this$launchTextInputSession;
        final /* synthetic */ Function1<LegacyTextInputMethodRequest, Unit> $initializeRequest;
        final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PlatformTextInputSession platformTextInputSession, Function1<? super LegacyTextInputMethodRequest, Unit> function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$launchTextInputSession = platformTextInputSession;
            this.$initializeRequest = function1;
            this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
            this.$node = legacyPlatformTextInputNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    InputMethodManager invoke = LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(this.$$this$launchTextInputSession.getView());
                    LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(this.$$this$launchTextInputSession.getView(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), invoke);
                    if (StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00291(this.this$0, invoke, null), 3, null);
                    }
                    Function1<LegacyTextInputMethodRequest, Unit> function1 = this.$initializeRequest;
                    if (function1 != null) {
                        function1.invoke(legacyTextInputMethodRequest);
                    }
                    this.this$0.currentRequest = legacyTextInputMethodRequest;
                    this.label = 1;
                    if (this.$$this$launchTextInputSession.startInputMethod(legacyTextInputMethodRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.currentRequest = null;
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {137, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InputMethodManager $inputMethodManager;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00291(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, InputMethodManager inputMethodManager, Continuation<? super C00291> continuation) {
                super(2, continuation);
                this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                this.$inputMethodManager = inputMethodManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00291(this.this$0, this.$inputMethodManager, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableSharedFlow stylusHandwritingTrigger;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (MonotonicFrameClockKt.withFrameMillis(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.1
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
                stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                if (stylusHandwritingTrigger == null) {
                    return Unit.INSTANCE;
                }
                final InputMethodManager inputMethodManager = this.$inputMethodManager;
                this.label = 2;
                if (stylusHandwritingTrigger.collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        InputMethodManager.this.startStylusHandwriting();
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1((PlatformTextInputSession) this.L$0, this.$initializeRequest, this.this$0, this.$node, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
