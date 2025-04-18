package tg;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import kf.j3;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.f;
import w5.k;

/* loaded from: classes4.dex */
public final class c extends f {

    /* renamed from: k, reason: collision with root package name */
    public final Function2 f25406k;

    /* renamed from: l, reason: collision with root package name */
    public long f25407l;

    public c(k onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f25406k = onItemClick;
    }

    @Override // mf.f
    public final int a() {
        return R.layout.item_sound;
    }

    @Override // mf.f
    public final void b(e binding, Object obj, int i10) {
        SoundDomain obj2 = (SoundDomain) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(obj2, "obj");
        if (binding instanceof j3) {
            FrameLayout layoutContainer = ((j3) binding).f20800t;
            Intrinsics.checkNotNullExpressionValue(layoutContainer, "layoutContainer");
            com.bumptech.glide.e.p(layoutContainer, new uf.a(this, i10, obj2));
        }
    }

    @Override // mf.f
    public final void c(e binding, Object obj, int i10) {
        SoundDomain item = (SoundDomain) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof j3) {
            j3 j3Var = (j3) binding;
            TextView textView = j3Var.u;
            textView.setText(item.getName());
            boolean z10 = true;
            textView.setSelected(true);
            if (item.getId() != this.f25407l) {
                z10 = false;
            }
            j3Var.u.setActivated(z10);
        }
    }

    @Override // mf.f, androidx.recyclerview.widget.j0
    public final int getItemCount() {
        return this.f22239i.size();
    }
}
