package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/x;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/facebook/internal/m", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class x extends Fragment {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11308h = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f11309b;

    /* renamed from: c, reason: collision with root package name */
    public r f11310c;

    /* renamed from: d, reason: collision with root package name */
    public u f11311d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.activity.result.c f11312f;

    /* renamed from: g, reason: collision with root package name */
    public View f11313g;

    public final u b() {
        u uVar = this.f11311d;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        b().l(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        u uVar;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            uVar = null;
        } else {
            uVar = (u) bundle.getParcelable("loginClient");
        }
        if (uVar != null) {
            if (uVar.f11297d == null) {
                uVar.f11297d = this;
            } else {
                throw new com.facebook.q("Can't set fragment once it is already set.");
            }
        } else {
            uVar = new u(this);
        }
        this.f11311d = uVar;
        b().f11298f = new androidx.core.app.h(this, 7);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f11309b = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f11310c = (r) bundleExtra.getParcelable(com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        }
        androidx.activity.result.c registerForActivityResult = registerForActivityResult(new f.d(), new v(new p1.a(3, this, activity)));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f11312f = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f11313g = findViewById;
        b().f11299g = new w(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        a0 i10 = b().i();
        if (i10 != null) {
            i10.c();
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
        boolean z10;
        boolean z11;
        super.onResume();
        if (this.f11309b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        u b3 = b();
        r request = this.f11310c;
        r rVar = b3.f11301i;
        boolean z12 = true;
        if (rVar != null && b3.f11296c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && request != null) {
            if (rVar == null) {
                Date date = com.facebook.a.f10880n;
                if (!z1.d.p() || b3.c()) {
                    b3.f11301i = request;
                    Intrinsics.checkNotNullParameter(request, "request");
                    ArrayList arrayList = new ArrayList();
                    b0 b0Var = b0.INSTAGRAM;
                    b0 b0Var2 = request.f11275n;
                    if (b0Var2 == b0Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q qVar = request.f11264b;
                    if (z11) {
                        if (!com.facebook.x.f11434n && qVar.f11263h) {
                            arrayList.add(new o(b3));
                        }
                    } else {
                        if (qVar.f11258b) {
                            arrayList.add(new n(b3));
                        }
                        if (!com.facebook.x.f11434n && qVar.f11259c) {
                            arrayList.add(new p(b3));
                        }
                    }
                    if (qVar.f11262g) {
                        arrayList.add(new b(b3));
                    }
                    if (qVar.f11260d) {
                        arrayList.add(new g0(b3));
                    }
                    if (b0Var2 != b0Var) {
                        z12 = false;
                    }
                    if (!z12 && qVar.f11261f) {
                        arrayList.add(new j(b3));
                    }
                    Object[] array = arrayList.toArray(new a0[0]);
                    if (array != null) {
                        b3.f11295b = (a0[]) array;
                        b3.m();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return;
            }
            throw new com.facebook.q("Attempted to authorize while a request is pending.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", b());
    }
}
