package L6;

import F7.l;
import G7.j;
import android.app.Activity;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d0.AbstractC2158e;
import u6.e0;
import x6.f;

/* loaded from: classes3.dex */
public final class b extends f {

    /* renamed from: k, reason: collision with root package name */
    public final Activity f1829k;
    public final l l;
    public int m;

    public b(Activity activity, C6.a aVar) {
        j.e(activity, "activity");
        this.f1829k = activity;
        this.l = aVar;
        this.m = -1;
        Math.sqrt(2.0f);
    }

    @Override // x6.f
    public final int a() {
        return R.layout.item_language;
    }

    @Override // x6.f
    public final void b(AbstractC2158e abstractC2158e, Object obj, int i9) {
        M6.a aVar = (M6.a) obj;
        j.e(abstractC2158e, "binding");
        j.e(aVar, "obj");
        if (abstractC2158e instanceof e0) {
            e0 e0Var = (e0) abstractC2158e;
            e0Var.f19787f.setOnClickListener(new a(this, i9, aVar, 0));
            e0Var.f23292q.setOnClickListener(new a(this, i9, aVar, 1));
        }
    }

    @Override // x6.f
    public final void c(AbstractC2158e abstractC2158e, Object obj, int i9) {
        M6.a aVar = (M6.a) obj;
        j.e(abstractC2158e, "binding");
        j.e(aVar, "item");
        if (abstractC2158e instanceof e0) {
            e0 e0Var = (e0) abstractC2158e;
            Context context = e0Var.f19787f.getContext();
            Integer num = aVar.f2009f;
            j.b(num);
            e0Var.f23294s.setImageDrawable(context.getDrawable(num.intValue()));
            e0Var.f23295t.setText(aVar.b);
            e0Var.f23292q.setChecked(aVar.f2008d);
            int i10 = this.m;
            ConstraintLayout constraintLayout = e0Var.f23293r;
            if (i10 == i9) {
                constraintLayout.setBackgroundResource(R.drawable.bg_item_language_click);
            } else {
                constraintLayout.setBackgroundResource(R.drawable.bg_item_language);
            }
        }
    }

    @Override // x6.f, androidx.recyclerview.widget.J
    public final int getItemCount() {
        return this.f24240i.size();
    }
}
