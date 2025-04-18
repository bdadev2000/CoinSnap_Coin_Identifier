package mf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.e;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf/d;", "Landroidx/databinding/e;", "VB", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class d<VB extends androidx.databinding.e> extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public androidx.databinding.e f22236b;

    public abstract int b();

    public final androidx.databinding.e c() {
        androidx.databinding.e eVar = this.f22236b;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int b3 = b();
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.a;
        androidx.databinding.e a = androidx.databinding.b.a(inflater.inflate(b3, viewGroup, false), b3);
        Intrinsics.checkNotNullExpressionValue(a, "inflate(...)");
        Intrinsics.checkNotNullParameter(a, "<set-?>");
        this.f22236b = a;
        return c().f1322i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        e();
        g();
        f();
    }
}
