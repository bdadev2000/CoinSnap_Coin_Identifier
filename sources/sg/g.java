package sg;

import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.i0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReminderActivity f25078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ReminderActivity reminderActivity, int i10) {
        super(1);
        this.f25077b = i10;
        this.f25078c = reminderActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if ((!r4.isEmpty()) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r3.f25077b
            com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity r0 = r3.f25078c
            switch(r4) {
                case 1: goto L1d;
                case 2: goto L8;
                default: goto L7;
            }
        L7:
            goto L21
        L8:
            int r4 = com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity.f16710l
            r0.getClass()
            sf.d r4 = new sf.d
            b6.c r1 = b6.c.f2309n
            sg.i r2 = new sg.i
            r2.<init>(r0)
            r4.<init>(r0, r1, r2)
            r4.show()
            return
        L1d:
            r0.onBackPressed()
            return
        L21:
            tg.b r4 = r0.f16712k
            if (r4 == 0) goto L32
            java.util.ArrayList r4 = r4.f22239i
            if (r4 == 0) goto L32
            boolean r4 = r4.isEmpty()
            r1 = 1
            r4 = r4 ^ r1
            if (r4 != r1) goto L32
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 == 0) goto L40
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity> r1 = com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity.class
            r4.<init>(r0, r1)
            r0.startActivity(r4)
            goto L46
        L40:
            r4 = 2131952337(0x7f1302d1, float:1.9541114E38)
            com.bumptech.glide.d.E(r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.g.a(android.view.View):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int collectionSizeOrDefault;
        switch (this.f25077b) {
            case 0:
                List list = (List) obj;
                boolean isEmpty = list.isEmpty();
                ReminderActivity reminderActivity = this.f25078c;
                if (isEmpty) {
                    RecyclerView rcvReminder = ((i0) reminderActivity.n()).f20788y;
                    Intrinsics.checkNotNullExpressionValue(rcvReminder, "rcvReminder");
                    com.bumptech.glide.e.D(rcvReminder);
                    LinearLayout layoutNullData = ((i0) reminderActivity.n()).f20787x;
                    Intrinsics.checkNotNullExpressionValue(layoutNullData, "layoutNullData");
                    com.bumptech.glide.e.V(layoutNullData);
                    ImageView icTrash = ((i0) reminderActivity.n()).f20786w;
                    Intrinsics.checkNotNullExpressionValue(icTrash, "icTrash");
                    com.bumptech.glide.e.E(icTrash);
                } else {
                    RecyclerView rcvReminder2 = ((i0) reminderActivity.n()).f20788y;
                    Intrinsics.checkNotNullExpressionValue(rcvReminder2, "rcvReminder");
                    com.bumptech.glide.e.V(rcvReminder2);
                    LinearLayout layoutNullData2 = ((i0) reminderActivity.n()).f20787x;
                    Intrinsics.checkNotNullExpressionValue(layoutNullData2, "layoutNullData");
                    com.bumptech.glide.e.D(layoutNullData2);
                    ImageView icTrash2 = ((i0) reminderActivity.n()).f20786w;
                    Intrinsics.checkNotNullExpressionValue(icTrash2, "icTrash");
                    com.bumptech.glide.e.V(icTrash2);
                }
                tg.b bVar = reminderActivity.f16712k;
                if (bVar != null) {
                    Intrinsics.checkNotNull(list);
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    List list2 = list;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList newData = new ArrayList(collectionSizeOrDefault);
                    for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                        AlarmEntity alarmEntity = (AlarmEntity) it.next();
                        Intrinsics.checkNotNullParameter(alarmEntity, "<this>");
                        long id2 = alarmEntity.getId();
                        long time = alarmEntity.getTime();
                        String label = alarmEntity.getLabel();
                        Intrinsics.checkNotNullExpressionValue(label, "getLabel(...)");
                        String description = alarmEntity.getDescription();
                        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                        SparseBooleanArray days = alarmEntity.getDays();
                        Intrinsics.checkNotNullExpressionValue(days, "getDays(...)");
                        newData.add(new AlarmDomain(id2, time, label, description, days, alarmEntity.getSoundRes(), alarmEntity.isEnabled(), alarmEntity.isVibration()));
                    }
                    Intrinsics.checkNotNullParameter(newData, "newData");
                    ArrayList arrayList = bVar.f22239i;
                    arrayList.clear();
                    arrayList.addAll(newData);
                    bVar.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
