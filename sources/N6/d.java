package N6;

import F7.p;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import java.util.ArrayList;
import java.util.List;
import p1.C2538b;
import t7.AbstractC2712a;
import t7.y;
import u6.AbstractC2795k;
import u7.AbstractC2816g;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class d extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2107g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ImageLibraryActivity f2108h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O6.c f2109i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ImageLibraryActivity imageLibraryActivity, O6.c cVar, w7.f fVar) {
        super(2, fVar);
        this.f2108h = imageLibraryActivity;
        this.f2109i = cVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        d dVar = new d(this.f2108h, this.f2109i, fVar);
        dVar.f2107g = obj;
        return dVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        d dVar = (d) c((h) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        dVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        h hVar = (h) this.f2107g;
        int i9 = ImageLibraryActivity.l;
        ImageLibraryActivity imageLibraryActivity = this.f2108h;
        if (imageLibraryActivity.u().f2119d.isEmpty()) {
            Group group = ((AbstractC2795k) imageLibraryActivity.k()).f23340t;
            G7.j.d(group, "groupData");
            group.setVisibility(8);
            Group group2 = ((AbstractC2795k) imageLibraryActivity.k()).f23341u;
            G7.j.d(group2, "groupNoData");
            group2.setVisibility(0);
            ImageView imageView = ((AbstractC2795k) imageLibraryActivity.k()).f23344x;
            G7.j.d(imageView, "imgNotFound");
            imageView.setVisibility(8);
            TextView textView = ((AbstractC2795k) imageLibraryActivity.k()).f23336A;
            G7.j.d(textView, "txtNotFound");
            textView.setVisibility(8);
            FrameLayout frameLayout = ((AbstractC2795k) imageLibraryActivity.k()).f23339s;
            G7.j.d(frameLayout, "frAds");
            com.bumptech.glide.d.M(frameLayout);
        } else if (!hVar.f2116a.isEmpty()) {
            FrameLayout frameLayout2 = ((AbstractC2795k) imageLibraryActivity.k()).f23339s;
            G7.j.d(frameLayout2, "frAds");
            com.bumptech.glide.d.a0(frameLayout2);
            ImageView imageView2 = ((AbstractC2795k) imageLibraryActivity.k()).f23344x;
            G7.j.d(imageView2, "imgNotFound");
            imageView2.setVisibility(8);
            TextView textView2 = ((AbstractC2795k) imageLibraryActivity.k()).f23336A;
            G7.j.d(textView2, "txtNotFound");
            textView2.setVisibility(8);
            Group group3 = ((AbstractC2795k) imageLibraryActivity.k()).f23340t;
            G7.j.d(group3, "groupData");
            group3.setVisibility(0);
            Group group4 = ((AbstractC2795k) imageLibraryActivity.k()).f23341u;
            G7.j.d(group4, "groupNoData");
            group4.setVisibility(8);
            Log.e("TAG", "showLayoutData: ahuhu");
            if (q6.c.f22801e.a().i() && android.support.v4.media.session.a.v(imageLibraryActivity) && !C2538b.a().m) {
                r6.h i10 = r6.h.f22921e.i();
                FrameLayout frameLayout3 = ((AbstractC2795k) imageLibraryActivity.k()).f23338r;
                G7.j.d(frameLayout3, "frAdContainer");
                ShimmerFrameLayout shimmerFrameLayout = ((AbstractC2795k) imageLibraryActivity.k()).f23346z.f23197q;
                G7.j.d(shimmerFrameLayout, "shimmerNativeLarge");
                r6.h.c(i10, imageLibraryActivity, "ca-app-pub-6691965685689933/7966648879", frameLayout3, shimmerFrameLayout);
            } else {
                FrameLayout frameLayout4 = ((AbstractC2795k) imageLibraryActivity.k()).f23339s;
                G7.j.d(frameLayout4, "frAds");
                com.bumptech.glide.d.M(frameLayout4);
            }
            List R4 = AbstractC2816g.R(new G6.i(new C5.c(4), 1), hVar.f2116a);
            O6.c cVar = this.f2109i;
            cVar.getClass();
            ArrayList arrayList = cVar.f2241i;
            arrayList.clear();
            arrayList.addAll(R4);
            cVar.notifyDataSetChanged();
        } else {
            FrameLayout frameLayout5 = ((AbstractC2795k) imageLibraryActivity.k()).f23339s;
            G7.j.d(frameLayout5, "frAds");
            com.bumptech.glide.d.M(frameLayout5);
            Group group5 = ((AbstractC2795k) imageLibraryActivity.k()).f23340t;
            G7.j.d(group5, "groupData");
            group5.setVisibility(0);
            Group group6 = ((AbstractC2795k) imageLibraryActivity.k()).f23341u;
            G7.j.d(group6, "groupNoData");
            group6.setVisibility(8);
            RecyclerView recyclerView = ((AbstractC2795k) imageLibraryActivity.k()).f23345y;
            G7.j.d(recyclerView, "rvImages");
            recyclerView.setVisibility(8);
            ImageView imageView3 = ((AbstractC2795k) imageLibraryActivity.k()).f23344x;
            G7.j.d(imageView3, "imgNotFound");
            imageView3.setVisibility(0);
            TextView textView3 = ((AbstractC2795k) imageLibraryActivity.k()).f23336A;
            G7.j.d(textView3, "txtNotFound");
            textView3.setVisibility(0);
        }
        return y.f23029a;
    }
}
