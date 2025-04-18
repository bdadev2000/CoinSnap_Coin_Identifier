package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import b1.o0;
import c1.e;
import d0.j;
import g1.u;
import h0.l;
import h0.m;

/* loaded from: classes3.dex */
public final class ViewModelKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SynchronizedObject f20120a = new Object();

    public static final CloseableCoroutineScope a(ViewModel viewModel) {
        CloseableCoroutineScope closeableCoroutineScope;
        p0.a.s(viewModel, "<this>");
        synchronized (f20120a) {
            closeableCoroutineScope = (CloseableCoroutineScope) viewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeableCoroutineScope == null) {
                l lVar = m.f30726a;
                try {
                    h1.d dVar = o0.f22355a;
                    lVar = ((e) u.f30639a).f22411g;
                } catch (j | IllegalStateException unused) {
                }
                CloseableCoroutineScope closeableCoroutineScope2 = new CloseableCoroutineScope(lVar.u(p0.a.d()));
                viewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeableCoroutineScope2);
                closeableCoroutineScope = closeableCoroutineScope2;
            }
        }
        return closeableCoroutineScope;
    }
}
