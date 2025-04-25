package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldDecoratorModifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {TypedValues.TransitionType.TYPE_TRANSITION_FLAGS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super TextFieldDecoratorModifierNode$startInputSession$1> continuation) {
        super(2, continuation);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$receiveContentConfiguration = receiveContentConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldDecoratorModifierNode$startInputSession$1(this.this$0, this.$receiveContentConfiguration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldDecoratorModifierNode$startInputSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (PlatformTextInputModifierNodeKt.establishTextInputSession(this.this$0, new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, null), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {708}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = textFieldDecoratorModifierNode;
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, Continuation<?> continuation) {
            return ((AnonymousClass1) create(platformTextInputSessionScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow stylusHandwritingTrigger;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                C00311 c00311 = new C00311(this.this$0);
                stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                this.label = 1;
                if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation_release, receiveContentConfiguration, c00311, stylusHandwritingTrigger, (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration()), this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C00311 extends FunctionReferenceImpl implements Function1<ImeAction, Unit> {
            C00311(Object obj) {
                super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m1507invokeKlQnJC8(imeAction.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m1507invokeKlQnJC8(int i) {
                ((TextFieldDecoratorModifierNode) this.receiver).m1505onImeActionPerformedKlQnJC8(i);
            }
        }
    }
}
