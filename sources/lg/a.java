package lg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.e;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import com.bumptech.glide.o;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.GuideModel;
import com.plantcare.ai.identifier.plantid.domains.ImageDomain;
import java.util.ArrayList;
import java.util.List;
import kf.h3;
import kf.p2;
import kf.z2;
import kotlin.jvm.internal.Intrinsics;
import mf.f;
import w5.k;

/* loaded from: classes4.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21378k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f21379l;

    public a(Context contextParams, int i10) {
        this.f21378k = i10;
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(contextParams, "contextParams");
            this.f21379l = contextParams;
        } else {
            Intrinsics.checkNotNullParameter(contextParams, "contextParams");
            this.f21379l = contextParams;
        }
    }

    @Override // mf.f
    public final int a() {
        switch (this.f21378k) {
            case 0:
                return R.layout.item_on_boarding;
            case 1:
                return R.layout.item_result_image;
            default:
                return R.layout.item_image;
        }
    }

    @Override // mf.f
    public final void b(e binding, Object obj, int i10) {
        switch (this.f21378k) {
            case 2:
                ImageDomain obj2 = (ImageDomain) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(obj2, "obj");
                if (binding instanceof p2) {
                    View view = ((p2) binding).f1322i;
                    Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                    com.bumptech.glide.e.p(view, new uf.a(this, obj2, i10, 4));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(binding, "binding");
                return;
        }
    }

    @Override // mf.f
    public final void c(e binding, Object obj, int i10) {
        String str;
        int i11 = this.f21378k;
        Object obj2 = this.f21379l;
        switch (i11) {
            case 0:
                GuideModel item = (GuideModel) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item, "item");
                if (binding instanceof z2) {
                    z2 z2Var = (z2) binding;
                    TextView textView = z2Var.f20948v;
                    Context context = this.f22240j;
                    String str2 = null;
                    if (context != null) {
                        str = context.getString(item.getTitle());
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                    Context context2 = this.f22240j;
                    if (context2 != null) {
                        str2 = context2.getString(item.getSubText());
                    }
                    z2Var.u.setText(str2);
                    ((m) b.e((Context) obj2).j(Integer.valueOf(item.getImg())).g(700, 700)).v(z2Var.f20947t);
                    return;
                }
                return;
            case 1:
                String item2 = (String) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item2, "item");
                if (binding instanceof h3) {
                    Log.e("VinhTQ", "setData: " + item2);
                    o e2 = b.e((Context) obj2);
                    e2.getClass();
                    new m(e2.f9752b, e2, Drawable.class, e2.f9753c).y(item2).x(new rg.a(binding)).v(((h3) binding).u);
                    return;
                }
                return;
            default:
                ImageDomain item3 = (ImageDomain) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item3, "item");
                if (binding instanceof p2) {
                    p2 p2Var = (p2) binding;
                    o e10 = b.e(p2Var.f1322i.getContext());
                    String path = item3.getPath();
                    e10.getClass();
                    new m(e10.f9752b, e10, Drawable.class, e10.f9753c).y(path).v(p2Var.f20857t);
                    return;
                }
                return;
        }
    }

    public final void d(List newData) {
        ArrayList arrayList = this.f22239i;
        switch (this.f21378k) {
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

    public a(k onItemClick) {
        this.f21378k = 2;
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f21379l = onItemClick;
    }
}
