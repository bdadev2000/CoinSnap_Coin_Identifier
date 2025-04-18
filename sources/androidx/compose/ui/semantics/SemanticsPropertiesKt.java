package androidx.compose.ui.semantics;

import androidx.compose.foundation.text.input.a;
import androidx.compose.ui.text.input.ImeAction;
import b1.f0;
import d0.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import q0.l;
import q0.p;
import x0.n;

/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n[] f16865a;

    static {
        t tVar = new t(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        h0 h0Var = g0.f30932a;
        h0Var.getClass();
        t tVar2 = new t(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1);
        h0Var.getClass();
        f16865a = new n[]{tVar, a.u(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, h0Var), a.u(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, h0Var), a.u(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, h0Var), a.u(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, h0Var), a.u(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, h0Var), a.u(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, h0Var), a.u(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, h0Var), a.u(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, h0Var), tVar2, a.u(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, h0Var), a.u(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, h0Var), a.u(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, h0Var), a.u(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, h0Var), a.u(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, h0Var), a.u(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, h0Var), a.u(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, h0Var), a.u(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, h0Var)};
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        semanticsProperties.getClass();
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f16793a;
    }

    public static final SemanticsPropertyKey a(String str) {
        SemanticsPropertyKey semanticsPropertyKey = new SemanticsPropertyKey(str);
        semanticsPropertyKey.f16870c = true;
        return semanticsPropertyKey;
    }

    public static final SemanticsPropertyKey b(String str, p pVar) {
        return new SemanticsPropertyKey(str, true, pVar);
    }

    public static void c(SemanticsPropertyReceiver semanticsPropertyReceiver, q0.a aVar) {
        semanticsPropertyReceiver.b(SemanticsActions.f16805o, new AccessibilityAction(null, aVar));
    }

    public static void d(SemanticsPropertyReceiver semanticsPropertyReceiver, q0.a aVar) {
        semanticsPropertyReceiver.b(SemanticsActions.f16806p, new AccessibilityAction(null, aVar));
    }

    public static final void e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        semanticsPropertyReceiver.b(SemanticsProperties.f16839j, b0.f30125a);
    }

    public static void f(SemanticsConfiguration semanticsConfiguration, q0.a aVar) {
        semanticsConfiguration.b(SemanticsActions.A, new AccessibilityAction(null, new SemanticsPropertiesKt$getScrollViewportLength$1(aVar)));
    }

    public static void g(SemanticsPropertyReceiver semanticsPropertyReceiver, l lVar) {
        semanticsPropertyReceiver.b(SemanticsActions.f16793a, new AccessibilityAction(null, lVar));
    }

    public static void h(SemanticsPropertyReceiver semanticsPropertyReceiver, q0.a aVar) {
        semanticsPropertyReceiver.b(SemanticsActions.f16794b, new AccessibilityAction(null, aVar));
    }

    public static void i(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, q0.a aVar) {
        semanticsPropertyReceiver.b(SemanticsProperties.A, new ImeAction(i2));
        semanticsPropertyReceiver.b(SemanticsActions.f16804n, new AccessibilityAction(null, aVar));
    }

    public static final void j(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, q0.a aVar) {
        semanticsPropertyReceiver.b(SemanticsActions.f16795c, new AccessibilityAction(str, aVar));
    }

    public static final void k(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16842m;
        n nVar = f16865a[5];
        Boolean bool = Boolean.TRUE;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, bool);
    }

    public static final void l(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        semanticsPropertyReceiver.b(SemanticsProperties.f16833b, f0.u(str));
    }

    public static final void m(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16845p;
        n nVar = f16865a[10];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, scrollAxisRange);
    }

    public static final void n(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16840k;
        n nVar = f16865a[3];
        LiveRegionMode liveRegionMode = new LiveRegionMode(i2);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, liveRegionMode);
    }

    public static final void o(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.e;
        n nVar = f16865a[2];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, str);
    }

    public static void p(SemanticsPropertyReceiver semanticsPropertyReceiver, l lVar) {
        semanticsPropertyReceiver.b(SemanticsActions.f16797g, new AccessibilityAction(null, lVar));
    }

    public static final void q(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.d;
        n nVar = f16865a[1];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, progressBarRangeInfo);
    }

    public static final void r(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16849t;
        n nVar = f16865a[12];
        Role role = new Role(i2);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, role);
    }

    public static final void s(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.B;
        n nVar = f16865a[19];
        Boolean valueOf = Boolean.valueOf(z2);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, valueOf);
    }

    public static final void t(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16842m;
        n nVar = f16865a[6];
        Boolean bool = Boolean.TRUE;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, bool);
    }

    public static final void u(SemanticsPropertyReceiver semanticsPropertyReceiver, float f2) {
        SemanticsProperties semanticsProperties = SemanticsProperties.f16832a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16844o;
        n nVar = f16865a[9];
        Float valueOf = Float.valueOf(f2);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, valueOf);
    }

    public static final void v(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16846q;
        n nVar = f16865a[11];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, scrollAxisRange);
    }
}
