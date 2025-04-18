package uf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.e;
import com.bumptech.glide.m;
import com.bumptech.glide.o;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomainDelete;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import eb.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kf.f3;
import kf.j2;
import kf.l2;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mf.f;
import w5.k;
import xg.d;

/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f25803k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f25804l;

    /* renamed from: m, reason: collision with root package name */
    public final Function2 f25805m;

    public b(Context contextParams, k onItemClick, int i10) {
        this.f25803k = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                Intrinsics.checkNotNullParameter(contextParams, "contextParams");
                Intrinsics.checkNotNullParameter(onItemClick, "onItemSelected");
                this.f25804l = contextParams;
                this.f25805m = onItemClick;
                return;
            }
            Intrinsics.checkNotNullParameter(contextParams, "contextParams");
            Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
            this.f25804l = contextParams;
            this.f25805m = onItemClick;
            return;
        }
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f25804l = contextParams;
        this.f25805m = onItemClick;
    }

    @Override // mf.f
    public final int a() {
        switch (this.f25803k) {
            case 0:
                return R.layout.item_history_delete;
            case 1:
                return R.layout.item_history;
            default:
                return R.layout.item_reminder_delete;
        }
    }

    @Override // mf.f
    public final void b(e binding, Object obj, int i10) {
        switch (this.f25803k) {
            case 0:
                i(binding, (HistoryDomain) obj, i10);
                return;
            case 1:
                i(binding, (HistoryDomain) obj, i10);
                return;
            default:
                AlarmDomainDelete obj2 = (AlarmDomainDelete) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(obj2, "obj");
                if (binding instanceof f3) {
                    View view = ((f3) binding).f1322i;
                    Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                    com.bumptech.glide.e.p(view, new a(this, obj2, i10, 5));
                    return;
                }
                return;
        }
    }

    @Override // mf.f
    public final void c(e binding, Object obj, int i10) {
        List split$default;
        String h10;
        switch (this.f25803k) {
            case 0:
                j(binding, (HistoryDomain) obj);
                return;
            case 1:
                j(binding, (HistoryDomain) obj);
                return;
            default:
                AlarmDomainDelete item = (AlarmDomainDelete) obj;
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item, "item");
                if (binding instanceof f3) {
                    String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(item.getTime()));
                    Intrinsics.checkNotNull(format);
                    split$default = StringsKt__StringsKt.split$default(format, new String[]{":"}, false, 0, 6, (Object) null);
                    Pair pair = new Pair((String) split$default.get(0), (String) split$default.get(1));
                    f3 f3Var = (f3) binding;
                    TextView textView = f3Var.u;
                    textView.setText("txtDayOfWeek");
                    textView.setSelected(true);
                    String label = item.getLabel();
                    TextView textView2 = f3Var.f20759w;
                    textView2.setText(label);
                    textView2.setSelected(true);
                    f3Var.f20758v.setText(((String) pair.getFirst()) + AbstractJsonLexerKt.COLON + ((String) pair.getSecond()));
                    f3Var.f20757t.setActivated(item.getIsSelected());
                    ArrayList arrayList = new ArrayList();
                    boolean day = d.b(item).getDay(1);
                    Context context = this.f25804l;
                    if (day) {
                        String string = context.getString(R.string.monday);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList.add(string);
                    }
                    if (d.b(item).getDay(2)) {
                        String string2 = context.getString(R.string.tuesday);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        arrayList.add(string2);
                    }
                    if (d.b(item).getDay(3)) {
                        String string3 = context.getString(R.string.wednesday);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        arrayList.add(string3);
                    }
                    if (d.b(item).getDay(4)) {
                        String string4 = context.getString(R.string.thursday);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        arrayList.add(string4);
                    }
                    if (d.b(item).getDay(5)) {
                        String string5 = context.getString(R.string.friday);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        arrayList.add(string5);
                    }
                    if (d.b(item).getDay(6)) {
                        String string6 = context.getString(R.string.saturday);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        arrayList.add(string6);
                    }
                    if (d.b(item).getDay(7)) {
                        String string7 = context.getString(R.string.sunday);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        arrayList.add(string7);
                    }
                    int size = arrayList.size();
                    String str = "";
                    for (int i11 = 0; i11 < size; i11++) {
                        StringBuilder m10 = j.m(str);
                        if (i11 == arrayList.size() - 1) {
                            h10 = (String) arrayList.get(i11);
                        } else {
                            h10 = vd.e.h(new StringBuilder(), (String) arrayList.get(i11), ", ");
                        }
                        m10.append(h10);
                        str = m10.toString();
                    }
                    f3Var.u.setText(str);
                    return;
                }
                return;
        }
    }

    public final void d(int i10, Function0 onEventAllItemDone, Function0 onEventAllItemNotDone, Function0 onEventMarkSomeItem) {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                Intrinsics.checkNotNullParameter(onEventAllItemDone, "onEventAllItemDone");
                Intrinsics.checkNotNullParameter(onEventAllItemNotDone, "onEventAllItemNotDone");
                Intrinsics.checkNotNullParameter(onEventMarkSomeItem, "onEventMarkSomeItem");
                ((HistoryDomain) arrayList.get(i10)).setSelected(!((HistoryDomain) arrayList.get(i10)).getIsSelected());
                notifyItemChanged(i10);
                if (f()) {
                    onEventAllItemDone.invoke();
                    return;
                } else if (g()) {
                    onEventAllItemNotDone.invoke();
                    return;
                } else {
                    onEventMarkSomeItem.invoke();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(onEventAllItemDone, "onEventAllItemDone");
                Intrinsics.checkNotNullParameter(onEventAllItemNotDone, "onEventAllItemNotDone");
                Intrinsics.checkNotNullParameter(onEventMarkSomeItem, "onEventMarkSomeItem");
                ((AlarmDomainDelete) arrayList.get(i10)).setSelected(!((AlarmDomainDelete) arrayList.get(i10)).getIsSelected());
                notifyItemChanged(i10);
                if (f()) {
                    onEventAllItemDone.invoke();
                    return;
                } else if (g()) {
                    onEventAllItemNotDone.invoke();
                    return;
                } else {
                    onEventMarkSomeItem.invoke();
                    return;
                }
        }
    }

    public final boolean e() {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((HistoryDomain) it.next()).getIsSelected()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((AlarmDomainDelete) it2.next()).getIsSelected()) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    public final boolean f() {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((HistoryDomain) it.next()).getIsSelected()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!((AlarmDomainDelete) it2.next()).getIsSelected()) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final boolean g() {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(!((HistoryDomain) it.next()).getIsSelected())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!(!((AlarmDomainDelete) it2.next()).getIsSelected())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final void h() {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((HistoryDomain) it.next()).setSelected(true);
                }
                notifyItemRangeChanged(0, arrayList.size());
                return;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AlarmDomainDelete) it2.next()).setSelected(true);
                }
                notifyItemRangeChanged(0, arrayList.size());
                return;
        }
    }

    public final void i(e binding, HistoryDomain obj, int i10) {
        switch (this.f25803k) {
            case 0:
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(obj, "obj");
                if (binding instanceof l2) {
                    View view = ((l2) binding).f1322i;
                    Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                    com.bumptech.glide.e.p(view, new a(this, obj, i10, 0));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(obj, "obj");
                if (binding instanceof j2) {
                    View view2 = ((j2) binding).f1322i;
                    Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                    com.bumptech.glide.e.p(view2, new a(this, obj, i10, 1));
                    return;
                }
                return;
        }
    }

    public final void j(e binding, HistoryDomain item) {
        int i10 = this.f25803k;
        Context context = this.f25804l;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item, "item");
                if (binding instanceof l2) {
                    o e2 = com.bumptech.glide.b.e(context);
                    String str = item.getImages().get(0);
                    e2.getClass();
                    l2 l2Var = (l2) binding;
                    new m(e2.f9752b, e2, Drawable.class, e2.f9753c).y(str).v(l2Var.u);
                    l2Var.f20818t.setActivated(item.getIsSelected());
                    String scientificName = item.getScientificName();
                    TextView textView = l2Var.f20820w;
                    textView.setText(scientificName);
                    textView.setSelected(true);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(binding, "binding");
                Intrinsics.checkNotNullParameter(item, "item");
                if (binding instanceof j2) {
                    o e10 = com.bumptech.glide.b.e(context);
                    String str2 = item.getImages().get(0);
                    e10.getClass();
                    j2 j2Var = (j2) binding;
                    new m(e10.f9752b, e10, Drawable.class, e10.f9753c).y(str2).v(j2Var.f20798t);
                    String scientificName2 = item.getScientificName();
                    TextView textView2 = j2Var.f20799v;
                    textView2.setText(scientificName2);
                    textView2.setSelected(true);
                    return;
                }
                return;
        }
    }

    public final void k(List newData) {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                Intrinsics.checkNotNullParameter(newData, "newData");
                arrayList.clear();
                arrayList.addAll(newData);
                notifyDataSetChanged();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(newData, "newData");
                arrayList.clear();
                arrayList.addAll(newData);
                notifyDataSetChanged();
                return;
            default:
                Intrinsics.checkNotNullParameter(newData, "newData");
                arrayList.clear();
                arrayList.addAll(newData);
                notifyDataSetChanged();
                return;
        }
    }

    public final void l() {
        ArrayList arrayList = this.f22239i;
        switch (this.f25803k) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((HistoryDomain) it.next()).setSelected(false);
                }
                notifyItemRangeChanged(0, arrayList.size());
                return;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AlarmDomainDelete) it2.next()).setSelected(false);
                }
                notifyItemRangeChanged(0, arrayList.size());
                return;
        }
    }
}
