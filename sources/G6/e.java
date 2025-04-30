package G6;

import a.AbstractC0325a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.bubble.BubbleActivity;
import com.tools.arruler.ui.component.iap.IAPActivity;
import com.tools.arruler.ui.component.permission.PermissionActivity;
import com.tools.arruler.ui.component.protractor.ProtractorActivity;
import com.tools.arruler.ui.component.setting.SettingActivity;
import com.tools.arruler.ui.component.straight.StraightRulerActivity;
import n1.C2473d;
import n1.C2475f;
import o1.C2492a;
import o1.C2493b;
import p1.C2538b;
import q6.C2647a;
import t7.y;
import u6.o0;

/* loaded from: classes3.dex */
public final class e extends x6.d<o0> {
    @Override // x6.d
    public final int b() {
        return R.layout.layout_home;
    }

    @Override // x6.d
    public final void d() {
        FragmentActivity requireActivity = requireActivity();
        G7.j.d(requireActivity, "requireActivity(...)");
        if (q6.c.f22801e.a().b() && AbstractC0325a.i(requireActivity) && !C2538b.a().m && com.facebook.appevents.n.f13504h == null) {
            C2475f p2 = C2475f.p();
            C2647a c2647a = new C2647a(1);
            p2.getClass();
            C2475f.q(requireActivity, "ca-app-pub-6691965685689933/7176311382", c2647a);
        }
    }

