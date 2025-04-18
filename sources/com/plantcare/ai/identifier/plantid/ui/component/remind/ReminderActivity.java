package com.plantcare.ai.identifier.plantid.ui.component.remind;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.y0;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import kf.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pf.f;
import sg.g;
import tg.b;
import v8.u0;
import vf.c;
import vf.d;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/remind/ReminderActivity;", "Lmf/a;", "Lkf/i0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nReminderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReminderActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/remind/ReminderActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,179:1\n75#2,13:180\n*S KotlinDebug\n*F\n+ 1 ReminderActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/remind/ReminderActivity\n*L\n34#1:180,13\n*E\n"})
/* loaded from: classes4.dex */
public final class ReminderActivity extends f {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f16710l = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16711j;

    /* renamed from: k, reason: collision with root package name */
    public b f16712k;

    public ReminderActivity() {
        super(10);
        this.f16711j = new y0(Reflection.getOrCreateKotlinClass(RemindViewModel.class), new c(this, 17), new c(this, 16), new d(this, 8));
    }

    public final RemindViewModel I() {
        return (RemindViewModel) this.f16711j.getValue();
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_reminder;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(-1);
        finish();
    }

    @Override // mf.a
    public final void q() {
        if (!i.l()) {
            FrameLayout frAds = ((i0) n()).u;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            e.D(frAds);
        } else {
            FrameLayout frAds2 = ((i0) n()).u;
            Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
            u0.Q(frAds2, this, "ca-app-pub-6691965685689933/2165293673", hf.f.a());
        }
        this.f16712k = new b(this, new sg.f(this, 0), new sg.f(this, 1));
        ((i0) n()).f20788y.setAdapter(this.f16712k);
    }

    @Override // mf.a
    public final void r() {
        I().f16709e.observe(this, new of.b(9, new g(this, 0)));
    }

    @Override // mf.a
    public final void s() {
        ImageView icBack = ((i0) n()).f20785v;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new g(this, 1));
        LinearLayout btnAddReminder = ((i0) n()).f20784t;
        Intrinsics.checkNotNullExpressionValue(btnAddReminder, "btnAddReminder");
        e.p(btnAddReminder, new g(this, 2));
        ImageView icTrash = ((i0) n()).f20786w;
        Intrinsics.checkNotNullExpressionValue(icTrash, "icTrash");
        e.p(icTrash, new g(this, 3));
    }
}
