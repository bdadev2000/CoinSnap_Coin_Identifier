package sf;

import android.content.Context;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import kf.r1;
import kf.v1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y0.p0;

/* loaded from: classes4.dex */
public final class l extends mf.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25045c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f25046d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25047f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f25048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, b6.c onMaybeLaterEvent, ng.b onWatchAdsEvent, ng.b onUpgradeEvent) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onMaybeLaterEvent, "onMaybeLaterEvent");
        Intrinsics.checkNotNullParameter(onWatchAdsEvent, "onWatchAdsEvent");
        Intrinsics.checkNotNullParameter(onUpgradeEvent, "onUpgradeEvent");
        this.f25046d = onMaybeLaterEvent;
        this.f25047f = onWatchAdsEvent;
        this.f25048g = onUpgradeEvent;
    }

    @Override // mf.c
    public final int a() {
        switch (this.f25045c) {
            case 0:
                return R.layout.dialog_request_permission;
            default:
                return R.layout.dialog_upgrade_vip;
        }
    }

    @Override // mf.c
    public final void c() {
        switch (this.f25045c) {
            case 0:
                ((r1) b()).f20873v.setText((String) this.f25047f);
                ((r1) b()).u.setText((String) this.f25048g);
                return;
            default:
                setCancelable(false);
                return;
        }
    }

    @Override // mf.c
    public final void d() {
        switch (this.f25045c) {
            case 0:
                TextView btnGoToSetting = ((r1) b()).f20872t;
                Intrinsics.checkNotNullExpressionValue(btnGoToSetting, "btnGoToSetting");
                com.bumptech.glide.e.p(btnGoToSetting, new p0(this, 5));
                return;
            default:
                TextView tvMaybeLater = ((v1) b()).f20904w;
                Intrinsics.checkNotNullExpressionValue(tvMaybeLater, "tvMaybeLater");
                com.bumptech.glide.e.p(tvMaybeLater, new o(this, 0));
                TextView btnWatchAds = ((v1) b()).u;
                Intrinsics.checkNotNullExpressionValue(btnWatchAds, "btnWatchAds");
                com.bumptech.glide.e.p(btnWatchAds, new o(this, 1));
                TextView btnUpgrade = ((v1) b()).f20902t;
                Intrinsics.checkNotNullExpressionValue(btnUpgrade, "btnUpgrade");
                com.bumptech.glide.e.p(btnUpgrade, new o(this, 2));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String titlePermission, String desPermission, Function0 onGoToSetting) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(titlePermission, "titlePermission");
        Intrinsics.checkNotNullParameter(desPermission, "desPermission");
        Intrinsics.checkNotNullParameter(onGoToSetting, "onGoToSetting");
        this.f25047f = titlePermission;
        this.f25048g = desPermission;
        this.f25046d = onGoToSetting;
    }
}
