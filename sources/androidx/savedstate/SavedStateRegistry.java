package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.Recreator;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import java.util.Map;
import p0.a;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21433b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f21434c;
    public boolean d;
    public Recreator.SavedStateProvider e;

    /* renamed from: a, reason: collision with root package name */
    public final SafeIterableMap f21432a = new SafeIterableMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f21435f = true;

    /* loaded from: classes2.dex */
    public interface AutoRecreated {
        void a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public interface SavedStateProvider {
        Bundle a();
    }

    public final Bundle a(String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f21434c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f21434c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f21434c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f21434c = null;
        }
        return bundle2;
    }

    public final SavedStateProvider b() {
        Iterator it = this.f21432a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a.r(entry, "components");
            String str = (String) entry.getKey();
            SavedStateProvider savedStateProvider = (SavedStateProvider) entry.getValue();
            if (a.g(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return savedStateProvider;
            }
        }
        return null;
    }

    public final void c(String str, SavedStateProvider savedStateProvider) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(savedStateProvider, "provider");
        if (((SavedStateProvider) this.f21432a.b(str, savedStateProvider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f21435f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.SavedStateProvider savedStateProvider = this.e;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.e = savedStateProvider;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.e;
            if (savedStateProvider2 != null) {
                savedStateProvider2.f21431a.add(LegacySavedStateHandleController.OnRecreation.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
