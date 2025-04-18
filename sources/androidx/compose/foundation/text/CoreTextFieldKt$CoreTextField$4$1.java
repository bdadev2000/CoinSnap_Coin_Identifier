package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CoreTextFieldKt$CoreTextField$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputService f5805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5806c;
    public final /* synthetic */ ImeOptions d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$4$1(LegacyTextFieldState legacyTextFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions) {
        super(1);
        this.f5804a = legacyTextFieldState;
        this.f5805b = textInputService;
        this.f5806c = textFieldValue;
        this.d = imeOptions;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        LegacyTextFieldState legacyTextFieldState = this.f5804a;
        if (legacyTextFieldState.b()) {
            l lVar = legacyTextFieldState.f6038t;
            l lVar2 = legacyTextFieldState.f6039u;
            ?? obj2 = new Object();
            TextFieldDelegate$Companion$restartInput$1 textFieldDelegate$Companion$restartInput$1 = new TextFieldDelegate$Companion$restartInput$1(legacyTextFieldState.d, lVar, obj2);
            TextInputService textInputService = this.f5805b;
            PlatformTextInputService platformTextInputService = textInputService.f17366a;
            platformTextInputService.f(this.f5806c, this.d, textFieldDelegate$Companion$restartInput$1, lVar2);
            TextInputSession textInputSession = new TextInputSession(textInputService, platformTextInputService);
            textInputService.f17367b.set(textInputSession);
            obj2.f30930a = textInputSession;
            legacyTextFieldState.e = textInputSession;
        }
        return new Object();
    }
}
