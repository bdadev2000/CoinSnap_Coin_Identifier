package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import q0.l;
import q0.p;
import q0.q;

@e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6169a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f6171c;
    public final /* synthetic */ MutableState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ State f6173g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {TypeReference.INSTANCEOF}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements q {

        /* renamed from: a, reason: collision with root package name */
        public int f6174a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f6175b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f6176c;
        public final /* synthetic */ d0 d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableState f6177f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6178g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {Opcodes.V16, 64}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C00251 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public Object f6179a;

            /* renamed from: b, reason: collision with root package name */
            public int f6180b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MutableState f6181c;
            public final /* synthetic */ long d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MutableInteractionSource f6182f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00251(MutableState mutableState, long j2, MutableInteractionSource mutableInteractionSource, g gVar) {
                super(2, gVar);
                this.f6181c = mutableState;
                this.d = j2;
                this.f6182f = mutableInteractionSource;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00251(this.f6181c, this.d, this.f6182f, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00251) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    i0.a r0 = i0.a.f30806a
                    int r1 = r8.f6180b
                    androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.f6182f
                    r3 = 2
                    r4 = 1
                    androidx.compose.runtime.MutableState r5 = r8.f6181c
                    if (r1 == 0) goto L28
                    if (r1 == r4) goto L20
                    if (r1 != r3) goto L18
                    java.lang.Object r0 = r8.f6179a
                    androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                    kotlin.jvm.internal.q.m(r9)
                    goto L5f
                L18:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L20:
                    java.lang.Object r1 = r8.f6179a
                    androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                    kotlin.jvm.internal.q.m(r9)
                    goto L46
                L28:
                    kotlin.jvm.internal.q.m(r9)
                    java.lang.Object r9 = r5.getValue()
                    androidx.compose.foundation.interaction.PressInteraction$Press r9 = (androidx.compose.foundation.interaction.PressInteraction.Press) r9
                    if (r9 == 0) goto L4a
                    androidx.compose.foundation.interaction.PressInteraction$Cancel r1 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                    r1.<init>(r9)
                    if (r2 == 0) goto L45
                    r8.f6179a = r5
                    r8.f6180b = r4
                    java.lang.Object r9 = r2.a(r1, r8)
                    if (r9 != r0) goto L45
                    return r0
                L45:
                    r1 = r5
                L46:
                    r9 = 0
                    r1.setValue(r9)
                L4a:
                    androidx.compose.foundation.interaction.PressInteraction$Press r9 = new androidx.compose.foundation.interaction.PressInteraction$Press
                    long r6 = r8.d
                    r9.<init>(r6)
                    if (r2 == 0) goto L60
                    r8.f6179a = r9
                    r8.f6180b = r3
                    java.lang.Object r1 = r2.a(r9, r8)
                    if (r1 != r0) goto L5e
                    return r0
                L5e:
                    r0 = r9
                L5f:
                    r9 = r0
                L60:
                    r5.setValue(r9)
                    d0.b0 r9 = d0.b0.f30125a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.AnonymousClass1.C00251.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass2 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public MutableState f6183a;

            /* renamed from: b, reason: collision with root package name */
            public int f6184b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MutableState f6185c;
            public final /* synthetic */ boolean d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MutableInteractionSource f6186f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MutableState mutableState, boolean z2, MutableInteractionSource mutableInteractionSource, g gVar) {
                super(2, gVar);
                this.f6185c = mutableState;
                this.d = z2;
                this.f6186f = mutableInteractionSource;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass2(this.f6185c, this.d, this.f6186f, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                MutableState mutableState2;
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f6184b;
                if (i2 == 0) {
                    kotlin.jvm.internal.q.m(obj);
                    mutableState = this.f6185c;
                    PressInteraction.Press press = (PressInteraction.Press) mutableState.getValue();
                    if (press != null) {
                        Interaction release = this.d ? new PressInteraction.Release(press) : new PressInteraction.Cancel(press);
                        MutableInteractionSource mutableInteractionSource = this.f6186f;
                        if (mutableInteractionSource != null) {
                            this.f6183a = mutableState;
                            this.f6184b = 1;
                            if (mutableInteractionSource.a(release, this) == aVar) {
                                return aVar;
                            }
                            mutableState2 = mutableState;
                        }
                        mutableState.setValue(null);
                    }
                    return b0.f30125a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState2 = this.f6183a;
                kotlin.jvm.internal.q.m(obj);
                mutableState = mutableState2;
                mutableState.setValue(null);
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, MutableState mutableState, MutableInteractionSource mutableInteractionSource, g gVar) {
            super(3, gVar);
            this.d = d0Var;
            this.f6177f = mutableState;
            this.f6178g = mutableInteractionSource;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j2 = ((Offset) obj2).f14913a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.f6177f, this.f6178g, (g) obj3);
            anonymousClass1.f6175b = (PressGestureScope) obj;
            anonymousClass1.f6176c = j2;
            return anonymousClass1.invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6174a;
            d0 d0Var = this.d;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                PressGestureScope pressGestureScope = this.f6175b;
                kotlin.jvm.internal.e.v(d0Var, null, 0, new C00251(this.f6177f, this.f6176c, this.f6178g, null), 3);
                this.f6174a = 1;
                obj = pressGestureScope.y0(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.q.m(obj);
            }
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(this.f6177f, ((Boolean) obj).booleanValue(), this.f6178g, null), 3);
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State f6187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(State state) {
            super(1);
            this.f6187a = state;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((l) this.f6187a.getValue()).invoke(new Offset(((Offset) obj).f14913a));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(d0 d0Var, MutableState mutableState, MutableInteractionSource mutableInteractionSource, State state, g gVar) {
        super(2, gVar);
        this.f6171c = d0Var;
        this.d = mutableState;
        this.f6172f = mutableInteractionSource;
        this.f6173g = state;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(this.f6171c, this.d, this.f6172f, this.f6173g, gVar);
        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.f6170b = obj;
        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6169a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f6170b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6171c, this.d, this.f6172f, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f6173g);
            this.f6169a = 1;
            if (TapGestureDetectorKt.d(pointerInputScope, anonymousClass1, anonymousClass2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
