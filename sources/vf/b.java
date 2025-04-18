package vf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.disease.HistoryDeleteDiseaseActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kf.m;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import sf.g;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HistoryDeleteDiseaseActivity f26524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(HistoryDeleteDiseaseActivity historyDeleteDiseaseActivity, int i10) {
        super(1);
        this.f26523b = i10;
        this.f26524c = historyDeleteDiseaseActivity;
    }

    public final void a(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.f26523b;
        boolean z10 = false;
        HistoryDeleteDiseaseActivity historyDeleteDiseaseActivity = this.f26524c;
        switch (i10) {
            case 1:
                historyDeleteDiseaseActivity.finish();
                return;
            case 2:
                int i11 = HistoryDeleteDiseaseActivity.f16618l;
                boolean isActivated = ((m) historyDeleteDiseaseActivity.n()).f20823w.isActivated();
                ImageView imageView = ((m) historyDeleteDiseaseActivity.n()).f20823w;
                if (isActivated) {
                    uf.b bVar = historyDeleteDiseaseActivity.f16620k;
                    if (bVar != null) {
                        bVar.l();
                    }
                    TextView btnDelete = ((m) historyDeleteDiseaseActivity.n()).f20821t;
                    Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
                    com.bumptech.glide.e.E(btnDelete);
                } else {
                    uf.b bVar2 = historyDeleteDiseaseActivity.f16620k;
                    if (bVar2 != null) {
                        bVar2.h();
                    }
                    historyDeleteDiseaseActivity.I();
                    z10 = true;
                }
                imageView.setActivated(z10);
                historyDeleteDiseaseActivity.J();
                return;
            default:
                uf.b bVar3 = historyDeleteDiseaseActivity.f16620k;
                Unit unit = null;
                if (bVar3 != null && (arrayList2 = bVar3.f22239i) != null) {
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((HistoryDomain) next).getIsSelected()) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        new g(historyDeleteDiseaseActivity, b6.c.f2303h, new b1.a(2, historyDeleteDiseaseActivity, CollectionsKt.toMutableList((Collection) xg.d.f(arrayList))), 0).show();
                    } else {
                        com.bumptech.glide.d.E(historyDeleteDiseaseActivity, R.string.please_select_the_record_to_delete);
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    com.bumptech.glide.d.E(historyDeleteDiseaseActivity, R.string.some_thing_went_wrong);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f26523b
            switch(r0) {
                case 0: goto L17;
                case 1: goto Lf;
                case 2: goto L7;
                default: goto L5;
            }
        L5:
            goto L8a
        L7:
            android.view.View r8 = (android.view.View) r8
            r7.a(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Lf:
            android.view.View r8 = (android.view.View) r8
            r7.a(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L17:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r0 = r8 instanceof java.util.Collection
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            goto L4b
        L2e:
            java.util.Iterator r0 = r8.iterator()
        L32:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r0.next()
            com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity r3 = (com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity) r3
            int r3 = r3.getType()
            if (r3 != r2) goto L46
            r3 = r2
            goto L47
        L46:
            r3 = r1
        L47:
            if (r3 == 0) goto L32
            r0 = r2
            goto L4c
        L4b:
            r0 = r1
        L4c:
            com.plantcare.ai.identifier.plantid.ui.component.history.delete.disease.HistoryDeleteDiseaseActivity r3 = r7.f26524c
            if (r0 == 0) goto L84
            uf.b r0 = r3.f16620k
            if (r0 == 0) goto L80
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        L5d:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity r6 = (com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity) r6
            int r6 = r6.getType()
            if (r6 != r2) goto L72
            r6 = r2
            goto L73
        L72:
            r6 = r1
        L73:
            if (r6 == 0) goto L5d
            r4.add(r5)
            goto L5d
        L79:
            java.util.ArrayList r8 = xg.d.e(r4)
            r0.k(r8)
        L80:
            r3.J()
            goto L87
        L84:
            r3.finish()
        L87:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L8a:
            android.view.View r8 = (android.view.View) r8
            r7.a(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.b.invoke(java.lang.Object):java.lang.Object");
    }
}
