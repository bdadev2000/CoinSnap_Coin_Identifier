package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import b1.a2;
import b1.d0;
import d0.b0;
import e1.l0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import z0.m;

@j0.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {Opcodes.LOR}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6342a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f6344c;
    public final /* synthetic */ TransformedTextFieldState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f6345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ComposeInputMethodManager f6346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputSession f6347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f6348i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ReceiveContentConfiguration f6349j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f6350k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f6351l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {Opcodes.BASTORE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6352a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TransformedTextFieldState f6353b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComposeInputMethodManager f6354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, g gVar) {
            super(2, gVar);
            this.f6353b = transformedTextFieldState;
            this.f6354c = composeInputMethodManager;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f6353b, this.f6354c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            return i0.a.f30806a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.foundation.text.input.internal.b] */
        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6352a;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                throw new RuntimeException();
            }
            q.m(obj);
            final ComposeInputMethodManager composeInputMethodManager = this.f6354c;
            ?? r4 = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.b
                @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                public final void a(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
                    long j2 = textFieldCharSequence.f6298b;
                    ComposeInputMethodManager composeInputMethodManager2 = ComposeInputMethodManager.this;
                    TextRange textRange = textFieldCharSequence.f6299c;
                    if (z2 && textRange != null && !m.O0(textFieldCharSequence.f6297a, textFieldCharSequence2)) {
                        composeInputMethodManager2.b();
                        return;
                    }
                    long j3 = textFieldCharSequence2.f6298b;
                    boolean b2 = TextRange.b(j2, j3);
                    TextRange textRange2 = textFieldCharSequence2.f6299c;
                    if (b2 && p0.a.g(textRange, textRange2)) {
                        return;
                    }
                    composeInputMethodManager2.a(TextRange.f(j3), TextRange.e(j3), textRange2 != null ? TextRange.f(textRange2.f17058a) : -1, textRange2 != null ? TextRange.e(textRange2.f17058a) : -1);
                }
            };
            this.f6352a = 1;
            this.f6353b.b(r4, this);
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, PlatformTextInputSession platformTextInputSession, ViewConfiguration viewConfiguration, ImeOptions imeOptions, g gVar, l lVar, l0 l0Var) {
        super(2, gVar);
        this.f6344c = l0Var;
        this.d = transformedTextFieldState;
        this.f6345f = textLayoutState;
        this.f6346g = composeInputMethodManager;
        this.f6347h = platformTextInputSession;
        this.f6348i = imeOptions;
        this.f6349j = receiveContentConfiguration;
        this.f6350k = lVar;
        this.f6351l = viewConfiguration;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        l0 l0Var = this.f6344c;
        TransformedTextFieldState transformedTextFieldState = this.d;
        TextLayoutState textLayoutState = this.f6345f;
        ComposeInputMethodManager composeInputMethodManager = this.f6346g;
        PlatformTextInputSession platformTextInputSession = this.f6347h;
        ImeOptions imeOptions = this.f6348i;
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.f6349j, composeInputMethodManager, textLayoutState, transformedTextFieldState, platformTextInputSession, this.f6351l, imeOptions, gVar, this.f6350k, l0Var);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.f6343b = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6342a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            throw new RuntimeException();
        }
        q.m(obj);
        d0 d0Var = (d0) this.f6343b;
        TransformedTextFieldState transformedTextFieldState = this.d;
        ComposeInputMethodManager composeInputMethodManager = this.f6346g;
        kotlin.jvm.internal.e.v(d0Var, null, 4, new AnonymousClass1(transformedTextFieldState, composeInputMethodManager, null), 1);
        l0 l0Var = this.f6344c;
        if (l0Var != null) {
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(l0Var, composeInputMethodManager, null), 3);
        }
        final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(transformedTextFieldState, this.f6345f, composeInputMethodManager, d0Var);
        final TransformedTextFieldState transformedTextFieldState2 = this.d;
        final ImeOptions imeOptions = this.f6348i;
        final ReceiveContentConfiguration receiveContentConfiguration = this.f6349j;
        final ComposeInputMethodManager composeInputMethodManager2 = this.f6346g;
        final l lVar = this.f6350k;
        final TextLayoutState textLayoutState = this.f6345f;
        final ViewConfiguration viewConfiguration = this.f6351l;
        PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.a
            /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1] */
            @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
            public final InputConnection a(EditorInfo editorInfo) {
                final TransformedTextFieldState transformedTextFieldState3 = TransformedTextFieldState.this;
                ImeOptions imeOptions2 = imeOptions;
                final ReceiveContentConfiguration receiveContentConfiguration2 = receiveContentConfiguration;
                final ComposeInputMethodManager composeInputMethodManager3 = composeInputMethodManager2;
                final l lVar2 = lVar;
                final CursorAnchorInfoController cursorAnchorInfoController2 = cursorAnchorInfoController;
                final TextLayoutState textLayoutState2 = textLayoutState;
                final ViewConfiguration viewConfiguration2 = viewConfiguration;
                ?? r11 = new TextInputSession() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1
                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final TextFieldCharSequence a() {
                        return TransformedTextFieldState.this.d();
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final void b(int i3) {
                        l lVar3 = lVar2;
                        if (lVar3 != null) {
                            lVar3.invoke(new ImeAction(i3));
                        }
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final int c(HandwritingGesture handwritingGesture) {
                        if (Build.VERSION.SDK_INT < 34) {
                            return 2;
                        }
                        return HandwritingGestureApi34.f6408a.k(TransformedTextFieldState.this, handwritingGesture, textLayoutState2, viewConfiguration2);
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final boolean d(TransferableContent transferableContent) {
                        if (receiveContentConfiguration2 != null) {
                            return !p0.a.g(r0.a().e(transferableContent), transferableContent);
                        }
                        return false;
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final void e(l lVar3) {
                        TransformedTextFieldState transformedTextFieldState4 = TransformedTextFieldState.this;
                        TextFieldState textFieldState = transformedTextFieldState4.f6651a;
                        InputTransformation inputTransformation = transformedTextFieldState4.f6652b;
                        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
                        textFieldState.f6307b.f6400b.b();
                        ((StatelessInputConnection$endBatchEditInternal$1) lVar3).invoke(textFieldState.f6307b);
                        TextFieldState.a(textFieldState, inputTransformation, false, textFieldEditUndoBehavior);
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            return HandwritingGestureApi34.f6408a.C(TransformedTextFieldState.this, previewableHandwritingGesture, textLayoutState2, cancellationSignal);
                        }
                        return false;
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final void requestCursorUpdates(int i3) {
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        CursorAnchorInfo a2;
                        CursorAnchorInfoController cursorAnchorInfoController3 = cursorAnchorInfoController2;
                        cursorAnchorInfoController3.getClass();
                        boolean z5 = false;
                        boolean z6 = (i3 & 1) != 0;
                        boolean z7 = (i3 & 2) != 0;
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 33) {
                            z2 = (i3 & 16) != 0;
                            z3 = (i3 & 8) != 0;
                            boolean z8 = (i3 & 4) != 0;
                            if (i4 >= 34 && (i3 & 32) != 0) {
                                z5 = true;
                            }
                            if (z2 || z3 || z8 || z5) {
                                z4 = z5;
                                z5 = z8;
                            } else if (i4 >= 34) {
                                z4 = true;
                                z5 = true;
                                z2 = true;
                                z3 = true;
                            } else {
                                z2 = true;
                                z3 = true;
                                z4 = z5;
                                z5 = true;
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                            z4 = false;
                        }
                        cursorAnchorInfoController3.f6381f = z2;
                        cursorAnchorInfoController3.f6382g = z3;
                        cursorAnchorInfoController3.f6383h = z5;
                        cursorAnchorInfoController3.f6384i = z4;
                        if (z6 && (a2 = cursorAnchorInfoController3.a()) != null) {
                            cursorAnchorInfoController3.f6380c.c(a2);
                        }
                        if (!z7) {
                            a2 a2Var = cursorAnchorInfoController3.e;
                            if (a2Var != null) {
                                a2Var.a(null);
                            }
                            cursorAnchorInfoController3.e = null;
                            return;
                        }
                        a2 a2Var2 = cursorAnchorInfoController3.e;
                        if (a2Var2 == null || !a2Var2.isActive()) {
                            cursorAnchorInfoController3.e = kotlin.jvm.internal.e.v(cursorAnchorInfoController3.d, null, 4, new CursorAnchorInfoController$startOrStopMonitoring$1(cursorAnchorInfoController3, null), 1);
                        }
                    }

                    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                    public final void sendKeyEvent(KeyEvent keyEvent) {
                        composeInputMethodManager3.sendKeyEvent(keyEvent);
                    }
                };
                EditorInfo_androidKt.a(editorInfo, transformedTextFieldState3.d(), transformedTextFieldState3.d().f6298b, imeOptions2, receiveContentConfiguration2 != null ? AndroidTextInputSession_androidKt.f6337a : null);
                return new StatelessInputConnection(r11, editorInfo);
            }
        };
        this.f6342a = 1;
        this.f6347h.a(platformTextInputMethodRequest, this);
        return aVar;
    }
}
