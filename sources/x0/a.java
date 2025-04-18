package x0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o0.j;
import o0.m;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z9.d f27302b;

    public a(z9.d dVar) {
        this.f27302b = dVar;
    }

    @Override // o0.m
    public final j a(int i10) {
        return new j(AccessibilityNodeInfo.obtain(this.f27302b.n(i10).a));
    }

    @Override // o0.m
    public final j b(int i10) {
        int i11;
        z9.d dVar = this.f27302b;
        if (i10 == 2) {
            i11 = dVar.f28669k;
        } else {
            i11 = dVar.f28670l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i11);
    }

    @Override // o0.m
    public final boolean c(int i10, int i11, Bundle bundle) {
        int i12;
        z9.d dVar = this.f27302b;
        View view = dVar.f28667i;
        if (i10 != -1) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    boolean z11 = false;
                    if (i11 != 64) {
                        if (i11 != 128) {
                            if (i11 == 16) {
                                Chip chip = dVar.f28672n;
                                if (i10 == 0) {
                                    return chip.performClick();
                                }
                                if (i10 == 1) {
                                    chip.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip.f11645j;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip);
                                        z11 = true;
                                    }
                                    if (chip.u) {
                                        chip.f11655t.q(1, 1);
                                    }
                                }
                            }
                            return z11;
                        }
                        if (dVar.f28669k == i10) {
                            dVar.f28669k = Integer.MIN_VALUE;
                            view.invalidate();
                            dVar.q(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                        }
                        z10 = false;
                    } else {
                        AccessibilityManager accessibilityManager = dVar.f28666h;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = dVar.f28669k) != i10) {
                            if (i12 != Integer.MIN_VALUE) {
                                dVar.f28669k = Integer.MIN_VALUE;
                                dVar.f28667i.invalidate();
                                dVar.q(i12, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                            }
                            dVar.f28669k = i10;
                            view.invalidate();
                            dVar.q(i10, 32768);
                        }
                        z10 = false;
                    }
                    return z10;
                }
                return dVar.j(i10);
            }
            return dVar.p(i10);
        }
        return ViewCompat.performAccessibilityAction(view, i11, bundle);
    }
}
