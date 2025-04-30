package c0;

import R3.e;
import T.C0260b;
import U.i;
import U.l;
import a5.C0398b;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0583b extends C0260b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f5344n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final e f5345o = new e(16);

    /* renamed from: p, reason: collision with root package name */
    public static final C0398b f5346p = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f5351h;

    /* renamed from: i, reason: collision with root package name */
    public final View f5352i;

    /* renamed from: j, reason: collision with root package name */
    public C0582a f5353j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5347d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f5348e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5349f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f5350g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f5354k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public AbstractC0583b(View view) {
        if (view != null) {
            this.f5352i = view;
            this.f5351h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // T.C0260b
    public final l b(View view) {
        if (this.f5353j == null) {
            this.f5353j = new C0582a(this);
        }
        return this.f5353j;
    }

    @Override // T.C0260b
    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2879a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((F3.c) this).f1148q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        iVar.i(chip.getAccessibilityClassName());
        iVar.l(chip.getText());
    }

    public final boolean j(int i9) {
        if (this.l != i9) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        F3.c cVar = (F3.c) this;
        if (i9 == 1) {
            Chip chip = cVar.f1148q;
            chip.f13999o = false;
            chip.refreshDrawableState();
        }
        q(i9, 8);
        return true;
    }

    public final i k(int i9) {
        boolean z8;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        i iVar = new i(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        iVar.i("android.view.View");
        Rect rect = f5344n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        iVar.b = -1;
        View view = this.f5352i;
        obtain.setParent(view);
        o(i9, iVar);
        if (iVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f5348e;
        iVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    iVar.f3099c = i9;
                    obtain.setSource(view, i9);
                    if (this.f5354k == i9) {
                        obtain.setAccessibilityFocused(true);
                        iVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        iVar.a(64);
                    }
                    if (this.l == i9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        iVar.a(2);
                    } else if (obtain.isFocusable()) {
                        iVar.a(1);
                    }
                    obtain.setFocused(z8);
                    int[] iArr = this.f5350g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f5347d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        iVar.f(rect3);
                        if (iVar.b != -1) {
                            i iVar2 = new i(AccessibilityNodeInfo.obtain());
                            for (int i10 = iVar.b; i10 != -1; i10 = iVar2.b) {
                                iVar2.b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = iVar2.f3098a;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i10, iVar2);
                                iVar2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f5349f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            iVar.f3098a.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        obtain.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return iVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.AbstractC0583b.m(int, android.graphics.Rect):boolean");
    }

    public final i n(int i9) {
        if (i9 == -1) {
            View view = this.f5352i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            i iVar = new i(obtain);
            ViewCompat.onInitializeAccessibilityNodeInfo(view, iVar);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iVar.f3098a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
            }
            return iVar;
        }
        return k(i9);
    }

    public abstract void o(int i9, i iVar);

    public final boolean p(int i9) {
        int i10;
        View view = this.f5352i;
        if ((!view.isFocused() && !view.requestFocus()) || (i10 = this.l) == i9) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i9 == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i9;
        F3.c cVar = (F3.c) this;
        if (i9 == 1) {
            Chip chip = cVar.f1148q;
            chip.f13999o = true;
            chip.refreshDrawableState();
        }
        q(i9, 8);
        return true;
    }

    public final void q(int i9, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i9 == Integer.MIN_VALUE || !this.f5351h.isEnabled() || (parent = (view = this.f5352i).getParent()) == null) {
            return;
        }
        if (i9 != -1) {
            obtain = AccessibilityEvent.obtain(i10);
            i n2 = n(i9);
            obtain.getText().add(n2.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f3098a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i9);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
