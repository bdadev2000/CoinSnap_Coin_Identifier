package T;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: T.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0260b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2878c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2879a;
    public final C0258a b;

    public C0260b() {
        this(f2878c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2879a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public U.l b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2879a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new U.l(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2879a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, U.i iVar) {
        this.f2879a.onInitializeAccessibilityNodeInfo(view, iVar.f3098a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2879a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2879a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i9, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z8;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i10 >= list.size()) {
                break;
            }
            U.d dVar = (U.d) list.get(i10);
            if (dVar.a() == i9) {
                U.t tVar = dVar.f3095d;
                if (tVar != null) {
                    Class cls = dVar.f3094c;
                    if (cls != null) {
                        try {
                            com.mbridge.msdk.foundation.entity.o.v(cls.getDeclaredConstructor(null).newInstance(null));
                            throw null;
                        } catch (Exception e4) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e4);
                        }
                    }
                    z8 = tVar.c(view);
                }
            } else {
                i10++;
            }
        }
        z8 = false;
        if (!z8) {
            z8 = this.f2879a.performAccessibilityAction(view, i9, bundle);
        }
        if (!z8 && i9 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i12 = 0;
                while (true) {
                    if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i12])) {
                        clickableSpan.onClick(view);
                        z9 = true;
                        break;
                    }
                    i12++;
                }
            }
            return z9;
        }
        return z8;
    }

    public void h(View view, int i9) {
        this.f2879a.sendAccessibilityEvent(view, i9);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2879a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0260b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2879a = accessibilityDelegate;
        this.b = new C0258a(this);
    }
}
