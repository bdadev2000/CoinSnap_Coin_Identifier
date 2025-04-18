package androidx.compose.ui.semantics;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import d0.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16815a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f16816b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16817c;

    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public final void b(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        boolean z2 = obj instanceof AccessibilityAction;
        LinkedHashMap linkedHashMap = this.f16815a;
        if (!z2 || !linkedHashMap.containsKey(semanticsPropertyKey)) {
            linkedHashMap.put(semanticsPropertyKey, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(semanticsPropertyKey);
        p0.a.q(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj2;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        String str = accessibilityAction2.f16772a;
        if (str == null) {
            str = accessibilityAction.f16772a;
        }
        c cVar = accessibilityAction2.f16773b;
        if (cVar == null) {
            cVar = accessibilityAction.f16773b;
        }
        linkedHashMap.put(semanticsPropertyKey, new AccessibilityAction(str, cVar));
    }

    public final Object c(SemanticsPropertyKey semanticsPropertyKey) {
        Object obj = this.f16815a.get(semanticsPropertyKey);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final Object d(SemanticsPropertyKey semanticsPropertyKey, q0.a aVar) {
        Object obj = this.f16815a.get(semanticsPropertyKey);
        return obj == null ? aVar.invoke() : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return p0.a.g(this.f16815a, semanticsConfiguration.f16815a) && this.f16816b == semanticsConfiguration.f16816b && this.f16817c == semanticsConfiguration.f16817c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16817c) + d.g(this.f16816b, this.f16815a.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.f16815a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f16816b) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f16817c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f16815a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(semanticsPropertyKey.f16868a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.a(this) + "{ " + ((Object) sb) + " }";
    }
}
