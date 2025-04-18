package xf;

import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.disease.HistoryDeleteDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.plant.HistoryDeletePlantActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.list.HistoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kf.i;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HistoryActivity f27671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(HistoryActivity historyActivity, int i10) {
        super(1);
        this.f27670b = i10;
        this.f27671c = historyActivity;
    }

    public final void a(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f27670b;
        HistoryActivity historyActivity = this.f27671c;
        switch (i10) {
            case 2:
                historyActivity.finish();
                return;
            case 3:
                int i11 = HistoryActivity.f16625l;
                historyActivity.I().f16615e.postValue(0);
                return;
            case 4:
                int i12 = HistoryActivity.f16625l;
                historyActivity.I().f16615e.postValue(1);
                return;
            default:
                int i13 = HistoryActivity.f16625l;
                Integer num = (Integer) historyActivity.I().f16615e.getValue();
                if (num != null && num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    List list = historyActivity.f16627k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((HistoryEntity) obj).getType() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(obj);
                        }
                    }
                    if (true ^ arrayList.isEmpty()) {
                        historyActivity.startActivity(new Intent(historyActivity, (Class<?>) HistoryDeletePlantActivity.class));
                        Unit unit = Unit.INSTANCE;
                        return;
                    } else {
                        Log.d("duylt", "Size 0");
                        return;
                    }
                }
                List list2 = historyActivity.f16627k;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((HistoryEntity) obj2).getType() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList2.add(obj2);
                    }
                }
                if (true ^ arrayList2.isEmpty()) {
                    historyActivity.startActivity(new Intent(historyActivity, (Class<?>) HistoryDeleteDiseaseActivity.class));
                    Unit unit2 = Unit.INSTANCE;
                    return;
                } else {
                    Log.d("duylt", "Size 0");
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f27670b;
        HistoryActivity historyActivity = this.f27671c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    int i11 = HistoryActivity.f16625l;
                    TextView textView = ((i) historyActivity.n()).u;
                    textView.setActivated(true);
                    Intrinsics.checkNotNull(textView);
                    e.S(textView);
                    TextView textView2 = ((i) historyActivity.n()).f20779t;
                    textView2.setActivated(false);
                    textView2.setTextColor(Color.parseColor("#7DC448"));
                    ((i) historyActivity.n()).f20780v.setCurrentItem(0);
                } else {
                    int i12 = HistoryActivity.f16625l;
                    TextView textView3 = ((i) historyActivity.n()).u;
                    textView3.setActivated(false);
                    textView3.setTextColor(Color.parseColor("#7DC448"));
                    TextView textView4 = ((i) historyActivity.n()).f20779t;
                    textView4.setActivated(true);
                    Intrinsics.checkNotNull(textView4);
                    e.S(textView4);
                    ((i) historyActivity.n()).f20780v.setCurrentItem(1);
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                Intrinsics.checkNotNull(list);
                historyActivity.f16627k = CollectionsKt.toMutableList((Collection) list);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            case 3:
                a((View) obj);
                return Unit.INSTANCE;
            case 4:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
