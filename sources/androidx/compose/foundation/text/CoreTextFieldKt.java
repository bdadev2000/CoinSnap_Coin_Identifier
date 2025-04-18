package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0545 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x056f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0623 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x066c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x072b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0754 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x077b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.text.input.TextFieldValue r52, q0.l r53, androidx.compose.ui.Modifier r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.input.VisualTransformation r56, q0.l r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, androidx.compose.ui.graphics.Brush r59, boolean r60, int r61, int r62, androidx.compose.ui.text.input.ImeOptions r63, androidx.compose.foundation.text.KeyboardActions r64, boolean r65, boolean r66, q0.q r67, androidx.compose.runtime.Composer r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 2348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, q0.l, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, q0.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, q0.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-20551815);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, true);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, modifier);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar2);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            int i5 = i3 >> 3;
            ContextMenu_androidKt.c(textFieldSelectionManager, pVar, g2, (i5 & 112) | (i5 & 14));
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, pVar, i2);
        }
    }

    public static final void c(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i2) {
        int i3;
        TextDelegate textDelegate;
        ComposerImpl g2 = composer.g(-1436003720);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(textFieldSelectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
            if (legacyTextFieldState != null && ((Boolean) legacyTextFieldState.f6033o.getValue()).booleanValue()) {
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                AnnotatedString annotatedString = (legacyTextFieldState2 == null || (textDelegate = legacyTextFieldState2.f6021a) == null) ? null : textDelegate.f6107a;
                if (annotatedString != null && annotatedString.f16880a.length() > 0) {
                    g2.J(-285446808);
                    boolean I = g2.I(textFieldSelectionManager);
                    Object u2 = g2.u();
                    Object obj = Composer.Companion.f13690a;
                    if (I || u2 == obj) {
                        u2 = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
                            @Override // androidx.compose.foundation.text.TextDragObserver
                            public final void a() {
                            }

                            @Override // androidx.compose.foundation.text.TextDragObserver
                            public final void b(long j2) {
                                TextLayoutResultProxy d;
                                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                long a2 = SelectionHandlesKt.a(textFieldSelectionManager2.k(true));
                                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager2.d;
                                if (legacyTextFieldState3 == null || (d = legacyTextFieldState3.d()) == null) {
                                    return;
                                }
                                long e = d.e(a2);
                                textFieldSelectionManager2.f7310m = e;
                                textFieldSelectionManager2.f7314q.setValue(new Offset(e));
                                textFieldSelectionManager2.f7312o = 0L;
                                textFieldSelectionManager2.f7313p.setValue(Handle.f5964a);
                                textFieldSelectionManager2.t(false);
                            }

                            @Override // androidx.compose.foundation.text.TextDragObserver
                            public final void c() {
                                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                TextFieldSelectionManager.b(textFieldSelectionManager2, null);
                                TextFieldSelectionManager.a(textFieldSelectionManager2, null);
                            }

                            @Override // androidx.compose.foundation.text.TextDragObserver
                            public final void d(long j2) {
                                TextLayoutResultProxy d;
                                HapticFeedback hapticFeedback;
                                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                textFieldSelectionManager2.f7312o = Offset.k(textFieldSelectionManager2.f7312o, j2);
                                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager2.d;
                                if (legacyTextFieldState3 == null || (d = legacyTextFieldState3.d()) == null) {
                                    return;
                                }
                                textFieldSelectionManager2.f7314q.setValue(new Offset(Offset.k(textFieldSelectionManager2.f7310m, textFieldSelectionManager2.f7312o)));
                                OffsetMapping offsetMapping = textFieldSelectionManager2.f7301b;
                                Offset i4 = textFieldSelectionManager2.i();
                                p0.a.p(i4);
                                int a2 = offsetMapping.a(d.b(i4.f14913a, true));
                                long a3 = TextRangeKt.a(a2, a2);
                                if (TextRange.b(a3, textFieldSelectionManager2.l().f17362b)) {
                                    return;
                                }
                                LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager2.d;
                                if ((legacyTextFieldState4 == null || ((Boolean) legacyTextFieldState4.f6035q.getValue()).booleanValue()) && (hapticFeedback = textFieldSelectionManager2.f7306i) != null) {
                                    hapticFeedback.a();
                                }
                                textFieldSelectionManager2.f7302c.invoke(TextFieldSelectionManager.e(textFieldSelectionManager2.l().f17361a, a3));
                            }

                            @Override // androidx.compose.foundation.text.TextDragObserver
                            public final void onCancel() {
                            }

                            @Override // androidx.compose.foundation.text.TextDragObserver
                            public final void onStop() {
                                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                TextFieldSelectionManager.b(textFieldSelectionManager2, null);
                                TextFieldSelectionManager.a(textFieldSelectionManager2, null);
                            }
                        };
                        g2.o(u2);
                    }
                    TextDragObserver textDragObserver = (TextDragObserver) u2;
                    Density density = (Density) g2.K(CompositionLocalsKt.f16434f);
                    OffsetMapping offsetMapping = textFieldSelectionManager.f7301b;
                    long j2 = textFieldSelectionManager.l().f17362b;
                    int i4 = TextRange.f17057c;
                    int b2 = offsetMapping.b((int) (j2 >> 32));
                    LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                    TextLayoutResultProxy d = legacyTextFieldState3 != null ? legacyTextFieldState3.d() : null;
                    p0.a.p(d);
                    TextLayoutResult textLayoutResult = d.f6210a;
                    Rect c2 = textLayoutResult.c(p0.a.A(b2, 0, textLayoutResult.f17046a.f17038a.f16880a.length()));
                    final long a2 = OffsetKt.a((density.y1(TextFieldCursorKt.f6116a) / 2) + c2.f14914a, c2.d);
                    boolean d2 = g2.d(a2);
                    Object u3 = g2.u();
                    if (d2 || u3 == obj) {
                        u3 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                            @Override // androidx.compose.foundation.text.selection.OffsetProvider
                            public final long a() {
                                return a2;
                            }
                        };
                        g2.o(u3);
                    }
                    OffsetProvider offsetProvider = (OffsetProvider) u3;
                    Modifier.Companion companion = Modifier.Companion.f14687a;
                    boolean w = g2.w(textDragObserver) | g2.w(textFieldSelectionManager);
                    Object u4 = g2.u();
                    if (w || u4 == obj) {
                        u4 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(textDragObserver, textFieldSelectionManager, null);
                        g2.o(u4);
                    }
                    Modifier b3 = SuspendingPointerInputFilterKt.b(companion, textDragObserver, (p) u4);
                    boolean d3 = g2.d(a2);
                    Object u5 = g2.u();
                    if (d3 || u5 == obj) {
                        u5 = new CoreTextFieldKt$TextFieldCursorHandle$3$1(a2);
                        g2.o(u5);
                    }
                    AndroidCursorHandle_androidKt.a(offsetProvider, SemanticsModifierKt.b(b3, false, (l) u5), 0L, g2, 0, 4);
                    g2.V(false);
                }
            }
            g2.J(-284257090);
            g2.V(false);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CoreTextFieldKt$TextFieldCursorHandle$4(textFieldSelectionManager, i2);
        }
    }

    public static final void d(TextFieldSelectionManager textFieldSelectionManager, boolean z2, Composer composer, int i2) {
        int i3;
        TextLayoutResultProxy d;
        TextLayoutResult textLayoutResult;
        ComposerImpl g2 = composer.g(626339208);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(textFieldSelectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else if (z2) {
            g2.J(-1286242594);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
            TextLayoutResult textLayoutResult2 = null;
            if (legacyTextFieldState != null && (d = legacyTextFieldState.d()) != null && (textLayoutResult = d.f6210a) != null) {
                if (!(textFieldSelectionManager.d != null ? r6.f6034p : true)) {
                    textLayoutResult2 = textLayoutResult;
                }
            }
            if (textLayoutResult2 == null) {
                g2.J(-1285984396);
            } else {
                g2.J(-1285984395);
                if (TextRange.c(textFieldSelectionManager.l().f17362b)) {
                    g2.J(-1679637798);
                    g2.V(false);
                } else {
                    g2.J(-1680616096);
                    int b2 = textFieldSelectionManager.f7301b.b((int) (textFieldSelectionManager.l().f17362b >> 32));
                    int b3 = textFieldSelectionManager.f7301b.b((int) (textFieldSelectionManager.l().f17362b & 4294967295L));
                    ResolvedTextDirection a2 = textLayoutResult2.a(b2);
                    ResolvedTextDirection a3 = textLayoutResult2.a(Math.max(b3 - 1, 0));
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                    if (legacyTextFieldState2 == null || !((Boolean) legacyTextFieldState2.f6031m.getValue()).booleanValue()) {
                        g2.J(-1679975078);
                        g2.V(false);
                    } else {
                        g2.J(-1680216289);
                        TextFieldSelectionManagerKt.a(true, a2, textFieldSelectionManager, g2, ((i3 << 6) & 896) | 6);
                        g2.V(false);
                    }
                    LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                    if (legacyTextFieldState3 == null || !((Boolean) legacyTextFieldState3.f6032n.getValue()).booleanValue()) {
                        g2.J(-1679655654);
                        g2.V(false);
                    } else {
                        g2.J(-1679895904);
                        TextFieldSelectionManagerKt.a(false, a3, textFieldSelectionManager, g2, ((i3 << 6) & 896) | 6);
                        g2.V(false);
                    }
                    g2.V(false);
                }
                LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.d;
                if (legacyTextFieldState4 != null) {
                    boolean z3 = !p0.a.g(textFieldSelectionManager.f7316s.f17361a.f16880a, textFieldSelectionManager.l().f17361a.f16880a);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyTextFieldState4.f6030l;
                    if (z3) {
                        parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    }
                    if (legacyTextFieldState4.b()) {
                        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                            textFieldSelectionManager.s();
                        } else {
                            textFieldSelectionManager.m();
                        }
                    }
                }
            }
            g2.V(false);
            g2.V(false);
        } else {
            g2.J(651305535);
            g2.V(false);
            textFieldSelectionManager.m();
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z2, i2);
        }
    }

    public static final void e(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession textInputSession = legacyTextFieldState.e;
        if (textInputSession != null) {
            ((LegacyTextFieldState$onValueChange$1) legacyTextFieldState.f6038t).invoke(TextFieldValue.a(legacyTextFieldState.d.f17320a, null, 0L, 3));
            TextInputService textInputService = textInputSession.f17390a;
            AtomicReference atomicReference = textInputService.f17367b;
            while (true) {
                if (atomicReference.compareAndSet(textInputSession, null)) {
                    textInputService.f17366a.b();
                    break;
                } else if (atomicReference.get() != textInputSession) {
                    break;
                }
            }
        }
        legacyTextFieldState.e = null;
    }

    public static final void f(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            TextLayoutResultProxy d = legacyTextFieldState.d();
            if (d == null) {
                return;
            }
            TextInputSession textInputSession = legacyTextFieldState.e;
            if (textInputSession == null) {
                return;
            }
            LayoutCoordinates c3 = legacyTextFieldState.c();
            if (c3 == null) {
                return;
            }
            TextFieldDelegate.Companion.c(textFieldValue, legacyTextFieldState.f6021a, d.f6210a, c3, textInputSession, legacyTextFieldState.b(), offsetMapping);
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }

    public static final Modifier g(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.b(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(legacyTextFieldState, textFieldSelectionManager));
    }
}
