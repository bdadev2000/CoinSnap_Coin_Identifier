package qf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.databinding.e;
import com.bumptech.glide.c;
import com.bumptech.glide.m;
import com.bumptech.glide.o;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.DiseasePlantDomain;
import g4.p;
import java.util.ArrayList;
import java.util.List;
import kf.f2;
import kf.h2;
import kf.r2;
import kotlin.jvm.internal.Intrinsics;
import mf.f;

/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f23903k;

    public /* synthetic */ b(int i10) {
        this.f23903k = i10;
    }

    @Override // mf.f
    public final int a() {
        switch (this.f23903k) {
            case 0:
                return R.layout.item_image_plant;
            case 1:
                return R.layout.item_common_diseases;
            default:
                return R.layout.item_common_name;
        }
    }

    @Override // mf.f
    public final void c(e binding, Object obj, int i10) {
        Context context;
        switch (this.f23903k) {
            case 0:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(binding, "binding");
                if ((binding instanceof r2) && (context = this.f22240j) != null) {
                    o b3 = com.bumptech.glide.b.b(context).b(context);
                    r2 r2Var = (r2) binding;
                    Drawable t5 = c.t(r2Var.f1322i.getContext(), intValue);
                    b3.getClass();
                    new m(b3.f9752b, b3, Drawable.class, b3.f9753c).y(t5).s((s4.f) new s4.f().d(p.a)).v(r2Var.f20874t);
                    return;
                }
                return;
            case 1:
                DiseasePlantDomain item = (DiseasePlantDomain) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item, "item");
                if (binding instanceof f2) {
                    f2 f2Var = (f2) binding;
                    f2Var.u.setText(item.getName());
                    f2Var.f20756t.setText(item.getDescription());
                    return;
                }
                return;
            default:
                String item2 = (String) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item2, "item");
                if (binding instanceof h2) {
                    ((h2) binding).f20777t.setText(item2);
                    return;
                }
                return;
        }
    }

    public final void d(List newData) {
        ArrayList arrayList = this.f22239i;
        switch (this.f23903k) {
            case 0:
                Intrinsics.checkNotNullParameter(newData, "newData");
                arrayList.clear();
                arrayList.addAll(newData);
                notifyDataSetChanged();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(newData, "newData");
                arrayList.clear();
                arrayList.addAll(newData);
                notifyDataSetChanged();
                return;
            default:
                Intrinsics.checkNotNullParameter(newData, "newData");
                arrayList.clear();
                arrayList.addAll(newData);
                notifyDataSetChanged();
                return;
        }
    }
}
