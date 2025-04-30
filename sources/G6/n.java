package G6;

import G7.s;
import Q7.AbstractC0255x;
import a.AbstractC0325a;
import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0462f0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.V;
import com.airbnb.lottie.LottieAnimationView;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import java.util.ArrayList;
import n1.C2475f;
import o1.C2492a;
import p1.C2538b;
import q6.C2647a;
import u6.t0;

/* loaded from: classes3.dex */
public final class n extends x6.d<t0> {

    /* renamed from: c, reason: collision with root package name */
    public final F1.i f1316c = new F1.i(s.a(N6.j.class), new m(0, this), new m(2, this), new m(1, this));

    /* renamed from: d, reason: collision with root package name */
    public final h.c f1317d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1318f;

    /* renamed from: g, reason: collision with root package name */
    public F6.e f1319g;

    public n() {
        h.c registerForActivityResult = registerForActivityResult(new C0462f0(3), new F2.d(this, 1));
        G7.j.d(registerForActivityResult, "registerForActivityResult(...)");
        this.f1317d = registerForActivityResult;
        this.f1318f = new ArrayList();
    }

    @Override // x6.d
    public final int b() {
        return R.layout.layout_setting;
    }

    @Override // x6.d
    public final void d() {
        FragmentActivity requireActivity = requireActivity();
        G7.j.d(requireActivity, "requireActivity(...)");
        this.f1319g = new F6.e(requireActivity);
        FragmentActivity requireActivity2 = requireActivity();
        G7.j.d(requireActivity2, "requireActivity(...)");
        if (q6.c.f22801e.a().b() && AbstractC0325a.i(requireActivity2) && !C2538b.a().m && com.facebook.appevents.n.f13503g == null) {
            C2475f p2 = C2475f.p();
            C2647a c2647a = new C2647a(0);
            p2.getClass();
            C2475f.q(requireActivity2, "ca-app-pub-6691965685689933/4199917381", c2647a);
        }
    }

    @Override // x6.d
    public final void e() {
        F6.e eVar = this.f1319g;
        if (eVar != null) {
            eVar.f1224k = new f(this, 3);
        }
        if (eVar != null) {
            eVar.l = new f(this, 4);
        }
        ((t0) c()).f23418u.setAdapter(this.f1319g);
        InterfaceC0511v viewLifecycleOwner = getViewLifecycleOwner();
        G7.j.d(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0255x.l(V.f(viewLifecycleOwner), null, null, new l(this, null), 3);
    }

    @Override // x6.d
    public final void f() {
        t0 t0Var = (t0) c();
        TextView textView = t0Var.f23419v;
        G7.j.d(textView, "tvAddNew");
        com.bumptech.glide.d.I(textView, new f(this, 0));
        ConstraintLayout constraintLayout = t0Var.f23414q;
        G7.j.d(constraintLayout, "constraintAddNewImage");
        com.bumptech.glide.d.I(constraintLayout, new f(this, 1));
        LottieAnimationView lottieAnimationView = t0Var.f23417t;
        G7.j.d(lottieAnimationView, "lottiePremium");
        com.bumptech.glide.d.I(lottieAnimationView, new f(this, 2));
    }

    public final N6.j h() {
        return (N6.j) this.f1316c.getValue();
    }

    public final void i() {
        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(requireContext().getApplicationContext());
        G7.j.d(checkAvailability, "checkAvailability(...)");
        if (checkAvailability.isSupported()) {
            if (requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                try {
                    j(new E6.d(this, 1));
                    return;
                } catch (UnavailableUserDeclinedInstallationException unused) {
                    Toast.makeText(requireContext(), R.string.unavailable_declined_install, 1).show();
                    return;
                } catch (Exception unused2) {
                    Toast.makeText(requireContext(), R.string.not_support_ar, 0).show();
                    return;
                }
            }
            if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                g(PermissionActivity.class, null);
                return;
            } else {
                g(PermissionActivity.class, null);
                return;
            }
        }
        Toast.makeText(requireContext(), R.string.not_support_ar, 0).show();
    }

    public final void j(E6.d dVar) {
        FragmentActivity requireActivity = requireActivity();
        G7.j.d(requireActivity, "requireActivity(...)");
        if (AbstractC0325a.i(requireActivity) && q6.c.f22801e.a().b()) {
            C2475f p2 = C2475f.p();
            Context requireContext = requireContext();
            C2492a c2492a = com.facebook.appevents.n.f13503g;
            d dVar2 = new d(dVar, 1);
            p2.getClass();
            C2475f.n(dVar2, requireContext, c2492a);
            return;
        }
        dVar.invoke();
    }
}
