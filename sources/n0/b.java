package n0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f22246c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;

    /* renamed from: b, reason: collision with root package name */
    public final a f22247b;

    public b() {
        this(f22246c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public o0.m b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new o0.m(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, o0.j jVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, jVar.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i11 >= list.size()) {
                break;
            }
            o0.c cVar = (o0.c) list.get(i11);
            if (cVar.a() == i10) {
                o0.u uVar = cVar.f22966d;
                if (uVar != null) {
                    Class cls = cVar.f22965c;
                    if (cls != null) {
                        try {
                            a4.j.t(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z10 = uVar.p(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = this.a.performAccessibilityAction(view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    }
                    for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                        if (clickableSpan.equals(clickableSpanArr[i13])) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    clickableSpan.onClick(view);
                    z12 = true;
                }
            }
            return z12;
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.f22247b = new a(this);
    }
}
