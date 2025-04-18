package com.plantcare.ai.identifier.plantid.ui.component.remind;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import kf.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pf.f;
import sg.m;
import uf.b;
import vf.c;
import vf.d;
import w5.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/remind/ReminderDeleteActivity;", "Lmf/a;", "Lkf/k0;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nReminderDeleteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReminderDeleteActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/remind/ReminderDeleteActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n75#2,13:109\n766#3:122\n857#3,2:123\n*S KotlinDebug\n*F\n+ 1 ReminderDeleteActivity.kt\ncom/plantcare/ai/identifier/plantid/ui/component/remind/ReminderDeleteActivity\n*L\n26#1:109,13\n84#1:122\n84#1:123,2\n*E\n"})
/* loaded from: classes4.dex */
public final class ReminderDeleteActivity extends f {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f16713l = 0;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f16714j;

    /* renamed from: k, reason: collision with root package name */
    public b f16715k;

    public ReminderDeleteActivity() {
        super(11);
        this.f16714j = new y0(Reflection.getOrCreateKotlinClass(RemindViewModel.class), new c(this, 19), new c(this, 18), new d(this, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.e() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I() {
        /*
            r4 = this;
            androidx.databinding.e r0 = r4.n()
            kf.k0 r0 = (kf.k0) r0
            android.widget.TextView r0 = r0.f20802t
            uf.b r1 = r4.f16715k
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
        throw new UnsupportedOperationException("Method not decompiled: com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity.I():void");
    }

    @Override // mf.a
    public final int m() {
        return R.layout.activity_reminder_delete;
    }

    @Override // mf.a
    public final void q() {
        RecyclerView recyclerView = ((k0) n()).f20804w;
        b bVar = new b(this, new k(this, 11), 2);
        this.f16715k = bVar;
        recyclerView.setAdapter(bVar);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "apply(...)");
    }

    @Override // mf.a
    public final void r() {
        ((RemindViewModel) this.f16714j.getValue()).f16709e.observe(this, new of.b(10, new m(this, 0)));
    }

    @Override // mf.a
    public final void s() {
        ImageView icBack = ((k0) n()).u;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new m(this, 1));
        ImageView icChbAll = ((k0) n()).f20803v;
        Intrinsics.checkNotNullExpressionValue(icChbAll, "icChbAll");
        e.p(icChbAll, new m(this, 2));
        TextView btnDelete = ((k0) n()).f20802t;
        Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
        e.p(btnDelete, new m(this, 3));
    }
}
