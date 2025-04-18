package qf;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import java.util.ArrayList;
import java.util.List;
import kf.b3;
import kf.x2;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import mf.f;
import pf.c;

/* loaded from: classes4.dex */
public final class a extends f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f23900k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Function f23901l;

    /* renamed from: m, reason: collision with root package name */
    public Object f23902m;

    public a(gg.f onClickItemPlant, gg.f onDeleteMyPlant) {
        Intrinsics.checkNotNullParameter(onClickItemPlant, "onClickItemPlant");
        Intrinsics.checkNotNullParameter(onDeleteMyPlant, "onDeleteMyPlant");
        this.f23901l = onClickItemPlant;
        this.f23902m = onDeleteMyPlant;
    }

    @Override // mf.f
    public final int a() {
        switch (this.f23900k) {
            case 0:
                return R.layout.item_plant_disease;
            default:
                return R.layout.item_my_plant;
        }
    }

    @Override // mf.f
    public final void b(e binding, Object obj, int i10) {
        switch (this.f23900k) {
            case 0:
                rf.a obj2 = (rf.a) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(obj2, "obj");
                if (binding instanceof b3) {
                    ConstraintLayout layoutItemDisease = ((b3) binding).f20708t;
                    Intrinsics.checkNotNullExpressionValue(layoutItemDisease, "layoutItemDisease");
                    com.bumptech.glide.e.p(layoutItemDisease, new p1.a(4, this, obj2));
                    return;
                }
                return;
            default:
                PlantDomain obj3 = (PlantDomain) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(obj3, "obj");
                if (binding instanceof x2) {
                    x2 x2Var = (x2) binding;
                    ConstraintLayout layoutItemPlant = x2Var.u;
                    Intrinsics.checkNotNullExpressionValue(layoutItemPlant, "layoutItemPlant");
                    com.bumptech.glide.e.p(layoutItemPlant, new ig.a(this, obj3, i10, 0));
                    ImageView icTrash = x2Var.f20926t;
                    Intrinsics.checkNotNullExpressionValue(icTrash, "icTrash");
                    com.bumptech.glide.e.p(icTrash, new ig.a(this, obj3, i10, 1));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ad, code lost:
    
        if (r5 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        r10 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r10, r0, 0, true, 2, (java.lang.Object) null);
     */
    @Override // mf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.databinding.e r9, java.lang.Object r10, int r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.a.c(androidx.databinding.e, java.lang.Object, int):void");
    }

    public final void d(List newData) {
        ArrayList arrayList = this.f22239i;
        switch (this.f23900k) {
            case 0:
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

    public a(c onClickItemDisease) {
        Intrinsics.checkNotNullParameter(onClickItemDisease, "onClickItemDisease");
        this.f23901l = onClickItemDisease;
        this.f23902m = "";
    }
}
