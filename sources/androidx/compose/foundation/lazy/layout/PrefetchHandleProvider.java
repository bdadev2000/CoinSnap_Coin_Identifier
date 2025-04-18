package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.collection.MutableObjectLongMap;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.unit.Constraints;
import e0.w;
import java.util.List;
import p0.a;
import q0.l;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public final class PrefetchHandleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutItemContentFactory f4888a;

    /* renamed from: b, reason: collision with root package name */
    public final SubcomposeLayoutState f4889b;

    /* renamed from: c, reason: collision with root package name */
    public final PrefetchScheduler f4890c;

    @ExperimentalFoundationApi
    /* loaded from: classes2.dex */
    public final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {

        /* renamed from: a, reason: collision with root package name */
        public final int f4891a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4892b;

        /* renamed from: c, reason: collision with root package name */
        public final PrefetchMetrics f4893c;
        public SubcomposeLayoutState.PrecomposedSlotHandle d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4894f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f4895g;

        /* renamed from: h, reason: collision with root package name */
        public NestedPrefetchController f4896h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4897i;

        /* loaded from: classes2.dex */
        public final class NestedPrefetchController {

            /* renamed from: a, reason: collision with root package name */
            public final List f4899a;

            /* renamed from: b, reason: collision with root package name */
            public final List[] f4900b;

            /* renamed from: c, reason: collision with root package name */
            public int f4901c;
            public int d;

            public NestedPrefetchController(List list) {
                this.f4899a = list;
                this.f4900b = new List[list.size()];
                if (!(!list.isEmpty())) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states".toString());
                }
            }
        }

        public HandleAndRequestImpl(int i2, long j2, PrefetchMetrics prefetchMetrics) {
            this.f4891a = i2;
            this.f4892b = j2;
            this.f4893c = prefetchMetrics;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public final boolean a(AndroidPrefetchScheduler.PrefetchRequestScopeImpl prefetchRequestScopeImpl) {
            List list;
            if (!c()) {
                return false;
            }
            Object d = ((LazyLayoutItemProvider) PrefetchHandleProvider.this.f4888a.f4777b.invoke()).d(this.f4891a);
            boolean z2 = this.d != null;
            PrefetchMetrics prefetchMetrics = this.f4893c;
            if (!z2) {
                long b2 = (d == null || prefetchMetrics.f4903a.a(d) < 0) ? prefetchMetrics.f4905c : prefetchMetrics.f4903a.b(d);
                long a2 = prefetchRequestScopeImpl.a();
                if ((!this.f4897i || a2 <= 0) && b2 >= a2) {
                    return true;
                }
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (d != null) {
                        MutableObjectLongMap mutableObjectLongMap = prefetchMetrics.f4903a;
                        int a3 = mutableObjectLongMap.a(d);
                        prefetchMetrics.f4903a.e(PrefetchMetrics.a(prefetchMetrics, nanoTime2, a3 >= 0 ? mutableObjectLongMap.f1555c[a3] : 0L), d);
                    }
                    prefetchMetrics.f4905c = PrefetchMetrics.a(prefetchMetrics, nanoTime2, prefetchMetrics.f4905c);
                } finally {
                }
            }
            if (!this.f4897i) {
                if (!this.f4895g) {
                    if (prefetchRequestScopeImpl.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f4896h = f();
                        this.f4895g = true;
                    } finally {
                    }
                }
                NestedPrefetchController nestedPrefetchController = this.f4896h;
                if (nestedPrefetchController != null) {
                    List[] listArr = nestedPrefetchController.f4900b;
                    int i2 = nestedPrefetchController.f4901c;
                    List list2 = nestedPrefetchController.f4899a;
                    if (i2 < list2.size()) {
                        if (!(!HandleAndRequestImpl.this.f4894f)) {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request".toString());
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (nestedPrefetchController.f4901c < list2.size()) {
                            try {
                                if (listArr[nestedPrefetchController.f4901c] == null) {
                                    if (prefetchRequestScopeImpl.a() <= 0) {
                                        return true;
                                    }
                                    int i3 = nestedPrefetchController.f4901c;
                                    LazyLayoutPrefetchState lazyLayoutPrefetchState = (LazyLayoutPrefetchState) list2.get(i3);
                                    l lVar = lazyLayoutPrefetchState.f4835b;
                                    if (lVar == null) {
                                        list = w.f30218a;
                                    } else {
                                        LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new LazyLayoutPrefetchState.NestedPrefetchScopeImpl();
                                        lVar.invoke(nestedPrefetchScopeImpl);
                                        list = nestedPrefetchScopeImpl.f4837a;
                                    }
                                    listArr[i3] = list;
                                }
                                List list3 = listArr[nestedPrefetchController.f4901c];
                                a.p(list3);
                                while (nestedPrefetchController.d < list3.size()) {
                                    if (((PrefetchRequest) list3.get(nestedPrefetchController.d)).a(prefetchRequestScopeImpl)) {
                                        return true;
                                    }
                                    nestedPrefetchController.d++;
                                }
                                nestedPrefetchController.d = 0;
                                nestedPrefetchController.f4901c++;
                            } finally {
                            }
                        }
                    }
                }
            }
            if (!this.e) {
                long j2 = this.f4892b;
                if (!Constraints.l(j2)) {
                    long b3 = (d == null || prefetchMetrics.f4904b.a(d) < 0) ? prefetchMetrics.d : prefetchMetrics.f4904b.b(d);
                    long a4 = prefetchRequestScopeImpl.a();
                    if ((!this.f4897i || a4 <= 0) && b3 >= a4) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j2);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (d != null) {
                            MutableObjectLongMap mutableObjectLongMap2 = prefetchMetrics.f4904b;
                            int a5 = mutableObjectLongMap2.a(d);
                            prefetchMetrics.f4904b.e(PrefetchMetrics.a(prefetchMetrics, nanoTime4, a5 >= 0 ? mutableObjectLongMap2.f1555c[a5] : 0L), d);
                        }
                        prefetchMetrics.d = PrefetchMetrics.a(prefetchMetrics, nanoTime4, prefetchMetrics.d);
                    } finally {
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void b() {
            this.f4897i = true;
        }

        public final boolean c() {
            if (!this.f4894f) {
                int itemCount = ((LazyLayoutItemProvider) PrefetchHandleProvider.this.f4888a.f4777b.invoke()).getItemCount();
                int i2 = this.f4891a;
                if (i2 >= 0 && i2 < itemCount) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public final void cancel() {
            if (this.f4894f) {
                return;
            }
            this.f4894f = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.d = null;
        }

        public final void d() {
            if (!c()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()".toString());
            }
            if (this.d != null) {
                throw new IllegalArgumentException("Request was already composed!".toString());
            }
            PrefetchHandleProvider prefetchHandleProvider = PrefetchHandleProvider.this;
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) prefetchHandleProvider.f4888a.f4777b.invoke();
            int i2 = this.f4891a;
            Object c2 = lazyLayoutItemProvider.c(i2);
            this.d = prefetchHandleProvider.f4889b.a().g(c2, prefetchHandleProvider.f4888a.a(i2, c2, lazyLayoutItemProvider.d(i2)));
        }

        public final void e(long j2) {
            if (!(!this.f4894f)) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()".toString());
            }
            if (!(!this.e)) {
                throw new IllegalArgumentException("Request was already measured!".toString());
            }
            this.e = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            if (precomposedSlotHandle == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()".toString());
            }
            int b2 = precomposedSlotHandle.b();
            for (int i2 = 0; i2 < b2; i2++) {
                precomposedSlotHandle.a(i2, j2);
            }
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
        public final NestedPrefetchController f() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.d;
            if (precomposedSlotHandle == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states".toString());
            }
            ?? obj = new Object();
            precomposedSlotHandle.c(new PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1(obj));
            List list = (List) obj.f30930a;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.f4891a);
            sb.append(", constraints = ");
            sb.append((Object) Constraints.m(this.f4892b));
            sb.append(", isComposed = ");
            sb.append(this.d != null);
            sb.append(", isMeasured = ");
            sb.append(this.e);
            sb.append(", isCanceled = ");
            sb.append(this.f4894f);
            sb.append(" }");
            return sb.toString();
        }
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.f4888a = lazyLayoutItemContentFactory;
        this.f4889b = subcomposeLayoutState;
        this.f4890c = prefetchScheduler;
    }
}
