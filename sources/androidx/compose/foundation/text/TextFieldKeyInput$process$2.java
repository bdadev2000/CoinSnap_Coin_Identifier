package androidx.compose.foundation.text;

import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import b1.f0;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldKeyInput$process$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyCommand f6144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldKeyInput f6145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f6146c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f6147a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            TextPreparedSelectionState textPreparedSelectionState = textFieldPreparedSelection.e;
            textPreparedSelectionState.f7357a = null;
            if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                if (textFieldPreparedSelection.e()) {
                    textPreparedSelectionState.f7357a = null;
                    if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                        String str = textFieldPreparedSelection.f7049g.f16880a;
                        long j2 = textFieldPreparedSelection.f7048f;
                        int i2 = TextRange.f17057c;
                        int b2 = StringHelpers_androidKt.b((int) (j2 & 4294967295L), str);
                        if (b2 != -1) {
                            textFieldPreparedSelection.l(b2, b2);
                        }
                    }
                } else {
                    textPreparedSelectionState.f7357a = null;
                    if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                        String str2 = textFieldPreparedSelection.f7049g.f16880a;
                        long j3 = textFieldPreparedSelection.f7048f;
                        int i3 = TextRange.f17057c;
                        int a2 = StringHelpers_androidKt.a((int) (j3 & 4294967295L), str2);
                        if (a2 != -1) {
                            textFieldPreparedSelection.l(a2, a2);
                        }
                    }
                }
            }
            return d0.b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f6148a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            TextPreparedSelectionState textPreparedSelectionState = textFieldPreparedSelection.e;
            textPreparedSelectionState.f7357a = null;
            if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                if (textFieldPreparedSelection.e()) {
                    textPreparedSelectionState.f7357a = null;
                    if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                        String str = textFieldPreparedSelection.f7049g.f16880a;
                        long j2 = textFieldPreparedSelection.f7048f;
                        int i2 = TextRange.f17057c;
                        int a2 = StringHelpers_androidKt.a((int) (j2 & 4294967295L), str);
                        if (a2 != -1) {
                            textFieldPreparedSelection.l(a2, a2);
                        }
                    }
                } else {
                    textPreparedSelectionState.f7357a = null;
                    if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                        String str2 = textFieldPreparedSelection.f7049g.f16880a;
                        long j3 = textFieldPreparedSelection.f7048f;
                        int i3 = TextRange.f17057c;
                        int b2 = StringHelpers_androidKt.b((int) (j3 & 4294967295L), str2);
                        if (b2 != -1) {
                            textFieldPreparedSelection.l(b2, b2);
                        }
                    }
                }
            }
            return d0.b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass3 f6149a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            long j2 = textFieldPreparedSelection.f7048f;
            int i2 = TextRange.f17057c;
            return new DeleteSurroundingTextCommand(((int) (j2 & 4294967295L)) - StringHelpers_androidKt.b((int) (j2 & 4294967295L), textFieldPreparedSelection.f7049g.f16880a), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass4 f6150a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            String str = textFieldPreparedSelection.f7049g.f16880a;
            long j2 = textFieldPreparedSelection.f7048f;
            int i2 = TextRange.f17057c;
            int a2 = StringHelpers_androidKt.a((int) (j2 & 4294967295L), str);
            if (a2 != -1) {
                return new DeleteSurroundingTextCommand(0, a2 - ((int) (textFieldPreparedSelection.f7048f & 4294967295L)));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass5 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass5 f6151a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            Integer d = textFieldPreparedSelection.d();
            if (d == null) {
                return null;
            }
            int intValue = d.intValue();
            long j2 = textFieldPreparedSelection.f7048f;
            int i2 = TextRange.f17057c;
            return new DeleteSurroundingTextCommand(((int) (j2 & 4294967295L)) - intValue, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass6 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass6 f6152a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            Integer c2 = textFieldPreparedSelection.c();
            if (c2 == null) {
                return null;
            }
            int intValue = c2.intValue();
            long j2 = textFieldPreparedSelection.f7048f;
            int i2 = TextRange.f17057c;
            return new DeleteSurroundingTextCommand(0, intValue - ((int) (j2 & 4294967295L)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$7, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass7 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass7 f6153a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            Integer b2 = textFieldPreparedSelection.b();
            if (b2 == null) {
                return null;
            }
            int intValue = b2.intValue();
            long j2 = textFieldPreparedSelection.f7048f;
            int i2 = TextRange.f17057c;
            return new DeleteSurroundingTextCommand(((int) (j2 & 4294967295L)) - intValue, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$8, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass8 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass8 f6154a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
            Integer a2 = textFieldPreparedSelection.a();
            if (a2 == null) {
                return null;
            }
            int intValue = a2.intValue();
            long j2 = textFieldPreparedSelection.f7048f;
            int i2 = TextRange.f17057c;
            return new DeleteSurroundingTextCommand(0, intValue - ((int) (j2 & 4294967295L)));
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[16] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[17] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[18] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[6] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[7] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[8] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[9] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[14] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[15] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[43] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[44] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[25] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[26] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[27] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[34] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[35] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[37] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[36] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[38] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[39] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[40] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[41] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[28] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[29] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[30] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[31] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[32] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[33] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[42] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[45] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[46] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[47] = 48;
            } catch (NoSuchFieldError unused48) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInput$process$2(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, b0 b0Var) {
        super(1);
        this.f6144a = keyCommand;
        this.f6145b = textFieldKeyInput;
        this.f6146c = b0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Integer d;
        Integer c2;
        Integer c3;
        Integer d2;
        TextLayoutResult textLayoutResult;
        TextLayoutResult textLayoutResult2;
        TextLayoutResultProxy textLayoutResultProxy;
        TextLayoutResultProxy textLayoutResultProxy2;
        TextLayoutResult textLayoutResult3;
        TextLayoutResult textLayoutResult4;
        TextLayoutResultProxy textLayoutResultProxy3;
        TextLayoutResultProxy textLayoutResultProxy4;
        Integer c4;
        Integer d3;
        Integer d4;
        Integer c5;
        UndoManager.Entry entry;
        TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
        int ordinal = this.f6144a.ordinal();
        TextFieldValue textFieldValue = null;
        TextFieldKeyInput textFieldKeyInput = this.f6145b;
        switch (ordinal) {
            case 0:
                AnonymousClass1 anonymousClass1 = AnonymousClass1.f6147a;
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (!TextRange.c(textFieldPreparedSelection.f7048f)) {
                        if (!textFieldPreparedSelection.e()) {
                            int e = TextRange.e(textFieldPreparedSelection.f7048f);
                            textFieldPreparedSelection.l(e, e);
                            break;
                        } else {
                            int f2 = TextRange.f(textFieldPreparedSelection.f7048f);
                            textFieldPreparedSelection.l(f2, f2);
                            break;
                        }
                    } else {
                        anonymousClass1.invoke(textFieldPreparedSelection);
                        break;
                    }
                }
                break;
            case 1:
                AnonymousClass2 anonymousClass2 = AnonymousClass2.f6148a;
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (!TextRange.c(textFieldPreparedSelection.f7048f)) {
                        if (!textFieldPreparedSelection.e()) {
                            int f3 = TextRange.f(textFieldPreparedSelection.f7048f);
                            textFieldPreparedSelection.l(f3, f3);
                            break;
                        } else {
                            int e2 = TextRange.e(textFieldPreparedSelection.f7048f);
                            textFieldPreparedSelection.l(e2, e2);
                            break;
                        }
                    } else {
                        anonymousClass2.invoke(textFieldPreparedSelection);
                        break;
                    }
                }
                break;
            case 2:
                TextPreparedSelectionState textPreparedSelectionState = textFieldPreparedSelection.e;
                textPreparedSelectionState.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (!textFieldPreparedSelection.e()) {
                        textPreparedSelectionState.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (d = textFieldPreparedSelection.d()) != null) {
                            int intValue = d.intValue();
                            textFieldPreparedSelection.l(intValue, intValue);
                            break;
                        }
                    } else {
                        textPreparedSelectionState.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (c2 = textFieldPreparedSelection.c()) != null) {
                            int intValue2 = c2.intValue();
                            textFieldPreparedSelection.l(intValue2, intValue2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                TextPreparedSelectionState textPreparedSelectionState2 = textFieldPreparedSelection.e;
                textPreparedSelectionState2.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (!textFieldPreparedSelection.e()) {
                        textPreparedSelectionState2.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (c3 = textFieldPreparedSelection.c()) != null) {
                            int intValue3 = c3.intValue();
                            textFieldPreparedSelection.l(intValue3, intValue3);
                            break;
                        }
                    } else {
                        textPreparedSelectionState2.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (d2 = textFieldPreparedSelection.d()) != null) {
                            int intValue4 = d2.intValue();
                            textFieldPreparedSelection.l(intValue4, intValue4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                textFieldPreparedSelection.g();
                break;
            case 5:
                textFieldPreparedSelection.h();
                break;
            case 6:
                textFieldPreparedSelection.j();
                break;
            case 7:
                textFieldPreparedSelection.i();
                break;
            case 8:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (!textFieldPreparedSelection.e()) {
                        textFieldPreparedSelection.i();
                        break;
                    } else {
                        textFieldPreparedSelection.j();
                        break;
                    }
                }
                break;
            case 9:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (!textFieldPreparedSelection.e()) {
                        textFieldPreparedSelection.j();
                        break;
                    } else {
                        textFieldPreparedSelection.i();
                        break;
                    }
                }
                break;
            case 10:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResult = textFieldPreparedSelection.f7047c) != null) {
                    int f4 = textFieldPreparedSelection.f(textLayoutResult, -1);
                    textFieldPreparedSelection.l(f4, f4);
                    break;
                }
                break;
            case 11:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResult2 = textFieldPreparedSelection.f7047c) != null) {
                    int f5 = textFieldPreparedSelection.f(textLayoutResult2, 1);
                    textFieldPreparedSelection.l(f5, f5);
                    break;
                }
                break;
            case 12:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResultProxy = textFieldPreparedSelection.f7299i) != null) {
                    int o2 = textFieldPreparedSelection.o(textLayoutResultProxy, -1);
                    textFieldPreparedSelection.l(o2, o2);
                    break;
                }
                break;
            case 13:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResultProxy2 = textFieldPreparedSelection.f7299i) != null) {
                    int o3 = textFieldPreparedSelection.o(textLayoutResultProxy2, 1);
                    textFieldPreparedSelection.l(o3, o3);
                    break;
                }
                break;
            case 14:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    textFieldPreparedSelection.l(0, 0);
                    break;
                }
                break;
            case 15:
                textFieldPreparedSelection.e.f7357a = null;
                AnnotatedString annotatedString = textFieldPreparedSelection.f7049g;
                if (annotatedString.f16880a.length() > 0) {
                    int length = annotatedString.f16880a.length();
                    textFieldPreparedSelection.l(length, length);
                    break;
                }
                break;
            case 16:
                textFieldKeyInput.f6135b.d(false);
                break;
            case 17:
                textFieldKeyInput.f6135b.n();
                break;
            case 18:
                textFieldKeyInput.f6135b.f();
                break;
            case 19:
                List n2 = textFieldPreparedSelection.n(AnonymousClass3.f6149a);
                if (n2 != null) {
                    textFieldKeyInput.a(n2);
                    break;
                }
                break;
            case 20:
                List n3 = textFieldPreparedSelection.n(AnonymousClass4.f6150a);
                if (n3 != null) {
                    textFieldKeyInput.a(n3);
                    break;
                }
                break;
            case 21:
                List n4 = textFieldPreparedSelection.n(AnonymousClass5.f6151a);
                if (n4 != null) {
                    textFieldKeyInput.a(n4);
                    break;
                }
                break;
            case 22:
                List n5 = textFieldPreparedSelection.n(AnonymousClass6.f6152a);
                if (n5 != null) {
                    textFieldKeyInput.a(n5);
                    break;
                }
                break;
            case 23:
                List n6 = textFieldPreparedSelection.n(AnonymousClass7.f6153a);
                if (n6 != null) {
                    textFieldKeyInput.a(n6);
                    break;
                }
                break;
            case 24:
                List n7 = textFieldPreparedSelection.n(AnonymousClass8.f6154a);
                if (n7 != null) {
                    textFieldKeyInput.a(n7);
                    break;
                }
                break;
            case 25:
                textFieldPreparedSelection.e.f7357a = null;
                AnnotatedString annotatedString2 = textFieldPreparedSelection.f7049g;
                if (annotatedString2.f16880a.length() > 0) {
                    textFieldPreparedSelection.l(0, annotatedString2.f16880a.length());
                    break;
                }
                break;
            case 26:
                TextPreparedSelectionState textPreparedSelectionState3 = textFieldPreparedSelection.e;
                textPreparedSelectionState3.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (textFieldPreparedSelection.e()) {
                        textPreparedSelectionState3.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                            String str = textFieldPreparedSelection.f7049g.f16880a;
                            long j2 = textFieldPreparedSelection.f7048f;
                            int i2 = TextRange.f17057c;
                            int b2 = StringHelpers_androidKt.b((int) (4294967295L & j2), str);
                            if (b2 != -1) {
                                textFieldPreparedSelection.l(b2, b2);
                            }
                        }
                    } else {
                        textPreparedSelectionState3.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                            String str2 = textFieldPreparedSelection.f7049g.f16880a;
                            long j3 = textFieldPreparedSelection.f7048f;
                            int i3 = TextRange.f17057c;
                            int a2 = StringHelpers_androidKt.a((int) (4294967295L & j3), str2);
                            if (a2 != -1) {
                                textFieldPreparedSelection.l(a2, a2);
                            }
                        }
                    }
                }
                textFieldPreparedSelection.k();
                break;
            case 27:
                TextPreparedSelectionState textPreparedSelectionState4 = textFieldPreparedSelection.e;
                textPreparedSelectionState4.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (textFieldPreparedSelection.e()) {
                        textPreparedSelectionState4.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                            String str3 = textFieldPreparedSelection.f7049g.f16880a;
                            long j4 = textFieldPreparedSelection.f7048f;
                            int i4 = TextRange.f17057c;
                            int a3 = StringHelpers_androidKt.a((int) (4294967295L & j4), str3);
                            if (a3 != -1) {
                                textFieldPreparedSelection.l(a3, a3);
                            }
                        }
                    } else {
                        textPreparedSelectionState4.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                            String str4 = textFieldPreparedSelection.f7049g.f16880a;
                            long j5 = textFieldPreparedSelection.f7048f;
                            int i5 = TextRange.f17057c;
                            int b3 = StringHelpers_androidKt.b((int) (4294967295L & j5), str4);
                            if (b3 != -1) {
                                textFieldPreparedSelection.l(b3, b3);
                            }
                        }
                    }
                }
                textFieldPreparedSelection.k();
                break;
            case 28:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResult3 = textFieldPreparedSelection.f7047c) != null) {
                    int f6 = textFieldPreparedSelection.f(textLayoutResult3, -1);
                    textFieldPreparedSelection.l(f6, f6);
                }
                textFieldPreparedSelection.k();
                break;
            case 29:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResult4 = textFieldPreparedSelection.f7047c) != null) {
                    int f7 = textFieldPreparedSelection.f(textLayoutResult4, 1);
                    textFieldPreparedSelection.l(f7, f7);
                }
                textFieldPreparedSelection.k();
                break;
            case 30:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResultProxy3 = textFieldPreparedSelection.f7299i) != null) {
                    int o4 = textFieldPreparedSelection.o(textLayoutResultProxy3, -1);
                    textFieldPreparedSelection.l(o4, o4);
                }
                textFieldPreparedSelection.k();
                break;
            case 31:
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (textLayoutResultProxy4 = textFieldPreparedSelection.f7299i) != null) {
                    int o5 = textFieldPreparedSelection.o(textLayoutResultProxy4, 1);
                    textFieldPreparedSelection.l(o5, o5);
                }
                textFieldPreparedSelection.k();
                break;
            case 32:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    textFieldPreparedSelection.l(0, 0);
                }
                textFieldPreparedSelection.k();
                break;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                textFieldPreparedSelection.e.f7357a = null;
                AnnotatedString annotatedString3 = textFieldPreparedSelection.f7049g;
                if (annotatedString3.f16880a.length() > 0) {
                    int length2 = annotatedString3.f16880a.length();
                    textFieldPreparedSelection.l(length2, length2);
                }
                textFieldPreparedSelection.k();
                break;
            case 34:
                TextPreparedSelectionState textPreparedSelectionState5 = textFieldPreparedSelection.e;
                textPreparedSelectionState5.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (textFieldPreparedSelection.e()) {
                        textPreparedSelectionState5.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (d3 = textFieldPreparedSelection.d()) != null) {
                            int intValue5 = d3.intValue();
                            textFieldPreparedSelection.l(intValue5, intValue5);
                        }
                    } else {
                        textPreparedSelectionState5.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (c4 = textFieldPreparedSelection.c()) != null) {
                            int intValue6 = c4.intValue();
                            textFieldPreparedSelection.l(intValue6, intValue6);
                        }
                    }
                }
                textFieldPreparedSelection.k();
                break;
            case 35:
                TextPreparedSelectionState textPreparedSelectionState6 = textFieldPreparedSelection.e;
                textPreparedSelectionState6.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (textFieldPreparedSelection.e()) {
                        textPreparedSelectionState6.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (c5 = textFieldPreparedSelection.c()) != null) {
                            int intValue7 = c5.intValue();
                            textFieldPreparedSelection.l(intValue7, intValue7);
                        }
                    } else {
                        textPreparedSelectionState6.f7357a = null;
                        if (textFieldPreparedSelection.f7049g.f16880a.length() > 0 && (d4 = textFieldPreparedSelection.d()) != null) {
                            int intValue8 = d4.intValue();
                            textFieldPreparedSelection.l(intValue8, intValue8);
                        }
                    }
                }
                textFieldPreparedSelection.k();
                break;
            case 36:
                textFieldPreparedSelection.g();
                textFieldPreparedSelection.k();
                break;
            case 37:
                textFieldPreparedSelection.h();
                textFieldPreparedSelection.k();
                break;
            case 38:
                textFieldPreparedSelection.j();
                textFieldPreparedSelection.k();
                break;
            case 39:
                textFieldPreparedSelection.i();
                textFieldPreparedSelection.k();
                break;
            case 40:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (textFieldPreparedSelection.e()) {
                        textFieldPreparedSelection.j();
                    } else {
                        textFieldPreparedSelection.i();
                    }
                }
                textFieldPreparedSelection.k();
                break;
            case 41:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    if (textFieldPreparedSelection.e()) {
                        textFieldPreparedSelection.i();
                    } else {
                        textFieldPreparedSelection.j();
                    }
                }
                textFieldPreparedSelection.k();
                break;
            case 42:
                textFieldPreparedSelection.e.f7357a = null;
                if (textFieldPreparedSelection.f7049g.f16880a.length() > 0) {
                    long j6 = textFieldPreparedSelection.f7048f;
                    int i6 = TextRange.f17057c;
                    int i7 = (int) (j6 & 4294967295L);
                    textFieldPreparedSelection.l(i7, i7);
                    break;
                }
                break;
            case 43:
                if (!textFieldKeyInput.e) {
                    textFieldKeyInput.a(f0.u(new CommitTextCommand("\n", 1)));
                    break;
                } else {
                    ((LegacyTextFieldState$onImeActionPerformed$1) textFieldKeyInput.f6134a.f6039u).invoke(new ImeAction(textFieldKeyInput.f6143l));
                    break;
                }
            case 44:
                if (!textFieldKeyInput.e) {
                    textFieldKeyInput.a(f0.u(new CommitTextCommand("\t", 1)));
                    break;
                } else {
                    this.f6146c.f30919a = false;
                    break;
                }
            case 45:
                UndoManager undoManager = textFieldKeyInput.f6139h;
                if (undoManager != null) {
                    undoManager.a(TextFieldValue.a(textFieldPreparedSelection.f7298h, textFieldPreparedSelection.f7049g, textFieldPreparedSelection.f7048f, 4));
                }
                UndoManager undoManager2 = textFieldKeyInput.f6139h;
                if (undoManager2 != null) {
                    UndoManager.Entry entry2 = undoManager2.f6246b;
                    if (entry2 != null && (entry = entry2.f6249a) != null) {
                        undoManager2.f6246b = entry;
                        undoManager2.d -= entry2.f6250b.f17361a.f16880a.length();
                        undoManager2.f6247c = new UndoManager.Entry(undoManager2.f6247c, entry2.f6250b);
                        textFieldValue = entry.f6250b;
                    }
                    if (textFieldValue != null) {
                        textFieldKeyInput.f6142k.invoke(textFieldValue);
                        break;
                    }
                }
                break;
            case 46:
                UndoManager undoManager3 = textFieldKeyInput.f6139h;
                if (undoManager3 != null) {
                    UndoManager.Entry entry3 = undoManager3.f6247c;
                    if (entry3 != null) {
                        undoManager3.f6247c = entry3.f6249a;
                        TextFieldValue textFieldValue2 = entry3.f6250b;
                        undoManager3.f6246b = new UndoManager.Entry(undoManager3.f6246b, textFieldValue2);
                        undoManager3.d = textFieldValue2.f17361a.f16880a.length() + undoManager3.d;
                        textFieldValue = entry3.f6250b;
                    }
                    if (textFieldValue != null) {
                        textFieldKeyInput.f6142k.invoke(textFieldValue);
                        break;
                    }
                }
                break;
        }
        return d0.b0.f30125a;
    }
}
