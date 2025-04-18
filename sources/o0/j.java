package o0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static int f22967d;
    public final AccessibilityNodeInfo a;

    /* renamed from: b, reason: collision with root package name */
    public int f22968b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f22969c = -1;

    public j(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        this.a = accessibilityNodeInfo;
    }

    public static String d(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case JsonLexerKt.BATCH_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.KEYCODE_3D_MODE:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void a(int i10) {
        this.a.addAction(i10);
    }

    public final void b(c cVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) cVar.a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final boolean e(int i10) {
        Bundle extras = this.a.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) != i10) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.f22969c == jVar.f22969c && this.f22968b == jVar.f22968b) {
            return true;
        }
        return false;
    }

    public final void f(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean z10 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (z10) {
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i10 = 0; i10 < c10.size(); i10++) {
                spannableString.setSpan(new a(((Integer) c13.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void h(int i10, boolean z10) {
        Bundle extras = this.a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void j(h hVar) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (hVar == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) hVar.a;
        }
        this.a.setCollectionInfo(collectionInfo);
    }

    public final void k(i iVar) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) iVar.a);
    }

    public final void l(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void m(boolean z10) {
        this.a.setScrollable(z10);
    }

    public final void n(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        CharSequence charSequence3;
        boolean e2;
        boolean e10;
        ?? emptyList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            g.b(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(g());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        if (i10 >= 30) {
            charSequence = d.b(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb2.append(charSequence);
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; tooltipText: ");
        if (i10 >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb2.append(charSequence2);
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (i10 >= 33) {
            string = f.g(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        if (i10 >= 34) {
            charSequence3 = g.c(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb2.append(charSequence3);
        sb2.append("; granularScrollingSupported: ");
        sb2.append(e(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        if (i10 >= 33) {
            e2 = f.h(accessibilityNodeInfo);
        } else {
            e2 = e(8388608);
        }
        sb2.append(e2);
        sb2.append("; accessibilityDataSensitive: ");
        if (i10 >= 34) {
            e10 = g.f(accessibilityNodeInfo);
        } else {
            e10 = e(64);
        }
        sb2.append(e10);
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i11 = 0; i11 < size; i11++) {
                emptyList.add(new c(actionList.get(i11), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i12 = 0; i12 < emptyList.size(); i12++) {
            c cVar = (c) emptyList.get(i12);
            String d10 = d(cVar.a());
            if (d10.equals("ACTION_UNKNOWN")) {
                Object obj = cVar.a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(d10);
            if (i12 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public j(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }
}
