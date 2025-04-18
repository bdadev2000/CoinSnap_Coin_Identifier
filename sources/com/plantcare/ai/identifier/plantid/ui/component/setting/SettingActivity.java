package com.plantcare.ai.identifier.plantid.ui.component.setting;

import a4.c;
import a4.d;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ads.control.admob.AppOpenManager;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import kf.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import vg.b;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/setting/SettingActivity;", "Lmf/a;", "Lkf/q0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SettingActivity extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16736h = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16737f = true;

    /* renamed from: g, reason: collision with root package name */
    public d f16738g;

    @Override // mf.a
    public final int m() {
        return R.layout.activity_setting;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!i.l() && (!i.k() || !i.b())) {
            AppOpenManager.f().f2914k = true;
        } else {
            AppOpenManager.f().f2914k = false;
        }
        finish();
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f16738g == null) {
            c cVar = new c(this);
            cVar.b();
            cVar.f86c = new nb.a(13);
            this.f16738g = cVar.a();
        }
        d dVar = this.f16738g;
        if (dVar != null) {
            dVar.J(new vg.a(dVar, 0));
        }
        if (!this.f16737f && !i.l()) {
            if (!i.b()) {
                AppOpenManager.f().f2914k = true;
                this.f16737f = true;
            } else {
                AppOpenManager.f().f2914k = false;
                this.f16737f = false;
            }
        }
    }

    @Override // mf.a
    public final void s() {
        ImageView icBack = ((q0) n()).f20867z;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new b(this, 0));
        LinearLayout btnLanguage = ((q0) n()).u;
        Intrinsics.checkNotNullExpressionValue(btnLanguage, "btnLanguage");
        e.p(btnLanguage, new b(this, 1));
        LinearLayout btnHistory = ((q0) n()).f20862t;
        Intrinsics.checkNotNullExpressionValue(btnHistory, "btnHistory");
        e.p(btnHistory, new b(this, 2));
        LinearLayout btnShare = ((q0) n()).f20866y;
        Intrinsics.checkNotNullExpressionValue(btnShare, "btnShare");
        e.p(btnShare, new b(this, 3));
        LinearLayout btnPolicy = ((q0) n()).f20863v;
        Intrinsics.checkNotNullExpressionValue(btnPolicy, "btnPolicy");
        e.p(btnPolicy, new b(this, 4));
        LinearLayout btnRateApp = ((q0) n()).f20865x;
        Intrinsics.checkNotNullExpressionValue(btnRateApp, "btnRateApp");
        e.p(btnRateApp, new b(this, 5));
        LinearLayout btnPremium = ((q0) n()).f20864w;
        Intrinsics.checkNotNullExpressionValue(btnPremium, "btnPremium");
        e.p(btnPremium, new b(this, 6));
    }
}
