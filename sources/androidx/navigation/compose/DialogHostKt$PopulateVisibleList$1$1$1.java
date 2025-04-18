package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class DialogHostKt$PopulateVisibleList$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f20570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1$1(NavBackStackEntry navBackStackEntry, List list, boolean z2) {
        super(1);
        this.f20568a = navBackStackEntry;
        this.f20569b = z2;
        this.f20570c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LifecycleObserver, androidx.navigation.compose.a] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        final NavBackStackEntry navBackStackEntry = this.f20568a;
        final List list = this.f20570c;
        final boolean z2 = this.f20569b;
        final ?? r4 = new LifecycleEventObserver() { // from class: androidx.navigation.compose.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                boolean z3 = z2;
                List list2 = list;
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                if (z3 && !list2.contains(navBackStackEntry2)) {
                    list2.add(navBackStackEntry2);
                }
                if (event == Lifecycle.Event.ON_START && !list2.contains(navBackStackEntry2)) {
                    list2.add(navBackStackEntry2);
                }
                if (event == Lifecycle.Event.ON_STOP) {
                    list2.remove(navBackStackEntry2);
                }
            }
        };
        navBackStackEntry.f20333i.a(r4);
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                NavBackStackEntry.this.f20333i.d(r4);
            }
        };
    }
}
