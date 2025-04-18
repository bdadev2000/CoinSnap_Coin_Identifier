package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Arrays;
import p0.a;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15640a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15641b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f15642c;
    public final p d;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar, int i2) {
        obj = (i2 & 1) != 0 ? null : obj;
        obj2 = (i2 & 2) != 0 ? null : obj2;
        objArr = (i2 & 4) != 0 ? null : objArr;
        this.f15640a = obj;
        this.f15641b = obj2;
        this.f15642c = objArr;
        this.d = pVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SuspendingPointerInputModifierNodeImpl(this.f15640a, this.f15641b, this.f15642c, this.d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = (SuspendingPointerInputModifierNodeImpl) node;
        Object obj = suspendingPointerInputModifierNodeImpl.f15645o;
        Object obj2 = this.f15640a;
        boolean z2 = !a.g(obj, obj2);
        suspendingPointerInputModifierNodeImpl.f15645o = obj2;
        Object obj3 = suspendingPointerInputModifierNodeImpl.f15646p;
        Object obj4 = this.f15641b;
        if (!a.g(obj3, obj4)) {
            z2 = true;
        }
        suspendingPointerInputModifierNodeImpl.f15646p = obj4;
        Object[] objArr = suspendingPointerInputModifierNodeImpl.f15647q;
        Object[] objArr2 = this.f15642c;
        if (objArr != null && objArr2 == null) {
            z2 = true;
        }
        if (objArr == null && objArr2 != null) {
            z2 = true;
        }
        boolean z3 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z2 : true;
        suspendingPointerInputModifierNodeImpl.f15647q = objArr2;
        if (z3) {
            suspendingPointerInputModifierNodeImpl.M0();
        }
        suspendingPointerInputModifierNodeImpl.f15648r = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!a.g(this.f15640a, suspendPointerInputElement.f15640a) || !a.g(this.f15641b, suspendPointerInputElement.f15641b)) {
            return false;
        }
        Object[] objArr = this.f15642c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f15642c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f15642c != null) {
            return false;
        }
        return this.d == suspendPointerInputElement.d;
    }

    public final int hashCode() {
        Object obj = this.f15640a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15641b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f15642c;
        return this.d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
