package v5;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import l0.g;
import l0.i;
import l0.j;
import qc.e;
import qc.f;
import qc.h;
import qc.i0;
import qc.q0;
import qc.u;
import wh.t;

/* loaded from: classes3.dex */
public final class b implements OnAttributionChangedListener, OnSessionTrackingFailedListener, g, t {

    /* renamed from: b, reason: collision with root package name */
    public static final b f26030b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f26031c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final b f26032d = new b();

    public static final ArrayList c(View view) {
        if (m6.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup h10 = y5.g.h(view);
            if (h10 != null) {
                Iterator it = y5.g.a(h10).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f26030b.e(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
            return null;
        }
    }

    public static final ArrayList d(View view) {
        boolean z10;
        if (m6.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            arrayList.add(y5.g.g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    Object[] array = new Regex("/").split(resourceName, 0).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            arrayList.add(strArr[1]);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
            return null;
        }
    }

    public static final boolean f(ArrayList indicators, ArrayList keys) {
        boolean contains$default;
        boolean z10;
        if (m6.a.b(b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                b bVar = f26030b;
                if (!m6.a.b(bVar)) {
                    try {
                        Iterator it2 = keys.iterator();
                        while (it2.hasNext()) {
                            contains$default = StringsKt__StringsKt.contains$default(str, (String) it2.next(), false, 2, (Object) null);
                            if (contains$default) {
                                z10 = true;
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        m6.a.a(bVar, th2);
                    }
                }
                z10 = false;
                if (z10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            m6.a.a(b.class, th3);
            return false;
        }
    }

    @Override // l0.g
    public int a(CharSequence charSequence, int i10) {
        int i11 = i10 + 0;
        int i12 = 2;
        for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i13));
            i iVar = j.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i12 = 2;
                            break;
                    }
                }
                i12 = 0;
            }
            i12 = 1;
        }
        return i12;
    }

    public void b(wb.a aVar) {
        xb.d dVar = (xb.d) aVar;
        dVar.a(i0.class, qc.g.a);
        dVar.a(q0.class, h.a);
        dVar.a(qc.j.class, e.a);
        dVar.a(qc.b.class, qc.d.a);
        dVar.a(qc.a.class, qc.c.a);
        dVar.a(u.class, f.a);
    }

    public ArrayList e(View view) {
        boolean z10;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            Iterator it = y5.g.a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(e((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        Log.d("ITGAdjust", "Attribution callback called!");
        Log.d("ITGAdjust", "Attribution: " + adjustAttribution.toString());
    }

    @Override // com.adjust.sdk.OnSessionTrackingFailedListener
    public void onFinishedSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
        Log.d("ITGAdjust", "Session failure callback called!");
        Log.d("ITGAdjust", "Session failure data: " + adjustSessionFailure.toString());
    }
}
