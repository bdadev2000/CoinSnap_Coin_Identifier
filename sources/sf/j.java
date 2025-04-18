package sf;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import java.util.concurrent.CancellationException;
import kf.k1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class j extends mf.c {

    /* renamed from: c, reason: collision with root package name */
    public final Context f25040c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f25041d;

    /* renamed from: f, reason: collision with root package name */
    public long f25042f;

    /* renamed from: g, reason: collision with root package name */
    public Job f25043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, fg.c onBuyNow) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onBuyNow, "onBuyNow");
        this.f25040c = context;
        this.f25041d = onBuyNow;
    }

    @Override // mf.c
    public final int a() {
        return R.layout.dialog_flash_sale;
    }

    @Override // mf.c
    public final void c() {
        Job launch$default;
        long j3 = 2 * 60;
        this.f25042f = j3;
        f(j3);
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new i(this, null), 3, null);
        this.f25043g = launch$default;
    }

    @Override // mf.c
    public final void d() {
        FrameLayout btnBuyNow = ((k1) b()).f20805t;
        Intrinsics.checkNotNullExpressionValue(btnBuyNow, "btnBuyNow");
        com.bumptech.glide.e.p(btnBuyNow, new h(this, 0));
        ImageView icClose = ((k1) b()).u;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        com.bumptech.glide.e.p(icClose, new h(this, 1));
    }

    public final void f(long j3) {
        long j10 = 60;
        long j11 = j3 / j10;
        long j12 = j3 % j10;
        TextView textView = ((k1) b()).f20806v;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(this.f25040c.getString(R.string.number_left, com.applovin.impl.mediation.ads.e.h(new Object[]{Long.valueOf(j11), Long.valueOf(j12)}, 2, "%02d:%02d", "format(...)")));
        if (j11 == 0 && j12 < 1) {
            cancel();
        }
    }

    @Override // android.app.Dialog
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        Job job = this.f25043g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
