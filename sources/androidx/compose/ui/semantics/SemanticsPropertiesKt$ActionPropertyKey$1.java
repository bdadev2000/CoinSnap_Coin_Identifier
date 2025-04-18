package androidx.compose.ui.semantics;

import d0.c;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f16866a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        c cVar;
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj2;
        if (accessibilityAction == null || (str = accessibilityAction.f16772a) == null) {
            str = accessibilityAction2.f16772a;
        }
        if (accessibilityAction == null || (cVar = accessibilityAction.f16773b) == null) {
            cVar = accessibilityAction2.f16773b;
        }
        return new AccessibilityAction(str, cVar);
    }
}
