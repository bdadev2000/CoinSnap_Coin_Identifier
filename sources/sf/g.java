package sf;

import android.content.Context;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import kf.i1;
import kf.n1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends mf.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25033c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f25034d;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f25035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, Function0 tryAgain, Function0 backToHome, int i10) {
        super(context);
        this.f25033c = i10;
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tryAgain, "onEventCancel");
            Intrinsics.checkNotNullParameter(backToHome, "onEventDelete");
            this.f25034d = tryAgain;
            this.f25035f = backToHome;
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tryAgain, "tryAgain");
        Intrinsics.checkNotNullParameter(backToHome, "backToHome");
        super(context);
        this.f25034d = tryAgain;
        this.f25035f = backToHome;
    }

    @Override // mf.c
    public final int a() {
        switch (this.f25033c) {
            case 0:
                return R.layout.dialog_confirm_delete_remind;
            default:
                return R.layout.dialog_no_internet;
        }
    }

    @Override // mf.c
    public final void d() {
        int i10 = 1;
        int i11 = 0;
        switch (this.f25033c) {
            case 0:
                TextView btnDelete = ((i1) b()).u;
                Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
                com.bumptech.glide.e.p(btnDelete, new f(this, i11));
                TextView btnCancel = ((i1) b()).f20789t;
                Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
                com.bumptech.glide.e.p(btnCancel, new f(this, i10));
                return;
            default:
                TextView btnTryAgain = ((n1) b()).u;
                Intrinsics.checkNotNullExpressionValue(btnTryAgain, "btnTryAgain");
                com.bumptech.glide.e.p(btnTryAgain, new p(this, i11));
                TextView btnBackToHome = ((n1) b()).f20836t;
                Intrinsics.checkNotNullExpressionValue(btnBackToHome, "btnBackToHome");
                com.bumptech.glide.e.p(btnBackToHome, new p(this, i10));
                return;
        }
    }
}
