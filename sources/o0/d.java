package o0;

import android.view.accessibility.AccessibilityNodeInfo;
import n0.p2;

/* loaded from: classes.dex */
public abstract class d {
    public static Object a(int i10, float f10, float f11, float f12) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.s();
        return p2.h(i10, f10, f11, f12);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence stateDescription;
        stateDescription = accessibilityNodeInfo.getStateDescription();
        return stateDescription;
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
