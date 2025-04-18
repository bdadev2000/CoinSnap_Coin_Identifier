package sg;

import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomainDelete;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kf.k0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReminderDeleteActivity f25088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(ReminderDeleteActivity reminderDeleteActivity, int i10) {
        super(1);
        this.f25087b = i10;
        this.f25088c = reminderDeleteActivity;
    }

    public final void a(View view) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        ArrayList arrayList2;
        int i10 = this.f25087b;
        boolean z10 = false;
        ReminderDeleteActivity reminderDeleteActivity = this.f25088c;
        switch (i10) {
            case 1:
                reminderDeleteActivity.finish();
                return;
            case 2:
                int i11 = ReminderDeleteActivity.f16713l;
                boolean isActivated = ((k0) reminderDeleteActivity.n()).f20803v.isActivated();
                ImageView imageView = ((k0) reminderDeleteActivity.n()).f20803v;
                if (isActivated) {
                    uf.b bVar = reminderDeleteActivity.f16715k;
                    if (bVar != null) {
                        bVar.l();
                    }
                    TextView btnDelete = ((k0) reminderDeleteActivity.n()).f20802t;
                    Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
                    com.bumptech.glide.e.E(btnDelete);
                } else {
                    uf.b bVar2 = reminderDeleteActivity.f16715k;
                    if (bVar2 != null) {
                        bVar2.h();
                    }
                    TextView btnDelete2 = ((k0) reminderDeleteActivity.n()).f20802t;
                    Intrinsics.checkNotNullExpressionValue(btnDelete2, "btnDelete");
                    com.bumptech.glide.e.V(btnDelete2);
                    z10 = true;
                }
                imageView.setActivated(z10);
                reminderDeleteActivity.I();
                return;
            default:
                uf.b bVar3 = reminderDeleteActivity.f16715k;
                Unit unit = null;
                if (bVar3 != null && (arrayList2 = bVar3.f22239i) != null) {
                    arrayList = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((AlarmDomainDelete) next).getIsSelected()) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        Intrinsics.checkNotNullParameter(arrayList, "<this>");
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(xg.d.b((AlarmDomainDelete) it2.next()));
                        }
                        new sf.g(reminderDeleteActivity, b6.c.f2311p, new b1.a(6, reminderDeleteActivity, CollectionsKt.toMutableList((Collection) arrayList3)), 0).show();
                    } else {
                        com.bumptech.glide.d.E(reminderDeleteActivity, R.string.please_select_the_record_to_delete);
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    com.bumptech.glide.d.E(reminderDeleteActivity, R.string.some_thing_went_wrong);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int collectionSizeOrDefault;
        switch (this.f25087b) {
            case 0:
                List list = (List) obj;
                ReminderDeleteActivity reminderDeleteActivity = this.f25088c;
                uf.b bVar = reminderDeleteActivity.f16715k;
                if (bVar != null) {
                    Intrinsics.checkNotNull(list);
                    String str = "<this>";
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    List<AlarmEntity> list2 = list;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (AlarmEntity alarmEntity : list2) {
                        Intrinsics.checkNotNullParameter(alarmEntity, str);
                        long id2 = alarmEntity.getId();
                        long time = alarmEntity.getTime();
                        String label = alarmEntity.getLabel();
                        Intrinsics.checkNotNullExpressionValue(label, "getLabel(...)");
                        String description = alarmEntity.getDescription();
                        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                        SparseBooleanArray days = alarmEntity.getDays();
                        Intrinsics.checkNotNullExpressionValue(days, "getDays(...)");
                        arrayList.add(new AlarmDomainDelete(id2, time, label, description, days, alarmEntity.getSoundRes(), alarmEntity.isEnabled(), alarmEntity.isVibration(), false));
                        str = str;
                    }
                    bVar.k(arrayList);
                }
                reminderDeleteActivity.I();
                if (list.isEmpty()) {
                    reminderDeleteActivity.finish();
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
