package androidx.compose.ui.platform;

import androidx.collection.MutableIntList;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollObservationScope f16308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f16309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ScrollObservationScope scrollObservationScope) {
        super(0);
        this.f16308a = scrollObservationScope;
        this.f16309b = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // q0.a
    public final Object invoke() {
        SemanticsNode semanticsNode;
        LayoutNode layoutNode;
        ScrollObservationScope scrollObservationScope = this.f16308a;
        ScrollAxisRange scrollAxisRange = scrollObservationScope.f16592f;
        ScrollAxisRange scrollAxisRange2 = scrollObservationScope.f16593g;
        Float f2 = scrollObservationScope.f16591c;
        Float f3 = scrollObservationScope.d;
        float floatValue = (scrollAxisRange == null || f2 == null) ? 0.0f : ((Number) scrollAxisRange.f16790a.invoke()).floatValue() - f2.floatValue();
        float floatValue2 = (scrollAxisRange2 == null || f3 == null) ? 0.0f : ((Number) scrollAxisRange2.f16790a.invoke()).floatValue() - f3.floatValue();
        if (floatValue != 0.0f || floatValue2 != 0.0f) {
            MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.K;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f16309b;
            int v2 = androidComposeViewAccessibilityDelegateCompat.v(scrollObservationScope.f16589a);
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.k().c(androidComposeViewAccessibilityDelegateCompat.f16275k);
            if (semanticsNodeWithAdjustedBounds != null) {
                try {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.f16276l;
                    if (accessibilityNodeInfoCompat != null) {
                        accessibilityNodeInfoCompat.j(androidComposeViewAccessibilityDelegateCompat.b(semanticsNodeWithAdjustedBounds));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            androidComposeViewAccessibilityDelegateCompat.f16267a.invalidate();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.k().c(v2);
            if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.f16596a) != null && (layoutNode = semanticsNode.f16821c) != null) {
                if (scrollAxisRange != null) {
                    androidComposeViewAccessibilityDelegateCompat.f16278n.i(v2, scrollAxisRange);
                }
                if (scrollAxisRange2 != null) {
                    androidComposeViewAccessibilityDelegateCompat.f16279o.i(v2, scrollAxisRange2);
                }
                androidComposeViewAccessibilityDelegateCompat.r(layoutNode);
            }
        }
        if (scrollAxisRange != null) {
            scrollObservationScope.f16591c = (Float) scrollAxisRange.f16790a.invoke();
        }
        if (scrollAxisRange2 != null) {
            scrollObservationScope.d = (Float) scrollAxisRange2.f16790a.invoke();
        }
        return b0.f30125a;
    }
}
