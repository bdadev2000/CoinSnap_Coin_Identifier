package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {504, 511}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6809a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PressGestureScope f6811c;
    public final /* synthetic */ TextFieldSelectionState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6813g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {496, 501}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f6814a;

        /* renamed from: b, reason: collision with root package name */
        public int f6815b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f6816c;
        public final /* synthetic */ long d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6817f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, g gVar) {
            super(2, gVar);
            this.f6816c = textFieldSelectionState;
            this.d = j2;
            this.f6817f = mutableInteractionSource;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6816c, this.d, this.f6817f, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r7.f6815b
                androidx.compose.foundation.interaction.MutableInteractionSource r2 = r7.f6817f
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r3 = r7.f6816c
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                java.lang.Object r0 = r7.f6814a
                androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                kotlin.jvm.internal.q.m(r8)
                goto L56
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f6814a
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
                kotlin.jvm.internal.q.m(r8)
                goto L40
            L28:
                kotlin.jvm.internal.q.m(r8)
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = r3.f6732u
                if (r8 == 0) goto L43
                androidx.compose.foundation.interaction.PressInteraction$Cancel r1 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                r1.<init>(r8)
                r7.f6814a = r3
                r7.f6815b = r5
                java.lang.Object r8 = r2.a(r1, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r1 = r3
            L40:
                r8 = 0
                r1.f6732u = r8
            L43:
                androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                long r5 = r7.d
                r8.<init>(r5)
                r7.f6814a = r8
                r7.f6815b = r4
                java.lang.Object r1 = r2.a(r8, r7)
                if (r1 != r0) goto L55
                return r0
            L55:
                r0 = r8
            L56:
                r3.f6732u = r0
                d0.b0 r8 = d0.b0.f30125a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(PressGestureScope pressGestureScope, TextFieldSelectionState textFieldSelectionState, long j2, MutableInteractionSource mutableInteractionSource, g gVar) {
        super(2, gVar);
        this.f6811c = pressGestureScope;
        this.d = textFieldSelectionState;
        this.f6812f = j2;
        this.f6813g = mutableInteractionSource;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(this.f6811c, this.d, this.f6812f, this.f6813g, gVar);
        textFieldSelectionState$detectTextFieldTapGestures$2$1$1.f6810b = obj;
        return textFieldSelectionState$detectTextFieldTapGestures$2$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionState$detectTextFieldTapGestures$2$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f6809a;
        TextFieldSelectionState textFieldSelectionState = this.d;
        if (i2 == 0) {
            q.m(obj);
            kotlin.jvm.internal.e.v((d0) this.f6810b, null, 0, new AnonymousClass1(this.d, this.f6812f, this.f6813g, null), 3);
            this.f6809a = 1;
            obj = this.f6811c.y0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                textFieldSelectionState.f6732u = null;
                return b0.f30125a;
            }
            q.m(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PressInteraction.Press press = textFieldSelectionState.f6732u;
        if (press != null) {
            Interaction release = booleanValue ? new PressInteraction.Release(press) : new PressInteraction.Cancel(press);
            this.f6809a = 2;
            if (this.f6813g.a(release, this) == aVar) {
                return aVar;
            }
        }
        textFieldSelectionState.f6732u = null;
        return b0.f30125a;
    }
}
