package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import e0.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes2.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f166a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f167b = null;

    /* renamed from: c, reason: collision with root package name */
    public final n f168c = new n();
    public OnBackPressedCallback d;
    public final OnBackInvokedCallback e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f171h;

    /* renamed from: androidx.activity.OnBackPressedDispatcher$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Object obj2;
            BackEventCompat backEventCompat = (BackEventCompat) obj;
            p0.a.s(backEventCompat, "backEvent");
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            n nVar = onBackPressedDispatcher.f168c;
            ListIterator listIterator = nVar.listIterator(nVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((OnBackPressedCallback) obj2).f163a) {
                    break;
                }
            }
            OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) obj2;
            onBackPressedDispatcher.d = onBackPressedCallback;
            if (onBackPressedCallback != null) {
                onBackPressedCallback.d(backEventCompat);
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Object obj2;
            BackEventCompat backEventCompat = (BackEventCompat) obj;
            p0.a.s(backEventCompat, "backEvent");
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            OnBackPressedCallback onBackPressedCallback = onBackPressedDispatcher.d;
            if (onBackPressedCallback == null) {
                n nVar = onBackPressedDispatcher.f168c;
                ListIterator listIterator = nVar.listIterator(nVar.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listIterator.previous();
                    if (((OnBackPressedCallback) obj2).f163a) {
                        break;
                    }
                }
                onBackPressedCallback = (OnBackPressedCallback) obj2;
            }
            if (onBackPressedCallback != null) {
                onBackPressedCallback.c(backEventCompat);
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass3 extends r implements q0.a {
        public AnonymousClass3() {
            super(0);
        }

        @Override // q0.a
        public final Object invoke() {
            OnBackPressedDispatcher.this.c();
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass4 extends r implements q0.a {
        public AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
        @Override // q0.a
        public final Object invoke() {
            OnBackPressedCallback onBackPressedCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            OnBackPressedCallback onBackPressedCallback2 = onBackPressedDispatcher.d;
            if (onBackPressedCallback2 == null) {
                n nVar = onBackPressedDispatcher.f168c;
                ListIterator listIterator = nVar.listIterator(nVar.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        onBackPressedCallback = 0;
                        break;
                    }
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).f163a) {
                        break;
                    }
                }
                onBackPressedCallback2 = onBackPressedCallback;
            }
            onBackPressedDispatcher.d = null;
            if (onBackPressedCallback2 != null) {
                onBackPressedCallback2.a();
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass5 extends r implements q0.a {
        public AnonymousClass5() {
            super(0);
        }

        @Override // q0.a
        public final Object invoke() {
            OnBackPressedDispatcher.this.c();
            return b0.f30125a;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api33Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Api33Impl f177a = new Object();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback a(@NotNull final q0.a aVar) {
            p0.a.s(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.g
                public final void onBackInvoked() {
                    q0.a aVar2 = q0.a.this;
                    p0.a.s(aVar2, "$onBackInvoked");
                    aVar2.invoke();
                }
            };
        }

        @DoNotInline
        public final void b(@NotNull Object obj, int i2, @NotNull Object obj2) {
            p0.a.s(obj, "dispatcher");
            p0.a.s(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public final void c(@NotNull Object obj, @NotNull Object obj2) {
            p0.a.s(obj, "dispatcher");
            p0.a.s(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api34Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Api34Impl f178a = new Object();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback a(@NotNull final l lVar, @NotNull final l lVar2, @NotNull final q0.a aVar, @NotNull final q0.a aVar2) {
            p0.a.s(lVar, "onBackStarted");
            p0.a.s(lVar2, "onBackProgressed");
            p0.a.s(aVar, "onBackInvoked");
            p0.a.s(aVar2, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public final void onBackCancelled() {
                    aVar2.invoke();
                }

                public final void onBackInvoked() {
                    aVar.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    p0.a.s(backEvent, "backEvent");
                    lVar2.invoke(new BackEventCompat(backEvent));
                }

                public final void onBackStarted(BackEvent backEvent) {
                    p0.a.s(backEvent, "backEvent");
                    l.this.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* loaded from: classes2.dex */
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f182a;

        /* renamed from: b, reason: collision with root package name */
        public final OnBackPressedCallback f183b;

        /* renamed from: c, reason: collision with root package name */
        public Cancellable f184c;
        public final /* synthetic */ OnBackPressedDispatcher d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            p0.a.s(onBackPressedCallback, "onBackPressedCallback");
            this.d = onBackPressedDispatcher;
            this.f182a = lifecycle;
            this.f183b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f184c = this.d.b(this.f183b);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.f184c;
                if (cancellable != null) {
                    ((OnBackPressedCancellable) cancellable).cancel();
                }
            }
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            this.f182a.d(this);
            OnBackPressedCallback onBackPressedCallback = this.f183b;
            onBackPressedCallback.getClass();
            onBackPressedCallback.f164b.remove(this);
            Cancellable cancellable = this.f184c;
            if (cancellable != null) {
                ((OnBackPressedCancellable) cancellable).cancel();
            }
            this.f184c = null;
        }
    }

    /* loaded from: classes2.dex */
    public final class OnBackPressedCancellable implements Cancellable {

        /* renamed from: a, reason: collision with root package name */
        public final OnBackPressedCallback f185a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f186b;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            p0.a.s(onBackPressedCallback, "onBackPressedCallback");
            this.f186b = onBackPressedDispatcher;
            this.f185a = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f186b;
            n nVar = onBackPressedDispatcher.f168c;
            OnBackPressedCallback onBackPressedCallback = this.f185a;
            nVar.remove(onBackPressedCallback);
            if (p0.a.g(onBackPressedDispatcher.d, onBackPressedCallback)) {
                onBackPressedCallback.a();
                onBackPressedDispatcher.d = null;
            }
            onBackPressedCallback.getClass();
            onBackPressedCallback.f164b.remove(this);
            q0.a aVar = onBackPressedCallback.f165c;
            if (aVar != null) {
                aVar.invoke();
            }
            onBackPressedCallback.f165c = null;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f166a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.e = i2 >= 34 ? Api34Impl.f178a.a(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4()) : Api33Impl.f177a.a(new AnonymousClass5());
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [q0.a, kotlin.jvm.internal.n] */
    public final void a(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        p0.a.s(lifecycleOwner, "owner");
        p0.a.s(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.f19987a) {
            return;
        }
        onBackPressedCallback.f164b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f165c = new kotlin.jvm.internal.n(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q0.a, kotlin.jvm.internal.n] */
    public final Cancellable b(OnBackPressedCallback onBackPressedCallback) {
        p0.a.s(onBackPressedCallback, "onBackPressedCallback");
        this.f168c.addLast(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.f164b.add(onBackPressedCancellable);
        e();
        onBackPressedCallback.f165c = new kotlin.jvm.internal.n(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        return onBackPressedCancellable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.d;
        if (onBackPressedCallback2 == null) {
            n nVar = this.f168c;
            ListIterator listIterator = nVar.listIterator(nVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = 0;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).f163a) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.d = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.b();
            return;
        }
        Runnable runnable = this.f166a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z2) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f169f;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.e) == null) {
            return;
        }
        Api33Impl api33Impl = Api33Impl.f177a;
        if (z2 && !this.f170g) {
            api33Impl.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f170g = true;
        } else {
            if (z2 || !this.f170g) {
                return;
            }
            api33Impl.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f170g = false;
        }
    }

    public final void e() {
        boolean z2 = this.f171h;
        n nVar = this.f168c;
        boolean z3 = false;
        if (!(nVar instanceof Collection) || !nVar.isEmpty()) {
            Iterator<E> it = nVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((OnBackPressedCallback) it.next()).f163a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f171h = z3;
        if (z3 != z2) {
            Consumer consumer = this.f167b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z3));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                d(z3);
            }
        }
    }
}
