package T;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: T.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0260b f2876a;

    public C0258a(C0260b c0260b) {
        this.f2876a = c0260b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2876a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        U.l b = this.f2876a.b(view);
        if (b != null) {
            return (AccessibilityNodeProvider) b.f3101a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2876a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        ClickableSpan[] clickableSpanArr;
        int i9;
        U.i iVar = new U.i(accessibilityNodeInfo);
        boolean isScreenReaderFocusable = ViewCompat.isScreenReaderFocusable(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(isScreenReaderFocusable);
        } else {
            iVar.h(1, isScreenReaderFocusable);
        }
        boolean isAccessibilityHeading = ViewCompat.isAccessibilityHeading(view);
        if (i10 >= 28) {
            accessibilityNodeInfo.setHeading(isAccessibilityHeading);
        } else {
            iVar.h(2, isAccessibilityHeading);
        }
        CharSequence accessibilityPaneTitle = ViewCompat.getAccessibilityPaneTitle(view);
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(accessibilityPaneTitle);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", accessibilityPaneTitle);
        }
        CharSequence stateDescription = ViewCompat.getStateDescription(view);
        if (i10 >= 30) {
            U.e.c(accessibilityNodeInfo, stateDescription);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", stateDescription);
        }
        this.f2876a.d(view, iVar);
        CharSequence text = accessibilityNodeInfo.getText();
        int i11 = 0;
        if (i10 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i14 = 0;
                while (i14 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i14];
                    int i15 = i11;
                    while (true) {
                        if (i15 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                i9 = sparseArray2.keyAt(i15);
                                break;
                            }
                            i15++;
                        } else {
                            i9 = U.i.f3097d;
                            U.i.f3097d = i9 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i9, new WeakReference(clickableSpanArr[i14]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                    Spanned spanned = (Spanned) text;
                    iVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    iVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    iVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    iVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i9));
                    i14++;
                    i11 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            iVar.b((U.d) list.get(i16));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2876a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2876a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
        return this.f2876a.g(view, i9, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i9) {
        this.f2876a.h(view, i9);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2876a.i(view, accessibilityEvent);
    }
}
