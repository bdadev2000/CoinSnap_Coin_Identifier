package O6;

import F7.l;
import G7.j;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.p0;
import com.bumptech.glide.k;
import com.bumptech.glide.m;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.models.InternalImageModel;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d0.AbstractC2155b;
import i2.C2341d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import u6.c0;

/* loaded from: classes3.dex */
public final class c extends J {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2241i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public l f2242j;

    /* renamed from: k, reason: collision with root package name */
    public l f2243k;

    @Override // androidx.recyclerview.widget.J
    public final int getItemCount() {
        return this.f2241i.size();
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        Object valueOf;
        Object valueOf2;
        b bVar = (b) p0Var;
        j.e(bVar, "holder");
        final InternalImageModel internalImageModel = (InternalImageModel) this.f2241i.get(i9);
        j.e(internalImageModel, "item");
        c0 c0Var = bVar.b;
        m d2 = com.bumptech.glide.b.d(c0Var.f19787f);
        String path = internalImageModel.getPath();
        d2.getClass();
        ((k) ((k) new k(d2.b, d2, Drawable.class, d2.f12867c).y(path).m(new C2341d(Long.valueOf(new File(internalImageModel.getPath()).lastModified())))).h(300, 300)).w(c0Var.f23279r);
        c0Var.f23281t.setText(internalImageModel.getName());
        String format = new SimpleDateFormat("EEEE , dd/MM/yyyy", Locale.US).format(new Date(internalImageModel.getLastModified()));
        j.d(format, "format(...)");
        c0Var.f23280s.setText(format);
        long lastModified = internalImageModel.getLastModified();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastModified);
        int i10 = calendar.get(11);
        int i11 = calendar.get(12);
        if (i10 < 10) {
            valueOf = o.h(i10, "0");
        } else {
            valueOf = Integer.valueOf(i10);
        }
        if (i11 < 10) {
            valueOf2 = o.h(i11, "0");
        } else {
            valueOf2 = Integer.valueOf(i11);
        }
        c0Var.f23282u.setText(valueOf + ":" + valueOf2);
        final c cVar = bVar.f2240c;
        final int i12 = 0;
        c0Var.f19787f.setOnClickListener(new View.OnClickListener(cVar) { // from class: O6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f2238c;

            {
                this.f2238c = cVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c cVar2 = this.f2238c;
                        j.e(cVar2, "this$0");
                        InternalImageModel internalImageModel2 = internalImageModel;
                        j.e(internalImageModel2, "$item");
                        l lVar = cVar2.f2242j;
                        if (lVar != null) {
                            lVar.invoke(internalImageModel2);
                            return;
                        }
                        return;
                    default:
                        c cVar3 = this.f2238c;
                        j.e(cVar3, "this$0");
                        InternalImageModel internalImageModel3 = internalImageModel;
                        j.e(internalImageModel3, "$item");
                        l lVar2 = cVar3.f2243k;
                        if (lVar2 != null) {
                            lVar2.invoke(internalImageModel3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 1;
        c0Var.f23278q.setOnClickListener(new View.OnClickListener(cVar) { // from class: O6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f2238c;

            {
                this.f2238c = cVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c cVar2 = this.f2238c;
                        j.e(cVar2, "this$0");
                        InternalImageModel internalImageModel2 = internalImageModel;
                        j.e(internalImageModel2, "$item");
                        l lVar = cVar2.f2242j;
                        if (lVar != null) {
                            lVar.invoke(internalImageModel2);
                            return;
                        }
                        return;
                    default:
                        c cVar3 = this.f2238c;
                        j.e(cVar3, "this$0");
                        InternalImageModel internalImageModel3 = internalImageModel;
                        j.e(internalImageModel3, "$item");
                        l lVar2 = cVar3.f2243k;
                        if (lVar2 != null) {
                            lVar2.invoke(internalImageModel3);
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        j.e(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i10 = c0.f23277v;
        c0 c0Var = (c0) AbstractC2155b.b(R.layout.item_internal_image, from, viewGroup);
        j.d(c0Var, "inflate(...)");
        return new b(this, c0Var);
    }
}
