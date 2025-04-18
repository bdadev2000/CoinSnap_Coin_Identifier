package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    /* renamed from: c, reason: collision with root package name */
    public static final NavControllerViewModel$Companion$FACTORY$1 f20396c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20397b = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public final ViewModelStore a(String str) {
        p0.a.s(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f20397b;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(str);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(str, viewModelStore2);
        return viewModelStore2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f20397b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f20397b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }
}
