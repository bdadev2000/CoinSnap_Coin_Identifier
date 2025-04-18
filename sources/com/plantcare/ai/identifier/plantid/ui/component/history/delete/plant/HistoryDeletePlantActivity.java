package com.plantcare.ai.identifier.plantid.ui.component.history.delete.plant;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel;
import kf.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pf.f;
import uf.b;
import vf.c;
import vf.d;
import w5.k;
import wf.a;
import x5.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/history/delete/plant/HistoryDeletePlantActivity;", "Lmf/a;", "Lkf/m;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHistoryDeletePlantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDeletePlantActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/history/delete/plant/HistoryDeletePlantActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n75#2,13:135\n766#3:148\n857#3,2:149\n*S KotlinDebug\n*F\n+ 1 HistoryDeletePlantActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/history/delete/plant/HistoryDeletePlantActivity\n*L\n35#1:135,13\n96#1:148\n96#1:149,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HistoryDeletePlantActivity extends f {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f16621l = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16622j;

    /* renamed from: k, reason: collision with root package name */
    public b f16623k;

    public HistoryDeletePlantActivity() {
        super(2);
        this.f16622j = new y0(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new c(this, 3), new c(this, 2), new d(this, 1));
    }

    public final void I() {
        TextView btnDelete = ((m) n()).f20821t;
        Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
        e.V(btnDelete);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.e() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() {
        /*
            r4 = this;
            androidx.databinding.e r0 = r4.n()
            kf.m r0 = (kf.m) r0
            android.widget.TextView r0 = r0.f20821t
            uf.b r1 = r4.f16623k
            r2 = 0
            if (r1 == 0) goto L15
            boolean r1 = r1.e()
            r3 = 1
            if (r1 != r3) goto L15
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r2 = 8
        L1b:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.ui.component.history.delete.plant.HistoryDeletePlantActivity.J():void");
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_history_delete_plant;
    }

    @Override // mf.a
    public final void q() {
        RecyclerView recyclerView = ((m) n()).f20824x;
        b bVar = new b(this, new k(this, 6), 0);
        this.f16623k = bVar;
        recyclerView.setAdapter(bVar);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
        i.c(new a(this, 0), new a(this, 1));
    }

    @Override // mf.a
    public final void r() {
        ((HistoryViewModel) this.f16622j.getValue()).f16617g.observe(this, new of.b(2, new wf.b(this, 0)));
    }

    @Override // mf.a
    public final void s() {
        ImageView icBack = ((m) n()).f20822v;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new wf.b(this, 1));
        ImageView icChbAll = ((m) n()).f20823w;
        Intrinsics.checkNotNullExpressionValue(icChbAll, "icChbAll");
        e.p(icChbAll, new wf.b(this, 2));
        TextView btnDelete = ((m) n()).f20821t;
        Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
        e.p(btnDelete, new wf.b(this, 3));
    }
}