    @Override // x6.d
    public final void f() {
        o0 o0Var = (o0) c();
        LottieAnimationView lottieAnimationView = o0Var.f23380t;
        G7.j.d(lottieAnimationView, "lottiePremium");
        final int i9 = 0;
        com.bumptech.glide.d.I(lottieAnimationView, new F7.l(this) { // from class: G6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1299c;

            {
                this.f1299c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        e eVar = this.f1299c;
                        G7.j.e(eVar, "this$0");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IAP_FROM_MAIN", true);
                        eVar.g(IAPActivity.class, bundle);
                        return y.f23029a;
                    case 1:
                        final e eVar2 = this.f1299c;
                        G7.j.e(eVar2, "this$0");
                        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(eVar2.requireContext().getApplicationContext());
                        G7.j.d(checkAvailability, "checkAvailability(...)");
                        if (checkAvailability.isSupported()) {
                            if (eVar2.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                                try {
                                    final int i10 = 0;
                                    eVar2.h(new F7.a() { // from class: G6.b
                                        @Override // F7.a
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    e eVar3 = eVar2;
                                                    G7.j.e(eVar3, "this$0");
                                                    int i11 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar3.requireActivity(), false).ordinal()];
                                                    if (i11 != 1) {
                                                        if (i11 != 2) {
                                                            throw new RuntimeException();
                                                        }
                                                    } else {
                                                        eVar3.startActivity(new Intent(eVar3.requireContext(), (Class<?>) ArRulerActivity.class));
                                                    }
                                                    return y.f23029a;
                                                case 1:
                                                    e eVar4 = eVar2;
                                                    G7.j.e(eVar4, "this$0");
                                                    eVar4.g(StraightRulerActivity.class, null);
                                                    return y.f23029a;
                                                case 2:
                                                    e eVar5 = eVar2;
                                                    G7.j.e(eVar5, "this$0");
                                                    eVar5.g(ProtractorActivity.class, null);
                                                    return y.f23029a;
                                                default:
                                                    e eVar6 = eVar2;
                                                    G7.j.e(eVar6, "this$0");
                                                    eVar6.g(BubbleActivity.class, null);
                                                    return y.f23029a;
                                            }
                                        }
                                    });
                                } catch (UnavailableUserDeclinedInstallationException unused) {
                                    Toast.makeText(eVar2.requireContext(), R.string.unavailable_declined_install, 1).show();
                                } catch (Exception unused2) {
                                    Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                                }
                            } else if (eVar2.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                Log.e("TAG", "onOpenAr: request 1");
                                eVar2.g(PermissionActivity.class, null);
                            } else {
                                Log.e("TAG", "onOpenAr: request 2");
                                eVar2.g(PermissionActivity.class, null);
                            }
                        } else {
                            Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                        }
                        return y.f23029a;
                    case 2:
                        final e eVar3 = this.f1299c;
                        G7.j.e(eVar3, "this$0");
                        if (eVar3.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i11 = 2;
                            eVar3.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            e eVar32 = eVar3;
                                            G7.j.e(eVar32, "this$0");
                                            int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i112 != 1) {
                                                if (i112 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar4 = eVar3;
                                            G7.j.e(eVar4, "this$0");
                                            eVar4.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar5 = eVar3;
                                            G7.j.e(eVar5, "this$0");
                                            eVar5.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar6 = eVar3;
                                            G7.j.e(eVar6, "this$0");
                                            eVar6.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar3.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 3:
                        final e eVar4 = this.f1299c;
                        G7.j.e(eVar4, "this$0");
                        if (eVar4.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i12 = 1;
                            eVar4.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            e eVar32 = eVar4;
                                            G7.j.e(eVar32, "this$0");
                                            int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i112 != 1) {
                                                if (i112 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar4;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar5 = eVar4;
                                            G7.j.e(eVar5, "this$0");
                                            eVar5.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar6 = eVar4;
                                            G7.j.e(eVar6, "this$0");
                                            eVar6.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar4.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 4:
                        e eVar5 = this.f1299c;
                        G7.j.e(eVar5, "this$0");
                        eVar5.g(SettingActivity.class, null);
                        return y.f23029a;
                    default:
                        final e eVar6 = this.f1299c;
                        G7.j.e(eVar6, "this$0");
                        if (eVar6.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i13 = 3;
                            eVar6.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            e eVar32 = eVar6;
                                            G7.j.e(eVar32, "this$0");
                                            int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i112 != 1) {
                                                if (i112 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar6;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar6;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar6;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar6.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                }
            }
        });
        ConstraintLayout constraintLayout = o0Var.f23377q;
        G7.j.d(constraintLayout, "ctlArRuler");
        final int i10 = 1;
        com.bumptech.glide.d.I(constraintLayout, new F7.l(this) { // from class: G6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1299c;

            {
                this.f1299c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        e eVar = this.f1299c;
                        G7.j.e(eVar, "this$0");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IAP_FROM_MAIN", true);
                        eVar.g(IAPActivity.class, bundle);
                        return y.f23029a;
                    case 1:
                        final e eVar2 = this.f1299c;
                        G7.j.e(eVar2, "this$0");
                        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(eVar2.requireContext().getApplicationContext());
                        G7.j.d(checkAvailability, "checkAvailability(...)");
                        if (checkAvailability.isSupported()) {
                            if (eVar2.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                                try {
                                    final int i102 = 0;
                                    eVar2.h(new F7.a() { // from class: G6.b
                                        @Override // F7.a
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    e eVar32 = eVar2;
                                                    G7.j.e(eVar32, "this$0");
                                                    int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                                    if (i112 != 1) {
                                                        if (i112 != 2) {
                                                            throw new RuntimeException();
                                                        }
                                                    } else {
                                                        eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                                    }
                                                    return y.f23029a;
                                                case 1:
                                                    e eVar42 = eVar2;
                                                    G7.j.e(eVar42, "this$0");
                                                    eVar42.g(StraightRulerActivity.class, null);
                                                    return y.f23029a;
                                                case 2:
                                                    e eVar52 = eVar2;
                                                    G7.j.e(eVar52, "this$0");
                                                    eVar52.g(ProtractorActivity.class, null);
                                                    return y.f23029a;
                                                default:
                                                    e eVar62 = eVar2;
                                                    G7.j.e(eVar62, "this$0");
                                                    eVar62.g(BubbleActivity.class, null);
                                                    return y.f23029a;
                                            }
                                        }
                                    });
                                } catch (UnavailableUserDeclinedInstallationException unused) {
                                    Toast.makeText(eVar2.requireContext(), R.string.unavailable_declined_install, 1).show();
                                } catch (Exception unused2) {
                                    Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                                }
                            } else if (eVar2.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                Log.e("TAG", "onOpenAr: request 1");
                                eVar2.g(PermissionActivity.class, null);
                            } else {
                                Log.e("TAG", "onOpenAr: request 2");
                                eVar2.g(PermissionActivity.class, null);
                            }
                        } else {
                            Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                        }
                        return y.f23029a;
                    case 2:
                        final e eVar3 = this.f1299c;
                        G7.j.e(eVar3, "this$0");
                        if (eVar3.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i11 = 2;
                            eVar3.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            e eVar32 = eVar3;
                                            G7.j.e(eVar32, "this$0");
                                            int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i112 != 1) {
                                                if (i112 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar3;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar3;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar3;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar3.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 3:
                        final e eVar4 = this.f1299c;
                        G7.j.e(eVar4, "this$0");
                        if (eVar4.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i12 = 1;
                            eVar4.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            e eVar32 = eVar4;
                                            G7.j.e(eVar32, "this$0");
                                            int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i112 != 1) {
                                                if (i112 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar4;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar4;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar4;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar4.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 4:
                        e eVar5 = this.f1299c;
                        G7.j.e(eVar5, "this$0");
                        eVar5.g(SettingActivity.class, null);
                        return y.f23029a;
                    default:
                        final e eVar6 = this.f1299c;
                        G7.j.e(eVar6, "this$0");
                        if (eVar6.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i13 = 3;
                            eVar6.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            e eVar32 = eVar6;
                                            G7.j.e(eVar32, "this$0");
                                            int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i112 != 1) {
                                                if (i112 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar6;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar6;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar6;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar6.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                }
            }
        });
        View view = o0Var.f23384x;
        G7.j.d(view, "viewProtractor");
        final int i11 = 2;
        com.bumptech.glide.d.I(view, new F7.l(this) { // from class: G6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1299c;

            {
                this.f1299c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        e eVar = this.f1299c;
                        G7.j.e(eVar, "this$0");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IAP_FROM_MAIN", true);
                        eVar.g(IAPActivity.class, bundle);
                        return y.f23029a;
                    case 1:
                        final e eVar2 = this.f1299c;
                        G7.j.e(eVar2, "this$0");
                        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(eVar2.requireContext().getApplicationContext());
                        G7.j.d(checkAvailability, "checkAvailability(...)");
                        if (checkAvailability.isSupported()) {
                            if (eVar2.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                                try {
                                    final int i102 = 0;
                                    eVar2.h(new F7.a() { // from class: G6.b
                                        @Override // F7.a
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    e eVar32 = eVar2;
                                                    G7.j.e(eVar32, "this$0");
                                                    int i112 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                                    if (i112 != 1) {
                                                        if (i112 != 2) {
                                                            throw new RuntimeException();
                                                        }
                                                    } else {
                                                        eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                                    }
                                                    return y.f23029a;
                                                case 1:
                                                    e eVar42 = eVar2;
                                                    G7.j.e(eVar42, "this$0");
                                                    eVar42.g(StraightRulerActivity.class, null);
                                                    return y.f23029a;
                                                case 2:
                                                    e eVar52 = eVar2;
                                                    G7.j.e(eVar52, "this$0");
                                                    eVar52.g(ProtractorActivity.class, null);
                                                    return y.f23029a;
                                                default:
                                                    e eVar62 = eVar2;
                                                    G7.j.e(eVar62, "this$0");
                                                    eVar62.g(BubbleActivity.class, null);
                                                    return y.f23029a;
                                            }
                                        }
                                    });
                                } catch (UnavailableUserDeclinedInstallationException unused) {
                                    Toast.makeText(eVar2.requireContext(), R.string.unavailable_declined_install, 1).show();
                                } catch (Exception unused2) {
                                    Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                                }
                            } else if (eVar2.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                Log.e("TAG", "onOpenAr: request 1");
                                eVar2.g(PermissionActivity.class, null);
                            } else {
                                Log.e("TAG", "onOpenAr: request 2");
                                eVar2.g(PermissionActivity.class, null);
                            }
                        } else {
                            Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                        }
                        return y.f23029a;
                    case 2:
                        final e eVar3 = this.f1299c;
                        G7.j.e(eVar3, "this$0");
                        if (eVar3.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i112 = 2;
                            eVar3.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            e eVar32 = eVar3;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar3;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar3;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar3;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar3.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 3:
                        final e eVar4 = this.f1299c;
                        G7.j.e(eVar4, "this$0");
                        if (eVar4.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i12 = 1;
                            eVar4.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            e eVar32 = eVar4;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar4;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar4;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar4;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar4.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 4:
                        e eVar5 = this.f1299c;
                        G7.j.e(eVar5, "this$0");
                        eVar5.g(SettingActivity.class, null);
                        return y.f23029a;
                    default:
                        final e eVar6 = this.f1299c;
                        G7.j.e(eVar6, "this$0");
                        if (eVar6.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i13 = 3;
                            eVar6.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            e eVar32 = eVar6;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar6;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar6;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar6;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar6.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                }
            }
        });
        View view2 = o0Var.f23376A;
        G7.j.d(view2, "viewStraightRuler");
        final int i12 = 3;
        com.bumptech.glide.d.I(view2, new F7.l(this) { // from class: G6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1299c;

            {
                this.f1299c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        e eVar = this.f1299c;
                        G7.j.e(eVar, "this$0");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IAP_FROM_MAIN", true);
                        eVar.g(IAPActivity.class, bundle);
                        return y.f23029a;
                    case 1:
                        final e eVar2 = this.f1299c;
                        G7.j.e(eVar2, "this$0");
                        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(eVar2.requireContext().getApplicationContext());
                        G7.j.d(checkAvailability, "checkAvailability(...)");
                        if (checkAvailability.isSupported()) {
                            if (eVar2.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                                try {
                                    final int i102 = 0;
                                    eVar2.h(new F7.a() { // from class: G6.b
                                        @Override // F7.a
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    e eVar32 = eVar2;
                                                    G7.j.e(eVar32, "this$0");
                                                    int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                                    if (i1122 != 1) {
                                                        if (i1122 != 2) {
                                                            throw new RuntimeException();
                                                        }
                                                    } else {
                                                        eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                                    }
                                                    return y.f23029a;
                                                case 1:
                                                    e eVar42 = eVar2;
                                                    G7.j.e(eVar42, "this$0");
                                                    eVar42.g(StraightRulerActivity.class, null);
                                                    return y.f23029a;
                                                case 2:
                                                    e eVar52 = eVar2;
                                                    G7.j.e(eVar52, "this$0");
                                                    eVar52.g(ProtractorActivity.class, null);
                                                    return y.f23029a;
                                                default:
                                                    e eVar62 = eVar2;
                                                    G7.j.e(eVar62, "this$0");
                                                    eVar62.g(BubbleActivity.class, null);
                                                    return y.f23029a;
                                            }
                                        }
                                    });
                                } catch (UnavailableUserDeclinedInstallationException unused) {
                                    Toast.makeText(eVar2.requireContext(), R.string.unavailable_declined_install, 1).show();
                                } catch (Exception unused2) {
                                    Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                                }
                            } else if (eVar2.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                Log.e("TAG", "onOpenAr: request 1");
                                eVar2.g(PermissionActivity.class, null);
                            } else {
                                Log.e("TAG", "onOpenAr: request 2");
                                eVar2.g(PermissionActivity.class, null);
                            }
                        } else {
                            Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                        }
                        return y.f23029a;
                    case 2:
                        final e eVar3 = this.f1299c;
                        G7.j.e(eVar3, "this$0");
                        if (eVar3.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i112 = 2;
                            eVar3.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            e eVar32 = eVar3;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar3;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar3;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar3;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar3.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 3:
                        final e eVar4 = this.f1299c;
                        G7.j.e(eVar4, "this$0");
                        if (eVar4.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i122 = 1;
                            eVar4.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i122) {
                                        case 0:
                                            e eVar32 = eVar4;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar4;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar4;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar4;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar4.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 4:
                        e eVar5 = this.f1299c;
                        G7.j.e(eVar5, "this$0");
                        eVar5.g(SettingActivity.class, null);
                        return y.f23029a;
                    default:
                        final e eVar6 = this.f1299c;
                        G7.j.e(eVar6, "this$0");
                        if (eVar6.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i13 = 3;
                            eVar6.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            e eVar32 = eVar6;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar6;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar6;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar6;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar6.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                }
            }
        });
        View view3 = o0Var.f23385y;
        G7.j.d(view3, "viewSetting");
        final int i13 = 4;
        com.bumptech.glide.d.I(view3, new F7.l(this) { // from class: G6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1299c;

            {
                this.f1299c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        e eVar = this.f1299c;
                        G7.j.e(eVar, "this$0");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IAP_FROM_MAIN", true);
                        eVar.g(IAPActivity.class, bundle);
                        return y.f23029a;
                    case 1:
                        final e eVar2 = this.f1299c;
                        G7.j.e(eVar2, "this$0");
                        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(eVar2.requireContext().getApplicationContext());
                        G7.j.d(checkAvailability, "checkAvailability(...)");
                        if (checkAvailability.isSupported()) {
                            if (eVar2.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                                try {
                                    final int i102 = 0;
                                    eVar2.h(new F7.a() { // from class: G6.b
                                        @Override // F7.a
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    e eVar32 = eVar2;
                                                    G7.j.e(eVar32, "this$0");
                                                    int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                                    if (i1122 != 1) {
                                                        if (i1122 != 2) {
                                                            throw new RuntimeException();
                                                        }
                                                    } else {
                                                        eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                                    }
                                                    return y.f23029a;
                                                case 1:
                                                    e eVar42 = eVar2;
                                                    G7.j.e(eVar42, "this$0");
                                                    eVar42.g(StraightRulerActivity.class, null);
                                                    return y.f23029a;
                                                case 2:
                                                    e eVar52 = eVar2;
                                                    G7.j.e(eVar52, "this$0");
                                                    eVar52.g(ProtractorActivity.class, null);
                                                    return y.f23029a;
                                                default:
                                                    e eVar62 = eVar2;
                                                    G7.j.e(eVar62, "this$0");
                                                    eVar62.g(BubbleActivity.class, null);
                                                    return y.f23029a;
                                            }
                                        }
                                    });
                                } catch (UnavailableUserDeclinedInstallationException unused) {
                                    Toast.makeText(eVar2.requireContext(), R.string.unavailable_declined_install, 1).show();
                                } catch (Exception unused2) {
                                    Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                                }
                            } else if (eVar2.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                Log.e("TAG", "onOpenAr: request 1");
                                eVar2.g(PermissionActivity.class, null);
                            } else {
                                Log.e("TAG", "onOpenAr: request 2");
                                eVar2.g(PermissionActivity.class, null);
                            }
                        } else {
                            Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                        }
                        return y.f23029a;
                    case 2:
                        final e eVar3 = this.f1299c;
                        G7.j.e(eVar3, "this$0");
                        if (eVar3.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i112 = 2;
                            eVar3.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            e eVar32 = eVar3;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar3;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar3;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar3;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar3.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 3:
                        final e eVar4 = this.f1299c;
                        G7.j.e(eVar4, "this$0");
                        if (eVar4.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i122 = 1;
                            eVar4.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i122) {
                                        case 0:
                                            e eVar32 = eVar4;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar4;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar4;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar4;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar4.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 4:
                        e eVar5 = this.f1299c;
                        G7.j.e(eVar5, "this$0");
                        eVar5.g(SettingActivity.class, null);
                        return y.f23029a;
                    default:
                        final e eVar6 = this.f1299c;
                        G7.j.e(eVar6, "this$0");
                        if (eVar6.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i132 = 3;
                            eVar6.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i132) {
                                        case 0:
                                            e eVar32 = eVar6;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar6;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar6;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar6;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar6.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                }
            }
        });
        View view4 = o0Var.f23386z;
        G7.j.d(view4, "viewSpiritLevel");
        final int i14 = 5;
        com.bumptech.glide.d.I(view4, new F7.l(this) { // from class: G6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f1299c;

            {
                this.f1299c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        e eVar = this.f1299c;
                        G7.j.e(eVar, "this$0");
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IAP_FROM_MAIN", true);
                        eVar.g(IAPActivity.class, bundle);
                        return y.f23029a;
                    case 1:
                        final e eVar2 = this.f1299c;
                        G7.j.e(eVar2, "this$0");
                        ArCoreApk.Availability checkAvailability = ArCoreApk.getInstance().checkAvailability(eVar2.requireContext().getApplicationContext());
                        G7.j.d(checkAvailability, "checkAvailability(...)");
                        if (checkAvailability.isSupported()) {
                            if (eVar2.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                                try {
                                    final int i102 = 0;
                                    eVar2.h(new F7.a() { // from class: G6.b
                                        @Override // F7.a
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    e eVar32 = eVar2;
                                                    G7.j.e(eVar32, "this$0");
                                                    int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                                    if (i1122 != 1) {
                                                        if (i1122 != 2) {
                                                            throw new RuntimeException();
                                                        }
                                                    } else {
                                                        eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                                    }
                                                    return y.f23029a;
                                                case 1:
                                                    e eVar42 = eVar2;
                                                    G7.j.e(eVar42, "this$0");
                                                    eVar42.g(StraightRulerActivity.class, null);
                                                    return y.f23029a;
                                                case 2:
                                                    e eVar52 = eVar2;
                                                    G7.j.e(eVar52, "this$0");
                                                    eVar52.g(ProtractorActivity.class, null);
                                                    return y.f23029a;
                                                default:
                                                    e eVar62 = eVar2;
                                                    G7.j.e(eVar62, "this$0");
                                                    eVar62.g(BubbleActivity.class, null);
                                                    return y.f23029a;
                                            }
                                        }
                                    });
                                } catch (UnavailableUserDeclinedInstallationException unused) {
                                    Toast.makeText(eVar2.requireContext(), R.string.unavailable_declined_install, 1).show();
                                } catch (Exception unused2) {
                                    Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                                }
                            } else if (eVar2.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                Log.e("TAG", "onOpenAr: request 1");
                                eVar2.g(PermissionActivity.class, null);
                            } else {
                                Log.e("TAG", "onOpenAr: request 2");
                                eVar2.g(PermissionActivity.class, null);
                            }
                        } else {
                            Toast.makeText(eVar2.requireContext(), R.string.not_support_ar, 0).show();
                        }
                        return y.f23029a;
                    case 2:
                        final e eVar3 = this.f1299c;
                        G7.j.e(eVar3, "this$0");
                        if (eVar3.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i112 = 2;
                            eVar3.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            e eVar32 = eVar3;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar3;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar3;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar3;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar3.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 3:
                        final e eVar4 = this.f1299c;
                        G7.j.e(eVar4, "this$0");
                        if (eVar4.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i122 = 1;
                            eVar4.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i122) {
                                        case 0:
                                            e eVar32 = eVar4;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar4;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar4;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar4;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar4.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                    case 4:
                        e eVar5 = this.f1299c;
                        G7.j.e(eVar5, "this$0");
                        eVar5.g(SettingActivity.class, null);
                        return y.f23029a;
                    default:
                        final e eVar6 = this.f1299c;
                        G7.j.e(eVar6, "this$0");
                        if (eVar6.requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
                            final int i132 = 3;
                            eVar6.h(new F7.a() { // from class: G6.b
                                @Override // F7.a
                                public final Object invoke() {
                                    switch (i132) {
                                        case 0:
                                            e eVar32 = eVar6;
                                            G7.j.e(eVar32, "this$0");
                                            int i1122 = c.f1301a[ArCoreApk.getInstance().requestInstall(eVar32.requireActivity(), false).ordinal()];
                                            if (i1122 != 1) {
                                                if (i1122 != 2) {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                eVar32.startActivity(new Intent(eVar32.requireContext(), (Class<?>) ArRulerActivity.class));
                                            }
                                            return y.f23029a;
                                        case 1:
                                            e eVar42 = eVar6;
                                            G7.j.e(eVar42, "this$0");
                                            eVar42.g(StraightRulerActivity.class, null);
                                            return y.f23029a;
                                        case 2:
                                            e eVar52 = eVar6;
                                            G7.j.e(eVar52, "this$0");
                                            eVar52.g(ProtractorActivity.class, null);
                                            return y.f23029a;
                                        default:
                                            e eVar62 = eVar6;
                                            G7.j.e(eVar62, "this$0");
                                            eVar62.g(BubbleActivity.class, null);
                                            return y.f23029a;
                                    }
                                }
                            });
                        } else {
                            eVar6.g(PermissionActivity.class, null);
                        }
                        return y.f23029a;
                }
            }
        });
    }

    public final void h(F7.a aVar) {
        FragmentActivity requireActivity = requireActivity();
        G7.j.d(requireActivity, "requireActivity(...)");
        if (AbstractC0325a.i(requireActivity)) {
            q6.c a6 = q6.c.f22801e.a();
            boolean z8 = false;
            try {
                if (a6.f22803a) {
                    k5.b bVar = a6.f22805d;
                    if (bVar != null) {
                        z8 = bVar.c("Inter_home");
                    } else {
                        G7.j.k("remoteConfig");
                        throw null;
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (z8) {
                C2475f p2 = C2475f.p();
                Context requireContext = requireContext();
                C2492a c2492a = com.facebook.appevents.n.f13504h;
                d dVar = new d(aVar, 0);
                p2.getClass();
                C2475f.n(dVar, requireContext, c2492a);
                return;
            }
        }
        aVar.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (q6.c.f22801e.a().d()) {
            FragmentActivity requireActivity = requireActivity();
            G7.j.d(requireActivity, "requireActivity(...)");
            if (AbstractC0325a.i(requireActivity) && !C2538b.a().m) {
                if (com.facebook.appevents.n.f13502f != null) {
                    C2475f p2 = C2475f.p();
                    FragmentActivity requireActivity2 = requireActivity();
                    C2493b c2493b = com.facebook.appevents.n.f13502f;
                    o0 o0Var = (o0) c();
                    ShimmerFrameLayout shimmerFrameLayout = ((o0) c()).f23381u.f23194q;
                    p2.getClass();
                    C2475f.u(requireActivity2, c2493b, o0Var.f23378r, shimmerFrameLayout);
                    return;
                }
                C2475f p7 = C2475f.p();
                FragmentActivity requireActivity3 = requireActivity();
                o0 o0Var2 = (o0) c();
                ShimmerFrameLayout shimmerFrameLayout2 = ((o0) c()).f23381u.f23194q;
                C6.b bVar = new C6.b(this, 2);
                p7.getClass();
                m1.g.b().d(requireActivity3, "ca-app-pub-6691965685689933/8357407404", new C2473d(p7, bVar, R.layout.layout_native_home, requireActivity3, o0Var2.f23378r, shimmerFrameLayout2));
                return;
            }
        }
        ((o0) c()).f23378r.removeAllViews();
    }
}
