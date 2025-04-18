package tg;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.e;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import eb.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kf.d3;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mf.f;
import xg.d;

/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: k, reason: collision with root package name */
    public final Context f25403k;

    /* renamed from: l, reason: collision with root package name */
    public final Function2 f25404l;

    /* renamed from: m, reason: collision with root package name */
    public final Function2 f25405m;

    public b(Context contextParams, sg.f onItemClick, sg.f onToggleClick) {
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onToggleClick, "onToggleClick");
        this.f25403k = contextParams;
        this.f25404l = onItemClick;
        this.f25405m = onToggleClick;
    }

    @Override // mf.f
    public final int a() {
        return R.layout.item_reminder;
    }

    @Override // mf.f
    public final void b(e binding, Object obj, int i10) {
        AlarmDomain obj2 = (AlarmDomain) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(obj2, "obj");
        if (binding instanceof d3) {
            d3 d3Var = (d3) binding;
            View view = d3Var.f1322i;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            com.bumptech.glide.e.p(view, new a(this, obj2, i10, 0));
            ImageView icSwEnableRemind = d3Var.f20730t;
            Intrinsics.checkNotNullExpressionValue(icSwEnableRemind, "icSwEnableRemind");
            com.bumptech.glide.e.p(icSwEnableRemind, new a(this, obj2, i10, 1));
        }
    }

    @Override // mf.f
    public final void c(e binding, Object obj, int i10) {
        List split$default;
        String h10;
        AlarmDomain item = (AlarmDomain) obj;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        if (binding instanceof d3) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(item.getTime()));
            Intrinsics.checkNotNull(format);
            split$default = StringsKt__StringsKt.split$default(format, new String[]{":"}, false, 0, 6, (Object) null);
            Pair pair = new Pair((String) split$default.get(0), (String) split$default.get(1));
            d3 d3Var = (d3) binding;
            TextView textView = d3Var.u;
            textView.setText("txtDayOfWeek");
            textView.setSelected(true);
            String label = item.getLabel();
            TextView textView2 = d3Var.f20732w;
            textView2.setText(label);
            textView2.setSelected(true);
            d3Var.f20731v.setText(((String) pair.getFirst()) + AbstractJsonLexerKt.COLON + ((String) pair.getSecond()));
            d3Var.f20730t.setActivated(item.getIsEnabled());
            ArrayList arrayList = new ArrayList();
            boolean day = d.a(item).getDay(1);
            Context context = this.f25403k;
            if (day) {
                String string = context.getString(R.string.monday);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(string);
            }
            if (d.a(item).getDay(2)) {
                String string2 = context.getString(R.string.tuesday);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(string2);
            }
            if (d.a(item).getDay(3)) {
                String string3 = context.getString(R.string.wednesday);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                arrayList.add(string3);
            }
            if (d.a(item).getDay(4)) {
                String string4 = context.getString(R.string.thursday);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                arrayList.add(string4);
            }
            if (d.a(item).getDay(5)) {
                String string5 = context.getString(R.string.friday);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                arrayList.add(string5);
            }
            if (d.a(item).getDay(6)) {
                String string6 = context.getString(R.string.saturday);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                arrayList.add(string6);
            }
            if (d.a(item).getDay(7)) {
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
            d3Var.u.setText(str);
        }
    }
}
