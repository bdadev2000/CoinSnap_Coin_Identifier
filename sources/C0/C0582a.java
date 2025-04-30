package c0;

import U.i;
import U.l;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582a extends l {
    public final /* synthetic */ AbstractC0583b b;

    public C0582a(AbstractC0583b abstractC0583b) {
        this.b = abstractC0583b;
    }

    @Override // U.l
    public final i a(int i9) {
        return new i(AccessibilityNodeInfo.obtain(this.b.n(i9).f3098a));
    }

    @Override // U.l
    public final i b(int i9) {
        int i10;
        AbstractC0583b abstractC0583b = this.b;
        if (i9 == 2) {
            i10 = abstractC0583b.f5354k;
        } else {
            i10 = abstractC0583b.l;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i10);
    }

    @Override // U.l
    public final boolean c(int i9, int i10, Bundle bundle) {
        int i11;
        AbstractC0583b abstractC0583b = this.b;
        View view = abstractC0583b.f5352i;
        if (i9 != -1) {
            boolean z8 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    boolean z9 = false;
                    if (i10 != 64) {
                        if (i10 != 128) {
                            F3.c cVar = (F3.c) abstractC0583b;
                            if (i10 != 16) {
                                return false;
                            }
                            Chip chip = cVar.f1148q;
                            if (i9 == 0) {
                                return chip.performClick();
                            }
                            if (i9 != 1) {
                                return false;
                            }
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f13996j;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                z9 = true;
                            }
                            if (chip.f14005u) {
                                chip.f14004t.q(1, 1);
                                return z9;
                            }
                            return z9;
                        }
                        if (abstractC0583b.f5354k == i9) {
                            abstractC0583b.f5354k = Integer.MIN_VALUE;
                            view.invalidate();
                            abstractC0583b.q(i9, 65536);
                        }
                        z8 = false;
                    } else {
                        AccessibilityManager accessibilityManager = abstractC0583b.f5351h;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i11 = abstractC0583b.f5354k) != i9) {
                            if (i11 != Integer.MIN_VALUE) {
                                abstractC0583b.f5354k = Integer.MIN_VALUE;
                                abstractC0583b.f5352i.invalidate();
                                abstractC0583b.q(i11, 65536);
                            }
                            abstractC0583b.f5354k = i9;
                            view.invalidate();
                            abstractC0583b.q(i9, 32768);
                        }
                        z8 = false;
                    }
                    return z8;
                }
                return abstractC0583b.j(i9);
            }
            return abstractC0583b.p(i9);
        }
        return ViewCompat.performAccessibilityAction(view, i10, bundle);
    }
}
