package g6;

import android.view.View;
import com.facebook.x;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import y5.g;

/* loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final HashSet f18223g;

    /* renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f18224b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f18225c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f18226d;

    /* renamed from: f, reason: collision with root package name */
    public final String f18227f;

    static {
        new com.facebook.c(27, 0);
        f18223g = new HashSet();
    }

    public f(View view, View view2, String str) {
        String replace$default;
        this.f18224b = g.e(view);
        this.f18225c = new WeakReference(view2);
        this.f18226d = new WeakReference(view);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            replace$default = StringsKt__StringsJVMKt.replace$default(lowerCase, "activity", "", false, 4, (Object) null);
            this.f18227f = replace$default;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void a() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            View view = (View) this.f18225c.get();
            View view2 = (View) this.f18226d.get();
            if (view != null && view2 != null) {
                try {
                    String d10 = c.d(view2);
                    String b3 = b.b(view2, d10);
                    if (b3 == null || com.facebook.c.c(b3, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, c.b(view, view2));
                    jSONObject.put("screenname", this.f18227f);
                    if (!m6.a.b(this)) {
                        try {
                            x.c().execute(new c3.b(7, jSONObject, d10, this, b3));
                        } catch (Throwable th2) {
                            m6.a.a(this, th2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(view, "view");
                    View.OnClickListener onClickListener = this.f18224b;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    a();
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
        }
    }
}
