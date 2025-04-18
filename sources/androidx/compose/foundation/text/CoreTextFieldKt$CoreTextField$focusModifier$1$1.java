package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5880c;
    public final /* synthetic */ TextInputService d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f5882g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5883h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5884i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f5885j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequester f5886k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1(LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, d0 d0Var, BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.f5878a = legacyTextFieldState;
        this.f5879b = z2;
        this.f5880c = z3;
        this.d = textInputService;
        this.f5881f = textFieldValue;
        this.f5882g = imeOptions;
        this.f5883h = offsetMapping;
        this.f5884i = textFieldSelectionManager;
        this.f5885j = d0Var;
        this.f5886k = bringIntoViewRequester;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        TextLayoutResultProxy d;
        FocusState focusState = (FocusState) obj;
        LegacyTextFieldState legacyTextFieldState = this.f5878a;
        if (legacyTextFieldState.b() != focusState.a()) {
            legacyTextFieldState.f6024f.setValue(Boolean.valueOf(focusState.a()));
            if (legacyTextFieldState.b() && this.f5879b && !this.f5880c) {
                l lVar = legacyTextFieldState.f6038t;
                l lVar2 = legacyTextFieldState.f6039u;
                ?? obj2 = new Object();
                TextFieldDelegate$Companion$restartInput$1 textFieldDelegate$Companion$restartInput$1 = new TextFieldDelegate$Companion$restartInput$1(legacyTextFieldState.d, lVar, obj2);
                TextInputService textInputService = this.d;
                PlatformTextInputService platformTextInputService = textInputService.f17366a;
                TextFieldValue textFieldValue = this.f5881f;
                platformTextInputService.f(textFieldValue, this.f5882g, textFieldDelegate$Companion$restartInput$1, lVar2);
                TextInputSession textInputSession = new TextInputSession(textInputService, platformTextInputService);
                textInputService.f17367b.set(textInputSession);
                obj2.f30930a = textInputSession;
                legacyTextFieldState.e = textInputSession;
                CoreTextFieldKt.f(legacyTextFieldState, textFieldValue, this.f5883h);
            } else {
                CoreTextFieldKt.e(legacyTextFieldState);
            }
            if (focusState.a() && (d = legacyTextFieldState.d()) != null) {
                e.v(this.f5885j, null, 0, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.f5886k, this.f5881f, this.f5878a, d, this.f5883h, null), 3);
            }
            if (!focusState.a()) {
                this.f5884i.g(null);
            }
        }
        return b0.f30125a;
    }
}
