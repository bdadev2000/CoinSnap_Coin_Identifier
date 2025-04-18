package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import b1.f0;
import d0.h;
import d0.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import q0.l;

@StabilityInferred
@d0.a
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* renamed from: a, reason: collision with root package name */
    public final View f17368a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f17369b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f17370c;
    public boolean d;
    public l e;

    /* renamed from: f, reason: collision with root package name */
    public l f17371f;

    /* renamed from: g, reason: collision with root package name */
    public TextFieldValue f17372g;

    /* renamed from: h, reason: collision with root package name */
    public ImeOptions f17373h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17374i;

    /* renamed from: j, reason: collision with root package name */
    public final h f17375j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f17376k;

    /* renamed from: l, reason: collision with root package name */
    public final CursorAnchorInfoController f17377l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableVector f17378m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.compose.material.ripple.a f17379n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class TextInputCommand {

        /* renamed from: a, reason: collision with root package name */
        public static final TextInputCommand f17380a;

        /* renamed from: b, reason: collision with root package name */
        public static final TextInputCommand f17381b;

        /* renamed from: c, reason: collision with root package name */
        public static final TextInputCommand f17382c;
        public static final TextInputCommand d;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ TextInputCommand[] f17383f;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand] */
        static {
            ?? r02 = new Enum("StartInput", 0);
            f17380a = r02;
            ?? r1 = new Enum("StopInput", 1);
            f17381b = r1;
            ?? r2 = new Enum("ShowKeyboard", 2);
            f17382c = r2;
            ?? r3 = new Enum("HideKeyboard", 3);
            d = r3;
            f17383f = new TextInputCommand[]{r02, r1, r2, r3};
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) f17383f.clone();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator) {
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: androidx.compose.ui.text.input.a
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.b
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j2) {
                        runnable.run();
                    }
                });
            }
        };
        this.f17368a = view;
        this.f17369b = inputMethodManagerImpl;
        this.f17370c = executor;
        this.e = TextInputServiceAndroid$onEditCommand$1.f17386a;
        this.f17371f = TextInputServiceAndroid$onImeActionPerformed$1.f17387a;
        this.f17372g = new TextFieldValue("", TextRange.f17056b, 4);
        this.f17373h = ImeOptions.f17331h;
        this.f17374i = new ArrayList();
        this.f17375j = f0.s(i.f30133c, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f17377l = new CursorAnchorInfoController(positionCalculator, inputMethodManagerImpl);
        this.f17378m = new MutableVector(new TextInputCommand[16]);
    }

    public static void i(TextInputServiceAndroid textInputServiceAndroid) {
        Boolean bool;
        Boolean bool2 = null;
        textInputServiceAndroid.f17379n = null;
        MutableVector mutableVector = textInputServiceAndroid.f17378m;
        int i2 = mutableVector.f14144c;
        if (i2 > 0) {
            Object[] objArr = mutableVector.f14142a;
            bool = null;
            int i3 = 0;
            do {
                TextInputCommand textInputCommand = (TextInputCommand) objArr[i3];
                int ordinal = textInputCommand.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if ((ordinal == 2 || ordinal == 3) && !p0.a.g(bool2, Boolean.FALSE)) {
                            bool = Boolean.valueOf(textInputCommand == TextInputCommand.f17382c);
                        }
                        i3++;
                    } else {
                        bool2 = Boolean.FALSE;
                    }
                } else {
                    bool2 = Boolean.TRUE;
                }
                bool = bool2;
                i3++;
            } while (i3 < i2);
        } else {
            bool = null;
        }
        mutableVector.g();
        boolean g2 = p0.a.g(bool2, Boolean.TRUE);
        InputMethodManager inputMethodManager = textInputServiceAndroid.f17369b;
        if (g2) {
            inputMethodManager.b();
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                inputMethodManager.e();
            } else {
                inputMethodManager.f();
            }
        }
        if (p0.a.g(bool2, Boolean.FALSE)) {
            inputMethodManager.b();
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void a() {
        j(TextInputCommand.f17380a);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void b() {
        this.d = false;
        this.e = TextInputServiceAndroid$stopInput$1.f17388a;
        this.f17371f = TextInputServiceAndroid$stopInput$2.f17389a;
        this.f17376k = null;
        j(TextInputCommand.f17381b);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void c() {
        j(TextInputCommand.d);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void d(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z2 = (TextRange.b(this.f17372g.f17362b, textFieldValue2.f17362b) && p0.a.g(this.f17372g.f17363c, textFieldValue2.f17363c)) ? false : true;
        this.f17372g = textFieldValue2;
        int size = this.f17374i.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.f17374i.get(i2)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.d = textFieldValue2;
            }
        }
        CursorAnchorInfoController cursorAnchorInfoController = this.f17377l;
        synchronized (cursorAnchorInfoController.f17300c) {
            cursorAnchorInfoController.f17305j = null;
            cursorAnchorInfoController.f17307l = null;
            cursorAnchorInfoController.f17306k = null;
            cursorAnchorInfoController.f17308m = CursorAnchorInfoController$invalidate$1$1.f17314a;
            cursorAnchorInfoController.f17309n = null;
            cursorAnchorInfoController.f17310o = null;
        }
        if (p0.a.g(textFieldValue, textFieldValue2)) {
            if (z2) {
                InputMethodManager inputMethodManager = this.f17369b;
                int f2 = TextRange.f(textFieldValue2.f17362b);
                int e = TextRange.e(textFieldValue2.f17362b);
                TextRange textRange = this.f17372g.f17363c;
                int f3 = textRange != null ? TextRange.f(textRange.f17058a) : -1;
                TextRange textRange2 = this.f17372g.f17363c;
                inputMethodManager.a(f2, e, f3, textRange2 != null ? TextRange.e(textRange2.f17058a) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!p0.a.g(textFieldValue.f17361a.f16880a, textFieldValue2.f17361a.f16880a) || (TextRange.b(textFieldValue.f17362b, textFieldValue2.f17362b) && !p0.a.g(textFieldValue.f17363c, textFieldValue2.f17363c)))) {
            this.f17369b.b();
            return;
        }
        int size2 = this.f17374i.size();
        for (int i3 = 0; i3 < size2; i3++) {
            RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.f17374i.get(i3)).get();
            if (recordingInputConnection2 != null) {
                TextFieldValue textFieldValue3 = this.f17372g;
                InputMethodManager inputMethodManager2 = this.f17369b;
                if (recordingInputConnection2.f17354h) {
                    recordingInputConnection2.d = textFieldValue3;
                    if (recordingInputConnection2.f17352f) {
                        inputMethodManager2.d(recordingInputConnection2.e, InputState_androidKt.a(textFieldValue3));
                    }
                    TextRange textRange3 = textFieldValue3.f17363c;
                    int f4 = textRange3 != null ? TextRange.f(textRange3.f17058a) : -1;
                    TextRange textRange4 = textFieldValue3.f17363c;
                    int e2 = textRange4 != null ? TextRange.e(textRange4.f17058a) : -1;
                    long j2 = textFieldValue3.f17362b;
                    inputMethodManager2.a(TextRange.f(j2), TextRange.e(j2), f4, e2);
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void e() {
        j(TextInputCommand.f17382c);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void f(TextFieldValue textFieldValue, ImeOptions imeOptions, l lVar, l lVar2) {
        this.d = true;
        this.f17372g = textFieldValue;
        this.f17373h = imeOptions;
        this.e = lVar;
        this.f17371f = lVar2;
        j(TextInputCommand.f17380a);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, l lVar, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        CursorAnchorInfoController cursorAnchorInfoController = this.f17377l;
        synchronized (cursorAnchorInfoController.f17300c) {
            try {
                cursorAnchorInfoController.f17305j = textFieldValue;
                cursorAnchorInfoController.f17307l = offsetMapping;
                cursorAnchorInfoController.f17306k = textLayoutResult;
                cursorAnchorInfoController.f17308m = lVar;
                cursorAnchorInfoController.f17309n = rect;
                cursorAnchorInfoController.f17310o = rect2;
                if (!cursorAnchorInfoController.e) {
                    if (cursorAnchorInfoController.d) {
                    }
                }
                cursorAnchorInfoController.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void h(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.f17376k = new Rect(p0.a.t0(rect.f14914a), p0.a.t0(rect.f14915b), p0.a.t0(rect.f14916c), p0.a.t0(rect.d));
        if (!this.f17374i.isEmpty() || (rect2 = this.f17376k) == null) {
            return;
        }
        this.f17368a.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void j(TextInputCommand textInputCommand) {
        this.f17378m.b(textInputCommand);
        if (this.f17379n == null) {
            androidx.compose.material.ripple.a aVar = new androidx.compose.material.ripple.a(this, 2);
            this.f17370c.execute(aVar);
            this.f17379n = aVar;
        }
    }
}
