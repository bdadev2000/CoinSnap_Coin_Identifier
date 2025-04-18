package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowInfo f5894c;
    public final /* synthetic */ TextFieldSelectionManager d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5896g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1(LegacyTextFieldState legacyTextFieldState, boolean z2, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.f5892a = legacyTextFieldState;
        this.f5893b = z2;
        this.f5894c = windowInfo;
        this.d = textFieldSelectionManager;
        this.f5895f = textFieldValue;
        this.f5896g = offsetMapping;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
        LegacyTextFieldState legacyTextFieldState = this.f5892a;
        legacyTextFieldState.f6026h = layoutCoordinates3;
        TextLayoutResultProxy d = legacyTextFieldState.d();
        if (d != null) {
            d.f6211b = layoutCoordinates3;
        }
        if (this.f5893b) {
            HandleState a2 = legacyTextFieldState.a();
            HandleState handleState = HandleState.f5968b;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyTextFieldState.f6033o;
            TextFieldValue textFieldValue = this.f5895f;
            TextFieldSelectionManager textFieldSelectionManager = this.d;
            if (a2 == handleState) {
                if (((Boolean) legacyTextFieldState.f6030l.getValue()).booleanValue() && this.f5894c.a()) {
                    textFieldSelectionManager.s();
                } else {
                    textFieldSelectionManager.m();
                }
                legacyTextFieldState.f6031m.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
                legacyTextFieldState.f6032n.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)));
                parcelableSnapshotMutableState.setValue(Boolean.valueOf(TextRange.c(textFieldValue.f17362b)));
            } else if (legacyTextFieldState.a() == HandleState.f5969c) {
                parcelableSnapshotMutableState.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
            }
            CoreTextFieldKt.f(legacyTextFieldState, textFieldValue, this.f5896g);
            TextLayoutResultProxy d2 = legacyTextFieldState.d();
            if (d2 != null) {
                TextFieldValue textFieldValue2 = this.f5895f;
                OffsetMapping offsetMapping = this.f5896g;
                TextInputSession textInputSession = legacyTextFieldState.e;
                if (textInputSession != null && legacyTextFieldState.b() && (layoutCoordinates = d2.f6211b) != null && layoutCoordinates.B() && (layoutCoordinates2 = d2.f6212c) != null) {
                    TextLayoutResult textLayoutResult = d2.f6210a;
                    TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1 textFieldDelegate$Companion$updateTextLayoutResult$1$1$1 = new TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1(layoutCoordinates);
                    Rect c2 = SelectionManagerKt.c(layoutCoordinates);
                    Rect Q = layoutCoordinates.Q(layoutCoordinates2, false);
                    if (p0.a.g((TextInputSession) textInputSession.f17390a.f17367b.get(), textInputSession)) {
                        textInputSession.f17391b.g(textFieldValue2, offsetMapping, textLayoutResult, textFieldDelegate$Companion$updateTextLayoutResult$1$1$1, c2, Q);
                    }
                }
            }
        }
        return b0.f30125a;
    }
}
