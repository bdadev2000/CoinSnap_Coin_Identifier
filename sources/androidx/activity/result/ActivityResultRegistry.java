package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.d;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import u0.f;

/* loaded from: classes2.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f279a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f280b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f281c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f282f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f283g = new Bundle();

    /* loaded from: classes2.dex */
    public static class CallbackAndContract<O> {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityResultCallback f293a;

        /* renamed from: b, reason: collision with root package name */
        public final ActivityResultContract f294b;

        public CallbackAndContract(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
            this.f293a = activityResultCallback;
            this.f294b = activityResultContract;
        }
    }

    /* loaded from: classes2.dex */
    public static class LifecycleContainer {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f295a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f296b = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.f295a = lifecycle;
        }
    }

    public final void a(int i2, Object obj) {
        ActivityResultCallback activityResultCallback;
        String str = (String) this.f279a.get(Integer.valueOf(i2));
        if (str == null) {
            return;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.e.get(str);
        if (callbackAndContract == null || (activityResultCallback = callbackAndContract.f293a) == null) {
            this.f283g.remove(str);
            this.f282f.put(str, obj);
        } else if (this.d.remove(str)) {
            activityResultCallback.onActivityResult(obj);
        }
    }

    public final boolean b(int i2, int i3, Intent intent) {
        ActivityResultCallback activityResultCallback;
        String str = (String) this.f279a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.e.get(str);
        if (callbackAndContract == null || (activityResultCallback = callbackAndContract.f293a) == null || !this.d.contains(str)) {
            this.f282f.remove(str);
            this.f283g.putParcelable(str, new ActivityResult(i3, intent));
            return true;
        }
        activityResultCallback.onActivityResult(callbackAndContract.f294b.parseResult(i3, intent));
        this.d.remove(str);
        return true;
    }

    public abstract void c(int i2, ActivityResultContract activityResultContract, Object obj);

    public final ActivityResultLauncher d(final String str, final ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        f(str);
        this.e.put(str, new CallbackAndContract(activityResultContract, activityResultCallback));
        HashMap hashMap = this.f282f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        Bundle bundle = this.f283g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.f276a, activityResult.f277b));
        }
        return new ActivityResultLauncher<Object>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            public final ActivityResultContract a() {
                return activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void b(Object obj2) {
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                HashMap hashMap2 = activityResultRegistry.f280b;
                String str2 = str;
                Integer num = (Integer) hashMap2.get(str2);
                ActivityResultContract activityResultContract2 = activityResultContract;
                if (num != null) {
                    activityResultRegistry.d.add(str2);
                    try {
                        activityResultRegistry.c(num.intValue(), activityResultContract2, obj2);
                        return;
                    } catch (Exception e) {
                        activityResultRegistry.d.remove(str2);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract2 + " and input " + obj2 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void c() {
                ActivityResultRegistry.this.g(str);
            }
        };
    }

    public final ActivityResultLauncher e(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract activityResultContract, final ActivityResultCallback activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().compareTo(Lifecycle.State.d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        HashMap hashMap = this.f281c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) hashMap.get(str);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                boolean equals = Lifecycle.Event.ON_START.equals(event);
                String str2 = str;
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                if (!equals) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        activityResultRegistry.e.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            activityResultRegistry.g(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap hashMap2 = activityResultRegistry.e;
                ActivityResultContract activityResultContract2 = activityResultContract;
                ActivityResultCallback activityResultCallback2 = activityResultCallback;
                hashMap2.put(str2, new CallbackAndContract(activityResultContract2, activityResultCallback2));
                HashMap hashMap3 = activityResultRegistry.f282f;
                if (hashMap3.containsKey(str2)) {
                    Object obj = hashMap3.get(str2);
                    hashMap3.remove(str2);
                    activityResultCallback2.onActivityResult(obj);
                }
                Bundle bundle = activityResultRegistry.f283g;
                ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    activityResultCallback2.onActivityResult(activityResultContract2.parseResult(activityResult.f276a, activityResult.f277b));
                }
            }
        };
        lifecycleContainer.f295a.a(lifecycleEventObserver);
        lifecycleContainer.f296b.add(lifecycleEventObserver);
        hashMap.put(str, lifecycleContainer);
        return new ActivityResultLauncher<Object>() { // from class: androidx.activity.result.ActivityResultRegistry.2
            @Override // androidx.activity.result.ActivityResultLauncher
            public final ActivityResultContract a() {
                return activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void b(Object obj) {
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                HashMap hashMap2 = activityResultRegistry.f280b;
                String str2 = str;
                Integer num = (Integer) hashMap2.get(str2);
                ActivityResultContract activityResultContract2 = activityResultContract;
                if (num != null) {
                    activityResultRegistry.d.add(str2);
                    try {
                        activityResultRegistry.c(num.intValue(), activityResultContract2, obj);
                        return;
                    } catch (Exception e) {
                        activityResultRegistry.d.remove(str2);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void c() {
                ActivityResultRegistry.this.g(str);
            }
        };
    }

    public final void f(String str) {
        HashMap hashMap = this.f280b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        f.f31370a.getClass();
        int c2 = f.f31371b.c(2147418112);
        while (true) {
            int i2 = c2 + 65536;
            HashMap hashMap2 = this.f279a;
            if (!hashMap2.containsKey(Integer.valueOf(i2))) {
                hashMap2.put(Integer.valueOf(i2), str);
                hashMap.put(str, Integer.valueOf(i2));
                return;
            } else {
                f.f31370a.getClass();
                c2 = f.f31371b.c(2147418112);
            }
        }
    }

    public final void g(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.f280b.remove(str)) != null) {
            this.f279a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f282f;
        if (hashMap.containsKey(str)) {
            StringBuilder v2 = d.v("Dropping pending result for request ", str, ": ");
            v2.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", v2.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f283g;
        if (bundle.containsKey(str)) {
            StringBuilder v3 = d.v("Dropping pending result for request ", str, ": ");
            v3.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", v3.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f281c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) hashMap2.get(str);
        if (lifecycleContainer != null) {
            ArrayList arrayList = lifecycleContainer.f296b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lifecycleContainer.f295a.d((LifecycleEventObserver) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
