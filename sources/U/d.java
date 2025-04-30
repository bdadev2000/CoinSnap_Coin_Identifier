package U;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.ar.core.ImageMetadata;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f3086e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f3087f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f3088g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f3089h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f3090i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f3091j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f3092k;
    public static final d l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3093a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f3094c;

    /* renamed from: d, reason: collision with root package name */
    public final t f3095d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        new d(1);
        new d(2);
        new d(4);
        new d(8);
        f3086e = new d(16);
        new d(32);
        new d(64);
        new d(128);
        new d(NotificationCompat.FLAG_LOCAL_ONLY, m.class);
        new d(512, m.class);
        new d(1024, n.class);
        new d(2048, n.class);
        f3087f = new d(4096);
        f3088g = new d(FragmentTransaction.TRANSIT_EXIT_MASK);
        new d(16384);
        new d(32768);
        new d(65536);
        new d(131072, r.class);
        f3089h = new d(262144);
        f3090i = new d(ImageMetadata.LENS_APERTURE);
        f3091j = new d(1048576);
        new d(2097152, s.class);
        int i9 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, p.class);
        f3092k = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        l = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        if (i9 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i9 >= 29) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction21;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i9 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i9 >= 29) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction20;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q.class);
        if (i9 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, o.class);
        if (i9 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction6 = accessibilityAction19;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i9 >= 28) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction7 = accessibilityAction18;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i9 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i9 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction9 = accessibilityAction17;
        } else {
            accessibilityAction9 = null;
        }
        new d(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
        if (i9 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new d(accessibilityAction10, R.id.ALT, null, null, null);
        if (i9 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction11 = accessibilityAction16;
        } else {
            accessibilityAction11 = null;
        }
        new d(accessibilityAction11, R.id.CTRL, null, null, null);
        if (i9 >= 32) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction12 = accessibilityAction15;
        } else {
            accessibilityAction12 = null;
        }
        new d(accessibilityAction12, R.id.FUNCTION, null, null, null);
        if (i9 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction13 = accessibilityAction14;
        } else {
            accessibilityAction13 = null;
        }
        new d(accessibilityAction13, R.id.KEYCODE_0, null, null, null);
        if (i9 >= 34) {
            accessibilityAction22 = g.a();
        }
        new d(accessibilityAction22, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public d(int i9) {
        this(null, i9, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f3093a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f3093a;
        Object obj3 = this.f3093a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f3093a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = i.d(this.b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3093a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public d(int i9, Class cls) {
        this(null, i9, null, null, cls);
    }

    public d(Object obj, int i9, CharSequence charSequence, t tVar, Class cls) {
        this.b = i9;
        this.f3095d = tVar;
        if (obj == null) {
            this.f3093a = new AccessibilityNodeInfo.AccessibilityAction(i9, charSequence);
        } else {
            this.f3093a = obj;
        }
        this.f3094c = cls;
    }
}
