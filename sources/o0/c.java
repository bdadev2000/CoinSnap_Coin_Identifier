package o0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f22956e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f22957f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f22958g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f22959h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f22960i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f22961j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f22962k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f22963l;
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22964b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f22965c;

    /* renamed from: d, reason: collision with root package name */
    public final u f22966d;

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
        new c(1);
        new c(2);
        new c(4);
        new c(8);
        f22956e = new c(16);
        new c(32);
        new c(64);
        new c(128);
        new c(NotificationCompat.FLAG_LOCAL_ONLY, n.class);
        new c(512, n.class);
        new c(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, o.class);
        new c(2048, o.class);
        f22957f = new c(4096);
        f22958g = new c(8192);
        new c(JsonLexerKt.BATCH_SIZE);
        new c(32768);
        new c(C.DEFAULT_BUFFER_SEGMENT_SIZE);
        new c(131072, s.class);
        f22959h = new c(262144);
        f22960i = new c(524288);
        f22961j = new c(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        new c(2097152, t.class);
        int i10 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, q.class);
        f22962k = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f22963l = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = null;
        if (i10 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new c(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i10 >= 29) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction20;
        } else {
            accessibilityAction2 = null;
        }
        new c(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new c(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i10 >= 29) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction19;
        } else {
            accessibilityAction4 = null;
        }
        new c(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, r.class);
        if (i10 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new c(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, p.class);
        if (i10 >= 28) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction6 = accessibilityAction18;
        } else {
            accessibilityAction6 = null;
        }
        new c(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i10 >= 28) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction7 = accessibilityAction17;
        } else {
            accessibilityAction7 = null;
        }
        new c(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i10 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new c(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i10 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction9 = accessibilityAction16;
        } else {
            accessibilityAction9 = null;
        }
        new c(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
        if (i10 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new c(accessibilityAction10, R.id.ALT, null, null, null);
        if (i10 >= 32) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction11 = accessibilityAction15;
        } else {
            accessibilityAction11 = null;
        }
        new c(accessibilityAction11, R.id.CTRL, null, null, null);
        if (i10 >= 32) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction12 = accessibilityAction14;
        } else {
            accessibilityAction12 = null;
        }
        new c(accessibilityAction12, R.id.FUNCTION, null, null, null);
        if (i10 >= 33) {
            accessibilityAction13 = androidx.activity.j.f();
        } else {
            accessibilityAction13 = null;
        }
        new c(accessibilityAction13, R.id.KEYCODE_0, null, null, null);
        if (i10 >= 34) {
            accessibilityAction21 = g.a();
        }
        new c(accessibilityAction21, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public c(int i10) {
        this(null, i10, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).a;
        Object obj3 = this.a;
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
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d10 = j.d(this.f22964b);
        if (d10.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d10);
        return sb2.toString();
    }

    public c(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public c(Object obj, int i10, CharSequence charSequence, u uVar, Class cls) {
        this.f22964b = i10;
        this.f22966d = uVar;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.a = obj;
        }
        this.f22965c = cls;
    }
}
