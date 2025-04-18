package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Latch;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import d0.b0;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements WindowRecomposerFactory {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    public final Recomposer a(final View view) {
        h0.l lVar;
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.f16660a;
        h0.m mVar = h0.m.f30726a;
        d0.p pVar = AndroidUiDispatcher.f16372n;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lVar = (h0.l) AndroidUiDispatcher.f16372n.getValue();
        } else {
            lVar = AndroidUiDispatcher.f16373o.get();
            if (lVar == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
            }
        }
        h0.l u2 = lVar.u(mVar);
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) u2.i(MonotonicFrameClock.Key.f13830a);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            Latch latch = pausableMonotonicFrameClock2.f13845b;
            synchronized (latch.f13821a) {
                latch.d = false;
            }
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = 0;
        }
        final ?? obj = new Object();
        h0.l lVar2 = (MotionDurationScale) u2.i(MotionDurationScale.Key.f14701a);
        if (lVar2 == null) {
            lVar2 = new MotionDurationScaleImpl();
            obj.f30930a = lVar2;
        }
        if (pausableMonotonicFrameClock != 0) {
            mVar = pausableMonotonicFrameClock;
        }
        h0.l u3 = u2.u(mVar).u(lVar2);
        final Recomposer recomposer = new Recomposer(u3);
        synchronized (recomposer.f13878b) {
            recomposer.f13893s = true;
        }
        final g1.f c2 = p0.a.c(u3);
        LifecycleOwner a2 = ViewTreeLifecycleOwner.a(view);
        Lifecycle lifecycle = a2 != null ? a2.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.B();
                }
            });
            lifecycle.a(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* loaded from: classes2.dex */
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f16667a;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        f16667a = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    boolean z2;
                    int i2 = WhenMappings.f16667a[event.ordinal()];
                    b1.k kVar = null;
                    if (i2 == 1) {
                        kotlin.jvm.internal.e.v(c2, null, 4, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(obj, recomposer, lifecycleOwner, this, view, null), 1);
                        return;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return;
                            }
                            recomposer.B();
                            return;
                        } else {
                            Recomposer recomposer2 = recomposer;
                            synchronized (recomposer2.f13878b) {
                                recomposer2.f13893s = true;
                            }
                            return;
                        }
                    }
                    PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        Latch latch2 = pausableMonotonicFrameClock3.f13845b;
                        synchronized (latch2.f13821a) {
                            try {
                                synchronized (latch2.f13821a) {
                                    z2 = latch2.d;
                                }
                                if (!z2) {
                                    List list = latch2.f13822b;
                                    latch2.f13822b = latch2.f13823c;
                                    latch2.f13823c = list;
                                    latch2.d = true;
                                    int size = list.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        ((h0.g) list.get(i3)).resumeWith(b0.f30125a);
                                    }
                                    list.clear();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Recomposer recomposer3 = recomposer;
                    synchronized (recomposer3.f13878b) {
                        if (recomposer3.f13893s) {
                            recomposer3.f13893s = false;
                            kVar = recomposer3.C();
                        }
                    }
                    if (kVar != null) {
                        kVar.resumeWith(b0.f30125a);
                    }
                }
            });
            return recomposer;
        }
        InlineClassHelperKt.c("ViewTreeLifecycleOwner not found from " + view);
        throw null;
    }
}
