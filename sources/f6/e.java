package F6;

import F7.l;
import G7.j;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.p0;
import com.bumptech.glide.k;
import com.bumptech.glide.m;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.models.ImageType;
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
import n1.C2475f;
import o1.C2493b;
import u6.a0;
import u6.c0;

/* loaded from: classes3.dex */
public final class e extends J {

    /* renamed from: i, reason: collision with root package name */
    public final Activity f1222i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1223j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public l f1224k;
    public l l;
    public C2493b m;

    public e(FragmentActivity fragmentActivity) {
        this.f1222i = fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.J
    public final int getItemCount() {
        return this.f1223j.size();
    }

    @Override // androidx.recyclerview.widget.J
    public final int getItemViewType(int i9) {
        ImageType imageType;
        if (this.f1223j.get(i9) instanceof InternalImageModel) {
            imageType = ImageType.IMAGE;
        } else {
            imageType = ImageType.ADS;
        }
        return imageType.ordinal();
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        Object valueOf;
        Object valueOf2;
        j.e(p0Var, "holder");
        if (p0Var instanceof d) {
            d dVar = (d) p0Var;
            e eVar = dVar.f1221c;
            Object obj = eVar.f1223j.get(i9);
            if (obj instanceof InternalImageModel) {
                c0 c0Var = dVar.b;
                m d2 = com.bumptech.glide.b.d(c0Var.f19787f);
                InternalImageModel internalImageModel = (InternalImageModel) obj;
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
                InternalImageModel internalImageModel2 = (InternalImageModel) obj;
                c0Var.f19787f.setOnClickListener(new c(0, eVar, internalImageModel2));
                c0Var.f23278q.setOnClickListener(new c(1, eVar, internalImageModel2));
                return;
            }
            return;
        }
        if (p0Var instanceof b) {
            b bVar = (b) p0Var;
            e eVar2 = bVar.f1218c;
            C2493b c2493b = eVar2.m;
            a0 a0Var = bVar.b;
            if (c2493b != null) {
                C2475f p2 = C2475f.p();
                C2493b c2493b2 = eVar2.m;
                FrameLayout frameLayout = a0Var.f23261q;
                ShimmerFrameLayout shimmerFrameLayout = a0Var.f23262r.f23194q;
                p2.getClass();
                C2475f.u(eVar2.f1222i, c2493b2, frameLayout, shimmerFrameLayout);
                return;
            }
            a0Var.f23261q.removeAllViews();
        }
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        j.e(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i9 == ImageType.IMAGE.ordinal()) {
            int i10 = c0.f23277v;
            c0 c0Var = (c0) AbstractC2155b.b(R.layout.item_internal_image, from, viewGroup);
            j.d(c0Var, "inflate(...)");
            return new d(this, c0Var);
        }
        int i11 = a0.f23260t;
        a0 a0Var = (a0) AbstractC2155b.b(R.layout.item_ads, from, viewGroup);
        j.d(a0Var, "inflate(...)");
        return new b(this, a0Var);
    }
}
