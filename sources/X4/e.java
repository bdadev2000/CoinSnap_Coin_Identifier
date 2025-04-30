package X4;

import a5.C0397a;
import androidx.fragment.app.AbstractC0464g0;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.Trace;
import g5.C2303f;
import h5.AbstractC2327h;
import h5.C2323d;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class e extends AbstractC0464g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C0397a f3692f = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f3693a = new WeakHashMap();
    public final R3.e b;

    /* renamed from: c, reason: collision with root package name */
    public final C2303f f3694c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3695d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3696e;

    public e(R3.e eVar, C2303f c2303f, c cVar, f fVar) {
        this.b = eVar;
        this.f3694c = c2303f;
        this.f3695d = cVar;
        this.f3696e = fVar;
    }

    @Override // androidx.fragment.app.AbstractC0464g0
    public final void a(Fragment fragment) {
        C2323d c2323d;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        C0397a c0397a = f3692f;
        c0397a.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f3693a;
        if (!weakHashMap.containsKey(fragment)) {
            c0397a.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        f fVar = this.f3696e;
        boolean z8 = fVar.f3700d;
        C0397a c0397a2 = f.f3697e;
        if (!z8) {
            c0397a2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            c2323d = new C2323d();
        } else {
            Map map = fVar.f3699c;
            if (!map.containsKey(fragment)) {
                c0397a2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                c2323d = new C2323d();
            } else {
                b5.d dVar = (b5.d) map.remove(fragment);
                C2323d a6 = fVar.a();
                if (!a6.b()) {
                    c0397a2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    c2323d = new C2323d();
                } else {
                    b5.d dVar2 = (b5.d) a6.a();
                    dVar2.getClass();
                    c2323d = new C2323d(new b5.d(dVar2.f5322a - dVar.f5322a, dVar2.b - dVar.b, dVar2.f5323c - dVar.f5323c));
                }
            }
        }
        if (!c2323d.b()) {
            c0397a.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            AbstractC2327h.a(trace, (b5.d) c2323d.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.AbstractC0464g0
    public final void b(Fragment fragment) {
        String simpleName;
        f3692f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.f3694c, this.b, this.f3695d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f3693a.put(fragment, trace);
        f fVar = this.f3696e;
        boolean z8 = fVar.f3700d;
        C0397a c0397a = f.f3697e;
        if (!z8) {
            c0397a.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        Map map = fVar.f3699c;
        if (map.containsKey(fragment)) {
            c0397a.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        C2323d a6 = fVar.a();
        if (!a6.b()) {
            c0397a.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        } else {
            map.put(fragment, (b5.d) a6.a());
        }
    }
}
