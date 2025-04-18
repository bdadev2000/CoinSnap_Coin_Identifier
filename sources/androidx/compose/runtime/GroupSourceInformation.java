package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

@StabilityInferred
/* loaded from: classes3.dex */
public final class GroupSourceInformation {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13806a;

    public final boolean a(Anchor anchor) {
        ArrayList arrayList = this.f13806a;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            if (p0.a.g(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).a(anchor))) {
                return true;
            }
        }
        return false;
    }

    public final GroupSourceInformation b() {
        Object obj;
        GroupSourceInformation b2;
        ArrayList arrayList = this.f13806a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj2 = arrayList.get(size);
                if (obj2 instanceof GroupSourceInformation) {
                    ((GroupSourceInformation) obj2).getClass();
                    obj = obj2;
                    break;
                }
            }
        }
        obj = null;
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (b2 = groupSourceInformation.b()) == null) ? this : b2;
    }

    public final boolean c(Anchor anchor) {
        ArrayList arrayList = this.f13806a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (p0.a.g(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).c(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f13806a = null;
                return false;
            }
        }
        return true;
    }
}
