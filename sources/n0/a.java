package n0;

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
import com.plantcare.ai.identifier.plantid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        o0.m b3 = this.a.b(view);
        if (b3 != null) {
            return (AccessibilityNodeProvider) b3.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        ClickableSpan[] clickableSpanArr;
        int i10;
        o0.j jVar = new o0.j(accessibilityNodeInfo);
        boolean isScreenReaderFocusable = ViewCompat.isScreenReaderFocusable(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(isScreenReaderFocusable);
        } else {
            jVar.h(1, isScreenReaderFocusable);
        }
        boolean isAccessibilityHeading = ViewCompat.isAccessibilityHeading(view);
        if (i11 >= 28) {
            accessibilityNodeInfo.setHeading(isAccessibilityHeading);
        } else {
            jVar.h(2, isAccessibilityHeading);
        }
        CharSequence accessibilityPaneTitle = ViewCompat.getAccessibilityPaneTitle(view);
        if (i11 >= 28) {
            accessibilityNodeInfo.setPaneTitle(accessibilityPaneTitle);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", accessibilityPaneTitle);
        }
        CharSequence stateDescription = ViewCompat.getStateDescription(view);
        if (i11 >= 30) {
            o0.d.c(accessibilityNodeInfo, stateDescription);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", stateDescription);
        }
        this.a.d(view, jVar);
        CharSequence text = accessibilityNodeInfo.getText();
        int i12 = 0;
        if (i11 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                jVar.a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i15 = 0;
                while (i15 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i15];
                    int i16 = i12;
                    while (true) {
                        if (i16 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                i10 = sparseArray2.keyAt(i16);
                                break;
                            }
                            i16++;
                        } else {
                            i10 = o0.j.f22967d;
                            o0.j.f22967d = i10 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                    Spanned spanned = (Spanned) text;
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    jVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    i15++;
                    i12 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            jVar.b((o0.c) list.get(i17));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.a.g(view, i10, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i10) {
        this.a.h(view, i10);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}
