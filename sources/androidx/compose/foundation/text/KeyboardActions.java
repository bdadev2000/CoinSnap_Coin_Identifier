package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import q0.l;

@Stable
/* loaded from: classes2.dex */
public final class KeyboardActions {

    /* renamed from: g, reason: collision with root package name */
    public static final KeyboardActions f6009g = new KeyboardActions(null, null, null, 63);

    /* renamed from: a, reason: collision with root package name */
    public final l f6010a;

    /* renamed from: b, reason: collision with root package name */
    public final l f6011b;

    /* renamed from: c, reason: collision with root package name */
    public final l f6012c;
    public final l d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final l f6013f;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public KeyboardActions(l lVar, l lVar2, l lVar3, int i2) {
        lVar = (i2 & 1) != 0 ? null : lVar;
        lVar2 = (i2 & 4) != 0 ? null : lVar2;
        lVar3 = (i2 & 16) != 0 ? null : lVar3;
        this.f6010a = lVar;
        this.f6011b = null;
        this.f6012c = lVar2;
        this.d = null;
        this.e = lVar3;
        this.f6013f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.f6010a == keyboardActions.f6010a && this.f6011b == keyboardActions.f6011b && this.f6012c == keyboardActions.f6012c && this.d == keyboardActions.d && this.e == keyboardActions.e && this.f6013f == keyboardActions.f6013f;
    }

    public final int hashCode() {
        l lVar = this.f6010a;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l lVar2 = this.f6011b;
        int hashCode2 = (hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l lVar3 = this.f6012c;
        int hashCode3 = (hashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l lVar4 = this.d;
        int hashCode4 = (hashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        l lVar5 = this.e;
        int hashCode5 = (hashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        l lVar6 = this.f6013f;
        return hashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }
}
