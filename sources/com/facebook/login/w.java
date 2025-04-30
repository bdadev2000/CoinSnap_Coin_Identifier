package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0462f0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Date;
import n1.C2475f;

/* loaded from: classes.dex */
public class w extends Fragment {
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public q f13781c;

    /* renamed from: d, reason: collision with root package name */
    public t f13782d;

    /* renamed from: f, reason: collision with root package name */
    public h.c f13783f;

    /* renamed from: g, reason: collision with root package name */
    public View f13784g;

    public final t b() {
        t tVar = this.f13782d;
        if (tVar != null) {
            return tVar;
        }
        G7.j.k("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        b().j(i9, i10, intent);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.facebook.login.t, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        t tVar;
        t tVar2;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            tVar = null;
        } else {
            tVar = (t) bundle.getParcelable("loginClient");
        }
        if (tVar != null) {
            if (tVar.f13771d == null) {
                tVar.f13771d = this;
                tVar2 = tVar;
            } else {
                throw new C1849l("Can't set fragment once it is already set.");
            }
        } else {
            ?? obj = new Object();
            obj.f13770c = -1;
            if (obj.f13771d == null) {
                obj.f13771d = this;
                tVar2 = obj;
            } else {
                throw new C1849l("Can't set fragment once it is already set.");
            }
        }
        this.f13782d = tVar2;
        b().f13772f = new F2.d(this, 12);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.b = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f13781c = (q) bundleExtra.getParcelable(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        }
        h.c registerForActivityResult = registerForActivityResult(new C0462f0(3), new u(new v(0, this, activity)));
        G7.j.d(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f13783f = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        G7.j.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        G7.j.d(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f13784g = findViewById;
        b().f13773g = new C2475f(this, 26);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        z g9 = b().g();
        if (g9 != null) {
            g9.c();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        View findViewById;
        super.onPause();
        View view = getView();
        if (view == null) {
            findViewById = null;
        } else {
            findViewById = view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        t b = b();
        q qVar = this.f13781c;
        q qVar2 = b.f13775i;
        if ((qVar2 == null || b.f13770c < 0) && qVar != null) {
            if (qVar2 == null) {
                Date date = C0785a.f13439n;
                if (!com.facebook.appevents.g.q() || b.c()) {
                    b.f13775i = qVar;
                    ArrayList arrayList = new ArrayList();
                    boolean d2 = qVar.d();
                    p pVar = qVar.b;
                    if (d2) {
                        if (!com.facebook.r.f13811n && pVar.f13743h) {
                            arrayList.add(new n(b));
                        }
                    } else {
                        if (pVar.b) {
                            arrayList.add(new m(b));
                        }
                        if (!com.facebook.r.f13811n && pVar.f13739c) {
                            arrayList.add(new o(b));
                        }
                    }
                    if (pVar.f13742g) {
                        arrayList.add(new C1851b(b));
                    }
                    if (pVar.f13740d) {
                        arrayList.add(new C(b));
                    }
                    if (!qVar.d() && pVar.f13741f) {
                        arrayList.add(new k(b));
                    }
                    Object[] array = arrayList.toArray(new z[0]);
                    if (array != null) {
                        b.b = (z[]) array;
                        b.k();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return;
            }
            throw new C1849l("Attempted to authorize while a request is pending.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        G7.j.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", b());
    }
}
