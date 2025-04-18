package ka;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import androidx.fragment.app.e2;
import androidx.fragment.app.f2;
import androidx.fragment.app.o0;
import androidx.lifecycle.n0;
import com.plantcare.ai.identifier.plantid.R;
import k.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class e implements b0, u1.c {

    /* renamed from: b, reason: collision with root package name */
    public static final e f20530b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final e f20531c = new e();

    public static void c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
        }
    }

    public static y1.e g(y1.f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new y1.e(owner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Activity activity, androidx.lifecycle.n event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (activity instanceof androidx.lifecycle.v) {
            androidx.lifecycle.p lifecycle = ((androidx.lifecycle.v) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.x) {
                ((androidx.lifecycle.x) lifecycle).e(event);
            }
        }
    }

    public static e2 k(ViewGroup container, f2 factory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof e2) {
            return (e2) tag;
        }
        ((o0) factory).getClass();
        androidx.fragment.app.l lVar = new androidx.fragment.app.l(container);
        Intrinsics.checkNotNullExpressionValue(lVar, "factory.createController(container)");
        container.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public static String l(String tableName, String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static void n(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            n0.Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new n0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new androidx.lifecycle.o0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = AbstractJsonLexerKt.NULL;
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb2.append('\"');
                                sb2.append(obj);
                                sb2.append('\"');
                            }
                        } else {
                            sb2.append(obj2);
                        }
                        sb2.append(",");
                    }
                    sb2.append(obj);
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new k0.a(13, this, webView, sb3));
                return;
            } else {
                c(webView, sb3);
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (ud.a.a.booleanValue() && !TextUtils.isEmpty(concat)) {
            Log.i("OMIDLIB", concat);
        }
    }

    @Override // k.b0
    public void b(k.o oVar, boolean z10) {
    }

    public void d(wb.a aVar) {
        yb.g gVar = (yb.g) aVar;
        gVar.a(ic.o.class, ic.c.a);
        gVar.a(jc.f.class, ic.b.a);
        gVar.a(jc.e.class, ic.a.a);
    }

    @Override // u1.c
    public void e() {
    }

    @Override // u1.c
    public void f(int i10, Object obj) {
    }

    @Override // k.b0
    public boolean i(k.o oVar) {
        return false;
    }

    public KeyListener j(KeyListener keyListener) {
        return keyListener;
    }

    public void m() {
    }

    public boolean o() {
        return false;
    }

    public boolean p(Spannable spannable) {
        return false;
    }

    public InputConnection q(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void r(boolean z10) {
    }

    public void s(boolean z10) {
    }

    public void t(boolean z10) {
    }

    public void u() {
    }

    public void v() {
    }
}
