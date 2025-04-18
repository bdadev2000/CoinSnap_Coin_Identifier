package com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.healthy;

import android.widget.ImageView;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import kf.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import x5.i;
import y0.p0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/result/healthy/HealthyActivity;", "Lmf/a;", "Lkf/g;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthyActivity extends a {
    @Override // mf.a
    public final int m() {
        return R.layout.activity_healthy;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // mf.a
    public final void q() {
        if (!i.f27402f) {
            cg.a d10 = i.d();
            d10.f2795b++;
            i.r(d10);
            return;
        }
        i.f27402f = false;
    }

    @Override // mf.a
    public final void s() {
        ImageView icClose = ((g) n()).f20760t;
        Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
        e.p(icClose, new p0(this, 13));
    }
}
