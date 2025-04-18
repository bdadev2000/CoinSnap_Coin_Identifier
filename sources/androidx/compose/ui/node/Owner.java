package androidx.compose.ui.node;

import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h0.g;
import h0.l;
import q0.p;

/* loaded from: classes3.dex */
public interface Owner extends PositionCalculator {
    public static final /* synthetic */ int i8 = 0;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* loaded from: classes3.dex */
    public interface OnLayoutCompletedListener {
        void h();
    }

    void a(boolean z2);

    void b(LayoutNode layoutNode, boolean z2, boolean z3);

    long d(long j2);

    void e(LayoutNode layoutNode);

    void f();

    void g(LayoutNode layoutNode);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    l getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.b(this);
    }

    PointerIconService getPointerIconService();

    LayoutNode getRoot();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void h(p pVar, g gVar);

    void i(LayoutNode layoutNode, boolean z2);

    void j(BackwardsCompatNode$initializeModifier$3 backwardsCompatNode$initializeModifier$3);

    OwnedLayer k(p pVar, q0.a aVar, GraphicsLayer graphicsLayer);

    void l(q0.a aVar);

    void m(LayoutNode layoutNode, long j2);

    long p(long j2);

    void q(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4);

    void r(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z2);

    void t();

    void u();

    void v();
}
