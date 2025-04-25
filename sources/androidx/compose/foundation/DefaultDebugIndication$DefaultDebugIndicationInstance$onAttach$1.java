package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", i = {}, l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, Continuation<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InteractionSource interactionSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            final Ref.IntRef intRef3 = new Ref.IntRef();
            interactionSource = this.this$0.interactionSource;
            Flow<Interaction> interactions = interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            this.label = 1;
            if (interactions.collect(new FlowCollector() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
                
                    if (r0 != false) goto L46;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(androidx.compose.foundation.interaction.Interaction r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r6 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        r0 = 1
                        if (r6 == 0) goto Lf
                        kotlin.jvm.internal.Ref$IntRef r5 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5 + r0
                        r6.element = r5
                        goto L66
                    Lf:
                        boolean r6 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r6 == 0) goto L1e
                        kotlin.jvm.internal.Ref$IntRef r5 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5 + (-1)
                        r6.element = r5
                        goto L66
                    L1e:
                        boolean r6 = r5 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r6 == 0) goto L2d
                        kotlin.jvm.internal.Ref$IntRef r5 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5 + (-1)
                        r6.element = r5
                        goto L66
                    L2d:
                        boolean r6 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
                        if (r6 == 0) goto L3b
                        kotlin.jvm.internal.Ref$IntRef r5 = r2
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = r2
                        int r5 = r5 + r0
                        r6.element = r5
                        goto L66
                    L3b:
                        boolean r6 = r5 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit
                        if (r6 == 0) goto L4a
                        kotlin.jvm.internal.Ref$IntRef r5 = r2
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = r2
                        int r5 = r5 + (-1)
                        r6.element = r5
                        goto L66
                    L4a:
                        boolean r6 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
                        if (r6 == 0) goto L58
                        kotlin.jvm.internal.Ref$IntRef r5 = r3
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = r3
                        int r5 = r5 + r0
                        r6.element = r5
                        goto L66
                    L58:
                        boolean r5 = r5 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus
                        if (r5 == 0) goto L66
                        kotlin.jvm.internal.Ref$IntRef r5 = r3
                        int r5 = r5.element
                        kotlin.jvm.internal.Ref$IntRef r6 = r3
                        int r5 = r5 + (-1)
                        r6.element = r5
                    L66:
                        kotlin.jvm.internal.Ref$IntRef r5 = kotlin.jvm.internal.Ref.IntRef.this
                        int r5 = r5.element
                        r6 = 0
                        if (r5 <= 0) goto L6f
                        r5 = r0
                        goto L70
                    L6f:
                        r5 = r6
                    L70:
                        kotlin.jvm.internal.Ref$IntRef r1 = r2
                        int r1 = r1.element
                        if (r1 <= 0) goto L78
                        r1 = r0
                        goto L79
                    L78:
                        r1 = r6
                    L79:
                        kotlin.jvm.internal.Ref$IntRef r2 = r3
                        int r2 = r2.element
                        if (r2 <= 0) goto L81
                        r2 = r0
                        goto L82
                    L81:
                        r2 = r6
                    L82:
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r3 = r4
                        boolean r3 = androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance.access$isPressed$p(r3)
                        if (r3 == r5) goto L90
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r6 = r4
                        androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance.access$setPressed$p(r6, r5)
                        r6 = r0
                    L90:
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r5 = r4
                        boolean r5 = androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance.access$isHovered$p(r5)
                        if (r5 == r1) goto L9e
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r5 = r4
                        androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance.access$setHovered$p(r5, r1)
                        goto L9f
                    L9e:
                        r0 = r6
                    L9f:
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r5 = r4
                        boolean r5 = androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance.access$isFocused$p(r5)
                        if (r5 == r2) goto Lad
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r5 = r4
                        androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance.access$setFocused$p(r5, r2)
                        goto Laf
                    Lad:
                        if (r0 == 0) goto Lb6
                    Laf:
                        androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance r5 = r4
                        androidx.compose.ui.node.DrawModifierNode r5 = (androidx.compose.ui.node.DrawModifierNode) r5
                        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r5)
                    Lb6:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.AnonymousClass1.emit(androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.Continuation):java.lang.Object");
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
