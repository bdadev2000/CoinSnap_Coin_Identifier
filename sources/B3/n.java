package B3;

import T.C0260b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import p1.DialogC2540d;

/* loaded from: classes2.dex */
public final class n extends C0260b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f300e;

    public /* synthetic */ n(Object obj, int i9) {
        this.f299d = i9;
        this.f300e = obj;
    }

    @Override // T.C0260b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f299d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f300e).f14091f);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // T.C0260b
    public final void d(View view, U.i iVar) {
        int i9;
        String string;
        Object obj = this.f300e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2879a;
        switch (this.f299d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = iVar.f3098a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((DialogC2540d) obj).l) {
                    iVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                    return;
                }
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = iVar.f3098a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int i10 = MaterialButtonToggleGroup.m;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i11 = 0;
                    for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                        if (materialButtonToggleGroup.getChildAt(i12) == view) {
                            i9 = i11;
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i9, 1, false, ((MaterialButton) view).f13977n));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.c(i12)) {
                                i11++;
                            }
                        }
                    }
                }
                i9 = -1;
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i9, 1, false, ((MaterialButton) view).f13977n));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = iVar.f3098a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.f14092g);
                accessibilityNodeInfo3.setChecked(checkableImageButton.f14091f);
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = iVar.f3098a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f14105z);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, iVar.f3098a);
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                if (jVar.f14034n.getVisibility() == 0) {
                    string = jVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = jVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                iVar.j(string);
                return;
        }
    }

    @Override // T.C0260b
    public boolean g(View view, int i9, Bundle bundle) {
        switch (this.f299d) {
            case 0:
                if (i9 == 1048576) {
                    DialogC2540d dialogC2540d = (DialogC2540d) this.f300e;
                    if (dialogC2540d.l) {
                        dialogC2540d.cancel();
                        return true;
                    }
                }
                return super.g(view, i9, bundle);
            default:
                return super.g(view, i9, bundle);
        }
    }
}
