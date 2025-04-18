package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import b1.f0;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformedText f5904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5906c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f5908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5909h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5910i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5911j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f5912k;

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LegacyTextFieldState legacyTextFieldState) {
            super(1);
            this.f5913a = legacyTextFieldState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            boolean z2;
            List list = (List) obj;
            LegacyTextFieldState legacyTextFieldState = this.f5913a;
            if (legacyTextFieldState.d() != null) {
                TextLayoutResultProxy d = legacyTextFieldState.d();
                p0.a.p(d);
                list.add(d.f6210a);
                z2 = true;
            } else {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$10, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass10 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.f5914a = textFieldSelectionManager;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f5914a.n();
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5915a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SemanticsPropertyReceiver f5916b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LegacyTextFieldState legacyTextFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            super(1);
            this.f5915a = legacyTextFieldState;
            this.f5916b = semanticsPropertyReceiver;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q0.l
        public final Object invoke(Object obj) {
            AnnotatedString annotatedString = (AnnotatedString) obj;
            LegacyTextFieldState legacyTextFieldState = this.f5915a;
            TextInputSession textInputSession = legacyTextFieldState.e;
            l lVar = legacyTextFieldState.f6038t;
            b0 b0Var = null;
            if (textInputSession != null) {
                TextFieldValue a2 = legacyTextFieldState.d.a(f0.v(new Object(), new CommitTextCommand(annotatedString, 1)));
                if (p0.a.g((TextInputSession) textInputSession.f17390a.f17367b.get(), textInputSession)) {
                    textInputSession.f17391b.d(null, a2);
                }
                ((LegacyTextFieldState$onValueChange$1) lVar).invoke(a2);
                b0Var = b0.f30125a;
            }
            if (b0Var == null) {
                String str = annotatedString.f16880a;
                int length = str.length();
                ((LegacyTextFieldState$onValueChange$1) lVar).invoke(new TextFieldValue(str, TextRangeKt.a(length, length), 4));
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f5917a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f5918b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5919c;
        public final /* synthetic */ SemanticsPropertyReceiver d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5920f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z2, boolean z3, LegacyTextFieldState legacyTextFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver, TextFieldValue textFieldValue) {
            super(1);
            this.f5917a = z2;
            this.f5918b = z3;
            this.f5919c = legacyTextFieldState;
            this.d = semanticsPropertyReceiver;
            this.f5920f = textFieldValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q0.l
        public final Object invoke(Object obj) {
            AnnotatedString annotatedString = (AnnotatedString) obj;
            if (this.f5917a || !this.f5918b) {
                return Boolean.FALSE;
            }
            LegacyTextFieldState legacyTextFieldState = this.f5919c;
            TextInputSession textInputSession = legacyTextFieldState.e;
            l lVar = legacyTextFieldState.f6038t;
            b0 b0Var = null;
            if (textInputSession != null) {
                TextFieldValue a2 = legacyTextFieldState.d.a(f0.v(new Object(), new CommitTextCommand(annotatedString, 1)));
                if (p0.a.g((TextInputSession) textInputSession.f17390a.f17367b.get(), textInputSession)) {
                    textInputSession.f17391b.d(null, a2);
                }
                ((LegacyTextFieldState$onValueChange$1) lVar).invoke(a2);
                b0Var = b0.f30125a;
            }
            if (b0Var == null) {
                TextFieldValue textFieldValue = this.f5920f;
                String str = textFieldValue.f17361a.f16880a;
                int i2 = TextRange.f17057c;
                long j2 = textFieldValue.f17362b;
                int i3 = (int) (j2 >> 32);
                int i4 = (int) (j2 & 4294967295L);
                p0.a.s(str, "<this>");
                p0.a.s(annotatedString, "replacement");
                if (i4 < i3) {
                    throw new IndexOutOfBoundsException(d.l("End index (", i4, ") is less than start index (", i3, ")."));
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i3);
                sb.append((CharSequence) annotatedString);
                sb.append((CharSequence) str, i4, str.length());
                String obj2 = sb.toString();
                int length = annotatedString.f16880a.length() + i3;
                ((LegacyTextFieldState$onValueChange$1) lVar).invoke(new TextFieldValue(obj2, TextRangeKt.a(length, length), 4));
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass4 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5921a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f5922b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5923c;
        public final /* synthetic */ TextFieldSelectionManager d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5924f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OffsetMapping offsetMapping, boolean z2, TextFieldValue textFieldValue, TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState) {
            super(3);
            this.f5921a = offsetMapping;
            this.f5922b = z2;
            this.f5923c = textFieldValue;
            this.d = textFieldSelectionManager;
            this.f5924f = legacyTextFieldState;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            OffsetMapping offsetMapping = this.f5921a;
            if (!booleanValue) {
                intValue = offsetMapping.a(intValue);
            }
            if (!booleanValue) {
                intValue2 = offsetMapping.a(intValue2);
            }
            boolean z2 = false;
            if (this.f5922b) {
                TextFieldValue textFieldValue = this.f5923c;
                long j2 = textFieldValue.f17362b;
                int i2 = TextRange.f17057c;
                if (intValue != ((int) (j2 >> 32)) || intValue2 != ((int) (j2 & 4294967295L))) {
                    int min = Math.min(intValue, intValue2);
                    HandleState handleState = HandleState.f5967a;
                    TextFieldSelectionManager textFieldSelectionManager = this.d;
                    if (min >= 0) {
                        int max = Math.max(intValue, intValue2);
                        AnnotatedString annotatedString = textFieldValue.f17361a;
                        if (max <= annotatedString.f16880a.length()) {
                            if (booleanValue || intValue == intValue2) {
                                textFieldSelectionManager.t(false);
                                textFieldSelectionManager.r(handleState);
                            } else {
                                textFieldSelectionManager.h(true);
                            }
                            ((LegacyTextFieldState$onValueChange$1) this.f5924f.f6038t).invoke(new TextFieldValue(annotatedString, TextRangeKt.a(intValue, intValue2), (TextRange) null));
                            z2 = true;
                        }
                    }
                    textFieldSelectionManager.t(false);
                    textFieldSelectionManager.r(handleState);
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass5 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5925a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImeOptions f5926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LegacyTextFieldState legacyTextFieldState, ImeOptions imeOptions) {
            super(0);
            this.f5925a = legacyTextFieldState;
            this.f5926b = imeOptions;
        }

        @Override // q0.a
        public final Object invoke() {
            ((LegacyTextFieldState$onImeActionPerformed$1) this.f5925a.f6039u).invoke(new ImeAction(this.f5926b.e));
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$6, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass6 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5927a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f5928b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f5929c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z2) {
            super(0);
            this.f5927a = legacyTextFieldState;
            this.f5928b = focusRequester;
            this.f5929c = z2;
        }

        @Override // q0.a
        public final Object invoke() {
            SoftwareKeyboardController softwareKeyboardController;
            boolean z2 = !this.f5929c;
            LegacyTextFieldState legacyTextFieldState = this.f5927a;
            if (!legacyTextFieldState.b()) {
                this.f5928b.b();
            } else if (z2 && (softwareKeyboardController = legacyTextFieldState.f6023c) != null) {
                softwareKeyboardController.show();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$7, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass7 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.f5930a = textFieldSelectionManager;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f5930a.h(true);
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$8, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass8 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5931a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.f5931a = textFieldSelectionManager;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f5931a.d(true);
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1$9, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass9 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5932a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.f5932a = textFieldSelectionManager;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f5932a.f();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1$1(TransformedText transformedText, TextFieldValue textFieldValue, boolean z2, boolean z3, boolean z4, ImeOptions imeOptions, LegacyTextFieldState legacyTextFieldState, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.f5904a = transformedText;
        this.f5905b = textFieldValue;
        this.f5906c = z2;
        this.d = z3;
        this.f5907f = z4;
        this.f5908g = imeOptions;
        this.f5909h = legacyTextFieldState;
        this.f5910i = offsetMapping;
        this.f5911j = textFieldSelectionManager;
        this.f5912k = focusRequester;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        AnnotatedString annotatedString = this.f5904a.f17392a;
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16852y;
        n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
        n nVar = nVarArr2[16];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, annotatedString);
        TextFieldValue textFieldValue = this.f5905b;
        long j2 = textFieldValue.f17362b;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16853z;
        n nVar2 = nVarArr2[17];
        TextRange textRange = new TextRange(j2);
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, textRange);
        boolean z2 = this.f5906c;
        if (!z2) {
            SemanticsPropertiesKt.e(semanticsPropertyReceiver);
        }
        b0 b0Var = b0.f30125a;
        boolean z3 = this.d;
        if (z3) {
            semanticsPropertyReceiver.b(SemanticsProperties.D, b0Var);
        }
        boolean z4 = this.f5907f;
        boolean z5 = z2 && !z4;
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.G;
        n nVar3 = nVarArr2[23];
        Boolean valueOf = Boolean.valueOf(z5);
        semanticsPropertyKey3.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey3, valueOf);
        LegacyTextFieldState legacyTextFieldState = this.f5909h;
        SemanticsPropertiesKt.g(semanticsPropertyReceiver, new AnonymousClass1(legacyTextFieldState));
        if (z5) {
            semanticsPropertyReceiver.b(SemanticsActions.f16799i, new AccessibilityAction(null, new AnonymousClass2(legacyTextFieldState, semanticsPropertyReceiver)));
            semanticsPropertyReceiver.b(SemanticsActions.f16803m, new AccessibilityAction(null, new AnonymousClass3(this.f5907f, this.f5906c, this.f5909h, semanticsPropertyReceiver, this.f5905b)));
        }
        semanticsPropertyReceiver.b(SemanticsActions.f16798h, new AccessibilityAction(null, new AnonymousClass4(this.f5910i, this.f5906c, this.f5905b, this.f5911j, this.f5909h)));
        ImeOptions imeOptions = this.f5908g;
        SemanticsPropertiesKt.i(semanticsPropertyReceiver, imeOptions.e, new AnonymousClass5(legacyTextFieldState, imeOptions));
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, new AnonymousClass6(legacyTextFieldState, this.f5912k, z4));
        TextFieldSelectionManager textFieldSelectionManager = this.f5911j;
        SemanticsPropertiesKt.j(semanticsPropertyReceiver, null, new AnonymousClass7(textFieldSelectionManager));
        if (!TextRange.c(textFieldValue.f17362b) && !z3) {
            SemanticsPropertiesKt.c(semanticsPropertyReceiver, new AnonymousClass8(textFieldSelectionManager));
            if (z2 && !z4) {
                SemanticsPropertiesKt.d(semanticsPropertyReceiver, new AnonymousClass9(textFieldSelectionManager));
            }
        }
        if (z2 && !z4) {
            semanticsPropertyReceiver.b(SemanticsActions.f16807q, new AccessibilityAction(null, new AnonymousClass10(textFieldSelectionManager)));
        }
        return b0Var;
    }
}
