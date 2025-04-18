package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AnimationHandler {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f19462f = new ThreadLocal();
    public FrameCallbackProvider16 d;

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f19463a = new SimpleArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19464b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final AnimationCallbackDispatcher f19465c = new AnimationCallbackDispatcher();
    public boolean e = false;

    /* loaded from: classes.dex */
    public class AnimationCallbackDispatcher {
        public AnimationCallbackDispatcher() {
        }

        public final void a() {
            ArrayList arrayList;
            long uptimeMillis = SystemClock.uptimeMillis();
            AnimationHandler animationHandler = AnimationHandler.this;
            animationHandler.getClass();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            int i2 = 0;
            while (true) {
                arrayList = animationHandler.f19464b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                AnimationFrameCallback animationFrameCallback = (AnimationFrameCallback) arrayList.get(i2);
                if (animationFrameCallback != null) {
                    SimpleArrayMap simpleArrayMap = animationHandler.f19463a;
                    Long l2 = (Long) simpleArrayMap.get(animationFrameCallback);
                    if (l2 != null) {
                        if (l2.longValue() < uptimeMillis2) {
                            simpleArrayMap.remove(animationFrameCallback);
                        }
                    }
                    animationFrameCallback.a(uptimeMillis);
                }
                i2++;
            }
            if (animationHandler.e) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                animationHandler.e = false;
            }
            if (arrayList.size() > 0) {
                if (animationHandler.d == null) {
                    animationHandler.d = new FrameCallbackProvider16(animationHandler.f19465c);
                }
                animationHandler.d.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface AnimationFrameCallback {
        boolean a(long j2);
    }

    /* loaded from: classes.dex */
    public static abstract class AnimationFrameCallbackProvider {

        /* renamed from: a, reason: collision with root package name */
        public final AnimationCallbackDispatcher f19467a;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.f19467a = animationCallbackDispatcher;
        }
    }

    /* loaded from: classes.dex */
    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {

        /* renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                SystemClock.uptimeMillis();
                throw null;
            }
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {

        /* renamed from: b, reason: collision with root package name */
        public final Choreographer f19468b;

        /* renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f19469c;

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.f19468b = Choreographer.getInstance();
            this.f19469c = new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j2) {
                    FrameCallbackProvider16.this.f19467a.a();
                }
            };
        }

        public final void a() {
            this.f19468b.postFrameCallback(this.f19469c);
        }
    }
}
