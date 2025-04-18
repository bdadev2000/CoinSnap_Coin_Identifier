package z9;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import o0.j;
import o0.m;

/* loaded from: classes3.dex */
public final class d extends n0.b {

    /* renamed from: o, reason: collision with root package name */
    public static final Rect f28659o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: p, reason: collision with root package name */
    public static final ac.e f28660p = new ac.e();

    /* renamed from: q, reason: collision with root package name */
    public static final ka.e f28661q = new ka.e();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f28666h;

    /* renamed from: i, reason: collision with root package name */
    public final View f28667i;

    /* renamed from: j, reason: collision with root package name */
    public x0.a f28668j;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Chip f28672n;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f28662d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f28663e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f28664f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f28665g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f28669k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f28670l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f28671m = Integer.MIN_VALUE;

    public d(Chip chip, Chip chip2) {
        this.f28672n = chip;
        if (chip2 != null) {
            this.f28667i = chip2;
            this.f28666h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            if (ViewCompat.getImportantForAccessibility(chip2) == 0) {
                ViewCompat.setImportantForAccessibility(chip2, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // n0.b
    public final m b(View view) {
        if (this.f28668j == null) {
            this.f28668j = new x0.a(this);
        }
        return this.f28668j;
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // n0.b
    public final void d(View view, j jVar) {
        boolean z10;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f28672n;
        f fVar = chip.f11642g;
        if (fVar != null && fVar.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        jVar.i(chip.getAccessibilityClassName());
        jVar.n(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.f28670l != i10) {
            return false;
        }
        this.f28670l = Integer.MIN_VALUE;
        if (i10 == 1) {
            Chip chip = this.f28672n;
            chip.f11650o = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final j k(int i10) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        j jVar = new j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        jVar.i("android.view.View");
        Rect rect = f28659o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        jVar.f22968b = -1;
        View view = this.f28667i;
        obtain.setParent(view);
        o(i10, jVar);
        if (jVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f28663e;
        jVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    jVar.f22969c = i10;
                    obtain.setSource(view, i10);
                    boolean z11 = false;
                    if (this.f28669k == i10) {
                        obtain.setAccessibilityFocused(true);
                        jVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        jVar.a(64);
                    }
                    if (this.f28670l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        jVar.a(2);
                    } else if (obtain.isFocusable()) {
                        jVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f28665g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f28662d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        jVar.f(rect3);
                        if (jVar.f22968b != -1) {
                            j jVar2 = new j(AccessibilityNodeInfo.obtain());
                            for (int i11 = jVar.f22968b; i11 != -1; i11 = jVar2.f22968b) {
                                jVar2.f22968b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = jVar2.a;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i11, jVar2);
                                jVar2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f28664f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            jVar.a.setBoundsInScreen(rect3);
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
                                        z11 = true;
                                    }
                                }
                            }
                            if (z11) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return jVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final void l(ArrayList arrayList) {
        boolean z10 = false;
        arrayList.add(0);
        Rect rect = Chip.f11640y;
        Chip chip = this.f28672n;
        if (chip.c()) {
            f fVar = chip.f11642g;
            if (fVar != null && fVar.O) {
                z10 = true;
            }
            if (z10 && chip.f11645j != null) {
                arrayList.add(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.d.m(int, android.graphics.Rect):boolean");
    }

    public final j n(int i10) {
        if (i10 == -1) {
            View view = this.f28667i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            j jVar = new j(obtain);
            ViewCompat.onInitializeAccessibilityNodeInfo(view, jVar);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                jVar.a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return jVar;
        }
        return k(i10);
    }

    public final void o(int i10, j jVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        CharSequence charSequence = "";
        if (i10 == 1) {
            Chip chip = this.f28672n;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            jVar.b(o0.c.f22956e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f11640y);
    }

    public final boolean p(int i10) {
        int i11;
        View view = this.f28667i;
        if ((view.isFocused() || view.requestFocus()) && (i11 = this.f28670l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                j(i11);
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f28670l = i10;
                if (i10 == 1) {
                    Chip chip = this.f28672n;
                    chip.f11650o = true;
                    chip.refreshDrawableState();
                }
                q(i10, 8);
                return true;
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i10 != Integer.MIN_VALUE && this.f28666h.isEnabled() && (parent = (view = this.f28667i).getParent()) != null) {
            if (i10 != -1) {
                obtain = AccessibilityEvent.obtain(i11);
                j n10 = n(i10);
                obtain.getText().add(n10.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n10.a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i10);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i11);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
