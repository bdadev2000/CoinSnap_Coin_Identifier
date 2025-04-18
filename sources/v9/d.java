package v9;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import o0.j;

/* loaded from: classes3.dex */
public final class d extends n0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f26353e;

    public /* synthetic */ d(KeyEvent.Callback callback, int i10) {
        this.f26352d = i10;
        this.f26353e = callback;
    }

    @Override // n0.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f26352d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f26353e).isChecked());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // n0.b
    public final void d(View view, j jVar) {
        int i10;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        int i11 = this.f26352d;
        KeyEvent.Callback callback = this.f26353e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i11) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((g) callback).f26362l) {
                    jVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                    return;
                }
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) callback;
                int i12 = MaterialButtonToggleGroup.f11614o;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < materialButtonToggleGroup.getChildCount(); i14++) {
                        if (materialButtonToggleGroup.getChildAt(i14) == view) {
                            i10 = i13;
                            jVar.k(new o0.i(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i10, 1, false, ((MaterialButton) view).isChecked())));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.d(i14)) {
                                i13++;
                            }
                        }
                    }
                }
                i10 = -1;
                jVar.k(new o0.i(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i10, 1, false, ((MaterialButton) view).isChecked())));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) callback;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f11767g);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) callback).f11771z);
                return;
        }
    }

    @Override // n0.b
    public final boolean g(View view, int i10, Bundle bundle) {
        switch (this.f26352d) {
            case 0:
                if (i10 == 1048576) {
                    g gVar = (g) this.f26353e;
                    if (gVar.f26362l) {
                        gVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i10, bundle);
            default:
                return super.g(view, i10, bundle);
        }
    }
}
