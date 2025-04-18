package mf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v9.h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf/b;", "Landroidx/databinding/e;", "VB", "Lv9/h;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class b<VB extends androidx.databinding.e> extends h {

    /* renamed from: c, reason: collision with root package name */
    public androidx.databinding.e f22234c;

    public abstract int e();

    public final androidx.databinding.e f() {
        androidx.databinding.e eVar = this.f22234c;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int e2 = e();
        if (this.f22234c == null) {
            DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.a;
            androidx.databinding.e a = androidx.databinding.b.a(inflater.inflate(e2, viewGroup, false), e2);
            Intrinsics.checkNotNullExpressionValue(a, "inflate(...)");
            Intrinsics.checkNotNullParameter(a, "<set-?>");
            this.f22234c = a;
        }
        f().M(getViewLifecycleOwner());
        return f().f1322i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g();
        i();
        h();
    }
}
