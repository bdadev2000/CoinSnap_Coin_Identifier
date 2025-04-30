package x6;

import G7.j;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d0.AbstractC2155b;
import d0.AbstractC2158e;

/* loaded from: classes3.dex */
public abstract class d<VB extends AbstractC2158e> extends Fragment {
    public AbstractC2158e b;

    public abstract int b();

    public final AbstractC2158e c() {
        AbstractC2158e abstractC2158e = this.b;
        if (abstractC2158e != null) {
            return abstractC2158e;
        }
        j.k("mBinding");
        throw null;
    }

    public final void g(Class cls, Bundle bundle) {
        Intent intent = new Intent(getActivity(), (Class<?>) cls);
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.e(layoutInflater, "inflater");
        int b = b();
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC2155b.f19779a;
        AbstractC2158e b8 = AbstractC2155b.f19779a.b(layoutInflater.inflate(b, viewGroup, false), b);
        j.e(b8, "<set-?>");
        this.b = b8;
        return c().f19787f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        super.onViewCreated(view, bundle);
        d();
        f();
        e();
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }
}
