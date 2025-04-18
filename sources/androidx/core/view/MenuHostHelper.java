package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class MenuHostHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f18713a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f18714b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18715c = new HashMap();

    /* loaded from: classes3.dex */
    public static class LifecycleContainer {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f18716a;

        /* renamed from: b, reason: collision with root package name */
        public LifecycleEventObserver f18717b;

        public LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f18716a = lifecycle;
            this.f18717b = lifecycleEventObserver;
            lifecycle.a(lifecycleEventObserver);
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f18713a = runnable;
    }

    public final void a(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.f18714b.add(menuProvider);
        this.f18713a.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap hashMap = this.f18715c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) hashMap.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f18716a.d(lifecycleContainer.f18717b);
            lifecycleContainer.f18717b = null;
        }
        hashMap.put(menuProvider, new LifecycleContainer(lifecycle, new c(0, this, menuProvider)));
    }

    public final void b(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap hashMap = this.f18715c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) hashMap.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f18716a.d(lifecycleContainer.f18717b);
            lifecycleContainer.f18717b = null;
        }
        hashMap.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = MenuHostHelper.this;
                menuHostHelper.getClass();
                Lifecycle.Event.Companion.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event c2 = Lifecycle.Event.Companion.c(state2);
                Runnable runnable = menuHostHelper.f18713a;
                CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper.f18714b;
                MenuProvider menuProvider2 = menuProvider;
                if (event == c2) {
                    copyOnWriteArrayList.add(menuProvider2);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.c(menuProvider2);
                } else if (event == Lifecycle.Event.Companion.a(state2)) {
                    copyOnWriteArrayList.remove(menuProvider2);
                    runnable.run();
                }
            }
        }));
    }

    public final void c(MenuProvider menuProvider) {
        this.f18714b.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.f18715c.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f18716a.d(lifecycleContainer.f18717b);
            lifecycleContainer.f18717b = null;
        }
        this.f18713a.run();
    }
}
