package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;

/* loaded from: classes4.dex */
public final class LayoutIdKt {
    public static final Object a(Measurable measurable) {
        Object m2 = measurable.m();
        LayoutIdParentData layoutIdParentData = m2 instanceof LayoutIdParentData ? (LayoutIdParentData) m2 : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.X0();
        }
        return null;
    }

    public static final Modifier b(Modifier modifier, Object obj) {
        return modifier.T0(new LayoutIdElement(obj));
    }
}
