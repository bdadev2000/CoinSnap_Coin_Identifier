package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 f4698g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutBeyondBoundsState f4699a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f4700b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4701c;
    public final LayoutDirection d;

    /* renamed from: f, reason: collision with root package name */
    public final Orientation f4702f;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, LayoutDirection layoutDirection, Orientation orientation) {
        this.f4699a = lazyLayoutBeyondBoundsState;
        this.f4700b = lazyLayoutBeyondBoundsInfo;
        this.f4701c = z2;
        this.d = layoutDirection;
        this.f4702f = orientation;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    public final Object a(final int i2, l lVar) {
        LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState = this.f4699a;
        if (lazyLayoutBeyondBoundsState.getItemCount() <= 0 || !lazyLayoutBeyondBoundsState.b()) {
            return lVar.invoke(f4698g);
        }
        int d = c(i2) ? lazyLayoutBeyondBoundsState.d() : lazyLayoutBeyondBoundsState.c();
        final ?? obj = new Object();
        LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo = this.f4700b;
        lazyLayoutBeyondBoundsInfo.getClass();
        LazyLayoutBeyondBoundsInfo.Interval interval = new LazyLayoutBeyondBoundsInfo.Interval(d, d);
        MutableVector mutableVector = lazyLayoutBeyondBoundsInfo.f4695a;
        mutableVector.b(interval);
        obj.f30930a = interval;
        Object obj2 = null;
        while (obj2 == null && b((LazyLayoutBeyondBoundsInfo.Interval) obj.f30930a, i2)) {
            LazyLayoutBeyondBoundsInfo.Interval interval2 = (LazyLayoutBeyondBoundsInfo.Interval) obj.f30930a;
            int i3 = interval2.f4696a;
            boolean c2 = c(i2);
            int i4 = interval2.f4697b;
            if (c2) {
                i4++;
            } else {
                i3--;
            }
            LazyLayoutBeyondBoundsInfo.Interval interval3 = new LazyLayoutBeyondBoundsInfo.Interval(i3, i4);
            mutableVector.b(interval3);
            mutableVector.n((LazyLayoutBeyondBoundsInfo.Interval) obj.f30930a);
            obj.f30930a = interval3;
            lazyLayoutBeyondBoundsState.a();
            obj2 = lVar.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public final boolean a() {
                    return LazyLayoutBeyondBoundsModifierLocal.this.b((LazyLayoutBeyondBoundsInfo.Interval) obj.f30930a, i2);
                }
            });
        }
        mutableVector.n((LazyLayoutBeyondBoundsInfo.Interval) obj.f30930a);
        lazyLayoutBeyondBoundsState.a();
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r3 == androidx.compose.foundation.gestures.Orientation.f3394a) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0015, code lost:
    
        if (r3 == androidx.compose.foundation.gestures.Orientation.f3395b) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo.Interval r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            r1 = 0
            r2 = 1
            androidx.compose.foundation.gestures.Orientation r3 = r4.f4702f
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            r0 = 6
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            if (r0 == 0) goto L18
        L13:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.f3395b
            if (r3 != r0) goto L3a
            goto L2b
        L18:
            r0 = 3
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            if (r0 == 0) goto L20
            goto L27
        L20:
            r0 = 4
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            if (r0 == 0) goto L2c
        L27:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.f3394a
            if (r3 != r0) goto L3a
        L2b:
            return r1
        L2c:
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r2)
            if (r0 == 0) goto L33
            goto L3a
        L33:
            r0 = 2
            boolean r0 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.a(r6, r0)
            if (r0 == 0) goto L53
        L3a:
            boolean r6 = r4.c(r6)
            if (r6 == 0) goto L4d
            int r5 = r5.f4697b
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r6 = r4.f4699a
            int r6 = r6.getItemCount()
            int r6 = r6 - r2
            if (r5 >= r6) goto L52
        L4b:
            r1 = r2
            goto L52
        L4d:
            int r5 = r5.f4696a
            if (r5 <= 0) goto L52
            goto L4b
        L52:
            return r1
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.b(androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo$Interval, int):boolean");
    }

    public final boolean c(int i2) {
        if (!BeyondBoundsLayout.LayoutDirection.a(i2, 1)) {
            if (BeyondBoundsLayout.LayoutDirection.a(i2, 2)) {
                return true;
            }
            boolean a2 = BeyondBoundsLayout.LayoutDirection.a(i2, 5);
            boolean z2 = this.f4701c;
            if (!a2) {
                if (!BeyondBoundsLayout.LayoutDirection.a(i2, 6)) {
                    boolean a3 = BeyondBoundsLayout.LayoutDirection.a(i2, 3);
                    LayoutDirection layoutDirection = this.d;
                    if (a3) {
                        int ordinal = layoutDirection.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new RuntimeException();
                            }
                            if (!z2) {
                                return true;
                            }
                        }
                    } else {
                        if (!BeyondBoundsLayout.LayoutDirection.a(i2, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int ordinal2 = layoutDirection.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new RuntimeException();
                            }
                        } else if (!z2) {
                            return true;
                        }
                    }
                } else if (!z2) {
                    return true;
                }
            }
            return z2;
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return BeyondBoundsLayoutKt.f15716a;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return this;
    }
}
