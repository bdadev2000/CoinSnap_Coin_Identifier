package of;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kf.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f23299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i10) {
        super(1);
        this.f23298b = i10;
        this.f23299c = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f23298b;
        f fVar = this.f23299c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    a1 a1Var = (a1) fVar.f();
                    RecyclerView rcvImage = a1Var.f20698v;
                    Intrinsics.checkNotNullExpressionValue(rcvImage, "rcvImage");
                    com.bumptech.glide.e.D(rcvImage);
                    ProgressBar progressLoading = a1Var.u;
                    Intrinsics.checkNotNullExpressionValue(progressLoading, "progressLoading");
                    com.bumptech.glide.e.V(progressLoading);
                } else {
                    a1 a1Var2 = (a1) fVar.f();
                    RecyclerView rcvImage2 = a1Var2.f20698v;
                    Intrinsics.checkNotNullExpressionValue(rcvImage2, "rcvImage");
                    com.bumptech.glide.e.V(rcvImage2);
                    ProgressBar progressLoading2 = a1Var2.u;
                    Intrinsics.checkNotNullExpressionValue(progressLoading2, "progressLoading");
                    com.bumptech.glide.e.D(progressLoading2);
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                if (list.isEmpty()) {
                    a1 a1Var3 = (a1) fVar.f();
                    RecyclerView rcvImage3 = a1Var3.f20698v;
                    Intrinsics.checkNotNullExpressionValue(rcvImage3, "rcvImage");
                    com.bumptech.glide.e.D(rcvImage3);
                    LinearLayout layoutNoData = a1Var3.f20697t;
                    Intrinsics.checkNotNullExpressionValue(layoutNoData, "layoutNoData");
                    com.bumptech.glide.e.V(layoutNoData);
                } else {
                    a1 a1Var4 = (a1) fVar.f();
                    RecyclerView rcvImage4 = a1Var4.f20698v;
                    Intrinsics.checkNotNullExpressionValue(rcvImage4, "rcvImage");
                    com.bumptech.glide.e.V(rcvImage4);
                    LinearLayout layoutNoData2 = a1Var4.f20697t;
                    Intrinsics.checkNotNullExpressionValue(layoutNoData2, "layoutNoData");
                    com.bumptech.glide.e.D(layoutNoData2);
                    lg.a aVar = fVar.f23311m;
                    if (aVar != null) {
                        Intrinsics.checkNotNull(list);
                        aVar.d(list);
                    }
                }
                return Unit.INSTANCE;
            default:
                fVar.f23308j.invoke();
                fVar.dismiss();
                return Unit.INSTANCE;
        }
    }
}
