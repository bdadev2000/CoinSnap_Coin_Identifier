package com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview;

import android.animation.ObjectAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.y0;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import java.util.concurrent.CancellationException;
import kf.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import of.b;
import og.a;
import pf.f;
import sf.g;
import vf.c;
import vf.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/preview/PreviewIdentifyActivity;", "Lmf/a;", "Lkf/g0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPreviewIdentifyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewIdentifyActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/preview/PreviewIdentifyActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,217:1\n75#2,13:218\n*S KotlinDebug\n*F\n+ 1 PreviewIdentifyActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/plan_identifier/preview/PreviewIdentifyActivity\n*L\n44#1:218,13\n*E\n"})
/* loaded from: classes4.dex */
public final class PreviewIdentifyActivity extends f {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f16681n = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16682j;

    /* renamed from: k, reason: collision with root package name */
    public g f16683k;

    /* renamed from: l, reason: collision with root package name */
    public Job f16684l;

    /* renamed from: m, reason: collision with root package name */
    public ObjectAnimator f16685m;

    public PreviewIdentifyActivity() {
        super(7);
        this.f16682j = new y0(Reflection.getOrCreateKotlinClass(PreviewModel.class), new c(this, 13), new c(this, 12), new d(this, 6));
    }

    public final PreviewModel I() {
        return (PreviewModel) this.f16682j.getValue();
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_preview_identify;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Job job = this.f16684l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            I().f16692j.postValue(Boolean.FALSE);
        }
    }

    @Override // mf.a
    public final void q() {
        String string;
        String string2;
        if (PlantIdentifierActivity.f16673q == null) {
            com.bumptech.glide.d.E(this, R.string.some_thing_went_wrong);
            finish();
        } else {
            ((g0) n()).f20765y.setImageBitmap(PlantIdentifierActivity.f16673q);
        }
        this.f16683k = new g(this, new a(this, 0), new a(this, 1), 1);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((g0) n()).B, "translationX", 0.0f, 750.0f);
        ofFloat.setDuration(1200L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        this.f16685m = ofFloat;
        TextView textView = ((g0) n()).D;
        if (getIntent().getIntExtra("KEY_FLAG_ID_OR_DI", 0) == 0) {
            string = getString(R.string.identifying);
        } else {
            string = getString(R.string.detecting_);
        }
        textView.setText(string);
        TextView textView2 = ((g0) n()).C;
        if (getIntent().getIntExtra("KEY_FLAG_ID_OR_DI", 0) == 0) {
            string2 = getString(R.string.identify);
        } else {
            string2 = getString(R.string.detect);
        }
        textView2.setText(string2);
    }

    @Override // mf.a
    public final void r() {
        I().f16693k.observe(this, new b(8, new og.b(this, 0)));
        I().f16697o.observe(this, new b(8, new og.c(this)));
    }

    @Override // mf.a
    public final void s() {
        TextView btnCancel = ((g0) n()).u;
        Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
        e.p(btnCancel, new og.d(this));
        LinearLayout btnPlantIdentifier = ((g0) n()).f20762v;
        Intrinsics.checkNotNullExpressionValue(btnPlantIdentifier, "btnPlantIdentifier");
        e.p(btnPlantIdentifier, new og.b(this, 1));
        ImageView icBack = ((g0) n()).f20764x;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new og.b(this, 2));
        LinearLayout btnRetake = ((g0) n()).f20763w;
        Intrinsics.checkNotNullExpressionValue(btnRetake, "btnRetake");
        e.p(btnRetake, new og.b(this, 3));
        ConstraintLayout btnBackToHome = ((g0) n()).f20761t;
        Intrinsics.checkNotNullExpressionValue(btnBackToHome, "btnBackToHome");
        e.p(btnBackToHome, new og.b(this, 4));
    }
}
