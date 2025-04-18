package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import b1.d0;
import d0.b0;
import e1.j;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {357}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CoreTextFieldKt$CoreTextField$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f5796c;
    public final /* synthetic */ TextInputService d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f5798g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ State f5799a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State state) {
            super(0);
            this.f5799a = state;
        }

        @Override // q0.a
        public final Object invoke() {
            return Boolean.valueOf(((Boolean) this.f5799a.getValue()).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$2$1(LegacyTextFieldState legacyTextFieldState, State state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, g gVar) {
        super(2, gVar);
        this.f5795b = legacyTextFieldState;
        this.f5796c = state;
        this.d = textInputService;
        this.f5797f = textFieldSelectionManager;
        this.f5798g = imeOptions;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CoreTextFieldKt$CoreTextField$2$1(this.f5795b, this.f5796c, this.d, this.f5797f, this.f5798g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5794a;
        final LegacyTextFieldState legacyTextFieldState = this.f5795b;
        try {
            if (i2 == 0) {
                q.m(obj);
                j l2 = SnapshotStateKt.l(new AnonymousClass1(this.f5796c));
                final TextInputService textInputService = this.d;
                final TextFieldSelectionManager textFieldSelectionManager = this.f5797f;
                final ImeOptions imeOptions = this.f5798g;
                e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1.2
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                        if (booleanValue && legacyTextFieldState2.b()) {
                            TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                            TextFieldValue l3 = textFieldSelectionManager2.l();
                            OffsetMapping offsetMapping = textFieldSelectionManager2.f7301b;
                            l lVar = legacyTextFieldState2.f6038t;
                            l lVar2 = legacyTextFieldState2.f6039u;
                            ?? obj3 = new Object();
                            TextFieldDelegate$Companion$restartInput$1 textFieldDelegate$Companion$restartInput$1 = new TextFieldDelegate$Companion$restartInput$1(legacyTextFieldState2.d, lVar, obj3);
                            TextInputService textInputService2 = textInputService;
                            PlatformTextInputService platformTextInputService = textInputService2.f17366a;
                            platformTextInputService.f(l3, imeOptions, textFieldDelegate$Companion$restartInput$1, lVar2);
                            TextInputSession textInputSession = new TextInputSession(textInputService2, platformTextInputService);
                            textInputService2.f17367b.set(textInputSession);
                            obj3.f30930a = textInputSession;
                            legacyTextFieldState2.e = textInputSession;
                            CoreTextFieldKt.f(legacyTextFieldState2, l3, offsetMapping);
                        } else {
                            CoreTextFieldKt.e(legacyTextFieldState2);
                        }
                        return b0.f30125a;
                    }
                };
                this.f5794a = 1;
                if (l2.collect(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            CoreTextFieldKt.e(legacyTextFieldState);
            return b0.f30125a;
        } catch (Throwable th) {
            CoreTextFieldKt.e(legacyTextFieldState);
            throw th;
        }
    }
}
