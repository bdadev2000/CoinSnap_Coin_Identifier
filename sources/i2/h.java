package I2;

import G7.j;
import O7.o;
import android.view.View;
import com.facebook.internal.H;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final HashSet f1449g = new HashSet();
    public final View.OnClickListener b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f1450c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1451d;

    /* renamed from: f, reason: collision with root package name */
    public final String f1452f;

    public h(View view, View view2, String str) {
        this.b = A2.g.e(view);
        this.f1450c = new WeakReference(view2);
        this.f1451d = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f1452f = o.A(lowerCase, "activity", "");
    }

    public final void a() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            View view = (View) this.f1450c.get();
            View view2 = (View) this.f1451d.get();
            if (view != null && view2 != null) {
                try {
                    String d2 = c.d(view2);
                    String b = b.b(view2, d2);
                    if (b == null || a.a(b, d2)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, c.b(view, view2));
                    jSONObject.put("screenname", this.f1452f);
                    if (!O2.a.b(this)) {
                        try {
                            H.K(new f(jSONObject, d2, this, b));
                        } catch (Throwable th) {
                            O2.a.a(this, th);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    j.e(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    View.OnClickListener onClickListener = this.b;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    a();
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
        }
    }
}
