package com.plantcare.ai.identifier.plantid.ui.component.history.list;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.y0;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel;
import java.util.ArrayList;
import java.util.List;
import kf.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import of.b;
import pf.f;
import vf.c;
import vf.d;
import xf.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/history/list/HistoryActivity;", "Lmf/a;", "Lkf/i;", "<init>", "()V", "xf/a", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/history/list/HistoryActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n75#2,13:152\n766#3:165\n857#3,2:166\n766#3:168\n857#3,2:169\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/history/list/HistoryActivity\n*L\n41#1:152,13\n127#1:165\n127#1:166,2\n133#1:168\n133#1:169,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HistoryActivity extends f {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f16625l = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16626j;

    /* renamed from: k, reason: collision with root package name */
    public List f16627k;

    public HistoryActivity() {
        super(3);
        this.f16626j = new y0(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new c(this, 5), new c(this, 4), new d(this, 2));
        this.f16627k = new ArrayList();
    }

    public final HistoryViewModel I() {
        return (HistoryViewModel) this.f16626j.getValue();
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_history;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // mf.a
    public final void q() {
        ViewPager2 viewPager2 = ((i) n()).f20780v;
        viewPager2.setAdapter(new a(this));
        Intrinsics.checkNotNullExpressionValue(viewPager2, "apply(...)");
    }

    @Override // mf.a
    public final void r() {
        I().f16616f.observe(this, new b(3, new xf.b(this, 0)));
        I().f16617g.observe(this, new b(3, new xf.b(this, 1)));
    }

    @Override // mf.a
    public final void s() {
        ImageView icBack = ((i) n()).f20781w;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new xf.b(this, 2));
        TextView btnPlant = ((i) n()).u;
        Intrinsics.checkNotNullExpressionValue(btnPlant, "btnPlant");
        int i10 = 3;
        e.p(btnPlant, new xf.b(this, i10));
        TextView btnDisease = ((i) n()).f20779t;
        Intrinsics.checkNotNullExpressionValue(btnDisease, "btnDisease");
        e.p(btnDisease, new xf.b(this, 4));
        ImageView icTrash = ((i) n()).f20782x;
        Intrinsics.checkNotNullExpressionValue(icTrash, "icTrash");
        e.p(icTrash, new xf.b(this, 5));
        ((i) n()).f20780v.a(new androidx.viewpager2.adapter.d(this, i10));
    }
}
